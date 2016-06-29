package com.se7entina.app.ui.activity;

import android.app.Activity;
import android.content.Intent;
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
public class CreateInfoActivity extends Activity implements View.OnClickListener {
    private EditText user_name;
    private RadioButton boy;
    private RadioButton girl;
    private EditText school_name;
    private EditText grade;
    private Button finish;
    private Button ignore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_info);
        TextView tvHead = (TextView) findViewById(R.id.tv_head);
        tvHead.setText("创建信息");
        user_name = (EditText)findViewById(R.id.user_name);
        boy = (RadioButton)findViewById(R.id.boy);
        girl = (RadioButton)findViewById(R.id.girl);
        school_name = (EditText)findViewById(R.id.school_name);
        grade = (EditText)findViewById(R.id.grade);
        finish = (Button)findViewById(R.id.finish);
        finish.setOnClickListener(this);
        ignore = (Button)findViewById(R.id.ignore);
        ignore.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        switch (R.id.finish){
            case R.id.finish:
            case R.id.ignore:
                intent = new Intent(this,MainUIActivity.class);
                break;
            default:
                break;
        }
        if(intent != null){
            startActivity(intent);
        }
    }
}
