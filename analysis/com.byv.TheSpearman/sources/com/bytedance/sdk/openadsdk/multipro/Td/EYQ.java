package com.bytedance.sdk.openadsdk.multipro.Td;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.bytedance.sdk.component.Kbd.EYQ.IPb;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.multipro.Pm;
import com.json.mediationsdk.metadata.a;
import java.util.Objects;

/* compiled from: FrequentCallProviderImpl.java */
/* loaded from: classes2.dex */
public class EYQ implements com.bytedance.sdk.openadsdk.multipro.EYQ {
    @Override // com.bytedance.sdk.openadsdk.multipro.EYQ
    public int EYQ(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.EYQ
    public int EYQ(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.EYQ
    public Cursor EYQ(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.EYQ
    public Uri EYQ(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.EYQ
    public String EYQ() {
        return "t_frequent";
    }

    private static IPb Pm() {
        try {
            if (hu.EYQ() != null) {
                return com.bytedance.sdk.openadsdk.multipro.EYQ.EYQ.EYQ(hu.EYQ());
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean EYQ(String str) {
        if (hu.EYQ() == null) {
            return false;
        }
        try {
            IPb iPbPm = Pm();
            if (iPbPm != null) {
                return a.g.equals(iPbPm.EYQ(Uri.parse(Kbd() + "checkFrequency?rit=" + str)));
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static boolean mZx() {
        if (hu.EYQ() == null) {
            return false;
        }
        try {
            IPb iPbPm = Pm();
            if (iPbPm != null) {
                return a.g.equals(iPbPm.EYQ(Uri.parse(Kbd() + "isSilent")));
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static String Td() {
        if (hu.EYQ() == null) {
            return null;
        }
        try {
            IPb iPbPm = Pm();
            if (iPbPm != null) {
                return iPbPm.EYQ(Uri.parse(Kbd() + "maxRit"));
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    private static String Kbd() {
        return Pm.mZx + "/t_frequent/";
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.EYQ
    public String EYQ(Uri uri) {
        Objects.toString(uri);
        String str = uri.getPath().split("/")[2];
        if ("checkFrequency".equals(str)) {
            return com.bytedance.sdk.openadsdk.core.Pm.EYQ.EYQ().EYQ(uri.getQueryParameter("rit")) ? a.g : "false";
        }
        if ("isSilent".equals(str)) {
            return com.bytedance.sdk.openadsdk.core.Pm.EYQ.EYQ().mZx() ? a.g : "false";
        }
        if ("maxRit".equals(str)) {
            return com.bytedance.sdk.openadsdk.core.Pm.EYQ.EYQ().Td();
        }
        return null;
    }
}
