package com.example.kirimdatamenggunakanintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HasilPindahActivity : AppCompatActivity() {
    companion object{
        const val EXTRA_NAMALENGKAP = "extra_namalengkap"
        const val EXTRA_NAMAPANGGILAN = "extra_namapanggilan"
        const val EXTRA_NPM = "extra_npm"
        const val EXTRA_ALAMAT = "extra_alamat"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hasil_pindah)

        val tvDataNamaLengkap: TextView = findViewById(R.id.tv_data_nama_lengkap)
        val tvDataNamaPanggilan: TextView = findViewById(R.id.tv_data_nama_panggilan)
        val tvDataNPM: TextView = findViewById(R.id.tv_data_npm)
        val tvDataAlamat: TextView = findViewById(R.id.tv_data_alamat)

        val namalengkap=intent.getStringExtra(EXTRA_NAMALENGKAP)
        val namapanggilan=intent.getStringExtra(EXTRA_NAMAPANGGILAN)
        val npm=intent.getStringExtra(EXTRA_NPM)
        val alamat=intent.getStringExtra(EXTRA_ALAMAT)

        tvDataNamaLengkap.text = namalengkap
        tvDataNamaPanggilan.text = namapanggilan
        tvDataNPM.text = npm
        tvDataAlamat.text = alamat
    }
}