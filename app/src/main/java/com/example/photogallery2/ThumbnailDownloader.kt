package com.example.photogallery2

import android.os.HandlerThread
import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

private const val TAG = "ThumbnailDownloader"
private const val MESSAGE_DOWNLOAD = 0

class ThumbnailDownloader<in T>: HandlerThread(TAG), LifecycleObserver {
    private var hasQuit = false

    override fun quit(): Boolean {
        hasQuit = true
        return super.quit()
    }


    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun setup() {
        Log.i(TAG, "Starting background thread")
        start()
        looper
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun tearDown() {
        Log.i(TAG,"Destroying background thread")
        quit()
    }


    fun queueThumbnail(target: T, url: String) {
        Log.i(TAG,"Got a URL: $url")
    }
}
