package com.example.lemie.moa.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.example.lemie.moa.R;
import com.lorentzos.flingswipe.SwipeFlingAdapterView;

import java.util.ArrayList;

/**
 * Created by lemie on 12/28/2016.
 */

public class MemeSwipeFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(
                R.layout.meme_view_fragment, container, false);
        final SwipeFlingAdapterView tinderView = (SwipeFlingAdapterView) rootView.findViewById(R.id.frame);
        final ArrayList<String> items = new ArrayList<>();
        items.add("memes");
        items.add("irony");
        items.add("meme stream");
        items.add("oops an add");

        final ArrayAdapter<String> aa = new ArrayAdapter<String>(getActivity(), R.layout.test_swipe_layout, R.id.helloText, items);
        tinderView.setFlingListener( new SwipeFlingAdapterView.onFlingListener() {

            @Override
            public void removeFirstObjectInAdapter() {
                items.remove(0);
                aa.notifyDataSetChanged();
            }

            @Override
            public void onLeftCardExit(Object o) {
                Toast.makeText(getContext(), "Left!", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onRightCardExit(Object o) {
                Toast.makeText(getContext(), "Right!", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAdapterAboutToEmpty(int i) {

            }

            @Override
            public void onScroll(float v) {
                View view = tinderView.getSelectedView();
            }
        });
        tinderView.setAdapter(aa);

        return rootView;
    }

}
