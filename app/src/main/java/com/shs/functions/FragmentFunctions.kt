package com.shs.functions

import androidx.annotation.NonNull
import androidx.fragment.app.Fragment

fun Fragment.getSystemService(@NonNull systemName: String) = context!!
    .getSystemService(systemName)

fun <T> Fragment.getSystemService(@NonNull serviceClass: Class<T>): T? = context!!
    .getSystemService(serviceClass)
