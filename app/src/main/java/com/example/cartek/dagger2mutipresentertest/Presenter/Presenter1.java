package com.example.cartek.dagger2mutipresentertest.Presenter;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by CarTek on 2018/2/14.
 */

public class Presenter1 implements IPresenter1 {
    IPresenter2 presenter2;

    @Inject
    public Presenter1(){
        Log.e("Presenter1", "Presenter1.create");
    }
}
