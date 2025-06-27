package com.hippogames.simpleandroidnotifications;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.media.AudioAttributes;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import androidx.webkit.Profile;
import com.google.android.exoplayer2.C;
import com.unity3d.player.UnityPlayer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class Controller extends BroadcastReceiver {
    public static void SetNotification(int i, long j, String str, String str2, String str3, int i2, int i3, int i4, String str4, String str5, int i5, String str6) {
        SetNotification(i, "", "", "", "", j, false, 0L, str, str2, str3, false, i2 == 1, (String) null, i3 == 1, new long[]{1000, 1000}, i4 == 1, 3000, 3000, -16711936, str4, str5, i5, 1, 3, (String) null, str6);
    }

    public static void SetNotification(int i, String str, String str2, String str3, String str4, long j, int i2, long j2, String str5, String str6, String str7, int i3, int i4, String str8, int i5, String str9, int i6, int i7, int i8, int i9, String str10, String str11, int i10, int i11, int i12, String str12, String str13) {
        String[] strArrSplit = str9.split(",");
        long[] jArr = new long[strArrSplit.length];
        for (int i13 = 0; i13 < strArrSplit.length; i13++) {
            jArr[i13] = Long.parseLong(strArrSplit[i13]);
        }
        SetNotification(i, str, str2, str3, str4, j, i2 == 1, j2, str5, str6, str7, i3 == 1, i4 == 1, str8, i5 == 1, jArr, i6 == 1, i7, i8, i9, str10, str11, i10, i11, i12, str12, str13);
    }

    public static void SetNotification(int i, String str, String str2, String str3, String str4, long j, boolean z, long j2, String str5, String str6, String str7, boolean z2, boolean z3, String str8, boolean z4, long[] jArr, boolean z5, int i2, int i3, int i4, String str9, String str10, int i5, int i6, int i7, String str11, String str12) {
        NotificationParams notificationParams = new NotificationParams();
        notificationParams.Id = i;
        notificationParams.GroupName = str;
        notificationParams.GroupSummary = str2;
        notificationParams.ChannelId = str3;
        notificationParams.ChannelName = str4;
        notificationParams.TriggerAtMillis = System.currentTimeMillis() + j;
        notificationParams.Repeat = z;
        notificationParams.RepeatIntervalMs = j2;
        notificationParams.Title = str5;
        notificationParams.Message = str6;
        notificationParams.Ticker = str7;
        notificationParams.Multiline = z2;
        notificationParams.Sound = z3;
        notificationParams.CustomSound = str8;
        notificationParams.Vibrate = z4;
        notificationParams.Vibration = jArr;
        notificationParams.Light = z5;
        notificationParams.LightOnMs = i2;
        notificationParams.LightOffMs = i3;
        notificationParams.LightColor = i4;
        notificationParams.LargeIcon = str9;
        notificationParams.SmallIcon = str10;
        notificationParams.SmallIconColor = i5;
        notificationParams.ExecuteMode = i6;
        notificationParams.Importance = i7;
        notificationParams.CallbackData = str11;
        notificationParams.UnityClass = str12;
        SetNotification(UnityPlayer.currentActivity, notificationParams);
        Storage.AddNotification(UnityPlayer.currentActivity, notificationParams);
        LimitStorageSize(100);
    }

    public static void SetNotification(Context context, NotificationParams notificationParams) {
        if (Build.VERSION.SDK_INT < 11) {
            return;
        }
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        Intent intent = new Intent(context, (Class<?>) Controller.class);
        intent.putExtra("Id", notificationParams.Id);
        PendingIntent broadcast = PendingIntent.getBroadcast(context, notificationParams.Id, intent, C.BUFFER_FLAG_FIRST_SAMPLE);
        if (notificationParams.Repeat) {
            if (notificationParams.ExecuteMode == 0) {
                alarmManager.setInexactRepeating(0, notificationParams.TriggerAtMillis, notificationParams.RepeatIntervalMs, broadcast);
                return;
            } else {
                alarmManager.setRepeating(0, notificationParams.TriggerAtMillis, notificationParams.RepeatIntervalMs, broadcast);
                return;
            }
        }
        if (notificationParams.ExecuteMode == 2 && Build.VERSION.SDK_INT >= 23) {
            alarmManager.setExactAndAllowWhileIdle(0, notificationParams.TriggerAtMillis, broadcast);
        } else if (notificationParams.ExecuteMode == 1 && Build.VERSION.SDK_INT >= 19) {
            alarmManager.setExact(0, notificationParams.TriggerAtMillis, broadcast);
        } else {
            alarmManager.set(0, notificationParams.TriggerAtMillis, broadcast);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        int intExtra = intent.getIntExtra("Id", 0);
        NotificationParams notificationParamsGetNotification = Storage.GetNotification(context, intExtra);
        if (notificationParamsGetNotification == null) {
            return;
        }
        if (IsEmpty(notificationParamsGetNotification.ChannelId)) {
            notificationParamsGetNotification.ChannelId = Profile.DEFAULT_PROFILE_NAME;
        }
        if (IsEmpty(notificationParamsGetNotification.ChannelName)) {
            notificationParamsGetNotification.ChannelName = Profile.DEFAULT_PROFILE_NAME;
        }
        try {
            Intent intent2 = new Intent(context, Class.forName(notificationParamsGetNotification.UnityClass));
            intent2.putExtra("Notification.Id", notificationParamsGetNotification.Id);
            intent2.putExtra("Notification.CallbackData", notificationParamsGetNotification.CallbackData);
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            Notification notificationBuildNotification = BuildNotification(context, notificationParamsGetNotification, intent2, notificationManager);
            notificationManager.cancel(intExtra);
            if (notificationParamsGetNotification.Repeat) {
                notificationManager.cancel(intExtra);
            } else {
                Storage.RemoveNotification(context, intExtra);
            }
            notificationManager.notify(intExtra, notificationBuildNotification);
            if (IsEmpty(notificationParamsGetNotification.GroupName)) {
                return;
            }
            CreateStackedNotification(context, intent2, notificationParamsGetNotification);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void CancelScheduledNotification(int i) {
        Activity activity = UnityPlayer.currentActivity;
        ((AlarmManager) activity.getSystemService(NotificationCompat.CATEGORY_ALARM)).cancel(PendingIntent.getBroadcast(activity, i, new Intent(activity, (Class<?>) Controller.class), 0));
        Storage.RemoveNotification(activity, i);
    }

    public static void CancelDisplayedNotification(int i) {
        ((NotificationManager) UnityPlayer.currentActivity.getSystemService("notification")).cancel(i);
    }

    public static void CancelNotification(int i) {
        CancelScheduledNotification(i);
        CancelDisplayedNotification(i);
    }

    public static void CancelAllScheduledNotifications() {
        Iterator<Integer> it = Storage.GetNotificationIds(UnityPlayer.currentActivity).iterator();
        while (it.hasNext()) {
            CancelScheduledNotification(it.next().intValue());
        }
    }

    public static void CancelAllDisplayedNotifications() {
        ((NotificationManager) UnityPlayer.currentActivity.getSystemService("notification")).cancelAll();
    }

    public static void CancelAllNotifications() {
        CancelAllScheduledNotifications();
        CancelAllDisplayedNotifications();
    }

    private static boolean IsEmpty(String str) {
        return str == null || str.length() == 0;
    }

    private static void LimitStorageSize(int i) {
        List<Integer> listGetNotificationIds = Storage.GetNotificationIds(UnityPlayer.currentActivity);
        for (int i2 = 0; i2 < listGetNotificationIds.size() - i; i2++) {
            CancelScheduledNotification(listGetNotificationIds.get(i2).intValue());
            Log.w("Controller", "Too many scheduled notifications, so notification was cancelled: " + listGetNotificationIds.get(i2));
        }
    }

    private Notification BuildNotification(Context context, NotificationParams notificationParams, Intent intent, NotificationManager notificationManager) {
        Notification.Builder builder;
        PendingIntent activity = PendingIntent.getActivity(context, notificationParams.Id, intent, C.BUFFER_FLAG_FIRST_SAMPLE);
        Resources resources = context.getResources();
        int i = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            builder = new Notification.Builder(context, notificationParams.ChannelId);
            if (notificationManager.getNotificationChannel(notificationParams.ChannelId) == null) {
                NotificationChannel notificationChannel = new NotificationChannel(notificationParams.ChannelId, notificationParams.ChannelName, notificationParams.Importance);
                notificationChannel.enableVibration(notificationParams.Vibrate);
                notificationChannel.enableLights(notificationParams.Light);
                notificationChannel.setLightColor(notificationParams.LightColor);
                notificationChannel.setLockscreenVisibility(0);
                notificationChannel.setImportance(notificationParams.Importance);
                if (notificationParams.Sound && !IsEmpty(notificationParams.CustomSound)) {
                    notificationChannel.setSound(Uri.parse("android.resource://" + context.getPackageName() + "/raw/" + notificationParams.CustomSound), new AudioAttributes.Builder().setContentType(4).setUsage(6).build());
                }
                notificationManager.createNotificationChannel(notificationChannel);
            }
        } else {
            builder = new Notification.Builder(context);
        }
        builder.setContentIntent(activity).setWhen(System.currentTimeMillis()).setAutoCancel(true).setContentTitle(notificationParams.Title).setContentText(notificationParams.Message);
        if (notificationParams.Multiline && Build.VERSION.SDK_INT >= 16) {
            builder.setStyle(new Notification.BigTextStyle().bigText(notificationParams.Message));
        }
        if (!IsEmpty(notificationParams.GroupName) && Build.VERSION.SDK_INT >= 20) {
            builder.setGroup(notificationParams.GroupName);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            builder.setColor(notificationParams.SmallIconColor);
        }
        if (!IsEmpty(notificationParams.Ticker)) {
            builder.setTicker(notificationParams.Ticker);
        }
        if (!IsEmpty(notificationParams.SmallIcon)) {
            builder.setSmallIcon(resources.getIdentifier(notificationParams.SmallIcon, "drawable", context.getPackageName()));
        }
        SetLargeIcon(notificationParams.LargeIcon, builder, context);
        if (Build.VERSION.SDK_INT < 26) {
            if (notificationParams.Vibrate) {
                builder.setVibrate(notificationParams.Vibration);
            }
            if (notificationParams.Light) {
                builder.setLights(notificationParams.LightColor, notificationParams.LightOnMs, notificationParams.LightOffMs);
            }
            if (Build.VERSION.SDK_INT >= 16) {
                int i2 = notificationParams.Importance;
                if (i2 != -1000) {
                    if (i2 == 1) {
                        i = -2;
                    } else if (i2 == 2) {
                        i = -1;
                    } else if (i2 != 3) {
                        if (i2 == 4) {
                            i = 1;
                        } else if (i2 == 5) {
                            i = 2;
                        }
                    }
                }
                builder.setPriority(i);
            }
            if (notificationParams.Sound) {
                if (IsEmpty(notificationParams.CustomSound)) {
                    builder.setSound(RingtoneManager.getDefaultUri(2));
                } else {
                    builder.setSound(Uri.parse("android.resource://" + context.getPackageName() + "/raw/" + notificationParams.CustomSound));
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 17) {
            builder.setShowWhen(true);
        }
        return Build.VERSION.SDK_INT < 16 ? builder.getNotification() : builder.build();
    }

    private void CreateStackedNotification(Context context, Intent intent, NotificationParams notificationParams) {
        Notification.Builder builder;
        if (Build.VERSION.SDK_INT < 23) {
            return;
        }
        int i = -Math.abs(notificationParams.GroupName.hashCode());
        ArrayList arrayList = new ArrayList();
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        for (StatusBarNotification statusBarNotification : notificationManager.getActiveNotifications()) {
            if (statusBarNotification.getId() != i) {
                if (statusBarNotification.getGroupKey().endsWith("g:" + notificationParams.GroupName)) {
                    arrayList.add(statusBarNotification);
                }
            }
        }
        if (arrayList.size() >= 2) {
            if (Build.VERSION.SDK_INT >= 26) {
                builder = new Notification.Builder(context, notificationParams.ChannelId);
                builder.setGroupAlertBehavior(2);
            } else {
                builder = new Notification.Builder(context);
            }
            Resources resources = context.getResources();
            CharSequence charSequenceReplace = notificationParams.GroupSummary.replace("{0}", new StringBuilder(String.valueOf(arrayList.size())).toString());
            Notification.InboxStyle inboxStyle = new Notification.InboxStyle();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) ((StatusBarNotification) it.next()).getNotification().extras.get(NotificationCompat.EXTRA_TITLE);
                if (!IsEmpty(str)) {
                    inboxStyle.addLine(str);
                }
            }
            inboxStyle.setSummaryText(charSequenceReplace);
            builder.setContentTitle(notificationParams.GroupName);
            builder.setContentText(charSequenceReplace);
            builder.setStyle(inboxStyle);
            builder.setGroup(notificationParams.GroupName).setGroupSummary(true);
            builder.setAutoCancel(true).setPriority(1);
            builder.setSmallIcon(resources.getIdentifier(notificationParams.SmallIcon, "drawable", context.getPackageName()));
            builder.setContentIntent(PendingIntent.getActivity(context, ((int) System.currentTimeMillis()) / 1000, intent, C.BUFFER_FLAG_FIRST_SAMPLE));
            SetLargeIcon(notificationParams.LargeIcon, builder, context);
            if (Build.VERSION.SDK_INT >= 17) {
                builder.setShowWhen(true);
            }
            Notification notificationBuild = builder.build();
            notificationBuild.defaults = -1;
            notificationManager.notify(notificationParams.GroupName, i, notificationBuild);
        }
    }

    private void SetLargeIcon(String str, Notification.Builder builder, Context context) {
        if (IsEmpty(str)) {
            return;
        }
        if (str.equals("app_icon")) {
            try {
                builder.setLargeIcon(AppIconHelper.GetAppIcon(context.getPackageManager().getApplicationIcon(context.getPackageName())));
                return;
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
                return;
            }
        }
        Resources resources = context.getResources();
        builder.setLargeIcon(BitmapFactory.decodeResource(resources, resources.getIdentifier(str, "drawable", context.getPackageName())));
    }
}
