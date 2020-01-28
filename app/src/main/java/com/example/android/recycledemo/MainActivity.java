package com.example.android.recycledemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> nameData;
    private ArrayList<String> commentData;
    private RecyclerView mainRecycling;
    private MainAdapter mainAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameData= new ArrayList<String>();
        commentData = new ArrayList<String>();

        HashMap displayData = new HashMap<String, String>();
        displayData.put("Nathan", "I sure like eating steak for dinner!");
        displayData.put("Suzie", "OMG So cool!! I'm at the beach!!!");
        displayData.put("Dilyn", "HAHA, watch out for that shark, Suzie!");
        displayData.put("Anna", "Come on Dilyn, that really wasn't funny. Grow up!");

        for (Object a: displayData.keySet()){
            nameData.add((String)a);
            commentData.add((String)displayData.get(a));
        }

        mainRecycling = findViewById(R.id.recycler_main);
        mainAdapter = new MainAdapter(nameData, commentData,this);
        mainRecycling.setAdapter(mainAdapter);
        mainRecycling.setLayoutManager(new LinearLayoutManager(this));
    }
}
