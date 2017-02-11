package com.codegile.paul.databindingpoc.ui.tertiary;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.codegile.paul.databindingpoc.BR;

/**
 * Created by Paul on 11-Feb-17.
 */

public class Item extends BaseObservable {

    private String name;
    private boolean checked;

    public Item(String name) {
        this.name = name;
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
        notifyPropertyChanged(BR.checked);
    }
}
