package com.veeresh.b37_broadcastrecievers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //STEP 1 : CREATE AN INNER CLASS FOR DYNAMIC RECEIVER
    public class MyReceiver2 extends BroadcastReceiver{
        @Override
        public void onReceive(Context context, Intent intent) {
            Toast.makeText(context, "CHARGER PLUGGED : DYNAMIC", Toast.LENGTH_SHORT).show();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //STEP 2 : CREATE MY RECEIVER 2 OBJECT  / I.E DYNAMIC RECEIVER
        MyReceiver2 myReceiver2 = new MyReceiver2();
        //STEP 3 : USE INTENT FILTER
        IntentFilter filter = new IntentFilter();
        //STEP 4 : SPECIFY EVENT IN THE INTENT FILTER
        filter.addAction(Intent.ACTION_POWER_CONNECTED);
        //STEP 5 : LINK INTENT FILTER WITH RECEIVER
        registerReceiver(myReceiver2, filter);
    }
}
