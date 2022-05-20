package com.example.ebay.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.a551kotlin.Watch
import com.example.a552kotlin.R


class Market_adapter_2(var context: Context, var list: ArrayList<Watch>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_horizontal_apple_watch, parent, false)
        return MyView(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val products = list[position]

        if (holder is MyView) {
            holder.imageView.setImageResource(products.productImages)
            holder.textView.text = products.titles
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class MyView(item: View) : RecyclerView.ViewHolder(item) {
        val imageView: ImageView = item.findViewById(R.id.getwatch_image_id)
        val textView: TextView = item.findViewById(R.id.getWatch_text_id)

    }
}