package com.bytedance.sdk.openadsdk.IPb;

import com.bytedance.sdk.component.Pm.HX;
import com.bytedance.sdk.component.Pm.zF;
import com.json.t2;

/* compiled from: StepTrackImpl.java */
/* loaded from: classes2.dex */
public class Kbd implements zF {
    private static int EYQ;
    private final String Kbd;
    private boolean Pm;
    private long Td;
    private long mZx = 0;

    public Kbd() {
        EYQ++;
        this.Kbd = "image_request_" + EYQ;
    }

    @Override // com.bytedance.sdk.component.Pm.zF
    public void EYQ(String str, HX hx) {
        if (!this.Pm) {
            hx.EYQ();
            hx.mZx();
            hx.Td();
            this.Pm = true;
        }
        this.mZx = System.currentTimeMillis();
        Td(str, hx);
    }

    @Override // com.bytedance.sdk.component.Pm.zF
    public void mZx(String str, HX hx) {
        this.Td += System.currentTimeMillis() - this.mZx;
        Td(str, hx);
    }

    private String Td(String str, HX hx) {
        com.bytedance.sdk.component.Pm.Td.EYQ eyqUc;
        if (str != null) {
            str.hashCode();
            switch (str) {
                case "success":
                    return "success";
                case "raw_cache":
                    return "raw cache";
                case "image_type":
                    return "image type：";
                case "disk_cache":
                    return "disk cache";
                case "decode":
                    return "decode";
                case "failed":
                    if (!(hx instanceof com.bytedance.sdk.component.Pm.Td.Td) || (eyqUc = ((com.bytedance.sdk.component.Pm.Td.Td) hx).Uc()) == null) {
                        return t2.f.e;
                    }
                    Throwable thTd = eyqUc.Td();
                    StringBuilder sb = new StringBuilder("fail：code:");
                    sb.append(eyqUc.EYQ());
                    sb.append(", msg:");
                    sb.append(eyqUc.mZx());
                    sb.append(", exception:");
                    sb.append(thTd != null ? thTd.getMessage() : "null \r\n");
                    return sb.toString();
                case "check_duplicate":
                    return "duplicate request";
                case "memory_cache":
                    return "memory cache";
                case "net_request":
                    return "net request";
                case "generate_key":
                    return "generate key:" + hx.Kbd();
                case "cache_policy":
                    return "cache policy";
            }
        }
        return str;
    }
}
