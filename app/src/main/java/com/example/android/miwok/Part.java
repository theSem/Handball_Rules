package com.example.android.miwok;

import java.util.ArrayList;
import java.util.Arrays;


public class Part {

    private String title;
    private ArrayList<String> rules = new ArrayList<>();



    public Part(String title, ArrayList<String> rules){
        this.title = title;
        if (rules != null) this.rules.addAll(rules);
    }


    String getTitle(){
        return title;
    }

    void addChild(String part){
        rules.add(part);
    }

    ArrayList<String> getRules(){
        return rules;
    }
}
