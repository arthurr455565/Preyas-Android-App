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

public class Verbal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verbal);

        ListView listView = findViewById(R.id.listview);

        List<String> list = new ArrayList<>();
        list.add("Comprehension");
        list.add("Error Detection");
        list.add("Sentence Completion");
        list.add("Correct Word");
        list.add("Synonym and Antonym");
        list.add("Idioms and Phrases");

        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, list);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) {
                    startActivity(new Intent(Verbal.this,Comprehension.class));

                } else if (i == 1) {
                    startActivity(new Intent(Verbal.this,ErrorDetection.class));

                } else if (i == 2) {
                    startActivity(new Intent(Verbal.this,SentenceCompletion.class));

                } else if (i == 3) {
                    startActivity(new Intent(Verbal.this,CorrectWord.class));

                } else if (i == 4){
                    startActivity(new Intent(Verbal.this,SynonymAndAntonym.class));

                } else {
                    startActivity(new Intent(Verbal.this,IdiomsAndPhrases.class));

                }
            }
        });

    }
}