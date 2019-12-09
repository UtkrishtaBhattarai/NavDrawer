package com.example.navdrawer.ui.areaofcircle;

import android.widget.Button;
import android.widget.EditText;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AreaCircleViewModel extends ViewModel {
    private MutableLiveData<String> mText;


    public AreaCircleViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Area of circle fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
