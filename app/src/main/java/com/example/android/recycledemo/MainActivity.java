package com.example.android.recycledemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Message> messages;
    private RecyclerView mainRecycling;
    private MainAdapter mainAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        messages= new ArrayList<Message>();


        messages.add(new Message("Nathan", "I sure like eating steak for dinner!"));
        messages.add(new Message("Suzie", "OMG So cool!! I'm at the beach!!!"));
        messages.add(new Message("Dilyn", "HAHA, watch out for that shark, Suzie!"));
        messages.add(new Message("Anna", "Come on Dilyn, that really wasn't funny. Grow up!"));

        mainRecycling = findViewById(R.id.recycler_main);
        mainAdapter = new MainAdapter(messages,this);
        mainRecycling.setAdapter(mainAdapter);
        mainRecycling.setLayoutManager(new LinearLayoutManager(this));
    }
}
