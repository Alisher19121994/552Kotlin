package com.example.ebay.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.a551kotlin.Products
import com.example.a552kotlin.R


class AdapterMarket(var context: Context, var list: ArrayList<Products>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_horizontal_homew, parent, false)
        return MyViewProduct(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val rooms = list[position]

        if (holder is MyViewProduct) {
            holder.imageView.setImageResource(rooms.productImage)
            holder.title.text = rooms.title
            holder.price.text = rooms.price
            holder.discount.text = rooms.discount
        }
    }
    override fun getItemCount(): Int {
        return list.size
    }
    inner class MyViewProduct(item: View) : RecyclerView.ViewHolder(item) {
        val imageView: ImageView = item.findViewById(R.id.watch_id)
        val title: TextView = item.findViewById(R.id.Watch_text_id)
        val price: TextView = item.findViewById(R.id.watch_price_id)
        val discount: TextView = item.findViewById(R.id.watch_discount_id)

    }

}