package com.example.huzaifa.firebase.h2k_price_comparer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Laptop_Custom_View extends AppCompatActivity {
    ListView list;
    String[] itemname ={
            "Dell",
            "Hp",
            "MacBook",
            "Toshiba",
            "Lenovo"
    };
    Integer[] imgid={
            R.drawable.latitude_e5430,
            R.drawable.hp_envy_15,
            R.drawable.macbook_pro_15_2016,
            R.drawable.toshiba_satellite_c55,
            R.drawable.lenovo_thinkpad_x1_carbon

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laptop__custom__view);
        setContentView(R.layout.custom_view);
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
                        intent = new Intent(Laptop_Custom_View.this,Dell.class);
                        break;
                    case 1:
                        intent = new Intent(Laptop_Custom_View.this,Hp.class);
                        break;
                    case 2:
                        intent = new Intent(Laptop_Custom_View.this,Macbook.class);
                        break;
                    case 3:
                        intent = new Intent(Laptop_Custom_View.this,Toshiba.class);
                        break;
                    case 4:
                        intent = new Intent(Laptop_Custom_View.this,Lenovo.class);
                        break;


                }
                startActivity(intent);

            }
        });
    }

}
