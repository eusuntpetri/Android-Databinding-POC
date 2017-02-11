package com.codegile.paul.databindingpoc.ui.secondary;

/**
 * Created by Paul on 10-Feb-17.
 */

public class SecondaryPresenter implements SecondaryContract.Presenter {

    private SecondaryContract.View mView;

    public SecondaryPresenter(SecondaryContract.View view) {
        this.mView = view;
    }

    @Override
    public void onClearClick() {
        mView.toastAndClearText();
    }

    @Override
    public void onStartTertiaryActivityClick() {
        mView.startTertiaryActivity();
    }
}
