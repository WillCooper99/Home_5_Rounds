package com.example.home5rounds.ui.lower;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LowerPlanViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public LowerPlanViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is lower body fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}