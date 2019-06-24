package com.santosh.cookingquest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.motion.widget.MotionLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var currentImagePosition = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listOfImages = listOf("image_1", "image_2", "image_3")


//        motion_root.setTransitionListener(object : MotionLayout.TransitionListener {
//            override fun onTransitionTrigger(motionLayout: MotionLayout?, startId: Int, endId: Boolean, progress: Float) {
//
//            }
//
//            override fun onTransitionStarted(motionLayout: MotionLayout?, startId: Int, endId: Int) {
////                val swipeUpId = R.id.swipe_up as Int
////                val swipeDownId = R.id.swipe_down as Int
////
////                if (endId == swipeUpId) {
////                    val message = "Swiping up"
////                }
////                if (endId == swipeDownId) {
////                    val message = "Swiping down"
////                }
////                val imageViewId = R.id.imageView as Int
//            }
//
//            override fun onTransitionChange(motionLayout: MotionLayout?, startId: Int, endId: Int, progress: Float) {
//
//            }
//
//            override fun onTransitionCompleted(motionLayout: MotionLayout?, currentId: Int) {
//                val swipeUpId = R.id.swipe_up as Int
//                //val swipeDownId = R.id.swipe_down as Int
//
//
//                if (currentId == swipeUpId) {
//                    val message = "Swiped up"
//                }
//
////                if (currentId == swipeDownId) {
////                    val message = "Swiped down"
////                }
//            }
//        })
    }
}
