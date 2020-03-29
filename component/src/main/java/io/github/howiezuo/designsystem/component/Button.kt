package io.github.howiezuo.designsystem.component

import android.content.Context
import android.util.AttributeSet
import com.google.android.material.button.MaterialButton

class Button @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.dsStylePrimaryButton
) : MaterialButton(context, attrs, defStyleAttr)
