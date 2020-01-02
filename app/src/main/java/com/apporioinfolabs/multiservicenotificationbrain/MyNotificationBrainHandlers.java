package com.apporioinfolabs.multiservicenotificationbrain;

import android.util.Log;

import com.apporioinfolabs.multiservicenotificationbrain2.handlers.NotificationBrainHandlers;

public class MyNotificationBrainHandlers implements NotificationBrainHandlers {
    @Override
    public void onTrialLogicExecuted(int decision) {
        Log.d("NOTIFICATION-----> ", "Decision: "+decision);
    }
}
