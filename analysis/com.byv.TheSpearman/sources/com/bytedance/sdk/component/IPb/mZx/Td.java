package com.bytedance.sdk.component.IPb.mZx;

import android.text.TextUtils;
import com.bytedance.sdk.component.mZx.EYQ.MxO;
import com.bytedance.sdk.component.mZx.EYQ.pi;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* compiled from: NetExecutor.java */
/* loaded from: classes2.dex */
public abstract class Td {
    protected MxO Td;
    protected String Pm = null;
    protected final Map<String, String> Kbd = new HashMap();
    protected String IPb = null;
    protected boolean VwS = false;

    public Td(MxO mxO) {
        this.Td = mxO;
        mZx(UUID.randomUUID().toString());
    }

    public void EYQ(String str) {
        this.IPb = str;
    }

    public void mZx(String str, String str2) {
        this.Kbd.put(str, str2);
    }

    public void Pm(Map<String, String> map) {
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                this.Kbd.put(entry.getKey(), entry.getValue());
            }
        }
    }

    public void mZx(String str) {
        this.Pm = str;
    }

    public String mZx() {
        return this.Pm;
    }

    protected void EYQ(pi.EYQ eyq) {
        if (eyq != null && this.Kbd.size() > 0) {
            for (Map.Entry<String, String> entry : this.Kbd.entrySet()) {
                String key = entry.getKey();
                if (!TextUtils.isEmpty(key)) {
                    String value = entry.getValue();
                    if (value == null) {
                        value = "";
                    }
                    eyq.mZx(key, value);
                }
            }
        }
    }
}
