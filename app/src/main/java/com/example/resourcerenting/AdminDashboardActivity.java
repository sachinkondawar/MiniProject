package com.example.resourcerenting;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class AdminDashboardActivity extends AppCompatActivity {

    CardView notificationsCard, uploadResourcesCard, bookedResourcesCard, listResourcesCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_dashboard);

        // Initialize cards
        notificationsCard = findViewById(R.id.notificationsCard);
        uploadResourcesCard = findViewById(R.id.uploadResourcesCard);
        bookedResourcesCard = findViewById(R.id.bookedResourcesCard);
        listResourcesCard = findViewById(R.id.listResourcesCard);

        // Example: Notifications action
        notificationsCard.setOnClickListener(v -> {
            Intent intent = new Intent(AdminDashboardActivity.this, NotificationsActivity.class);
            startActivity(intent);
        });

        // Upload Resources action
        uploadResourcesCard.setOnClickListener(v -> {
            Intent intent = new Intent(AdminDashboardActivity.this, UploadResourcesActivity.class);
            startActivity(intent);
        });

        // Booked Resources action
        bookedResourcesCard.setOnClickListener(v -> {
            Intent intent = new Intent(AdminDashboardActivity.this, BookedResourcesActivity.class);
            startActivity(intent);
        });

        // ✅ New Action: List of Resources
        listResourcesCard.setOnClickListener(v -> {
            Intent intent = new Intent(AdminDashboardActivity.this, ListResourcesActivity.class);
            startActivity(intent);
        });
    }
}
