package com.example.a552kotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter_Tools(var context: Context, var list: ArrayList<Tools>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.tools_view, parent, false)
        return MyViewProduct(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val tools = list[position]

        if (holder is MyViewProduct) {
            holder.imageView.setImageResource(tools.image)
            holder.title.text = tools.title

        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class MyViewProduct(item: View) : RecyclerView.ViewHolder(item) {
        val imageView: ImageView = item.findViewById(R.id.shape_image_id)
        val title: TextView = item.findViewById(R.id.tools_text_id)


    }

}