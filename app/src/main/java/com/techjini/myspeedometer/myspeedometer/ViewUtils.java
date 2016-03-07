package com.techjini.myspeedometer.myspeedometer;

import android.content.res.AssetManager;
import android.databinding.BindingAdapter;
import android.graphics.Typeface;
import android.widget.TextView;

/**
 * Created by techjini on 1/3/16.
 */
public class ViewUtils {
    @BindingAdapter({"app:font"})
    public static void setFont(TextView textView, String font) {
        switch (font) {
                case "bold": {
                    AssetManager assetManager = textView.getContext().getAssets();
                    textView.setTypeface(Typeface.createFromAsset(assetManager,
                            "fonts/Roboto-Bold.ttf"));
                }
                break;
                case "light": {
                    AssetManager assetManager = textView.getContext().getAssets();
                    textView.setTypeface(Typeface.createFromAsset(assetManager,
                            "fonts/Roboto-Light.ttf"));
                }
                break;
        }
    }
}
