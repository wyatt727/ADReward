package com.bytedance.adsdk.ugeno.core.EYQ;

import com.bytedance.adsdk.ugeno.core.MxO;
import com.bytedance.adsdk.ugeno.core.pi;
import com.bytedance.sdk.component.uchain.action.EventChainAction;
import com.bytedance.sdk.component.uchain.listener.ICustomRouter;
import com.bytedance.sdk.component.uchain.listener.IEventChainLifeCycleListener;
import org.json.JSONObject;

/* compiled from: UGenEventListenerAdapter.java */
/* loaded from: classes2.dex */
public class EYQ implements pi {
    private pi EYQ;
    private volatile C0078EYQ Kbd;
    private JSONObject Pm;
    private String mZx;
    private boolean Td = true;
    private boolean IPb = false;

    public EYQ(pi piVar) {
        this.EYQ = piVar;
    }

    public void EYQ(JSONObject jSONObject) {
        this.Pm = jSONObject;
    }

    public void EYQ(String str) {
        this.mZx = str;
    }

    public void EYQ(boolean z) {
        this.Td = z;
    }

    public boolean EYQ() {
        String str;
        return this.Td && (str = this.mZx) != null && "3".compareTo(str) <= 0 && this.Pm != null;
    }

    public void mZx(boolean z) {
        this.IPb = z;
    }

    @Override // com.bytedance.adsdk.ugeno.core.pi
    public void EYQ(MxO mxO, pi.mZx mzx, pi.EYQ eyq) {
        if (EYQ()) {
            Td(mxO, mzx, eyq);
        } else {
            mZx(mxO, mzx, eyq);
        }
    }

    private void mZx(MxO mxO, pi.mZx mzx, pi.EYQ eyq) {
        pi piVar = this.EYQ;
        if (piVar == null) {
            return;
        }
        piVar.EYQ(mxO, mzx, eyq);
    }

    private void Td(MxO mxO, pi.mZx mzx, pi.EYQ eyq) {
        if (this.Kbd == null) {
            this.Kbd = mZx();
        }
        this.Kbd.EYQ(mxO);
        this.Kbd.EYQ(mzx);
        this.Kbd.EYQ(eyq);
        JSONObject jSONObjectTd = mxO.Td();
        if (jSONObjectTd == null) {
            return;
        }
        new EventChainAction.Builder(jSONObjectTd.optString("type")).setChainData(this.Pm).setEventChainLifeCycleListener(new IEventChainLifeCycleListener() { // from class: com.bytedance.adsdk.ugeno.core.EYQ.EYQ.1
        }).build().run();
    }

    private C0078EYQ mZx() {
        if (this.Kbd != null) {
            return this.Kbd;
        }
        synchronized (C0078EYQ.class) {
            if (this.Kbd != null) {
                return this.Kbd;
            }
            this.Kbd = new C0078EYQ();
            return this.Kbd;
        }
    }

    /* compiled from: UGenEventListenerAdapter.java */
    /* renamed from: com.bytedance.adsdk.ugeno.core.EYQ.EYQ$EYQ, reason: collision with other inner class name */
    class C0078EYQ implements ICustomRouter {
        pi.EYQ EYQ;
        private pi.mZx Pm;
        private MxO Td;

        C0078EYQ() {
        }

        public void EYQ(MxO mxO) {
            this.Td = mxO;
        }

        public void EYQ(pi.mZx mzx) {
            this.Pm = mzx;
        }

        public void EYQ(pi.EYQ eyq) {
            this.EYQ = eyq;
        }
    }
}
