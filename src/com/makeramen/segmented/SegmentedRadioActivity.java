/*
 * Copyright (C) 2011 Make Ramen, LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.makeramen.segmented;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class SegmentedRadioActivity extends Activity implements OnCheckedChangeListener {

	SegmentedRadioGroup segmentText;
	SegmentedRadioGroup segmentImg;
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

        mToast = Toast.makeText(this, "", Toast.LENGTH_SHORT);
    }
    
	public void onCheckedChanged(RadioGroup group, int checkedId) {
		if (group == segmentText) {
			if (checkedId == R.id.button_one) {
				mToast.setText("One");
				mToast.show();
			} else if (checkedId == R.id.button_two) {
				mToast.setText("Two");
				mToast.show();
			} else if (checkedId == R.id.button_three) {
				mToast.setText("Three");
				mToast.show();
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
		}
	}

}