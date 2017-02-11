package com.codegile.paul.databindingpoc.ui.main;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;

import com.codegile.paul.databindingpoc.R;
import com.codegile.paul.databindingpoc.ui.main.views.first.MainActivityFirstView;
import com.codegile.paul.databindingpoc.ui.main.views.first.MainActivityFirstViewModel;
import com.codegile.paul.databindingpoc.ui.main.views.second.MainActivitySecondView;
import com.codegile.paul.databindingpoc.ui.main.views.second.MainActivitySecondViewModel;
import com.codegile.paul.databindingpoc.ui.main.views.shapes.MainActivityShapesView;
import com.codegile.paul.databindingpoc.ui.main.views.third.MainActivityThirdView;
import com.codegile.paul.databindingpoc.ui.main.views.third.MainActivityThirdViewModel;
import com.codegile.paul.databindingpoc.ui.secondary.SecondaryActivity;

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
    private MainActivityShapesViewModel mShapesViewModel;

    @Bind(R.id.first_view)
    MainActivityFirstView mFirstView;
    @Bind(R.id.second_view)
    MainActivitySecondView mSecondView;
    @Bind(R.id.third_view)
    MainActivityThirdView mThirdView;
    @Bind(R.id.shapes_view)
    MainActivityShapesView mShapesView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main_activity);
        ButterKnife.bind(this);

        this.mFirstViewModel = new MainActivityFirstViewModel();
        this.mSecondViewModel = new MainActivitySecondViewModel();
        this.mSecondViewModel.setFirstViewModel(mFirstViewModel);
        this.mThirdViewModel = new MainActivityThirdViewModel();
        this.mShapesViewModel = new MainActivityShapesViewModel();
        this.mPresenter = new MainPresenter(this);
        this.mFirstView.setViewModel(mFirstViewModel);
        this.mFirstView.setActionHandler(mPresenter);
        this.mSecondView.setViewModel(mSecondViewModel);
        this.mSecondView.setActionHandler(mPresenter);
        this.mThirdView.setViewModel(mThirdViewModel);
        this.mThirdView.setActionHandler(mPresenter);
        this.mShapesView.setViewModel(mShapesViewModel);
        this.mShapesView.setActionHandler(mPresenter);
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

    @Override
    public void randomizeShapePositions() {
        DisplayMetrics displaymetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        int width = displaymetrics.widthPixels - 300;
        int height = displaymetrics.heightPixels - 300;
        mShapesViewModel.randomizeVisibleShapePositions(width, height);
    }

    @Override
    public void swapActiveShape() {
        mShapesViewModel.swapShapeVisibility();
    }

    @Override
    public void startSecondaryActivity() {
        startActivity(new Intent(MainActivity.this, SecondaryActivity.class));
    }
}
