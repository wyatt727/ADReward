package com.bytedance.sdk.component.Pm.EYQ;

import com.bytedance.sdk.component.Pm.HX;
import com.bytedance.sdk.component.Pm.tsL;
import java.security.NoSuchAlgorithmException;
import java.util.WeakHashMap;

/* compiled from: KeyGeneratorFactory.java */
/* loaded from: classes2.dex */
public class mZx {
    public static tsL EYQ() {
        return new tsL() { // from class: com.bytedance.sdk.component.Pm.EYQ.mZx.1
            private WeakHashMap<String, String> EYQ = new WeakHashMap<>();

            @Override // com.bytedance.sdk.component.Pm.tsL
            public String EYQ(HX hx) {
                return EYQ(hx.EYQ() + "#width=" + hx.mZx() + "#height=" + hx.Td() + "#scaletype=" + hx.Pm() + "#bitmapConfig=" + hx.IPb());
            }

            @Override // com.bytedance.sdk.component.Pm.tsL
            public String mZx(HX hx) {
                return EYQ(hx.EYQ());
            }

            private String EYQ(String str) throws NoSuchAlgorithmException {
                String str2 = this.EYQ.get(str);
                if (str2 != null) {
                    return str2;
                }
                String strEYQ = com.bytedance.sdk.component.Pm.Td.Td.Td.EYQ(str);
                this.EYQ.put(str, strEYQ);
                return strEYQ;
            }
        };
    }
}
