package com.bytedance.sdk.openadsdk.core.ugen.mZx;

import android.R;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.adsdk.ugeno.core.MxO;
import com.bytedance.adsdk.ugeno.core.nWX;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.PangleAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.core.lEs;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.core.ugen.EYQ.mZx;
import com.bytedance.sdk.openadsdk.core.ugen.Pm.Td;
import com.bytedance.sdk.openadsdk.core.ugen.mZx.EYQ;
import com.bytedance.sdk.openadsdk.utils.FH;
import com.com.bytedance.overseas.sdk.EYQ.Pm;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: UGenEndcardInflater.java */
/* loaded from: classes2.dex */
public class mZx implements nWX, EYQ.InterfaceC0126EYQ {
    protected static int EYQ = 8;
    private final com.bytedance.sdk.openadsdk.core.ugen.Pm.EYQ HX;
    private String IPb;
    private float KO;
    private UB Kbd;
    private View MxO;
    private final JSONObject Pm;
    private String QQ;
    private final Activity Td;
    private long UB;
    private boolean Uc = true;
    private String VwS;
    private long hu;
    private EYQ mZx;
    private float nWX;
    private float pi;
    private String tp;
    private float tsL;

    public mZx(Activity activity, JSONObject jSONObject, UB ub, String str, com.bytedance.sdk.openadsdk.core.ugen.Pm.EYQ eyq) {
        this.tp = null;
        this.Td = activity;
        this.Pm = jSONObject;
        this.tp = str;
        this.Kbd = ub;
        this.HX = eyq;
    }

    public void EYQ() {
        this.mZx = new EYQ(this.Td);
        UB ub = this.Kbd;
        if (ub != null && ub.po() != null) {
            this.QQ = this.Kbd.po().Td();
            this.IPb = this.Kbd.po().EYQ();
            this.VwS = this.Kbd.po().mZx();
        }
        this.HX.EYQ();
        com.bytedance.sdk.openadsdk.core.ugen.EYQ.mZx.EYQ().EYQ(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, this.QQ, this.IPb, this.VwS, "", new mZx.EYQ() { // from class: com.bytedance.sdk.openadsdk.core.ugen.mZx.mZx.1
            @Override // com.bytedance.sdk.openadsdk.core.ugen.EYQ.mZx.EYQ
            public void EYQ(JSONObject jSONObject, String str) throws JSONException {
                mZx mzx = mZx.this;
                mzx.EYQ(jSONObject, mzx.Pm);
                mZx.this.HX.EYQ(str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.ugen.EYQ.mZx.EYQ
            public void EYQ(int i, String str, String str2) {
                mZx.this.HX.EYQ(i, str, str2);
            }
        });
    }

    public void EYQ(View view) {
        this.MxO = view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EYQ(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        this.mZx.EYQ((EYQ.InterfaceC0126EYQ) this);
        this.mZx.EYQ((nWX) this);
        this.HX.mZx();
        this.mZx.EYQ(jSONObject, jSONObject2, new Td() { // from class: com.bytedance.sdk.openadsdk.core.ugen.mZx.mZx.2
            @Override // com.bytedance.sdk.openadsdk.core.ugen.Pm.Td
            public void EYQ(int i, String str) {
                if (mZx.this.HX != null) {
                    mZx.this.HX.EYQ(i, str);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.ugen.Pm.Td
            public void EYQ(com.bytedance.adsdk.ugeno.component.mZx<View> mzx) {
                if (mZx.this.HX != null) {
                    mZx.this.HX.EYQ(mzx);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.ugen.mZx.EYQ.InterfaceC0126EYQ
    public void EYQ(MxO mxO) throws JSONException {
        String strOptString = mxO.Td().optString("type");
        strOptString.hashCode();
        if (strOptString.equals("privacy")) {
            if (this.Td == null || TextUtils.isEmpty(hu.Pm().mN())) {
                return;
            }
            TTWebsiteActivity.EYQ(this.Td, this.Kbd, this.tp);
            return;
        }
        if (!strOptString.equals("creative") || this.Td == null || this.Kbd == null) {
            return;
        }
        mZx();
        ComponentCallbacks2 componentCallbacks2 = this.Td;
        if (componentCallbacks2 instanceof com.bytedance.sdk.openadsdk.core.video.Td.mZx) {
            ((com.bytedance.sdk.openadsdk.core.video.Td.mZx) componentCallbacks2).hYh();
        }
        EYQ(mxO, this.Kbd);
    }

    private void mZx() {
        int iPf = this.Kbd.Pf();
        if (iPf != 2 && iPf != 3) {
            if (iPf == 4) {
                Pm.EYQ(this.Td, this.Kbd, this.tp).Pm();
                return;
            } else {
                if (iPf != 5) {
                    return;
                }
                FH.Td(this.Td, this.Kbd.wJ());
                return;
            }
        }
        if (iPf == 3) {
            String strXPd = this.Kbd.XPd();
            if (!TextUtils.isEmpty(strXPd) && strXPd.contains("play.google.com/store")) {
                if (com.com.bytedance.overseas.sdk.EYQ.mZx.EYQ(this.Td, strXPd, strXPd.substring(strXPd.indexOf("?id=") + 4), this.tp, this.Kbd)) {
                    return;
                }
            }
        }
        Activity activity = this.Td;
        UB ub = this.Kbd;
        int iEYQ = FH.EYQ(this.tp);
        String str = this.tp;
        lEs.EYQ((Context) activity, ub, iEYQ, (PAGNativeAd) null, (PangleAd) null, str, Pm.EYQ(this.Td, this.Kbd, str), true, 0);
    }

    private void EYQ(MxO mxO, UB ub) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("down_x", this.tsL);
            jSONObject.put("down_y", this.pi);
            jSONObject.put("down_time", this.hu);
            jSONObject.put("up_x", this.nWX);
            jSONObject.put("up_y", this.KO);
            jSONObject.put("up_time", this.UB);
            View viewHX = mxO.EYQ().HX();
            int i = 1;
            if (viewHX != null) {
                JSONObject jSONObject2 = new JSONObject();
                int[] iArr = new int[2];
                float width = viewHX.getWidth();
                float height = viewHX.getHeight();
                viewHX.getLocationOnScreen(iArr);
                float f = iArr[0];
                float f2 = iArr[1];
                jSONObject2.put("width", width);
                jSONObject2.put("height", height);
                jSONObject2.put("left", f);
                jSONObject2.put("top", f2);
                jSONObject.put("rectInfo", jSONObject2);
            }
            View view = this.MxO;
            if (view != null) {
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                jSONObject.put("button_x", iArr2[0]);
                jSONObject.put("button_y", iArr2[1]);
                jSONObject.put("button_width", this.MxO.getWidth());
                jSONObject.put("button_height", this.MxO.getHeight());
            }
            View viewFindViewById = this.Td.findViewById(R.id.content);
            if (viewFindViewById != null) {
                int[] iArr3 = new int[2];
                viewFindViewById.getLocationOnScreen(iArr3);
                jSONObject.put("ad_x", iArr3[0]);
                jSONObject.put("ad_y", iArr3[1]);
                jSONObject.put("width", viewFindViewById.getWidth());
                jSONObject.put("height", viewFindViewById.getHeight());
            }
            jSONObject.put("click_area_type", mxO.EYQ().nWX());
            jSONObject.put("brickId", mxO.EYQ().pi());
            jSONObject.put("endcard_id", this.IPb);
            jSONObject.put("click_scence", 2);
            if (!this.Uc) {
                i = 2;
            }
            jSONObject.put("user_behavior_type", i);
            com.bytedance.sdk.openadsdk.mZx.Td.EYQ(ub, this.tp, CampaignEx.JSON_NATIVE_VIDEO_CLICK, jSONObject);
        } catch (JSONException unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.nWX
    public void EYQ(com.bytedance.adsdk.ugeno.component.mZx mzx, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.hu = System.currentTimeMillis();
            this.tsL = motionEvent.getRawX();
            this.pi = motionEvent.getRawY();
            this.Uc = true;
            return;
        }
        if (action != 1) {
            if (action != 2) {
                return;
            }
            if (Math.abs(motionEvent.getRawX() - this.tsL) >= EYQ || Math.abs(motionEvent.getRawY() - this.pi) >= EYQ) {
                this.Uc = false;
                return;
            }
            return;
        }
        this.nWX = motionEvent.getRawX();
        this.KO = motionEvent.getRawY();
        if (Math.abs(this.nWX - this.tsL) >= EYQ || Math.abs(this.KO - this.pi) >= EYQ) {
            this.Uc = false;
        }
        this.UB = System.currentTimeMillis();
    }
}
