package edu.temple.gridviewcol;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.GridView;


public class PaletteFragment extends Fragment {

    private static final String ITEMS_KEY = "items";
    private static final String COLS_KEY = "cols";
    private String[] items;
   // private int[] cols;
    //String[] gridLabels;
    Resources res;
    ColorSelectable parentActivity;
    View bgCol;
    GridView gridView;
    View textView;
    View frame;
    Context context;
    public PaletteFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static PaletteFragment newInstance(String[] items) {
        PaletteFragment fragment = new PaletteFragment();
        Bundle args = new Bundle();
        args.putStringArray(ITEMS_KEY, items);
       // args.putIntArray(COLS_KEY, cols);
        fragment.setArguments(args);
        return fragment;
    }
  //  // = context.getResources();
  @Override
  public void onAttach(@NonNull Context context) {
      super.onAttach(context);

      if(context instanceof ColorSelectable){
          parentActivity = (ColorSelectable) context;
      }
      else{
          throw new RuntimeException("You must implement ColorSelectable interface before attaching this fragment");
      }
  }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            items = getArguments().getStringArray(ITEMS_KEY);
           // mParam2 = getArguments().getString(ARG_PARAM2);
           // res = requireContext().getResources();
          //  cols = getArguments().getIntArray(COLS_KEY);
                    //getString(R.array.color_array);
        }
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        frame = inflater.inflate(R.layout.fragment_palette, container, false);
        textView = frame.findViewById(R.id.textView);
        gridView = frame.findViewById(R.id.gridView);
       // final String[] gridLabels = res.getStringArray(R.array.color_array);
        final BaseAdapter adapter = new CustomAdapter((Context)parentActivity, items);
        gridView.setAdapter(adapter);
       // gridView.setAdapter(new ArrayAdapter<String>((Context) parentActivity, R.layout.support_simple_spinner_dropdown_item, items));
        bgCol = frame.findViewById(R.id.bgCol);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                parentActivity.selectColor((String.valueOf(position)));
            }
        });
         return frame;
    }

    interface ColorSelectable{
        void selectColor(String index);
    }
}


   /* public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent intent = new Intent(PaletteActivity.this, CanvasActivity.class);
        intent.putExtra(COLOR_NAME, ((ColorElement) adapterView.getItemAtPosition(i)).getName());
        intent.putExtra(COLOR_VAL, ((ColorElement) adapterView.getItemAtPosition(i)).getColor());
        startActivity(intent);
    }*/
/*<GridView
        android:id="@+id/gridView"
                android:layout_width="290dp"
                android:layout_height="301dp"
                android:layout_marginStart="80dp"
                android:layout_marginTop="100dp"
                android:layout_marginEnd="80dp"
                android:layout_marginBottom="80dp"
                android:numColumns="3"
                app:layout_constraintBottom_toBottomOf="parent"
                app:layout_constraintEnd_toEndOf="parent"
                app:layout_constraintStart_toStartOf="parent"
                app:layout_constraintTop_toTopOf="parent" />

<TextView
        android:id="@+id/textView2"
                android:layout_width="250dp"
                android:layout_height="48dp"
                android:layout_marginStart="50dp"
                android:layout_marginTop="32dp"
                android:layout_marginEnd="50dp"
                android:text="@string/intro_name"
                android:textSize="25px"
                app:layout_constraintEnd_toEndOf="parent"
                app:layout_constraintHorizontal_bias="0.491"
                app:layout_constraintStart_toStartOf="parent"
                app:layout_constraintTop_toTopOf="parent" />*/