package org.greenstand.android.TreeTracker.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import org.greenstand.android.TreeTracker.BuildConfig

@Parcelize
data class TreeAttributes(val heightColor: TreeColor,
                          val appFlavor: String = BuildConfig.FLAVOR,
                          val appBuild: String = BuildConfig.VERSION_NAME): Parcelable