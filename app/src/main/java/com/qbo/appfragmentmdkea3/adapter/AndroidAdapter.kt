package com.qbo.appfragmentmdkea3.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.qbo.appfragmentmdkea3.R
import com.qbo.appfragmentmdkea3.model.Android

class AndroidAdapter(private var lstandroid: List<Android>)
    : RecyclerView.Adapter<AndroidAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val ivandroid: ImageView = itemView.findViewById(R.id.ivandroid)
        val tvnomandroid: TextView = itemView.findViewById(R.id.tvnomandroid)
        val tvversionandroid: TextView = itemView.findViewById(R.id.tvversionandroid)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AndroidAdapter.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.item_android, parent, false))
    }
    override fun onBindViewHolder(holder: AndroidAdapter.ViewHolder, position: Int) {
        val itemAndroid = lstandroid[position]
        holder.tvnomandroid.text = itemAndroid.nombre
        holder.tvversionandroid.text = itemAndroid.version
        holder.ivandroid.setImageResource(itemAndroid.imagen)
    }
    override fun getItemCount(): Int {
        return lstandroid.size
    }

}