package com.se7entina.app.ui.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import com.se7entina.app.R;

/**
 * Created by Administrator on 2016/6/26.
 */
public class InfoStudentActivity extends Activity implements View.OnClickListener {
    private EditText name;
    private EditText nickname;
    private RadioButton sex_boy;
    private RadioButton sex_girl;
    private EditText school;
    private EditText grade;
    private EditText class_;
    private EditText email_number;
    private EditText contact_phone_number;
    private TextView city;
    private TextView county;
    TextView tvHead;
    TextView tvClick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_student);
        tvHead = (TextView) findViewById(R.id.tv_head);
        tvHead.setText("个人资料");
        tvClick = (Button) findViewById(R.id.iv_click);
        tvClick.setText("保存");
        tvClick.setOnClickListener(this);
        name = (EditText)findViewById(R.id.name);
        nickname = (EditText)findViewById(R.id.nickname);
        sex_boy = (RadioButton)findViewById(R.id.sex_boy);
        sex_girl = (RadioButton)findViewById(R.id.sex_girl);
        school = (EditText)findViewById(R.id.school);
        grade = (EditText)findViewById(R.id.grade);
        class_ = (EditText)findViewById(R.id.class_);
        email_number = (EditText)findViewById(R.id.email_number);
        contact_phone_number = (EditText)findViewById(R.id.contact_phone_number);
        city = (TextView)findViewById(R.id.city);
        city.setOnClickListener(this);
        county = (TextView)findViewById(R.id.county);
        county.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.city:

                break;
            case R.id.county:

                break;
            case R.id.iv_click:

                break;
            default:
                break;
        }
    }
}
