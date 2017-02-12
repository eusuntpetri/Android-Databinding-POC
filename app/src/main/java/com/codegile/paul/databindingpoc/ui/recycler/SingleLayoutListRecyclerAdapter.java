package com.codegile.paul.databindingpoc.ui.recycler;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;

import com.codegile.paul.databindingpoc.R;

import java.util.List;

/**
 * Created by Paul on 11-Feb-17.
 */

public class SingleLayoutListRecyclerAdapter extends RecyclerView {

    private int itemLayoutId;
    private List items;

    public SingleLayoutListRecyclerAdapter(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        getAttributes(context, attrs);
    }

    private void getAttributes(Context context, AttributeSet attrs) {
        TypedArray a = context.getTheme().obtainStyledAttributes(
                attrs, R.styleable.SingleLayoutListRecyclerAdapter, 0, 0);
        try {
            String fullLayoutName = a.getString(R.styleable.SingleLayoutListRecyclerAdapter_itemLayout);
            String layoutName = fullLayoutName.substring(fullLayoutName.lastIndexOf('/') + 1, fullLayoutName.indexOf(".xml"));
            itemLayoutId = context.getResources().getIdentifier(layoutName, "layout", context.getPackageName());
        } catch (Exception e) {
            Log.e("ATTRS", "Attribute parsing error", e);
        } finally {
            a.recycle();
        }
    }

    public int getItemLayoutId() {
        return itemLayoutId;
    }

    public void setItemLayoutId(int itemLayoutId) {
        this.itemLayoutId = itemLayoutId;
    }

    public List getItems() {
        return items;
    }

    public void setItems(final List items) {
        this.items = items;
        if (getLayoutManager() == null) {
            setLayoutManager(new LinearLayoutManager(getContext()));
        }
        Parcelable state = getLayoutManager().onSaveInstanceState();
        setAdapter(new SingleLayoutRecyclerAdapter(itemLayoutId) {
            @Override
            protected Object getObjForPosition(int position) {
                return SingleLayoutListRecyclerAdapter.this.items.get(position);
            }

            @Override
            public int getItemCount() {
                return SingleLayoutListRecyclerAdapter.this.items.size();
            }
        });
        getLayoutManager().onRestoreInstanceState(state);
    }
}
