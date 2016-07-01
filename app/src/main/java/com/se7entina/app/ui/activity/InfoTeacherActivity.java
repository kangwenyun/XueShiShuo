package com.se7entina.app.ui.activity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import com.se7entina.app.R;

/**
 * Created by Administrator on 2016/6/27.
 */
public class InfoTeacherActivity extends Activity {

    private EditText name;
    private EditText nickname;
    private RadioButton sex_boy;
    private RadioButton sex_girl;
    private EditText email_number;
    private EditText contact_phone_number;
    private EditText school_name_;
    private EditText academy;
    private EditText student_id;
    private CheckBox primary_subject;
    private EditText cost1;//小学课时费
    private CheckBox middle_subject;
    private EditText cost2;//初中课时费
    private CheckBox high_subject;
    private EditText cost3;//高中课时费
    private EditText area;
    private EditText teach_experience;
    private EditText evaluation;
    private ImageView open_appointment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_teacher);
        TextView tvHead = (TextView) findViewById(R.id.tv_head);
        tvHead.setText("家教信息");
        TextView tvClick = (Button) findViewById(R.id.iv_click);
        tvClick.setText("保存");
        name = (EditText)findViewById(R.id.name);
        name.setText("刘明哲");
        nickname = (EditText)findViewById(R.id.nickname);
        nickname.setText("哲哲");
        sex_boy = (RadioButton)findViewById(R.id.sex_boy);
        sex_girl = (RadioButton)findViewById(R.id.sex_girl);
        email_number = (EditText)findViewById(R.id.email_number);
        email_number.setText(R.string.email_number);
        contact_phone_number = (EditText)findViewById(R.id.contact_phone_number);
        contact_phone_number.setText(R.string.phone_number);
        school_name_ = (EditText)findViewById(R.id.school_name_);
        school_name_.setText(R.string.school_name);
        academy = (EditText)findViewById(R.id.academy);
        academy.setText(R.string.teacher_academy_name);
        student_id = (EditText)findViewById(R.id.student_id);
        student_id.setText("201392329");
        primary_subject = (CheckBox)findViewById(R.id.primary_subject);
        cost1 = (EditText)findViewById(R.id.cost1);
        cost1.setText("25");
        middle_subject = (CheckBox)findViewById(R.id.middle_subject);
        cost2 = (EditText)findViewById(R.id.cost2);
        cost2.setText("35");
        high_subject = (CheckBox)findViewById(R.id.high_subject);
        cost3 = (EditText)findViewById(R.id.cost3);
        area = (EditText)findViewById(R.id.area);
        area.setText(R.string.location);
        teach_experience = (EditText)findViewById(R.id.teach_experience);
        teach_experience.setText(R.string.experience);
        evaluation = (EditText)findViewById(R.id.evaluation);
        evaluation.setText(R.string.evaluation_content);
        open_appointment = (ImageView)findViewById(R.id.open_appointment);
        open_appointment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(true){
                    open_appointment.setImageResource(R.mipmap.close);
                }else {
                    open_appointment.setImageResource(R.mipmap.open);
                }
            }
        });
    }

    public void back(View view){
        finish();
    }
}
