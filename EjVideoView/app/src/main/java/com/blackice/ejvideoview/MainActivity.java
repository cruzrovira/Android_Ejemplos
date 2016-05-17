package com.blackice.ejvideoview;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        videoView = (VideoView) findViewById(R.id.video);
        String path ="android.resourrce://" + getPackageCodePath() + " /"+ R.raw.small;
        videoView.setVideoURI(Uri.parse(path));
        videoView.setMediaController(new MediaController(this));
        videoView.se
        videoView.start();
        /*
        cuando el video es en linea
        Uri uri = Uri.parse("http://techslides.com/demos/sample-videos/small.mp4");
        videoView.setMediaController(new MediaController(this));
        videoView.requestFocus();
        videoView.setVideoURI(uri);
        videoView.start();*/


    }
}
