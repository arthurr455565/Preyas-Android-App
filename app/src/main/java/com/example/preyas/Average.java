package com.example.preyas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Average extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_average);

        pdfView=findViewById(R.id.pdfView);
        pdfView.fromAsset("Quantitative Aptitude Questions .pdf").load();
    }
}