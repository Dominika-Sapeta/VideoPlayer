package com.example.dominika.videoplayer;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Intent;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.VideoView;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

import java.io.IOException;
import java.io.InputStream;

import static android.R.attr.prompt;
import static com.example.dominika.videoplayer.ImageAdapter.urls;

public class MainActivity extends Activity {

    AnimatorSet set;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final GridView gridView = (GridView) findViewById(R.id.gridView);
        gridView.setAdapter(new ImageAdapter(this));

        final int[] index = {0};

        final int imgResources[]={R.drawable.aviator, R.drawable.babel, R.drawable.games,
                R.drawable.lala, R.drawable.father, R.drawable.casino, R.drawable.matrix,
                R.drawable.mind, R.drawable.narnia, R.drawable.spectre, R.drawable.zoo};



        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {

                final Intent i = new Intent(getApplicationContext(), FullImageActivity.class);
                set = (AnimatorSet) AnimatorInflater.loadAnimator(MainActivity.this,R.animator.slideshow);

                final ImageView imageView = new ImageView(getApplicationContext());

                switch (position){
                    case 0:

                        i.putExtra("id", position);
                        startActivity(i);

                        break;
                    case 1:
                        i.putExtra("id", position);
                        startActivity(i);
                        break;
                    case 2:
                        i.putExtra("id", position);
                        startActivity(i);
                        break;
                    case 3:
                        i.putExtra("id", position);
                        startActivity(i);
                        break;
                    case 4:
                        i.putExtra("id", position);
                        startActivity(i);
                        break;
                    case 5:
                        i.putExtra("id", position);
                        startActivity(i);
                        break;
                    case 6:
                        i.putExtra("id", position);
                        startActivity(i);
                        break;
                    case 7:
                        i.putExtra("id", position);
                        startActivity(i);
                        break;
                    case 8:
                        i.putExtra("id", position);
                        startActivity(i);
                        break;
                    case 9:
                        i.putExtra("id", position);
                        startActivity(i);
                        break;
                    case 10:
                        i.putExtra("id", position);
                        startActivity(i);
                        break;
                    case 11:
                        i.putExtra("id", position);
                        startActivity(i);
                        break;
                    default:
                        break;
                }


            }
        });
    }
}
