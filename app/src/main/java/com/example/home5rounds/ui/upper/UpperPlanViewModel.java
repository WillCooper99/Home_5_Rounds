package com.example.home5rounds.ui.upper;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class UpperPlanViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public UpperPlanViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is the upper body fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}