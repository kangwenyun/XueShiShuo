package com.se7entina.app.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

import com.se7entina.app.R;


/**
 * Created by Administrator on 2016/6/16.
 */
public class LoginStudentActivity extends Activity implements View.OnClickListener {
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
        Intent intent;
        switch (v.getId()){
            case R.id.login_student:

                break;
            case R.id.register:
                intent = new Intent(LoginStudentActivity.this,RegisterActivity.class);
                startActivity(intent);
                break;
            case R.id.forget_key:
                intent = new Intent(LoginStudentActivity.this,FindKeyActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
