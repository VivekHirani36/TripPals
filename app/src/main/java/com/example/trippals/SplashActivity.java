package com.example.trippals;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

import com.example.trippals.MainActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // This uses the splash theme background set in the manifest

        // Delay for 3 seconds
        new Handler().postDelayed(() -> {
            // Start your main activity
            Intent intent = new Intent(SplashActivity.this, Signup.class);
            startActivity(intent);
            // Close splash activity
            finish();
        }, 3000); // 3000 milliseconds = 3 seconds
    }
}
