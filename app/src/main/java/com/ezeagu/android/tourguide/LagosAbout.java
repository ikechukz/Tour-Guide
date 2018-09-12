package com.ezeagu.android.tourguide;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class LagosAbout extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.lagos_about, container, false);

        TextView textView = (TextView) view.findViewById(R.id.lagos_about_textview);
        textView.setText(R.string.lagos_details);

        return view;
    }
}
