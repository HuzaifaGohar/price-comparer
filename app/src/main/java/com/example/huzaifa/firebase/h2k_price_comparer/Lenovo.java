package com.example.huzaifa.firebase.h2k_price_comparer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class Lenovo extends AppCompatActivity {
    ListView list;
    String[] itemname = {
            "Lenovo Ideapad 300",
            "Lenovo Ideapad 500",
            "Lenovo Ideapad 700",
            "Lenovo Ideapad Y720",
            "Lenovo Thinkpad 370",
            "Lenovo Thinkpad L530",
            "Lenovo Thinkpad P Series",
            "Lenovo Thinkpad T430",
            "Lenovo Thinkpad X1 Carbon",
            "Lenovo Yoga 510",
            "Lenovo Yoga 700",
            "Lenovo Yoga 900"
    };
    Integer[] imgid = {
            R.drawable.lenovo_ideapad_300,
            R.drawable.lenovo_ideapad_500,
            R.drawable.lenovo_ideapad_700,
            R.drawable.lenovo_ideapad_y720,
            R.drawable.lenovo_thinkpad_370,
            R.drawable.lenovo_thinkpad_l530,
            R.drawable.lenovo_thinkpad_p_serise,
            R.drawable.lenovo_thinkpad_t430,
            R.drawable.lenovo_thinkpad_x1_carbon,
            R.drawable.lenovo_yoga_510,
            R.drawable.lenovo_yoga_700,
            R.drawable.lenovo_yoga_900




    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lenovo);
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
