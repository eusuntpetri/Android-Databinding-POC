package com.codegile.paul.databindingpoc.ui.main.views.second;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.codegile.paul.databindingpoc.BR;
import com.codegile.paul.databindingpoc.ui.main.views.first.MainActivityFirstViewModel;

/**
 * Created by Paul on 10-Feb-17.
 */

public class MainActivitySecondViewModel extends BaseObservable {

    private MainActivityFirstViewModel firstViewModel;

    @Bindable
    public MainActivityFirstViewModel getFirstViewModel() {
        return firstViewModel;
    }

    public void setFirstViewModel(MainActivityFirstViewModel viewModel) {
        this.firstViewModel = viewModel;
        notifyPropertyChanged(BR.firstViewModel);
    }
}
