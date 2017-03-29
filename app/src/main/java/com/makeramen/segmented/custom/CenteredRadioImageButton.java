package com.makeramen.segmented.custom;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatRadioButton;
import android.util.AttributeSet;

import com.makeramen.segmented.R;


/**
 * 图片居中的 RadioButton
 *
 * @author maple
 * @time 17/3/29
 */
public class CenteredRadioImageButton extends AppCompatRadioButton {

    Drawable image;

    public CenteredRadioImageButton(Context context, AttributeSet attrs) {
        super(context, attrs);

        TypedArray a = context.getTheme().obtainStyledAttributes(attrs, R.styleable.MsButton, 0, 0);

        try {
            image = a.getDrawable(R.styleable.MsButton_msButton);
        } finally {
            setButtonDrawable(android.R.color.transparent);
            a.recycle();
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        if (image != null) {
            image.setState(getDrawableState());

            // 缩放图像以适应里面的按钮
            int imgHeight = image.getIntrinsicHeight();
            int imgWidth = image.getIntrinsicWidth();
            int btnWidth = getWidth();
            int btnHeight = getHeight();
            float scale;

            if (imgWidth <= btnWidth && imgHeight <= btnHeight) {
                scale = 1.0f;
            } else {
                scale = Math.min((float) btnWidth / (float) imgWidth, (float) btnHeight / (float) imgHeight);
            }

            int dx = (int) ((btnWidth - imgWidth * scale) * 0.5f + 0.5f);
            int dy = (int) ((btnHeight - imgHeight * scale) * 0.5f + 0.5f);

            image.setBounds(dx, dy, (int) (dx + imgWidth * scale), (int) (dy + imgHeight * scale));

            image.draw(canvas);
        }
    }
}