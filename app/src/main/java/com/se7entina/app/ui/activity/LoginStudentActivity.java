package com.se7entina.app.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.se7entina.app.R;


/**
 * Created by Administrator on 2016/6/16.
 */
public class LoginStudentActivity extends Activity implements View.OnClickListener {
    private TextView xue;
    private TextView shi;
    private TextView shuo;
    private TextPaint tp;
    private EditText user_name_;
    private EditText key;
    private Button login_student;
    private Button register;
    private Button forget_key;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.login_student);
        xue = (TextView)findViewById(R.id.xue);
        tp = xue.getPaint();
        tp.setFakeBoldText(true);
        shi = (TextView)findViewById(R.id.xue);
        tp = shi.getPaint();
        tp.setFakeBoldText(true);
        shuo = (TextView)findViewById(R.id.xue);
        tp = shuo.getPaint();
        tp.setFakeBoldText(true);
        user_name_ = (EditText)findViewById(R.id.user_name_);
        key = (EditText)findViewById(R.id.key);
        login_student = (Button)findViewById(R.id.login_student);
        register = (Button)findViewById(R.id.register);
        forget_key = (Button)findViewById(R.id.forget_key);
        login_student.setOnClickListener(this);
        register.setOnClickListener(this);
        forget_key.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        switch (v.getId()){
            case R.id.login_student:
                intent = new Intent(this,MainUIActivity.class);
                break;
            case R.id.register:
                intent = new Intent(this,RegisterActivity.class);
                break;
            case R.id.forget_key:
                intent = new Intent(this,FindKeyActivity.class);
                break;
            default:
                break;
        }
        if(intent != null){
            startActivity(intent);
        }
    }
}
