package com.blackice.tabsyoutube;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        ViewPager viewPager =(ViewPager) findViewById(R.id.pager);

        viewPager.setAdapter(new SectionsPagerAdapter(getSupportFragmentManager()));
        tabLayout.setupWithViewPager(viewPager);


    }


    public  class  SectionsPagerAdapter extends FragmentPagerAdapter{

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0:
                    return new FragmentA();
                case 1:
                    return new FragmentB();
                default:
                    return new FragmentC();
            }

        }

        @Override
        public int getCount() {
            return 2;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position){
                case 0:
                    return "First tab";
                case 1:
                    return "Second tab";
                default:
                    return "lo que sea";
            }

            //return super.getPageTitle(position);
        }
    }
}
