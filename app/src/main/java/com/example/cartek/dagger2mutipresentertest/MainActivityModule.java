package com.example.cartek.dagger2mutipresentertest;

import com.example.cartek.dagger2mutipresentertest.Presenter.IPresenter1;
import com.example.cartek.dagger2mutipresentertest.Presenter.IPresenter2;
import com.example.cartek.dagger2mutipresentertest.Presenter.Presenter1;
import com.example.cartek.dagger2mutipresentertest.Presenter.Presenter2;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

/**
 * Created by CarTek on 2018/2/14.
 */
@Module
public abstract class MainActivityModule {
    @Binds
    abstract IPresenter1 bindPresenter1(Presenter1 presenter1);

//    @Binds
//    abstract IPresenter2 bindPresenter2(Presenter2 presenter2);

//    @Provides
//    static IPresenter1 providePresenter1(){
//        return new Presenter1();
//    }
//
    @Provides
    static IPresenter2 providePresenter2(){
        return new Presenter2();
    }
}
