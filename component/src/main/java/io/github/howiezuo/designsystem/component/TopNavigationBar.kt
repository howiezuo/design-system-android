package io.github.howiezuo.designsystem.component

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.TextView
import com.google.android.material.appbar.MaterialToolbar

class TopNavigationBar @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.dsStyleTopNavigation
) : MaterialToolbar(context, attrs, defStyleAttr) {

    private val title: TextView by lazy {
        findViewById<TextView>(R.id.title)
    }

    init {
        LayoutInflater.from(getContext())
            .inflate(R.layout.component_top_navigation_bar, this, true)

        context.obtainStyledAttributes(attrs, R.styleable.TopNavigationBar).run {
            title.text = getText(R.styleable.TopNavigationBar_dsTitle)
            recycle()
        }
    }
}
