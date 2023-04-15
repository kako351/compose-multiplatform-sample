package repository

import model.Recipe

interface RecipeRepository {
    fun getRecipes(): List<Recipe>
}