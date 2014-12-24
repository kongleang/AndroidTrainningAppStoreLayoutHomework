package com.example.pondd.androidtrainningappstorelayouthomework;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;

/**
 * Created by Pondd on 12/24/14 AD.
 */
public class CustomViewGroup extends FrameLayout {

    public CustomViewGroup(Context context) {
        super(context);
        initInflate();
    }

    public CustomViewGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
        initInflate();
    }

    public CustomViewGroup(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initInflate();
    }
    private void initInflate(){
        LayoutInflater inflater = (LayoutInflater)getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.layout_view_layout, this);
    }
}
