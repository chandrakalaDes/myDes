package com.fsemicolon.mydes;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class HomeAdapter extends ArrayAdapter<HomeGridClass> {


    public HomeAdapter(Activity context, ArrayList<HomeGridClass> gridCategories)
    {
        super(context,0,gridCategories);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.home_custom_layout, parent, false);
        }

        HomeGridClass currentGridClass = getItem(position);


        ImageView imageView = listItemView.findViewById(R.id.custom_image_view);

        TextView textView = listItemView.findViewById(R.id.custom_text_view);

        imageView.setImageResource(currentGridClass.getImageResourceID());

        textView.setText(currentGridClass.getImageDescription());




        return listItemView;
    }
}