package com.example.bytestock

import android.provider.ContactsContract.Contacts
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class printerItemAdapter (
    private val listOfContacts : List<printeritem>
) : RecyclerView.Adapter<printerItemAdapter.printerItemViewHolder>(){

    class printerItemViewHolder(
        view: View
    ) : RecyclerView.ViewHolder(view){
        val image : ImageView = view.findViewById(R.id.printer_image)
        val printerName : TextView = view.findViewById(R.id.printer_name)
        val printerDetails : TextView = view.findViewById(R.id.printer_details)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): printerItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.printer_item_layout,parent,false)
        return printerItemViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listOfContacts.size
    }

    override fun onBindViewHolder(holder: printerItemViewHolder, position: Int) {
        holder.image.setImageResource(listOfContacts[position].image)
        holder.printerName.text = listOfContacts[position].printerName
        holder.printerDetails.text = listOfContacts[position].printerDetail
    }
}