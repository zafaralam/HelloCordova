package com.zafaralam.hellocordova;

import android.os.Bundle;
import android.view.Menu;
import org.apache.cordova.*;

public class HelloCordovaActivity extends DroidGap {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.hello_cordova);
        //super.loadUrl("file:///android_asset/www/twitter-search.html");
        super.loadUrl("file:///android_asset/www/index.html");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.hello_cordova, menu);
        return true;
    }

    
}
