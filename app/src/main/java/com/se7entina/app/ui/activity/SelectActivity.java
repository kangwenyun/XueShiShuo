package com.se7entina.app.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import com.se7entina.app.R;
import com.se7entina.app.common.SystemConstant;
import com.se7entina.app.util.SharedPreferencesUtil;


/**
 * Created by Administrator on 2016/6/16.
 */
public class SelectActivity extends Activity implements View.OnClickListener {

    private Button student_selection;
    private Button teacher_selection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.select);
        student_selection = (Button)findViewById(R.id.student_selection);
        teacher_selection = (Button)findViewById(R.id.teacher_selection);
        student_selection.setOnClickListener(this);
        teacher_selection.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        switch (v.getId()){
            case R.id.student_selection:
                intent = new Intent(this,MainUIActivity.class);
                SharedPreferencesUtil.putString(this,SystemConstant.LOGIN_ROLE,SystemConstant.LOGIN_ROLE_STU);
                break;
            case  R.id.teacher_selection:
                intent = new Intent(this,MainUIActivity.class);
                SharedPreferencesUtil.putString(this,SystemConstant.LOGIN_ROLE,SystemConstant.LOGIN_ROLE_TEA);
                break;
            default:
                break;
        }
        if(intent != null)
        {
            startActivity(intent);
        }
    }
}
