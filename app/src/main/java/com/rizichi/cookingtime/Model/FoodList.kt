package com.rizichi.cookingtime.Model

import com.rizichi.cookingtime.R

class FoodList {

    init {
        val food= arrayOf<Food>(
            Food("Chicken",R.drawable.chicken,90),
            Food("Fish",R.drawable.fish,45),
            Food("Sheep",R.drawable.sheep,180)
        )
    }
}