package com.apporioinfolabs.multiservicenotificationbrain;

import android.app.Application;

import com.apporioinfolabs.multiservicenotificationbrain2.NotificationBrain;

public class MainApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        NotificationBrain.startInit(this)
                .setBaseUrl("Some base url for running some logic when notification came in. ")
                .setNotificationBrainHandler(new MyNotificationBrainHandlers())
                .init();
    }
}
