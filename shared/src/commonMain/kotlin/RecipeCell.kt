import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import model.Recipe
import org.jetbrains.compose.resources.ExperimentalResourceApi
import com.myapplication.common.MR
import dev.icerock.moko.resources.compose.painterResource

@Composable
fun RecipeCell(
    modifier: Modifier = Modifier,
    recipe: Recipe
) {
    Box(modifier) {
        Image(
            painter = painterResource(recipe.resource),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxWidth().aspectRatio(1f)
        )
        Column(modifier = Modifier
            .fillMaxWidth()
            .align(Alignment.BottomCenter)
            .background(
                Brush.verticalGradient(
                    colors = listOf(
                        Color.Transparent,
                        Color(0x80000000)
                    )
                )
            )
            .padding(vertical = 16.dp, horizontal = 8.dp)
        ) {
            Text(
                text = recipe.title,
                style = TextStyle(color = Color.White, fontSize = 18.sp, fontWeight = FontWeight.Bold)
            )
        }
    }
}

