import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.graphics.toComposeImageBitmap
import androidx.compose.ui.text.TextStyle
import data.Recipe
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.resource
import org.jetbrains.skia.Image

@OptIn(ExperimentalResourceApi::class)
@Composable
fun RecipeCell(
    modifier: Modifier = Modifier,
    recipe: Recipe
) {
    val painter = remember(recipe) { mutableStateOf<BitmapPainter?>(null) }
    LaunchedEffect(recipe) {
        val resource = resource("./recipe_sample.jpg").readBytes()
        val image = Image.makeFromEncoded(resource).toComposeImageBitmap()
        painter.value = BitmapPainter(image)
    }
    Column(modifier) {
        painter.value?.let {
            Image(
                painter = it,
                contentDescription = null
            )
        }
        Text(
            text = recipe.comment,
            style = TextStyle(color = Color.Black)
        )
    }
}

