package aw.environment;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewpageAdapter extends FragmentPagerAdapter {


    public ViewpageAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
            return new LostFragment();
            case 1:
                return new FoundFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }




}
