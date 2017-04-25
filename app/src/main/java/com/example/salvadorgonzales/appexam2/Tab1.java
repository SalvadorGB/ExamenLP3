package com.example.salvadorgonzales.appexam2;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Salvador Gonzales on 25/04/2017.
 */

public class Tab1 extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle){
        View view = inflater.inflate(R.layout.tab1_usuarios,container,false);
        return view;
    }

}
