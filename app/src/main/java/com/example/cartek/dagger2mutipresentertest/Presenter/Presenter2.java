package com.example.cartek.dagger2mutipresentertest.Presenter;

import android.util.Log;

/**
 * Created by CarTek on 2018/2/14.
 */

public class Presenter2 implements IPresenter2 {
    IPresenter1 presenter1;

    public Presenter2(){
        Log.e("Presenter2", "Presenter2.create");
    }
}
