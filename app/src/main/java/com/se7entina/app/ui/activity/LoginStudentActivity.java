package com.se7entina.app.ui.activity;

import android.app.Activity;
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
    private EditText input_phone_number;
    private EditText input_key;
    private Button login_student;
    private Button register_student;
    private Button forget_key;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.login_student);
        input_phone_number = (EditText)findViewById(R.id.input_phone_number);
        input_key = (EditText)findViewById(R.id.input_key);
        login_student = (Button)findViewById(R.id.login_student);
        register_student = (Button)findViewById(R.id.register_student);
        forget_key = (Button)findViewById(R.id.forget_key);
        login_student.setOnClickListener(this);
        register_student.setOnClickListener(this);
        forget_key.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.login_student:

                break;
            case R.id.register_student:

                break;
            case R.id.forget_key:

                break;
            default:
                break;
        }
    }
}
