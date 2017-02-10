package com.codegile.paul.databindingpoc.ui.secondary;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.codegile.paul.databindingpoc.BR;

/**
 * Created by Paul on 10-Feb-17.
 */

public class SecondaryViewModel extends BaseObservable {

    private String text;

    @Bindable
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
        notifyPropertyChanged(BR.text);
    }
}
