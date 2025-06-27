package com.mbridge.msdk.video.signal.a;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.json.t2;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.al;
import com.mbridge.msdk.video.module.MBridgeContainerView;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: JSRewardVideoV1.java */
/* loaded from: classes4.dex */
public final class o extends p {

    /* renamed from: a, reason: collision with root package name */
    private Activity f3772a;
    private MBridgeContainerView b;

    public o(Activity activity, MBridgeContainerView mBridgeContainerView) {
        this.f3772a = activity;
        this.b = mBridgeContainerView;
    }

    @Override // com.mbridge.msdk.video.signal.a.g, com.mbridge.msdk.video.signal.i
    public final String a() {
        if (this.b == null) {
            super.a();
        } else {
            try {
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.b.getCampaign());
                String unitID = this.b.getUnitID();
                com.mbridge.msdk.videocommon.d.c cVarA = com.mbridge.msdk.videocommon.d.b.a() == null ? null : com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), unitID);
                JSONObject jSONObject = new JSONObject();
                if (cVarA != null) {
                    jSONObject = cVarA.E();
                }
                ad.a("JSRewardVideoV1", "getEndScreenInfo success campaign = " + this.b.getCampaign());
                return a(arrayList, unitID, "MAL_16.7.41,3.0.1", jSONObject);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return super.a();
    }

    @Override // com.mbridge.msdk.video.signal.a.g, com.mbridge.msdk.video.signal.h
    public final void toggleCloseBtn(int i) {
        super.toggleCloseBtn(i);
        MBridgeContainerView mBridgeContainerView = this.b;
        if (mBridgeContainerView != null) {
            mBridgeContainerView.toggleCloseBtn(i);
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.g, com.mbridge.msdk.video.signal.i
    public final void a(String str) {
        MBridgeContainerView mBridgeContainerView;
        super.a(str);
        try {
            if (this.f3772a == null || TextUtils.isEmpty(str) || !str.equals(CampaignEx.JSON_NATIVE_VIDEO_CLICK) || (mBridgeContainerView = this.b) == null) {
                return;
            }
            mBridgeContainerView.triggerCloseBtn(str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.g, com.mbridge.msdk.video.signal.h
    public final void notifyCloseBtn(int i) {
        super.notifyCloseBtn(i);
        MBridgeContainerView mBridgeContainerView = this.b;
        if (mBridgeContainerView != null) {
            mBridgeContainerView.notifyCloseBtn(i);
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.g, com.mbridge.msdk.video.signal.i
    public final void c(String str) {
        MBridgeContainerView mBridgeContainerView;
        super.c(str);
        try {
            if (this.f3772a == null || TextUtils.isEmpty(str) || (mBridgeContainerView = this.b) == null) {
                return;
            }
            mBridgeContainerView.handlerPlayableException(str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.g, com.mbridge.msdk.video.signal.i
    public final void b(String str) {
        super.b(str);
        try {
            if (this.f3772a != null && !TextUtils.isEmpty(str)) {
                if (str.equals(t2.h.C)) {
                    this.f3772a.setRequestedOrientation(0);
                } else if (str.equals(t2.h.D)) {
                    this.f3772a.setRequestedOrientation(1);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private String a(List<CampaignEx> list, String str, String str2, JSONObject jSONObject) throws JSONException {
        if (list == null) {
            return null;
        }
        try {
            if (list.size() <= 0) {
                return null;
            }
            Object camplistToJson = CampaignEx.parseCamplistToJson(list);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("campaignList", camplistToJson);
            try {
                jSONObject2.put(t2.h.G, new com.mbridge.msdk.foundation.tools.h(com.mbridge.msdk.foundation.controller.c.m().c()).a());
                jSONObject2.put(MBridgeConstans.PROPERTIES_UNIT_ID, str);
                jSONObject2.put("sdk_info", str2);
                jSONObject2.put("unitSetting", jSONObject);
                if (com.mbridge.msdk.c.h.a() != null) {
                    String strG = com.mbridge.msdk.c.h.a().g(com.mbridge.msdk.foundation.controller.c.m().k());
                    if (!TextUtils.isEmpty(strG)) {
                        JSONObject jSONObject3 = new JSONObject(strG);
                        try {
                            Context contextC = com.mbridge.msdk.foundation.controller.c.m().c();
                            String string = al.a(contextC, "MBridge_ConfirmTitle" + str, "").toString();
                            String string2 = al.a(contextC, "MBridge_ConfirmContent" + str, "").toString();
                            String string3 = al.a(contextC, "MBridge_CancelText" + str, "").toString();
                            String string4 = al.a(contextC, "MBridge_ConfirmText" + str, "").toString();
                            if (!TextUtils.isEmpty(string)) {
                                jSONObject3.put("confirm_title", string);
                            }
                            if (!TextUtils.isEmpty(string2)) {
                                jSONObject3.put("confirm_description", string2);
                            }
                            if (!TextUtils.isEmpty(string3)) {
                                jSONObject3.put("confirm_t", string3);
                            }
                            if (!TextUtils.isEmpty(string4)) {
                                jSONObject3.put("confirm_c_play", string4);
                            }
                            if (!TextUtils.isEmpty(string4)) {
                                jSONObject3.put("confirm_c_rv", string4);
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        String strC = com.mbridge.msdk.c.h.a().c(str);
                        if (!TextUtils.isEmpty(strC)) {
                            jSONObject3.put("ivreward", new JSONObject(strC));
                        }
                        jSONObject2.put("appSetting", jSONObject3);
                    }
                }
                return jSONObject2.toString();
            } catch (JSONException e2) {
                throw new RuntimeException(e2);
            }
        } catch (Exception e3) {
            e3.printStackTrace();
            return null;
        }
    }
}
