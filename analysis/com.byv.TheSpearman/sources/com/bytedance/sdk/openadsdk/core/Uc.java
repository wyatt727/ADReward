package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.view.WindowManager;
import com.bytedance.sdk.component.embedapplog.PangleEncryptUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.UB;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.FH;
import com.bytedance.sdk.openadsdk.utils.Nvm;
import com.bytedance.sdk.openadsdk.utils.tr;
import com.json.i5;
import com.json.m4;
import com.json.t2;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.my.tracker.ads.AdFormat;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: NetApiImpl.java */
/* loaded from: classes2.dex */
public class Uc implements UB<com.bytedance.sdk.openadsdk.mZx.EYQ> {
    private final Context EYQ;

    Uc(Context context) {
        this.EYQ = context;
    }

    private JSONObject EYQ(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.hYh hyh, int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            String strPm = (hyh == null || TextUtils.isEmpty(hyh.EYQ)) ? FH.Pm() : hyh.EYQ;
            if (i == 7) {
                if (hyh != null && hyh.mZx > 0) {
                    jSONObject2.put("req_type", hyh.mZx);
                }
            } else if (i == 8) {
                if (hyh != null && hyh.Td > 0) {
                    jSONObject2.put("req_type", hyh.Td);
                }
            } else if (i == 3 && hyh != null && hyh.Pm > 0) {
                jSONObject2.put("req_type", hyh.Pm);
            }
            try {
                String strTp = hu.Pm().tp();
                String strWU = hu.Pm().WU();
                if (strTp != null && strWU != null) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("version", strTp);
                    jSONObject3.put("param", strWU);
                    jSONObject2.put("abtest", jSONObject3);
                }
            } catch (Throwable unused) {
            }
            if (adSlot != null && adSlot.getBiddingTokens() != null) {
                jSONObject2.put("bidding_param", adSlot.getBiddingTokens());
                com.bytedance.sdk.openadsdk.core.settings.EYQ eyqRfB = com.bytedance.sdk.openadsdk.core.settings.KO.Jpu().rfB(adSlot.getCodeId());
                jSONObject2.put("waterfall_id", eyqRfB.Pf);
                jSONObject2.put("waterfall_version", eyqRfB.vD);
                jSONObject2.put("link_id", adSlot.getLinkId());
            }
            jSONObject2.put("request_id", strPm);
            jSONObject2.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            jSONObject2.put("source_type", MBridgeConstans.DYNAMIC_VIEW_WX_APP);
            jSONObject2.put(MBridgeConstans.DYNAMIC_VIEW_WX_APP, Td());
            jSONObject2.put(t2.h.G, DeviceUtils.EYQ(this.EYQ, true));
            jSONObject2.put("user", EYQ(adSlot));
            jSONObject2.put(i5.R, FH.Td());
            jSONObject2.put("channel", t2.h.Z);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(EYQ(adSlot, i, hyh));
            jSONObject2.put("adslots", jSONArray);
            EYQ(jSONObject2, hyh);
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            jSONObject2.put("ts", jCurrentTimeMillis);
            String strConcat = "";
            if (adSlot.getCodeId() != null && strPm != null) {
                strConcat = String.valueOf(jCurrentTimeMillis).concat(adSlot.getCodeId()).concat(strPm);
            }
            jSONObject2.put("req_sign", com.bytedance.sdk.component.utils.Kbd.EYQ(strConcat));
            if (com.bytedance.sdk.openadsdk.core.Kbd.Td.Pm() != 0) {
                jSONObject2.put("pglx", String.valueOf(com.bytedance.sdk.openadsdk.core.Kbd.Td.Pm()));
            }
            jSONObject = com.bytedance.sdk.component.utils.EYQ.EYQ(jSONObject2);
            jSONObject.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            jSONObject.put("oversea_version_type", 1);
            return jSONObject;
        } catch (Throwable unused2) {
            return jSONObject;
        }
    }

    private void EYQ(JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.hYh hyh) throws JSONException {
        if (hyh == null || hyh.Kbd == null) {
            return;
        }
        try {
            jSONObject.put("source_temai_product_ids", hyh.Kbd);
        } catch (Exception unused) {
        }
    }

    private boolean Pm(String str) {
        if (com.bytedance.sdk.openadsdk.core.Pm.mZx.EYQ()) {
            return true;
        }
        if (!com.bytedance.sdk.openadsdk.core.Pm.mZx.EYQ(str)) {
            return false;
        }
        String strMZx = com.bytedance.sdk.openadsdk.core.Pm.mZx.mZx();
        if (!TextUtils.isEmpty(strMZx)) {
            com.bytedance.sdk.openadsdk.mZx.Td.EYQ(strMZx, System.currentTimeMillis());
        }
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.UB
    public void EYQ(final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.hYh hyh, final int i, UB.EYQ eyq) {
        final com.bytedance.sdk.openadsdk.core.EYQ.EYQ eyq2 = new com.bytedance.sdk.openadsdk.core.EYQ.EYQ(eyq);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            pi.mZx().post(new com.bytedance.sdk.component.VwS.QQ("getAd") { // from class: com.bytedance.sdk.openadsdk.core.Uc.1
                @Override // java.lang.Runnable
                public void run() {
                    Uc.this.mZx(adSlot, hyh, i, eyq2);
                }
            });
        } else {
            mZx(adSlot, hyh, i, eyq2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mZx(final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.hYh hyh, final int i, final UB.EYQ eyq) {
        pi.IPb();
        final com.bytedance.sdk.openadsdk.core.model.mZx mzx = new com.bytedance.sdk.openadsdk.core.model.mZx();
        mzx.EYQ(adSlot);
        if (!com.bytedance.sdk.openadsdk.core.settings.MxO.EYQ()) {
            if (eyq != null) {
                eyq.EYQ(1000, "Ad request is temporarily paused, Please contact your Pangle AM");
                mzx.EYQ(1000);
                com.bytedance.sdk.openadsdk.core.model.mZx.EYQ(mzx);
                return;
            }
            return;
        }
        if (!hu.Pm().Dal()) {
            if (eyq != null) {
                eyq.EYQ(-16, VwS.EYQ(-16));
                mzx.EYQ(1001);
                com.bytedance.sdk.openadsdk.core.model.mZx.EYQ(mzx);
                return;
            }
            return;
        }
        if (eyq == null) {
            return;
        }
        if (Pm(adSlot.getCodeId())) {
            eyq.EYQ(-8, VwS.EYQ(-8));
            return;
        }
        if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
            mzx.mZx(2);
            mzx.EYQ(adSlot.getBidAdm());
            if (com.bytedance.sdk.component.utils.pi.Pm()) {
                com.bykv.vk.openvk.component.video.api.IPb.mZx.EYQ(adSlot.getBidAdm());
            }
            if (hu.Pm().TQF() && NZ.EYQ().VwS() == 1) {
                FH.EYQ("Pangle_Debug_Mode", adSlot.getBidAdm(), this.EYQ);
            }
            try {
                JSONObject jSONObjectMZx = mZx(new JSONObject(adSlot.getBidAdm()));
                if (jSONObjectMZx == null) {
                    EYQ(eyq, mzx);
                    return;
                }
                EYQ EYQ2 = EYQ.EYQ(jSONObjectMZx, adSlot, hyh, mzx);
                mzx.EYQ(EYQ2.tp);
                MxO.EYQ(this.EYQ, EYQ2.HX);
                if (EYQ2.Pm != 20000) {
                    eyq.EYQ(EYQ2.Pm, EYQ2.Kbd);
                    mzx.EYQ(EYQ2.Pm);
                    com.bytedance.sdk.openadsdk.core.model.mZx.EYQ(mzx);
                    return;
                } else {
                    if (EYQ2.QQ == null) {
                        EYQ(eyq, mzx);
                        return;
                    }
                    if (EYQ2.QQ.Td() != null && EYQ2.QQ.Td().size() > 0) {
                        com.bytedance.sdk.openadsdk.tp.Td.EYQ(EYQ2.QQ.Td().get(0));
                    }
                    EYQ2.QQ.Td(jSONObjectMZx.toString());
                    eyq.EYQ(EYQ2.QQ, mzx);
                    Map<String, com.bytedance.sdk.openadsdk.core.model.UB> mapEYQ = com.bytedance.sdk.openadsdk.core.model.EYQ.EYQ(EYQ2.QQ);
                    if (mapEYQ != null) {
                        com.bytedance.sdk.openadsdk.Pm.mZx.EYQ().EYQ(mapEYQ);
                    }
                    EYQ(EYQ2.QQ);
                    return;
                }
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.pi.EYQ("NetApiImpl", "get ad error: ", th);
                EYQ(eyq, mzx);
                return;
            }
        }
        JSONObject jSONObjectEYQ = EYQ(adSlot, hyh, i);
        if (jSONObjectEYQ == null) {
            eyq.EYQ(-9, VwS.EYQ(-9));
            mzx.EYQ(-9);
            com.bytedance.sdk.openadsdk.core.model.mZx.EYQ(mzx);
            return;
        }
        if (hu.Pm().TQF() && NZ.EYQ().VwS() == 1) {
            FH.EYQ("Pangle_Debug_Mode", jSONObjectEYQ.toString(), this.EYQ);
        }
        String strEYQ = FH.EYQ(adSlot.getBiddingTokens() != null ? "/api/ad/union/mediation/get_ads/" : "/api/ad/union/sdk/get_ads/", true);
        com.bytedance.sdk.component.IPb.mZx.Pm pmMZx = com.bytedance.sdk.openadsdk.MxO.Td.EYQ().mZx().mZx();
        final com.bytedance.sdk.openadsdk.tp.EYQ.Pm pm = new com.bytedance.sdk.openadsdk.tp.EYQ.Pm(2);
        try {
            String strEYQ2 = com.bytedance.sdk.openadsdk.Kbd.Pm.EYQ(pmMZx, strEYQ);
            pmMZx.EYQ(strEYQ2);
            pm.EYQ(strEYQ2);
        } catch (Exception unused) {
        }
        pmMZx.EYQ(jSONObjectEYQ.toString(), hu.Pm().Uc());
        pm.EYQ(pmMZx.Td()).EYQ();
        Map<String, String> mapEYQ2 = com.bytedance.sdk.openadsdk.core.Kbd.Td.EYQ(strEYQ, jSONObjectEYQ.toString());
        if (mapEYQ2 != null && mapEYQ2.size() > 0) {
            for (String str : mapEYQ2.keySet()) {
                try {
                    pmMZx.mZx(str, mapEYQ2.get(str));
                } catch (Exception e) {
                    com.bytedance.sdk.component.utils.pi.EYQ("NetApiImpl", e.getMessage());
                }
            }
        }
        try {
            pmMZx.mZx("User-Agent", FH.Td());
        } catch (Exception unused2) {
        }
        final Nvm nvmEYQ = Nvm.EYQ();
        final Map<String, Object> requestExtraMap = adSlot.getRequestExtraMap();
        boolean z = QQ.mZx().UB() && requestExtraMap != null;
        if (z) {
            requestExtraMap.put("pgad_start", nvmEYQ);
        }
        if (adSlot.getBiddingTokens() != null) {
            EYQ(adSlot, hyh, pmMZx, requestExtraMap, z, nvmEYQ, eyq);
        } else {
            final boolean z2 = z;
            pmMZx.EYQ(new com.bytedance.sdk.component.IPb.EYQ.EYQ() { // from class: com.bytedance.sdk.openadsdk.core.Uc.2
                @Override // com.bytedance.sdk.component.IPb.EYQ.EYQ
                public void EYQ(com.bytedance.sdk.component.IPb.mZx.Td td, com.bytedance.sdk.component.IPb.mZx mzx2) {
                    System.currentTimeMillis();
                    pm.mZx();
                    if (z2) {
                        requestExtraMap.put("pgad_end", nvmEYQ);
                    }
                    if (mzx2 != null) {
                        if (mzx2.IPb()) {
                            com.bytedance.sdk.openadsdk.mZx.EYQ.IPb.mZx.incrementAndGet();
                            com.bytedance.sdk.openadsdk.mZx.EYQ.IPb.EYQ.incrementAndGet();
                            try {
                                Nvm nvmEYQ2 = Nvm.EYQ();
                                String strPm = mzx2.Pm();
                                JSONObject jSONObject = new JSONObject(strPm);
                                if (hu.Pm().TQF() && NZ.EYQ().VwS() == 1) {
                                    FH.EYQ("Pangle_Debug_Mode", jSONObject.toString(), Uc.this.EYQ);
                                }
                                mzx.EYQ(strPm);
                                JSONObject jSONObjectMZx2 = Uc.this.mZx(jSONObject);
                                if (jSONObjectMZx2 == null) {
                                    Uc.this.EYQ(eyq, mzx);
                                    mzx2.VwS();
                                    adSlot.getCodeId();
                                    com.bytedance.sdk.openadsdk.mZx.EYQ.IPb.IPb.incrementAndGet();
                                    com.bytedance.sdk.openadsdk.mZx.EYQ.IPb.Td();
                                    pm.EYQ(true).EYQ(mzx2.EYQ()).Td(strPm).Td();
                                    return;
                                }
                                EYQ EYQ3 = EYQ.EYQ(jSONObjectMZx2, adSlot, hyh, mzx);
                                mzx.EYQ(EYQ3.tp);
                                MxO.EYQ(Uc.this.EYQ, EYQ3.HX);
                                if (EYQ3.Pm != 20000) {
                                    mzx.EYQ(EYQ3.Pm);
                                    if (!hu.Pm().Tnp() && EYQ3.Pm == 40029) {
                                        eyq.EYQ(-100, VwS.EYQ(-100));
                                    } else {
                                        eyq.EYQ(EYQ3.Pm, EYQ3.Kbd);
                                    }
                                    com.bytedance.sdk.openadsdk.core.model.mZx.EYQ(mzx);
                                    mzx2.VwS();
                                    adSlot.getCodeId();
                                    String.valueOf(EYQ3.IPb);
                                    com.bytedance.sdk.openadsdk.mZx.EYQ.IPb.IPb.incrementAndGet();
                                    com.bytedance.sdk.openadsdk.mZx.EYQ.IPb.Td();
                                    pm.EYQ(true).EYQ(mzx2.EYQ()).Td(strPm).Td();
                                    return;
                                }
                                if (EYQ3.QQ == null) {
                                    Uc.this.EYQ(eyq, mzx);
                                    mzx2.VwS();
                                    adSlot.getCodeId();
                                    com.bytedance.sdk.openadsdk.mZx.EYQ.IPb.Kbd.incrementAndGet();
                                    com.bytedance.sdk.openadsdk.mZx.EYQ.IPb.Td();
                                    pm.EYQ(true).EYQ(mzx2.EYQ()).Td(strPm).Td();
                                    return;
                                }
                                EYQ3.QQ.Td(jSONObjectMZx2.toString());
                                Nvm nvmEYQ3 = Nvm.EYQ();
                                com.bytedance.sdk.openadsdk.core.model.hYh hyh2 = hyh;
                                if (hyh2 != null && hyh2.QQ != null) {
                                    hyh.QQ.EYQ(nvmEYQ, nvmEYQ2, EYQ3.EYQ, nvmEYQ3);
                                }
                                eyq.EYQ(EYQ3.QQ, mzx);
                                Uc.this.EYQ(EYQ3.QQ);
                                Map<String, com.bytedance.sdk.openadsdk.core.model.UB> mapEYQ3 = com.bytedance.sdk.openadsdk.core.model.EYQ.EYQ(EYQ3.QQ);
                                if (mapEYQ3 != null) {
                                    com.bytedance.sdk.openadsdk.Pm.mZx.EYQ().EYQ(mapEYQ3);
                                }
                                if (EYQ3.QQ.Td() != null && !EYQ3.QQ.Td().isEmpty()) {
                                    Uc.this.EYQ(hyh, nvmEYQ, nvmEYQ2, EYQ3.EYQ, nvmEYQ3, EYQ3.QQ.Td().get(0), FH.Td(i), EYQ3.QQ.VwS());
                                    com.bytedance.sdk.openadsdk.mZx.EYQ.IPb.Pm.incrementAndGet();
                                }
                                com.bytedance.sdk.openadsdk.mZx.EYQ.IPb.Td();
                                pm.EYQ(true).EYQ(mzx2.EYQ()).Td(strPm).Td();
                                return;
                            } catch (Throwable th2) {
                                com.bytedance.sdk.component.utils.pi.EYQ("NetApiImpl", "get ad error: ", th2);
                                Uc.this.EYQ(eyq, mzx);
                                mzx2.VwS();
                                adSlot.getCodeId();
                                com.bytedance.sdk.openadsdk.mZx.EYQ.IPb.Kbd.incrementAndGet();
                                com.bytedance.sdk.openadsdk.mZx.EYQ.IPb.Td();
                                pm.EYQ(mzx2.IPb()).EYQ(mzx2.EYQ()).Td(mzx2.Pm()).Pm(th2.getMessage()).Td();
                                return;
                            }
                        }
                        int iEYQ = mzx2.EYQ();
                        String strMZx = mzx2.mZx();
                        eyq.EYQ(iEYQ, strMZx);
                        mzx.EYQ(iEYQ);
                        com.bytedance.sdk.openadsdk.core.model.mZx.EYQ(mzx);
                        mzx2.VwS();
                        adSlot.getCodeId();
                        com.bytedance.sdk.openadsdk.mZx.EYQ.IPb.QQ.incrementAndGet();
                        com.bytedance.sdk.openadsdk.mZx.EYQ.IPb.Td.incrementAndGet();
                        com.bytedance.sdk.openadsdk.mZx.EYQ.IPb.EYQ.incrementAndGet();
                        com.bytedance.sdk.openadsdk.mZx.EYQ.IPb.Kbd();
                        com.bytedance.sdk.openadsdk.mZx.EYQ.IPb.EYQ(iEYQ, strMZx);
                        com.bytedance.sdk.openadsdk.mZx.EYQ.IPb.Td();
                        pm.EYQ(false).EYQ(iEYQ).Pm(strMZx).Td(mzx2.Pm()).Td();
                    }
                }

                @Override // com.bytedance.sdk.component.IPb.EYQ.EYQ
                public void EYQ(com.bytedance.sdk.component.IPb.mZx.Td td, IOException iOException) {
                    pm.mZx();
                    String message = iOException != null ? iOException.getMessage() : "";
                    Nvm nvmEYQ2 = Nvm.EYQ();
                    if (z2) {
                        requestExtraMap.put("pgad_end", Long.valueOf(nvmEYQ2.EYQ));
                    }
                    if (hu.Pm().TQF() && NZ.EYQ().VwS() == 1) {
                        FH.EYQ("Pangle_Debug_Mode", iOException != null ? iOException.getMessage() : null, Uc.this.EYQ);
                    }
                    int i2 = 601;
                    if (iOException != null && (iOException instanceof SocketTimeoutException)) {
                        i2 = 602;
                    }
                    UB.EYQ eyq2 = eyq;
                    if (eyq2 != null) {
                        eyq2.EYQ(i2, message);
                    }
                    Integer.valueOf(i2);
                    mzx.EYQ(i2);
                    com.bytedance.sdk.openadsdk.core.model.mZx.EYQ(mzx);
                    nvmEYQ2.EYQ(nvmEYQ);
                    adSlot.getCodeId();
                    com.bytedance.sdk.openadsdk.mZx.EYQ.IPb.Td.incrementAndGet();
                    com.bytedance.sdk.openadsdk.mZx.EYQ.IPb.EYQ.incrementAndGet();
                    com.bytedance.sdk.openadsdk.mZx.EYQ.IPb.VwS.incrementAndGet();
                    com.bytedance.sdk.openadsdk.mZx.EYQ.IPb.Kbd();
                    com.bytedance.sdk.openadsdk.mZx.EYQ.IPb.EYQ(i2, message);
                    com.bytedance.sdk.openadsdk.mZx.EYQ.IPb.Td();
                    pm.Pm(message).EYQ(false).Td();
                }
            });
        }
    }

    private void EYQ(final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.hYh hyh, com.bytedance.sdk.component.IPb.mZx.Pm pm, final Map<String, Object> map, final boolean z, final Nvm nvm, final UB.EYQ eyq) {
        pm.EYQ(new com.bytedance.sdk.component.IPb.EYQ.EYQ() { // from class: com.bytedance.sdk.openadsdk.core.Uc.3
            @Override // com.bytedance.sdk.component.IPb.EYQ.EYQ
            public void EYQ(com.bytedance.sdk.component.IPb.mZx.Td td, com.bytedance.sdk.component.IPb.mZx mzx) {
                if (z) {
                    map.put("pgad_end", nvm);
                }
                if (mzx == null || !mzx.IPb()) {
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(mzx.Pm());
                    if (hu.Pm().TQF() && NZ.EYQ().VwS() == 1) {
                        FH.EYQ("Pangle_Debug_Mode", jSONObject.toString(), Uc.this.EYQ);
                    }
                    JSONObject jSONObjectMZx = Uc.this.mZx(jSONObject);
                    if (jSONObjectMZx == null) {
                        eyq.EYQ(-1, VwS.EYQ(-1));
                        return;
                    }
                    EYQ EYQ2 = EYQ.EYQ(jSONObjectMZx, adSlot, hyh);
                    if (EYQ2.Pm != 20000) {
                        if (!hu.Pm().Tnp() && EYQ2.Pm == 40029) {
                            eyq.EYQ(-100, VwS.EYQ(-100));
                            return;
                        } else {
                            eyq.EYQ(EYQ2.Pm, EYQ2.Kbd);
                            return;
                        }
                    }
                    if (EYQ2.QQ == null) {
                        eyq.EYQ(-1, VwS.EYQ(-1));
                        return;
                    }
                    EYQ2.QQ.Td(jSONObjectMZx.toString());
                    eyq.EYQ(EYQ2.QQ, new com.bytedance.sdk.openadsdk.core.model.mZx());
                    Uc.this.EYQ(EYQ2.QQ);
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.pi.EYQ("NetApiImpl", "get ad error: ", th);
                    eyq.EYQ(-1, VwS.EYQ(-1));
                }
            }

            @Override // com.bytedance.sdk.component.IPb.EYQ.EYQ
            public void EYQ(com.bytedance.sdk.component.IPb.mZx.Td td, IOException iOException) {
                Nvm nvmEYQ = Nvm.EYQ();
                if (z) {
                    map.put("pgad_end", Long.valueOf(nvmEYQ.EYQ));
                }
                if (hu.Pm().TQF() && NZ.EYQ().VwS() == 1) {
                    FH.EYQ("Pangle_Debug_Mode", iOException != null ? iOException.getMessage() : null, Uc.this.EYQ);
                }
                eyq.EYQ(601, iOException != null ? iOException.getMessage() : "");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EYQ(com.bytedance.sdk.openadsdk.core.model.EYQ eyq) {
        List<com.bytedance.sdk.openadsdk.core.model.UB> listTd = eyq.Td();
        if (listTd == null || listTd.size() == 0) {
            return;
        }
        for (int i = 0; i < listTd.size(); i++) {
            com.bytedance.sdk.openadsdk.core.model.UB ub = listTd.get(i);
            if (ub != null && ub.HX() == null) {
                EYQ("", 0, 0, ub.vD(), ub);
                EYQ("", 0, 0, ub.lRN(), ub);
                List<com.bytedance.sdk.openadsdk.core.model.nWX> listDal = ub.Dal();
                if (listDal != null && listDal.size() > 0) {
                    for (int i2 = 0; i2 < listDal.size(); i2++) {
                        EYQ(ub, listDal.get(i2));
                    }
                }
                if (ub.mN() != null) {
                    EYQ(ub.mN().tp(), ub.mN().Td(), ub.mN().mZx(), (com.bytedance.sdk.openadsdk.core.model.nWX) null, ub);
                }
            }
        }
    }

    private void EYQ(String str, int i, int i2, com.bytedance.sdk.openadsdk.core.model.nWX nwx, com.bytedance.sdk.openadsdk.core.model.UB ub) {
        if (!TextUtils.isEmpty(str)) {
            com.bytedance.sdk.openadsdk.IPb.Pm.EYQ(str).EYQ(i).mZx(i2).Kbd(tr.Pm(hu.EYQ())).Pm(tr.Td(hu.EYQ())).Td(2).EYQ(new com.bytedance.sdk.openadsdk.IPb.mZx(ub, str, null), 4);
        } else {
            if (nwx == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.IPb.Pm.EYQ(nwx).Td(2).EYQ(new com.bytedance.sdk.openadsdk.IPb.mZx(ub, nwx.EYQ(), null), 4);
        }
    }

    private void EYQ(com.bytedance.sdk.openadsdk.core.model.UB ub, com.bytedance.sdk.openadsdk.core.model.nWX nwx) {
        if (nwx == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.IPb.Pm.EYQ(nwx).Td(2).EYQ(new com.bytedance.sdk.openadsdk.IPb.mZx(ub, nwx.EYQ(), new com.bytedance.sdk.component.Pm.hu() { // from class: com.bytedance.sdk.openadsdk.core.Uc.4
            @Override // com.bytedance.sdk.component.Pm.hu
            public void EYQ(int i, String str, Throwable th) {
            }

            @Override // com.bytedance.sdk.component.Pm.hu
            public void EYQ(com.bytedance.sdk.component.Pm.MxO mxO) {
            }
        }), 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EYQ(com.bytedance.sdk.openadsdk.core.model.hYh hyh, Nvm nvm, Nvm nvm2, int i, Nvm nvm3, com.bytedance.sdk.openadsdk.core.model.UB ub, String str, boolean z) throws JSONException {
        if (hu.Pm().TZn()) {
            JSONObject jSONObject = new JSONObject();
            long jEYQ = 0;
            if (hyh != null) {
                try {
                    if (hyh.VwS.EYQ > 0) {
                        jSONObject.put("client_start_time", nvm.EYQ(hyh.VwS));
                        jEYQ = nvm3.EYQ(hyh.VwS);
                    }
                } catch (Exception unused) {
                    return;
                }
            }
            jSONObject.put("network_time", nvm2.EYQ(nvm));
            jSONObject.put("sever_time", i);
            jSONObject.put("client_end_time", nvm3.EYQ(nvm2));
            int i2 = 1;
            if (z) {
                jSONObject.put("is_choose_ad", true);
            }
            if (str.equals("open_ad")) {
                if (!ub.BEC()) {
                    i2 = 0;
                }
                jSONObject.put("is_icon_only", i2);
            }
            com.bytedance.sdk.openadsdk.mZx.Td.EYQ(ub, str, "load_ad_time", jEYQ, jSONObject);
        }
    }

    private boolean Td(JSONObject jSONObject) {
        return jSONObject != null && jSONObject.length() > 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.UB
    public com.bytedance.sdk.openadsdk.mZx.Kbd EYQ(JSONObject jSONObject, String str, boolean z) {
        boolean z2;
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strMZx = null;
            if (!com.bytedance.sdk.openadsdk.core.settings.MxO.EYQ()) {
                return null;
            }
            com.bytedance.sdk.component.IPb.mZx.Pm pmMZx = com.bytedance.sdk.openadsdk.MxO.Td.EYQ().mZx().mZx();
            pmMZx.EYQ(str);
            if (com.bytedance.sdk.openadsdk.core.settings.KO.Jpu().BQ()) {
                pmMZx.mZx("_disable_retry", "1");
            }
            if (z) {
                byte[] bArrKbd = Kbd(jSONObject.toString());
                byte[] bArrEncrypt = PangleEncryptUtils.encrypt(bArrKbd, bArrKbd.length);
                if (bArrEncrypt == null) {
                    com.bytedance.sdk.component.utils.pi.EYQ("NetApiImpl", "V3 encrypt failed");
                    JSONObject jSONObjectEYQ = com.bytedance.sdk.component.utils.EYQ.EYQ(jSONObject);
                    if (!Td(jSONObjectEYQ)) {
                        jSONObjectEYQ = jSONObject;
                    }
                    EYQ(Pm(jSONObjectEYQ), pmMZx);
                    pmMZx.EYQ(jSONObjectEYQ.toString(), hu.Pm().Uc());
                } else {
                    EYQ(mZx(), pmMZx);
                    pmMZx.EYQ("application/octet-stream;tt-data=a", bArrEncrypt);
                }
            } else {
                JSONObject jSONObjectEYQ2 = com.bytedance.sdk.component.utils.EYQ.EYQ(jSONObject);
                if (!Td(jSONObjectEYQ2)) {
                    jSONObjectEYQ2 = jSONObject;
                }
                EYQ(Pm(jSONObjectEYQ2), pmMZx);
                pmMZx.EYQ(jSONObjectEYQ2.toString(), hu.Pm().Uc());
            }
            com.bytedance.sdk.openadsdk.tp.EYQ.Pm pm = new com.bytedance.sdk.openadsdk.tp.EYQ.Pm(3);
            pm.EYQ(str).EYQ(pmMZx.Td()).EYQ();
            com.bytedance.sdk.component.IPb.mZx mzxEYQ = pmMZx.EYQ();
            boolean zKbd = (mzxEYQ == null || !mzxEYQ.IPb() || TextUtils.isEmpty(mzxEYQ.Pm())) ? false : Kbd(new JSONObject(mzxEYQ.Pm()));
            String strMZx2 = "error unknown";
            int iEYQ = mzxEYQ != null ? mzxEYQ.EYQ() : 0;
            boolean z3 = true;
            if (zKbd || iEYQ != 200) {
                if (mzxEYQ != null && mzxEYQ.mZx() != null) {
                    strMZx2 = mzxEYQ.mZx();
                }
                z2 = false;
            } else {
                strMZx2 = "server say not success";
                z2 = true;
            }
            boolean z4 = mzxEYQ == null;
            if (z4 || !mzxEYQ.IPb()) {
                z3 = false;
            }
            com.bytedance.sdk.openadsdk.tp.EYQ.Pm pmEYQ = pm.EYQ(z3).Td(z4 ? null : mzxEYQ.Pm()).EYQ(z4 ? com.bytedance.sdk.openadsdk.tp.EYQ.Pm.EYQ : iEYQ);
            if (!z4) {
                strMZx = mzxEYQ.mZx();
            }
            pmEYQ.Pm(strMZx).Td();
            EYQ(jSONObject, z);
            com.bytedance.sdk.openadsdk.mZx.EYQ.EYQ.EYQ(com.bytedance.sdk.openadsdk.mZx.EYQ.EYQ.EYQ, zKbd, iEYQ, System.currentTimeMillis() - jCurrentTimeMillis);
            return new com.bytedance.sdk.openadsdk.mZx.Kbd(zKbd, iEYQ, strMZx2, z2);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.pi.EYQ("NetApiImpl", "uploadEvent error", th);
            return new com.bytedance.sdk.openadsdk.mZx.Kbd(false, 509, "service_busy", false);
        }
    }

    private void EYQ(Map<String, String> map, com.bytedance.sdk.component.IPb.mZx.Pm pm) {
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                try {
                    pm.mZx(entry.getKey(), entry.getValue());
                } catch (Exception e) {
                    com.bytedance.sdk.component.utils.pi.EYQ("NetApiImpl", "ADD header exceptopn", e.getMessage());
                }
            }
        }
        try {
            pm.mZx("User-Agent", FH.Td());
        } catch (Exception e2) {
            com.bytedance.sdk.component.utils.pi.EYQ("NetApiImpl", "ADD header exceptopn", e2.getMessage());
        }
    }

    private void EYQ(JSONObject jSONObject, boolean z) throws Throwable {
        if (QQ.mZx().UB()) {
            try {
                jSONObject.getJSONObject("header").put("aid", "4562");
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.pi.EYQ("NetApiImpl", "reportETEvent error", e.getMessage());
            }
            com.bytedance.sdk.component.IPb.mZx.Pm pmMZx = com.bytedance.sdk.openadsdk.MxO.Td.EYQ().mZx().mZx();
            pmMZx.EYQ(FH.pi());
            if (z) {
                byte[] bArrKbd = Kbd(jSONObject.toString());
                byte[] bArrEncrypt = PangleEncryptUtils.encrypt(bArrKbd, bArrKbd.length);
                if (bArrEncrypt == null) {
                    com.bytedance.sdk.component.utils.pi.EYQ("NetApiImpl", "V3 encrypt failed");
                    JSONObject jSONObjectEYQ = com.bytedance.sdk.component.utils.EYQ.EYQ(jSONObject);
                    if (Td(jSONObjectEYQ)) {
                        jSONObject = jSONObjectEYQ;
                    }
                    EYQ(Pm(jSONObject), pmMZx);
                    pmMZx.EYQ(jSONObject.toString(), hu.Pm().Uc());
                } else {
                    EYQ(mZx(), pmMZx);
                    pmMZx.EYQ("application/octet-stream;tt-data=a", bArrEncrypt);
                }
            } else {
                JSONObject jSONObjectEYQ2 = com.bytedance.sdk.component.utils.EYQ.EYQ(jSONObject);
                if (Td(jSONObjectEYQ2)) {
                    jSONObject = jSONObjectEYQ2;
                }
                EYQ(Pm(jSONObject), pmMZx);
                pmMZx.EYQ(jSONObject.toString(), hu.Pm().Uc());
            }
            pmMZx.EYQ(new com.bytedance.sdk.component.IPb.EYQ.EYQ() { // from class: com.bytedance.sdk.openadsdk.core.Uc.5
                @Override // com.bytedance.sdk.component.IPb.EYQ.EYQ
                public void EYQ(com.bytedance.sdk.component.IPb.mZx.Td td, com.bytedance.sdk.component.IPb.mZx mzx) {
                    if (mzx == null || !mzx.IPb()) {
                        return;
                    }
                    mzx.Pm();
                }

                @Override // com.bytedance.sdk.component.IPb.EYQ.EYQ
                public void EYQ(com.bytedance.sdk.component.IPb.mZx.Td td, IOException iOException) {
                    iOException.getMessage();
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.UB
    public void EYQ(String str, List<FilterWord> list, String str2, String str3) {
        JSONObject jSONObjectMZx;
        if (com.bytedance.sdk.openadsdk.core.settings.MxO.EYQ() && (jSONObjectMZx = mZx(str, list, str2, str3)) != null) {
            com.bytedance.sdk.component.IPb.mZx.Pm pmMZx = com.bytedance.sdk.openadsdk.MxO.Td.EYQ().mZx().mZx();
            String strPm = FH.Pm("/api/ad/union/dislike_event/");
            String string = com.bytedance.sdk.component.utils.EYQ.EYQ(jSONObjectMZx).toString();
            pmMZx.EYQ(strPm);
            pmMZx.Td(string);
            final com.bytedance.sdk.openadsdk.tp.EYQ.Pm pm = new com.bytedance.sdk.openadsdk.tp.EYQ.Pm(6);
            pm.EYQ(strPm).mZx(string).EYQ();
            pmMZx.EYQ(new com.bytedance.sdk.component.IPb.EYQ.EYQ() { // from class: com.bytedance.sdk.openadsdk.core.Uc.6
                @Override // com.bytedance.sdk.component.IPb.EYQ.EYQ
                public void EYQ(com.bytedance.sdk.component.IPb.mZx.Td td, com.bytedance.sdk.component.IPb.mZx mzx) {
                    if (mzx != null) {
                        pm.EYQ(mzx.IPb()).EYQ(mzx.EYQ()).Pm(mzx.mZx()).Td(mzx.Pm()).Td();
                    } else {
                        pm.EYQ(false).EYQ(com.bytedance.sdk.openadsdk.tp.EYQ.Pm.EYQ).Td();
                    }
                }

                @Override // com.bytedance.sdk.component.IPb.EYQ.EYQ
                public void EYQ(com.bytedance.sdk.component.IPb.mZx.Td td, IOException iOException) {
                    pm.EYQ(false).Pm(iOException != null ? iOException.getMessage() : null).Td();
                }
            });
        }
    }

    private JSONObject mZx(String str, List<FilterWord> list, String str2, String str3) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(t2.h.h, "dislike");
            jSONObject2.put("timestamp", System.currentTimeMillis());
            jSONObject2.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            jSONObject2.put("extra", str);
            jSONObject2.put("filter_words", EYQ(list));
            if (com.bytedance.sdk.openadsdk.core.settings.KO.Jpu().na() && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                jSONObject2.put("creative_info", com.bytedance.sdk.component.utils.EYQ.EYQ(new JSONObject(str2)).toString());
                jSONObject2.put("feedback_type", 1);
                jSONObject2.put("user_description", str3);
            }
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject2);
            jSONObject.put("actions", jSONArray);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private JSONArray EYQ(List<FilterWord> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<FilterWord> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().getId());
        }
        return jSONArray;
    }

    private Map<String, String> Pm(JSONObject jSONObject) {
        HashMap map = new HashMap();
        map.put("Content-Type", "application/json; charset=utf-8");
        if (Td(jSONObject)) {
            map.put("Content-Encoding", "union_sdk_encode");
        }
        return map;
    }

    private Map<String, String> mZx() {
        HashMap map = new HashMap();
        map.put("Content-Type", "application/octet-stream;tt-data=a");
        return map;
    }

    private boolean Kbd(JSONObject jSONObject) {
        if (jSONObject == null) {
            return false;
        }
        try {
            return jSONObject.optString("message").equalsIgnoreCase("success");
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EYQ(UB.EYQ eyq, com.bytedance.sdk.openadsdk.core.model.mZx mzx) {
        eyq.EYQ(-1, VwS.EYQ(-1));
        mzx.EYQ(-1);
        com.bytedance.sdk.openadsdk.core.model.mZx.EYQ(mzx);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EYQ(UB.mZx mzx) {
        mzx.EYQ(-1, VwS.EYQ(-1));
    }

    private JSONObject Td() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appid", QQ.mZx().Pm());
            jSONObject.put("name", QQ.mZx().Kbd());
            IPb(jSONObject);
            Context contextEYQ = hu.EYQ();
            String packageResourcePath = "";
            if (contextEYQ != null) {
                try {
                    packageResourcePath = contextEYQ.getPackageResourcePath();
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.pi.EYQ("NetApiImpl", "failed to get the application installation package path. error: " + th.getMessage());
                }
            }
            jSONObject.put("package_install_path", packageResourcePath);
            jSONObject.put("is_paid_app", QQ.mZx().tp());
            jSONObject.put("apk_sign", com.bytedance.sdk.openadsdk.common.EYQ.VwS());
            jSONObject.put("app_running_time", (System.currentTimeMillis() - pi.EYQ()) / 1000);
            jSONObject.put("fmwname", DeviceUtils.HX(this.EYQ));
            int i = 0;
            jSONObject.put("is_init", pi.Kbd() ? 1 : 0);
            if (contextEYQ != null) {
                int rotation = ((WindowManager) contextEYQ.getSystemService("window")).getDefaultDisplay().getRotation();
                if (rotation == 0) {
                    i = 1;
                } else if (rotation == 1) {
                    i = 3;
                } else if (rotation == 2) {
                    i = 2;
                } else if (rotation == 3) {
                    i = 4;
                }
                jSONObject.put("orientation_support", new JSONArray().put(i));
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static JSONObject EYQ(AdSlot adSlot) throws JSONException {
        hYh hyh;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("personalized_ad", hu.Pm().wJ());
            jSONObject.put("lmt", DeviceUtils.Td());
            jSONObject.put("coppa", QQ.mZx().HX());
            jSONObject.put("gdpr", QQ.mZx().QQ());
            jSONObject.put("is_gdpr_user", hu.Pm().lRN());
            jSONObject.put("ccpa", QQ.mZx().zF());
            if (adSlot != null && hYh.EYQ.containsKey(Integer.valueOf(adSlot.getCodeId())) && (hyh = hYh.EYQ.get(Integer.valueOf(adSlot.getCodeId()))) != null) {
                jSONObject.put("lastadomain", hyh.mZx());
                jSONObject.put("lastbundle", hyh.Td());
                jSONObject.put("lastclick", hyh.Pm());
                jSONObject.put("lastskip", hyh.Kbd());
            }
            EYQ(jSONObject, "keywords", QQ.mZx().MxO());
            EYQ(jSONObject, "data", mZx(adSlot));
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private static String mZx(AdSlot adSlot) {
        String strTsL = QQ.mZx().tsL();
        if (adSlot == null) {
            return TextUtils.isEmpty(strTsL) ? "" : strTsL;
        }
        String userData = adSlot.getUserData();
        if (TextUtils.isEmpty(strTsL)) {
            return userData;
        }
        if (TextUtils.isEmpty(userData)) {
            return strTsL;
        }
        HashSet hashSet = new HashSet();
        try {
            JSONArray jSONArray = new JSONArray(userData);
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject != null) {
                    hashSet.add(jSONObject.optString("name", null));
                }
            }
            try {
                JSONArray jSONArray2 = new JSONArray(strTsL);
                int length2 = jSONArray2.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    JSONObject jSONObject2 = jSONArray2.getJSONObject(i2);
                    if (jSONObject2 != null && !hashSet.contains(jSONObject2.optString("name", null))) {
                        jSONArray.put(jSONObject2);
                    }
                }
                return jSONArray.toString();
            } catch (Throwable unused) {
                return userData;
            }
        } catch (Throwable unused2) {
            return strTsL;
        }
    }

    private static void EYQ(JSONObject jSONObject, String str, String str2) throws JSONException {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        jSONObject.put(str, str2);
    }

    private void IPb(JSONObject jSONObject) throws JSONException {
        try {
            jSONObject.put("package_name", FH.Kbd());
            jSONObject.put("version_code", FH.IPb());
            jSONObject.put("version", FH.VwS());
        } catch (Exception unused) {
        }
    }

    private JSONObject EYQ(AdSlot adSlot, int i, com.bytedance.sdk.openadsdk.core.model.hYh hyh) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", adSlot.getCodeId());
            jSONObject.put("adtype", i);
            if (!TextUtils.isEmpty(adSlot.getAdId()) || !TextUtils.isEmpty(adSlot.getCreativeId()) || !TextUtils.isEmpty(adSlot.getExt())) {
                JSONObject jSONObject2 = new JSONObject();
                if (!TextUtils.isEmpty(adSlot.getAdId())) {
                    jSONObject2.put("ad_id", adSlot.getAdId());
                }
                if (!TextUtils.isEmpty(adSlot.getCreativeId())) {
                    jSONObject2.put(CampaignEx.JSON_KEY_CREATIVE_ID, adSlot.getCreativeId());
                }
                if (adSlot.getExt() != null) {
                    jSONObject2.put("ext", adSlot.getExt());
                }
                jSONObject.put("preview_ads", jSONObject2);
            }
            if (hyh != null) {
                jSONObject.put("render_method", hyh.IPb);
                if (hyh.IPb == 1) {
                    EYQ(jSONObject, "accepted_size", adSlot.getImgAcceptedWidth(), adSlot.getImgAcceptedHeight());
                } else if (hyh.IPb == 2) {
                    EYQ(jSONObject, "accepted_size", adSlot.getExpressViewAcceptedWidth(), adSlot.getExpressViewAcceptedHeight());
                }
            } else {
                jSONObject.put("render_method", 1);
                EYQ(jSONObject, "accepted_size", adSlot.getImgAcceptedWidth(), adSlot.getImgAcceptedHeight());
            }
            jSONObject.put("ptpl_ids", mZx(adSlot.getCodeId()));
            jSONObject.put("ugen_ptpl_ids", Td(adSlot.getCodeId()));
            jSONObject.put("pos", AdSlot.getPosition(i));
            jSONObject.put("is_support_dpl", adSlot.isSupportDeepLink());
            if (adSlot.getNativeAdType() > 0 || i == 5) {
                jSONObject.put("is_origin_ad", true);
            }
            int adCount = adSlot.getAdCount();
            if (adCount <= 0) {
                adCount = 1;
            }
            if (adCount > 3) {
                adCount = 3;
            }
            if (i == 7 || i == 8) {
                adCount = 1;
            }
            if (hyh != null && hyh.Kbd != null) {
                adCount = adSlot.getAdCount();
            }
            jSONObject.put("ad_count", adCount);
            if (i == 1) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("is_rotate_banner", adSlot.getIsRotateBanner());
                jSONObject3.put("rotate_time", adSlot.getRotateTime());
                jSONObject3.put("rotate_order", adSlot.getRotateOrder());
                jSONObject.put(AdFormat.BANNER, jSONObject3);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private void EYQ(JSONObject jSONObject, String str, int i, int i2) throws JSONException {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            jSONObject2.put("width", i);
            jSONObject2.put("height", i2);
            jSONArray.put(jSONObject2);
            jSONObject.put(str, jSONArray);
        } catch (Exception unused) {
        }
    }

    private void EYQ(JSONObject jSONObject, String str, float f, float f2) throws JSONException {
        if (f < 0.0f || f2 < 0.0f) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            jSONObject2.put("width", (int) f);
            jSONObject2.put("height", (int) f2);
            jSONArray.put(jSONObject2);
            jSONObject.put(str, jSONArray);
        } catch (Exception unused) {
        }
    }

    /* compiled from: NetApiImpl.java */
    public static class EYQ {
        final int EYQ;
        final String HX;
        final int IPb;
        final String Kbd;
        final int Pm;
        public final com.bytedance.sdk.openadsdk.core.model.EYQ QQ;
        final long Td;
        final String VwS;
        final long mZx;
        final ArrayList<Integer> tp;

        private EYQ(String str, int i, int i2, String str2, int i3, String str3, com.bytedance.sdk.openadsdk.core.model.EYQ eyq, long j, long j2, ArrayList<Integer> arrayList) {
            this.EYQ = i;
            this.Pm = i2;
            this.Kbd = str2;
            this.VwS = str3;
            this.QQ = eyq;
            this.HX = str;
            this.IPb = i3;
            this.mZx = j;
            this.Td = j2;
            this.tp = arrayList;
        }

        public static EYQ EYQ(JSONObject jSONObject, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.hYh hyh, com.bytedance.sdk.openadsdk.core.model.mZx mzx) {
            String strOptString = jSONObject.optString("did");
            int iOptInt = jSONObject.optInt("processing_time_ms");
            long jOptLong = jSONObject.optLong("s_receive_ts");
            long jOptLong2 = jSONObject.optLong("s_send_ts");
            int iOptInt2 = jSONObject.optInt("status_code");
            String strOptString2 = jSONObject.optString(CampaignEx.JSON_KEY_DESC);
            String strOptString3 = jSONObject.optString("request_id");
            int iOptInt3 = jSONObject.optInt("reason");
            Pair<com.bytedance.sdk.openadsdk.core.model.EYQ, ArrayList<Integer>> pairEYQ = com.bytedance.sdk.openadsdk.core.mZx.EYQ(jSONObject, adSlot, hyh, mzx);
            if (pairEYQ != null && pairEYQ.first != null) {
                ((com.bytedance.sdk.openadsdk.core.model.EYQ) pairEYQ.first).EYQ(jSONObject.optLong("request_after"));
            }
            if (pairEYQ == null) {
                return new EYQ(strOptString, iOptInt, iOptInt2, strOptString2, iOptInt3, strOptString3, null, jOptLong, jOptLong2, null);
            }
            return new EYQ(strOptString, iOptInt, iOptInt2, strOptString2, iOptInt3, strOptString3, (com.bytedance.sdk.openadsdk.core.model.EYQ) pairEYQ.first, jOptLong, jOptLong2, (ArrayList) pairEYQ.second);
        }

        public static EYQ EYQ(JSONObject jSONObject, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.hYh hyh) {
            JSONArray jSONArray;
            int i;
            String str;
            long j;
            long j2;
            String strOptString = jSONObject.optString("did");
            int iOptInt = jSONObject.optInt("processing_time_ms");
            long jOptLong = jSONObject.optLong("s_receive_ts");
            long jOptLong2 = jSONObject.optLong("s_send_ts");
            int iOptInt2 = jSONObject.optInt("status_code");
            String strOptString2 = jSONObject.optString(CampaignEx.JSON_KEY_DESC);
            String strOptString3 = jSONObject.optString("request_id");
            int iOptInt3 = jSONObject.optInt("reason");
            if (adSlot != null && adSlot.getBiddingTokens() != null) {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("adn_bid_result");
                com.bytedance.sdk.openadsdk.core.model.EYQ eyq = new com.bytedance.sdk.openadsdk.core.model.EYQ();
                if (jSONArrayOptJSONArray != null) {
                    int i2 = 0;
                    while (i2 < jSONArrayOptJSONArray.length()) {
                        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
                        if (jSONObjectOptJSONObject != null) {
                            String strOptString4 = jSONObjectOptJSONObject.optString("name");
                            String strOptString5 = jSONObjectOptJSONObject.optString("render_data");
                            jSONArray = jSONArrayOptJSONArray;
                            String strOptString6 = jSONObjectOptJSONObject.optString("price");
                            j2 = jOptLong2;
                            JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("win_notice");
                            JSONArray jSONArrayOptJSONArray3 = jSONObjectOptJSONObject.optJSONArray("loss_notice");
                            j = jOptLong;
                            String strOptString7 = jSONObjectOptJSONObject.optString("cid");
                            String strOptString8 = jSONObjectOptJSONObject.optString("crid");
                            str = strOptString3;
                            JSONArray jSONArrayOptJSONArray4 = jSONObjectOptJSONObject.optJSONArray("adomain");
                            i = iOptInt3;
                            String strOptString9 = jSONObjectOptJSONObject.optString("adn_response_id");
                            com.bytedance.sdk.openadsdk.core.model.VwS vwS = new com.bytedance.sdk.openadsdk.core.model.VwS();
                            vwS.EYQ(strOptString4);
                            vwS.mZx(strOptString5);
                            vwS.Td(strOptString6);
                            vwS.Pm(strOptString7);
                            vwS.Kbd(strOptString8);
                            vwS.IPb(strOptString9);
                            if (jSONArrayOptJSONArray4 != null) {
                                ArrayList arrayList = new ArrayList();
                                for (int i3 = 0; i3 < jSONArrayOptJSONArray4.length(); i3++) {
                                    arrayList.add(jSONArrayOptJSONArray4.optString(i3));
                                }
                                vwS.Td(arrayList);
                            }
                            if (jSONArrayOptJSONArray2 != null) {
                                ArrayList arrayList2 = new ArrayList();
                                for (int i4 = 0; i4 < jSONArrayOptJSONArray2.length(); i4++) {
                                    arrayList2.add(jSONArrayOptJSONArray2.optString(i4));
                                }
                                vwS.EYQ(arrayList2);
                            }
                            if (jSONArrayOptJSONArray3 != null) {
                                ArrayList arrayList3 = new ArrayList();
                                for (int i5 = 0; i5 < jSONArrayOptJSONArray3.length(); i5++) {
                                    arrayList3.add(jSONArrayOptJSONArray3.optString(i5));
                                }
                                vwS.mZx(arrayList3);
                            }
                            eyq.EYQ(vwS);
                        } else {
                            jSONArray = jSONArrayOptJSONArray;
                            i = iOptInt3;
                            str = strOptString3;
                            j = jOptLong;
                            j2 = jOptLong2;
                        }
                        i2++;
                        jSONArrayOptJSONArray = jSONArray;
                        strOptString3 = str;
                        jOptLong2 = j2;
                        jOptLong = j;
                        iOptInt3 = i;
                    }
                }
                return new EYQ(strOptString, iOptInt, iOptInt2, strOptString2, iOptInt3, strOptString3, eyq, jOptLong, jOptLong2, null);
            }
            return new EYQ(strOptString, iOptInt, iOptInt2, strOptString2, iOptInt3, strOptString3, null, jOptLong, jOptLong2, null);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.UB
    public void EYQ(JSONObject jSONObject, final UB.mZx mzx) {
        if (!com.bytedance.sdk.openadsdk.core.settings.MxO.EYQ()) {
            if (mzx != null) {
                mzx.EYQ(1000, "Ad request is temporarily paused, Please contact your Pangle AM");
            }
        } else {
            if (jSONObject == null || mzx == null) {
                return;
            }
            JSONObject jSONObjectEYQ = com.bytedance.sdk.component.utils.EYQ.EYQ(jSONObject);
            final com.bytedance.sdk.openadsdk.tp.EYQ.Pm pm = new com.bytedance.sdk.openadsdk.tp.EYQ.Pm(5);
            com.bytedance.sdk.component.IPb.mZx.Pm pmMZx = com.bytedance.sdk.openadsdk.MxO.Td.EYQ().mZx().mZx();
            try {
                String strEYQ = com.bytedance.sdk.openadsdk.Kbd.Pm.EYQ(pmMZx, FH.Pm("/api/ad/union/sdk/reward_video/reward/"));
                pmMZx.EYQ(strEYQ);
                pm.EYQ(strEYQ);
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.pi.EYQ("NetApiImpl", e.getMessage());
            }
            pmMZx.Td(jSONObjectEYQ.toString());
            pm.EYQ(pmMZx.Td()).EYQ();
            pmMZx.EYQ(new com.bytedance.sdk.component.IPb.EYQ.EYQ() { // from class: com.bytedance.sdk.openadsdk.core.Uc.7
                @Override // com.bytedance.sdk.component.IPb.EYQ.EYQ
                public void EYQ(com.bytedance.sdk.component.IPb.mZx.Td td, com.bytedance.sdk.component.IPb.mZx mzx2) {
                    if (mzx2 != null) {
                        if (mzx2.IPb() && !TextUtils.isEmpty(mzx2.Pm())) {
                            pm.EYQ(true).EYQ(mzx2.EYQ()).Td(mzx2.Pm()).Td();
                            try {
                                JSONObject jSONObject2 = new JSONObject(mzx2.Pm());
                                String strTd = jSONObject2.optInt("cypher", -1) == 3 ? com.bytedance.sdk.component.utils.EYQ.Td(jSONObject2.optString("message")) : null;
                                if (!TextUtils.isEmpty(strTd)) {
                                    try {
                                        jSONObject2 = new JSONObject(strTd);
                                    } catch (Throwable unused) {
                                    }
                                }
                                mZx mzxEYQ = mZx.EYQ(jSONObject2);
                                if (mzxEYQ.EYQ != 20000) {
                                    mzx.EYQ(mzxEYQ.EYQ, VwS.EYQ(mzxEYQ.EYQ));
                                    return;
                                } else if (mzxEYQ.Td == null) {
                                    Uc.this.EYQ(mzx);
                                    return;
                                } else {
                                    mzx.EYQ(mzxEYQ);
                                    return;
                                }
                            } catch (JSONException e2) {
                                com.bytedance.sdk.component.utils.pi.EYQ("NetApiImpl", e2.getMessage());
                                Uc.this.EYQ(mzx);
                                return;
                            }
                        }
                        pm.EYQ(mzx2.IPb()).Td(mzx2.Pm()).EYQ(mzx2.EYQ()).Pm(mzx2.mZx()).Td();
                        String strEYQ2 = VwS.EYQ(-2);
                        int iEYQ = mzx2.EYQ();
                        if (!mzx2.IPb() && !TextUtils.isEmpty(mzx2.mZx())) {
                            strEYQ2 = mzx2.mZx();
                        }
                        mzx.EYQ(iEYQ, strEYQ2);
                        return;
                    }
                    pm.EYQ(false).EYQ(com.bytedance.sdk.openadsdk.tp.EYQ.Pm.EYQ).Td();
                    Uc.this.EYQ(mzx);
                }

                @Override // com.bytedance.sdk.component.IPb.EYQ.EYQ
                public void EYQ(com.bytedance.sdk.component.IPb.mZx.Td td, IOException iOException) {
                    String message = iOException != null ? iOException.getMessage() : "";
                    pm.EYQ(false).Pm(message).Td();
                    mzx.EYQ(-2, message);
                }
            });
        }
    }

    /* compiled from: NetApiImpl.java */
    public static class mZx {
        public final int EYQ;
        public final com.bytedance.sdk.openadsdk.core.model.NZ Td;
        public final boolean mZx;

        private mZx(int i, boolean z, com.bytedance.sdk.openadsdk.core.model.NZ nz) {
            this.EYQ = i;
            this.mZx = z;
            this.Td = nz;
        }

        public static mZx EYQ(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            int iOptInt = jSONObject.optInt("code");
            boolean zOptBoolean = jSONObject.optBoolean("verify");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            com.bytedance.sdk.openadsdk.core.model.NZ nz = new com.bytedance.sdk.openadsdk.core.model.NZ();
            if (jSONObjectOptJSONObject != null) {
                try {
                    nz.EYQ(jSONObjectOptJSONObject.optInt("reason"));
                    nz.mZx(jSONObjectOptJSONObject.optInt("corp_type"));
                    nz.Td(jSONObjectOptJSONObject.optInt("reward_amount"));
                    nz.EYQ(jSONObjectOptJSONObject.optString("reward_name"));
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.pi.EYQ("NetApiImpl", th.getMessage());
                }
            }
            return new mZx(iOptInt, zOptBoolean, nz);
        }
    }

    public JSONObject mZx(JSONObject jSONObject) {
        if (jSONObject == null) {
            return jSONObject;
        }
        try {
            int iOptInt = jSONObject.optInt("cypher", -1);
            String strOptString = jSONObject.optString("message");
            String strOptString2 = jSONObject.optString("auction_price", "");
            if (iOptInt == 3) {
                strOptString = com.bytedance.sdk.component.utils.EYQ.Td(strOptString);
            }
            if (TextUtils.isEmpty(strOptString)) {
                return jSONObject;
            }
            JSONObject jSONObject2 = new JSONObject(strOptString);
            try {
                jSONObject2.put("auction_price", strOptString2);
            } catch (Throwable unused) {
            }
            return jSONObject2;
        } catch (Throwable unused2) {
            return jSONObject;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.UB
    public com.bytedance.sdk.openadsdk.mZx.Kbd EYQ(JSONObject jSONObject) {
        boolean z;
        boolean z2;
        int iEYQ;
        String strMZx = "error unknown";
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!com.bytedance.sdk.openadsdk.core.settings.MxO.EYQ() || jSONObject == null || jSONObject.length() <= 0) {
            return null;
        }
        com.bytedance.sdk.openadsdk.tp.EYQ.Pm pm = new com.bytedance.sdk.openadsdk.tp.EYQ.Pm(4);
        JSONObject jSONObjectEYQ = com.bytedance.sdk.component.utils.EYQ.EYQ(jSONObject);
        com.bytedance.sdk.component.IPb.mZx.Pm pmMZx = com.bytedance.sdk.openadsdk.MxO.Td.EYQ().mZx().mZx();
        boolean z3 = false;
        try {
            pmMZx.EYQ(jSONObjectEYQ.toString(), hu.Pm().Uc());
            String strPm = FH.Pm("/api/ad/union/sdk/stats/batch/");
            pm.EYQ(strPm).EYQ(pmMZx.Td()).EYQ();
            pmMZx.EYQ(strPm);
            pmMZx.mZx("User-Agent", FH.Td());
            if (com.bytedance.sdk.openadsdk.core.settings.KO.Jpu().aEX()) {
                pmMZx.mZx("_disable_retry", "1");
            }
            com.bytedance.sdk.component.IPb.mZx mzxEYQ = pmMZx.EYQ();
            try {
            } catch (Throwable unused) {
                z = false;
                z2 = false;
                iEYQ = 0;
            }
            if (mzxEYQ == null) {
                return new com.bytedance.sdk.openadsdk.mZx.Kbd(false, 0, "error unknown", false);
            }
            if (!mzxEYQ.IPb() || TextUtils.isEmpty(mzxEYQ.Pm())) {
                z = false;
                z2 = false;
            } else {
                JSONObject jSONObject2 = new JSONObject(mzxEYQ.Pm());
                int iOptInt = jSONObject2.optInt("code", -1);
                strMZx = jSONObject2.optString("data", "");
                z = iOptInt == 20000;
                z2 = iOptInt == 60005;
            }
            try {
                iEYQ = mzxEYQ.EYQ();
                try {
                    if (!mzxEYQ.IPb()) {
                        strMZx = mzxEYQ.mZx();
                    }
                } catch (Throwable unused2) {
                }
            } catch (Throwable unused3) {
                iEYQ = 0;
            }
            boolean z4 = mzxEYQ == null;
            if (!z4 && mzxEYQ.IPb()) {
                z3 = true;
            }
            pm.EYQ(z3).Td(z4 ? null : mzxEYQ.Pm()).EYQ(z4 ? com.bytedance.sdk.openadsdk.tp.EYQ.Pm.EYQ : iEYQ).Pm(z4 ? null : mzxEYQ.mZx()).Td();
            com.bytedance.sdk.openadsdk.mZx.EYQ.EYQ.EYQ(com.bytedance.sdk.openadsdk.mZx.EYQ.EYQ.mZx, z, iEYQ, System.currentTimeMillis() - jCurrentTimeMillis);
            return new com.bytedance.sdk.openadsdk.mZx.Kbd(z, iEYQ, strMZx, z2);
        } catch (Throwable unused4) {
            com.bytedance.sdk.openadsdk.mZx.EYQ.EYQ.EYQ(com.bytedance.sdk.openadsdk.mZx.EYQ.EYQ.mZx, false, 0, System.currentTimeMillis() - jCurrentTimeMillis);
            return new com.bytedance.sdk.openadsdk.mZx.Kbd(false, 0, "error unknown", false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.UB
    public com.bytedance.sdk.component.adexpress.EYQ.Td.EYQ EYQ() {
        com.bytedance.sdk.component.adexpress.EYQ.Td.EYQ eyqPm = null;
        if (!com.bytedance.sdk.openadsdk.core.settings.MxO.EYQ()) {
            return null;
        }
        long jCurrentTimeMillis = (System.currentTimeMillis() / 1000) - com.bytedance.sdk.openadsdk.multipro.Pm.Pm.EYQ("tpl_fetch_model", "date", 0L);
        String strPf = hu.Pm().Pf();
        String strMZx = com.bytedance.sdk.openadsdk.multipro.Pm.Pm.mZx("tpl_fetch_model", "last_url", "");
        if (jCurrentTimeMillis <= hu.Pm().Nvm() && jCurrentTimeMillis >= 0 && TextUtils.equals(strPf, strMZx)) {
            String strMZx2 = com.bytedance.sdk.openadsdk.multipro.Pm.Pm.mZx("tpl_fetch_model", i5.u, "");
            try {
                if (!TextUtils.isEmpty(strMZx2)) {
                    return com.bytedance.sdk.component.adexpress.EYQ.Td.EYQ.Pm(strMZx2);
                }
            } catch (Exception unused) {
            }
        }
        com.bytedance.sdk.component.IPb.mZx.mZx mzxTd = com.bytedance.sdk.openadsdk.MxO.Td.EYQ().mZx().Td();
        try {
            mzxTd.EYQ(com.bytedance.sdk.openadsdk.Kbd.Pm.EYQ(mzxTd, strPf));
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.pi.EYQ("NetApiImpl", e.getMessage());
        }
        com.bytedance.sdk.component.IPb.mZx mzxEYQ = mzxTd.EYQ();
        if (mzxEYQ == null) {
            return null;
        }
        try {
            if (!mzxEYQ.IPb()) {
                return null;
            }
            String strPm = mzxEYQ.Pm();
            eyqPm = com.bytedance.sdk.component.adexpress.EYQ.Td.EYQ.Pm(strPm);
            com.bytedance.sdk.openadsdk.multipro.Pm.Pm.EYQ("tpl_fetch_model", "date", Long.valueOf(System.currentTimeMillis() / 1000));
            com.bytedance.sdk.openadsdk.multipro.Pm.Pm.EYQ("tpl_fetch_model", i5.u, strPm);
            com.bytedance.sdk.openadsdk.multipro.Pm.Pm.EYQ("tpl_fetch_model", "last_url", strPf);
            return eyqPm;
        } catch (Exception unused2) {
            return eyqPm;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.UB
    public void EYQ(String str) {
        com.bytedance.sdk.component.IPb.mZx.mZx mzxTd = com.bytedance.sdk.openadsdk.MxO.Td.EYQ().mZx().Td();
        mzxTd.EYQ(str);
        mzxTd.EYQ(new com.bytedance.sdk.component.IPb.EYQ.EYQ() { // from class: com.bytedance.sdk.openadsdk.core.Uc.8
            @Override // com.bytedance.sdk.component.IPb.EYQ.EYQ
            public void EYQ(com.bytedance.sdk.component.IPb.mZx.Td td, IOException iOException) {
            }

            @Override // com.bytedance.sdk.component.IPb.EYQ.EYQ
            public void EYQ(com.bytedance.sdk.component.IPb.mZx.Td td, com.bytedance.sdk.component.IPb.mZx mzx) {
                mzx.Pm();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.UB
    public void EYQ(JSONObject jSONObject, String str) {
        com.bytedance.sdk.component.IPb.mZx.Pm pmMZx = com.bytedance.sdk.openadsdk.MxO.Td.EYQ().mZx().mZx();
        pmMZx.EYQ(str);
        pmMZx.EYQ(jSONObject);
        pmMZx.EYQ(new com.bytedance.sdk.component.IPb.EYQ.EYQ() { // from class: com.bytedance.sdk.openadsdk.core.Uc.9
            @Override // com.bytedance.sdk.component.IPb.EYQ.EYQ
            public void EYQ(com.bytedance.sdk.component.IPb.mZx.Td td, IOException iOException) {
            }

            @Override // com.bytedance.sdk.component.IPb.EYQ.EYQ
            public void EYQ(com.bytedance.sdk.component.IPb.mZx.Td td, com.bytedance.sdk.component.IPb.mZx mzx) {
                mzx.Pm();
            }
        });
    }

    public static JSONArray mZx(String str) throws JSONException {
        try {
            Set<String> setMZx = com.bytedance.sdk.component.adexpress.EYQ.mZx.mZx.mZx(str);
            if (setMZx != null && setMZx.size() != 0) {
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it = setMZx.iterator();
                while (it.hasNext()) {
                    com.bytedance.sdk.component.adexpress.EYQ.Td.mZx mzxEYQ = com.bytedance.sdk.component.adexpress.EYQ.mZx.mZx.EYQ(it.next());
                    if (mzxEYQ != null) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("id", mzxEYQ.mZx());
                        jSONObject.put("md5", mzxEYQ.Td());
                        jSONArray.put(jSONObject);
                    }
                }
                return jSONArray;
            }
            return null;
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.pi.EYQ("NetApiImpl", "getParentTplIds: ", e);
            return null;
        }
    }

    public static JSONArray Td(String str) throws JSONException {
        try {
            Set<com.bytedance.sdk.openadsdk.core.ugen.EYQ.EYQ> setEYQ = com.bytedance.sdk.openadsdk.core.ugen.EYQ.mZx.EYQ().EYQ(str);
            if (setEYQ != null && setEYQ.size() != 0) {
                JSONArray jSONArray = new JSONArray();
                for (com.bytedance.sdk.openadsdk.core.ugen.EYQ.EYQ eyq : setEYQ) {
                    if (eyq != null) {
                        JSONObject jSONObject = new JSONObject();
                        String[] strArrSplit = eyq.EYQ().split("_");
                        if (strArrSplit.length == 2) {
                            jSONObject.put("id", strArrSplit[1]);
                            jSONObject.put("md5", eyq.mZx());
                            jSONArray.put(jSONObject);
                        }
                    }
                }
                return jSONArray;
            }
            return null;
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.pi.EYQ("NetApiImpl", "getUgenParentTplIds: ", e);
            return null;
        }
    }

    private byte[] Kbd(String str) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPOutputStream gZIPOutputStream;
        GZIPOutputStream gZIPOutputStream2 = null;
        if (str == null || str.length() == 0) {
            return null;
        }
        byte[] byteArray = new byte[0];
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    try {
                        gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    } catch (IOException e) {
                        e = e;
                    }
                } catch (Throwable th) {
                    th = th;
                }
            } catch (IOException e2) {
                com.bytedance.sdk.component.utils.pi.EYQ("NetApiImpl", e2.toString());
            }
            try {
                gZIPOutputStream.write(str.getBytes(m4.M));
                try {
                    gZIPOutputStream.close();
                } catch (IOException e3) {
                    com.bytedance.sdk.component.utils.pi.EYQ("NetApiImpl", e3.toString());
                }
                byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
            } catch (IOException e4) {
                e = e4;
                gZIPOutputStream2 = gZIPOutputStream;
                com.bytedance.sdk.component.utils.pi.EYQ("NetApiImpl", e.toString());
                if (gZIPOutputStream2 != null) {
                    try {
                        gZIPOutputStream2.close();
                    } catch (IOException e5) {
                        com.bytedance.sdk.component.utils.pi.EYQ("NetApiImpl", e5.toString());
                    }
                }
                if (byteArrayOutputStream != null) {
                    byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                }
                return byteArray;
            } catch (Throwable th2) {
                th = th2;
                gZIPOutputStream2 = gZIPOutputStream;
                if (gZIPOutputStream2 != null) {
                    try {
                        gZIPOutputStream2.close();
                    } catch (IOException e6) {
                        com.bytedance.sdk.component.utils.pi.EYQ("NetApiImpl", e6.toString());
                    }
                }
                if (byteArrayOutputStream != null) {
                    byteArrayOutputStream.toByteArray();
                    try {
                        byteArrayOutputStream.close();
                        throw th;
                    } catch (IOException e7) {
                        com.bytedance.sdk.component.utils.pi.EYQ("NetApiImpl", e7.toString());
                        throw th;
                    }
                }
                throw th;
            }
        } catch (IOException e8) {
            e = e8;
            byteArrayOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
        }
        return byteArray;
    }
}
