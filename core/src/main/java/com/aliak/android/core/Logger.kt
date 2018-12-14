package com.aliak.android.core

interface Logger {
    fun debug(tag: String, message: String)
    fun error(tag: String, message: String?)
    fun error(tag: String, error: Throwable)
    fun warning(tag: String, message: String)
    fun verbose(tag: String, message: String)
}