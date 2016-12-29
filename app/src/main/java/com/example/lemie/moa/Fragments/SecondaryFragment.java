package com.example.lemie.moa.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lemie.moa.R;

/**
 * Created by lemie on 12/28/2016.
 */
public class SecondaryFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        final View rootView = inflater.inflate(
                R.layout.secondary_view_fragment, container, false);
        return rootView;
    }

}
