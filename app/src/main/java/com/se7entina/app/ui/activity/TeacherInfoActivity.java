package com.se7entina.app.ui.activity;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextPaint;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.se7entina.app.R;

/**
 * Created by Administrator on 2016/6/21.
 */
public class TeacherInfoActivity extends Activity {
    private TextView teacher_name;
    private ImageView sex;
    private TextView Chinese;
    private ListView subject_list;
    private TextView teacher_school_name;
    private TextView teacher_academy_name;
    private TextView location;
    private TextView teach_experience;
    private TextView evaluation;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        teacher_name = (TextView)findViewById(R.id.teacher_name);
        TextPaint tp = teacher_name.getPaint();
        tp.setFakeBoldText(true);
        sex = (ImageView)findViewById(R.id.sex);
        teacher_school_name = (TextView)findViewById(R.id.teacher_school_name);
        teacher_academy_name = (TextView)findViewById(R.id.teacher_academy_name);
        location = (TextView)findViewById(R.id.location);
        teach_experience = (TextView)findViewById(R.id.teach_experience);
        evaluation = (TextView)findViewById(R.id.evaluation);
        subject_list = (ListView)findViewById(R.id.subject_list);
        adapter = new ArrayAdapter(this,R.layout.subject,);//适配subject.xml里的数据。。。。不会写了。。。T_T
        subject_list.setAdapter(adapter);
    }
}
