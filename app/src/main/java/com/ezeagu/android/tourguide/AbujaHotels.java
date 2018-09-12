package com.ezeagu.android.tourguide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class AbujaHotels extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.abuja_hotels, container, false);

        ArrayList<Hotel> hotels = new ArrayList<Hotel>();
        hotels.add(new Hotel(R.string.eko_name, R.string.eko_add, R.string.eko_num,5));
        hotels.add(new Hotel(R.string.golden_name, R.string.golden_add, R.string.golden_num,2));
        hotels.add(new Hotel(R.string.southern_name, R.string.southern_add, R.string.southern_phone,1));
        hotels.add(new Hotel(R.string.fg_name, R.string.fg_add, R.string.fg_phone,4));
        hotels.add(new Hotel(R.string.lasal_name, R.string.lasal_add, R.string.lasal_num,2));
        hotels.add(new Hotel(R.string.new_name, R.string.new_add, R.string.new_num,3));
        hotels.add(new Hotel(R.string.peka_name, R.string.peka_add, R.string.peka_num,3));hotels.add(new Hotel(R.string.eko_name, R.string.eko_add, R.string.eko_num,5));
        hotels.add(new Hotel(R.string.golden_name, R.string.golden_add, R.string.golden_num,2));
        hotels.add(new Hotel(R.string.southern_name, R.string.southern_add, R.string.southern_phone,1));
        hotels.add(new Hotel(R.string.fg_name, R.string.fg_add, R.string.fg_phone,4));
        hotels.add(new Hotel(R.string.lasal_name, R.string.lasal_add, R.string.lasal_num,2));
        hotels.add(new Hotel(R.string.new_name, R.string.new_add, R.string.new_num,3));
        hotels.add(new Hotel(R.string.peka_name, R.string.peka_add, R.string.peka_num,3));hotels.add(new Hotel(R.string.eko_name, R.string.eko_add, R.string.eko_num,5));
        hotels.add(new Hotel(R.string.golden_name, R.string.golden_add, R.string.golden_num,2));
        hotels.add(new Hotel(R.string.southern_name, R.string.southern_add, R.string.southern_phone,1));
        hotels.add(new Hotel(R.string.fg_name, R.string.fg_add, R.string.fg_phone,4));
        hotels.add(new Hotel(R.string.lasal_name, R.string.lasal_add, R.string.lasal_num,2));
        hotels.add(new Hotel(R.string.new_name, R.string.new_add, R.string.new_num,3));
        hotels.add(new Hotel(R.string.peka_name, R.string.peka_add, R.string.peka_num,3));hotels.add(new Hotel(R.string.eko_name, R.string.eko_add, R.string.eko_num,5));
        hotels.add(new Hotel(R.string.golden_name, R.string.golden_add, R.string.golden_num,2));
        hotels.add(new Hotel(R.string.southern_name, R.string.southern_add, R.string.southern_phone,1));
        hotels.add(new Hotel(R.string.fg_name, R.string.fg_add, R.string.fg_phone,4));
        hotels.add(new Hotel(R.string.lasal_name, R.string.lasal_add, R.string.lasal_num,2));
        hotels.add(new Hotel(R.string.new_name, R.string.new_add, R.string.new_num,3));
        hotels.add(new Hotel(R.string.peka_name, R.string.peka_add, R.string.peka_num,3));

        HotelAdapter adapter = new HotelAdapter(getActivity(), hotels);

        ListView listView = (ListView) view.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
}
