package com.example.dominika.videoplayer;

import android.app.ProgressDialog;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.VideoView;

public class FragmentEleven extends Fragment {


    private ProgressDialog pDialog;
    private VideoView videoview;

    public FragmentEleven() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.layout_fragment_eleven, container, false);
        videoview = (VideoView) rootview.findViewById(R.id.VideoView11);
        pDialog = new ProgressDialog(getActivity());
        pDialog.setTitle("Android Video Streaming");
        pDialog.setMessage("Buffering...");
        pDialog.setIndeterminate(false);
        pDialog.setCancelable(false);
        pDialog.show();

        try {
            MediaController mediacontroller = new MediaController(getActivity());
            mediacontroller.setAnchorView(videoview);
            videoview.setMediaController(mediacontroller);
            videoview.setVideoPath("/storage/external_SD/file_11.mp4");

        } catch (Exception e) {
            Log.e("Error", e.getMessage());
            e.printStackTrace();
        }

        videoview.requestFocus();
        videoview.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            public void onPrepared(MediaPlayer mp) {
                pDialog.dismiss();
            }
        });


        return rootview;
    }

}
