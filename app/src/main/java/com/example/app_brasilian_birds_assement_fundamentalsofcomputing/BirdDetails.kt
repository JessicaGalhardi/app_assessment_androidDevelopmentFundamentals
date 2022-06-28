package com.example.app_brasilian_birds_assement_fundamentalsofcomputing


import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.app_brasilian_birds_assement_fundamentalsofcomputing.Activities.FinalActivity1
import kotlinx.android.synthetic.main.activity_bird_details.*


class BirdDetails : AppCompatActivity() {

    private lateinit var obj: BirdsData
    private var birdImage: Int?= null


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bird_details)

        window.decorView.apply {
            systemUiVisibility =
                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_FULLSCREEN
        }

        obj = intent.getParcelableExtra("bird")!!
        birdImage = intent.getIntExtra("birdImage", -1)

        setData(obj, birdImage!!)

        }



    private fun setData(obj: BirdsData, birdImage: Int) {

        txtTitle_info.text= obj.title
        txtFeature_info.text= obj.feature
        txtCuriosity_info.text= obj.curiosity
        overview_info.text= obj.overview
        birdImage_info.setImageResource(birdImage)

    }



}



