package com.codegile.paul.databindingpoc.ui.main.views.second;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;

import com.codegile.paul.databindingpoc.databinding.MainActivitySecondViewBinding;
import com.codegile.paul.databindingpoc.ui.BaseView;

/**
 * Created by Paul on 10-Feb-17.
 */

public class MainActivitySecondView
        extends BaseView<MainActivitySecondViewBinding, MainActivitySecondViewModel, MainActivitySecondView.ActionHandler> {

    public interface ActionHandler {
        void onSwitchThirdViewVisibleClick();
    }

    public MainActivitySecondView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected MainActivitySecondViewBinding getViewBinding() {
        return MainActivitySecondViewBinding.inflate(LayoutInflater.from(getContext()), this, true);
    }
}
