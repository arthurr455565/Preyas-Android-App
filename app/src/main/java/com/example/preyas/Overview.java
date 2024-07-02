package com.example.preyas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Overview extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overview);

        pdfView=findViewById(R.id.pdfView);
        pdfView.fromAsset("AIR FORCE COMMON ADMISSION TEST.pdf").load();



    }
}