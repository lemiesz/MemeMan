package com.example.lemie.moa.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.lemie.moa.R;
import com.squareup.picasso.Picasso;

/**
 * Created by lemie on 12/28/2016.
 */

public class SMemeAdPage extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        final View rootView = inflater.inflate(
                R.layout.meme_ad_fragment, container, false);

        return rootView;
    }

}
