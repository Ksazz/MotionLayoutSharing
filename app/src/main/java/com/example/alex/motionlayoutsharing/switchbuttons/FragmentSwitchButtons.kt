package com.example.alex.motionlayoutsharing.switchbuttons

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.alex.motionlayoutsharing.R
import kotlinx.android.synthetic.main.fragment_switch_buttons.*

class FragmentSwitchButtons : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_switch_buttons, container, false)
    }

    override fun onResume() {
        super.onResume()
        btn_push.setOnClickListener {
            if (motion_layout.currentState == R.id.end) {
                motion_layout.transitionToStart()
            } else {
                motion_layout.transitionToEnd()
            }
        }
        btn_left.setOnClickListener { Toast.makeText(requireContext(), R.string.left, Toast.LENGTH_SHORT).show() }
        btn_right.setOnClickListener { Toast.makeText(requireContext(), R.string.right, Toast.LENGTH_SHORT).show() }
    }
}