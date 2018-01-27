package cn.edu.gdmec.android.activitylife;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    //当页面创建的时候执行
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        Log.i ("MainActivity","调用onCreate方法");

        //通过显示意图开启Activity
        /*Intent intent = new Intent ( this,Main2Activity.class );
        startActivity ( intent );*/



    }

    //当页面可见执行
    @Override
    protected void onStart(){
        Log.i ( "MainActivity","调用onStart方法" );
        super.onStart ();
    }

    //当Activity获取焦点开始与用户交互时
    @Override
    protected void onResume(){
        Log.i ( "MainActivity","调用onResume方法" );
        super.onResume ();
    }

    //当Activity被覆盖（失去焦点，用户不可以进行交互）
    @Override
    protected void onPause(){
        Log.i ( "MainActivity","调用onPause方法" );
        super.onPause ();
    }

    //当页面不可见的时候执行
    @Override
    protected void onStop(){
        Log.i ( "MainActivity","调用onStop方法" );
        super.onStop ();
    }

    //当页面销毁的时候执行
    @Override
    protected void onDestroy(){
        Log.i ( "MainActivity","调用onDestroy方法" );
        super.onDestroy ();
    }

    //当页面重新启动执行
    @Override
    protected void onRestart(){
        Log.i ( "MainActivity","调用onRestart方法" );
        super.onRestart ();
    }


}
