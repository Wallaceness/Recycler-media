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


        messages.add(new Message("Nathan", "I sure like eating steak for dinner!", "@drawable/steak.jpg", true));
        messages.add(new Message("Suzie", "OMG So cool!! I'm at the beach!!!", "https://img2.10bestmedia.com/Images/Photos/352450/GettyImages-913753556_54_990x660.jpg", false));
        messages.add(new Message("Dilyn", "HAHA, watch out for that shark, Suzie!", "https://3o15h033zmpwracwx2i00rqx-wpengine.netdna-ssl.com/wp-content/uploads/2016/10/shark-finning-Large.jpg", false));
        messages.add(new Message("Anna", "Come on Dilyn, that really wasn't funny. Grow up!", "https://images.emojiterra.com/google/android-10/512px/1f620.png", false));

        mainRecycling = findViewById(R.id.recycler_main);
        mainAdapter = new MainAdapter(messages,this);
        mainRecycling.setAdapter(mainAdapter);
        mainRecycling.setLayoutManager(new LinearLayoutManager(this));
    }
}
