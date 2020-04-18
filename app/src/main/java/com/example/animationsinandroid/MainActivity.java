package com.example.animationsinandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtHelloWorld;
    private TextView txtHiWorld;
    private TextView txtAndroid;
    private Button btnAnimate;

    private boolean isHelloWorldShowing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtHelloWorld = findViewById(R.id.txtHelloWorld);
        txtHiWorld = findViewById(R.id.txtHiWorld);
        txtAndroid = findViewById(R.id.txtAndroid);
        btnAnimate = findViewById(R.id.btnAnimate);

        txtHelloWorld.setX(2000);
        txtHiWorld.setX(-2000);
        txtAndroid.setY(-3000);

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

        txtAndroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                txtAndroid.animate().translationX(-3000).setDuration(2000);
//                txtAndroid.animate().translationY(3000).setDuration(3000);
//                txtAndroid.animate().translationXBy(200).setDuration(5000);
//                txtAndroid.animate().rotation(360).setDuration(2000);
//                txtAndroid.animate().rotationBy(30).setDuration(4000);
//                txtAndroid.animate().rotationX(360).translationY(2000).setDuration(2000);
//                txtAndroid.animate().rotationY(360).setDuration(2000);
                txtAndroid.animate().scaleX(0.2f).scaleY(0.4f).setDuration(3000);
            }
        });

        btnAnimate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtHelloWorld.animate().translationXBy(-2000).rotation(2000).setDuration(3000);
                txtHiWorld.animate().translationXBy(2000).scaleX(1.2f).setDuration(2000);
                txtAndroid.animate().translationYBy(3000).alpha(0.7f).setDuration(4000);
            }
        });

    }
}
