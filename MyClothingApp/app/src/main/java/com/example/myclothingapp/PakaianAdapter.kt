package com.example.myclothingapp

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PakaianAdapter(val data: List<Pakaian>) : RecyclerView.Adapter<PakaianAdapter.MyViewHolder>() {

    class MyViewHolder(val row: View) : RecyclerView.ViewHolder(row) {
        val textView1 = row.findViewById<TextView>(R.id.namabaju)
        val textView2 = row.findViewById<TextView>(R.id.tipebaju)
        val imageView = row.findViewById<ImageView>(R.id.image)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.pakaian_item,
            parent, false)
        return MyViewHolder(layout)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.textView1.text = data.get(position).namapakaian
        holder.textView2.text = data.get(position).tipepakaian
        holder.imageView.setImageResource(data.get(position).image)

        holder.itemView.setOnClickListener {
            val context = holder.itemView.context
            val model = data.get(position)
            val gambar: Int = model.image
            val nama : String = model.namapakaian
            val tipepakaian: String = model.tipepakaian
            val lengan = model.lenganpakaian
            val ukuran = model.ukuranpakaian
            val motif = model.motifpakaian
            val harga = model.hargapakaian

            //Intent
            val intent = Intent(context, DetailPakaian::class.java)

            //Putextra
            intent.putExtra("namapakaian", nama)
            intent.putExtra("tipe", tipepakaian)
            intent.putExtra("foto" , gambar)
            intent.putExtra("lengan", lengan)
            intent.putExtra("ukuran", ukuran)
            intent.putExtra("motif", motif)
            intent.putExtra("harga", harga)
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int = data.size
}