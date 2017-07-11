package com.example.dominika.videoplayer;

import android.view.LayoutInflater;
import android.widget.ListAdapter;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.VideoView;

import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;


public class ImageAdapter extends BaseAdapter{


    private Context context;

    public Integer[] images={
            R.drawable.file_1, R.drawable.file_7,
            R.drawable.file_2, R.drawable.file_8,
            R.drawable.file_3, R.drawable.file_9,
            R.drawable.file_4, R.drawable.file_10,
            R.drawable.file_5, R.drawable.file_11,
            R.drawable.file_6, R.drawable.file_12
    };


    public String[] films={
            "/storage/external_SD/file_1.mp4", "/storage/external_SD/file_7.mp4",
            "/storage/external_SD/file_2.mp4", "/storage/external_SD/file_8.mp4",
            "/storage/external_SD/file_3.mp4", "/storage/external_SD/file_9.mp4",
            "/storage/external_SD/file_4.mp4", "/storage/external_SD/file_10.mp4",
            "/storage/external_SD/file_5.mp4", "/storage/external_SD/file_11.mp44",
            "/storage/external_SD/file_6.mp4", "/storage/external_SD/file_12.mp4"
    };


    public ImageAdapter(Context c){
        this.context = c;
    }

    @Override
    public int getCount() {
        return films.length;
    }


    @Override
    public Object getItem(int position) {
        return films[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }



    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        ImageView imageView = new ImageView(context);
        imageView.setImageResource(images[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setLayoutParams(new GridView.LayoutParams(240, 240));
        return imageView;


    }
}
