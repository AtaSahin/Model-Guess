package com.example.mycar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.text.DateFormatSymbols;
import java.util.ArrayList;

public class homePage extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        listView=(ListView)findViewById(R.id.listview);
        ArrayList <String> arrayList=new ArrayList<>();
        arrayList.add("Toyota");
        arrayList.add("BMW");
        arrayList.add("Opel");
        arrayList.add("Audi");
        arrayList.add("Chevrolet ");
        arrayList.add("Volkswagen");
        arrayList.add("Ford");
        arrayList.add("Nissan");
        arrayList.add("Mercedes ");
        arrayList.add("Cadillac ");
        arrayList.add("Bentley ");
        arrayList.add("Aston Martin ");
        arrayList.add("Ferrari ");
        ArrayAdapter arrayAdapter=new ArrayAdapter(this, android.R.layout.simple_list_item_1,arrayList);

        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    //clicked apple

                    startActivity(new Intent(homePage.this,toyata.class));

                }else if(position==1){
                    //clicked orange
                    startActivity(new Intent(homePage.this,bmw.class));
                }else{

                }
            }
        });


    }
}