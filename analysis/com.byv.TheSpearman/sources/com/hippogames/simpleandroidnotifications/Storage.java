package com.hippogames.simpleandroidnotifications;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
public class Storage {
    public static List<Integer> GetNotificationIds(Context context) {
        String string = PreferenceManager.getDefaultSharedPreferences(context).getString("Notifications", null);
        if (string == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (String str : string.split(",")) {
            try {
                arrayList.add(Integer.valueOf(Integer.parseInt(str)));
            } catch (NumberFormatException unused) {
            }
        }
        return arrayList;
    }

    public static void AddNotification(Context context, NotificationParams notificationParams) {
        String string;
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editorEdit = defaultSharedPreferences.edit();
        String string2 = defaultSharedPreferences.getString("Notifications", null);
        int i = notificationParams.Id;
        StringBuilder sb = new StringBuilder("Current notifications header length is ");
        sb.append(string2 == null ? 0 : string2.length());
        Log.i("Storage", sb.toString());
        try {
            if (string2 == null) {
                string = Integer.toString(i);
            } else {
                string = String.valueOf(string2) + "," + i;
            }
            editorEdit.putString("Notifications", string);
            editorEdit.putString("Notification." + i, Serializer.ToString(notificationParams));
            editorEdit.apply();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static NotificationParams GetNotification(Context context, int i) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        if (!defaultSharedPreferences.contains("Notification." + i)) {
            return null;
        }
        try {
            return (NotificationParams) Serializer.FromString(defaultSharedPreferences.getString("Notification." + i, null));
        } catch (Exception unused) {
            return null;
        }
    }

    public static void RemoveNotification(Context context, int i) {
        List<Integer> listGetNotificationIds = GetNotificationIds(context);
        if (listGetNotificationIds.size() == 0) {
            return;
        }
        listGetNotificationIds.removeAll(Arrays.asList(Integer.valueOf(i)));
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        editorEdit.putString("Notifications", TextUtils.join(",", listGetNotificationIds));
        editorEdit.remove("Notification." + i);
        editorEdit.apply();
    }
}
