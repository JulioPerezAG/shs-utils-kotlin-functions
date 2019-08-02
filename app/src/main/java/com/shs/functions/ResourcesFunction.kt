package com.shs.functions

import android.app.Activity
import android.content.res.Resources.NotFoundException
import androidx.annotation.ArrayRes
import androidx.annotation.IntegerRes
import androidx.fragment.app.Fragment

fun Activity.getInteger(@IntegerRes idRes: Int, defaultInt: Int = 0): Int = try {
    resources.getInteger(idRes)
} catch (e: NotFoundException) {
    defaultInt
}

fun Fragment.getStringArray(
    @ArrayRes idRes: Int,
    defaultStringArray: Array<String> = emptyArray()
): Array<String> = try {
    resources.getStringArray(idRes)
} catch (e: NotFoundException) {
    defaultStringArray
}
