package com.example.myapplication.PHP;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.HTML.Cour1;
import com.example.myapplication.R;

public class Php_cours extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_php_cours);
        Button cour1=findViewById(R.id.cour1_php);
        Button cour2=findViewById(R.id.cour2_php);
        Button cour3=findViewById(R.id.cour3_php);
        Button cour4=findViewById(R.id.cour4_php);
        Button cour5=findViewById(R.id.cour5_php);
        Button cour6=findViewById(R.id.cour6_php);
        Button cour7=findViewById(R.id.cour7_php);
        Button cour8=findViewById(R.id.cour8_php);
        Button cour9=findViewById(R.id.cour9_php);
        Button cour10=findViewById(R.id.cour10_php);


        cour1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), com.example.myapplication.PHP.Cour1.class);
                intent.putExtra("pdf_url","https://drive.google.com/file/d/1P570f1tFBvFZEKMqcTJN2SRyMQw5Xunu/view?usp=sharing");
                startActivity(intent);
            }
        });
        cour2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), Cour2.class);
                intent.putExtra("pdf_url","https://drive.google.com/file/d/1Cim3WDpfzgZB8ONThV2XeKxhjOAr2Q3B/view?usp=sharing");
                startActivity(intent);
            }
        });
        cour3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), Cour3.class);
                intent.putExtra("pdf_url","https://drive.google.com/file/d/1X3aiGz4MsRN1j0Ret_0zGh4An7Z1WVPU/view?usp=sharing");
                startActivity(intent);
            }
        });
        cour4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), Cour4.class);
                intent.putExtra("pdf_url","https://drive.google.com/file/d/1a4ePLUtsQ7m0nKdaV6m3PQFmFbbh1nJh/view?usp=sharing");
                startActivity(intent);
            }
        });
        cour5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), Cour5.class);
                intent.putExtra("pdf_url","https://drive.google.com/file/d/1ytSdHoiy3f-w4--CXLl2S-7wV8ji1DJA/view?usp=sharing");
                startActivity(intent);
            }
        });
        cour6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), Cour6.class);
                intent.putExtra("pdf_url","https://drive.google.com/file/d/1rvzQv7izO2wlnDFv5K_5QgyImlET3FtO/view?usp=sharing");
                startActivity(intent);
            }
        });
        cour7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), Cour7.class);
                intent.putExtra("pdf_url","https://drive.google.com/file/d/1YOsZVF8HGw1ayV_2Q0V0nfCNFITsjchI/view?usp=sharing");
                startActivity(intent);
            }
        });
        cour8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), Cour8.class);
                intent.putExtra("pdf_url","https://drive.google.com/file/d/1hD6EET2dIwBhIfBjMDtwgrIi1mOul8d9/view?usp=sharing");
                startActivity(intent);
            }
        });
        cour9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), Cour9.class);
                intent.putExtra("pdf_url","https://drive.google.com/file/d/1oSOmUfm1i6Pgq6K7Ql6OToSQsM986vnD/view?usp=sharing");
                startActivity(intent);
            }
        });
        cour10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), Cour10.class);
                intent.putExtra("pdf_url","https://drive.google.com/file/d/1A2lW-3HxWEikKeKK0qDd8pBW8DICekmA/view?usp=sharing");
                startActivity(intent);
            }
        });
    }
}