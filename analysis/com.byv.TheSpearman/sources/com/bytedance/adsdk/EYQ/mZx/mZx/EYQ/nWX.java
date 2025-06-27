package com.bytedance.adsdk.EYQ.mZx.mZx.EYQ;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: NotEqualNode.java */
/* loaded from: classes2.dex */
public class nWX extends UB {
    public nWX() {
        super(com.bytedance.adsdk.EYQ.mZx.Pm.Td.NOT_EQ);
    }

    @Override // com.bytedance.adsdk.EYQ.mZx.mZx.EYQ
    public Object EYQ(Map<String, JSONObject> map) {
        Object objEYQ = this.EYQ.EYQ(map);
        Object objEYQ2 = this.mZx.EYQ(map);
        if (objEYQ == null && objEYQ2 == null) {
            return Boolean.FALSE;
        }
        if (objEYQ == null && objEYQ2 != null) {
            return Boolean.TRUE;
        }
        if (objEYQ != null && objEYQ2 == null) {
            return Boolean.TRUE;
        }
        if ((objEYQ instanceof Number) && (objEYQ2 instanceof Number)) {
            return Boolean.valueOf(!com.bytedance.adsdk.EYQ.mZx.Kbd.EYQ.mZx.EYQ((Number) objEYQ, (Number) objEYQ2));
        }
        return Boolean.valueOf(!objEYQ.equals(objEYQ2));
    }
}
