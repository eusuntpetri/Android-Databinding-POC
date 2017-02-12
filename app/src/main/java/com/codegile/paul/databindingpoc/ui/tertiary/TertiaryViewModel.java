package com.codegile.paul.databindingpoc.ui.tertiary;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.codegile.paul.databindingpoc.BR;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Paul on 11-Feb-17.
 */

public class TertiaryViewModel extends BaseObservable {

    private List<Item> items = new ArrayList<>();

    public TertiaryViewModel() {
        for (int i = 1; i < 6; i++) {
            items.add(new Item("Item number " + i));
        }
    }

    @Bindable
    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
        notifyPropertyChanged(BR.items);
    }

    public void addItem(Item item) {
        items.add(item);
        notifyPropertyChanged(BR.items);
    }
}
