package com.makeramen.segmented.custom;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RadioGroup;

import com.makeramen.segmented.R;

/**
 * 分段式 RadioGroup
 *
 * @author maple
 * @time 17/3/29
 */
public class SegmentedRadioGroup extends RadioGroup {

    public SegmentedRadioGroup(Context context) {
        super(context);
    }

    public SegmentedRadioGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        changeButtonsImages();
    }

    private void changeButtonsImages() {
        int count = super.getChildCount();

        this.setBackgroundResource(R.drawable.segment_radio_single);
        int line = (int) getResources().getDimension(R.dimen.divide_line);
        this.setPadding(line, line, line, line);

        if (count > 1) {
            super.getChildAt(0).setBackgroundResource(R.drawable.segment_radio_left);
            for (int i = 1; i < count - 1; i++) {
                super.getChildAt(i).setBackgroundResource(R.drawable.segment_radio_middle);
            }
            super.getChildAt(count - 1).setBackgroundResource(R.drawable.segment_radio_right);
        } else if (count == 1) {// 只有一个，纯粹是二逼
            super.getChildAt(0).setBackgroundResource(R.drawable.segment_radio_single);
        }
    }
}