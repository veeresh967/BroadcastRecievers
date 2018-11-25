package com.veeresh.b37_broadcastrecievers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver1 extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "CHARGER IS UNPLUGGED : STATIC", Toast.LENGTH_SHORT).show();
    }
}
