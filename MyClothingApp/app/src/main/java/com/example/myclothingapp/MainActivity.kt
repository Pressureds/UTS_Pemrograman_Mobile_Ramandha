package com.example.myclothingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rv: RecyclerView = findViewById(R.id.rv)
        rv.layoutManager = LinearLayoutManager(this)

        val listPakaian: List<Pakaian> = listOf(
            Pakaian(
                "Kemeja Polos Panjang H&M",
                "Casual",
                "Panjang",
                "XXL",
                "Polos",
                "Rp120.500",
                R.drawable.bajucoklatkasual),
            Pakaian(
                "Kemeja Pria Peter Slim Fit Elegant",
                "Casual",
                "Panjang",
                "XL",
                "Cetak",
                "Rp65.000",
                R.drawable.kemejakasualblue),
            Pakaian(
                "Moxie Oversize Longsleeve Shirt - Black",
                "Casual",
                "Panjang",
                "XL",
                "Polos",
                "Rp220.000",
                R.drawable.bajuoversizehitam),
            Pakaian(
                "Kemeja Katun Rayon",
                "Formal",
                "Pendek",
                "L",
                "Polos",
                "Rp98.000",
                R.drawable.kemejarayon),
            Pakaian(
                "Kemeja Kantor Pria Slim Fit",
                "Formal",
                "Pendek",
                "XL",
                "Polos",
                "Rp71.000",
                R.drawable.kemejahemabuabu),
            Pakaian(
                "Kemeja Flanel Pria lengan Panjang",
                "Formal",
                "Panjang",
                "M",
                "Kotak-kotak",
                "Rp150.000",
                R.drawable.kemejaflanelkotak),
            Pakaian(
                "Kemeja Pria Vintage Casual Abstark",
                "Casual",
                "Pendek",
                "XXXL",
                "Abstrak",
                "Rp100.000",
                R.drawable.kemejavintage),
            Pakaian(
                "Kemeja Protector Bali",
                "Formal",
                "Pendek",
                "XL",
                "Polos",
                "Rp60.000",
                R.drawable.kemejabali),
            Pakaian(
                "Kemeja Hawai Mathematics Black",
                "Casual",
                "Pendek",
                "XXXL",
                "Print",
                "Rp135.000",
                R.drawable.kemejahawai),
            Pakaian(
                "HipNop JAM Kemeja Pria Slim Fit",
                "Formal",
                "Panjang",
                "XXL",
                "Polos",
                "Rp284.000",
                R.drawable.kemejahipnop),
            Pakaian(
                "Kemeja Pria ZEUS",
                "Formal",
                "Pendek",
                "XL",
                "Polos",
                "Rp72.000",
                R.drawable.kemejazeus),
            Pakaian(
                "Kemeja Polos Warna Coksu",
                "Formal",
                "Pendek",
                "XXXL",
                "Polos",
                "Rp85.000",
                R.drawable.kemejacoksu),
            Pakaian(
                "Kemeja Pria MARTIN HODIE",
                "Casual",
                "Panjang",
                "XXXL",
                "Kotak-kotak",
                "Rp105.000",
                R.drawable.kemejahoodie),
            Pakaian(
                "Kemeja Pria Slim Fit Marshal",
                "Formal",
                "Panjang",
                "XXL",
                "Polos",
                "Rp149.000",
                R.drawable.kemejamarshal),
            Pakaian(
                "Kemeja Casper Man",
                "Casual",
                "Panjang",
                "XXL",
                "Polos",
                "Rp320.000",
                R.drawable.kemejacasper),
        )

        rv.adapter = PakaianAdapter(listPakaian)
    }
}