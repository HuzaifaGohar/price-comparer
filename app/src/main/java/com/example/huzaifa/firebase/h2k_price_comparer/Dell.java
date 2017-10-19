package com.example.huzaifa.firebase.h2k_price_comparer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class Dell extends AppCompatActivity {

    ListView list;
    String[] itemname = {
            "alienware 13 R2",
            "alienware 14",
            "alienware 15",
            "alienware 17",
            "alienware 18",
            "alienware M11X R2",
            "alienware M18x",
            "Inspiron 15 3567",
            "Inspiron 15 5565",
            "Inspiron 15 5566",
            "Inspiron 15 7000",
            "Inspiron 15 7569",
            "Inspiron 15 7566 Gaming",
            "Inspiron 15 7567 Gaming",
            "Inspiron 3152 2 in 1",
            "Inspiron 5551",
            "Latitude 7275",
            "Latitude 7280","Latitude E5430",
            "Latitude E5500",
            "Latitude E6430s","Latitude E6440","Latitude E7440",
            "xps11 9P33","xps12 9Q23","xps12 9250","xps13 9333","xps13 9343",
            "xps14 L401X","xps14 L421X","xps15 9530","xps15 9550","xps17 L701X","xps17 L702X"
    };
    Integer[] imgid = {
            R.drawable.alienware_13_r2,
            R.drawable.alienware_14,
            R.drawable.alienware_15,
            R.drawable.alienware_17,
            R.drawable.alienware_18,
            R.drawable.alienware_m11x_r2,
            R.drawable.alienware_m18x,
            R.drawable.inspiron_15_3567,
            R.drawable.inspiron_15_5565,
            R.drawable.inspiron_15_5566,
            R.drawable.inspiron_15_7000,
            R.drawable.inspiron_15_7569,
            R.drawable.inspiron_15_gaming_7566,
            R.drawable.inspiron_15_gaming_7567,
            R.drawable.inspiron_3152_2_in_1,R.drawable.inspiron_5551,
            R.drawable.latitude_7275,R.drawable.latitude_7280,R.drawable.latitude_e5430,R.drawable.latitude_e5500,R.drawable.latitude_e6430s,
            R.drawable.latitude_e6440,R.drawable.latitude_e7440,R.drawable.xps11_9p33,R.drawable.xps12_9q23,R.drawable.xps12_9250,R.drawable.xps13_9333,
            R.drawable.xps13_9343,
            R.drawable.xps14_l401x,
            R.drawable.xps14_l421x,
            R.drawable.xps15_9530,
            R.drawable.xps15_9550,
            R.drawable.xps17_l701x,R.drawable.xps17_l702x


    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dell);
        Mobile_CustomListAdapter adapter = new Mobile_CustomListAdapter(this, itemname, imgid);
        list = (ListView) findViewById(R.id.listView1);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
// TODO Auto-generated method stub
                String Slecteditem = itemname[+position];
                Toast.makeText(getApplicationContext(), Slecteditem, Toast.LENGTH_SHORT).show();
            }
        });
    }
    }

