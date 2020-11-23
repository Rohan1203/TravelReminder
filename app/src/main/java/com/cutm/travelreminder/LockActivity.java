package com.cutm.travelreminder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


import in.shadowfax.proswipebutton.ProSwipeButton;

public class LockActivity extends AppCompatActivity {
    ProSwipeButton unlockButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lock);
        unlockButton = findViewById(R.id.swipeButton);
        unlockButton.setOnSwipeListener(new ProSwipeButton.OnSwipeListener() {
            @Override
            public void onSwipeConfirm() {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        unlockButton.showResultIcon(true);
                        startActivity(new Intent(getApplicationContext(), HomePage.class));
                    }
                }, 3000);
            }
        });
    }


}