package com.codegile.paul.databindingpoc.ui.recycler;

/**
 * Created by Paul on 11-Feb-17.
 */

public abstract class SingleLayoutRecyclerAdapter extends BaseRecyclerAdapter {
    private final int layoutId;

    public SingleLayoutRecyclerAdapter(int layoutId) {
        this.layoutId = layoutId;
    }

    @Override
    protected int getLayoutIdForPosition(int position) {
        return layoutId;
    }
}
