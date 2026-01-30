package com.fuck.learn.utils

import java.text.NumberFormat
import java.util.Locale
import kotlin.math.abs

object NumberUtils {
    fun withCommas(number: Number?): String {
        if (number == null) return "0"
        return NumberFormat.getNumberInstance(Locale.US).format(number)
    }

    fun formatToChineseUnits(number: Number?): String {
        if (number == null) return "0"

        val n = number.toLong()

        if (abs(n) < 10000) {
            return n.toString()
        }

        val sign = if (n < 0) "-" else ""
        val absN = abs(n)

        val yi = 100_000_000L
        val wan = 10_000L

        if (absN >= yi) {
            return when {
                absN % yi == 0L ->
                    "$sign${absN / yi}Y"
                absN % (yi / 10) == 0L ->
                    String.format(Locale.US, "%s%.1fY", sign, absN.toDouble() / yi)
                absN % (yi / 100) == 0L ->
                    String.format(Locale.US, "%s%.2fY", sign, absN.toDouble() / yi)
                absN % (yi / 1000) == 0L ->
                    String.format(Locale.US, "%s%.3fY", sign, absN.toDouble() / yi)
                else -> n.toString()
            }
        }

        return when {
            absN % wan == 0L ->
                "$sign${absN / wan}W"
            absN % (wan / 10) == 0L ->
                String.format(Locale.US, "%s%.1fW", sign, absN.toDouble() / wan)
            absN % (wan / 100) == 0L ->
                String.format(Locale.US, "%s%.2fW", sign, absN.toDouble() / wan)
            absN % (wan / 1000) == 0L ->
                String.format(Locale.US, "%s%.3fW", sign, absN.toDouble() / wan)
            else -> n.toString()
        }
    }
}
