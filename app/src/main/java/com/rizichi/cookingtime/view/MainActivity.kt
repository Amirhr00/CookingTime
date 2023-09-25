package com.rizichi.cookingtime.view

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.activity.ComponentActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.rizichi.cookingtime.R
import com.rizichi.cookingtime.databinding.ActivityMainBinding
import com.rizichi.cookingtime.viewModel.CookViewModel

class MainActivity : ComponentActivity() {



    //    Create an Object from ActivityMainBinding to handle the activities view
    lateinit var actv:ActivityMainBinding

    //    Create an Object from ActivityMainBinding to handle the activities data
    lateinit var  cVM:CookViewModel




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //    Declare actv
        actv=DataBindingUtil.setContentView(this, R.layout.activity_main)


        //    Declare cVM
         cVM=ViewModelProvider(this).get(CookViewModel::class.java)

        cVM.i.observe(this, Observer {
            cVM.syncData(it.toInt())
        })

        cVM.img().observe(this, Observer {
            actv.imageView.setImageResource(it.toString().toInt())
        })

        cVM.name().observe(this, Observer {
            actv.FoodN.text=it.toString()
        })

        cVM.time().observe(this, Observer {
            actv.CookT.text="Cooking Time : "+ it.toString().toInt() + " min "
        })


        spinnerSet()



    }


    fun spinnerSet(){

       val foods = resources.getStringArray(R.array.food_names)

        val adapter = ArrayAdapter(this,
            android.R.layout.simple_spinner_item,foods)

        actv.spinner.adapter = adapter


        actv.spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

            cVM.i.value=position

            }

        }

    }

}
