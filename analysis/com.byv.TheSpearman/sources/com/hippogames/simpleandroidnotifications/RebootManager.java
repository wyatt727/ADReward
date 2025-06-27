package com.hippogames.simpleandroidnotifications;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class RebootManager extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Iterator<Integer> it = Storage.GetNotificationIds(context).iterator();
        while (it.hasNext()) {
            NotificationParams notificationParamsGetNotification = Storage.GetNotification(context, it.next().intValue());
            if (notificationParamsGetNotification != null) {
                Controller.SetNotification(context, notificationParamsGetNotification);
            }
        }
    }
}
