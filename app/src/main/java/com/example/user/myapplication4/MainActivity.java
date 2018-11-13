package com.example.user.myapplication4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;
    int x = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.btn);
    }

    public void btnclick(View view) {
        if ((x % 7 == 0) || (x % 10 == 7))
        {
            btn.setText("BOOM!");
            x = x + 1;
        }
        else {
            btn.setText("this is click number: " + x);
            x = x + 1;
        }

    }
}



