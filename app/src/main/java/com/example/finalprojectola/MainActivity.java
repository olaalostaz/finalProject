package com.example.finalprojectola;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
private RecyclerView rv;
private FloatingActionButton add;
private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         toolbar=findViewById(R.id.main_toolbar);
         setSupportActionBar(toolbar);

//         rv=findViewById(R.id.list);
//         add=findViewById(R.id.add);

//        ListView list=findViewById(R.id.list);
//        SearchView search=findViewById(R.id.search);
//
//        ArrayList<contact> contacts=new ArrayList<contact>();
//        contacts.add(new contact(598145752,"Ahmad",R.drawable.person_48px));
//        contacts.add(new contact(595102244,"Ali",R.drawable. person_100px));
//        contacts.add(new contact(594781103,"Omar",R.drawable.person_blond_hair_48px));
//        contacts.add(new contact(597878104,"Joman",R.drawable.person_female));
//
//        MyAdapter adapter=new MyAdapter(contacts);
//        RecyclerView.LayoutManager lm=new LinearLayoutManager(this);
//        rv.setHasFixedSize(true);
//        rv.setLayoutManager(lm);
//        rv.setAdapter(adapter);
//        MyAdapter ad=new MyAdapter(this,contacts);
//        rv.setAdapter(ad);
//        rv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                contact c=(contact) rv.getItemAtPosition(position);
//                Toast.makeText(getApplicationContext(),c.getName()+" "+c.getNo(),Toast.LENGTH_LONG).show();
//                contacts.remove(position);
//                ad.notifyDataSetChanged();
//            }
//        });

//
//        search.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
//            @Override
//            public boolean onQueryTextSubmit(String query) {
//                return false;
//            }
//
//            @Override
//            public boolean onQueryTextChange(String newText) {
//
//                ad.getFilter().filter(newText);
//
//                return true;
//            }
//        });

    }
}