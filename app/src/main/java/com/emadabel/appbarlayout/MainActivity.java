package com.emadabel.appbarlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ImageView mImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.mainToolbar);
        setSupportActionBar(toolbar);

        ArrayList<String> list = new ArrayList<>();
        for (int i=1; i < 20; i++) {
            list.add("Test scroll list item: " + i);
        }

        ItemsAdapter adapter = new ItemsAdapter(this, list);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        RecyclerView mRecyclerView = ((RecyclerView) findViewById(R.id.mainRecycler));
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setAdapter(adapter);

        mImage = (ImageView) findViewById(R.id.imageView);
        mImage.setImageResource(R.drawable.image_slider);
    }
}
