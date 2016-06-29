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
public class FindKeyActivity extends Activity implements View.OnClickListener {

    private ImageView find_key_back;
    private EditText input_phone_number_hint;
    private EditText input_verification_code_hint;
    private Button get_verification_code;
    private EditText input_the_new_key_hint;
    private EditText input_the_new_key_again_hint;
    private Button confirm_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.find_the_key);
        find_key_back = (ImageView)findViewById(R.id.find_key_back);
        find_key_back.setOnClickListener(this);
        input_phone_number_hint = (EditText)findViewById(R.id.input_phone_number_hint);
        input_verification_code_hint = (EditText)findViewById(R.id.input_verification_code_hint);
        get_verification_code = (Button)findViewById(R.id.get_verification_code);
        get_verification_code.setOnClickListener(this);
        input_the_new_key_hint = (EditText)findViewById(R.id.input_the_new_key_hint);
        input_the_new_key_again_hint = (EditText)findViewById(R.id.input_the_new_key_again_hint);
        confirm_1 = (Button)findViewById(R.id.confirm_1);
        confirm_1.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.find_key_back:
                finish();
                break;
            case R.id.get_verification_code:

                break;
            case R.id.confirm_1:
                Intent intent = new Intent(this,LoginStudentActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
