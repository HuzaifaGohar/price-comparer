package com.example.huzaifa.firebase.h2k_price_comparer;

import com.firebase.client.Firebase;

/**
 * Created by huzaifa on 10/15/2017.
 */

public class Database extends   android.app.Application {
@Override
public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
        }
}


