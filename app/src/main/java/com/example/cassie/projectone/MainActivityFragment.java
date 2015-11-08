package com.example.cassie.projectone;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {
    private GridView Gridview_Movies1;
    private int[] ids;
    public MainActivityFragment() {
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        Gridview_Movies1 = (GridView) rootView. findViewById(R.id.Gridview_Movies);
        ArrayAdapter<String> mMoviesAdapter= new ArrayAdapter<String>(
                getActivity(),
                R.layout.grid_fragment,
                R.id.imageView_Movies,
                ids[]);
        GridView listView = (GridView) rootView.findViewById(
                R.id.Gridview_Movies);
        listView.setAdapter(mMoviesAdapter);
        return rootView;
    }
}
