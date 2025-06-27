package com.bytedance.sdk.openadsdk.core.VwS.mZx;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.sdk.component.VwS.QQ;
import com.bytedance.sdk.component.utils.NZ;
import com.bytedance.sdk.openadsdk.core.VwS.mZx.EYQ;
import com.bytedance.sdk.openadsdk.core.VwS.mZx.mZx;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.utils.FH;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: VastTracker.java */
/* loaded from: classes2.dex */
public class Td {
    private final String EYQ;
    private boolean Pm;
    private boolean Td;
    private EnumC0113Td mZx;
    private static final Map<String, mZx> Kbd = new ConcurrentHashMap();
    private static final AtomicBoolean IPb = new AtomicBoolean(false);

    /* compiled from: VastTracker.java */
    /* renamed from: com.bytedance.sdk.openadsdk.core.VwS.mZx.Td$Td, reason: collision with other inner class name */
    enum EnumC0113Td {
        TRACKING_URL,
        QUARTILE_EVENT
    }

    static {
        NZ.EYQ(new NZ.EYQ() { // from class: com.bytedance.sdk.openadsdk.core.VwS.mZx.Td.1
            @Override // com.bytedance.sdk.component.utils.NZ.EYQ
            public void EYQ(Context context, Intent intent, boolean z, int i) {
                if (i == 0 || Td.Kbd.size() <= 0) {
                    return;
                }
                Td.mZx();
            }
        }, hu.EYQ());
    }

    protected Td(String str, EnumC0113Td enumC0113Td, Boolean bool) {
        this.EYQ = str;
        this.mZx = enumC0113Td;
        this.Td = bool.booleanValue();
    }

    public String Td() {
        return this.EYQ;
    }

    public boolean Pm() {
        return this.Td;
    }

    public void h_() {
        this.Pm = true;
    }

    /* compiled from: VastTracker.java */
    public static class EYQ {
        private final String EYQ;
        private EnumC0113Td mZx = EnumC0113Td.TRACKING_URL;
        private boolean Td = false;

        public EYQ(String str) {
            this.EYQ = str;
        }

        public EYQ EYQ(boolean z) {
            this.Td = z;
            return this;
        }

        public Td EYQ() {
            return new Td(this.EYQ, this.mZx, Boolean.valueOf(this.Td));
        }
    }

    public boolean Kbd() {
        return this.Pm;
    }

    public static List<String> EYQ(List<Td> list, com.bytedance.sdk.openadsdk.core.VwS.EYQ.EYQ eyq, long j, String str) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (Td td : list) {
            if (td != null && (!td.Kbd() || td.Pm())) {
                arrayList.add(td.Td());
                td.h_();
            }
        }
        return new com.bytedance.sdk.openadsdk.core.VwS.Td.Td(arrayList).EYQ(eyq).EYQ(j).EYQ(str).EYQ();
    }

    public static void EYQ(List<Td> list, com.bytedance.sdk.openadsdk.core.VwS.EYQ.EYQ eyq, long j, String str, mZx mzx) {
        EYQ(EYQ(list, eyq, j, str), mzx);
    }

    public static void mZx(List<Td> list, com.bytedance.sdk.openadsdk.core.VwS.EYQ.EYQ eyq, long j, String str) {
        EYQ(list, eyq, j, str, null);
    }

    public static void EYQ(List<String> list, mZx mzx) {
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if (!TextUtils.isEmpty(str)) {
                EYQ(str, mzx, false);
            }
        }
    }

    private static void EYQ(final String str, final mZx mzx, final boolean z) {
        com.bytedance.sdk.component.IPb.mZx.mZx mzxTd = com.bytedance.sdk.openadsdk.MxO.Td.EYQ().mZx().Td();
        if (mzxTd == null) {
            return;
        }
        mzxTd.EYQ(true);
        mzxTd.EYQ(str);
        mzxTd.EYQ(new com.bytedance.sdk.component.IPb.EYQ.EYQ() { // from class: com.bytedance.sdk.openadsdk.core.VwS.mZx.Td.2
            @Override // com.bytedance.sdk.component.IPb.EYQ.EYQ
            public void EYQ(com.bytedance.sdk.component.IPb.mZx.Td td, com.bytedance.sdk.component.IPb.mZx mzx2) {
                mZx mzx3 = mzx;
                if (mzx3 == null || mzx3.mZx == null) {
                    return;
                }
                boolean z2 = false;
                String str2 = null;
                if (mzx2 != null && mzx2.IPb()) {
                    z2 = true;
                } else if (mzx2 != null) {
                    str2 = mzx2.EYQ() + ":" + mzx2.mZx();
                    if (!z && (mzx2.EYQ() <= 300 || mzx2.EYQ() >= 400)) {
                        Td.Kbd.put(str, mzx);
                    }
                }
                Td.mZx(z2, str2, FH.Td(mzx.mZx.KvC()), mzx, str, z);
                if (mzx2 == null || mzx2.EYQ() != 200 || Td.Kbd.size() <= 0) {
                    return;
                }
                Td.mZx();
            }

            @Override // com.bytedance.sdk.component.IPb.EYQ.EYQ
            public void EYQ(com.bytedance.sdk.component.IPb.mZx.Td td, IOException iOException) {
                mZx mzx2 = mzx;
                if (mzx2 != null && mzx2.mZx != null) {
                    Td.mZx(false, iOException != null ? iOException.getMessage() : null, FH.Td(mzx.mZx.KvC()), mzx, str, z);
                }
                if (z || mzx == null) {
                    return;
                }
                Td.Kbd.put(str, mzx);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void mZx() {
        if (IPb.compareAndSet(false, true)) {
            Map<String, mZx> map = Kbd;
            HashSet<Map.Entry> hashSet = new HashSet(map.entrySet());
            map.clear();
            for (Map.Entry entry : hashSet) {
                if (entry != null) {
                    EYQ((String) entry.getKey(), (mZx) entry.getValue(), true);
                }
            }
            IPb.set(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void mZx(final boolean z, final String str, final String str2, final mZx mzx, final String str3, final boolean z2) {
        com.bytedance.sdk.openadsdk.mZx.Td.EYQ(new QQ("dsp_track_link_result") { // from class: com.bytedance.sdk.openadsdk.core.VwS.mZx.Td.3
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("type", mzx.EYQ);
                    jSONObject.put("success", z);
                    if (!TextUtils.isEmpty(str)) {
                        jSONObject.put("description", str);
                    }
                    jSONObject.put("url", str3);
                    if (mzx.Td >= 0.0f) {
                        jSONObject.put("progress", Math.round(mzx.Td * 100.0f) / 100.0d);
                    }
                    if (z2) {
                        jSONObject.put("retry", true);
                    }
                } catch (Throwable unused) {
                }
                com.bytedance.sdk.openadsdk.mZx.Td.mZx(mzx.mZx, str2, "dsp_track_link_result", jSONObject);
            }
        });
    }

    public static JSONArray EYQ(List<Td> list) {
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < list.size(); i++) {
            jSONArray.put(list.get(i).Td());
        }
        return jSONArray;
    }

    public static List<Td> EYQ(JSONArray jSONArray) {
        return EYQ(jSONArray, false);
    }

    public static List<Td> EYQ(JSONArray jSONArray, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                String strOptString = jSONArray.optString(i);
                if (!TextUtils.isEmpty(strOptString)) {
                    arrayList.add(new EYQ(strOptString).EYQ(z).EYQ());
                }
            }
        }
        return arrayList;
    }

    public static List<com.bytedance.sdk.openadsdk.core.VwS.mZx.mZx> mZx(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new mZx.EYQ(jSONObjectOptJSONObject.optString("content"), (float) jSONObjectOptJSONObject.optDouble("trackingFraction", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE)).EYQ());
                }
            }
        }
        return arrayList;
    }

    public static List<com.bytedance.sdk.openadsdk.core.VwS.mZx.EYQ> Td(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new EYQ.C0112EYQ(jSONObjectOptJSONObject.optString("content"), jSONObjectOptJSONObject.optLong("trackingMilliseconds", 0L)).EYQ());
                }
            }
        }
        return arrayList;
    }

    /* compiled from: VastTracker.java */
    public static class mZx {
        String EYQ;
        float Td;
        UB mZx;

        public mZx(String str, UB ub) {
            this(str, ub, -1.0f);
        }

        public mZx(String str, UB ub, float f) {
            this.EYQ = str;
            this.mZx = ub;
            this.Td = f;
        }
    }
}
