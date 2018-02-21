package com.example.cartek.dagger2mutipresentertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.cartek.dagger2mutipresentertest.Presenter.IPresenter1;
import com.example.cartek.dagger2mutipresentertest.Presenter.IPresenter2;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;

public class MainActivity extends DaggerAppCompatActivity {

    @Inject
    IPresenter1 presenter1;
    @Inject
    IPresenter2 presenter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
