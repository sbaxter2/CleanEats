package com.example.cleaneats;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Filter;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import java.util.Locale;

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

    public void getFilter() {
        /*this is the method we need to make the search work
        replace void with Filter, multiple people have their own solutions to put it in a baseAdapter
        not sure why we can't use ArrayAdapter but there's probably a reason, it's late so I can't think
        it's also too late at night for me to comprehend this class, will try to ask you tomorrow
        I'm pushing this to github with any real changes commented out just so it won't pitch a fit
        but we could still build off of it later. PS getting the recyclerview to fit to both tablet and phone
        simultaneously is a nightmare, format suits the phone for now.
         */
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
