package com.example.cardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.media.AudioManager;
import android.os.Bundle;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    CardView mCardView;
    SeekBar seekBar1;
    SeekBar seekBar2;
    SeekBar seekBar3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        assignViews();
    }

    private void assignViews() {
        mCardView = (CardView) findViewById(R.id.cv_demo);
        // 找到SeekBar
        seekBar1 = (SeekBar) findViewById(R.id.seekbar1);
        seekBar2 = (SeekBar) findViewById(R.id.seekbar2);
        seekBar3 = (SeekBar) findViewById(R.id.seekbar3);

        seekBar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // 拖动停止时调用
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // 拖动开始时调用

            }

            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                // 拖动改变时调用
                // 控制圆角的大小
                mCardView.setRadius(i);//返回的i为px
            }
        });

        seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // 拖动停止时调用
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // 拖动开始时调用

            }

            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                // 拖动改变时调用
                // 控制阴影的大小
                mCardView.setCardElevation(i);//返回的i为px
            }
        });

        seekBar3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // 拖动停止时调用
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // 拖动开始时调用

            }

            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                // 拖动改变时调用
                // 控制图片的间距
                mCardView.setContentPadding(i,i,i,i);//返回的i为px
            }
        });
    }
}