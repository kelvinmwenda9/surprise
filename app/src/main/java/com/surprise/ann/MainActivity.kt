package com.surprise.ann

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
//    private  var mediaPlayer: MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        mediaPlayer = MediaPlayer.create(this, R.raw.ritwa)
//        mediaPlayer?.setOnPreparedListener{
//            println("Ready to go")
//        }
//
//        imageView.setOnTouchListener{ _, event ->
//            handleTouch(event); true
//        }
    }

//    private fun handleTouch(event: MotionEvent?) {
//        when (event?.action) {
//            MotionEvent.ACTION_DOWN -> {
//                println("down")
//            }
//            MotionEvent.ACTION_CANCEL, MotionEvent.ACTION_UP -> {
//                println("up or cancel")
//            }
//            else -> {
//                println("other")
//            }
//
//
//        }
//    }
}