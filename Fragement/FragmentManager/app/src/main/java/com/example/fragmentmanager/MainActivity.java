package com.example.fragmentmanager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = findViewById(R.id.btn_change);
        button1.setOnClickListener(this);
        Button button2 = findViewById(R.id.btn_replace);
        button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_change:
                Bundle bundle = new Bundle();
                bundle.putString("message","Android bundle study");
                BlankFragment bf = new BlankFragment();
                bf.setArguments(bundle);
                bf.setFragmentCallback(new IFragmentCallback() {
                    @Override
                    public void sendMsgToActivity(String msg) {
                        Toast.makeText(MainActivity.this,msg,Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public String getMsgFromActivity(String msg) {
                        return "hello,i am from activity";
                    }
                });
                replaceFragment(bf);
                break;

            case R.id.btn_replace:
                replaceFragment(new ItemFragment());
        }
    }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.frameL,fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}