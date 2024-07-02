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

public class Afcat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afcat);


        ListView listView = findViewById(R.id.listview);

        List<String> list = new ArrayList<>();
        list.add("Overview");
        list.add("Quantitative Aptitude");
        list.add("Verbal Ability");
        list.add("Reasoning");
        list.add("Previous Years Question");

        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, list);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) {
                    startActivity(new Intent(Afcat.this,Overview.class));
                } else if (i == 1) {
                    startActivity(new Intent(Afcat.this,Quant.class));

                } else if (i == 2) {
                    startActivity(new Intent(Afcat.this,Verbal.class));

                } else if (i == 3) {
                    startActivity(new Intent(Afcat.this,Reasoning.class));

                } else {
                    startActivity(new Intent(Afcat.this,PreviousYrQuestion.class));

                }
            }
        });
    }
}