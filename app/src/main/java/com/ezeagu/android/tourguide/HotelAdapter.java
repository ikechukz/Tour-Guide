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

public class HotelAdapter extends ArrayAdapter<Hotel> {

    public HotelAdapter(Activity context, ArrayList<Hotel> songs) {

        super(context, 0, songs);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.hotel_list, parent, false);
        }

        Hotel currentHotel = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.hotel_name);
        nameTextView.setText(currentHotel.getHotelName());

        TextView addressTextView = (TextView) listItemView.findViewById(R.id.hotel_address);
        addressTextView.setText(currentHotel.getHotelAddress());

        TextView phoneTextView = (TextView) listItemView.findViewById(R.id.phone_number);
        phoneTextView.setText(currentHotel.getPhoneNumber());

        RatingBar ratingBar = (RatingBar) listItemView.findViewById(R.id.ratingBar);
        ratingBar.setRating(currentHotel.getRating());

        return listItemView;
    }
}


