package com.example.malgosia.explorewarsaw;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the view pager thanks to which user will be changing fragments by swiping
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        // Creates an adapter which populates each fragment at right page
        PlaceCategoriesAdapter adapter = new PlaceCategoriesAdapter(this, getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        // Find the tab layout that shows the tabs
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        // Sets the tab layout on the view pager
        tabLayout.setupWithViewPager(viewPager);
    }
}

