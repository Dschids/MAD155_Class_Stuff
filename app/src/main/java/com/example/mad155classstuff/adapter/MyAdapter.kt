package com.example.mad155classstuff.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.mad155classstuff.R
import com.example.mad155classstuff.model.MyModel
import java.util.ArrayList

class MyAdapter(var context: Context, var arrayList: ArrayList<MyModel>) :
        RecyclerView.Adapter<MyAdapter.ItemHolder>()
{
    class ItemHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var icons = itemView.findViewById<ImageView>(R.id.icon_image)
        var txt = itemView.findViewById<TextView>(R.id.txtFile)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.ItemHolder {
        val itemholder = LayoutInflater.from(parent.context)
            .inflate(R.layout.grid_item, parent, false)
        return ItemHolder(itemholder)

    }

    override fun onBindViewHolder(holder: MyAdapter.ItemHolder, position: Int) {
        var myCard : MyModel = arrayList.get(position)

        holder.icons.setImageResource(myCard.iconsCard!!)
        holder.txt.text = myCard.textCard

        holder.txt.setOnClickListener {
            Toast.makeText(context, myCard.textCard, Toast.LENGTH_LONG).show()
        }
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

}