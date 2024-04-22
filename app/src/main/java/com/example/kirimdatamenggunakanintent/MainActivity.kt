package com.example.kirimdatamenggunakanintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var edtNamaLengkap: EditText
    private lateinit var edtNamaPanggilan: EditText
    private lateinit var edtNpm: EditText
    private lateinit var edtAlamat: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMoveWithDataActivity: Button = findViewById(R.id.btn_move_activity_data)
        btnMoveWithDataActivity.setOnClickListener(this)

        edtNamaLengkap = findViewById(R.id.edt_nama_lengkap)
        edtNamaPanggilan = findViewById(R.id.edt_nama_panggilan)
        edtNpm = findViewById(R.id.edt_npm)
        edtAlamat = findViewById(R.id.edt_alamat)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_move_activity_data -> {
                val namalengkapValue=edtNamaLengkap.text.toString()
                val namapanggilanValue=edtNamaPanggilan.text.toString()
                val npmValue=edtNpm.text.toString()
                val alamatValue=edtAlamat.text.toString()
                val hasilPindahActivity = Intent(this@MainActivity, HasilPindahActivity::class.java)

                hasilPindahActivity.putExtra(HasilPindahActivity.EXTRA_NAMALENGKAP,
                    namalengkapValue)
                hasilPindahActivity.putExtra(HasilPindahActivity.EXTRA_NAMAPANGGILAN,
                    namapanggilanValue)
                hasilPindahActivity.putExtra(HasilPindahActivity.EXTRA_NPM,
                    npmValue)
                hasilPindahActivity.putExtra(HasilPindahActivity.EXTRA_ALAMAT,
                    alamatValue)
                startActivity(hasilPindahActivity)
            }
        }
    }
}
