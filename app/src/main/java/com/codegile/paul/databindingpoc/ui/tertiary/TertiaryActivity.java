package com.codegile.paul.databindingpoc.ui.tertiary;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.codegile.paul.databindingpoc.R;
import com.codegile.paul.databindingpoc.databinding.TertiaryActivityBinding;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import butterknife.ButterKnife;

/**
 * Created by Paul on 11-Feb-17.
 */

public class TertiaryActivity extends AppCompatActivity implements TertiaryContract.View {

    private TertiaryContract.Presenter mPresenter;
    private TertiaryViewModel mViewModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.tertiary_activity);
        ButterKnife.bind(this);

        this.mPresenter = new TertiaryPresenter(this);
        this.mViewModel = new TertiaryViewModel();
        TertiaryActivityBinding binding = TertiaryActivityBinding
                .inflate(LayoutInflater.from(this), (ViewGroup) findViewById(android.R.id.content), true);
        binding.setVm(mViewModel);
        binding.setActionHandler(mPresenter);
    }

    @Override
    public void addNewItem() {
        List<Item> newItems = new ArrayList<>(mViewModel.getItems());
        newItems.add(new Item("New item: " + new Random().nextInt(10000)));
        mViewModel.setItems(newItems);
    }

    @Override
    public void setNewItems() {
        mViewModel.setItems(new TertiaryViewModel().getItems());
    }
}
