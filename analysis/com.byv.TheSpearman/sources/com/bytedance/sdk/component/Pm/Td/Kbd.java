package com.bytedance.sdk.component.Pm.Td;

import android.content.Context;
import com.bytedance.sdk.component.Pm.UB;
import com.bytedance.sdk.component.Pm.Uc;
import com.bytedance.sdk.component.Pm.hYh;
import com.bytedance.sdk.component.Pm.pi;
import com.bytedance.sdk.component.Pm.tsL;
import java.util.concurrent.ExecutorService;

/* compiled from: LoadConfig.java */
/* loaded from: classes2.dex */
public class Kbd implements pi {
    private tsL EYQ;
    private com.bytedance.sdk.component.Pm.Td IPb;
    private hYh Kbd;
    private Uc Pm;
    private com.bytedance.sdk.component.Pm.mZx QQ;
    private com.bytedance.sdk.component.Pm.Pm Td;
    private UB VwS;
    private ExecutorService mZx;

    private Kbd(EYQ eyq) {
        this.EYQ = eyq.EYQ;
        this.mZx = eyq.mZx;
        this.Td = eyq.Td;
        this.Pm = eyq.Pm;
        this.Kbd = eyq.Kbd;
        this.IPb = eyq.IPb;
        this.QQ = eyq.QQ;
        this.VwS = eyq.VwS;
    }

    @Override // com.bytedance.sdk.component.Pm.pi
    public tsL EYQ() {
        return this.EYQ;
    }

    @Override // com.bytedance.sdk.component.Pm.pi
    public ExecutorService mZx() {
        return this.mZx;
    }

    @Override // com.bytedance.sdk.component.Pm.pi
    public com.bytedance.sdk.component.Pm.Pm Td() {
        return this.Td;
    }

    @Override // com.bytedance.sdk.component.Pm.pi
    public Uc Pm() {
        return this.Pm;
    }

    @Override // com.bytedance.sdk.component.Pm.pi
    public hYh Kbd() {
        return this.Kbd;
    }

    @Override // com.bytedance.sdk.component.Pm.pi
    public com.bytedance.sdk.component.Pm.Td IPb() {
        return this.IPb;
    }

    @Override // com.bytedance.sdk.component.Pm.pi
    public UB VwS() {
        return this.VwS;
    }

    @Override // com.bytedance.sdk.component.Pm.pi
    public com.bytedance.sdk.component.Pm.mZx QQ() {
        return this.QQ;
    }

    public static Kbd EYQ(Context context) {
        return new EYQ().EYQ();
    }

    /* compiled from: LoadConfig.java */
    public static class EYQ {
        private tsL EYQ;
        private com.bytedance.sdk.component.Pm.Td IPb;
        private hYh Kbd;
        private Uc Pm;
        private com.bytedance.sdk.component.Pm.mZx QQ;
        private com.bytedance.sdk.component.Pm.Pm Td;
        private UB VwS;
        private ExecutorService mZx;

        public EYQ EYQ(com.bytedance.sdk.component.Pm.mZx mzx) {
            this.QQ = mzx;
            return this;
        }

        public EYQ EYQ(ExecutorService executorService) {
            this.mZx = executorService;
            return this;
        }

        public EYQ EYQ(com.bytedance.sdk.component.Pm.Pm pm) {
            this.Td = pm;
            return this;
        }

        public Kbd EYQ() {
            return new Kbd(this);
        }
    }
}
