package dev.claucookielabs.pasbuk.common.presentation.utils

import android.util.TypedValue
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import android.widget.ImageView
import coil.api.load
import dev.claucookielabs.pasbuk.R
import java.io.File

fun View.addRipple() = with(TypedValue()) {
    context.theme.resolveAttribute(android.R.attr.selectableItemBackground, this, true)
    setBackgroundResource(resourceId)
}

fun View.addBorderlessRipple() = with(TypedValue()) {
    context.theme.resolveAttribute(android.R.attr.selectableItemBackgroundBorderless, this, true)
    setBackgroundResource(resourceId)
}

fun View.show(shouldShow: Boolean) {
    visibility = if (shouldShow) VISIBLE else GONE
}

fun ImageView.loadImage(url: String) {
    this.load(File(url)) {
        placeholder(R.drawable.ic_android_notif)
    }
}
