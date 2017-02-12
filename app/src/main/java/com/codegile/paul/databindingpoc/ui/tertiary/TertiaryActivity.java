package com.codegile.paul.databindingpoc.ui.tertiary;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.codegile.paul.databindingpoc.R;
import com.codegile.paul.databindingpoc.databinding.TertiaryActivityBinding;

import java.util.Random;

/**
 * Created by Paul on 11-Feb-17.
 */

public class TertiaryActivity extends AppCompatActivity implements TertiaryContract.View {

    private TertiaryContract.Presenter mPresenter;
    private TertiaryViewModel mViewModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TertiaryActivityBinding binding = DataBindingUtil.setContentView(this, R.layout.tertiary_activity);

        this.mViewModel = new TertiaryViewModel();
        this.mPresenter = new TertiaryPresenter(this);
        binding.setVm(mViewModel);
        binding.setActionHandler(mPresenter);
    }

    @Override
    public void addNewItem() {
        mViewModel.addItem(new Item("New item: " + new Random().nextInt(10000)));
    }

    @Override
    public void setNewItems() {
        mViewModel.setItems(new TertiaryViewModel().getItems());
    }
}
