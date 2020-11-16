package com.e.praktikum5

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.kontak_list.view.*

class Adapter (val resepItemList: List<Data>, val clickListener: (Data) -> Unit) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.kontak_list, parent, false)
        return PartViewHolder(view)
    }
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as PartViewHolder).bind(resepItemList[position], clickListener)
    }

    override fun getItemCount() = resepItemList.size

    class PartViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(fak: Data, clickListener: (Data) -> Unit) {
            itemView.nama.text = fak.namakontak.toString()
            itemView.nomor.text = fak.desckontak.toString()

            itemView.setOnClickListener{clickListener(fak)}
        }
    }
}