package com.example.alfurquan.androidmusicplayer;


import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class PlaylistFragment extends Fragment {

    private RecyclerView recyclerView;
    private PlaylistAdapter adapter;
    private List<Playlist> playlistList;


    public PlaylistFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_playlist, container, false);

        recyclerView = (RecyclerView)v.findViewById(R.id.recycler_view);
        playlistList = new ArrayList<>();
        adapter = new PlaylistAdapter(getActivity(),playlistList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        preparelist();
        return v;
    }

 void preparelist()
 {

 }
}
