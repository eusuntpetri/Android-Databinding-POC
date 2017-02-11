package com.codegile.paul.databindingpoc.ui.tertiary;

/**
 * Created by Paul on 11-Feb-17.
 */

public class TertiaryPresenter implements TertiaryContract.Presenter {

    private TertiaryContract.View mView;

    public TertiaryPresenter(TertiaryContract.View view) {
        this.mView = view;
    }

    @Override
    public void onAddItemClick() {
        mView.addNewItem();
    }

    @Override
    public void onRefreshVmClick() {
        mView.setNewItems();
    }
}
