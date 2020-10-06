package edu.temple.gridviewcol;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CanvasActivity extends AppCompatActivity {
    TextView textView;
    View bgCol;
    int coll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas);

        textView = findViewById(R.id.textView);
        bgCol = findViewById(R.id.bgCol);

        coll = getIntent().getExtras().getInt("color");
        bgCol.setBackgroundColor(coll);
    }
}