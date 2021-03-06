package com.tareksaidee.newyorkgo.bbq;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.google.gson.Gson;
import com.tareksaidee.newyorkgo.DTO.BBQ;
import com.tareksaidee.newyorkgo.R;
import com.tareksaidee.newyorkgo.parser.JsonParser;

import java.io.IOException;
import java.util.ArrayList;

public class BBQActivity extends AppCompatActivity {

    private ArrayList<BBQ> bbqs;
    private RecyclerView bbqsView;
    private BBQAdapter bbqAdapter;
    private JsonParser parser;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bbq);
        parser = new JsonParser();
        if (getIntent().getStringExtra("object") != null) {
            bbqs = new ArrayList<>();
            bbqs.add(new Gson().fromJson(getIntent().getStringExtra("object"), BBQ.class));
        } else {
            parser = new JsonParser();
            try {
                bbqs = parser.getBBQ(getAssets());
            } catch (Exception e) {
                Log.e("Art gallery", e.getMessage());
            }
        }
        bbqsView = findViewById(R.id.bbqRecyclerView);
        try {
            bbqAdapter = new BBQAdapter(this, bbqs);
        } catch (IOException e) {
            e.printStackTrace();
        }
        bbqsView.setAdapter(bbqAdapter);
        bbqsView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
    }
}
