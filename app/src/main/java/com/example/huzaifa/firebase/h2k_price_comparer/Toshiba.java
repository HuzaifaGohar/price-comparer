package com.example.huzaifa.firebase.h2k_price_comparer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class Toshiba extends AppCompatActivity {
    ListView list;
    String[] itemname = {
            "Toshiba Cb35",
            "Toshiba Radius 2 in 1",
            "Toshiba Satellite C55",
            "Toshiba Satellite Radius l15w",
            "Toshiba Satellite S55"
    };
    Integer[] imgid = {
            R.drawable.toshiba_cb35,
            R.drawable.toshiba_radius_2_in_1,
            R.drawable.toshiba_satellite_c55,
            R.drawable.toshiba_satellite_radius_l15w,
            R.drawable.toshiba_satellite_s55






    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toshiba);
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

