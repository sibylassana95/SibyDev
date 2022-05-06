package com.example.myapplication.HTML;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.R;

public class Html_cours extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_html_cours);
        Button cour1=findViewById(R.id.cour1_html);
        Button cour2=findViewById(R.id.cour2_html);
        Button cour3=findViewById(R.id.cour3_html);
        Button cour4=findViewById(R.id.cour4_html);
        Button cour5=findViewById(R.id.cour5_html);
        Button cour6=findViewById(R.id.cour6_html);
        Button cour7=findViewById(R.id.cour7_html);
        Button cour8=findViewById(R.id.cour8_html);
        Button cour9=findViewById(R.id.cour9_html);
        Button cour10=findViewById(R.id.cour10_html);


        cour1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), Cour1.class);
                intent.putExtra("pdf_url","https://drive.google.com/file/d/1eXc4EVpftGubPuFjGISKsuu-_RV_PhAJ/view?usp=sharing");
                startActivity(intent);
            }
        });
        cour2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), Cour2.class);
                intent.putExtra("pdf_url","https://drive.google.com/file/d/1Iu9J_UndYiT9QtwBJCllVw1ZyT35HLW3/view?usp=sharing");
                startActivity(intent);
            }
        });
        cour3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), Cour3.class);
                intent.putExtra("pdf_url","https://drive.google.com/file/d/1oeMOpO5IJfdmH05ny0F5QH4spCXy6jHE/view?usp=sharing");
                startActivity(intent);
            }
        });

        cour4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), Cour4.class);
                intent.putExtra("pdf_url","https://drive.google.com/file/d/1P210xk3NRqzmcjTTCc88DvtQ4HF8SWEk/view?usp=sharing");
                startActivity(intent);
            }
        });
        cour5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), Cour5.class);
                intent.putExtra("pdf_url","https://drive.google.com/file/d/1TmsApoaqRiuN847ANzwesd9U1coVn9WD/view?usp=sharing");
                startActivity(intent);
            }
        });

        cour6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), Cour6.class);
                intent.putExtra("pdf_url","https://drive.google.com/file/d/1C5GjFt16OcKiR-9bdAFG26sqOgAm1KQr/view?usp=sharing");
                startActivity(intent);
            }

        });
        cour7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), Cour7.class);
                intent.putExtra("pdf_url","https://drive.google.com/file/d/1TPEWs59zHFHLt7ZREg-70ITyXqxho_5b/view?usp=sharing");
                startActivity(intent);
            }

        });
        cour8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), Cour8.class);
                intent.putExtra("pdf_url","https://drive.google.com/file/d/1pZ8kSlojUZj7wEQOG8f4hkwhfWcypgYI/view?usp=sharing");
                startActivity(intent);
            }

        });
        cour9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), Cour9.class);
                intent.putExtra("pdf_url","https://drive.google.com/file/d/1GRYXOTY8Ow3-JB5aPT5xgkIBkkprnXE7/view?usp=sharing");
                startActivity(intent);
            }

        });
        cour10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), Cour10.class);
                intent.putExtra("pdf_url","https://drive.google.com/file/d/1Sr3xQbynzeSM-oJIxk2fYi-djgDlgnf4/view?usp=sharing");
                startActivity(intent);
            }

        });


    }
}