package com.example.malgosia.explorewarsaw;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PlaceCategoriesAdapter extends FragmentPagerAdapter {

    // Application context
    private Context mContext;

    public PlaceCategoriesAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new RestaurantsFragment();
        } else if (position == 1) {
            return new MuseumsFragment();
        } else if (position == 2) {
            return new CinemasFragment();
        } else return new TheatersFragment();
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.restaurants_fragment);
        } else if (position == 1) {
            return mContext.getString(R.string.museums_fragment);
        } else if (position == 2) {
            return mContext.getString(R.string.cinemas_fragment);
        } else {
            return mContext.getString(R.string.theaters_fragment);
        }
    }
}
