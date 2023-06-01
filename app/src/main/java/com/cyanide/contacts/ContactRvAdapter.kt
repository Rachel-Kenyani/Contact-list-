package com.cyanide.contacts

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.cyanide.contacts.databinding.ContactitemBinding

class ContactRvAdapter(var contactlist: List<Contactdata>) : RecyclerView.Adapter<ContactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val binding = ContactitemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ContactViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var contact = contactlist.get(position)//tweetList[position]
        holder.binding.tvname.text = contact.name
        holder.binding.tvemail.text = contact.email
        holder.binding.tvnum.text = contact.number
    }

    override fun getItemCount(): Int {
        return contactlist.size
    }
}
        class ContactViewHolder(var binding: ContactitemBinding) : RecyclerView.ViewHolder(binding.root)
