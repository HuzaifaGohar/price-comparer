package com.example.huzaifa.firebase.h2k_price_comparer;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Splash_screen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
         Thread thread = new Thread(){
            public void run(){
                try{
                    sleep(7000);
                    Intent intent = new Intent(Splash_screen.this,Admin.class);
                    startActivity(intent);
                    finish();
                }catch(Exception ex){

                }
            }
        };
        thread.start();
    }
}
