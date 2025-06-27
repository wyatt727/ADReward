package com.bytedance.adsdk.EYQ.mZx.mZx.EYQ;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: PlusNode.java */
/* loaded from: classes2.dex */
public class Uc extends UB {
    private static final ThreadLocal<StringBuilder> Pm = new ThreadLocal<StringBuilder>() { // from class: com.bytedance.adsdk.EYQ.mZx.mZx.EYQ.Uc.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
        public StringBuilder initialValue() {
            return new StringBuilder();
        }
    };

    public Uc() {
        super(com.bytedance.adsdk.EYQ.mZx.Pm.Td.PLUS);
    }

    @Override // com.bytedance.adsdk.EYQ.mZx.mZx.EYQ
    public Object EYQ(Map<String, JSONObject> map) {
        Object objEYQ;
        Object objEYQ2 = this.EYQ.EYQ(map);
        if (objEYQ2 == null || (objEYQ = this.mZx.EYQ(map)) == null) {
            return null;
        }
        if ((objEYQ2 instanceof String) || (objEYQ instanceof String)) {
            StringBuilder sb = Pm.get();
            sb.append(objEYQ2);
            sb.append(objEYQ);
            String string = sb.toString();
            sb.setLength(0);
            return string;
        }
        return com.bytedance.adsdk.EYQ.mZx.Kbd.EYQ.QQ.EYQ((Number) objEYQ2, (Number) objEYQ);
    }
}
