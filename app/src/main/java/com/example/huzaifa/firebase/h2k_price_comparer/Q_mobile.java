package com.example.huzaifa.firebase.h2k_price_comparer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class Q_mobile extends AppCompatActivity {

    ListView list;
    String[] itemname ={
            "QMobile A1",
            "QMobile CS1",
            "QMobile Energegy X2",
            "QMobile LT 550",
            "QMobile M6",
            "QMobile M6 Lite",
            "QMobile Noir E2",
            "QMobile Noir J7"
    };
    Integer[] imgid={
            R.drawable.q_a1,
            R.drawable.q_cs1,
            R.drawable.q_energy_x2,
            R.drawable.q_lt550,
            R.drawable.q_m6,
            R.drawable.q_m6_lite,
            R.drawable.q_noir_e2,
            R.drawable.q_noir_j7

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q_mobile);
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
