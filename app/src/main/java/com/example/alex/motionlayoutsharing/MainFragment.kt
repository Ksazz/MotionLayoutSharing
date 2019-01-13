package com.example.alex.motionlayoutsharing

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_main.*
import kotlinx.android.synthetic.main.fragment_main.view.*

class MainFragment : Fragment() {

    private lateinit var rootView: View

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        rootView = inflater.inflate(R.layout.fragment_main, container, false)
        return rootView
    }

    override fun onResume() {
        super.onResume()
        goAnimation()
        setListeners()
    }

    private fun goAnimation() {
        rootView.home_motion_layout.apply {
            this.setTransitionListener(object : MotionLayout.TransitionListener {
                override fun onTransitionStarted(p0: MotionLayout?, p1: Int, p2: Int) {
                }

                override fun onTransitionChange(p0: MotionLayout?, p1: Int, p2: Int, p3: Float) {
                }

                override fun onTransitionCompleted(p0: MotionLayout?, p1: Int) {
                    if (home_motion_layout.currentState == R.id.end) {
                        home_motion_layout.transitionToStart()
                    } else {
                        home_motion_layout.transitionToEnd()
                    }
                }

                override fun onTransitionTrigger(p0: MotionLayout?, p1: Int, p2: Boolean, p3: Float) {
                }
            })
            this.transitionToEnd()
        }

    }

    private fun setListeners() {
        btn_simple_motion.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_mainFragment_to_left_right_motion)
        )
        btn_rotate_motion.setOnClickListener(
            Navigation
                .createNavigateOnClickListener(R.id.action_mainFragment_to_fragmentMotionRotateColour)
        )
        btn_image_filter.setOnClickListener(
            Navigation
                .createNavigateOnClickListener(R.id.action_mainFragment_to_fragmentImageFilter)
        )
        btn_key_frames.setOnClickListener(
            Navigation
                .createNavigateOnClickListener(R.id.action_mainFragment_to_fragmentKeyFrames)
        )
        btn_switch.setOnClickListener(
            Navigation
                .createNavigateOnClickListener(R.id.action_mainFragment_to_fragmentSwitchButtons)
        )
        btn_coordinator.setOnClickListener(
            Navigation
                .createNavigateOnClickListener(R.id.action_mainFragment_to_fragmentCoordinatorMotion)
        )
        btn_pager.setOnClickListener(
            Navigation
                .createNavigateOnClickListener(R.id.action_mainFragment_to_fragmentViewPager)
        )
        btn_menu.setOnClickListener(
            Navigation
                .createNavigateOnClickListener(R.id.action_mainFragment_to_fragmentMenuMotion)
        )

        btn_with_speed.setOnClickListener {
            Toast.makeText(requireContext(), btn_with_speed.text, Toast.LENGTH_SHORT).show()
        }

    }
}
