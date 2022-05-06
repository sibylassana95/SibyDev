package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;

import com.example.myapplication.CSS.CSS_cours;
import com.example.myapplication.HTML.Html_cours;
import com.example.myapplication.JS.JS_cours;
import com.example.myapplication.PHP.Php_cours;


public class MainActivity extends AppCompatActivity {

    GridLayout mainGrid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CardView html=findViewById(R.id.html);
        CardView css=findViewById(R.id.css);
        CardView php=findViewById(R.id.php);
        CardView js=findViewById(R.id.js);

      html.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent intent=new Intent(getApplicationContext(), Html_cours.class);
              startActivity(intent);
          }
      });
        css.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), CSS_cours.class);
                startActivity(intent);
            }
        });
        php.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), Php_cours.class);
                startActivity(intent);
            }
        });
        js.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), JS_cours.class);
                startActivity(intent);
            }
        });
}
}