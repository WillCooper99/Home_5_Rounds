package com.example.home5rounds.ui.upper;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.home5rounds.R;

public class UpperPlanFragment extends Fragment {

    private UpperPlanViewModel upperPlanViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        upperPlanViewModel =
                ViewModelProviders.of(this).get(UpperPlanViewModel.class);
        return inflater.inflate(R.layout.fragment_upper, container, false);
    }
}