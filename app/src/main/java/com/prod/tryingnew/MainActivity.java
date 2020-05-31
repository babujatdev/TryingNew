package com.prod.tryingnew;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.prod.tryingnew.views.CustomViews;

public class MainActivity extends AppCompatActivity {
    CustomViews customViews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void init() {
        customViews = (CustomViews) findViewById(R.id.customButtonView);
        

    }
}