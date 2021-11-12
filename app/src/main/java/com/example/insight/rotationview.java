package com.example.insight;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Toast;

public class rotationview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rotationview);
        Toast.makeText(this, "3D viewer thee.js", Toast.LENGTH_LONG).show();
        WebView myWebView = (WebView) findViewById(R.id.webview);
        myWebView.loadUrl("https://threejs.org/examples/#webgl_animation_keyframes");
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}