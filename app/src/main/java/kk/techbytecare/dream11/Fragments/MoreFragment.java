package kk.techbytecare.dream11.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import kk.techbytecare.dream11.R;

public class MoreFragment extends Fragment {


    public MoreFragment() {
        // Required empty public constructor
    }

    public static MoreFragment getInstance()    {
        return new MoreFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_more, container, false);
    }

}
