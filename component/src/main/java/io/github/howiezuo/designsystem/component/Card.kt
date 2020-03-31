package io.github.howiezuo.designsystem.component

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageView
import androidx.annotation.DrawableRes
import androidx.constraintlayout.widget.ConstraintLayout
import io.github.howiezuo.designsystem.component.card.Header

class Card @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {

    private val header: Header by lazy {
        findViewById<Header>(R.id.header)
    }

    private val photo: ImageView by lazy {
        findViewById<ImageView>(R.id.photo)
    }

    init {
        LayoutInflater.from(getContext()).inflate(R.layout.component_card, this, true)
    }

    fun setAvatar(@DrawableRes resId: Int) {
        header.setAvatar(resId)
    }

    fun setName(text: CharSequence) {
        header.setName(text)
    }

    fun setPhoto(@DrawableRes resId: Int) {
        photo.setImageResource(resId)
    }
}
