package com.codegile.paul.databindingpoc.ui.tertiary;

/**
 * Created by Paul on 11-Feb-17.
 */

public interface TertiaryContract {

    interface Presenter {

        void onAddItemClick();

        void onRefreshVmClick();
    }

    interface View {

        void addNewItem();

        void setNewItems();
    }
}
