package com.example.kaoqin;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.hujiahong.hujiahong.R;

/**
 * 主菜单
 */
public class MainActivity extends MyBaseActivity {
    private EditText name;
    private EditText password;
    private TextView loginBtn;


    @SuppressLint("NewApi")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
    }

    private void initView() {
        View mainView = LayoutInflater.from(this).inflate(R.layout.login, super.mainlayout, false);
        super.mainlayout.addView(mainView);
        name = (EditText) mainView.findViewById(R.id.editText_name);
        password = (EditText) mainView.findViewById(R.id.editText_password);
        loginBtn = (TextView) mainView.findViewById(R.id.logInBtn);
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }

}
