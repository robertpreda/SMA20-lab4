package com.example.services;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;

public class WebsearchActivity extends AppCompatActivity {
    private WebView webView;
    private Button backgroundButton, foregroundButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_websearch);

        this.backgroundButton = findViewById(R.id.background);
        this.foregroundButton = findViewById(R.id.foreground);

        this.webView = findViewById(R.id.webView);
        WebSettings settings = this.webView.getSettings();
        settings.setJavaScriptEnabled(true);

        webView.setWebViewClient(new CustomWebViewClient());


    }
    public void click(View view){
        switch (view.getId()){
            case R.id.background:
                break;
            case R.id.foreground:
                break;
            default:
                break;
        }
    }
}

