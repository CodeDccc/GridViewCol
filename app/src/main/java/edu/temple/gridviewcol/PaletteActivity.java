package edu.temple.gridviewcol;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.Objects;

public class PaletteActivity extends AppCompatActivity {


    View bgCol;
    GridView gridView;
    View textView;
    int coll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources res = getResources();
        final String[] gridLabels = res.getStringArray(R.array.color_array);

        final Intent newIntent = new Intent(this, CanvasActivity.class);


        textView = findViewById(R.id.textView);
        gridView = findViewById(R.id.gridView);
        bgCol = findViewById(R.id.bgCol);

        final BaseAdapter adapter = new CustomAdapter(this, gridLabels);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (parent.getItemAtPosition(position).equals("BLACK")||parent.getItemAtPosition(position).equals("NOIR")) {
                    coll = Color.BLACK;
                   newIntent.putExtra("color", coll);
                    //newIntent.putExtra("text", col.get(position));
                    newIntent.putExtra("text", gridLabels[position]);
                    startActivity(newIntent);
                } else if (parent.getItemAtPosition(position).toString().equals("GREEN")||parent.getItemAtPosition(position).equals("NOIR")) {
                    coll = Color.GREEN;
                    newIntent.putExtra("color", coll);
                    newIntent.putExtra("text", gridLabels[position] );
                    startActivity(newIntent);
                } else if (parent.getItemAtPosition(position).toString().equals("GRAY")||parent.getItemAtPosition(position).equals("NOIR")) {
                    coll = Color.GRAY;
                    newIntent.putExtra("color", coll);
                    newIntent.putExtra("text", gridLabels[position]);
                    startActivity(newIntent);
                } else if (parent.getItemAtPosition(position).toString().equals("DARK GRAY")||parent.getItemAtPosition(position).equals("NOIR")) {
                    coll = Color.DKGRAY;
                    newIntent.putExtra("color", coll);
                    newIntent.putExtra("text", gridLabels[position]);
                    startActivity(newIntent);
                } else if (parent.getItemAtPosition(position).toString().equals("CYAN")||parent.getItemAtPosition(position).equals("NOIR")) {
                    coll = Color.CYAN;
                    newIntent.putExtra("color", coll);
                    newIntent.putExtra("text", gridLabels[position]);
                    startActivity(newIntent);
                } else if (parent.getItemAtPosition(position).toString().equals("RED")||parent.getItemAtPosition(position).equals("NOIR")) {
                    coll = Color.RED;
                    newIntent.putExtra("color", coll);
                    newIntent.putExtra("text", gridLabels[position]);
                    startActivity(newIntent);
                } else if (parent.getItemAtPosition(position).toString().equals("MAGENTA")||parent.getItemAtPosition(position).equals("NOIR")) {
                    coll = Color.MAGENTA;
                    newIntent.putExtra("color", coll);
                    newIntent.putExtra("text", gridLabels[position]);
                    startActivity(newIntent);
                } else if (parent.getItemAtPosition(position).toString().equals("LIGHT GRAY")||parent.getItemAtPosition(position).equals("NOIR")) {
                    coll = Color.LTGRAY;
                    newIntent.putExtra("color", coll);
                    newIntent.putExtra("text", gridLabels[position]);
                    startActivity(newIntent);
                } else if (parent.getItemAtPosition(position).toString().equals("BLUE")||parent.getItemAtPosition(position).equals("NOIR")) {
                    coll = Color.BLUE;
                    newIntent.putExtra("color", coll);
                    newIntent.putExtra("text", gridLabels[position]);
                    startActivity(newIntent);
                } else if (parent.getItemAtPosition(position).toString().equals("YELLOW")||parent.getItemAtPosition(position).equals("NOIR")) {
                    coll = Color.YELLOW;
                    newIntent.putExtra("color", coll);
                    newIntent.putExtra("text", gridLabels[position]);
                    startActivity(newIntent);
                }else if (parent.getItemAtPosition(position).toString().equals("WHITE")||parent.getItemAtPosition(position).equals("NOIR")) {
                    coll = Color.WHITE;
                    newIntent.putExtra("color", coll);
                    newIntent.putExtra("text", gridLabels[position]);
                    startActivity(newIntent);
                }else if (parent.getItemAtPosition(position).toString().equals("ORANGE")||parent.getItemAtPosition(position).equals("NOIR")) {
                    coll =  getResources().getColor(R.color.ORANGE, null);
                    newIntent.putExtra("color", coll);
                    newIntent.putExtra("text", gridLabels[position]);
                    startActivity(newIntent);
                }else if (parent.getItemAtPosition(position).toString().equals("ROSY BROWN")||parent.getItemAtPosition(position).equals("NOIR")) {
                    coll =  getResources().getColor(R.color.RSYBROWN, null);
                    newIntent.putExtra("color", coll);
                    newIntent.putExtra("text", gridLabels[position]);
                    startActivity(newIntent);
                }else if (parent.getItemAtPosition(position).toString().equals("CHOCOLATE")||parent.getItemAtPosition(position).equals("NOIR")) {
                    coll =  getResources().getColor(R.color.CHOCOLATE, null);
                    newIntent.putExtra("color", coll);
                    newIntent.putExtra("text", gridLabels[position]);
                    startActivity(newIntent);
                }else if (parent.getItemAtPosition(position).toString().equals("DEEP PINK")||parent.getItemAtPosition(position).equals("NOIR")) {
                    coll =  getResources().getColor(R.color.DPINK, null);
                    newIntent.putExtra("color", coll);
                    newIntent.putExtra("text", gridLabels[position]);
                    startActivity(newIntent);
                }else if (parent.getItemAtPosition(position).toString().equals("PURPLE")) {
                    coll =  getResources().getColor(R.color.PURPLE, null);
                    newIntent.putExtra("color", coll);
                    newIntent.putExtra("text", gridLabels[position]);
                    startActivity(newIntent);
                }else if (parent.getItemAtPosition(position).toString().equals("OLIVE")||parent.getItemAtPosition(position).equals("NOIR")) {
                    coll = getResources().getColor(R.color.OLIVE, null);
                    newIntent.putExtra("color", coll);
                    newIntent.putExtra("text", gridLabels[position]);
                    startActivity(newIntent);
                }else if (parent.getItemAtPosition(position).toString().equals("CADET BLUE")||parent.getItemAtPosition(position).equals("NOIR")) {
                    coll =  getResources().getColor(R.color.CBLUE, null);
                    newIntent.putExtra("color", coll);
                    newIntent.putExtra("text", gridLabels[position]);
                    startActivity(newIntent);
                }
            }
        });
    }
}
