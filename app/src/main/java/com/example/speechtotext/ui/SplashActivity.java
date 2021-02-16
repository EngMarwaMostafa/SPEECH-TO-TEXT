package com.example.speechtotext.ui;

import android.content.Intent;
import android.os.Bundle;

import com.example.speechtotext.MainActivity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.speechtotext.R;

public class SplashActivity extends AppCompatActivity {

        ProgressBar progressBar;
        Button button;
        TextView textView;
        ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        progressBar = findViewById(R.id.splash_activity_pb);
        button = findViewById(R.id.splash_activity_btn);
        textView = findViewById(R.id.splash_activity_tv);
        imageView = findViewById(R.id.splash_activity_iv);

      progressBar.setVisibility(View.VISIBLE);
      button.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent intent = new Intent(SplashActivity.this, MainActivity.class);
             startActivity(intent);

          }
      });

    }
}