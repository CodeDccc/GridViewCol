package edu.temple.gridviewcol;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;


public class PaletteFragment extends Fragment {

    private static final String ITEMS_KEY = "items";
    private String[] items;
    ColorSelectable parentActivity;
    View bgCol;
    GridView gridView;
    View textView;
    View frame;
    public PaletteFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static PaletteFragment newInstance(String[] items) {
        PaletteFragment fragment = new PaletteFragment();
        Bundle args = new Bundle();
        args.putStringArray(ITEMS_KEY, items);
        fragment.setArguments(args);
        return fragment;
    }

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
        }
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        frame = inflater.inflate(R.layout.fragment_palette, container, false);
        textView = frame.findViewById(R.id.textView);
        gridView = frame.findViewById(R.id.gridView);
        final BaseAdapter adapter = new CustomAdapter((Context)parentActivity, items);
        gridView.setAdapter(adapter);
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