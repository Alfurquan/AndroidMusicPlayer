package com.example.alfurquan.androidmusicplayer;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ALFURQUAN on 30-06-2017.
 */
public class PlaylistAdapter extends RecyclerView.Adapter<PlaylistAdapter.MyViewHolder> {
    private Context mContext;
    private List<Playlist> playlistList;
    public class MyViewHolder extends RecyclerView.ViewHolder{
        private ImageView thumbnail;
        private TextView title;
        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            thumbnail = (ImageView) view.findViewById(R.id.thumbnail);
        }

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.playlist, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(PlaylistAdapter.MyViewHolder holder, int position) {
        Playlist playlist=playlistList.get(position);
        holder.title.setText(playlist.getName());

    }

    @Override
    public int getItemCount() {
        return playlistList.size();
    }
    public PlaylistAdapter(Context mContext, List<Playlist> playlistList) {
        this.mContext=mContext;
        this.playlistList=playlistList;
    }
}
