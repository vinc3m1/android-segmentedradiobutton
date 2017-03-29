package com.makeramen.segmented;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.makeramen.segmented.custom.SegmentedRadioGroup;

/**
 * show demo
 *
 * @author maple
 * @time 17/3/29
 */
public class MainActivity extends Activity implements RadioGroup.OnCheckedChangeListener {

    SegmentedRadioGroup segmentText;
    SegmentedRadioGroup segmentImg;
    SegmentedRadioGroup srg_bt;
    SegmentedRadioGroup srg_single;


    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 单个监听
        segmentText = (SegmentedRadioGroup) findViewById(R.id.segment_text);
        segmentText.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                switch (checkedId) {
                    case R.id.button_one:
                        showToast("One");
                        break;
                    case R.id.button_two:
                        showToast("Two");
                        break;
                    case R.id.button_three:
                        showToast("Three");
                        break;
                    case R.id.button_fore:
                        showToast("Fore");
                        break;
                    default:
                        break;
                }
            }
        });

        // 统一监听
        segmentImg = (SegmentedRadioGroup) findViewById(R.id.segment_img);
        segmentImg.setOnCheckedChangeListener(this);

        srg_bt = (SegmentedRadioGroup) findViewById(R.id.srg_bt);
        srg_bt.setOnCheckedChangeListener(this);

        srg_single = (SegmentedRadioGroup) findViewById(R.id.srg_single);
        srg_single.setOnCheckedChangeListener(this);

    }


    @Override
    public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
        if (group == segmentImg) {
            switch (checkedId) {
                case R.id.button_add:
                    showToast("Add");
                    break;
                case R.id.button_call:
                    showToast("Call");
                    break;
                case R.id.button_camera:
                    showToast("Camera");
                    break;
            }
        } else if (group == srg_bt) {
            if (checkedId == R.id.bt_view1) {
                showToast("1111");
            } else if (checkedId == R.id.bt_view2) {
                showToast("2222");
            }
        } else if (group == srg_single) {
            if (checkedId == R.id.bt_single1) {
                showToast("一个");
            }
        }
    }

    public void showToast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}