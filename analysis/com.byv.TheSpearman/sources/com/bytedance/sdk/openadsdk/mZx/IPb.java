package com.bytedance.sdk.openadsdk.mZx;

import java.text.SimpleDateFormat;
import java.util.Locale;
import org.json.JSONObject;

/* compiled from: AdEventV3.java */
/* loaded from: classes2.dex */
public class IPb extends EYQ {
    public static final SimpleDateFormat Td = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);

    public IPb(String str, JSONObject jSONObject) {
        super(str, jSONObject);
    }

    @Override // com.bytedance.sdk.openadsdk.mZx.EYQ
    public JSONObject Td() {
        return this.mZx;
    }
}
