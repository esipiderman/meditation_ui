package com.example.meditationui

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Path
import kotlin.math.abs

fun Path.standardQuadFromTo(from:Offset, to:Offset){
    quadraticBezierTo(
        from.x,
        from.y,
        abs(to.x + from.x) / 2f,
        abs(to.y + from.y) / 2f
    )
}