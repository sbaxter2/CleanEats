package com.example.cleaneats;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.RestaurantViewHolder> {

    private List<Restaurant> restaurants;
    private Context context;

    public RestaurantAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public RestaurantViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.rv_mainactivity_listitem, parent,
                false);

        return new RestaurantViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RestaurantViewHolder holder, int position) {
        String restaurantName = restaurants.get(position).getRestaurantName();
        String restaurantAddress = restaurants.get(position).getRestaurantAddress();
        int inspectionScore = restaurants.get(position).getInspectionScore();

        holder.restaurantName.setText(restaurantName);
        holder.restaurantAddress.setText(restaurantAddress);
        holder.inspectionScore.setText(inspectionScore + "");
    }

    @Override
    public int getItemCount() {
         if (restaurants == null) return 0;
         return restaurants.size();
    }

    public void setNumbers(List<Restaurant> restaurants) {
        this.restaurants = restaurants;
        notifyDataSetChanged();
    }

    class RestaurantViewHolder extends RecyclerView.ViewHolder {

        private TextView restaurantName;
        private TextView restaurantAddress;
        private TextView inspectionScore;

        public RestaurantViewHolder(@NonNull View itemView) {
            super(itemView);

            restaurantName = itemView.findViewById(R.id.tv_listItem_restaurantName);
            restaurantAddress = itemView.findViewById(R.id.tv_listItem_restaurantAddress);
            inspectionScore = itemView.findViewById(R.id.tv_listItem_inspectionScore);
        }
    }
}
