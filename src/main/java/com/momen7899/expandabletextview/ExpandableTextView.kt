package com.momen7899.expandabletextview

import android.content.Context
import android.util.AttributeSet

class ExpandableTextView :
    androidx.appcompat.widget.AppCompatTextView {


    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)


    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) :
            super(context, attrs, defStyleAttr)


    public fun setExpandable(isExpandable: Boolean) {
        if (isExpandable) {
            expand()
        } else {
            notExpand()
        }
    }

    private fun expand() {
        maxLines = Integer.MAX_VALUE
    }

    private fun notExpand() {
        maxLines = 1
    }


}