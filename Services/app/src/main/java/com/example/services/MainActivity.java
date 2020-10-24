package com.example.services;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

import static androidx.core.content.ContextCompat.startActivity;

public class MainActivity extends AppCompatActivity {

    private WebView webView;
    private EditText urlSearch;
    private Button searchButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.webView = findViewById(R.id.webView);
        this.urlSearch = findViewById(R.id.url);
        this.searchButton = findViewById(R.id.search);
        WebSettings settings = this.webView.getSettings();
        settings.setJavaScriptEnabled(true);

        webView.setWebViewClient(new CustomWebViewClient());

//        this.webView.loadUrl("to ad");

    }

    public void click(View view){
        switch (view.getId()){
            case R.id.search:
                String url = this.urlSearch.getText().toString();
                this.webView.loadUrl(url);

        }
    }
}