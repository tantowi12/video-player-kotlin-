package com.example.videoplayer

import android.net.Uri
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity

class filmMisson : AppCompatActivity() {

    private lateinit var videoView: VideoView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_film_misson)

        val mediaController = MediaController(this)

        videoView = findViewById<VideoView>(R.id.film1)
        videoView.setMediaController(mediaController)
        mediaController.setAnchorView(videoView)

        val uri =
            Uri.parse("https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ElephantsDream.mp4")
        videoView.setVideoURI(uri)
        videoView.start()
    }
}