package com.bytedance.sdk.openadsdk.mZx.EYQ;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.UB;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.core.settings.KO;
import com.bytedance.sdk.openadsdk.tp.Td.mZx;
import com.bytedance.sdk.openadsdk.utils.xt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OverSeaEventUploadImpl.java */
/* loaded from: classes2.dex */
public class tp implements com.bytedance.sdk.component.Kbd.EYQ.mZx.Td {
    public UB<com.bytedance.sdk.openadsdk.mZx.EYQ> EYQ;
    private final Td mZx = Td.EYQ();

    @Override // com.bytedance.sdk.component.Kbd.EYQ.mZx.Td
    public void EYQ(final List<com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ> list, final com.bytedance.sdk.component.Kbd.EYQ.mZx.mZx mzx) {
        com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ eyq;
        if (list == null || list.isEmpty() || (eyq = list.get(0)) == null) {
            return;
        }
        byte bPm = eyq.Pm();
        final ArrayList arrayList = new ArrayList();
        if (bPm == 0) {
            xt.mZx(new com.bytedance.sdk.component.VwS.QQ("upload_ad_event") { // from class: com.bytedance.sdk.openadsdk.mZx.EYQ.tp.1
                @Override // java.lang.Runnable
                public void run() {
                    Iterator it;
                    try {
                        it = tp.this.Pm(list).entrySet().iterator();
                    } catch (Throwable th) {
                        com.bytedance.sdk.component.utils.pi.EYQ("OverSeaEventUploadImp", th.getMessage());
                        it = null;
                    }
                    if (it == null) {
                        com.bytedance.sdk.component.Kbd.EYQ.mZx.mZx mzx2 = mzx;
                        if (mzx2 != null) {
                            mzx2.EYQ(arrayList);
                            return;
                        }
                        return;
                    }
                    while (it.hasNext()) {
                        try {
                            EYQ.EYQ(EYQ.Pm);
                            List<com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ> list2 = (List) ((Map.Entry) it.next()).getValue();
                            ArrayList arrayList2 = new ArrayList();
                            for (com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ eyq2 : list2) {
                                arrayList2.add(new com.bytedance.sdk.openadsdk.mZx.EYQ(eyq2.Td(), eyq2.VwS()));
                            }
                            com.bytedance.sdk.openadsdk.mZx.Kbd kbdEYQ = tp.this.EYQ(arrayList2);
                            if (mzx != null && kbdEYQ != null) {
                                boolean z = kbdEYQ.Pm;
                                if (tp.this.EYQ(arrayList2, kbdEYQ)) {
                                    z = true;
                                }
                                arrayList.add(new com.bytedance.sdk.component.Kbd.EYQ.mZx.Td.EYQ(new com.bytedance.sdk.component.Kbd.EYQ.mZx.Td.mZx(kbdEYQ.EYQ, kbdEYQ.mZx, kbdEYQ.Td, z, ""), list2));
                                if (kbdEYQ.mZx == 200) {
                                    EYQ.EYQ(EYQ.Pm, true);
                                } else if (z) {
                                    EYQ.EYQ(EYQ.Pm, false);
                                }
                            }
                        } catch (Throwable th2) {
                            com.bytedance.sdk.component.utils.pi.EYQ("OverSeaEventUploadImp", th2.getMessage());
                        }
                    }
                    com.bytedance.sdk.component.Kbd.EYQ.mZx.mZx mzx3 = mzx;
                    if (mzx3 != null) {
                        mzx3.EYQ(arrayList);
                    }
                }
            }, 10);
            return;
        }
        if (bPm == 1) {
            final ArrayList arrayList2 = new ArrayList();
            for (com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ eyq2 : list) {
                arrayList2.add(new mZx.EYQ(eyq2.Td(), eyq2.VwS()));
            }
            EYQ.EYQ(EYQ.Kbd);
            if (arrayList2.size() > 0) {
                xt.mZx(new com.bytedance.sdk.component.VwS.QQ("upload_stats_event") { // from class: com.bytedance.sdk.openadsdk.mZx.EYQ.tp.2
                    @Override // java.lang.Runnable
                    public void run() throws JSONException {
                        com.bytedance.sdk.openadsdk.mZx.Kbd kbdMZx = tp.this.mZx(arrayList2);
                        if (mzx == null || kbdMZx == null) {
                            return;
                        }
                        arrayList.add(new com.bytedance.sdk.component.Kbd.EYQ.mZx.Td.EYQ(new com.bytedance.sdk.component.Kbd.EYQ.mZx.Td.mZx(kbdMZx.EYQ, kbdMZx.mZx, kbdMZx.Td, kbdMZx.Pm, ""), list));
                        mzx.EYQ(arrayList);
                        if (kbdMZx.mZx == 200) {
                            EYQ.EYQ(EYQ.Kbd, true);
                        } else if (kbdMZx.Pm) {
                            EYQ.EYQ(EYQ.Kbd, false);
                        }
                    }
                }, 5);
            }
        }
    }

    private boolean Td(List<com.bytedance.sdk.openadsdk.mZx.EYQ> list) {
        JSONObject jSONObjectTd;
        if (list == null || list.size() == 0 || (jSONObjectTd = list.get(0).Td()) == null) {
            return true;
        }
        return TextUtils.isEmpty(jSONObjectTd.optString("app_log_url"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean EYQ(List<com.bytedance.sdk.openadsdk.mZx.EYQ> list, com.bytedance.sdk.openadsdk.mZx.Kbd kbd) {
        return !Td(list) && kbd.mZx >= 400 && kbd.mZx < 500;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap<String, List<com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ>> Pm(List<com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ> list) {
        HashMap<String, List<com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ>> map = new HashMap<>();
        new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ eyq = list.get(i);
            JSONObject jSONObjectVwS = eyq.VwS();
            if (jSONObjectVwS != null) {
                String strOptString = jSONObjectVwS.optString("app_log_url");
                List<com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ> arrayList = map.get(strOptString);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    map.put(strOptString, arrayList);
                }
                arrayList.add(eyq);
            }
        }
        return map;
    }

    public com.bytedance.sdk.openadsdk.mZx.Kbd EYQ(List<com.bytedance.sdk.openadsdk.mZx.EYQ> list) {
        if (this.EYQ == null) {
            this.EYQ = hu.Td();
        }
        if (this.EYQ == null) {
            return null;
        }
        int iHnh = KO.Jpu().Hnh();
        if (3 == iHnh) {
            return this.EYQ.EYQ(this.mZx.EYQ(this.mZx.EYQ(list, false), System.currentTimeMillis(), this.mZx.mZx(), true), this.mZx.EYQ(list), true);
        }
        if (2 == iHnh) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObjectMZx = this.mZx.mZx();
            this.EYQ.EYQ(this.mZx.EYQ(this.mZx.EYQ(list, true), jCurrentTimeMillis, jSONObjectMZx, true), this.mZx.EYQ(list), true);
            return this.EYQ.EYQ(this.mZx.EYQ(this.mZx.mZx(list), jCurrentTimeMillis, jSONObjectMZx, false), this.mZx.EYQ(list), false);
        }
        return this.EYQ.EYQ(this.mZx.EYQ(list, System.currentTimeMillis(), this.mZx.mZx(), false), this.mZx.EYQ(list), false);
    }

    public com.bytedance.sdk.openadsdk.mZx.Kbd mZx(List<mZx.EYQ> list) throws JSONException {
        if (this.EYQ == null) {
            this.EYQ = hu.Td();
        }
        if (list == null || list.size() == 0 || !com.bytedance.sdk.openadsdk.core.settings.MxO.EYQ()) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator<mZx.EYQ> it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().mZx);
            }
            jSONObject.put("stats_list", jSONArray);
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            jSONObject.put("ts", jCurrentTimeMillis);
            jSONObject.put("req_sign", com.bytedance.sdk.component.utils.Kbd.EYQ(String.valueOf(jCurrentTimeMillis).concat("stats_list")));
        } catch (Exception unused) {
        }
        return this.EYQ.EYQ(jSONObject);
    }
}
