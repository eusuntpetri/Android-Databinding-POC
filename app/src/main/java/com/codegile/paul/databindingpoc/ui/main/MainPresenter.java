package com.codegile.paul.databindingpoc.ui.main;

/**
 * Created by Paul on 10-Feb-17.
 */

public class MainPresenter implements MainContract.Presenter {

    private MainContract.View mView;

    public MainPresenter(MainContract.View view) {
        this.mView = view;
    }

    @Override
    public void onChangeTextClick() {
        String string = String.valueOf((int) (Math.random() * 10000));
        mView.setText("New text: " + string);
    }

    @Override
    public void onSwitchFlagClick() {
        mView.switchFlag();
    }

    @Override
    public void onSwitchThirdViewVisibleClick() {
        mView.switchThirdViewVisibility();
    }

    @Override
    public void onHideThirdViewClick() {
        mView.hideThirdView();
    }

    @Override
    public void onStartSecondaryActivityClick() {
        mView.startSecondaryActivity();
    }
}
