package repository

import data.Recipe

class RecipeRepository {
    fun getRecipes() = listOf(
        Recipe(
            "豚肉のコクとごぼうの香り、野菜の甘みで奥行きのある味わい。",
            "https://cooking-records.ex.oishi-kenko.com/images/1.jpg",
            "soup",
            "2018-05-01 17:57:31"
        ),
        Recipe(
            "やわらかな豚肉、プリプリのえびといかのうまみが麺にもしっかりしみて、後引くおいしさ。",
            "https://cooking-records.ex.oishi-kenko.com/images/2.jpg",
            "main_dish",
            "2018-05-01 17:57:31"
        ),
        Recipe(
            "帆立のうまみと白菜の甘みをしみ込ませたやさしい味。",
            "https://cooking-records.ex.oishi-kenko.com/images/3.jpg",
            "main_dish",
            "2018-05-01 17:57:31"
        ),
        Recipe(
            "ふっくらと蒸されたあさりのうまみを味わいます。",
            "https://cooking-records.ex.oishi-kenko.com/images/4.jpg",
            "main_dish",
            "2018-05-01 17:57:31"
        ),
        Recipe(
            "いんげんは揚げるとやわらかく、歯ざわりもよくなります。",
            "https://cooking-records.ex.oishi-kenko.com/images/5.jpg",
            "side_dish",
            "2018-05-01 17:57:31"
        ),
        Recipe(
            "こっくりとした味わいです。",
            "https://cooking-records.ex.oishi-kenko.com/images/6.jpg",
            "side_dish",
            "2018-05-01 17:57:31"
        ),
    )
}