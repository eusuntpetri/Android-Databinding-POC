package com.codegile.paul.databindingpoc.ui;

import android.content.Context;
import android.databinding.OnRebindCallback;
import android.databinding.ViewDataBinding;
import android.support.transition.TransitionManager;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.codegile.paul.databindingpoc.BR;

/**
 * Created by Paul on 10-Feb-17.
 */

public abstract class BaseView<ViewBinding extends ViewDataBinding, ViewModel, ActionHandler> extends FrameLayout {

    protected ViewBinding mViewBinding;
    protected ViewModel mViewModel;
    protected ActionHandler mActionHandler;

    public BaseView(Context context, AttributeSet attrs) {
        super(context, attrs);
        if (isInEditMode()) return;
        this.mViewBinding = getViewBinding();
    }

    protected void enableTransitionAnimations() {
        this.mViewBinding.addOnRebindCallback(new OnRebindCallback<ViewBinding>() {
            @Override
            public boolean onPreBind(ViewBinding binding) {
                TransitionManager.beginDelayedTransition((ViewGroup) mViewBinding.getRoot());
                return super.onPreBind(binding);
            }
        });
    }

    protected abstract ViewBinding getViewBinding();

    public void setViewModel(ViewModel viewModel) {
        mViewBinding.setVariable(BR.vm, viewModel);
    }

    public void setActionHandler(ActionHandler actionHandler) {
        mViewBinding.setVariable(BR.actionHandler, actionHandler);
    }
}
