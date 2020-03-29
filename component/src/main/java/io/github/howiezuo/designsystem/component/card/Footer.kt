package io.github.howiezuo.designsystem.component.card

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import io.github.howiezuo.designsystem.component.R

class Footer @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.dsStyleCardFooter
) : LinearLayout(context, attrs, defStyleAttr) {

    init {
        LayoutInflater.from(getContext()).inflate(R.layout.component_card_footer, this, true)
    }
}
