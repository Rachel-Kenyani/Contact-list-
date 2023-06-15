package com.cyanide.contacts

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.cyanide.contacts.databinding.ContactitemBinding
import com.squareup.picasso.Picasso
import jp.wasabeef.picasso.transformations.CropCircleTransformation

class ContactRvAdapter(var contactlist: List<Contactdata>) : RecyclerView.Adapter<ContactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val binding = ContactitemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ContactViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var contact = contactlist[position]//tweetList[position]
        var binding = holder.binding
        binding.tvname.text = contact.name
       binding.tvemail.text = contact.email
        binding.tvnum.text = contact.number
        Picasso
            .get()
            .load(contact.avatar)
            .resize(80,80)
            .centerCrop()
            .transform(CropCircleTransformation())
            .into(holder.binding.ivuser)

    }

    override fun getItemCount(): Int {
        return contactlist.size
    }
}
        class ContactViewHolder(var binding: ContactitemBinding) : RecyclerView.ViewHolder(binding.root){

        }
