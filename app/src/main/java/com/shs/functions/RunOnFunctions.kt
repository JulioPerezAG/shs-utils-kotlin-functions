package com.shs.functions

import androidx.fragment.app.Fragment

fun Fragment.runOnUiThread(action: Runnable) = activity!!.runOnUiThread(action)
