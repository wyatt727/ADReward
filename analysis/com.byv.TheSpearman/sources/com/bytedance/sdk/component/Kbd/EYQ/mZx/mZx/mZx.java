package com.bytedance.sdk.component.Kbd.EYQ.mZx.mZx;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.Kbd.EYQ.EYQ.EYQ.VwS;
import com.bytedance.sdk.component.Kbd.EYQ.IPb;
import com.bytedance.sdk.component.Kbd.EYQ.QQ;
import java.util.Iterator;
import java.util.List;

/* compiled from: OverSeasEventProviderImpl.java */
/* loaded from: classes2.dex */
public class mZx {
    public static IPb EYQ;

    public int EYQ(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    public int EYQ(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public Cursor EYQ(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public Uri EYQ(Uri uri, ContentValues contentValues) {
        return null;
    }

    public String Td() {
        return "ad_log_event";
    }

    public static IPb EYQ(Context context) {
        try {
            if (EYQ == null) {
                EYQ = QQ.VwS().hu().MxO();
            }
        } catch (Exception unused) {
        }
        return EYQ;
    }

    public static void EYQ() {
        if (QQ.VwS().IPb() == null) {
            return;
        }
        try {
            IPb iPbEYQ = EYQ(QQ.VwS().IPb());
            if (iPbEYQ != null) {
                iPbEYQ.EYQ(Uri.parse(Pm() + "adLogStart"));
            }
        } catch (Throwable unused) {
        }
    }

    public static void mZx() {
        if (QQ.VwS().IPb() == null) {
            return;
        }
        try {
            IPb iPbEYQ = EYQ(QQ.VwS().IPb());
            if (iPbEYQ != null) {
                iPbEYQ.EYQ(Uri.parse(Pm() + "adLogStop"));
            }
        } catch (Throwable unused) {
        }
    }

    public static void EYQ(com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ eyq) {
        if (eyq == null) {
            return;
        }
        try {
            IPb iPbEYQ = EYQ(QQ.VwS().IPb());
            if (iPbEYQ != null) {
                iPbEYQ.EYQ(Uri.parse(Pm() + "adLogDispatch?event=" + com.bytedance.sdk.component.Kbd.EYQ.EYQ.EYQ.IPb.EYQ(eyq.IPb())));
            }
        } catch (Throwable th) {
            th.toString();
        }
    }

    public static void EYQ(String str, List<String> list, boolean z, int i, String str2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        try {
            StringBuilder sb = new StringBuilder();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                sb.append(com.bytedance.sdk.component.Kbd.EYQ.EYQ.EYQ.IPb.EYQ(it.next()));
                sb.append(",");
            }
            String str3 = "?did=" + String.valueOf(str) + "&track=" + String.valueOf(com.bytedance.sdk.component.Kbd.EYQ.EYQ.EYQ.IPb.EYQ(sb.toString())) + "&replace=" + String.valueOf(z) + "&urlType=" + String.valueOf(i) + "&adId=" + str2;
            IPb iPbEYQ = EYQ(QQ.VwS().IPb());
            if (iPbEYQ != null) {
                iPbEYQ.EYQ(Uri.parse(Pm() + "trackAdUrl" + str3));
            }
        } catch (Throwable unused) {
        }
    }

    public static void EYQ(String str, boolean z) {
        if (QQ.VwS().hu().IPb() == 0 && TextUtils.isEmpty(str)) {
            return;
        }
        try {
            IPb iPbEYQ = EYQ(QQ.VwS().IPb());
            if (iPbEYQ != null) {
                iPbEYQ.EYQ(Uri.parse(Pm() + "trackAdFailed?did=" + String.valueOf(str) + "&triggerOnInit=" + z));
            }
        } catch (Throwable unused) {
        }
    }

    private static String Pm() {
        return VwS.mZx + "/ad_log_event/";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String EYQ(android.net.Uri r12) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.Kbd.EYQ.mZx.mZx.mZx.EYQ(android.net.Uri):java.lang.String");
    }
}
