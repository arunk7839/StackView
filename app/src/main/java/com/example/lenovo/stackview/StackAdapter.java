package com.example.lenovo.stackview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class StackAdapter extends BaseAdapter {

    List<StackItem> items;
    Context context;

    public StackAdapter(Context context, List<StackItem> items) {
        this.items = items;
        this.context = context;
    }

    @Override
    public long getItemId(int pos) {
        return pos;
    }

    @Override
    public StackItem getItem(int i) {
        return items.get(i);
    }

    @Override
    public int getCount() {
        //it will return the size of items.....
        return items.size();
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if (v == null) {
            v = LayoutInflater.from(context).inflate(R.layout.stack_item, parent, false);
        }

        StackItem item = items.get(position);
        if (item != null) {
            ImageView imageView = (ImageView) v.findViewById(R.id.img);
            TextView textView = (TextView) v.findViewById(R.id.tv);
            imageView.setImageResource(item.getImageResourseId());
            textView.setText(item.getText());
        }
        return v;
    }
}
