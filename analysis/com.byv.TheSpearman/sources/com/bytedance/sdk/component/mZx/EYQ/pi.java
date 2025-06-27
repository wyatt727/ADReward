package com.bytedance.sdk.component.mZx.EYQ;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Request.java */
/* loaded from: classes2.dex */
public abstract class pi {
    public MxO EYQ;

    public abstract Object EYQ();

    public nWX IPb() {
        return null;
    }

    public abstract com.bytedance.sdk.component.mZx.EYQ.EYQ Kbd();

    public abstract Map<String, List<String>> Pm();

    public abstract String Td();

    public abstract VwS mZx();

    public void EYQ(MxO mxO) {
        this.EYQ = mxO;
    }

    public EYQ VwS() {
        return new EYQ(this);
    }

    /* compiled from: Request.java */
    public static class EYQ {
        com.bytedance.sdk.component.mZx.EYQ.EYQ EYQ;
        nWX IPb;
        Object Kbd;
        String Pm;
        VwS Td;
        Map<String, List<String>> mZx;

        public EYQ() {
            this.mZx = new HashMap();
        }

        public EYQ EYQ(com.bytedance.sdk.component.mZx.EYQ.EYQ eyq) {
            this.EYQ = eyq;
            return this;
        }

        EYQ(pi piVar) {
            this.Td = piVar.mZx();
            this.Pm = piVar.Td();
            this.mZx = piVar.Pm();
            this.Kbd = piVar.EYQ();
            this.IPb = piVar.IPb();
            this.EYQ = piVar.Kbd();
        }

        public EYQ EYQ(Object obj) {
            this.Kbd = obj;
            return this;
        }

        public EYQ EYQ(String str) {
            return EYQ(VwS.Td(str));
        }

        public EYQ EYQ(VwS vwS) {
            this.Td = vwS;
            return this;
        }

        public EYQ EYQ(String str, String str2) {
            return mZx(str, str2);
        }

        public EYQ mZx(String str, String str2) {
            if (!this.mZx.containsKey(str)) {
                this.mZx.put(str, new ArrayList());
            }
            this.mZx.get(str).add(str2);
            return this;
        }

        public EYQ EYQ() {
            return EYQ("GET", (nWX) null);
        }

        private EYQ EYQ(String str, nWX nwx) {
            this.Pm = str;
            this.IPb = nwx;
            return this;
        }

        public EYQ EYQ(nWX nwx) {
            return EYQ("POST", nwx);
        }

        public pi mZx() {
            return new pi() { // from class: com.bytedance.sdk.component.mZx.EYQ.pi.EYQ.1
                public String toString() {
                    return "";
                }

                @Override // com.bytedance.sdk.component.mZx.EYQ.pi
                public Object EYQ() {
                    return EYQ.this.Kbd;
                }

                @Override // com.bytedance.sdk.component.mZx.EYQ.pi
                public VwS mZx() {
                    return EYQ.this.Td;
                }

                @Override // com.bytedance.sdk.component.mZx.EYQ.pi
                public String Td() {
                    return EYQ.this.Pm;
                }

                @Override // com.bytedance.sdk.component.mZx.EYQ.pi
                public Map Pm() {
                    return EYQ.this.mZx;
                }

                @Override // com.bytedance.sdk.component.mZx.EYQ.pi
                public com.bytedance.sdk.component.mZx.EYQ.EYQ Kbd() {
                    return EYQ.this.EYQ;
                }

                @Override // com.bytedance.sdk.component.mZx.EYQ.pi
                public nWX IPb() {
                    return EYQ.this.IPb;
                }
            };
        }
    }
}
