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
public class MuseumsFragment extends Fragment {


    public MuseumsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        // Create the ArrayList which contains the list of Place objects
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.mn1), getString(R.string.ma1), getString(R.string.mw1), getString(R.string.mp1), R.drawable.mn));
        places.add(new Place(getString(R.string.mn2), getString(R.string.ma2), getString(R.string.mw2), getString(R.string.mp2), R.drawable.krlikarnia));
        places.add(new Place(getString(R.string.mn3), getString(R.string.ma3), getString(R.string.mw3), getString(R.string.mp3), R.drawable.poster));
        places.add(new Place(getString(R.string.mn4), getString(R.string.ma4), getString(R.string.mw4), getString(R.string.mp4), R.drawable.rising));
        places.add(new Place(getString(R.string.mn5), getString(R.string.ma5), getString(R.string.mw5), getString(R.string.mp5), R.drawable.cnk));
        places.add(new Place(getString(R.string.mn6), getString(R.string.ma6), getString(R.string.mw6), getString(R.string.mp6), R.drawable.mw));
        places.add(new Place(getString(R.string.mn7), getString(R.string.ma7), getString(R.string.mw7), getString(R.string.mp7), R.drawable.chopin));
        places.add(new Place(getString(R.string.mn8), getString(R.string.ma8), getString(R.string.mw8), getString(R.string.mp8), R.drawable.royal));
        places.add(new Place(getString(R.string.mn9), getString(R.string.ma9), getString(R.string.mw9), getString(R.string.mp9), R.drawable.neon));
        places.add(new Place(getString(R.string.mn10), getString(R.string.ma10), getString(R.string.mw10), getString(R.string.mp10), R.drawable.polin));

        //Create a PlaceAdapter which uses the list od places to populate the list view
        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), places, R.color.museums_fragment);
        final ListView placesListView = rootView.findViewById(R.id.list_view);
        // Attach the adapter to the list of objects
        placesListView.setAdapter(placeAdapter);

        return rootView;
    }

}

