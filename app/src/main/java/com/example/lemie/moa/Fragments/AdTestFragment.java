package com.example.lemie.moa.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.lemie.moa.R;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

/**
 * Created by lemiesz on 4/11/17.
 */

public class AdTestFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.ad_test_fragment, container, false);
        final AdView adView = (AdView) rootView.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);
        adView.setAdListener(new AdListener() {
            @Override
            public void onAdLeftApplication() {
                Toast.makeText(rootView.getContext(), "Clicked on the Ad", Toast.LENGTH_SHORT).show();
            }
        });
        adView.setAdListener(new AdListener() {
            @Override
            public void onAdOpened() {
                Toast.makeText(rootView.getContext(), "Clicked on the Ad", Toast.LENGTH_SHORT).show();

            }
        });
//        adView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(view.getContext(), "Clicked on the Ad", Toast.LENGTH_SHORT).show();
//            }
//        });
        return rootView;
    }

}
