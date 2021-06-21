package com.example.viewpagerandfragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ViewPageAdapater extends RecyclerView.Adapter<ViewPageAdapater.ViewPagerViewHolder> {
    private List<String> titles = new ArrayList<>();

    public ViewPageAdapater(){
        titles.add("hello1");
        titles.add("hello2");
        titles.add("hello3");
        titles.add("hello4");
        titles.add("hello5");
        titles.add("hello6");
        titles.add("hello7");
        titles.add("hello8");
        titles.add("hello9");
        titles.add("hello10");
    }

    @NonNull
    @Override
    public ViewPagerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewPagerViewHolder(LayoutInflater.from(parent.getContext()).inflate
                (R.layout.item_pager,parent,false));

    }

    @Override
    public void onBindViewHolder(@NonNull ViewPagerViewHolder holder, int position) {
        holder.mTv.setText(titles.get(position));
    }

    @Override
    public int getItemCount() {

        return 10;
    }

    class ViewPagerViewHolder extends RecyclerView.ViewHolder{

        TextView mTv;
        RelativeLayout mContainer;

        public ViewPagerViewHolder(@NonNull View itemView) {
            super(itemView);
            mContainer =itemView.findViewById(R.id.contain);
            mTv = itemView.findViewById(R.id.tvTitle);
        }
    }
}
