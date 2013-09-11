Segmented Radio Buttons for Android
===================================

This is my implementation of iOS's segmented controls for Android by extending RadioGroup and RadioButton. Example project included.

Screenshots
-----------

![Segmented Toggle Button](https://github.com/makeramen/android-segmentedradiobutton/raw/master/screens/segmentedradio.png)

Usage
-----

* For text-only buttons, you just need SegmentedRadioGroup.java which extends RadioGroup, so all your standard RadioButton implementations and callbacks should work.

* For image buttons, implement SegmentedRadioImageButton instead of RadioButton.

* Drawables are included, but can easily be replaced.

* See example project for usage

Known Issues
------------

* SegmentedRadioImageButton currently uses a custom implemented scaleType similar to CENTER_INSIDE and doesn't respect padding values. If anyone wants to extend the onDraw method to do so, that would be much appreciated.

* RadioGroup has a bug that calls onCheckedChangedListener multiple times when you use clearCheck() or check() programmatically. See [this](http://stackoverflow.com/questions/4519103/error-in-androids-clearcheck-for-radiogroup) for more info, and [this](https://code.google.com/p/android/issues/detail?id=4785) for a possible workaround.


[![Bitdeli Badge](https://d2weczhvl823v0.cloudfront.net/vinc3m1/android-segmentedradiobutton/trend.png)](https://bitdeli.com/free "Bitdeli Badge")

