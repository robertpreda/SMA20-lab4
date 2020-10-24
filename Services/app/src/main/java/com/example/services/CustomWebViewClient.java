package com.example.services;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class CustomWebViewClient extends WebViewClient {

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url){
        if(Uri.parse(url).toString().startsWith("https://www.google.com/search?=")
        && Uri.parse(url).toString().contains("tbm=isch")) {
            return false;
        }
        return true;
    }
}
