package com.example.qiangzhixiaxiandemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends BaseActivity {

    //发送广播按钮
    private Button sendBroadCase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sendBroadCase=(Button) findViewById(R.id.sendBroadCast);
        //发送下线广播
        sendBroadCase.setOnClickListener(new View.OnClickListener() {

            @Override
            public  void onClick(View v) {
                Intent intent=new  Intent("OffLine");
                sendBroadcast(intent);
            }
        });

    }
}

