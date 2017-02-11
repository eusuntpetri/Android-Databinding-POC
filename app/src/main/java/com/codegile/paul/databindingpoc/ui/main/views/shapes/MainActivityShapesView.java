package com.codegile.paul.databindingpoc.ui.main.views.shapes;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;

import com.codegile.paul.databindingpoc.databinding.MainActivityShapesViewBinding;
import com.codegile.paul.databindingpoc.ui.BaseView;

/**
 * Created by Paul on 11-Feb-17.
 */

public class MainActivityShapesView extends BaseView<MainActivityShapesViewBinding, MainActivityShapesViewModel, MainActivityShapesView.ActionHandler> {

    public interface ActionHandler {

        void onRandomizePositionsClick();

        void onSwapViewVisibilityClick();
    }

    public MainActivityShapesView(Context context, AttributeSet attrs) {
        super(context, attrs);
        enableTransitionAnimations();
    }

    @Override
    protected MainActivityShapesViewBinding getViewBinding() {
        return MainActivityShapesViewBinding.inflate(LayoutInflater.from(getContext()), this, true);
    }
}
