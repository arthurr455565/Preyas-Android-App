package com.example.preyas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class SynonymAndAntonym extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_synonym_and_antonym);

        pdfView=findViewById(R.id.pdfView);
        pdfView.fromAsset("Synonym and Antonym.pdf").load();
    }
}