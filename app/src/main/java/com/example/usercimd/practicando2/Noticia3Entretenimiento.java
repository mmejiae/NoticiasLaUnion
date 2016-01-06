package com.example.usercimd.practicando2;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.MediaController;
import android.widget.VideoView;

public class Noticia3Entretenimiento extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noticia3_entretenimiento);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        VideoView videoView = (VideoView) findViewById(R.id.video3);
        MediaController mediaController=new MediaController(this);
        mediaController.setPadding(0,0,0,350);
        String vidAddress = "https://ia601507.us.archive.org/7/items/Union3/Union3.mp4";
        Uri vidUri = Uri.parse(vidAddress);
        videoView.setMediaController(mediaController);
        videoView.setVideoURI(vidUri);
        videoView.start();

    }
}
