package com.alperenbabagil.eventforlivedata

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData

inline fun <T>LifecycleOwner.observeEvent(eventLiveData: LiveData<Event<T>>, crossinline onEventUnhandledContent: (T) -> Unit) {
    eventLiveData.observeEvent(this,onEventUnhandledContent)
}
