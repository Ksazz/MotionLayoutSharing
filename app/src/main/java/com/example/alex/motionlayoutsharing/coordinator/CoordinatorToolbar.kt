package com.example.alex.motionlayoutsharing.coordinator

import android.content.Context
import android.util.AttributeSet
import androidx.constraintlayout.motion.widget.MotionLayout
import com.google.android.material.appbar.AppBarLayout

class CoordinatorToolbar : MotionLayout, AppBarLayout.OnOffsetChangedListener {

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    override fun onOffsetChanged(appBarLayout: AppBarLayout?, verticalOffset: Int) {
        appBarLayout?.let {
            progress = (-verticalOffset).toFloat() / it.totalScrollRange
        }
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        val parent = this.parent
        if (parent is AppBarLayout) {
            parent.addOnOffsetChangedListener(this)
        }
    }
}