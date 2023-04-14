package com.ayesha.travelbuddy;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.content.res.ResourcesCompat;

import java.util.ArrayList;

public class AdapterFlipper_BaseAdapter extends BaseAdapter {

    Context context;
    ArrayList<AdapterFlipperModel> models_list; //We are writing the input of baseadapter i.e to set the adapter, we will put an array list and context. We will create arraylist of the whole data in the mainactivity.
    LayoutInflater inflater; //to set the layout to the adapterflipper

    public AdapterFlipper_BaseAdapter(Context context, ArrayList<AdapterFlipperModel> models_list) {
        this.context = context;
        this.models_list = models_list;
        inflater = LayoutInflater.from(context.getApplicationContext()); //Initializing all the variables
    }

    @Override
    public int getCount() {
        return models_list.size(); //count of the elements = no. of elements in the model_list
    }

    @Override
    public Object getItem(int i) {
        return models_list.get(i); //on item click, the position of the model_list = getitem
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        view = inflater.inflate(R.layout.homeadapterflipper, null); //we setted the layout of the flipper. which is the homeadapterflipper file just created by us!


        //Creating variables
        ImageView picture, favourite;
        TextView name, state;

        //Assigning the control to the variables

        picture = view.findViewById(R.id.adapterflipper_image);
        name = view.findViewById(R.id.adapterflipper_name);
        state = view.findViewById(R.id.adapterflipper_state);
        favourite = view.findViewById(R.id.adapterflipper_fav);

        //Assigning values to the variables

        AdapterFlipperModel model = models_list.get(i);

        name.setText(model.name);
        state.setText(model.state);
        picture.setImageResource(model.image);
        favourite.setImageResource(R.drawable.ic_baseline_favorite_24); //the same image would be in all the view of the flipper


        //In Adapterviewflipper and baseadapterclass, to set a custom font, following settings should be applied.
        //we will create 2 typeface. one for latoblack and one for latobold.
        //latoblack would be for name of place and latobold for state.

        //We can use getResources instead of ResourcesCompat(). However, i have used ResourcesCompat() because it supports this font setting in all devices.

        Typeface latoblack = ResourcesCompat.getFont(context, R.font.lato_black);
        Typeface latobold  = ResourcesCompat.getFont(context, R.font.lato_bold);

        name.setTypeface(latoblack);
        state.setTypeface(latobold);

        //If we run the application, the fav button would be invisible. to make it appear, we will add it in this adapterclass.

        return view;
    }
}
