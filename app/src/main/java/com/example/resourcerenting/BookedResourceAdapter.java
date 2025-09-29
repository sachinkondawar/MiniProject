package com.example.resourcerenting;



import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BookedResourceAdapter extends RecyclerView.Adapter<BookedResourceAdapter.BookedResourceViewHolder> {

    private List<BookedResource> bookedResources;

    public BookedResourceAdapter(List<BookedResource> bookedResources) {
        this.bookedResources = bookedResources;
    }

    @NonNull
    @Override
    public BookedResourceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_booked_resource, parent, false);
        return new BookedResourceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BookedResourceViewHolder holder, int position) {
        BookedResource resource = bookedResources.get(position);
        holder.tvName.setText(resource.getName());
        holder.tvDateTime.setText(resource.getDate() + " | " + resource.getTime());
        holder.tvLocation.setText(resource.getLocation());
        holder.tvPrice.setText("Price: " + resource.getPrice());
        holder.tvDescription.setText(resource.getDescription());
    }

    @Override
    public int getItemCount() {
        return bookedResources.size();
    }

    public static class BookedResourceViewHolder extends RecyclerView.ViewHolder {
        TextView tvName, tvDateTime, tvLocation, tvPrice, tvDescription;

        public BookedResourceViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tvResourceName);
            tvDateTime = itemView.findViewById(R.id.tvResourceDateTime);
            tvLocation = itemView.findViewById(R.id.tvResourceLocation);
            tvPrice = itemView.findViewById(R.id.tvResourcePrice);
            tvDescription = itemView.findViewById(R.id.tvResourceDescription);
        }
    }
}

