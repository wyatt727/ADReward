package com.bytedance.sdk.component.Kbd.EYQ.mZx.mZx;

import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.Kbd.EYQ.EYQ.EYQ.IPb;
import com.bytedance.sdk.component.Kbd.EYQ.EYQ.EYQ.VwS;
import com.bytedance.sdk.component.Kbd.EYQ.QQ;
import java.util.Iterator;
import java.util.List;

/* compiled from: EventProviderImpl.java */
/* loaded from: classes2.dex */
public class EYQ {
    private static ContentResolver Td() {
        try {
            if (QQ.VwS().IPb() != null) {
                return QQ.VwS().IPb().getContentResolver();
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void EYQ() {
        if (QQ.VwS().IPb() == null) {
            return;
        }
        try {
            ContentResolver contentResolverTd = Td();
            if (contentResolverTd != null) {
                contentResolverTd.getType(Uri.parse(Pm() + "adLogStart"));
            }
        } catch (Throwable unused) {
        }
    }

    public static void mZx() {
        if (QQ.VwS().IPb() == null) {
            return;
        }
        try {
            ContentResolver contentResolverTd = Td();
            if (contentResolverTd != null) {
                contentResolverTd.getType(Uri.parse(Pm() + "adLogStop"));
            }
        } catch (Throwable unused) {
        }
    }

    public static void EYQ(com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ eyq) {
        if (eyq == null) {
            return;
        }
        try {
            ContentResolver contentResolverTd = Td();
            if (contentResolverTd != null) {
                contentResolverTd.getType(Uri.parse(Pm() + "adLogDispatch?event=" + IPb.EYQ(eyq.IPb())));
            }
        } catch (Throwable th) {
            th.toString();
        }
    }

    public static void EYQ(String str, List<String> list, boolean z) {
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return;
        }
        try {
            StringBuilder sb = new StringBuilder();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                sb.append(IPb.EYQ(it.next()));
                sb.append(",");
            }
            String str2 = "?did=" + String.valueOf(str) + "&track=" + String.valueOf(IPb.EYQ(sb.toString())) + "&replace=" + String.valueOf(z);
            ContentResolver contentResolverTd = Td();
            if (contentResolverTd != null) {
                contentResolverTd.getType(Uri.parse(Pm() + "trackAdUrl" + str2));
            }
        } catch (Throwable unused) {
        }
    }

    public static void EYQ(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            ContentResolver contentResolverTd = Td();
            if (contentResolverTd != null) {
                contentResolverTd.getType(Uri.parse(Pm() + "trackAdFailed?did=" + String.valueOf(str)));
            }
        } catch (Throwable unused) {
        }
    }

    private static String Pm() {
        return VwS.mZx + "/ad_log_event/";
    }
}
