package com.makeramen.segmented;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RadioButton;

/**
 * 图片居中的 RadioButton
 * 
 * @author shaoshuai
 * 
 */
public class CenteredRadioImageButton extends RadioButton {

	Drawable image;

	public CenteredRadioImageButton(Context context, AttributeSet attrs) {
		super(context, attrs);
		TypedArray a = context.obtainStyledAttributes(attrs, com.makeramen.segmented.R.styleable.CompoundButton, 0, 0);
		image = a.getDrawable(1);
		setButtonDrawable(android.R.color.transparent);
		a.recycle();
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