package com.fuck.learn.utils

import android.util.Log
import org.json.JSONArray
import org.json.JSONObject

object LogUtils {
    private const val MAX_LOG_LENGTH = 4000
    private const val DEFAULT_TAG = "fuck"

    var defaultTag = DEFAULT_TAG
        set(value) {
            field = value.ifEmpty { DEFAULT_TAG }
        }

    var isLogEnabled = true

    // ========== DEBUG ==========
    fun d(message: String) = d(defaultTag, message)

    fun d(tag: String, message: String) {
        if (!isLogEnabled) return
        logSplit(Log.DEBUG, tag, message)
    }

    // ========== INFO ==========
    fun i(message: String) = i(defaultTag, message)

    fun i(tag: String, message: String) {
        if (!isLogEnabled) return
        logSplit(Log.INFO, tag, message)
    }

    // ========== WARN ==========
    fun w(message: String) = w(defaultTag, message)

    fun w(tag: String, message: String) {
        if (!isLogEnabled) return
        logSplit(Log.WARN, tag, message)
    }

    // ========== ERROR ==========
    fun e(message: String) = e(defaultTag, message)

    fun e(tag: String, message: String) {
        if (!isLogEnabled) return
        logSplit(Log.ERROR, tag, message)
    }

    fun e(message: String, throwable: Throwable) = e(defaultTag, message, throwable)

    fun e(tag: String, message: String, throwable: Throwable) {
        if (!isLogEnabled) return
        logSplit(Log.ERROR, tag, "$message\n${Log.getStackTraceString(throwable)}")
    }

    // ========== VERBOSE ==========
    fun v(message: String) = v(defaultTag, message)

    fun v(tag: String, message: String) {
        if (!isLogEnabled) return
        logSplit(Log.VERBOSE, tag, message)
    }


    private fun logSplit(priority: Int, tag: String, message: String) {
        if (message.length <= MAX_LOG_LENGTH) {
            logDirectly(priority, tag, message)
            return
        }

        val totalParts = (message.length + MAX_LOG_LENGTH - 1) / MAX_LOG_LENGTH
        var startIndex = 0
        var partNumber = 1

        while (startIndex < message.length) {
            val endIndex = (startIndex + MAX_LOG_LENGTH).coerceAtMost(message.length)
            val partMessage = message.substring(startIndex, endIndex)

            val partTag = if (totalParts > 1) {
                String.format("%s [%d/%d]", tag, partNumber, totalParts)
            } else {
                tag
            }

            logDirectly(priority, partTag, partMessage)

            startIndex = endIndex
            partNumber++
        }
    }

    private fun logDirectly(priority: Int, tag: String, message: String) {
        when (priority) {
            Log.VERBOSE -> Log.v(tag, message)
            Log.DEBUG -> Log.d(tag, message)
            Log.INFO -> Log.i(tag, message)
            Log.WARN -> Log.w(tag, message)
            Log.ERROR -> Log.e(tag, message)
            else -> Log.d(tag, message)
        }
    }

    fun json(json: String) = json(defaultTag, json)

    fun json(tag: String, jsonString: String) {
        if (!isLogEnabled) return

        val trimmedJson = jsonString.trim()
        if (trimmedJson.isEmpty()) {
            d(tag, "Empty/Null json content")
            return
        }

        try {
            val formattedJson = when {
                trimmedJson.startsWith("{") -> {
                    JSONObject(trimmedJson).toString(4)
                }
                trimmedJson.startsWith("[") -> {
                    JSONArray(trimmedJson).toString(4)
                }
                else -> {
                    d(tag, "Invalid JSON format: $trimmedJson")
                    return
                }
            }

            d(tag, "╔═══════════════════════════════════════════════════════════════════")
            d(tag, "║ JSON")
            d(tag, "╠═══════════════════════════════════════════════════════════════════")

            val lines = formattedJson.split("\n")
            lines.forEach { line ->
                d(tag, "║ $line")
            }

            d(tag, "╚═══════════════════════════════════════════════════════════════════")

        } catch (e: Exception) {
            d(tag, "Malformed JSON: ${e.message}")
            d(tag, "Original content: $trimmedJson")
        }
    }


    fun separator(title: String = "") = separator(defaultTag, title)

    fun separator(tag: String, title: String) {
        if (!isLogEnabled) return

        val separator = "═══════════════════════════════════════════════════════════════════"
        if (title.isEmpty()) {
            d(tag, separator)
        } else {
            d(tag, "╔$separator")
            d(tag, "║ $title")
            d(tag, "╚$separator")
        }
    }


    fun methodStart(methodName: String) = methodStart(defaultTag, methodName)

    fun methodStart(tag: String, methodName: String) {
        if (!isLogEnabled) return
        d(tag, "┌──▶ $methodName() START")
    }

    fun methodEnd(methodName: String) = methodEnd(defaultTag, methodName)

    fun methodEnd(tag: String, methodName: String) {
        if (!isLogEnabled) return
        d(tag, "└──▶ $methodName() END")
    }


    fun <T> measure(tag: String = defaultTag, message: String, block: () -> T): T {
        val startTime = System.currentTimeMillis()
        val result = block()
        val endTime = System.currentTimeMillis()
        d(tag, "$message - Time: ${endTime - startTime}ms")
        return result
    }
}