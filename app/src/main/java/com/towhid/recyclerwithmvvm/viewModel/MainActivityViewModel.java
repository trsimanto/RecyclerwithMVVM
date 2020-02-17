package com.towhid.recyclerwithmvvm.viewModel;

import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {

    public String additionfuction(String value1, String value2) {
        int num1 = Integer.parseInt(value1);
        int num2 = Integer.parseInt(value2);
        int result = num1 + num2;
        return String.valueOf(result);
    }

}
