package com.example.alex.motionlayoutsharing

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View =
        inflater.inflate(R.layout.fragment_main, container, false)

    override fun onResume() {
        super.onResume()
        setListeners()
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

    }
}
