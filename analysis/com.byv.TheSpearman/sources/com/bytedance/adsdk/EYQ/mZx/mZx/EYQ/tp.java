package com.bytedance.adsdk.EYQ.mZx.mZx.EYQ;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: MethodNode.java */
/* loaded from: classes2.dex */
public class tp implements com.bytedance.adsdk.EYQ.mZx.mZx.EYQ {
    private com.bytedance.adsdk.EYQ.mZx.mZx.EYQ[] EYQ;
    private com.bytedance.adsdk.EYQ.mZx.EYQ.EYQ Td;
    private String mZx;

    public tp(String str) {
        this.mZx = str;
    }

    public void EYQ(com.bytedance.adsdk.EYQ.mZx.mZx.EYQ[] eyqArr) {
        this.EYQ = eyqArr;
    }

    @Override // com.bytedance.adsdk.EYQ.mZx.mZx.EYQ
    public Object EYQ(Map<String, JSONObject> map) {
        com.bytedance.adsdk.EYQ.mZx.EYQ.EYQ eyq = new com.bytedance.adsdk.EYQ.mZx.EYQ.EYQ();
        this.Td = eyq;
        eyq.EYQ(this.mZx);
        Object[] objArr = new Object[this.EYQ.length];
        int i = 0;
        while (true) {
            com.bytedance.adsdk.EYQ.mZx.mZx.EYQ[] eyqArr = this.EYQ;
            if (i < eyqArr.length) {
                if (eyqArr[i] != null) {
                    objArr[i] = eyqArr[i].EYQ(map);
                }
                i++;
            } else {
                this.Td.EYQ(objArr);
                return this.Td;
            }
        }
    }

    @Override // com.bytedance.adsdk.EYQ.mZx.mZx.EYQ
    public com.bytedance.adsdk.EYQ.mZx.Pm.Kbd EYQ() {
        return com.bytedance.adsdk.EYQ.mZx.Pm.mZx.METHOD;
    }

    @Override // com.bytedance.adsdk.EYQ.mZx.mZx.EYQ
    public String mZx() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.mZx);
        sb.append("(");
        com.bytedance.adsdk.EYQ.mZx.mZx.EYQ[] eyqArr = this.EYQ;
        if (eyqArr != null && eyqArr.length > 0) {
            int i = 0;
            while (true) {
                com.bytedance.adsdk.EYQ.mZx.mZx.EYQ[] eyqArr2 = this.EYQ;
                if (i >= eyqArr2.length) {
                    break;
                }
                sb.append(eyqArr2[i].mZx());
                sb.append(",");
                i++;
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
