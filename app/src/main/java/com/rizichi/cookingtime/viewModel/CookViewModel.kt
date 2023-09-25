package com.rizichi.cookingtime.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.rizichi.cookingtime.model.FoodList


class CookViewModel : ViewModel() {


    val foodList=FoodList()

    var i= MutableLiveData<Int>()
    var imgAd=MutableLiveData<Int>()
    var fName=MutableLiveData<String>()
    var cTime=MutableLiveData<Int>()
    init {
        i.value=0
    }

    fun syncData(i : Int){
        imgAd.value=foodList.getfood(i).pic
        fName.value=foodList.getfood(i).name
        cTime.value=foodList.getfood(i).time
    }

    fun img():LiveData<Int>{
        return imgAd
    }
    fun name():LiveData<String>{
        return fName
    }
    fun time():LiveData<Int>{
        return cTime
    }




}