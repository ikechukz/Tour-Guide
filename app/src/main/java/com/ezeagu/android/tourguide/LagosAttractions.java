package com.ezeagu.android.tourguide;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class LagosAttractions extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.lagos_attractions, container, false);

        ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(R.string.national, R.drawable.national_theatre, R.string.national_theatre));
        attractions.add(new Attraction(R.string.tarkwa, R.drawable.tarkwa_bay, R.string.tarkwa_bay));
        attractions.add(new Attraction(R.string.lekki, R.drawable.lekki_leisure_lake, R.string.lekki_leisure));
        attractions.add(new Attraction(R.string.terra, R.drawable.terrakulture, R.string.terra_kulture));
        attractions.add(new Attraction(R.string.ikeja, R.drawable.ikeja_city, R.string.ikeja_mall));attractions.add(new Attraction(R.string.national, R.drawable.national_theatre, R.string.national_theatre));
        attractions.add(new Attraction(R.string.tarkwa, R.drawable.tarkwa_bay, R.string.tarkwa_bay));
        attractions.add(new Attraction(R.string.lekki, R.drawable.lekki_leisure_lake, R.string.lekki_leisure));
        attractions.add(new Attraction(R.string.terra, R.drawable.terrakulture, R.string.terra_kulture));
        attractions.add(new Attraction(R.string.ikeja, R.drawable.ikeja_city, R.string.ikeja_mall));attractions.add(new Attraction(R.string.national, R.drawable.national_theatre, R.string.national_theatre));
        attractions.add(new Attraction(R.string.tarkwa, R.drawable.tarkwa_bay, R.string.tarkwa_bay));
        attractions.add(new Attraction(R.string.lekki, R.drawable.lekki_leisure_lake, R.string.lekki_leisure));
        attractions.add(new Attraction(R.string.terra, R.drawable.terrakulture, R.string.terra_kulture));
        attractions.add(new Attraction(R.string.ikeja, R.drawable.ikeja_city, R.string.ikeja_mall));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions);

        ListView listView = (ListView) view.findViewById(R.id.list2);
        listView.setAdapter(adapter);
        return view;
    }
}
