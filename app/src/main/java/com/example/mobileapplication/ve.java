package com.example.mobileapplication;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.net.Uri;
import android.widget.MediaController;
import android.widget.VideoView;

public class ve extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ve);

        // ค้นหา VideoView จาก layout
        VideoView videoView = findViewById(R.id.videoView);
        VideoView videoView1 = findViewById(R.id.videoView1);
        VideoView videoView2 = findViewById(R.id.videoView2);

        // กำหนด URL ของวิดีโอ
        Uri videoUri = Uri.parse("https://videos.pexels.com/video-files/3755473/3755473-uhd_2732_1440_25fps.mp4");
        Uri videoUri1 = Uri.parse("https://videos.pexels.com/video-files/5743177/5743177-uhd_2732_1440_25fps.mp4");
        Uri videoUri2 = Uri.parse("https://videos.pexels.com/video-files/4110390/4110390-uhd_2560_1440_30fps.mp4");

        // เพิ่ม MediaController เพื่อควบคุมวิดีโอ
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.setVideoURI(videoUri);
        videoView.requestFocus();
        videoView.start();

        MediaController mediaController1 = new MediaController(this);
        mediaController1.setAnchorView(videoView1);
        videoView1.setMediaController(mediaController1);
        videoView1.setVideoURI(videoUri1);
        videoView1.requestFocus();
        videoView1.start();

        MediaController mediaController2 = new MediaController(this);
        mediaController2.setAnchorView(videoView2);
        videoView2.setMediaController(mediaController2);
        videoView2.setVideoURI(videoUri2);
        videoView2.requestFocus();
        videoView2.start();
    }
}
