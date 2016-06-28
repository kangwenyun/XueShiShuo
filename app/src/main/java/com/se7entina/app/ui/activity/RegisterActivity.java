package com.se7entina.app.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.se7entina.app.R;

/**
 * Created by Administrator on 2016/6/26.
 */
public class RegisterActivity extends Activity implements View.OnClickListener {
    private ImageView find_key_back;
    private Button register_student;
    private Button register_teacher;
    private EditText input_phone_number_hint;
    private EditText input_verification_code_hint;
    private Button get_verification_code;
    private EditText input_the_key_hint;
    private EditText input_the_key_again_hint;
    private Button confirm_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        find_key_back = (ImageView)findViewById(R.id.register_back);
        find_key_back.setOnClickListener(this);
        register_student = (Button)findViewById(R.id.register_teacher);
        register_student.setOnClickListener(this);
        register_teacher = (Button)findViewById(R.id.register_teacher);
        register_teacher.setOnClickListener(this);
        input_phone_number_hint = (EditText)findViewById(R.id.input_phone_number_hint);
        input_verification_code_hint = (EditText)findViewById(R.id.input_verification_code_hint);
        get_verification_code = (Button)findViewById(R.id.get_verification_code);
        get_verification_code.setOnClickListener(this);
        input_the_key_hint = (EditText)findViewById(R.id.input_the_key_hint);
        input_the_key_again_hint = (EditText)findViewById(R.id.input_the_new_key_again_hint);
        confirm_1 = (Button)findViewById(R.id.confirm_1);
        confirm_1.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent ;
        switch (v.getId()){
            case R.id.find_key_back:
                finish();
                break;
            case R.id.register_student:

                break;
            case R.id.register_teacher:

                break;
            case R.id.get_verification_code:

                break;
            case R.id.confirm_1:
                intent = new Intent(RegisterActivity.this,CreateInfoActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
