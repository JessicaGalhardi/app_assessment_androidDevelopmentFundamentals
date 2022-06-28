package com.example.app_brasilian_birds_assement_fundamentalsofcomputing.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.app_brasilian_birds_assement_fundamentalsofcomputing.Adapter
import com.example.app_brasilian_birds_assement_fundamentalsofcomputing.R
import com.example.app_brasilian_birds_assement_fundamentalsofcomputing.databinding.ActivityMainBinding
import com.example.app_brasilian_birds_assement_fundamentalsofcomputing.setData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            window.decorView.apply { systemUiVisibility=
                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_FULLSCREEN }

            val my_recycler= findViewById<RecyclerView>(R.id.recycler_main)
            my_recycler.adapter= Adapter(setData.SetBirds())
            my_recycler.layoutManager= LinearLayoutManager(this)


        }
    }





