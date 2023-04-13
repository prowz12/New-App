package com.example.testingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Website
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var mCalc:Button
    lateinit var mContacts:Button
    lateinit var mWebsite: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mCalc = findViewById(R.id.mBtnCalc)
        mContacts = findViewById(R.id.mBtnContact)
        mWebsite = findViewById(R.id.mBtnWeb)

        mCalc.setOnClickListener {
            val calculator = Intent(this, CalculatorActivity::class.java)
            startActivity(calculator)
        }
        mContacts.setOnClickListener {

        }
        mWebsite.setOnClickListener {
            val tembea = Intent(this, WebsiteActivity::class.java)
            startActivity(tembea)
        }


    }
}