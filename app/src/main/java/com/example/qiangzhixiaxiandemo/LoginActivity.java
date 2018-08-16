package com.example.qiangzhixiaxiandemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * 创建日期：2018/8/15 on 10:49
 * 作者: 郭大莹
 * QQ:1064821651
 */
public class LoginActivity extends BaseActivity {

    private Button login;
    private EditText username;
    private EditText password;
    private String username_str;
    private String password_str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.login);
        super.onCreate(savedInstanceState);

        login=(Button) findViewById(R.id.login);
        username=(EditText) findViewById(R.id.username);
        password=(EditText) findViewById(R.id.password);

        login.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //注意：一定要在此处获取.如果在外面获取的话
                //得到的值即为一开始初始化得值
                username_str=username.getText().toString();
                password_str=password.getText().toString();

                if(username_str.equals("admin")&&password_str.equals("123456")){
                    Intent intent=new Intent(LoginActivity.this,MainActivity.class);
                    startActivity(intent);
                    finish();
                }else{
                    Toast.makeText(LoginActivity.this, "输入有误", 3000).show();
                }
            }
        });
    }
}
