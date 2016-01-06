package com.example.usercimd.practicando2;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SurfaceHolder;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.MediaController;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.VideoView;
import android.view.View.OnClickListener;

public class VideosEntretenimiento extends ActionBarActivity {
    VideoView video1;
    private Button boton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos_entretenimiento);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

           }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);


    }


    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main_drawer, menu);
        return true;
    }
    public void noticia1(View view){
        Intent act=new Intent(this,Noticia1Entretenimiento.class);
        startActivity(act);
    }
    public void noticia2(View view){
        Intent act=new Intent(this,Noticia2Entretenimiento.class);
        startActivity(act);
    }
    public void noticia3(View view){
        Intent act=new Intent(this,Noticia3Entretenimiento.class);
        startActivity(act);
    }
    public void noticia4(View view){
        Intent act=new Intent(this,Noticia4Entretenimiento.class);
        startActivity(act);
    }
}

