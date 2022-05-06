package com.example.myapplication.CSS;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.myapplication.R;

public class Cour4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cour4_css);
        String url=getIntent().getStringExtra("pdf_url");
        WebView webView=findViewById(R.id.web4_css);
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(url);
    }
}