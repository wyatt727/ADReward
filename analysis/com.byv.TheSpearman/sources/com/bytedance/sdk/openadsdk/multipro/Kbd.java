package com.bytedance.sdk.openadsdk.multipro;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: TTProviderManager.java */
/* loaded from: classes2.dex */
public class Kbd implements EYQ {
    private static volatile Kbd EYQ;
    private static final List<EYQ> Td;
    private static WeakReference<Context> mZx;

    private boolean Td(Uri uri) {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.EYQ
    public String EYQ() {
        return "";
    }

    static {
        List<EYQ> listSynchronizedList = Collections.synchronizedList(new ArrayList());
        Td = listSynchronizedList;
        listSynchronizedList.add(new com.bytedance.sdk.openadsdk.multipro.Pm.Td());
        listSynchronizedList.add(new com.bytedance.sdk.openadsdk.multipro.EYQ.mZx());
        listSynchronizedList.add(new com.bytedance.sdk.openadsdk.multipro.Td.EYQ());
        listSynchronizedList.add(new com.bytedance.sdk.openadsdk.mZx.EYQ.Kbd(new com.bytedance.sdk.component.Kbd.EYQ.mZx.mZx.mZx()));
        Iterator<EYQ> it = listSynchronizedList.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public static Kbd EYQ(Context context) {
        if (context != null) {
            mZx = new WeakReference<>(context.getApplicationContext());
        }
        if (EYQ == null) {
            synchronized (Kbd.class) {
                if (EYQ == null) {
                    EYQ = new Kbd();
                }
            }
        }
        return EYQ;
    }

    private Kbd() {
    }

    private EYQ mZx(Uri uri) {
        if (uri == null || !Td(uri)) {
            return null;
        }
        String[] strArrSplit = uri.getPath().split("/");
        if (strArrSplit.length < 2) {
            return null;
        }
        String str = strArrSplit[1];
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (EYQ eyq : Td) {
            if (str.equals(eyq.EYQ())) {
                return eyq;
            }
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.EYQ
    public Cursor EYQ(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        try {
            EYQ eyqMZx = mZx(uri);
            if (eyqMZx != null) {
                return eyqMZx.EYQ(uri, strArr, str, strArr2, str2);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.EYQ
    public String EYQ(Uri uri) {
        try {
            EYQ eyqMZx = mZx(uri);
            if (eyqMZx != null) {
                return eyqMZx.EYQ(uri);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.EYQ
    public Uri EYQ(Uri uri, ContentValues contentValues) {
        try {
            EYQ eyqMZx = mZx(uri);
            if (eyqMZx != null) {
                return eyqMZx.EYQ(uri, contentValues);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.EYQ
    public int EYQ(Uri uri, String str, String[] strArr) {
        try {
            EYQ eyqMZx = mZx(uri);
            if (eyqMZx != null) {
                return eyqMZx.EYQ(uri, str, strArr);
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.EYQ
    public int EYQ(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        try {
            EYQ eyqMZx = mZx(uri);
            if (eyqMZx != null) {
                return eyqMZx.EYQ(uri, contentValues, str, strArr);
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }
}
