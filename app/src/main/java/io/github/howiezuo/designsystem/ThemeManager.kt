package io.github.howiezuo.designsystem

import android.app.Activity

object ThemeManager {

    fun setThemeOverlay(activity: Activity) {
        // change to R.style.AppTheme_Another to check the different theme
        val theme = R.style.AppTheme

        activity.setTheme(theme)
    }
}
