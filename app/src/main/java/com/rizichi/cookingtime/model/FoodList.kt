package com.rizichi.cookingtime.model

import com.rizichi.cookingtime.R

class FoodList {

    private val foodl= arrayOf<Food>(
        Food("Chicken",R.drawable.chicken,90),
        Food("Fish",R.drawable.fish,45),
        Food("Sheep",R.drawable.sheep,180)
    )


    fun getfood(i:Int):Food{

        return foodl[i]
    }
}