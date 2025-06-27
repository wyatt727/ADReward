package com.bytedance.sdk.openadsdk.multipro.EYQ;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.Kbd;
import com.bytedance.sdk.openadsdk.core.hu;

/* compiled from: DBMultiProviderImpl.java */
/* loaded from: classes2.dex */
public class mZx implements com.bytedance.sdk.openadsdk.multipro.EYQ {
    private static final Object mZx = new Object();
    private Context EYQ;

    @Override // com.bytedance.sdk.openadsdk.multipro.EYQ
    public String EYQ() {
        return "t_db";
    }

    private boolean mZx(Uri uri) {
        return uri == null || TextUtils.isEmpty(uri.getPath());
    }

    private Context mZx() {
        Context context = this.EYQ;
        return context == null ? hu.EYQ() : context;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.EYQ
    public Cursor EYQ(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        synchronized (mZx) {
            if (mZx(uri)) {
                return null;
            }
            String[] strArrSplit = uri.getPath().split("/");
            if (strArrSplit != null && strArrSplit.length >= 4) {
                String str3 = strArrSplit[2];
                String str4 = strArrSplit[3];
                if (!"ttopensdk.db".equals(str3)) {
                    return null;
                }
                return Kbd.EYQ(mZx()).EYQ().EYQ(str4, strArr, str, strArr2, null, null, str2);
            }
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.EYQ
    public String EYQ(Uri uri) {
        synchronized (mZx) {
            if (mZx(uri)) {
                return null;
            }
            String[] strArrSplit = uri.getPath().split("/");
            if (strArrSplit != null && strArrSplit.length >= 5) {
                String str = strArrSplit[2];
                String str2 = strArrSplit[4];
                if ("ttopensdk.db".equals(str)) {
                    if ("execSQL".equals(str2)) {
                        String queryParameter = uri.getQueryParameter("sql");
                        if (!TextUtils.isEmpty(queryParameter)) {
                            Kbd.EYQ(mZx()).EYQ().EYQ(Uri.decode(queryParameter));
                        }
                    } else if ("transactionBegin".equals(str2)) {
                        Kbd.EYQ(mZx()).EYQ().mZx();
                    } else if ("transactionSetSuccess".equals(str2)) {
                        Kbd.EYQ(mZx()).EYQ().Td();
                    } else if ("transactionEnd".equals(str2)) {
                        Kbd.EYQ(mZx()).EYQ().Pm();
                    }
                }
                return null;
            }
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.EYQ
    public Uri EYQ(Uri uri, ContentValues contentValues) {
        synchronized (mZx) {
            if (mZx(uri)) {
                return null;
            }
            String[] strArrSplit = uri.getPath().split("/");
            if (strArrSplit != null && strArrSplit.length >= 4) {
                String str = strArrSplit[2];
                String str2 = strArrSplit[3];
                if ("ttopensdk.db".equals(str)) {
                    Kbd.EYQ(mZx()).EYQ().EYQ(str2, (String) null, contentValues);
                }
                return null;
            }
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.EYQ
    public int EYQ(Uri uri, String str, String[] strArr) {
        synchronized (mZx) {
            if (mZx(uri)) {
                return 0;
            }
            String[] strArrSplit = uri.getPath().split("/");
            if (strArrSplit != null && strArrSplit.length >= 4) {
                String str2 = strArrSplit[2];
                String str3 = strArrSplit[3];
                if (!"ttopensdk.db".equals(str2)) {
                    return 0;
                }
                return Kbd.EYQ(mZx()).EYQ().EYQ(str3, str, strArr);
            }
            return 0;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.EYQ
    public int EYQ(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        synchronized (mZx) {
            if (mZx(uri)) {
                return 0;
            }
            String[] strArrSplit = uri.getPath().split("/");
            if (strArrSplit != null && strArrSplit.length >= 4) {
                String str2 = strArrSplit[2];
                String str3 = strArrSplit[3];
                if (!"ttopensdk.db".equals(str2)) {
                    return 0;
                }
                return Kbd.EYQ(mZx()).EYQ().EYQ(str3, contentValues, str, strArr);
            }
            return 0;
        }
    }
}
