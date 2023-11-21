package com.example.hcltrainingtest;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentTransaction;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set up the Toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Load the GetStartedFragment by default
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, new GetStartedFragment())
                .commit();
    }

    // Method to load the LoginDialogFragment
    public void loadLoginDialogFragment() {
        LoginDialogFragment loginDialogFragment = new LoginDialogFragment();
        loginDialogFragment.show(getSupportFragmentManager(), "loginDialog");
    }

    // Method to switch to the HomeFragment
    public void switchToHomeFragment() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, new HomeFragment())
                .commit();
    }
}

