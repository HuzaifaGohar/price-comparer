package com.example.huzaifa.firebase.h2k_price_comparer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class Hp extends AppCompatActivity {
    ListView list;
    String[] itemname = {
            "Hp Elitebook 8440",
            "Hp Elitebook 8460",
            "Hp Elitebook 8470",
            "Hp Elitebook 8540",
            "Hp Elitebook Folio 9470",
            "Hp Elitebook Folio 9480",
            "HP ENVY 4 1200",
            "HP ENVY 6",
            "HP ENVY 13",
            "HP ENVY 14","HP ENVY 15","HP ENVY 17","HP ENVY x2 11 g100",
            "Hp Probook 430","Hp Probook 440","Hp Probook 450","Hp Probook 6440",
            "Hp Probook 6450","Hp Probook 6470"
    };
    Integer[] imgid = {
            R.drawable.hp_elitebook_8440,
            R.drawable.hp_elitebook_8460,
            R.drawable.hp_elitebook_8470,
            R.drawable.hp_elitebook_8540,
            R.drawable.hp_elitebook_folio_9470,
            R.drawable.hp_elitebook_folio9480,
            R.drawable.hp_envy_4_1200,
            R.drawable.hp_envy_6,
            R.drawable.hp_envy_13,
            R.drawable.hp_envy_14,
            R.drawable.hp_envy_15,
            R.drawable.hp_envy_17,
            R.drawable.hp_envy_x2_11_g100,
            R.drawable.hp_probook_430,
            R.drawable.hp_probook_440,
            R.drawable.hp_probook_450,
            R.drawable.hp_probook_6440,
            R.drawable.hp_probook_6450,
            R.drawable.hp_probook_6470


    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hp);
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


