package com.example.preyas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Afcat_II_2020 extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afcat_ii_2020);

        pdfView=findViewById(R.id.pdfView);
        pdfView.fromAsset("AFCAT-II-2020.pdf").load();
    }
}