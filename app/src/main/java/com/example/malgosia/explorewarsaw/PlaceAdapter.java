package com.example.malgosia.explorewarsaw;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlaceAdapter extends ArrayAdapter<Place> {

    // ID for the background color of particular category
    private int mBackgroundColor;

    public PlaceAdapter(Activity context, ArrayList<Place> places, int backgroundColor) {
        super(context, 0, places);
        mBackgroundColor = backgroundColor;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View placeItemView = convertView;
        if (placeItemView == null) {
            placeItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.place_item_view, parent, false);
        }

        // Gets the place object located at current position in the list
        final Place currentPlace = getItem(position);

        // Finds the button with home page icon
        ImageButton homePage = placeItemView.findViewById(R.id.btn_home_page);
        // Sets OnClickListener to it
        homePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(currentPlace.getmWeb()));
                getContext().startActivity(webIntent);
            }
        });

        // Finds the button with location icon
        ImageButton location = placeItemView.findViewById(R.id.btn_location);
        // Sets OnClickListener to it
        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse(currentPlace.getmAddress());
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                getContext().startActivity(mapIntent);
            }
        });

        // Finds button with the phone icon
        ImageButton phone = placeItemView.findViewById(R.id.btn_call);
        // Sets OnClickListener to it
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + currentPlace.getmPhoneNumber()));
                getContext().startActivity(callIntent);
            }
        });

        // Finds the TextView where place name should be displayed in the place_item_view layout
        TextView nameTextView = placeItemView.findViewById(R.id.place_name);
        // Gets the name from the currentPlace object and sets it to the nameTextView
        nameTextView.setText(currentPlace.getmName());

        // Finds the ImageView where place image should be displayed in the place_item_view layout
        ImageView imageImageView = placeItemView.findViewById(R.id.place_image);
        // Gets the image resource ID from the currentPlace object and sets it to the imageImageView
        imageImageView.setImageResource(currentPlace.getmImageResourceID());

        // Sets the color for the place item view
        View infoContainer = placeItemView.findViewById(R.id.info_container);
        // Finds the color with particular resource ID
        int color = ContextCompat.getColor(getContext(), mBackgroundColor);
        // Sets the color for the info container View
        infoContainer.setBackgroundColor(color);

        return placeItemView;
    }
}
