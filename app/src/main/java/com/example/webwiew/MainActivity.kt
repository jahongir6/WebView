package com.example.webwiew

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        webViewSetup()
    }

    /*@RequiresApi(Build.VERSION_CODES.O)*/
    @RequiresApi(Build.VERSION_CODES.O)
    private fun webViewSetup() {
        web_view.webViewClient = WebViewClient()
        web_view.apply {
            loadUrl("https://www.youtube.com/channel/UCisKdSbTsPt16yGuN4iNgrA")
            settings.javaScriptEnabled = true
            settings.safeBrowsingEnabled = true
        }

    }
}