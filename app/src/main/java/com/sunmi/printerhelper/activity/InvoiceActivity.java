package com.sunmi.printerhelper.activity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import androidx.annotation.Nullable;

import com.sunmi.printerhelper.R;

/**
 * Example of printing pic
 * @author kaltin
 */
public class InvoiceActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WebView myWebView = new WebView(this);
        setContentView(myWebView);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebView.loadUrl("https://pallapay.co/invoice/#pay=06a60578-799f-49e9-95f6-4de63629c3e2");

    }
}

