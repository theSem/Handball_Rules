package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
/*
        //Create an arrayList containing rules for lesson
        ArrayList<Part> rules = new ArrayList<Part>();
        rules.addAll(Arrays.asList(
                new Part("green","绿色",R.drawable.color_green),
                new Part("yellow","黄色",R.drawable.color_mustard_yellow),
                new Part("blue","蓝色",R.drawable.color_blue),
                new Part("red","红色",R.drawable.color_red),
                new Part("gold","金色",R.drawable.color_gold),
                new Part("black","黑色",R.drawable.color_black),
                new Part("white","白色",R.drawable.color_white),
                new Part("brown","棕色",R.drawable.color_brown),
                new Part("orange","橙色",R.drawable.color_orange),
                new Part("color","颜色",R.drawable.color_rainbow)
        ));

        //Add the strings from rules to layout
        WordAdapter itemsAdapter = new WordAdapter(this, rules, R.color.rules_three);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
        */
    }
}
