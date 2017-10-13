package com.example.machenike.listfragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by MACHENIKE on 2017/9/14.
 */

public class MyAdapter extends BaseAdapter {

    private List<String> mList;

    public MyAdapter(List<String> list) {
        mList = list;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHold viewHold;
        if (view==null){
            viewHold = new ViewHold();
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_layout, null);
            viewHold.mTextView= view.findViewById(R.id.tv);
            view.setTag(viewHold);

        }else {
            viewHold = (ViewHold) view.getTag();
        }
        viewHold.mTextView.setText(mList.get(i));

        return view;
    }

    static class ViewHold{
        TextView mTextView;
    }
}
