package com.example.alfurquan.androidmusicplayer;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;


public class ArtistAdapter extends RecyclerView.Adapter<ArtistAdapter.MyViewHolder>{
    private Context mContext;
    private List<Artist> artistList;
    public class MyViewHolder extends RecyclerView.ViewHolder{
        private ImageView thumbnail,overflow;
        private TextView title;
        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            thumbnail = (ImageView) view.findViewById(R.id.thumbnail);
            overflow = (ImageView) view.findViewById(R.id.overflow);
        }
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.artist_card, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override


    public void onBindViewHolder(MyViewHolder holder, int position) {
        Artist artist=artistList.get(position);
        holder.title.setText(artist.getName());
        Glide.with(mContext).load(artist.getThumbnail()).into(holder.thumbnail);


    }

    @Override
    public int getItemCount() {
        return artistList.size();
    }

    public ArtistAdapter(Context mContext, List<Artist> artistList) {
        this.mContext=mContext;
        this.artistList=artistList;
    }
}
