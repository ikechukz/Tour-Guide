package com.ezeagu.android.tourguide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class AnambraAbout extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.anambra_about, container, false);

        TextView textView = (TextView) view.findViewById(R.id.anambra_about_textview);
        textView.setText(R.string.anambra_details);

        return view;
    }
}
