package com.example.harshgupta.find_it;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tx1,tx2,txt3,txt4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         tx1 = (TextView) findViewById(R.id.textView7);
         tx2=(TextView)findViewById(R.id.textView8);
        txt3=(TextView)findViewById(R.id.textView9);
        txt4=(TextView)findViewById(R.id.textView6);
            tx1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k=new Intent(MainActivity.this,child.class);
                    startActivity(k);
                }
            });

        tx2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k=new Intent(MainActivity.this,teen.class);
                startActivity(k);
            }
        });
        txt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k=new Intent(MainActivity.this,adult.class);
                startActivity(k);
            }
        });
        txt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k=new Intent(MainActivity.this,old.class);
                startActivity(k);
            }
        });
    }
}
