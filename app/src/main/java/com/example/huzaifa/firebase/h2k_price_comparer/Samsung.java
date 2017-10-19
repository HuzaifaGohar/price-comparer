package com.example.huzaifa.firebase.h2k_price_comparer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class Samsung extends AppCompatActivity {





    ListView list;
    String[] itemname ={
            "Samsung S2",
            "Samsung S3",
            "Samsung S4",
            "Samsung S5",
            "Samsung S6",
            "Samsung S6 Edge",
            "Samsung S7",
            "Samsung S7 Edge",
            "Samsung S8",
            "Samsung S8 Plus",
            "Note 1","Note 2","Note 3","Note 4","Note 5","Note Edge","Samsung Alpha","Alpha 3","Alpha 5","Alpha 7","Alpha 8","Alpha 9",
            "Samsung J1","Samsung J2","Samsung J3","Samsung J5","Samsung J7"
    };
    Integer[] imgid={
            R.drawable.s2,
            R.drawable.s_3,
            R.drawable.s4,
            R.drawable.s5,
            R.drawable.s6_white,
            R.drawable.s6edge,
            R.drawable.s7,
            R.drawable.s7_edge,
            R.drawable.s8,
            R.drawable.s8_plus,
            R.drawable.note_1,R.drawable.note_2,R.drawable.note_3,R.drawable.note_4,R.drawable.note_5,R.drawable.note_edge,
            R.drawable.aplha,R.drawable.a3,R.drawable.a5,R.drawable.a7,R.drawable.a8,R.drawable.a9,
            R.drawable.j1,R.drawable.j2,R.drawable.j3,R.drawable.j5,R.drawable.j7

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_samsung);
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
