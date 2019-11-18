package com.example.glideapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
    }

    public void loadimage(View view) {

        String uri = "https://picsum.photos/id/600/400/400";

        Glide.with(this)
                .load(uri)
                .centerCrop()
                .placeholder(R.drawable.ic_launcher_foreground)
                .into(imageView);

    }
}
