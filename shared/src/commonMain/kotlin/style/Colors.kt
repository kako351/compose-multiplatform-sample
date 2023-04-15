package style

import androidx.compose.material.Colors
import androidx.compose.ui.graphics.Color

val black = Color(0xFF000000)
val white = Color(0xFFFFFFFF)
val orange300 = Color(0xFFFFB74D)
val orange500 = Color(0xFFFF9800)
val blue500 = Color(0xFF2196F3)
val blue700 = Color(0xFF1976D2)
val red500 = Color(0xFFF44336)

val lightColors = Colors(
    primary = blue500,
    primaryVariant = blue700,
    secondary = orange300,
    secondaryVariant = orange500,
    background = white,
    surface = black,
    onPrimary = white,
    onSecondary = black,
    onBackground = black,
    onSurface = white,
    error = red500,
    onError = black,
    isLight = true
)