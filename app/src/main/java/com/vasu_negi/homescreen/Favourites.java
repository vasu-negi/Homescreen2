package com.vasu_negi.homescreen;

import android.app.Activity;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.support.design.widget.FloatingActionButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.nhaarman.listviewanimations.appearance.simple.AlphaInAnimationAdapter;
import com.nhaarman.listviewanimations.appearance.simple.SwingLeftInAnimationAdapter;
import com.nhaarman.listviewanimations.appearance.simple.SwingRightInAnimationAdapter;

import java.util.ArrayList;
import java.util.List;



public class Favourites extends android.support.v4.app.Fragment {


    public Favourites() {
        // Required empty public constructor
    }

    ArrayAdapter<Cardpojo> CardpojoArrayAdapter;
    ListView listView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FloatingActionButton fab1;
        View rootView = inflater.inflate(R.layout.fragment_favourites, container, false);

        listView = (ListView) rootView.findViewById(R.id.listView);
        Cardpojo chat = new Cardpojo(BitmapFactory.decodeResource(getResources(),R.drawable.steins_gate),"steins_gate");



        List<Cardpojo> chats = new ArrayList<Cardpojo>();
        chats.add(chat);
        chats.add(chat);
        chats.add(chat);
        chats.add(chat);
        chats.add(chat);

        CardpojoArrayAdapter = new CardAdapter(getActivity(), chats);
        /*listView.setAdapter(CardpojoArrayAdapter);*/

        SwingRightInAnimationAdapter animationAdapter = new SwingRightInAnimationAdapter(CardpojoArrayAdapter);
        animationAdapter.setAbsListView(listView);
        listView.setAdapter(animationAdapter);

        return rootView;



    }

    // TODO: Rename method, update argument and hook method into UI event




}
