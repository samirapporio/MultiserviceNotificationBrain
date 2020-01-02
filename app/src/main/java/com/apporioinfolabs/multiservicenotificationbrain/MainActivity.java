package com.apporioinfolabs.multiservicenotificationbrain;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.apporioinfolabs.multiservicenotificationbrain2.NotificationBrain;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.test_notification_logic).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NotificationBrain.resolveNotification("some data ");
            }
        });

        findViewById(R.id.test_two_notification_logic).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NotificationBrain.resolveNotification("");
            }
        });

    }
}
