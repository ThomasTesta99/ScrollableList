package com.example.scrollablelist.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Entertainment(
    @StringRes val titleResourceId: Int,
    @DrawableRes val imageResourceId: Int,
    @StringRes val descriptionResourceId: Int,
)
