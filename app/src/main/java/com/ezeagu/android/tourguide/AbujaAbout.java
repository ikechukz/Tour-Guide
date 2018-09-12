package com.ezeagu.android.tourguide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class AbujaAbout extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.abuja_about, container, false);

        TextView textView = (TextView) view.findViewById(R.id.abuja_about_textview);
        textView.setText(R.string.abuja_details);

        return view;
    }
}
