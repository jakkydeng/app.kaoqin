package com.example.kaoqin;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import com.example.hujiahong.hujiahong.R;

/**
 * Created by hujiahong on 16/11/12.
 */

public class ShowMessageActivity extends MyBaseActivity{
    @SuppressLint("NewApi")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
    }

    private void initView() {
        View mainView = LayoutInflater.from(this).inflate(R.layout.login, super.mainlayout, false);
        super.mainlayout.addView(mainView);

    }
}
