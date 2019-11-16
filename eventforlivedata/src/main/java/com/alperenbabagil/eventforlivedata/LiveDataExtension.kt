package com.alperenbabagil.eventforlivedata

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer

fun<T> LiveData<Event<T>>.observeEvent(owner: LifecycleOwner,onEventUnhandledContent: (T) -> Unit){
    observe(owner,EventObserver<T>(onEventUnhandledContent))
}