package com.tjw.mvp_demo;

import android.app.Application;

/**
 * ^-^ Created by tang-jw on 12/4.
 */

public class App extends Application {

    public static App app;
    
    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
    }
}
