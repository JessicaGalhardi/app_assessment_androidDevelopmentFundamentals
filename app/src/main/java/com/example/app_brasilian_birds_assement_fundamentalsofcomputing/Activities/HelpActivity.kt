package com.example.app_brasilian_birds_assement_fundamentalsofcomputing.Activities

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.app_brasilian_birds_assement_fundamentalsofcomputing.R
import com.example.app_brasilian_birds_assement_fundamentalsofcomputing.TestViewModel
import kotlinx.android.synthetic.main.activity_help.*


class HelpActivity : AppCompatActivity() {

    lateinit var viewModel: TestViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_help)

        viewModel = ViewModelProvider(this).get(TestViewModel::class.java)

        viewModel.currentNumber.observe(this, Observer {
            tv_textView.text= it.toString()
        })


        incrementText()
        }


    private fun incrementText() {
        btn_button.setOnClickListener {
            viewModel.currentNumber.value = ++ viewModel.number

            Toast.makeText(this,"No transporte, 90% morrem! Não ajude no aumento desses números!",Toast.LENGTH_LONG).show()


        }

    }
}


