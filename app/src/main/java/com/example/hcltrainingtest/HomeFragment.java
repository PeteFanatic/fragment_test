package com.example.hcltrainingtest;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

public class HomeFragment extends Fragment {

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        // Reference the toolbar from the activity and set its title
        if (getActivity() != null) {
            ((MainActivity) getActivity()).getSupportActionBar().setTitle("Home");
        }

        // Your home screen UI components go here

        return view;
    }
}

