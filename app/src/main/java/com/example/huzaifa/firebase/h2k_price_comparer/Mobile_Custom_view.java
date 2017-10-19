package com.example.huzaifa.firebase.h2k_price_comparer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class Mobile_Custom_view extends Activity {
    ListView list;
    String[] itemname ={
            "Iphone",
            "Motorolla",
            "Samsung",
            "Lg",
            "Q Mobile"
    };
    Integer[] imgid={
            R.drawable.apple,
            R.drawable.motorolla,
            R.drawable.samsung,
            R.drawable.lg,
            R.drawable.q_mobile

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_view);
        Mobile_CustomListAdapter adapter=new Mobile_CustomListAdapter(this, itemname, imgid);
        list=(ListView)findViewById(R.id.listView1);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Intent intent= null;
                switch (position){
                    case 0:
                        intent = new Intent(Mobile_Custom_view.this,Iphone.class);
                        break;
                    case 1:
                        intent = new Intent(Mobile_Custom_view.this,Motorolla.class);
                        break;
                    case 2:
                        intent = new Intent(Mobile_Custom_view.this,Samsung.class);
                        break;
                    case 3:
                        intent = new Intent(Mobile_Custom_view.this,Lg.class);
                        break;
                    case 4:
                        intent = new Intent(Mobile_Custom_view.this,Q_mobile.class);
                        break;


                }
                startActivity(intent);

            }
        });
    }
}
