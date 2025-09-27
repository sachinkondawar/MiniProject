package com.example.resourcerenting;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class NotificationsActivity extends AppCompatActivity {

    RecyclerView rvNotifications;
    NotificationAdapter adapter;
    List<Notification> notificationList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifications);

        rvNotifications = findViewById(R.id.rvNotifications);
        rvNotifications.setLayoutManager(new LinearLayoutManager(this));

        // Sample notifications
        notificationList = new ArrayList<>();
        notificationList.add(new Notification("New Resource Uploaded", "A new resource 'Projector' has been uploaded."));
        notificationList.add(new Notification("Booking Confirmed", "Your booking for 'Conference Hall' is confirmed."));
        notificationList.add(new Notification("Resource Updated", "Resource 'Laptop' details have been updated."));

        adapter = new NotificationAdapter(notificationList);
        rvNotifications.setAdapter(adapter);
    }
}
