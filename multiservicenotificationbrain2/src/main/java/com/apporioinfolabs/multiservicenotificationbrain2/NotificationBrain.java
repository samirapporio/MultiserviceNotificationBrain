package com.apporioinfolabs.multiservicenotificationbrain2;

import android.app.Application;

import com.apporioinfolabs.multiservicenotificationbrain2.handlers.NotificationBrainHandlers;

import org.json.JSONObject;

public class NotificationBrain {

    public static NotificationBrain.Builder mBuilder = null ;
    private static final String TAG = "TaxiSegment_TaxiSegment";



    public static NotificationBrain.Builder startInit(Application application){
        return new NotificationBrain.Builder(application) ;
    }

    private static void init(NotificationBrain.Builder inBuilder) {
        // here comes the final builder object
        mBuilder = inBuilder ;
    }

    public static class Builder {
        Application mApplication;
        String mBaseUrl ;
        NotificationBrainHandlers mNotificationBrainHandlers;


        private Builder() {}

        private Builder(Application application) {
            mApplication = application;
        }

        public Builder setBaseUrl(String baseUrl){
            mBaseUrl = baseUrl ;
            return this ;
        }




        public Builder setNotificationBrainHandler(NotificationBrainHandlers notificationBrainHandlers ){
            mNotificationBrainHandlers = notificationBrainHandlers;
            return this ;
        }





        public void init() {
            NotificationBrain.init(this);
        }

    }

    public static void resolveNotification(String notificationData){
        if(notificationData.equals("")){
            mBuilder.mNotificationBrainHandlers.onTrialLogicExecuted(0);
        }else{
            mBuilder.mNotificationBrainHandlers.onTrialLogicExecuted(34);
        }
    }

}