package com.example.ex06091;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    WebView wV;
    String stringUrl;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wV = (WebView)findViewById(R.id.wV);
        wV.getSettings().setJavaScriptEnabled(true);
        stringUrl = "https://berseva.iscool.co.il/default.aspx";
        wV.loadUrl(stringUrl.toString());
        wV.setWebViewClient(new MyWebViewClient());



    }

    private class MyWebViewClient extends WebViewClient {
            public boolean shouldOverideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
        }

    }
}