package com.example.app_brasilian_birds_assement_fundamentalsofcomputing.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.app_brasilian_birds_assement_fundamentalsofcomputing.R
import kotlinx.android.synthetic.main.activity_share.*

class ActivityShare : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_share)

        val btnCompartilhar = this.findViewById<Button>(R.id.btnCompartilhar)
        btnCompartilhar.setOnClickListener {

            val shareIntent = Intent(Intent.ACTION_SEND)
            shareIntent.setType("text/plain")
            shareIntent.putExtra(Intent.EXTRA_TEXT, txtTexto.text.toString())
            val title = "Selecione uma opção de compartilhamento"
            val chooser = Intent.createChooser(shareIntent, title)

            if (shareIntent.resolveActivity(packageManager) != null)

                this.startActivity(chooser)


        }
    }
}
