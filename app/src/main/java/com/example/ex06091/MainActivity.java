package com.example.ex06091;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    WebView wV;
    String stringUrl;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.btn);
        wV = (WebView) findViewById(R.id.wV);
        wV.getSettings().setJavaScriptEnabled(true);
        stringUrl = "https://berseva.iscool.co.il/default.aspx";


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wV.loadUrl(stringUrl);
            }
        });
    }

    public void go(View view) {
        wV.loadUrl(stringUrl);
        wV.setWebViewClient(new MyWebViewClient());
    }

    private class MyWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}
