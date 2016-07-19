package com.se7entina.app.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextPaint;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.android.volley.AuthFailureError;
import com.android.volley.NetworkError;
import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.se7entina.app.R;
import com.se7entina.app.common.SystemConstant;
import com.se7entina.app.ui.fragment.PersonalInfoFragment;
import com.se7entina.app.util.SharedPreferencesUtil;
import com.se7entina.app.util.StringUtils;
import com.se7entina.app.widgets.ToastTools;

import java.util.HashMap;
import java.util.Map;

import cc.rengu.sdk.net.RenGuHttpClient;


/**
 * Created by Administrator on 2016/6/16.
 */
public class LoginStudentActivity extends FragmentActivity implements View.OnClickListener {

    private static String TAG = "LoginStudentActivity";
    private RenGuHttpClient httpClient;
    private TextView xue;
    private TextView shi;
    private TextView shuo;
    private TextPaint tp;
    private EditText user_name_;
    private EditText key;
    private Button login_student;
    private Button register;
    private Button forget_key;
    private Fragment fragment = null;
    private Map<String, Fragment> map = new HashMap<>();

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
//                if(StringUtils.isEmpty(user_name_)|| StringUtils.isEmpty(key)){
//                    ToastTools.show(this,"用户名或密码不能为空");
//                    return;
//                }
//                LoginReq();
                intent = new Intent(this,InfoTeacherActivity.class);
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

    @Override
    protected void onStop() {
        super.onStop();
        // 撤销网络请求
        if (httpClient != null) {
            // 在网络请求时需要给request加上tag
            httpClient.cancelPendingRequests(TAG);
        }
    }

    private void LoginReq() {
        // get 请求，参数拼接URL上
        String url = "http://120.27.45.82:8080/xueshishuo/servlet/test";
        StringRequest stringRequest = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String s) {
                Log.d(TAG, "POST访问成功返回结果=" + s);
                //添加判断
                Intent intent = new Intent(LoginStudentActivity.this,MainUIActivity.class);
                SharedPreferencesUtil.putBoolean(LoginStudentActivity.this,SystemConstant.LOGIN_FLAG,true);
                startActivity(intent);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {
                volleyError.printStackTrace();

                if (volleyError instanceof NetworkError) {
                    Log.d(TAG, "网络问题=" + volleyError.getMessage());
                } else if (volleyError instanceof TimeoutError) {
                    Log.d(TAG, "超时问题=" + volleyError.getMessage());
                } else if (volleyError instanceof ServerError) {
                    Log.d(TAG, "服务器问题=" + volleyError.getMessage());
                } else if (volleyError instanceof ParseError) {
                    Log.d(TAG, "解析问题=" + volleyError.getMessage());
                } else if (volleyError instanceof AuthFailureError) {
                    Log.d(TAG, "网络认证问题=" + volleyError.getMessage());
                } else {
                    Log.d(TAG, "请求失败=" + volleyError.getMessage());
                }
            }
        }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                // post请求参数
                Map<String, String> map = new HashMap<String, String>();
                map.put("key", "login");
                map.put("username", user_name_.getText().toString());
                map.put("password", key.getText().toString());
                Log.i(TAG, "传入服务器的map = " + map);
                return map;
            }
        };
        Log.d(TAG, "POST访问返回值=" + stringRequest);
        RenGuHttpClient renGuHttpClient = RenGuHttpClient.getInstance(this);
        renGuHttpClient.addToRequestQueue(stringRequest);
    }
}
