package com.example.malgosia.explorewarsaw;


import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        // Create the ArrayList which contains the list of Place objects
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.rn1), getString(R.string.ra1), getString(R.string.rw1), getString(R.string.rp1), R.drawable.bazyliszek));
        places.add(new Place(getString(R.string.rn2), getString(R.string.ra2), getString(R.string.rw2), getString(R.string.rp2), R.drawable.boruta));
        places.add(new Place(getString(R.string.rn3), getString(R.string.ra3), getString(R.string.rw3), getString(R.string.rp3), R.drawable.fukier));
        places.add(new Place(getString(R.string.rn4), getString(R.string.ra4), getString(R.string.rw4), getString(R.string.rp4), R.drawable.starakamienica));
        places.add(new Place(getString(R.string.rn5), getString(R.string.ra5), getString(R.string.rw5), getString(R.string.rp5), R.drawable.starydom));
        places.add(new Place(getString(R.string.rn6), getString(R.string.ra6), getString(R.string.rw6), getString(R.string.rp6), R.drawable.stolica));
        places.add(new Place(getString(R.string.rn7), getString(R.string.ra7), getString(R.string.rw7), getString(R.string.rp7), R.drawable.halka));
        places.add(new Place(getString(R.string.rn8), getString(R.string.ra8), getString(R.string.rw8), getString(R.string.rp8), R.drawable.delicja));
        places.add(new Place(getString(R.string.rn9), getString(R.string.ra9), getString(R.string.rw9), getString(R.string.rp9), R.drawable.prodiz));
        places.add(new Place(getString(R.string.rn10), getString(R.string.ra10), getString(R.string.rw10), getString(R.string.rp10), R.drawable.rozana));

        //Create a PlaceAdapter which uses the list od places to populate the list view
        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), places, R.color.restaurants_fragment);
        final ListView placesListView = rootView.findViewById(R.id.list_view);
        // Attach the adapter to the list of objects
        placesListView.setAdapter(placeAdapter);

        return rootView;
    }

}
