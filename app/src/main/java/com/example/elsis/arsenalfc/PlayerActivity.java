package com.example.elsis.arsenalfc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import android.view.Menu;
import android.view.MenuItem;

public class PlayerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        RecyclerView recyclerview=(RecyclerView) findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager =new LinearLayoutManager(this);
        recyclerview.setLayoutManager(layoutManager);

        RecyclerAdapter adapter=new RecyclerAdapter();
        recyclerview.setAdapter(adapter);
    }





}
