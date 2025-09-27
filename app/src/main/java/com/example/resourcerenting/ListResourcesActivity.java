package com.example.resourcerenting;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class ListResourcesActivity extends AppCompatActivity {

    RecyclerView rvResources;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_resources);

        rvResources = findViewById(R.id.rvResources);
        rvResources.setLayoutManager(new LinearLayoutManager(this));

        ResourceAdapter adapter = new ResourceAdapter(ResourceStorage.getResources());
        rvResources.setAdapter(adapter);
    }
}
