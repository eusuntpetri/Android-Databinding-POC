package com.codegile.paul.databindingpoc.ui.main.views.third;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.codegile.paul.databindingpoc.BR;

/**
 * Created by Paul on 10-Feb-17.
 */

public class MainActivityThirdViewModel extends BaseObservable {

    private boolean viewIsShown;

    @Bindable
    public boolean isViewIsShown() {
        return viewIsShown;
    }

    public void setViewIsShown(boolean viewIsShown) {
        this.viewIsShown = viewIsShown;
        notifyPropertyChanged(BR.viewIsShown);
    }
}
