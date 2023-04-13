package com.example.testingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class WebsiteActivity : AppCompatActivity() {
    lateinit var mvWeb: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_website)
        mvWeb = findViewById(R.id.mWeb)
        val webSettings = mvWeb.settings
        webSettings.javaScriptEnabled = true
        mvWeb.loadUrl("https://www.emobilis.ac.ke")
    }
}