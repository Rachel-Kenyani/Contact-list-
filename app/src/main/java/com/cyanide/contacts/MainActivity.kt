package com.cyanide.contacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.cyanide.contacts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
    override fun onResume(){
        super.onResume()
        displayContact()
    }
    fun displayContact(){
        var contact1=Contactdata("","Kate","katekimani@gmail.com","+25489908905")
        var contact2=Contactdata("","Shem","shemmburu@gmail.com","+25489908905")
        var contact3=Contactdata("","Tina","tasha@gmail.com","+25489908905")
        var contact4=Contactdata("","Kate","katekimani@gmail.com","+25489908905")
        var contact5=Contactdata("","Shem","shemmburu@gmail.com","+25489908905")
        var contact6=Contactdata("","Tina","tasha@gmail.com","+25489908905")
        var contact7=Contactdata("","Kate","katekimani@gmail.com","+25489908905")


        var contactlist= listOf<Contactdata>(contact1,contact2,contact3,contact4,contact5,contact6,contact7)
        binding.rvcontacts.layoutManager= LinearLayoutManager(this)
        var contactAdaptor=ContactRvAdapter(contactlist)
        binding.rvcontacts.adapter=contactAdaptor
    }
}