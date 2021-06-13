    package com.example.progressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

    public class MainActivity extends AppCompatActivity {
        private ProgressBar pb1;
        private ProgressBar pb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pb1 = findViewById(R.id.pb1);
        pb2 = findViewById(R.id.pb2);
    }

        public void viewClick(View view) {
        if(pb1.getVisibility()==View.GONE){
            pb1.setVisibility(View.VISIBLE);
        }else{
            pb1.setVisibility(View.GONE);
        }
    }

        public void load(View view) {
            int progress = pb2.getProgress();
            progress = progress+10;
            pb2.setProgress(progress);
        }
    }