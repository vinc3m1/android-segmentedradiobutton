package com.makeramen.segmented;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class SegmentedRadioActivity extends Activity implements OnCheckedChangeListener {

	SegmentedRadioGroup segmentText;
	SegmentedRadioGroup segmentImg;
	SegmentedRadioGroup srg_bt;
	SegmentedRadioGroup srg_single;

	Toast mToast;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		segmentText = (SegmentedRadioGroup) findViewById(R.id.segment_text);
		segmentText.setOnCheckedChangeListener(this);

		segmentImg = (SegmentedRadioGroup) findViewById(R.id.segment_img);
		segmentImg.setOnCheckedChangeListener(this);

		srg_bt = (SegmentedRadioGroup) findViewById(R.id.srg_bt);
		srg_bt.setOnCheckedChangeListener(this);

		srg_single = (SegmentedRadioGroup) findViewById(R.id.srg_single);
		srg_single.setOnCheckedChangeListener(this);

	}

	public void onCheckedChanged(RadioGroup group, int checkedId) {
		mToast = Toast.makeText(this, "", Toast.LENGTH_SHORT);
		if (group == segmentText) {
			switch (checkedId) {
			case R.id.button_one:
				mToast.setText("One");
				mToast.show();
				break;
			case R.id.button_two:
				mToast.setText("Two");
				mToast.show();
				break;
			case R.id.button_three:
				mToast.setText("Three");
				mToast.show();
				break;
			case R.id.button_fore:
				mToast.setText("Fore");
				mToast.show();
				break;
			default:
				break;
			}
		} else if (group == segmentImg) {
			if (checkedId == R.id.button_add) {
				mToast.setText("Add");
				mToast.show();
			} else if (checkedId == R.id.button_call) {
				mToast.setText("Call");
				mToast.show();
			} else if (checkedId == R.id.button_camera) {
				mToast.setText("Camera");
				mToast.show();
			}
		} else if (group == srg_bt) {
			if (checkedId == R.id.bt_view1) {
				mToast.setText("1111");
				mToast.show();
			} else if (checkedId == R.id.bt_view2) {
				mToast.setText("2222");
				mToast.show();
			}
		} else if (group == srg_single) {
			if (checkedId == R.id.bt_single1) {
				mToast.setText("Ò»¸ö");
				mToast.show();
			}
		}
	}


}