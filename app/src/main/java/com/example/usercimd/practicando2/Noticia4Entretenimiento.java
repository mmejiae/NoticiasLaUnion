package com.example.usercimd.practicando2;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.widget.MediaController;
import android.widget.VideoView;

public class Noticia4Entretenimiento extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noticia4_entretenimiento);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        VideoView videoView = (VideoView) findViewById(R.id.video4);

        MediaController mediaController=new MediaController(this);
        mediaController.setPadding(0,0,0,0);
        String vidAddress = "https://ia601500.us.archive.org/34/items/innovation_201512/innovation.mp4";
        Uri vidUri = Uri.parse(vidAddress);
        videoView.setMediaController(mediaController);
        videoView.setVideoURI(vidUri);
        videoView.start();
    }

}
