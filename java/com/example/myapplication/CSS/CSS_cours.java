package com.example.myapplication.CSS;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.HTML.Cour2;
import com.example.myapplication.R;

public class CSS_cours extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_css_cours);
        Button cour1=findViewById(R.id.cour1_css);
        Button cour2=findViewById(R.id.cour2_css);
        Button cour3=findViewById(R.id.cour3_css);
        Button cour4=findViewById(R.id.cour4_css);
        Button cour5=findViewById(R.id.cour5_css);
        Button cour6=findViewById(R.id.cour6_css);
        Button cour7=findViewById(R.id.cour7_css);
        Button cour8=findViewById(R.id.cour8_css);
        Button cour9=findViewById(R.id.cour9_css);
        Button cour10=findViewById(R.id.cour10_css);
        cour1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), Cour1.class);
                intent.putExtra("pdf_url","https://drive.google.com/file/d/1GDw_UzjE5rTLriwcZ9Lw5BX3Vo-t3jDs/view?usp=sharing");
                startActivity(intent);
            }
        });
        cour2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), com.example.myapplication.CSS.Cour2.class);
                intent.putExtra("pdf_url","https://drive.google.com/file/d/1vgI55xaPOjM1KJOpmadvVv1b-ucNCtEr/view?usp=sharing");
                startActivity(intent);
            }
        });
        cour3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), Cour3.class);
                intent.putExtra("pdf_url","https://drive.google.com/file/d/1ptKel3j1GR2Fti7MCvXzQk96nnpk5J1V/view?usp=sharing");
                startActivity(intent);
            }
        });
        cour4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), Cour4.class);
                intent.putExtra("pdf_url","https://drive.google.com/file/d/1komuPsTekZdQAsXb-E7BwLgy6JqQyXeI/view?usp=sharing");
                startActivity(intent);
            }
        });
        cour5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), Cour5.class);
                intent.putExtra("pdf_url","https://drive.google.com/file/d/1kxPnUuEDiak8TMbnCo6qu1mSqPt3tdeX/view?usp=sharing");
                startActivity(intent);
            }
        });
        cour6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), Cour6.class);
                intent.putExtra("pdf_url","https://drive.google.com/file/d/12SGyxUgZJv3IKRsROkSBrRzz5EHC0lOT/view?usp=sharing");
                startActivity(intent);
            }
        });
        cour7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), Cour7.class);
                intent.putExtra("pdf_url","https://drive.google.com/file/d/1KnbKuBIpAaZANltgwkRa4pbydZhkDLL4/view?usp=sharing");
                startActivity(intent);
            }
        });
        cour8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), Cour8.class);
                intent.putExtra("pdf_url","https://drive.google.com/file/d/1DqBIvF8Dn57rCg3bvIzwmYIpykZzsi_Y/view?usp=sharing");
                startActivity(intent);
            }
        });
        cour9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), Cour9.class);
                intent.putExtra("pdf_url","https://drive.google.com/file/d/1KWLeijdVmxbJHjZAk5FZ8yX3h_O-VB2s/view?usp=sharing");
                startActivity(intent);
            }
        });
        cour10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), Cour10.class);
                intent.putExtra("pdf_url","https://drive.google.com/file/d/1Y-RvUiFhyR9I78aw4DwzKKFbF6AC1Dpg/view?usp=sharing");
                startActivity(intent);
            }
        });


    }
}