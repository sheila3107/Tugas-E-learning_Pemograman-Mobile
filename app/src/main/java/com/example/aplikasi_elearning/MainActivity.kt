package com.example.aplikasi_elearning  // Pastikan package name sesuai dengan proyekmu

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var editTextNama: EditText
    private lateinit var editTextTanggal: EditText
    private lateinit var editTextNoMeja: EditText
    private lateinit var editTextNoHP: EditText
    private lateinit var spinnerMenu: Spinner
    private lateinit var buttonPesan: Button
    private lateinit var textViewStatus: TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextNama = findViewById(R.id.editTextNama)
        editTextTanggal = findViewById(R.id.editTextTanggal)
        editTextNoMeja = findViewById(R.id.editTextNoMeja)
        editTextNoHP = findViewById(R.id.editTextNoHP)
        spinnerMenu = findViewById(R.id.spinnerMenu)
        buttonPesan = findViewById(R.id.buttonPesan)
        textViewStatus = findViewById(R.id.textViewStatus)

        // Menambahkan menu ke Spinner
        val adapter = ArrayAdapter.createFromResource(
            this,
            R.array.menu_array,
            android.R.layout.simple_spinner_item
        )
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerMenu.adapter = adapter

        buttonPesan.setOnClickListener {
            val nama = editTextNama.text.toString()
            val tanggal = editTextTanggal.text.toString()
            val noMeja = editTextNoMeja.text.toString()
            val noHP = editTextNoHP.text.toString()
            val menu = spinnerMenu.selectedItem.toString()

            // Logika pemesanan
            textViewStatus.text = "Transaksi Berhasil untuk $nama"
        }
    }
}