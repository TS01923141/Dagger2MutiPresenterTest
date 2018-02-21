package com.example.cartek.dagger2mutipresentertest;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

/**
 * Created by CarTek on 2018/2/14.
 */

public class MainApp extends DaggerApplication {
    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        AppComponent appComponent = DaggerAppComponent.builder().application(this).build();
        appComponent.inject(this);
        return appComponent;
    }
}
