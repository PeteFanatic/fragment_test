package com.example.hcltrainingtest;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.DialogFragment;

public class LoginDialogFragment extends DialogFragment {

    public LoginDialogFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login_dialog, container, false);

        // Reference the toolbar from the activity and set its title
        if (getActivity() != null) {
            ((MainActivity) getActivity()).getSupportActionBar().setTitle("Login");
        }

        Button btnLogin = view.findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle login logic here
                // For simplicity, let's assume a successful login for now
                dismiss();

                // Redirect to HomeFragment upon successful login
                ((MainActivity) requireActivity()).switchToHomeFragment();
            }
        });

        return view;
    }
}
