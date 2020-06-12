package com.example.sy6;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class TwoActivity extends AppCompatActivity {
    private TextView infouser;
    private TextView infosex;
    private TextView infoage;
    private TextView infotell;
    private TextView infoemail;
    private TextView infohomepage;
    private TextView infonote;
    private Button btn3;
    private Button btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //利用布局资源文件设置用户界面
        setContentView(R.layout.two);
        //通过资源标识获得控件实例
        infouser = (TextView) findViewById(R.id.edtusername);
        infosex = (TextView) findViewById(R.id.edtsex);
        infoage = (TextView) findViewById(R.id.edtage);
        infotell = (TextView) findViewById(R.id.edttell);
        infoemail = (TextView) findViewById(R.id.edtemail);
        infohomepage = (TextView) findViewById(R.id.homepage);
        infonote = (TextView) findViewById(R.id.note);
        btn3=(Button) findViewById(R.id.btn3);
        btn4=(Button) findViewById(R.id.btn4);
        //获取意图
        Intent intent = getIntent();

        //判断是否为空

        if (intent != null) {
            //获取意图携带的数据包
            Bundle data = intent.getExtras();
            //从数据包中提取各项数据
            String strUsername = data.getString("user");
            String strSex = data.getString("sex");
            String strAge = data.getString("age");
            String strTell = data.getString("tell");
            String strEmail = data.getString("email");
            String strHomepage = data.getString("hp");
            String strNote = data.getString("nt");

            //拼接用户信息
            String strUserInfo = "姓名：" + strUsername;
            String strsexInfo = "性别：" + strSex;
            String strageInfo = "年龄：" + strAge;
            String strtellInfo = "电话：" + strTell;
            String stremailInfo = "邮箱：" + strEmail;
            String strhpInfo = "主页：" + strHomepage;
            String strntInfo = "备注：" + strNote;

            //设置标签文本属性，显示用户信息
            infouser.setText(strUserInfo);
            infosex.setText(strsexInfo);
            infoage.setText(strageInfo);
            infotell.setText(strtellInfo);
            infoemail.setText(stremailInfo);
            infohomepage.setText(strhpInfo);
            infonote.setText(strntInfo);
        }

        btn3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                finish();
            }
        });
       // btn4.setOnClickListener(new View.OnClickListener() {





    }

}









