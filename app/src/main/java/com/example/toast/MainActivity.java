package com.example.toast;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Android Toast自定义使用：
 * http://www.jianshu.com/p/5c5c8ee31ddb
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_demo=(Button)findViewById(R.id.btn_demo);
        btn_demo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastUtil toastUtil=new ToastUtil();

                //示例用法一：修改Toast背景色
                //toastUtil.Short(MainActivity.this,"自定义message字体、背景色").setToastColor(Color.WHITE, getResources().getColor(R.color.colorAccent)).show();

                //示例用法二：自定义背景
                //toastUtil.Short(MainActivity.this,"自定义message字体颜色和背景").setToastBackground(Color.WHITE,R.drawable.toast_radius).show();

                //示例用法三：向Toast中添加图标
                /*ImageView toastImage = new ImageView(getApplicationContext());
                toastImage.setImageResource(R.mipmap.ic_launcher);
                toastUtil.Short(MainActivity.this,"向Toast添加了一个ImageView").setToastBackground(Color.WHITE,R.drawable.toast_radius).addView(toastImage,0).show();*/

                //示例用法四：显示自定义的布局
                View view = LayoutInflater.from(MainActivity.this).inflate(R.layout.toast_img,null);
                new ToastUtil(MainActivity.this,view, Toast.LENGTH_SHORT).show();
            }
        });

    }

}
