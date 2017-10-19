package com.example.huzaifa.firebase.h2k_price_comparer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class Lg extends AppCompatActivity {

    ListView list;
    String[] itemname ={
            "LG g2",
            "LG g3",
            "LG g4",
            "LG g5",
            "LG g6",
            "LG Nexus 2",
            "LG Nexus 3 ",
            "LG Nexus 4 ",
            "LG Nexus 5 ",
            "LG Optimus g Pro"
    };
    Integer[] imgid={
            R.drawable.g2,
            R.drawable.g3,
            R.drawable.g4,
            R.drawable.g5,
            R.drawable.g6,
            R.drawable.lg_nexus_2,
            R.drawable.lg_nexus_3,
            R.drawable.lg_nexus_4,
            R.drawable.lg_nexus_5,
            R.drawable.lg_opti_g_pro

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lg);
        Mobile_CustomListAdapter adapter=new Mobile_CustomListAdapter(this, itemname, imgid);
        list=(ListView)findViewById(R.id.listView1);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
// TODO Auto-generated method stub
                String Slecteditem= itemname[+position];
                Toast.makeText(getApplicationContext(), Slecteditem, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
