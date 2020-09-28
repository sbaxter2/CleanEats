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

    private List<Integer> numbers;
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
        holder.placeholder.setText(numbers.get(position) + "");
    }

    @Override
    public int getItemCount() {
         if (numbers == null) return 0;
         return numbers.size();
    }

    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

    class RestaurantViewHolder extends RecyclerView.ViewHolder {

        private TextView placeholder;

        public RestaurantViewHolder(@NonNull View itemView) {
            super(itemView);

            placeholder = itemView.findViewById(R.id.tv_mainActivity_placeholder);
        }
    }
}
