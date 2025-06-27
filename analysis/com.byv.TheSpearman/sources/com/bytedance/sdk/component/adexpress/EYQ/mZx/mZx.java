package com.bytedance.sdk.component.adexpress.EYQ.mZx;

import android.text.TextUtils;
import android.util.Pair;
import android.webkit.WebResourceResponse;
import com.bytedance.sdk.component.adexpress.EYQ.Td.EYQ;
import com.bytedance.sdk.component.adexpress.Pm.VwS;
import com.bytedance.sdk.component.utils.pi;
import com.json.m4;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: TTDynamic.java */
/* loaded from: classes2.dex */
public class mZx {
    static Object EYQ = new Object();

    public static void EYQ() {
        Kbd.mZx();
    }

    public static void mZx() {
        try {
            QQ.Pm();
            File fileQQ = Kbd.QQ();
            if (fileQQ == null || !fileQQ.exists()) {
                return;
            }
            if (fileQQ.getParentFile() != null) {
                com.bytedance.sdk.component.utils.IPb.Td(fileQQ.getParentFile());
            } else {
                com.bytedance.sdk.component.utils.IPb.Td(fileQQ);
            }
        } catch (Throwable unused) {
        }
    }

    public static String Td() {
        return IPb.Td();
    }

    public static com.bytedance.sdk.component.adexpress.EYQ.Td.mZx EYQ(String str) {
        return VwS.EYQ().EYQ(str);
    }

    public static void EYQ(com.bytedance.sdk.component.adexpress.EYQ.Td.Pm pm) {
        VwS.EYQ().EYQ(pm, pm.IPb);
    }

    public static Set<String> mZx(String str) {
        return VwS.EYQ().mZx(str);
    }

    public static com.bytedance.sdk.component.adexpress.EYQ.Td.mZx Td(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        com.bytedance.sdk.component.adexpress.EYQ.Td.mZx mzxEYQ = VwS.EYQ().EYQ(str);
        if (mzxEYQ != null) {
            mzxEYQ.EYQ(Long.valueOf(System.currentTimeMillis()));
            EYQ(mzxEYQ);
        }
        return mzxEYQ;
    }

    private static void EYQ(final com.bytedance.sdk.component.adexpress.EYQ.Td.mZx mzx) {
        com.bytedance.sdk.component.VwS.IPb.EYQ(new com.bytedance.sdk.component.VwS.QQ("updateTmplTime") { // from class: com.bytedance.sdk.component.adexpress.EYQ.mZx.mZx.1
            @Override // java.lang.Runnable
            public void run() {
                synchronized (mZx.EYQ) {
                    IPb.EYQ().EYQ(mzx, true);
                }
            }
        }, 10);
    }

    public static com.bytedance.sdk.component.adexpress.EYQ.Td.EYQ Pm() {
        return Kbd.mZx().IPb();
    }

    @Deprecated
    private static String IPb() {
        com.bytedance.sdk.component.adexpress.EYQ.Td.EYQ eyqPm = Pm();
        if (eyqPm == null) {
            return null;
        }
        return eyqPm.Pm();
    }

    public static String Pm(String str) {
        com.bytedance.sdk.component.adexpress.EYQ.Td.EYQ eyq;
        com.bytedance.sdk.component.adexpress.EYQ.Td.EYQ eyqPm = Pm();
        if (eyqPm == null) {
            return null;
        }
        if (!TextUtils.isEmpty(str)) {
            Map<String, com.bytedance.sdk.component.adexpress.EYQ.Td.EYQ> mapEYQ = eyqPm.EYQ();
            if (mapEYQ == null || mapEYQ.size() <= 0 || (eyq = mapEYQ.get(str)) == null) {
                return null;
            }
            return eyq.Pm();
        }
        return IPb();
    }

    public static boolean Kbd() {
        return Kbd.mZx().Kbd();
    }

    public static EYQ EYQ(String str, VwS.EYQ eyq, String str2, String str3) throws IOException {
        File fileIPb;
        EYQ eyq2 = new EYQ();
        if (TextUtils.isEmpty(str3)) {
            fileIPb = null;
        } else {
            fileIPb = mZx(str3, str);
            if (fileIPb != null) {
                eyq2.EYQ(1);
            }
        }
        if (fileIPb == null && (fileIPb = VwS(str)) != null) {
            eyq2.EYQ(3);
        }
        if (fileIPb == null && (fileIPb = IPb(str)) != null) {
            eyq2.EYQ(2);
        }
        if (!TextUtils.isEmpty(str3)) {
            if (!EYQ(str, str3)) {
                eyq2.EYQ(4);
            }
        } else if (!Kbd(str)) {
            eyq2.EYQ(6);
        }
        eyq2.mZx();
        if (fileIPb != null) {
            try {
                eyq2.EYQ(new WebResourceResponse(eyq.EYQ(), m4.M, new FileInputStream(fileIPb)));
            } catch (Throwable th) {
                pi.EYQ("TTDynamic", "get html WebResourceResponse error", th);
            }
        }
        return eyq2;
    }

    private static boolean EYQ(String str, String str2) {
        com.bytedance.sdk.component.adexpress.EYQ.Td.EYQ eyqPm;
        com.bytedance.sdk.component.adexpress.EYQ.Td.EYQ eyq;
        if (!Kbd() || (eyqPm = Pm()) == null) {
            return false;
        }
        Map<String, com.bytedance.sdk.component.adexpress.EYQ.Td.EYQ> mapEYQ = eyqPm.EYQ();
        if (mapEYQ.size() == 0 || (eyq = mapEYQ.get(str2)) == null) {
            return false;
        }
        for (EYQ.C0089EYQ c0089eyq : eyq.IPb()) {
            if (c0089eyq != null && TextUtils.equals(str, c0089eyq.EYQ())) {
                return true;
            }
        }
        return false;
    }

    private static boolean Kbd(String str) {
        com.bytedance.sdk.component.adexpress.EYQ.Td.EYQ eyqPm;
        List<EYQ.C0089EYQ> listIPb;
        if (!Kbd() || (eyqPm = Pm()) == null || (listIPb = eyqPm.IPb()) == null) {
            return false;
        }
        for (EYQ.C0089EYQ c0089eyq : listIPb) {
            if (c0089eyq != null && TextUtils.equals(str, c0089eyq.EYQ())) {
                return true;
            }
        }
        return false;
    }

    private static File IPb(String str) throws IOException {
        if (!Kbd()) {
            return null;
        }
        for (EYQ.C0089EYQ c0089eyq : Pm().IPb()) {
            if (c0089eyq.EYQ() != null && c0089eyq.EYQ().equals(str)) {
                File file = new File(Kbd.QQ(), com.bytedance.sdk.component.utils.Kbd.EYQ(c0089eyq.EYQ()));
                String strEYQ = com.bytedance.sdk.component.utils.Kbd.EYQ(file);
                if (c0089eyq.mZx() == null || !c0089eyq.mZx().equals(strEYQ)) {
                    return null;
                }
                return file;
            }
        }
        return null;
    }

    private static File VwS(String str) {
        List<Pair<String, String>> listMZx;
        EYQ.mZx mzxKbd = Pm().Kbd();
        if (mzxKbd == null || (listMZx = mzxKbd.mZx()) == null || listMZx.size() <= 0) {
            return null;
        }
        for (Pair<String, String> pair : listMZx) {
            if (pair.second != null && ((String) pair.second).equals(str)) {
                return new File(Kbd.QQ(), (String) pair.first);
            }
        }
        return null;
    }

    private static File mZx(String str, String str2) throws IOException {
        com.bytedance.sdk.component.adexpress.EYQ.Td.EYQ eyq;
        com.bytedance.sdk.component.adexpress.EYQ.Td.EYQ eyqPm = Pm();
        if (eyqPm == null || !Kbd()) {
            return null;
        }
        Map<String, com.bytedance.sdk.component.adexpress.EYQ.Td.EYQ> mapEYQ = eyqPm.EYQ();
        if (mapEYQ.size() == 0 || (eyq = mapEYQ.get(str)) == null) {
            return null;
        }
        for (EYQ.C0089EYQ c0089eyq : eyq.IPb()) {
            if (c0089eyq.EYQ() != null && c0089eyq.EYQ().equals(str2)) {
                File file = new File(Kbd.QQ(), com.bytedance.sdk.component.utils.Kbd.EYQ(c0089eyq.EYQ()));
                String strEYQ = com.bytedance.sdk.component.utils.Kbd.EYQ(file);
                if (c0089eyq.mZx() == null || !c0089eyq.mZx().equals(strEYQ)) {
                    return null;
                }
                return file;
            }
        }
        return null;
    }

    public static boolean EYQ(JSONObject jSONObject) {
        Object objOpt;
        return (jSONObject == null || (objOpt = jSONObject.opt("template_Plugin")) == null || TextUtils.isEmpty(objOpt.toString())) ? false : true;
    }

    public static boolean mZx(JSONObject jSONObject) {
        Object objOpt;
        if (jSONObject == null) {
            return false;
        }
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("creatives");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject == null || (objOpt = jSONObjectOptJSONObject.opt("template_Plugin")) == null || TextUtils.isEmpty(objOpt.toString())) {
                        return false;
                    }
                }
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }
}
