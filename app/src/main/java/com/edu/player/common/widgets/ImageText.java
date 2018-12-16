package com.edu.player.common.widgets;

import android.content.Context;
import android.os.HandlerThread;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by zqf on 2018/11/27.
 */

public class ImageText extends LinearLayout {
    private ImageView mImageView;
    private TextView mTextView;
    public ImageText(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    private void init(Context context) {


    }
}
