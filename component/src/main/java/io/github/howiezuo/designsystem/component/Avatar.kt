package io.github.howiezuo.designsystem.component

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatImageView

class Avatar @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.dsStyleAvatarMedium
) : AppCompatImageView(context, attrs, defStyleAttr) {

    init {
        // make the image be clipped by circle background
        clipToOutline = true
    }
}
