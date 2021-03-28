package com.example.home5rounds.ui.lower;

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

public class LowerPlanFragment extends Fragment {

    private LowerPlanViewModel lowerPlanViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        lowerPlanViewModel =
                ViewModelProviders.of(this).get(LowerPlanViewModel.class);
        return inflater.inflate(R.layout.fragment_lower, container, false);
    }
}