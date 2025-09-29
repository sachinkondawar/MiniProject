package com.example.resourcerenting;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class BookedResourcesActivity extends AppCompatActivity {

    RecyclerView rvBookedResources;
    BookedResourceAdapter adapter;
    List<BookedResource> bookedResourceList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booked_resources);

        rvBookedResources = findViewById(R.id.rvBookedResources);
        rvBookedResources.setLayoutManager(new LinearLayoutManager(this));

        // Sample booked resources
        bookedResourceList = new ArrayList<>();
        bookedResourceList.add(new BookedResource("Projector", "24/09/2025", "10:00 AM", "Conference Hall", "$50", "Projector for presentation."));
        bookedResourceList.add(new BookedResource("Laptop", "25/09/2025", "2:00 PM", "Lab 101", "$20", "Laptop for coding session."));
        bookedResourceList.add(new BookedResource("Whiteboard", "26/09/2025", "11:00 AM", "Room 203", "$10", "Whiteboard for team discussion."));

        adapter = new BookedResourceAdapter(bookedResourceList);
        rvBookedResources.setAdapter(adapter);
    }
}
