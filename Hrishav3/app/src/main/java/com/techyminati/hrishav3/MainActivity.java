package com.techyminati.hrishav3;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean isforza2=true;
    public void alter(View view){

        ImageView iv=findViewById(R.id.imageView6);
        if(isforza2){
            iv.setImageResource(R.drawable.forza);
            isforza2=false;
        }
        else
        {
            iv.setImageResource((R.drawable.forza2));
            isforza2=true;
        }

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}