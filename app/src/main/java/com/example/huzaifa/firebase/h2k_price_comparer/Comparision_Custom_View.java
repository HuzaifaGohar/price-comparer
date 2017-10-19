package com.example.huzaifa.firebase.h2k_price_comparer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Comparision_Custom_View extends AppCompatActivity {

    ListView list;
    String[] itemname ={
            "Mobile",
            "Laptop"

    };
    Integer[] imgid={
            R.drawable.s8_plus,
            R.drawable.hp_envy_15
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comparision__custom__view);
        Mobile_CustomListAdapter adapter=new Mobile_CustomListAdapter(this, itemname, imgid);
        list=(ListView)findViewById(R.id.listView1);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Intent intent= null;
                switch (position){
                    case 0:
                        intent = new Intent(Comparision_Custom_View.this,Mobile_Custom_view.class);
                        break;
                    case 1:
                        intent = new Intent(Comparision_Custom_View.this,Laptop_Custom_View.class);
                        break;



                }
                startActivity(intent);

            }
        });
    }
    }

