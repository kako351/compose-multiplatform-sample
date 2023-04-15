package repository

import model.Recipe
import com.myapplication.common.MR

class RecipeRepositoryImpl: RecipeRepository{
    override fun getRecipes(): List<Recipe> {
        return listOf(
            Recipe(
                title = "焼きそば",
                resource = MR.images.recipe1
            ),
            Recipe(
                title = "ハンバーガー",
                resource = MR.images.recipe2
            ),
            Recipe(
                title = "鶏チャーシュー",
                resource = MR.images.recipe3
            ),
            Recipe(
                title = "豚丼",
                resource = MR.images.recipe4
            ),
            Recipe(
                title = "山芋ソテー",
                resource = MR.images.recipe5
            ),
            Recipe(
                title = "団子",
                resource = MR.images.recipe6
            ),
            Recipe(
                title = "ラーメン",
                resource = MR.images.recipe7
            ),
            Recipe(
                title = "豚キムチ",
                resource = MR.images.recipe8
            ),
            Recipe(
                title = "唐揚げ",
                resource = MR.images.recipe9
            ),
        )
    }
}