package com.example.preyas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Exams extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exams);


        ListView listView = findViewById(R.id.listview);

        List<String> list = new ArrayList<>();
        list.add("AFCAT");
        list.add("CDS");
        list.add("SBI PO");
        list.add("NDA");
        list.add("SSC CGL");

        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,list);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0){
                    //Clicked AFCAT
                    startActivity(new Intent(Exams.this,Afcat.class));
                }else if(i==1){
                    //Clicked CDS
                    startActivity(new Intent(Exams.this,Cds.class));
                }else if(i==2){
                    // Clicked SBI PO
                    startActivity(new Intent(Exams.this,Sbi.class));
                }else if(i==3){
                    //Clicked NDA
                    startActivity(new Intent(Exams.this,Nda.class));
                }else{
                    //Clicked SSC CGL
                    startActivity(new Intent(Exams.this,Ssc.class));
                }


            }


        });


    }
}