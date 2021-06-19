package com.example.fragmentmanager;

import android.os.Bundle;

import androidx.annotation.LongDef;
import androidx.fragment.app.Fragment;

import android.os.Message;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class BlankFragment extends Fragment {


    private static final String TAG = "BlankFragment";
    private View rootView;


    public BlankFragment() {
        // Required empty public constructor
    }

    private IFragmentCallback fragmentCallback;
    public void setFragmentCallback(IFragmentCallback callback){
        fragmentCallback = callback;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = this.getArguments();
        String string = bundle.getString("message");
        Log.d(TAG, "onCreate: "+string);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (rootView == null){
            rootView = inflater.inflate(R.layout.fragment_blank, container, false);
        }
        Button btn = rootView.findViewById(R.id.btn_callback);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                fragmentCallback.sendMsgToActivity("Hello,I'm from fragment");
                String msg = fragmentCallback.getMsgFromActivity("null");
                Toast.makeText(BlankFragment.this.getContext(),msg,Toast.LENGTH_SHORT).show();
            }
        });
        return rootView;
    }
}