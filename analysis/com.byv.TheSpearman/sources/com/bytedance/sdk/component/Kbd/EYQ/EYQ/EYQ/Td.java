package com.bytedance.sdk.component.Kbd.EYQ.EYQ.EYQ;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.util.List;

/* compiled from: DBMultiUtils.java */
/* loaded from: classes2.dex */
public class Td {
    public static void EYQ(Context context, String str, ContentValues contentValues) {
        if (contentValues == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            EYQ.EYQ(context).EYQ().EYQ(str, (String) null, contentValues);
        } catch (Throwable unused) {
        }
    }

    public static void EYQ(Context context, String str, List<com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ> list) {
        if (list == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            EYQ.EYQ(context).EYQ().EYQ(str, (String) null, list);
        } catch (Throwable unused) {
        }
    }

    public static int EYQ(Context context, String str, String str2, String[] strArr) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return EYQ.EYQ(context).EYQ().EYQ(str, str2, strArr);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static int EYQ(Context context, String str, ContentValues contentValues, String str2, String[] strArr) {
        if (contentValues != null && !TextUtils.isEmpty(str)) {
            try {
                return EYQ.EYQ(context).EYQ().EYQ(str, contentValues, str2, strArr);
            } catch (Throwable unused) {
            }
        }
        return 0;
    }

    public static Cursor EYQ(Context context, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return EYQ.EYQ(context).EYQ().EYQ(str, strArr, str2, strArr2, null, null, str5);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void EYQ(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            EYQ.EYQ(context).EYQ().EYQ(Uri.decode(str));
        } catch (Throwable unused) {
        }
    }
}
