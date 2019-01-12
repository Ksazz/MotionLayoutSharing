package com.example.alex.motionlayoutsharing.menumotion

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.fragment.app.Fragment
import com.example.alex.motionlayoutsharing.R
import kotlinx.android.synthetic.main.fragment_menu_motion.*

class FragmentMenuMotion : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_menu_motion, container, false)


    }

    override fun onResume() {
        super.onResume()
        motion_plus_view.setOnClickListener {
            if (motionView.currentState == R.id.end) {
                motionView.transitionToStart()
            } else {
                motionView.transitionToEnd()
            }
        }
        motion_item_one.setOnClickListener {
            Toast.makeText(requireContext(), "star", Toast.LENGTH_SHORT).show()
        }
        motion_item_two.setOnClickListener {
            Toast.makeText(requireContext(), "check", Toast.LENGTH_SHORT).show()
        }
        motion_item_three.setOnClickListener {
            Toast.makeText(requireContext(), "help", Toast.LENGTH_SHORT).show()
        }
        motionView.setTransitionListener(object : MotionLayout.TransitionListener {
            override fun onTransitionTrigger(p0: MotionLayout?, p1: Int, p2: Boolean, p3: Float) {
            }

            override fun onTransitionStarted(p0: MotionLayout?, p1: Int, p2: Int) {
            }

            override fun onTransitionChange(p0: MotionLayout?, p1: Int, p2: Int, p3: Float) {
            }

            override fun onTransitionCompleted(p0: MotionLayout?, p1: Int) {
                Toast.makeText(requireContext(), motionView.progress.toString(), Toast.LENGTH_SHORT).show()

            }

        })


    }
}