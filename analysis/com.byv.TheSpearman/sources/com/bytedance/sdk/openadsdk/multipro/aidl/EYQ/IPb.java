package com.bytedance.sdk.openadsdk.multipro.aidl.EYQ;

import android.content.ContentValues;
import android.net.Uri;
import com.bytedance.sdk.component.Kbd.EYQ.IPb;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.core.settings.MxO;
import java.util.Map;

/* compiled from: ProviderListenerManagerImpl.java */
/* loaded from: classes2.dex */
public class IPb extends IPb.EYQ {
    private static volatile IPb EYQ;

    public static IPb mZx() {
        if (EYQ == null) {
            synchronized (IPb.class) {
                if (EYQ == null) {
                    EYQ = new IPb();
                }
            }
        }
        return EYQ;
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.IPb
    public Map EYQ(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        if (!MxO.EYQ()) {
            return null;
        }
        try {
            return com.bytedance.sdk.openadsdk.multipro.EYQ.EYQ.EYQ(com.bytedance.sdk.openadsdk.multipro.Kbd.EYQ(hu.EYQ()).EYQ(uri, strArr, str, strArr2, str2));
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.IPb
    public String EYQ(Uri uri) {
        if (MxO.EYQ()) {
            return com.bytedance.sdk.openadsdk.multipro.Kbd.EYQ(hu.EYQ()).EYQ(uri);
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.IPb
    public String EYQ(Uri uri, ContentValues contentValues) {
        Uri uriEYQ;
        if (MxO.EYQ() && (uriEYQ = com.bytedance.sdk.openadsdk.multipro.Kbd.EYQ(hu.EYQ()).EYQ(uri, contentValues)) != null) {
            return uriEYQ.toString();
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.IPb
    public int EYQ(Uri uri, String str, String[] strArr) {
        if (MxO.EYQ()) {
            return com.bytedance.sdk.openadsdk.multipro.Kbd.EYQ(hu.EYQ()).EYQ(uri, str, strArr);
        }
        return 0;
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.IPb
    public int EYQ(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        if (MxO.EYQ()) {
            return com.bytedance.sdk.openadsdk.multipro.Kbd.EYQ(hu.EYQ()).EYQ(uri, contentValues, str, strArr);
        }
        return 0;
    }
}
