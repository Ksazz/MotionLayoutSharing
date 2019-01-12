package com.example.alex.motionlayoutsharing.viewpager


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.example.alex.motionlayoutsharing.R
import kotlinx.android.synthetic.main.fragment_view_pager.view.*
import kotlinx.android.synthetic.main.view_pager_motion.view.*

class FragmentViewPager : Fragment() {

    lateinit var rootView: View


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        rootView = inflater.inflate(R.layout.fragment_view_pager, container, false)
        setupViewPager()
        return rootView
    }

    private fun setupViewPager() {
        rootView.apply {
            this.view_pager.adapter = ViewPagerAdapter(requireContext(), requireFragmentManager())
            this.view_pager.currentItem = 0
            this.motionLayout.let {
                this.view_pager.addOnPageChangeListener(it as ViewPager.OnPageChangeListener)
            }
        }
    }
}