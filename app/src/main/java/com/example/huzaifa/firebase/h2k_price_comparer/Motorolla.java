package com.example.huzaifa.firebase.h2k_price_comparer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class Motorolla extends AppCompatActivity {

    ListView list;
    String[] itemname ={
            "Motorolla Razr M",
            "Motorolla Ultra Max",
            "Motorolla Ultra Mini",
            "Motorolla Turbo",
            "Motorolla Turbo 2",
            "Motorolla Turbo 3",
            "Motorolla X",
            "Motorolla Z",
            "Motorolla Z Force",
            "Motorolla Nexus 6"
    };
    Integer[] imgid={
            R.drawable.razr_m,
            R.drawable.ultra_max,
            R.drawable.ultra_mini,
            R.drawable.turbo,
            R.drawable.turbo_2,
            R.drawable.turbo3,
            R.drawable.moto_x,
            R.drawable.moto_z,
            R.drawable.moto_z_force,
            R.drawable.moto_nexus_6,
            R.drawable.note_1,R.drawable.note_2,R.drawable.note_3,R.drawable.note_4,R.drawable.note_5,R.drawable.note_edge,
            R.drawable.aplha,R.drawable.a3,R.drawable.a5,R.drawable.a7,R.drawable.a8,R.drawable.a9,
            R.drawable.j1,R.drawable.j2,R.drawable.j3,R.drawable.j5,R.drawable.j7

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motorolla);
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
