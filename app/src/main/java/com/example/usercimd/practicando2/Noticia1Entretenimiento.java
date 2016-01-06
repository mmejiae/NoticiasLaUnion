package com.example.usercimd.practicando2;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.provider.MediaStore;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class Noticia1Entretenimiento extends ActionBarActivity  {
private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noticia1_entretenimiento);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final VideoView videoView = (VideoView) findViewById(R.id.video1);
        MediaController mediaController = new MediaController(this);
        mediaController.setPadding(0, 0, 0, 350);
        videoView.setMediaController(mediaController);

        String vidAddress = "https://ia801501.us.archive.org/9/items/Union1/Union1.mp4";
        Uri vidUri = Uri.parse(vidAddress);
        videoView.setVideoURI(vidUri);
        videoView.seekTo(1);
        videoView.setOnClickListener(new View.OnClickListener()
        {
            @Override
        public void onClick(View view)
            {videoView.start();
            videoView.requestFocus();
            }
        });
    }
}
