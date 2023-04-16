package com.example.myclothingapp

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity

class DetailPakaian : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_pakaian)

        val actionBar: ActionBar? = supportActionBar
        actionBar!!.setDisplayHomeAsUpEnabled(true)
        actionBar!!.setDisplayHomeAsUpEnabled(true)

        val gambarPakaian = findViewById<ImageView>(R.id.img_gambar)
        val namaPakaian = findViewById<TextView>(R.id.tv_namapakaian)
        val tipePakaian = findViewById<TextView>(R.id.tv_tipepakaian)
        val lenganPakaian= findViewById<TextView>(R.id.tv_lenganpakaian)
        val ukuranPakaian = findViewById<TextView>(R.id.tv_ukuranpakaian)
        val motifPakaian = findViewById<TextView>(R.id.tv_motifpakaian)
        val hargaPakaian = findViewById<TextView>(R.id.tv_hargapakaian)

        var intent = intent
        val nama = intent.getStringExtra("namapakaian")
        val tipepakaian = intent.getStringExtra("tipe")
        val gambar = intent.getIntExtra("foto", 0)
        val lengan = intent.getStringExtra("lengan")
        val ukuran = intent.getStringExtra("ukuran")
        val motif = intent.getStringExtra("motif")
        val harga = intent.getStringExtra("harga")

        actionBar.setTitle(nama)
        namaPakaian.text = nama
        tipePakaian.text = tipepakaian
        lenganPakaian.text = lengan
        ukuranPakaian.text = ukuran
        motifPakaian.text = motif
        hargaPakaian.text = harga
        gambarPakaian.setImageResource(gambar)

        startActivity(intent)
    }
}