package com.example.android4a.presentation.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.android4a.R
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.item_and_version.view.*

class AndVersionAdapter(val items: Array<AndVersion>) : RecyclerView.Adapter<AndVersionAdapter.ViewHolder>() {

    override fun getItemCount(): Int = items.size
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val lineView = LayoutInflater.from(parent.context).inflate(R.layout.item_and_version, parent, false)
        return ViewHolder(lineView)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindAndVersion(items[position])
    }

    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view), LayoutContainer {
        override val containerView: View?
            get() = itemView
        fun bindAndVersion(andVersion: AndVersion) {
            with(andVersion) {
                itemView.andVersionTxt.text = "$name"
            }
        }
    }
}

