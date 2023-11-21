package com.example.hcltrainingtest;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.Fragment;

public class GetStartedFragment extends Fragment {

    public GetStartedFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_get_started, container, false);

        // Reference the toolbar from the activity and set its title
        if (getActivity() != null) {
            ((MainActivity) getActivity()).getSupportActionBar().setTitle("Get Started");
        }

        Button btnGetStarted = view.findViewById(R.id.btnGetStarted);
        btnGetStarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Load the LoginDialogFragment when "Get Started" is clicked
                ((MainActivity) requireActivity()).loadLoginDialogFragment();
            }
        });

        return view;
    }
}
