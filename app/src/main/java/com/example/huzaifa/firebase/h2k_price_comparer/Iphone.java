package com.example.huzaifa.firebase.h2k_price_comparer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class Iphone extends AppCompatActivity {


    ListView list;
    String[] itemname = {
            "Iphone 4",
            "Iphone 4s",
            "Iphone 5",
            "Iphone 5c",
            "Iphone 5s",
            "Iphone 6",
            "Iphone 6s",
            "Iphone 6 plus",
            "Iphone 7",
            "Iphone 7 plus"
    };
    Integer[] imgid = {
            R.drawable.iphone_4,
            R.drawable.iphone_4s,
            R.drawable.iphone_5,
            R.drawable.iphone_5c,
            R.drawable.iphone_5s,
            R.drawable.iphone_6,
            R.drawable.iphone_6s,
            R.drawable.iphone_6_plus,
            R.drawable.iphone_7,
            R.drawable.iphone_7_plus

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout. activity_iphone);
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