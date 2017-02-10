package com.codegile.paul.databindingpoc.ui.main.views.first;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;

import com.codegile.paul.databindingpoc.databinding.MainActivityFirstViewBinding;
import com.codegile.paul.databindingpoc.ui.BaseView;

/**
 * Created by Paul on 10-Feb-17.
 */

public class MainActivityFirstView
        extends BaseView<MainActivityFirstViewBinding, MainActivityFirstViewModel, MainActivityFirstView.ActionHandler> {

    public interface ActionHandler {
        void onChangeTextClick();

        void onSwitchFlagClick();
    }

    public MainActivityFirstView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected MainActivityFirstViewBinding getViewBinding() {
        return MainActivityFirstViewBinding.inflate(LayoutInflater.from(getContext()), this, true);
    }
}
