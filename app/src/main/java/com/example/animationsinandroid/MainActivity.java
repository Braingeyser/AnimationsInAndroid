package com.example.animationsinandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtHelloWorld;
    private TextView txtHiWorld;

    private boolean isHelloWorldShowing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtHelloWorld = findViewById(R.id.txtHelloWorld);
        txtHiWorld = findViewById(R.id.txtHiWorld);
        txtHelloWorld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Log.i("MyTag", "Hello world");
                txtHelloWorld.animate().alpha(0f).setDuration(3000);
                txtHiWorld.animate().alpha(1.0f).setDuration(3000);

                if(isHelloWorldShowing){
                    txtHelloWorld.animate().alpha(0f).setDuration(3000);
                    txtHiWorld.animate().alpha(1.0f).setDuration(3000);
                    isHelloWorldShowing = false;
                }else{
                    txtHiWorld.animate().alpha(0f).setDuration(3000);
                    txtHelloWorld.animate().alpha(1.0f).setDuration(3000);
                    isHelloWorldShowing = true;
                }
            }
        });

    }
}
