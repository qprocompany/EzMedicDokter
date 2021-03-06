package com.example.user.myapplication;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.DisplayMetrics;
import android.widget.RatingBar;

/**
 * Created by USER on 4/8/2019.
 */

public class PopRating extends Activity{

    RatingBar ratingBar;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.poprating);

        ratingBar = (RatingBar) findViewById(R.id.ratingBar);

        ratingBar.setRating(Float.parseFloat("4.5"));
        ratingBar.setIsIndicator(true);

        Drawable drawable = ratingBar.getProgressDrawable();
        drawable.setColorFilter(Color.parseColor("#FFD700"),PorterDuff.Mode.SRC_ATOP);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int) (width*.8),(int) (height*.7));

    }
}
