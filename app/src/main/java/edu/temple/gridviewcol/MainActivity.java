package edu.temple.gridviewcol;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;


import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements PaletteFragment.ColorSelectable {
    String[] gridLabels;
   // Fragment canvasFragment;
    CanvasFragment canvasFragment;
    View bgCol;
    GridView gridView;
    View textView;
    int[] col;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Resources res = getResources();
        /*col = new int[]{Color.BLACK,Color.BLUE,Color.GREEN,Color.YELLOW,Color.CYAN,Color.GRAY,
                getResources().getColor(R.color.OLIVE, null),Color.MAGENTA,getResources().getColor(R.color.PURPLE, null),
                Color.RED,Color.WHITE,getResources().getColor(R.color.ORANGE, null),
                getResources().getColor(R.color.CHOCOLATE, null),getResources().getColor(R.color.DPINK, null),
                getResources().getColor(R.color.CBLUE, null),Color.LTGRAY,getResources().getColor(R.color.RSYBROWN, null),
                Color.DKGRAY};*/
        gridLabels = res.getStringArray(R.array.color_array);
       // canvasFragment = getSupportFragmentManager().findFragmentById(R.id.container_2);
        canvasFragment = new CanvasFragment();
        //Bundle bundle = new Bundle();
        //bundle
        if(!(getSupportFragmentManager().findFragmentById(R.id.container_1) instanceof PaletteFragment)) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container_1, PaletteFragment.newInstance(getResources().getStringArray(R.array.color_array)))
                    .add(R.id.container_2, canvasFragment)
                    .addToBackStack(null)
                    .commit();
        }
        //getResources().getStringArray(R.array.color_array)


       // final Intent newIntent = new Intent(this, CanvasActivity.class);


       /* textView = findViewById(R.id.textView);
        gridView = findViewById(R.id.gridView);
        bgCol = findViewById(R.id.bgCol);

        final BaseAdapter adapter = new CustomAdapter(this, gridLabels);
        gridView.setAdapter(adapter);*/



              /*ls("BLEU CADET")) {
                    coll =  getResources().getColor(R.color.CBLUE, null);
                    newIntent.putExtra("color", coll);
                    newIntent.putExtra("text", gridLabels[position]);
                    startActivity(newIntent);
                }
            }
        });*/
    }//use parse and change colors///
    @Override
    public void selectColor(String index){
        canvasFragment.show((gridLabels[Integer.parseInt(index)]));
    }
}
    /*public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent intent = new Intent(PaletteActivity.this, CanvasActivity.class);
        intent.putExtra(COLOR_NAME, ((ColorElement) adapterView.getItemAtPosition(i)).getName());
        intent.putExtra(COLOR_VAL, ((ColorElement) adapterView.getItemAtPosition(i)).getColor());
        startActivity(intent);
    }*/
/*<item>BLACK</item>
<item>BLUE</item>
<item>GREEN</item>
<item>YELLOW</item>
<item>CYAN</item>
<item>GRAY</item>*/
/*<item>NOIR</item>
<item>BLEU</item>
<item>VERT</item>
<item>JAUNE</item>
<item>CYAN</item>
<item>GRIS</item>*/
/*<item>MAROON</item>
<item>AQUA</item>
<item>FUCHSIA</item>
<item>LIGHTGRAY</item>
<item>TEAL</item>
<item>DARKGRAY</item>*/
/*<item>BORDEAUX</item>
<item>AQUA</item>
<item>FUCHSIA</item>
<item>GRISCLAIR</item>
<item>SARCELLE</item>
<item>GRISFONCE</item>*/