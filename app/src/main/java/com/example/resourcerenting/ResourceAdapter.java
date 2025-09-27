package com.example.resourcerenting;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ResourceAdapter extends RecyclerView.Adapter<ResourceAdapter.ResourceViewHolder> {

    private List<Resource> resourceList;

    public ResourceAdapter(List<Resource> resourceList) {
        this.resourceList = resourceList;
    }

    @NonNull
    @Override
    public ResourceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_resource, parent, false);
        return new ResourceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ResourceViewHolder holder, int position) {
        Resource resource = resourceList.get(position);
        holder.tvResourceName.setText(resource.getName());
        holder.tvPriceDate.setText("Price: ₹" + resource.getPrice() + " | Date: " + resource.getDate());
        holder.tvTimeLocation.setText("Time: " + resource.getTime() + " | Location: " + resource.getLocation());
        holder.tvDescription.setText(resource.getDescription());
    }

    @Override
    public int getItemCount() {
        return resourceList.size();
    }

    public static class ResourceViewHolder extends RecyclerView.ViewHolder {
        TextView tvResourceName, tvPriceDate, tvTimeLocation, tvDescription;

        public ResourceViewHolder(@NonNull View itemView) {
            super(itemView);
            tvResourceName = itemView.findViewById(R.id.tvResourceName);
            tvPriceDate = itemView.findViewById(R.id.tvPriceDate);
            tvTimeLocation = itemView.findViewById(R.id.tvTimeLocation);
            tvDescription = itemView.findViewById(R.id.tvDescription);
        }
    }
}
