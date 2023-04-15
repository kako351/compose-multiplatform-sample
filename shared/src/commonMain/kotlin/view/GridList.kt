package view

import RecipeCell
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import model.Recipe

@Composable
fun GridList(recipes: List<Recipe>) {
    LazyVerticalGrid(columns = GridCells.Fixed(2)) {
        items(recipes.size) { index ->
            RecipeCell(recipe = recipes[index])
        }
    }
}