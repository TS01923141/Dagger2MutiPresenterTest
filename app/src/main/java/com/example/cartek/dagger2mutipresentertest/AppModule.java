package com.example.cartek.dagger2mutipresentertest;

import android.app.Application;
import android.content.Context;

import dagger.Binds;
import dagger.Module;

/**
 * Created by CarTek on 2018/2/14.
 */
@Module
public abstract class AppModule {
    @Binds
    abstract Context bindContext(Application application);
}
