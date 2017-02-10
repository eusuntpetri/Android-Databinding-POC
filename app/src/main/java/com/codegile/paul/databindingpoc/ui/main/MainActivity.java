package com.codegile.paul.databindingpoc.ui.main;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.codegile.paul.databindingpoc.R;
import com.codegile.paul.databindingpoc.ui.main.views.first.MainActivityFirstView;
import com.codegile.paul.databindingpoc.ui.main.views.first.MainActivityFirstViewModel;
import com.codegile.paul.databindingpoc.ui.main.views.second.MainActivitySecondView;
import com.codegile.paul.databindingpoc.ui.main.views.second.MainActivitySecondViewModel;
import com.codegile.paul.databindingpoc.ui.main.views.third.MainActivityThirdView;
import com.codegile.paul.databindingpoc.ui.main.views.third.MainActivityThirdViewModel;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Paul on 10-Feb-17.
 */

public class MainActivity extends AppCompatActivity implements MainContract.View {

    private MainContract.Presenter mPresenter;
    private MainActivityFirstViewModel mFirstViewModel;
    private MainActivitySecondViewModel mSecondViewModel;
    private MainActivityThirdViewModel mThirdViewModel;

    @Bind(R.id.first_view)
    MainActivityFirstView mFirstView;
    @Bind(R.id.second_view)
    MainActivitySecondView mSecondView;
    @Bind(R.id.third_view)
    MainActivityThirdView mThirdView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        this.mFirstViewModel = new MainActivityFirstViewModel();
        this.mSecondViewModel = new MainActivitySecondViewModel();
        mSecondViewModel.setFirstViewModel(mFirstViewModel);
        this.mThirdViewModel = new MainActivityThirdViewModel();
        this.mPresenter = new MainPresenter(this);
        this.mFirstView.setViewModel(mFirstViewModel);
        this.mFirstView.setActionHandler(mPresenter);
        this.mSecondView.setViewModel(mSecondViewModel);
        this.mSecondView.setActionHandler(mPresenter);
        this.mThirdView.setViewModel(mThirdViewModel);
        this.mThirdView.setActionHandler(mPresenter);
    }

    @Override
    public void setText(String string) {
        mFirstViewModel.setString(string);
    }

    @Override
    public void switchFlag() {
        mFirstViewModel.setFlag(!mFirstViewModel.getFlag());
    }

    @Override
    public void switchThirdViewVisibility() {
        mThirdViewModel.setViewIsShown(!mThirdViewModel.isViewIsShown());
    }

    @Override
    public void hideThirdView() {
        mThirdViewModel.setViewIsShown(false);
    }
}
