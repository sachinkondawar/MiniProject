package com.example.resourcerenting;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class UploadResourcesActivity extends AppCompatActivity {

    EditText etResourceName, etPrice, etDate, etTime, etLocation, etDescription;
    Button btnSubmit, btnChooseImage;
    ImageView imagePreview;
    Uri selectedImageUri;

    private static final int PICK_IMAGE_REQUEST = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload_resources);

        etResourceName = findViewById(R.id.etResourceName);
        etPrice = findViewById(R.id.etPrice);
        etDate = findViewById(R.id.etDate);
        etTime = findViewById(R.id.etTime);
        etLocation = findViewById(R.id.etLocation);
        etDescription = findViewById(R.id.etDescription);
        btnSubmit = findViewById(R.id.btnSubmit);
        btnChooseImage = findViewById(R.id.btnChooseImage);
        imagePreview = findViewById(R.id.imagePreview);

        btnChooseImage.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
            intent.setType("image/*");
            startActivityForResult(intent, PICK_IMAGE_REQUEST);
        });

        btnSubmit.setOnClickListener(v -> {
            String name = etResourceName.getText().toString().trim();
            String price = etPrice.getText().toString().trim();
            String date = etDate.getText().toString().trim();
            String time = etTime.getText().toString().trim();
            String location = etLocation.getText().toString().trim();
            String description = etDescription.getText().toString().trim();

            if (name.isEmpty() || price.isEmpty() || selectedImageUri == null) {
                Toast.makeText(this, "Please fill all required fields and select an image", Toast.LENGTH_SHORT).show();
            } else {
                Resource resource = new Resource(name, price, date, time, location, description, selectedImageUri.toString());
                ResourceStorage.addResource(resource);

                Toast.makeText(this, "Resource uploaded successfully", Toast.LENGTH_SHORT).show();
                finish(); // back to dashboard
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == PICK_IMAGE_REQUEST && resultCode == RESULT_OK && data != null) {
            selectedImageUri = data.getData();
            imagePreview.setImageURI(selectedImageUri);
        }
    }
}
