package com.ayesha.travelbuddy;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class
RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    Context mycontext;
    ArrayList<RecyclerViewModel> recycler_model_list;

    public RecyclerViewAdapter(Context mycontext, ArrayList<RecyclerViewModel> recycler_model_list) {
        this.mycontext = mycontext;
        this.recycler_model_list = recycler_model_list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View layout_view = LayoutInflater.from(mycontext.getApplicationContext()).inflate(R.layout.city_attractions_list_layout, null);
        return new ViewHolder(layout_view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        RecyclerViewModel model = recycler_model_list.get(position);
        holder.name_txt.setText(model.name);
        holder.distance_txt.setText(model.distance);
        holder.image.setImageResource(model.image);
        holder.rating.setRating(model.rating);
    }

    @Override
    public int getItemCount() {
        return recycler_model_list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView name_txt, distance_txt;
        ImageView image;
        RatingBar rating;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            name_txt = itemView.findViewById(R.id.recycler_name);
            distance_txt = itemView.findViewById(R.id.recycler_distance);
            image = itemView.findViewById(R.id.recycler_image);
            rating = itemView.findViewById(R.id.recycler_rating);

            Typeface lato_black = ResourcesCompat.getFont(mycontext, R.font.lato_black);
            Typeface lato_bold = ResourcesCompat.getFont(mycontext, R.font.lato_bold);

            name_txt.setTypeface(lato_black);
            distance_txt.setTypeface(lato_bold);

        }
    }
}
