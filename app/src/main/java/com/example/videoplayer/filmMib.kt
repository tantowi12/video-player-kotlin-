package com.example.videoplayer

import android.net.Uri
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity

class filmMib : AppCompatActivity() {

    private lateinit var videoView: VideoView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_film_mib)

        val mediaController = MediaController(this)

        videoView = findViewById(R.id.film2)
        videoView.setMediaController(mediaController)
        mediaController.setAnchorView(videoView)

        val uri = Uri.parse("https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ElephantsDream.mp4")
        videoView.setVideoURI(uri)
        videoView.start()
    }
}