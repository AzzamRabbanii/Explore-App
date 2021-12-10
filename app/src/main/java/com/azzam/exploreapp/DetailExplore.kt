package com.azzam.exploreapp

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
class DetailExplore (
    var title: String?,
    var location: String,
    var description: String?,
    var photo: String?
    ):Parcelable

