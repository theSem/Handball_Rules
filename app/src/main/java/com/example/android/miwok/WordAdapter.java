package com.example.android.miwok;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by whatt on 10/30/2017.
 */

public class WordAdapter extends ArrayAdapter<Part> {

    private int mColorResourceId;

    /**
     * Custom constructor
     * @param context       The current context
     * @param parts         List of Part objects to display in list
     */

    public WordAdapter(Activity context, ArrayList<Part> parts, int colorResourceId){
        super(context,0, parts);
        mColorResourceId = colorResourceId;
    }

    /**
     * Provides view for AdapterView
     *
     * @param position          The position of data in the list to be displayed
     * @param convertView       Recycled view to populate
     * @param parent            Parent viewGroup
     * @return                  The view for the position
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
/*
        View listItemView = convertView;

        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        Part currentPart = getItem(position);

        TextView defaultTranslation = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTranslation.setText(currentPart.getTitle());

        TextView translation = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        translation.setText(currentPart.getContents());


        View textContainer = listItemView.findViewById(R.id.text_container);

        int color = ContextCompat.getColor(getContext(), mColorResourceId);

        textContainer.setBackgroundColor(color);

        return listItemView;
        */
        return null;
    }
}
