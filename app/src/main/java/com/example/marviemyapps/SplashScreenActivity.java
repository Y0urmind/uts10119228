package com.example.marviemyapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/*
 *     Tanggal Pengerjaan : 19/5/2022
 *     Nim : 10119228
 *     Nama : Marvie Bastian Sampul
 */

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        final Handler handler = new Handler();
        handler.postDelayed(() -> {
            startActivity(new Intent(getApplicationContext(), OnboardingActivity.class));
            finish();
        }, 4000L); // 4 detik
    }
}
