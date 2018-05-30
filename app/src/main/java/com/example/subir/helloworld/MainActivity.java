package com.example.subir.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.widget.Toast;

import static android.widget.Toast.*;

public class MainActivity extends AppCompatActivity {

    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("lifecycle","OnCreateInvoke");
        Toast toast = makeText(this,"OnCreate", LENGTH_SHORT);
        toast.show();
        toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("lifecycle","OnStartInvoked");
        Toast toast = makeText(getApplicationContext(),"onStart", LENGTH_SHORT);
        toast.show();
        toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("lifecycle","OnResumeInvoked");
        Toast toast = makeText(getApplicationContext(),"onResume", LENGTH_SHORT);
        toast.show();
        toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("lifecycle","OnPauseInvoked");
        Toast toast = makeText(getApplicationContext(),"onPause", LENGTH_SHORT);
        toast.show();
        toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("lifecycle","OnRestartInvoked");
        Toast toast = makeText(getApplicationContext(),"onRestart", LENGTH_SHORT);
        toast.show();
        toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("lifecycle","OnStopInvoked");
        Toast toast = makeText(getApplicationContext(),"onStop", LENGTH_SHORT);
        toast.show();
        toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("lifecycle","OnDestroyInvoked");
        Toast toast = makeText(getApplicationContext(),"onDestroy", LENGTH_SHORT);
        toast.show();
        toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
    }
}
