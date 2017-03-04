package com.ckw.keepfit;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.NotificationCompat;
import android.util.Log;

import java.util.Date;

/**
 * Created by chuck on 17-2-27.
 */

public class IntervalReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        int notifyId = 1;
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context);

        PendingIntent pendingIntent = PendingIntent.getActivity(context, 1, new Intent(context, MainActivity.class), 0);
        builder.setSmallIcon(R.mipmap.ic_launcher).setContentTitle("haha").setContentText("haha").setContentIntent(pendingIntent).setAutoCancel(true);
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(notifyId, builder.build());


        Log.d("IntervalReceiver", " onReceive ====================== " + new Date().toString());
    }
}
