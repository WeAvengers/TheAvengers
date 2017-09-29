package com.bawei.mytems;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void wangchengen(View view) {
        Intent intent=new Intent(this,Wangchengen.class);
        startActivity(intent);
    }

    public void wangkun(View view) {
        Intent intent=new Intent(this,Wangkun.class);
        startActivity(intent);
    }

    public void fengkai(View view) {
        Intent intent=new Intent(this,Fengkai.class);
        startActivity(intent);
    }

    public void haojiancheng(View view) {
        Intent intent=new Intent(this,Haojiancheng.class);
        startActivity(intent);
    }
}
