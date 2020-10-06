package edu.temple.gridviewcol;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {

    int colors[];
    Context context;
    ArrayList<String> col;

    public CustomAdapter(Context context, ArrayList<String> col){
        this.context = context;
        this.col = col;
        colors = new int[10];
        colors[0] = Color.BLACK;
        colors[1] = Color.BLUE;
        colors[2] = Color.GREEN;
        colors[3] = Color.DKGRAY;
        colors[4] = Color.YELLOW;
        colors[5] = Color.CYAN;
        colors[6] = Color.GRAY;
        colors[7] = Color.MAGENTA;
        colors[8] = Color.LTGRAY;
        colors[9] = Color.RED;
       // colors[10] = Color.

    }
    @Override
    public int getCount() {
        return col.size();
    }

    @Override
    public Object getItem(int position) {
        return col.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        TextView textView = new TextView(context);
        textView.setText(getItem(position).toString());
        textView.setBackgroundColor(colors[position % colors.length]);
        textView.setTextSize(20);
        textView.setPadding(10,10,10,10);

        return textView;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent){
        return null;
    }
}


