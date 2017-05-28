package com.example.aszabo.rxjavaintro.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.aszabo.rxjavaintro.R;
import com.example.aszabo.rxjavaintro.datasource.DataRepository;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {
    private static String TAG = MainActivity.class.getSimpleName();
    private CompositeDisposable compositeDisposable = new CompositeDisposable();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fetchUser();
    }

    private void fetchUser() {
        DataRepository dataRepository = DataRepository.getInstance();
        compositeDisposable.add(dataRepository.getUser("szaboa")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        user -> Log.d(TAG, user.toString()),
                        error -> Log.d(TAG, "Error during fetch"),
                        () -> Log.d(TAG, "Complete")));
    }

    @Override
    protected void onPause() {
        super.onPause();
        compositeDisposable.dispose();
    }
}
