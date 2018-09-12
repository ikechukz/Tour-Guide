package com.ezeagu.android.tourguide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class AnambraAttractions extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.anambra_attractions, container, false);

        ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(R.string.eke_awka_title, R.drawable.eke_awka, R.string.eke_awka));
        attractions.add(new Attraction(R.string.ogbunike_title, R.drawable.ogbunike, R.string.ogbunike));
        attractions.add(new Attraction(R.string.all_saints_title, R.drawable.all_saints_cathedral, R.string.all_saints));
        attractions.add(new Attraction(R.string.onitsha_mall_title, R.drawable.onitsha_mall, R.string.onitsha_mall));
        attractions.add(new Attraction(R.string.cofi_title, R.drawable.cofi_lounge, R.string.cofi));
        attractions.add(new Attraction(R.string.eke_awka_title, R.drawable.eke_awka, R.string.eke_awka));
        attractions.add(new Attraction(R.string.ogbunike_title, R.drawable.ogbunike, R.string.ogbunike));
        attractions.add(new Attraction(R.string.all_saints_title, R.drawable.all_saints_cathedral, R.string.all_saints));
        attractions.add(new Attraction(R.string.onitsha_mall_title, R.drawable.onitsha_mall, R.string.onitsha_mall));
        attractions.add(new Attraction(R.string.cofi_title, R.drawable.cofi_lounge, R.string.cofi));
        attractions.add(new Attraction(R.string.eke_awka_title, R.drawable.eke_awka, R.string.eke_awka));
        attractions.add(new Attraction(R.string.ogbunike_title, R.drawable.ogbunike, R.string.ogbunike));
        attractions.add(new Attraction(R.string.all_saints_title, R.drawable.all_saints_cathedral, R.string.all_saints));
        attractions.add(new Attraction(R.string.onitsha_mall_title, R.drawable.onitsha_mall, R.string.onitsha_mall));
        attractions.add(new Attraction(R.string.cofi_title, R.drawable.cofi_lounge, R.string.cofi));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions);

        ListView listView = (ListView) view.findViewById(R.id.list2);
        listView.setAdapter(adapter);
        return view;
    }
}
