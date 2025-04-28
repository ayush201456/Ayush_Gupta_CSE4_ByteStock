package com.example.bytestock

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class PrinterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_printer)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val rv : RecyclerView = findViewById(R.id.printer_rv)

        val listOfContact = mutableListOf<printeritem>()
        listOfContact.add(
            printeritem(
                image = R.drawable.ic_printer,
                printerName = "canon",
                printerDetail = "inkjet printer"
            )
        )

        listOfContact.add(
            printeritem(
                image = R.drawable.ic_printer,
                printerName = "canon",
                printerDetail = "inkjet printer"
            )
        )


        listOfContact.add(
            printeritem(
                image = R.drawable.ic_printer,
                printerName = "canon",
                printerDetail = "inkjet printer"
            )
        )


        listOfContact.add(
            printeritem(
                image = R.drawable.ic_printer,
                printerName = "canon",
                printerDetail = "inkjet printer"
            )
        )

        val adapter = printerItemAdapter(listOfContact)
        rv.layoutManager = LinearLayoutManager(this)
        rv.adapter = adapter
    }
}