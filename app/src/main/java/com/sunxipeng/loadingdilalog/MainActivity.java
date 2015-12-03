package com.sunxipeng.loadingdilalog;

import android.app.Activity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Animation anim = AnimationUtils.loadAnimation(this, R.anim.round_loading);

        findViewById(R.id.iv).startAnimation(anim);
    }


}
