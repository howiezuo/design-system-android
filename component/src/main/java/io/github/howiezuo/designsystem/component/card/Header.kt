package io.github.howiezuo.designsystem.component.card

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.TextView
import androidx.annotation.DrawableRes
import io.github.howiezuo.designsystem.component.Avatar
import io.github.howiezuo.designsystem.component.R

class Header @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.dsStyleCardHeader
) : LinearLayout(context, attrs, defStyleAttr) {

    private val avatar: Avatar by lazy {
        findViewById<Avatar>(R.id.avatar)
    }

    private val name: TextView by lazy {
        findViewById<TextView>(R.id.name)
    }

    init {
        LayoutInflater.from(getContext()).inflate(R.layout.component_card_header, this, true)
    }

    fun setAvatar(@DrawableRes resId: Int) {
        avatar.setImageResource(resId)
    }

    fun setName(text: CharSequence) {
        name.text = text
    }
}
