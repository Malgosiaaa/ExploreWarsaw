package com.example.malgosia.explorewarsaw;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class CinemasFragment extends Fragment {


    public CinemasFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        // Create the ArrayList which contains the list of Place objects
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.cn1), getString(R.string.ca1), getString(R.string.cw1), getString(R.string.cp1), R.drawable.wisla));
        places.add(new Place(getString(R.string.cn2), getString(R.string.ca2), getString(R.string.cw2), getString(R.string.cp2), R.drawable.muranow));
        places.add(new Place(getString(R.string.cn3), getString(R.string.ca3), getString(R.string.cw3), getString(R.string.cp3), R.drawable.praha));
        places.add(new Place(getString(R.string.cn4), getString(R.string.ca4), getString(R.string.cw4), getString(R.string.cp4), R.drawable.imax));
        places.add(new Place(getString(R.string.cn5), getString(R.string.ca5), getString(R.string.cw5), getString(R.string.cp5), R.drawable.kinoteka));
        places.add(new Place(getString(R.string.cn6), getString(R.string.ca6), getString(R.string.cw6), getString(R.string.cp6), R.drawable.multikino));
        places.add(new Place(getString(R.string.cn7), getString(R.string.ca7), getString(R.string.cw7), getString(R.string.cp7), R.drawable.elektronik));
        places.add(new Place(getString(R.string.cn8), getString(R.string.ca8), getString(R.string.cw8), getString(R.string.cp8), R.drawable.kultura));

        //Create a PlaceAdapter which uses the list od places to populate the list view
        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), places, R.color.cinemas_fragment);
        final ListView placesListView = rootView.findViewById(R.id.list_view);
        // Attach the adapter to the list of objects
        placesListView.setAdapter(placeAdapter);

        return rootView;
    }

}

