package com.example.alex.motionlayoutsharing.viewpager

import android.content.Context
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.alex.motionlayoutsharing.R

class ViewPagerAdapter(
    private val context: Context,
    fm: FragmentManager
) : FragmentPagerAdapter(fm) {

    companion object {

        private const val PAGES_COUNT = 3
    }

    override fun getItem(position: Int) = when (position) {
        0 -> FragmentPagerOne()
        1 -> FragmentPagerTwo()
        2 -> FragmentPagerThree()
        else -> throw IllegalArgumentException("Unknown pager item position $position")
    }

    override fun getCount() = PAGES_COUNT

    override fun getPageTitle(position: Int): CharSequence? = when (position) {
        0 -> context.getString(R.string.pager_one_text)
        1 -> context.getString(R.string.pager_two_text)
        2 -> context.getString(R.string.pager_three_text)
        else -> throw IllegalArgumentException("Unknown page title position $position")
    }
}