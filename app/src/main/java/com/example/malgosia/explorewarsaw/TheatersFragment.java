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
public class TheatersFragment extends Fragment {

    public TheatersFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        // Create the ArrayList which contains the list of Place objects
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.tn1), getString(R.string.ta1), getString(R.string.tw1), getString(R.string.tp1), R.drawable.wielki));
        places.add(new Place(getString(R.string.tn2), getString(R.string.ta2), getString(R.string.tw2), getString(R.string.tp2), R.drawable.roma));
        places.add(new Place(getString(R.string.tn3), getString(R.string.ta3), getString(R.string.tw3), getString(R.string.tp3), R.drawable.tr));
        places.add(new Place(getString(R.string.tn4), getString(R.string.ta4), getString(R.string.tw4), getString(R.string.tp4), R.drawable.wspolczesny));
        places.add(new Place(getString(R.string.tn5), getString(R.string.ta5), getString(R.string.tw5), getString(R.string.tp5), R.drawable.powszechny));
        places.add(new Place(getString(R.string.tn6), getString(R.string.ta6), getString(R.string.tw6), getString(R.string.tp6), R.drawable.ateneum));
        places.add(new Place(getString(R.string.tn7), getString(R.string.ta7), getString(R.string.tw7), getString(R.string.tp7), R.drawable.kwadrat));
        places.add(new Place(getString(R.string.tn8), getString(R.string.ta8), getString(R.string.tw8), getString(R.string.tp8), R.drawable.kamienica));
        places.add(new Place(getString(R.string.tn9), getString(R.string.ta9), getString(R.string.tw9), getString(R.string.tp9), R.drawable.komedia));
        places.add(new Place(getString(R.string.tn10), getString(R.string.ta10), getString(R.string.tw10), getString(R.string.tp10), R.drawable.rampa));

        //Create a PlaceAdapter which uses the list od places to populate the list view
        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), places, R.color.theaters_fragment);
        final ListView placesListView = rootView.findViewById(R.id.list_view);
        // Attach the adapter to the list of objects
        placesListView.setAdapter(placeAdapter);

        return rootView;
    }
}
