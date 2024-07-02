package com.example.preyas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class IdiomsAndPhrases extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_idioms_and_phrases);

        pdfView=findViewById(R.id.pdfView);
        pdfView.fromAsset("Idioms and Phrase.pdf").load();
    }
}