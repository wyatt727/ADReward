package com.bytedance.sdk.openadsdk.core.VwS;

import com.bytedance.sdk.openadsdk.core.VwS.Td.EYQ;
import com.bytedance.sdk.openadsdk.core.VwS.mZx.Td;
import com.bytedance.sdk.openadsdk.core.model.UB;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: VastResource.java */
/* loaded from: classes2.dex */
public class Td {
    protected int EYQ;
    protected List<com.bytedance.sdk.openadsdk.core.VwS.mZx.Td> IPb;
    protected String Kbd;
    protected EYQ.mZx Pm;
    protected String QQ;
    protected EYQ.EnumC0111EYQ Td;
    protected List<com.bytedance.sdk.openadsdk.core.VwS.mZx.Td> VwS;
    protected int mZx;
    private String tp;
    private UB tsL;
    private final AtomicBoolean MxO = new AtomicBoolean(false);
    protected String HX = "endcard_click";

    public Td(int i, int i2, EYQ.EnumC0111EYQ enumC0111EYQ, EYQ.mZx mzx, String str, List<com.bytedance.sdk.openadsdk.core.VwS.mZx.Td> list, List<com.bytedance.sdk.openadsdk.core.VwS.mZx.Td> list2, String str2) {
        this.IPb = new ArrayList();
        this.VwS = new ArrayList();
        this.EYQ = i;
        this.mZx = i2;
        this.Td = enumC0111EYQ;
        this.Pm = mzx;
        this.Kbd = str;
        this.IPb = list;
        this.VwS = list2;
        this.QQ = str2;
    }

    public int mZx() {
        return this.EYQ;
    }

    public int Td() {
        return this.mZx;
    }

    public void EYQ(long j) {
        com.bytedance.sdk.openadsdk.core.VwS.mZx.Td.EYQ(this.IPb, null, j, this.tp, new Td.mZx(this.HX, this.tsL));
    }

    public void mZx(long j) {
        if (this.MxO.compareAndSet(false, true)) {
            com.bytedance.sdk.openadsdk.core.VwS.mZx.Td.mZx(this.VwS, null, j, this.tp);
        }
    }

    public static float EYQ(int i, int i2, int i3, int i4, EYQ.mZx mzx, EYQ.EnumC0111EYQ enumC0111EYQ) {
        if (i2 == 0 || i4 == 0) {
            return 0.0f;
        }
        float f = i;
        float f2 = i3;
        return EYQ(mzx, enumC0111EYQ) / ((Math.abs((f / i2) - (f2 / i4)) + Math.abs((f - f2) / f)) + 1.0f);
    }

    /* compiled from: VastResource.java */
    /* renamed from: com.bytedance.sdk.openadsdk.core.VwS.Td$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] EYQ;

        static {
            int[] iArr = new int[EYQ.mZx.values().length];
            EYQ = iArr;
            try {
                iArr[EYQ.mZx.STATIC_RESOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                EYQ[EYQ.mZx.HTML_RESOURCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                EYQ[EYQ.mZx.IFRAME_RESOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static float EYQ(EYQ.mZx mzx, EYQ.EnumC0111EYQ enumC0111EYQ) {
        int i = AnonymousClass1.EYQ[mzx.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return i != 3 ? 0.0f : 1.0f;
            }
            return 1.2f;
        }
        if (EYQ.EnumC0111EYQ.JAVASCRIPT.equals(enumC0111EYQ)) {
            return 1.0f;
        }
        return EYQ.EnumC0111EYQ.IMAGE.equals(enumC0111EYQ) ? 0.8f : 0.0f;
    }

    public String Pm() {
        int i = AnonymousClass1.EYQ[this.Pm.ordinal()];
        if (i == 1) {
            if (this.Td == EYQ.EnumC0111EYQ.IMAGE) {
                return "<html><head></head><body style=\"margin:0;padding:0\"><img src=\"" + this.Kbd + "\" width=\"100%\" style=\"max-width:100%;max-height:100%;\" /></body></html>";
            }
            if (this.Td != EYQ.EnumC0111EYQ.JAVASCRIPT) {
                return null;
            }
            return "<script src=\"" + this.Kbd + "\"></script>";
        }
        if (i == 2) {
            return this.Kbd;
        }
        if (i != 3) {
            return null;
        }
        return "<iframe frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\" style=\"border: 0px; margin: 0px;\" width=\"" + this.EYQ + "\" height=\"" + this.mZx + "\" src=\"" + this.Kbd + "\"></iframe>";
    }

    public String Kbd() {
        if (this.Pm == EYQ.mZx.STATIC_RESOURCE && this.Td == EYQ.EnumC0111EYQ.IMAGE) {
            return this.Kbd;
        }
        return null;
    }

    public String IPb() {
        return this.Kbd;
    }

    public void EYQ(String str) {
        this.tp = str;
    }

    public static Td mZx(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int iOptInt = jSONObject.optInt("width");
        int iOptInt2 = jSONObject.optInt("height");
        String strOptString = jSONObject.optString("creativeType", EYQ.EnumC0111EYQ.NONE.toString());
        String strOptString2 = jSONObject.optString("resourceType", EYQ.mZx.HTML_RESOURCE.toString());
        String strOptString3 = jSONObject.optString("contentUrl");
        String strOptString4 = jSONObject.optString("clickThroughUri");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("clickTrackers");
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("creativeViewTrackers");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            arrayList.add(new Td.EYQ(jSONArrayOptJSONArray.optString(i)).EYQ());
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
            arrayList2.add(new Td.EYQ(jSONArrayOptJSONArray2.optString(i2)).EYQ());
        }
        return new Td(iOptInt, iOptInt2, EYQ.EnumC0111EYQ.valueOf(strOptString), EYQ.mZx.valueOf(strOptString2), strOptString3, arrayList, arrayList2, strOptString4);
    }

    public JSONObject EYQ() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", this.EYQ);
        jSONObject.put("height", this.mZx);
        jSONObject.put("creativeType", this.Td.toString());
        jSONObject.put("resourceType", this.Pm.toString());
        jSONObject.put("contentUrl", this.Kbd);
        jSONObject.put("clickThroughUri", this.QQ);
        jSONObject.put("clickTrackers", com.bytedance.sdk.openadsdk.core.VwS.mZx.Td.EYQ(this.IPb));
        jSONObject.put("creativeViewTrackers", com.bytedance.sdk.openadsdk.core.VwS.mZx.Td.EYQ(this.VwS));
        return jSONObject;
    }

    public void EYQ(UB ub) {
        this.tsL = ub;
    }
}
