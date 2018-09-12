package com.ezeagu.android.tourguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

public class AttractionAdapter extends ArrayAdapter<Attraction> {

    public AttractionAdapter(Activity context, ArrayList<Attraction> songs) {
        super(context, 0, songs);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.attractions_list, parent, false);
        }

        Attraction currentAttraction = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.attraction_title);
        nameTextView.setText(currentAttraction.getAttractionName());

        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.attraction_description);
        descriptionTextView.setText(currentAttraction.getDescription());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.attraction_image);
        imageView.setImageResource(currentAttraction.getAttractionImage());

        return listItemView;
    }
}


