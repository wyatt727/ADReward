package com.bytedance.sdk.openadsdk.core.ugen.mZx;

import android.content.Context;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.adsdk.ugeno.core.MxO;
import com.bytedance.adsdk.ugeno.core.nWX;
import com.bytedance.adsdk.ugeno.core.pi;
import com.bytedance.adsdk.ugeno.core.tp;
import com.bytedance.sdk.openadsdk.core.ugen.Pm.Td;
import com.bytedance.sdk.openadsdk.utils.xt;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: UGenEndCardRender.java */
/* loaded from: classes2.dex */
public class EYQ implements nWX, pi {
    private final Context EYQ;
    private nWX Pm;
    private InterfaceC0126EYQ Td;
    private com.bytedance.adsdk.ugeno.component.mZx<View> mZx;

    /* compiled from: UGenEndCardRender.java */
    /* renamed from: com.bytedance.sdk.openadsdk.core.ugen.mZx.EYQ$EYQ, reason: collision with other inner class name */
    interface InterfaceC0126EYQ {
        void EYQ(MxO mxO);
    }

    public EYQ(Context context) {
        this.EYQ = context;
    }

    public void EYQ(final JSONObject jSONObject, final JSONObject jSONObject2, final Td td) throws JSONException {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            mZx(jSONObject, jSONObject2, td);
        } else {
            xt.EYQ(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ugen.mZx.EYQ.1
                @Override // java.lang.Runnable
                public void run() throws JSONException {
                    EYQ.this.mZx(jSONObject, jSONObject2, td);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mZx(JSONObject jSONObject, JSONObject jSONObject2, Td td) throws JSONException {
        try {
            tp tpVar = new tp(this.EYQ);
            com.bytedance.adsdk.ugeno.component.mZx<View> mzxEYQ = tpVar.EYQ(jSONObject);
            this.mZx = mzxEYQ;
            if (mzxEYQ == null) {
                if (td != null) {
                    td.EYQ(3000, "ugen render fail");
                    return;
                }
                return;
            }
            View viewHX = mzxEYQ.HX();
            if (viewHX != null) {
                viewHX.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.ugen.mZx.EYQ.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                    }
                });
            }
            tpVar.EYQ((pi) this);
            tpVar.EYQ((nWX) this);
            if (jSONObject2 != null) {
                try {
                    jSONObject2.put("language", com.bytedance.sdk.openadsdk.core.MxO.EYQ());
                } catch (JSONException unused) {
                }
            }
            tpVar.mZx(jSONObject2);
            if (td != null) {
                td.EYQ(this.mZx);
            }
        } catch (Exception e) {
            if (td != null) {
                td.EYQ(3000, "ugen render fail exception is" + e.getMessage());
            }
        }
    }

    public void EYQ(InterfaceC0126EYQ interfaceC0126EYQ) {
        this.Td = interfaceC0126EYQ;
    }

    public void EYQ(nWX nwx) {
        this.Pm = nwx;
    }

    @Override // com.bytedance.adsdk.ugeno.core.pi
    public void EYQ(MxO mxO, pi.mZx mzx, pi.EYQ eyq) {
        InterfaceC0126EYQ interfaceC0126EYQ;
        if (mxO == null) {
            return;
        }
        if ((mxO.mZx() == 1 || mxO.mZx() == 4) && (interfaceC0126EYQ = this.Td) != null) {
            interfaceC0126EYQ.EYQ(mxO);
        }
        if (mzx == null || mxO.Pm() == null) {
            return;
        }
        mzx.EYQ(mxO.Pm());
    }

    @Override // com.bytedance.adsdk.ugeno.core.nWX
    public void EYQ(com.bytedance.adsdk.ugeno.component.mZx mzx, MotionEvent motionEvent) {
        nWX nwx = this.Pm;
        if (nwx != null) {
            nwx.EYQ(mzx, motionEvent);
        }
    }
}
