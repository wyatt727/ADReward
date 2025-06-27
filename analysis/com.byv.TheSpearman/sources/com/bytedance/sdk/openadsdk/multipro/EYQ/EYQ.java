package com.bytedance.sdk.openadsdk.multipro.EYQ;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.Kbd.EYQ.IPb;
import com.bytedance.sdk.openadsdk.core.Kbd;
import com.bytedance.sdk.openadsdk.multipro.Pm;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: DBMultiAdapter.java */
/* loaded from: classes2.dex */
public class EYQ {
    public static IPb EYQ;
    private static final ConcurrentHashMap<String, Object> mZx = new ConcurrentHashMap<>();

    /* JADX WARN: Removed duplicated region for block: B:6:0x0009 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:3:0x0002, B:4:0x0005, B:6:0x0009, B:8:0x000f, B:9:0x001f), top: B:14:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.bytedance.sdk.component.Kbd.EYQ.IPb EYQ(android.content.Context r1) {
        /*
            if (r1 != 0) goto L5
            com.bytedance.sdk.openadsdk.core.hu.EYQ()     // Catch: java.lang.Throwable -> L26
        L5:
            com.bytedance.sdk.component.Kbd.EYQ.IPb r1 = com.bytedance.sdk.openadsdk.multipro.EYQ.EYQ.EYQ     // Catch: java.lang.Throwable -> L26
            if (r1 != 0) goto L2b
            boolean r1 = com.bytedance.sdk.openadsdk.multipro.mZx.Td()     // Catch: java.lang.Throwable -> L26
            if (r1 == 0) goto L1f
            com.bytedance.sdk.openadsdk.multipro.aidl.EYQ r1 = com.bytedance.sdk.openadsdk.multipro.aidl.EYQ.EYQ()     // Catch: java.lang.Throwable -> L26
            r0 = 5
            android.os.IBinder r1 = r1.EYQ(r0)     // Catch: java.lang.Throwable -> L26
            com.bytedance.sdk.component.Kbd.EYQ.IPb r1 = com.bytedance.sdk.openadsdk.multipro.aidl.EYQ.IPb.EYQ(r1)     // Catch: java.lang.Throwable -> L26
            com.bytedance.sdk.openadsdk.multipro.EYQ.EYQ.EYQ = r1     // Catch: java.lang.Throwable -> L26
            goto L2b
        L1f:
            com.bytedance.sdk.openadsdk.multipro.aidl.EYQ.IPb r1 = com.bytedance.sdk.openadsdk.multipro.aidl.EYQ.IPb.mZx()     // Catch: java.lang.Throwable -> L26
            com.bytedance.sdk.openadsdk.multipro.EYQ.EYQ.EYQ = r1     // Catch: java.lang.Throwable -> L26
            goto L2b
        L26:
            java.lang.String r1 = "binder error"
            com.bytedance.sdk.openadsdk.utils.FH.QQ(r1)
        L2b:
            com.bytedance.sdk.component.Kbd.EYQ.IPb r1 = com.bytedance.sdk.openadsdk.multipro.EYQ.EYQ.EYQ
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.multipro.EYQ.EYQ.EYQ(android.content.Context):com.bytedance.sdk.component.Kbd.EYQ.IPb");
    }

    private static String EYQ() {
        return Pm.mZx + "/t_db/ttopensdk.db/";
    }

    public static void EYQ(Context context, String str, ContentValues contentValues) {
        if (contentValues == null || TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (EYQ(str)) {
            if (!com.bytedance.sdk.openadsdk.multipro.mZx.Td()) {
                Kbd.EYQ(context).EYQ().EYQ(str, (String) null, contentValues);
                return;
            }
            IPb iPbEYQ = EYQ(context);
            if (iPbEYQ != null) {
                iPbEYQ.EYQ(Uri.parse(EYQ() + str), contentValues);
            }
        }
    }

    public static int EYQ(Context context, String str, String str2, String[] strArr) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        synchronized (EYQ(str)) {
            if (!com.bytedance.sdk.openadsdk.multipro.mZx.Td()) {
                return Kbd.EYQ(context).EYQ().EYQ(str, str2, strArr);
            }
            IPb iPbEYQ = EYQ(context);
            if (iPbEYQ != null) {
                return iPbEYQ.EYQ(Uri.parse(EYQ() + str), str2, strArr);
            }
            return 0;
        }
    }

    public static int EYQ(Context context, String str, ContentValues contentValues, String str2, String[] strArr) {
        if (contentValues != null && !TextUtils.isEmpty(str)) {
            synchronized (EYQ(str)) {
                if (!com.bytedance.sdk.openadsdk.multipro.mZx.Td()) {
                    return Kbd.EYQ(context).EYQ().EYQ(str, contentValues, str2, strArr);
                }
                IPb iPbEYQ = EYQ(context);
                if (iPbEYQ != null) {
                    return iPbEYQ.EYQ(Uri.parse(EYQ() + str), contentValues, str2, strArr);
                }
            }
        }
        return 0;
    }

    public static Map<String, List<String>> EYQ(Context context, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (EYQ(str)) {
            if (!com.bytedance.sdk.openadsdk.multipro.mZx.Td()) {
                return EYQ(Kbd.EYQ(context).EYQ().EYQ(str, strArr, str2, strArr2, str3, str4, str5));
            }
            IPb iPbEYQ = EYQ(context);
            if (iPbEYQ != null) {
                return iPbEYQ.EYQ(Uri.parse(EYQ() + str), strArr, str2, strArr2, str5);
            }
            return null;
        }
    }

    public static Map<String, List<String>> EYQ(Cursor cursor) {
        HashMap map = new HashMap();
        if (cursor != null) {
            try {
                String[] columnNames = cursor.getColumnNames();
                while (cursor.getCount() > 0 && cursor.moveToNext()) {
                    for (String str : columnNames) {
                        if (!map.containsKey(str)) {
                            map.put(str, new LinkedList());
                        }
                        ((List) map.get(str)).add(cursor.getString(cursor.getColumnIndex(str)));
                    }
                }
            } catch (Throwable unused) {
                if (cursor != null) {
                }
            }
            if (cursor != null) {
                cursor.close();
            }
        }
        return map;
    }

    private static Object EYQ(String str) {
        Object obj;
        ConcurrentHashMap<String, Object> concurrentHashMap = mZx;
        Object obj2 = concurrentHashMap.get(str);
        if (obj2 != null) {
            return obj2;
        }
        synchronized (EYQ.class) {
            obj = concurrentHashMap.get(str);
            if (obj == null) {
                obj = new Object();
                concurrentHashMap.put(str, obj);
            }
        }
        return obj;
    }
}
