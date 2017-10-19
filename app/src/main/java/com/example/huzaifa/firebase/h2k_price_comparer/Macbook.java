package com.example.huzaifa.firebase.h2k_price_comparer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class Macbook extends AppCompatActivity {
    ListView list;
    String[] itemname = {
            "Macbook Air 11 2013",
            "Macbook Air 11 2014",
            "Macbook Air 11 2015",
            "Macbook Air 13 2013",
            "Macbook Air 13 2014",
            "Macbook Air 13 2015",
            "Macbook Air 13 2017",
            "Macbook Pro 13 2016",
            "Macbook Pro 13 2017",
            "Macbook Pro 15 2016",
            "Macbook Pro 15 2017",
            "Macbook Pro Retina 13 2014",
            "Macbook Pro Retina 13 2015",
            "Macbook Pro Retina 15 2014",
            "Macbook Pro Retina 15 2015"


    };
    Integer[] imgid = {
            R.drawable.macbook_air_11_2013,
            R.drawable.macbook_air_11_2014,
            R.drawable.macbook_air_11_2015,
            R.drawable.macbook_air_13_2013,
            R.drawable.macbook_air_13_2014,
            R.drawable.macbook_air_13_2015,
            R.drawable.macbook_air_13_2017,
            R.drawable.macbook_pro_13_2016,
            R.drawable.macbook_pro_13_2017,
            R.drawable.macbook_pro_15_2016,
            R.drawable.macbook_pro_15_2017,
            R.drawable.macbook_pro_retina_13_2014,
            R.drawable.macbook_pro_retina_13_2015,
            R.drawable.macbook_pro_retina_15_2014,
            R.drawable.macbook_pro_retina_15_2015,






    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_macbook);
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

