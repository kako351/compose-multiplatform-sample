import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import model.Recipe
import org.jetbrains.compose.resources.ExperimentalResourceApi
import com.myapplication.common.MR
import dev.icerock.moko.resources.compose.painterResource

@OptIn(ExperimentalResourceApi::class)
@Composable
fun RecipeCell(
    modifier: Modifier = Modifier,
    recipe: Recipe
) {
    Column(modifier) {
        Image(
            painter = painterResource(recipe.resource),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxWidth().aspectRatio(1f)
        )
    }
}

