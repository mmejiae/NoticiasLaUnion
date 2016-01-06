package com.example.usercimd.practicando2;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.MediaController;
import android.widget.VideoView;

public class Noticia2Entretenimiento extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noticia2_entretenimiento);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        VideoView videoView = (VideoView) findViewById(R.id.video2);
        MediaController mediaController=new MediaController(this);
        mediaController.setPadding(0,0,0,350);
        String vidAddress = "https://ia601507.us.archive.org/32/items/union2/union2.mp4";
        Uri vidUri = Uri.parse(vidAddress);
        videoView.setMediaController(mediaController);
        videoView.setVideoURI(vidUri);
        videoView.start();


    }
}
