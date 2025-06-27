package com.bytedance.sdk.component.adexpress.EYQ.mZx;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.pi;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: TmplDiffManager.java */
/* loaded from: classes2.dex */
public class VwS {
    private static volatile VwS EYQ;
    private AtomicBoolean mZx = new AtomicBoolean(false);

    public static VwS EYQ() {
        if (EYQ == null) {
            synchronized (VwS.class) {
                if (EYQ == null) {
                    EYQ = new VwS();
                }
            }
        }
        return EYQ;
    }

    private VwS() {
    }

    public com.bytedance.sdk.component.adexpress.EYQ.Td.mZx EYQ(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return IPb.EYQ().EYQ(str);
    }

    public Set<String> mZx(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return IPb.EYQ().mZx(str);
    }

    private void mZx() {
        if (com.bytedance.sdk.component.adexpress.EYQ.EYQ.EYQ.EYQ().Td() == null) {
            return;
        }
        int iEYQ = com.bytedance.sdk.component.adexpress.EYQ.EYQ.EYQ.EYQ().Td().EYQ();
        if (iEYQ <= 0) {
            iEYQ = 100;
        }
        List<com.bytedance.sdk.component.adexpress.EYQ.Td.mZx> listMZx = IPb.EYQ().mZx();
        if (listMZx == null || listMZx.isEmpty() || iEYQ >= listMZx.size()) {
            if (listMZx == null) {
                return;
            }
            listMZx.size();
            return;
        }
        TreeMap treeMap = new TreeMap();
        for (com.bytedance.sdk.component.adexpress.EYQ.Td.mZx mzx : listMZx) {
            treeMap.put(mzx.VwS(), mzx);
        }
        HashSet hashSet = new HashSet();
        int size = (int) (listMZx.size() - (iEYQ * 0.75f));
        int i = 0;
        for (Map.Entry entry : treeMap.entrySet()) {
            if (entry != null && i < size) {
                i++;
                ((Long) entry.getKey()).longValue();
                com.bytedance.sdk.component.adexpress.EYQ.Td.mZx mzx2 = (com.bytedance.sdk.component.adexpress.EYQ.Td.mZx) entry.getValue();
                if (mzx2 != null) {
                    hashSet.add(mzx2.mZx());
                }
            }
        }
        EYQ(hashSet);
        this.mZx.set(false);
    }

    private JSONObject Td(String str) {
        com.bytedance.sdk.component.adexpress.EYQ.EYQ.Td Td = com.bytedance.sdk.component.adexpress.EYQ.EYQ.EYQ.EYQ().Td();
        if (Td == null) {
            return null;
        }
        com.bytedance.sdk.component.IPb.mZx.mZx mzxVwS = Td.VwS();
        mzxVwS.EYQ(str);
        com.bytedance.sdk.component.IPb.mZx mzxEYQ = mzxVwS.EYQ();
        if (mzxEYQ != null) {
            try {
                if (mzxEYQ.IPb() && mzxEYQ.Pm() != null) {
                    return new JSONObject(mzxEYQ.Pm());
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public void EYQ(com.bytedance.sdk.component.adexpress.EYQ.Td.Pm pm, String str) {
        if (pm == null) {
            pi.EYQ("TmplDiffManager", "saveTemplate error: tplInfo == null");
            return;
        }
        final String str2 = pm.EYQ;
        final String str3 = pm.Td;
        final String str4 = pm.mZx;
        final String str5 = pm.Pm;
        final String str6 = pm.Kbd;
        final String strQQ = TextUtils.isEmpty(str) ? com.bytedance.sdk.component.adexpress.EYQ.EYQ.EYQ.EYQ().Td() != null ? com.bytedance.sdk.component.adexpress.EYQ.EYQ.EYQ.EYQ().Td().QQ() : "" : str;
        if (TextUtils.isEmpty(str2)) {
            pi.EYQ("TmplDiffManager", "saveTemplate error:tmpId is empty");
        } else {
            com.bytedance.sdk.component.VwS.IPb.EYQ(new com.bytedance.sdk.component.VwS.QQ("saveTemplate") { // from class: com.bytedance.sdk.component.adexpress.EYQ.mZx.VwS.1
                @Override // java.lang.Runnable
                public void run() {
                    VwS.this.EYQ(str2, str3, str4, str5, str6, strQQ);
                }
            }, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void EYQ(String str, String str2, String str3, String str4, String str5, String str6) {
        if (EYQ(str) != null) {
            if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str3)) {
                mZx(str6, str, str3, str2, str4, str5);
            }
            return;
        } else if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str3)) {
            EYQ(str2, str6, str);
        } else {
            mZx(str6, str, str3, str2, str4, str5);
        }
        boolean zEYQ = QQ.EYQ(str5);
        if (!mZx.Kbd() || zEYQ) {
            Kbd.mZx().EYQ(true);
        }
    }

    private void EYQ(String str, String str2, String str3) {
        JSONObject jSONObjectTd;
        if (TextUtils.isEmpty(str) || (jSONObjectTd = Td(str)) == null) {
            return;
        }
        String strOptString = jSONObjectTd.optString("md5");
        String strOptString2 = jSONObjectTd.optString("version");
        String strOptString3 = jSONObjectTd.optString("data");
        if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2) || TextUtils.isEmpty(strOptString3)) {
            return;
        }
        com.bytedance.sdk.component.adexpress.EYQ.Td.mZx mzxEYQ = new com.bytedance.sdk.component.adexpress.EYQ.Td.mZx().EYQ(str2).mZx(str3).Td(strOptString).Pm(str).Kbd(strOptString3).IPb(strOptString2).EYQ(Long.valueOf(System.currentTimeMillis()));
        IPb.EYQ().EYQ(mzxEYQ, false);
        mZx();
        if (QQ.EYQ(strOptString2)) {
            mzxEYQ.IPb(strOptString2);
            Kbd.mZx().EYQ(true);
        }
    }

    private void mZx(String str, String str2, String str3, String str4, String str5, String str6) {
        IPb.EYQ().EYQ(new com.bytedance.sdk.component.adexpress.EYQ.Td.mZx().EYQ(str).mZx(str2).Td(str3).Pm(str4).Kbd(str5).IPb(str6).EYQ(Long.valueOf(System.currentTimeMillis())), false);
        mZx();
    }

    public void EYQ(Set<String> set) {
        try {
            IPb.EYQ().EYQ(set);
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}
