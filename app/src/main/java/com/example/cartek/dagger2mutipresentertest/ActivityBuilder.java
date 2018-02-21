package com.example.cartek.dagger2mutipresentertest;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by CarTek on 2018/2/14.
 */
@Module
public abstract class ActivityBuilder {
    @ContributesAndroidInjector(modules = MainActivityModule.class)
    abstract MainActivity bindMainActivity();
}
