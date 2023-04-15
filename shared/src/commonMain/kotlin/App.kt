import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import model.Recipe
import org.jetbrains.compose.resources.ExperimentalResourceApi
import com.myapplication.common.MR
import repository.RecipeRepositoryImpl
import style.MyTheme
import view.GridList

@OptIn(ExperimentalResourceApi::class)
@Composable
fun App() {
    MyTheme {
        val recipes = RecipeRepositoryImpl().getRecipes()
        Scaffold(
            topBar = {
                TopAppBar(
                    title = { Text(text = "Recipe Album") },
                )
            },
            floatingActionButton = {
                FloatingActionButton(onClick = { /*TODO*/ }) {
                    Icon(
                        Icons.Default.Favorite,
                        contentDescription = "Favorite"
                    )
                }
            },
            content = {
                GridList(recipes)
            }
        )
    }
}

expect fun getPlatformName(): String