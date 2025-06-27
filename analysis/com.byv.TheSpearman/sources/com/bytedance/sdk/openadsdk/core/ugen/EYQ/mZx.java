package com.bytedance.sdk.openadsdk.core.ugen.EYQ;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.pi;
import com.bytedance.sdk.openadsdk.core.QQ;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.utils.xt;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: UGenTemplateManager.java */
/* loaded from: classes2.dex */
public class mZx {
    private static volatile mZx EYQ;

    /* compiled from: UGenTemplateManager.java */
    public interface EYQ {
        void EYQ(int i, String str, String str2);

        void EYQ(JSONObject jSONObject, String str);
    }

    public static mZx EYQ() {
        if (EYQ == null) {
            synchronized (mZx.class) {
                if (EYQ == null) {
                    EYQ = new mZx();
                }
            }
        }
        return EYQ;
    }

    public void EYQ(com.bytedance.sdk.openadsdk.core.ugen.Kbd.EYQ eyq, String str) {
        if (eyq == null) {
            return;
        }
        if (TextUtils.isEmpty(eyq.EYQ())) {
            pi.EYQ("UGTemplateManager", "save ugen template error : tmpId is empty");
            return;
        }
        final String str2 = str + "_" + eyq.EYQ();
        final String strTd = eyq.Td();
        final String strMZx = eyq.mZx();
        final String strPm = eyq.Pm();
        String strKbd = eyq.Kbd();
        if (TextUtils.isEmpty(strKbd) && str.equals("ad")) {
            strKbd = QQ.mZx().Pm();
        }
        final String str3 = strKbd;
        xt.EYQ(new com.bytedance.sdk.component.VwS.QQ("saveUGenTemplate") { // from class: com.bytedance.sdk.openadsdk.core.ugen.EYQ.mZx.1
            @Override // java.lang.Runnable
            public void run() {
                mZx.this.EYQ(str2, strTd, strMZx, strPm, str3);
            }
        }, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EYQ(String str, String str2, String str3, String str4, String str5) {
        if (EYQ(str, str3) != null) {
            if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str3)) {
                return;
            }
            mZx(str2, str3, str5, str4, str);
            return;
        }
        if (TextUtils.isEmpty(str4)) {
            EYQ(str2, str, str3, str5, (EYQ) null);
        } else {
            mZx(str2, str3, str5, str4, str);
        }
    }

    public void EYQ(String str, String str2, String str3, String str4, String str5, final EYQ eyq) {
        String str6 = str + "_" + str3;
        com.bytedance.sdk.openadsdk.core.ugen.EYQ.EYQ EYQ2 = EYQ(str6, str4);
        if (EYQ2 == null || TextUtils.isEmpty(EYQ2.Kbd())) {
            EYQ(str2, str6, str4, str5, new EYQ() { // from class: com.bytedance.sdk.openadsdk.core.ugen.EYQ.mZx.2
                @Override // com.bytedance.sdk.openadsdk.core.ugen.EYQ.mZx.EYQ
                public void EYQ(JSONObject jSONObject, String str7) {
                    EYQ eyq2 = eyq;
                    if (eyq2 != null) {
                        eyq2.EYQ(jSONObject, str7);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.ugen.EYQ.mZx.EYQ
                public void EYQ(int i, String str7, String str8) {
                    EYQ eyq2 = eyq;
                    if (eyq2 != null) {
                        eyq2.EYQ(i, str7, str8);
                    }
                }
            });
            return;
        }
        EYQ(EYQ2);
        if (eyq != null) {
            try {
                eyq.EYQ(new JSONObject(EYQ2.Kbd()), "local");
            } catch (JSONException unused) {
                eyq.EYQ(2, "parse json exception data is " + EYQ2.Kbd(), "local");
            }
        }
    }

    private void EYQ(final String str, final String str2, final String str3, final String str4, final EYQ eyq) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            if (eyq != null) {
                eyq.EYQ(1, "template url or id  or md5 is empty", "net");
            }
        } else {
            com.bytedance.sdk.component.IPb.mZx.mZx mzxTd = com.bytedance.sdk.openadsdk.MxO.Td.EYQ().mZx().Td();
            mzxTd.EYQ(str);
            mzxTd.EYQ(new com.bytedance.sdk.component.IPb.EYQ.EYQ() { // from class: com.bytedance.sdk.openadsdk.core.ugen.EYQ.mZx.3
                @Override // com.bytedance.sdk.component.IPb.EYQ.EYQ
                public void EYQ(com.bytedance.sdk.component.IPb.mZx.Td td, com.bytedance.sdk.component.IPb.mZx mzx) {
                    if (mzx == null) {
                        return;
                    }
                    if (mzx.IPb()) {
                        String strPm = mzx.Pm();
                        if (TextUtils.isEmpty(strPm)) {
                            EYQ eyq2 = eyq;
                            if (eyq2 != null) {
                                eyq2.EYQ(3, "net data is null", "net");
                                return;
                            }
                            return;
                        }
                        Td.EYQ().EYQ(new com.bytedance.sdk.openadsdk.core.ugen.EYQ.EYQ().EYQ(str2).mZx(str3).Td(str).Kbd(str4).Pm(strPm).EYQ(Long.valueOf(System.currentTimeMillis())));
                        mZx.this.mZx();
                        if (eyq != null) {
                            try {
                                eyq.EYQ(new JSONObject(strPm), "net");
                                return;
                            } catch (JSONException unused) {
                                eyq.EYQ(2, "parse json exception data is".concat(String.valueOf(strPm)), "net");
                                return;
                            }
                        }
                        return;
                    }
                    EYQ eyq3 = eyq;
                    if (eyq3 != null) {
                        eyq3.EYQ(3, "net code error code is " + mzx.EYQ() + " message is " + mzx.mZx(), "net");
                    }
                }

                @Override // com.bytedance.sdk.component.IPb.EYQ.EYQ
                public void EYQ(com.bytedance.sdk.component.IPb.mZx.Td td, IOException iOException) {
                    EYQ eyq2 = eyq;
                    if (eyq2 != null) {
                        eyq2.EYQ(3, "net error " + iOException.getMessage(), "net");
                    }
                }
            });
        }
    }

    public Set<com.bytedance.sdk.openadsdk.core.ugen.EYQ.EYQ> EYQ(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return Td.EYQ().EYQ(str);
    }

    public String EYQ(String str, String str2, String str3) {
        com.bytedance.sdk.openadsdk.core.ugen.EYQ.EYQ EYQ2 = EYQ(str + "_" + str2, str3);
        if (EYQ2 == null) {
            return null;
        }
        EYQ(EYQ2);
        return EYQ2.Kbd();
    }

    private com.bytedance.sdk.openadsdk.core.ugen.EYQ.EYQ EYQ(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return Td.EYQ().EYQ(str, str2);
    }

    private void mZx(String str, String str2, String str3, String str4, String str5) {
        com.bytedance.sdk.openadsdk.core.ugen.EYQ.EYQ eyq = new com.bytedance.sdk.openadsdk.core.ugen.EYQ.EYQ();
        eyq.Td(str).Kbd(str3).Pm(str4).mZx(str2).EYQ(str5).EYQ(Long.valueOf(System.currentTimeMillis()));
        Td.EYQ().EYQ(eyq);
        mZx();
    }

    private void EYQ(final com.bytedance.sdk.openadsdk.core.ugen.EYQ.EYQ eyq) {
        eyq.EYQ(Long.valueOf(System.currentTimeMillis()));
        xt.EYQ(new com.bytedance.sdk.component.VwS.QQ("updateTmplTime") { // from class: com.bytedance.sdk.openadsdk.core.ugen.EYQ.mZx.4
            @Override // java.lang.Runnable
            public void run() {
                Td.EYQ().EYQ(eyq);
            }
        }, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mZx() {
        int iPm = hu.Pm().Pm();
        if (iPm <= 0) {
            iPm = 100;
        }
        List<com.bytedance.sdk.openadsdk.core.ugen.EYQ.EYQ> listMZx = Td.EYQ().mZx();
        if (listMZx == null || listMZx.isEmpty() || iPm >= listMZx.size()) {
            if (listMZx == null) {
                return;
            }
            listMZx.size();
            return;
        }
        int size = (int) (listMZx.size() - (iPm * 0.75f));
        if (size <= 0) {
            return;
        }
        TreeMap treeMap = new TreeMap();
        for (com.bytedance.sdk.openadsdk.core.ugen.EYQ.EYQ eyq : listMZx) {
            treeMap.put(eyq.Pm(), eyq);
        }
        HashSet hashSet = new HashSet();
        int i = 0;
        for (Map.Entry entry : treeMap.entrySet()) {
            if (entry != null && i < size) {
                i++;
                com.bytedance.sdk.openadsdk.core.ugen.EYQ.EYQ eyq2 = (com.bytedance.sdk.openadsdk.core.ugen.EYQ.EYQ) entry.getValue();
                if (eyq2 != null) {
                    hashSet.add(eyq2.EYQ());
                }
            }
        }
        EYQ(hashSet);
    }

    public void EYQ(Set<String> set) {
        try {
            Td.EYQ().EYQ(set);
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}
