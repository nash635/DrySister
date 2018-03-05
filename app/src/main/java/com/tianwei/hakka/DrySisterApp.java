package com.tianwei.hakka;

import android.app.Application;

/**
 * 描述：Application类
 *
 */
public class DrySisterApp extends Application {

    private static DrySisterApp context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
        DryInit.initTimber();
        DryInit.initOKHttp(this);
    }

    public static DrySisterApp getContext() {
        return context;
    }
}
