package com.example.dictionaryapplication;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class OutputFragment extends Fragment {

    TextView outputText;
    String searchTerm;

    public static OutputFragment newInstance(String outputString){
        OutputFragment outputFragment = new OutputFragment();
        Bundle args = new Bundle();
        args.putString("outputstring", outputString);
        outputFragment.setArguments(args);
        return outputFragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_layout, container, false);
        outputText = view.findViewById(R.id.output_label);

        if(getArguments()!=null) {
            searchTerm = getArguments().getString("outputstring");
        }

        outputText.setText(searchTerm);

        return view;
    }
}
