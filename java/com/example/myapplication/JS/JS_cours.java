package com.example.myapplication.JS;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.HTML.Cour1;
import com.example.myapplication.R;

public class JS_cours extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_js_cours);
        Button cour1=findViewById(R.id.cour1_js);
        Button cour2=findViewById(R.id.cour2_js);
        Button cour3=findViewById(R.id.cour3_js);
        Button cour4=findViewById(R.id.cour4_js);
        Button cour5=findViewById(R.id.cour5_js);
        Button cour6=findViewById(R.id.cour6_js);
        Button cour7=findViewById(R.id.cour7_js);
        Button cour8=findViewById(R.id.cour8_js);
        Button cour9=findViewById(R.id.cour9_js);
        Button cour10=findViewById(R.id.cour10_js);


        cour1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), com.example.myapplication.JS.Cour1.class);
                intent.putExtra("pdf_url","https://drive.google.com/file/d/11xYw0UCRKtD-r0AH_RCZPYgfgAk-z1vN/view?usp=sharing");
                startActivity(intent);
            }
        });
        cour2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), Cour2.class);
                intent.putExtra("pdf_url","https://drive.google.com/file/d/14awvwCGpPGRt6xd7fCgQbtbvLPcm3upa/view?usp=sharing");
                startActivity(intent);
            }
        });
        cour3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), Cour3.class);
                intent.putExtra("pdf_url","https://drive.google.com/file/d/1gG6_oHIlnS24K1wjRajK3EOqrEVea9YB/view?usp=sharing");
                startActivity(intent);
            }
        });
        cour4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), Cour4.class);
                intent.putExtra("pdf_url","https://drive.google.com/file/d/1jejsHgtDPZdnc68h0saPheHSHRhxcATh/view?usp=sharing");
                startActivity(intent);
            }
        });
        cour5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), Cour5.class);
                intent.putExtra("pdf_url","https://drive.google.com/file/d/1NmRbC4_u3r1LjR1JQ9rmPEDaTcpNzNe3/view?usp=sharing");
                startActivity(intent);
            }
        });
        cour6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), Cour6.class);
                intent.putExtra("pdf_url","https://drive.google.com/file/d/1bK0I0l1K1HkE41vyYagsJ_OZk8UtD2g0/view?usp=sharing");
                startActivity(intent);
            }
        });
        cour7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), Cour7.class);
                intent.putExtra("pdf_url","https://drive.google.com/file/d/1xbr1APrp0BG-sfmX8VOf3VogWGE61pir/view?usp=sharing");
                startActivity(intent);
            }
        });
        cour8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), Cour8.class);
                intent.putExtra("pdf_url","https://drive.google.com/file/d/1g-2hTJlAkJEf050MUpefaQl2x1oZek54/view?usp=sharing");
                startActivity(intent);
            }
        });
        cour9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), Cour9.class);
                intent.putExtra("pdf_url","https://drive.google.com/file/d/1-KN-C9KlU1wM_lcZIBor12pNVR5lj45d/view?usp=sharing");
                startActivity(intent);
            }
        });
        cour10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), Cour10.class);
                intent.putExtra("pdf_url","https://drive.google.com/file/d/1AJc0AX1BZAYlXGe3jDFdX5wnTl8G8JbI/view?usp=sharing");
                startActivity(intent);
            }
        });
    }
}