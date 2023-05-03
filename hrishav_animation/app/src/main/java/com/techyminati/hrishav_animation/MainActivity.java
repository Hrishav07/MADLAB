package com.techyminati.hrishav_animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean iscod2=true;
    public void alter(View view)
    {
        ImageView imageView=findViewById(R.id.imageView);
        ImageView imageView1=findViewById(R.id.imageView1);
        if(iscod2 ){
            imageView1.animate().alpha(1).setDuration(2000);
            imageView.animate().alpha(0).setDuration(2000);
            iscod2=false;
        }
        else
        {
            imageView.animate().alpha(1).setDuration(2000);
            imageView1.animate().alpha(0).setDuration(2000);
            iscod2=true;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}