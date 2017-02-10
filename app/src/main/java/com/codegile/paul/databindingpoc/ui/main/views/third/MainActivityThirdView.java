package com.codegile.paul.databindingpoc.ui.main.views.third;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;

import com.codegile.paul.databindingpoc.databinding.MainActivityThirdViewBinding;
import com.codegile.paul.databindingpoc.ui.BaseView;

/**
 * Created by Paul on 10-Feb-17.
 */

public class MainActivityThirdView
        extends BaseView<MainActivityThirdViewBinding, MainActivityThirdViewModel, MainActivityThirdView.ActionHandler> {

    public interface ActionHandler {
        void onHideThirdViewClick();

        void onStartSecondaryActivityClick();
    }

    public MainActivityThirdView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected MainActivityThirdViewBinding getViewBinding() {
        return MainActivityThirdViewBinding.inflate(LayoutInflater.from(getContext()), this, true);
    }
}
