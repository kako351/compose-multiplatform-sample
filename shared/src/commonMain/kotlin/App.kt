import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
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
import view.GridList

@OptIn(ExperimentalResourceApi::class)
@Composable
fun App() {
    MaterialTheme {
        val recipes = RecipeRepositoryImpl().getRecipes()
        Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            GridList(recipes)
        }
    }
}

expect fun getPlatformName(): String