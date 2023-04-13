package com.example.testingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast

class ContactsActivity : AppCompatActivity() {
    lateinit var mContacts:ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contacts)
        mContacts = findViewById(R.id.mListContacts)
        mContacts.setOnItemClickListener { adapterView, _, i, l ->
            val name = adapterView.getItemAtPosition(i).toString()
            Toast.makeText(this, name, Toast.LENGTH_LONG).show()
        }
    }
}