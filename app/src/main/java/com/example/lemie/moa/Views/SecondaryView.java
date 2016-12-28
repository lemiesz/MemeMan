package com.example.lemie.moa.Views;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lemie.moa.R;

/**
 * Created by lemie on 12/28/2016.
 */
public class SecondaryView extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        final View rootView = inflater.inflate(
                R.layout.meme_view_fragment, container, false);
        return rootView;
    }

}
