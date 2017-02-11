package com.codegile.paul.databindingpoc.ui.recycler;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.codegile.paul.databindingpoc.BR;

/**
 * Created by Paul on 11-Feb-17.
 */

public abstract class BaseRecyclerAdapter extends RecyclerView.Adapter<BaseRecyclerAdapter.ViewHolder> {

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int layoutId) {
        LayoutInflater layoutInflater =
                LayoutInflater.from(parent.getContext());
        ViewDataBinding binding = DataBindingUtil.inflate(
                layoutInflater, layoutId, parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Object item = getObjForPosition(position);
        holder.bind(item);
    }

    @Override
    public int getItemViewType(int position) {
        return getLayoutIdForPosition(position);
    }

    protected abstract Object getObjForPosition(int position);

    protected abstract int getLayoutIdForPosition(int position);

    public class ViewHolder extends RecyclerView.ViewHolder {

        private final ViewDataBinding binding;

        public ViewHolder(ViewDataBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(Object item) {
            binding.setVariable(BR.item, item);
            binding.executePendingBindings();
        }
    }
}