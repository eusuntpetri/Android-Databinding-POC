package com.codegile.paul.databindingpoc.ui.main.views.first;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.codegile.paul.databindingpoc.BR;

/**
 * Created by Paul on 10-Feb-17.
 */

public class MainActivityFirstViewModel extends BaseObservable {

    private String string;
    private boolean flag;

    @Bindable
    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
        notifyPropertyChanged(BR.string);
    }

    @Bindable
    public boolean getFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
        notifyPropertyChanged(BR.flag);
    }
}
