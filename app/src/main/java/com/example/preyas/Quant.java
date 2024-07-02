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


public class Quant extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quant);

        ListView listView = findViewById(R.id.listview);

        List<String> list = new ArrayList<>();
        list.add("Decimal Fraction");
        list.add("Time and Work");
        list.add("Average");
        list.add("Profit and Loss");
        list.add("Percentage");
        list.add("Ratio and Proportion");
        list.add("Simple Interest");
        list.add("Trains,Boats and Stream");

        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, list);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) {
                    startActivity(new Intent(Quant.this,DecimalFraction.class));

                } else if (i == 1) {
                    startActivity(new Intent(Quant.this,TimeAndWork.class));

                } else if (i == 2) {
                    startActivity(new Intent(Quant.this,Average.class));

                } else if (i == 3) {
                    startActivity(new Intent(Quant.this,ProfitAndLoss.class));

                } else if (i == 4){
                    startActivity(new Intent(Quant.this,Percentage.class));

                } else if(i == 5){
                    startActivity(new Intent(Quant.this,RatioAndProportion.class));

                } else if (i == 6){
                    startActivity(new Intent(Quant.this,SimpleInterest.class));

                } else {
                    startActivity(new Intent(Quant.this, TrainsBoatsAndStreams.class));
                }
            }
        });




    }
}