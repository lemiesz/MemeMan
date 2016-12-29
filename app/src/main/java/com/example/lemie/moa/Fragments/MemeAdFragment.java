package com.example.lemie.moa.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.lemie.moa.R;
import com.pnikosis.materialishprogress.ProgressWheel;
import com.squareup.picasso.Picasso;

/**
 * Created by lemie on 12/28/2016.
 */

public class MemeAdFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        final View rootView = inflater.inflate(
                R.layout.meme_ad_fragment, container, false);
        final FrameLayout topLayout = (FrameLayout) rootView.findViewById(R.id.top_image_container);
        final ImageView topImage = (ImageView) topLayout.findViewById(R.id.image);

        topLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "You are the meme man", Toast.LENGTH_SHORT).show();
            }
        });

        Picasso.with(getContext()).load("http://img.memecdn.com/wat-ad_o_1928877.jpg").into(topImage);

        final FrameLayout bottomLayout = (FrameLayout) rootView.findViewById(R.id.bottom_image_container);
        final ImageView bottomImage = (ImageView) bottomLayout.findViewById(R.id.image);

        bottomLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "The ads got you", Toast.LENGTH_SHORT).show();
            }
        });

        Picasso.with(getContext()).load("http://1.bp.blogspot.com/-ho0-TNEjZso/TmpoZjFDX2I/AAAAAAAAARE/En4BvtA3z1Q/s1600/Palm_Centro_Magazine_Ad_by_koreansensation.jpg").into(bottomImage);

        return rootView;
    }

}
