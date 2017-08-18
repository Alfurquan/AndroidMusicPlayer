package com.example.alfurquan.androidmusicplayer;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


public class SongFragment extends Fragment {


    public SongFragment() {
        // Required empty public constructor
    }

    int [] images={R.drawable.closer,R.drawable.faded,R.drawable.let_me_love_you,R.drawable.alone,R.drawable.love_me_like_you_do,R.drawable.somebodys_me};
    String[] names={"Closer","Faded","Let me love you","Alone","Love me like you do","Somebody's me"};



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_song, container, false);

        ListView listview=(ListView)v.findViewById(R.id.listview);

        CustomAdapter customAdapter=new CustomAdapter();
        listview.setAdapter(customAdapter);
        return v;
    }
    class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view=getActivity().getLayoutInflater().inflate(R.layout.customlayout,null);

            ImageView imageView=(ImageView)view.findViewById(R.id.imageView);
            TextView textView=(TextView)view.findViewById(R.id.textView);

            imageView.setImageResource(images[i]);
            textView.setText(names[i]);
            return view;
        }
    }
}


