package com.example.sy6;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    /**
     * 设置姓名编辑框
     */
    private EditText etdusername;

    /**
     *
     * 设置性别编辑框
     */
    private  EditText edtsex;

    /**
     *
     * 设置年龄编辑框
     */
    private  EditText edtage;

    /**
     *
     * 设置电话编辑框
     */
    private  EditText edttell;

    /**
     *
     * 设置邮箱编辑框
     */
    private EditText edtemali;

    /**
     *
     *设置主页编辑框
     */
    private  EditText homepage;

    /**
     *
     * 设置备注编辑框
     */
    private  EditText note;

    /**
     *
     * 设置注册按钮
     */
    private  Button btn1;
    /**
     *
     * 设置取消按钮
     */
    private  Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 利用布局资源文件设置用户界面
        setContentView(R.layout.activity_main);
        //通过资源索引获得界面空间实例
        etdusername=(EditText) findViewById(R.id.edtusername);
        edtsex=(EditText)findViewById(R.id.edtsex);
        edtage=(EditText)findViewById(R.id.edtage);
        edttell=(EditText)findViewById(R.id.edttell);
        edtemali=(EditText)findViewById(R.id.edtemail);
        homepage=(EditText)findViewById(R.id.homepage);
        note=(EditText)findViewById(R.id.note);
        btn1=(Button) findViewById(R.id.btn1);
        btn2=(Button) findViewById(R.id.btn2);



        //给注册按钮设置监听器
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 保存用户输入的数据：用户名与密码
                String strUsername = etdusername.getText().toString().trim();
                String strSex=edtsex.getText().toString().trim();
                String strAge=edtage.getText().toString().trim();
                String strTell=edttell.getText().toString().trim();
                String strEmail=edtemali.getText().toString().trim();
                String strHomepage=homepage.getText().toString().trim();
                String strNote=note.getText().toString().trim();

                if((!strUsername.equals(null)) &&  (!strSex.equals(null))&& (!strAge.equals(null)) && (!strTell.equals(null)) && (!strEmail.equals(null))
                        &&  (!strHomepage.equals(null)) && (!strNote.equals(null))) {
                    Toast.makeText(MainActivity.this, "保存成功！",
                            Toast.LENGTH_LONG).show();
                    //实现跳转窗口，创建意图（参数1：上下文；参数2；目标文件）
                    Intent intent = new Intent(MainActivity.this, TwoActivity.class);
                    //创建数据包
                    Bundle data=new Bundle();
                    //将数据放入数据包中
                    data.putString("user",strUsername);
                    data.putString("sex",strSex);
                    data.putString("age",strAge);
                    data.putString("tell",strTell);
                    data.putString("email",strEmail);
                    data.putString("hp",strHomepage);
                    data.putString("nt",strNote);
                    //通过意图携带数据包
                    intent.putExtras(data);
                    // 按照意图启动目标组件
                    startActivity(intent);
                }else {
                    Toast.makeText(MainActivity.this, "保存失败！",
                            Toast.LENGTH_LONG).show();
                }

            }
        });
        // 给取消按钮注册监听器，实现监听器接口，编写事件处理方法
        btn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                finish();
            }
        });





    }
}



