package com.example.app_brasilian_birds_assement_fundamentalsofcomputing

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.view.view.*


class Adapter(var bird:List<BirdsData>):RecyclerView.Adapter<Adapter.myViewHolder>(){

    class myViewHolder(view:View):RecyclerView.ViewHolder(view){


        var title: TextView = view.txtTitle
        var birdImg: ImageView = view.bird_img
        var feature: TextView = view.txtFeature
        var curiosity: TextView = view.txtCuriosity

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {

        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.view,parent,false)

        return myViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: myViewHolder, position: Int) {

        var dummyImage: Int? = null

        holder.itemView.setOnClickListener {

            val intent = Intent(holder.itemView.context,BirdDetails::class.java)

            intent.putExtra("bird",bird[position])
            intent.putExtra("birdImage",dummyImage)
            holder.itemView.context.startActivity(intent)

        }

        holder.title.text=bird[position].title

        holder.curiosity.text= bird[position].curiosity

        holder.feature.text=bird[position].feature

        when(bird[position].title!!.toLowerCase()){

            "papagaio"->{
                dummyImage= R.drawable.papagaio
            }

            "tucano"->{
                dummyImage=R.drawable.tuc_view

            }

            "arara"->{
                dummyImage=R.drawable.azul
            }

            "beija-flor"->{
                dummyImage=R.drawable.beijaflor
            }

        }

            holder.birdImg.setImageResource(dummyImage!!)

        }

    override fun getItemCount(): Int {


        return bird.size

    }

}



