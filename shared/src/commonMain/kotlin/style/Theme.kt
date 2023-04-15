package style

import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color


@Composable
fun MyTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colors = lightColors,
        content = content
    )
}