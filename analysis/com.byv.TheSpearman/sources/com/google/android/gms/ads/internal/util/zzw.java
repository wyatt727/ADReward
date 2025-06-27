package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import com.google.android.gms.internal.ads.zzbdg;
import com.google.android.gms.internal.ads.zzbdz;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes2.dex */
public class zzw extends zzv {
    @Override // com.google.android.gms.ads.internal.util.zzab
    public final Intent zzf(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.APP_PACKAGE", activity.getPackageName());
        return intent;
    }

    @Override // com.google.android.gms.ads.internal.util.zzab
    public final zzbdg.zzq zzg(Context context, TelephonyManager telephonyManager) {
        com.google.android.gms.ads.internal.zzu.zzp();
        return zzt.zzA(context, "android.permission.ACCESS_NETWORK_STATE") ? telephonyManager.isDataEnabled() ? zzbdg.zzq.ENUM_TRUE : zzbdg.zzq.ENUM_FALSE : zzbdg.zzq.ENUM_FALSE;
    }

    @Override // com.google.android.gms.ads.internal.util.zzab
    public final void zzh(Context context, String str, String str2) {
        NotificationChannel notificationChannel = new NotificationChannel("offline_notification_channel", "AdMob Offline Notifications", ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zziw)).intValue());
        notificationChannel.setShowBadge(false);
        ((NotificationManager) context.getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel);
    }

    @Override // com.google.android.gms.ads.internal.util.zzab
    public final boolean zzi(Context context, String str) {
        NotificationChannel notificationChannel = ((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationChannel("offline_notification_channel");
        return notificationChannel != null && notificationChannel.getImportance() == 0;
    }
}
