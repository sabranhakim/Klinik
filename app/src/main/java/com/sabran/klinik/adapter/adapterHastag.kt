package com.sabran.klinik.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.sabran.klinik.PageDisplayList
import com.sabran.klinik.R
import com.sabran.klinik.model.modelHastag

class adapterHastag(
    val itemList: ArrayList<modelHastag>,
    val getActivity : PageDisplayList
):RecyclerView.Adapter<adapterHastag.MyViewHolder>()
{
    class MyViewHolder (itemView: View):RecyclerView.ViewHolder(itemView) {
        var itemHastag : TextView

        init {
            itemHastag = itemView.findViewById(R.id.txtHastag) as TextView
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item_hastag, parent,false)
        return MyViewHolder(nView)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemHastag.setText(itemList[position].hastag)
    }

}