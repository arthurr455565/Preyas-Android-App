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

public class PreviousYrQuestion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_previous_yr_question);

        ListView listView = findViewById(R.id.listview);

        List<String> list = new ArrayList<>();
        list.add("AFCAT I 2020");
        list.add("AFCAT II 2020");
        list.add("AFCAT I 2021");
        list.add("AFCAT II 2021");
        list.add("AFCAT I 2022");
        list.add("AFCAT II 2022");


        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, list);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) {
                    startActivity(new Intent(PreviousYrQuestion.this,Afcat_I_2020.class));

                } else if (i == 1) {
                    startActivity(new Intent(PreviousYrQuestion.this,Afcat_II_2020.class));

                } else if (i == 2) {
                    startActivity(new Intent(PreviousYrQuestion.this,Afcat_I_2021.class));

                } else if (i == 3) {
                    startActivity(new Intent(PreviousYrQuestion.this,Afcat_II_2021.class));

                } else if (i == 4){
                    startActivity(new Intent(PreviousYrQuestion.this,Afcat_I_2022.class));


                } else {
                    startActivity(new Intent(PreviousYrQuestion.this,Afcat_II_2022.class));
                }
            }
        });


    }
}