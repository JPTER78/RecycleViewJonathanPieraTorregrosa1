package com.example.recycleviewjonathanpieratorregrosa1

import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class WikipediaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_wikipedia)

        val url = intent.getStringExtra("URL") ?: "https://www.wikipedia.org/"

        val webView = findViewById<WebView>(R.id.webView)

        webView.loadUrl(url)

    }
}
