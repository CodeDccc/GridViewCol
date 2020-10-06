package edu.temple.gridviewcol;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;

import java.util.ArrayList;

public class PaletteActivity extends AppCompatActivity {

    ArrayList<String> col;
    View bgCol;
    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        gridView = findViewById(R.id.gridView);
        bgCol = findViewById(R.id.bgCol);
        col = new ArrayList<>();
        fillArrayList ();
        final BaseAdapter adapter = new CustomAdapter(this, col);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (parent.getItemAtPosition(position).toString().equals("BLACK")) {
                    bgCol.setBackgroundColor(Color.BLACK);
                } else if (parent.getItemAtPosition(position).toString().equals("GREEN")) {
                    bgCol.setBackgroundColor(Color.GREEN);
                } else if (parent.getItemAtPosition(position).toString().equals("GRAY")) {
                    bgCol.setBackgroundColor(Color.GRAY);
                } else if (parent.getItemAtPosition(position).toString().equals("DARK GRAY")) {
                    bgCol.setBackgroundColor(Color.DKGRAY);
                } else if (parent.getItemAtPosition(position).toString().equals("CYAN")) {
                    bgCol.setBackgroundColor(Color.CYAN);
                } else if (parent.getItemAtPosition(position).toString().equals("RED")) {
                    bgCol.setBackgroundColor(Color.RED);
                } else if (parent.getItemAtPosition(position).toString().equals("MAGENTA")) {
                    bgCol.setBackgroundColor(Color.MAGENTA);
                } else if (parent.getItemAtPosition(position).toString().equals("LIGHT GRAY")) {
                    bgCol.setBackgroundColor(Color.LTGRAY);
                } else if (parent.getItemAtPosition(position).toString().equals("BLUE")) {
                    bgCol.setBackgroundColor(Color.BLUE);
                } else if (parent.getItemAtPosition(position).toString().equals("YELLOW")) {
                    bgCol.setBackgroundColor(Color.YELLOW);
                }
            }
        });
    }

    private void fillArrayList() {
        col.add("BLACK");
        col.add("BLUE");
        col.add("GREEN");
        col.add("DARK GRAY");
        col.add("YELLOW");
        col.add("CYAN");
        col.add("GRAY");
        col.add("MAGENTA");
        col.add("LIGHT GRAY");
        col.add("RED");
    }
}