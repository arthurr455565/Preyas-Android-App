package com.example.preyas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class RatioAndProportion extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ratio_and_proportion);


        pdfView=findViewById(R.id.pdfView);
        pdfView.fromAsset("Quantitative Aptitude Questions .pdf").load();
    }
}