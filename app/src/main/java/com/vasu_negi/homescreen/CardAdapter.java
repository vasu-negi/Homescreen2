package com.vasu_negi.homescreen;

import android.app.Activity;
import android.media.Image;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vasu on 7/18/2015.
 */
public class CardAdapter extends ArrayAdapter {
    LayoutInflater inflater;

    View rootView;
    List<Cardpojo> chats= new ArrayList<>();

    public CardAdapter(Activity activity, List<Cardpojo> objects) {
        super(activity, R.layout.fav_card,objects);
        chats = objects;
        inflater = activity.getWindow().getLayoutInflater();


    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {

        rootView  = view;
        if(rootView==null)
            rootView = inflater.inflate(R.layout.fav_card, parent, false);
        TextView name= (TextView) rootView.findViewById(R.id.fav_name);
        name.setText(chats.get(position).getFav_name());
        ImageView image=(ImageView)rootView.findViewById(R.id.fav_image);
        image.setImageBitmap(chats.get(position).getFav_image());

        return rootView;
    }
}
