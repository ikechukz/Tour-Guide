package com.ezeagu.android.tourguide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class AbujaAttractions extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.abuja_attractions, container, false);

        ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(R.string.millenium_title, R.drawable.millenium_park, R.string.millenium));
        attractions.add(new Attraction(R.string.abuja_arts_title, R.drawable.abuja_arts_village, R.string.abuja_arts));
        attractions.add(new Attraction(R.string.zuma_title, R.drawable.zuma, R.string.zuma));
        attractions.add(new Attraction(R.string.arboretum_title, R.drawable.national_aboretum, R.string.arboretum));
        attractions.add(new Attraction(R.string.mosque_title, R.drawable.mosque, R.string.mosque));
        attractions.add(new Attraction(R.string.millenium_title, R.drawable.millenium_park, R.string.millenium));
        attractions.add(new Attraction(R.string.abuja_arts_title, R.drawable.abuja_arts_village, R.string.abuja_arts));
        attractions.add(new Attraction(R.string.zuma_title, R.drawable.zuma, R.string.zuma));
        attractions.add(new Attraction(R.string.arboretum_title, R.drawable.national_aboretum, R.string.arboretum));
        attractions.add(new Attraction(R.string.mosque_title, R.drawable.mosque, R.string.mosque));
        attractions.add(new Attraction(R.string.millenium_title, R.drawable.millenium_park, R.string.millenium));
        attractions.add(new Attraction(R.string.abuja_arts_title, R.drawable.abuja_arts_village, R.string.abuja_arts));
        attractions.add(new Attraction(R.string.zuma_title, R.drawable.zuma, R.string.zuma));
        attractions.add(new Attraction(R.string.arboretum_title, R.drawable.national_aboretum, R.string.arboretum));
        attractions.add(new Attraction(R.string.mosque_title, R.drawable.mosque, R.string.mosque));
        attractions.add(new Attraction(R.string.millenium_title, R.drawable.millenium_park, R.string.millenium));
        attractions.add(new Attraction(R.string.abuja_arts_title, R.drawable.abuja_arts_village, R.string.abuja_arts));
        attractions.add(new Attraction(R.string.zuma_title, R.drawable.zuma, R.string.zuma));
        attractions.add(new Attraction(R.string.arboretum_title, R.drawable.national_aboretum, R.string.arboretum));
        attractions.add(new Attraction(R.string.mosque_title, R.drawable.mosque, R.string.mosque));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions);

        ListView listView = (ListView) view.findViewById(R.id.list2);
        listView.setAdapter(adapter);
        return view;
    }
}
