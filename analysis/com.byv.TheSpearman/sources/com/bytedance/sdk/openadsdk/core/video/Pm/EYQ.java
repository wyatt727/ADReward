package com.bytedance.sdk.openadsdk.core.video.Pm;

import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bykv.vk.openvk.component.video.api.Kbd.EYQ;
import com.bykv.vk.openvk.component.video.api.Td.Td;
import com.bytedance.sdk.component.mZx.EYQ.VwS;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.mZx.Pm.mZx.HX;
import com.bytedance.sdk.openadsdk.mZx.Pm.mZx.MxO;
import com.bytedance.sdk.openadsdk.mZx.Pm.mZx.tp;
import com.bytedance.sdk.openadsdk.mZx.Pm.mZx.tsL;
import com.bytedance.sdk.openadsdk.utils.FH;
import org.json.JSONObject;

/* compiled from: VideoPreloadFactory.java */
/* loaded from: classes2.dex */
public class EYQ {
    public static final com.bykv.vk.openvk.component.video.api.Kbd.EYQ EYQ = new com.bykv.vk.openvk.component.video.EYQ.EYQ.mZx.EYQ();

    public static void EYQ(final Td td, final EYQ.InterfaceC0064EYQ interfaceC0064EYQ) {
        AdSlot adSlot;
        if ((td.Td() > 0 || td.tp()) && td.KO() != -2) {
            if (td.KO() != 1) {
                td.Pm(6000);
                td.Kbd(6000);
                td.IPb(6000);
                boolean z = td.Kbd("material_meta") != null && (td.Kbd("material_meta") instanceof UB);
                boolean z2 = td.Kbd("ad_slot") != null && (td.Kbd("ad_slot") instanceof AdSlot);
                UB ub = null;
                if (z && z2) {
                    ub = (UB) td.Kbd("material_meta");
                    adSlot = (AdSlot) td.Kbd("ad_slot");
                    mZx(td, ub, adSlot);
                } else {
                    adSlot = null;
                }
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                final UB ub2 = ub;
                final AdSlot adSlot2 = adSlot;
                EYQ.InterfaceC0064EYQ interfaceC0064EYQ2 = new EYQ.InterfaceC0064EYQ() { // from class: com.bytedance.sdk.openadsdk.core.video.Pm.EYQ.1
                    @Override // com.bykv.vk.openvk.component.video.api.Kbd.EYQ.InterfaceC0064EYQ
                    public void EYQ(Td td2, int i) {
                        EYQ.InterfaceC0064EYQ interfaceC0064EYQ3 = interfaceC0064EYQ;
                        if (interfaceC0064EYQ3 != null) {
                            interfaceC0064EYQ3.EYQ(td2, i);
                        }
                        if (ub2 == null || adSlot2 == null) {
                            return;
                        }
                        EYQ.mZx(td, ub2, adSlot2, SystemClock.elapsedRealtime() - jElapsedRealtime);
                    }

                    @Override // com.bykv.vk.openvk.component.video.api.Kbd.EYQ.InterfaceC0064EYQ
                    public void EYQ(Td td2, int i, String str) {
                        EYQ.InterfaceC0064EYQ interfaceC0064EYQ3 = interfaceC0064EYQ;
                        if (interfaceC0064EYQ3 != null) {
                            interfaceC0064EYQ3.EYQ(td2, i, str);
                        }
                        if (ub2 == null || adSlot2 == null) {
                            return;
                        }
                        EYQ.mZx(td, ub2, adSlot2, SystemClock.elapsedRealtime() - jElapsedRealtime, i, str);
                    }

                    @Override // com.bykv.vk.openvk.component.video.api.Kbd.EYQ.InterfaceC0064EYQ
                    public void mZx(Td td2, int i) {
                        AdSlot adSlot3;
                        EYQ.InterfaceC0064EYQ interfaceC0064EYQ3 = interfaceC0064EYQ;
                        if (interfaceC0064EYQ3 != null) {
                            interfaceC0064EYQ3.EYQ(td2, i);
                        }
                        UB ub3 = ub2;
                        if (ub3 != null && (adSlot3 = adSlot2) != null) {
                            EYQ.Td(td, ub3, adSlot3);
                        }
                        td.nWX();
                    }
                };
                if (!EYQ(td.pi())) {
                    if (interfaceC0064EYQ != null) {
                        interfaceC0064EYQ.EYQ(td, 404, "unexpected url: " + td.pi());
                    }
                    mZx(td, ub, adSlot, SystemClock.elapsedRealtime() - jElapsedRealtime, -1, "video url is invalid");
                    return;
                }
                if (Build.VERSION.SDK_INT >= 23) {
                    try {
                        EYQ.EYQ(hu.EYQ(), td, interfaceC0064EYQ2);
                        return;
                    } catch (Exception e) {
                        e.getMessage();
                        return;
                    }
                }
                com.bykv.vk.openvk.component.video.EYQ.mZx.IPb.EYQ.EYQ().EYQ(td);
                return;
            }
        }
        if (interfaceC0064EYQ != null) {
            interfaceC0064EYQ.EYQ(td, 100);
        }
    }

    private static boolean EYQ(Td td) {
        return Build.VERSION.SDK_INT >= 23 || td.KO() != 0;
    }

    private static void mZx(Td td, UB ub, AdSlot adSlot) {
        if (EYQ(td)) {
            com.bytedance.sdk.openadsdk.tp.Td.EYQ("load_video_start", new com.bytedance.sdk.openadsdk.mZx.Pm.mZx.EYQ(ub, FH.Td(adSlot.getDurationSlotType()), com.bytedance.sdk.openadsdk.mZx.Pm.EYQ.EYQ.EYQ(ub, (String) null, -1, td), new MxO(td.pi(), td.tp() ? td.HX() : td.Td())));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void mZx(Td td, UB ub, AdSlot adSlot, long j, int i, String str) {
        if (EYQ(td)) {
            String strTd = FH.Td(adSlot.getDurationSlotType());
            JSONObject jSONObjectEYQ = com.bytedance.sdk.openadsdk.mZx.Pm.EYQ.EYQ.EYQ(ub, (String) null, -1, td);
            tp tpVar = new tp();
            tpVar.EYQ(td.pi());
            tpVar.EYQ(td.Td());
            tpVar.mZx(j);
            tpVar.EYQ(i);
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            tpVar.mZx(str);
            tpVar.Td("");
            com.bytedance.sdk.openadsdk.mZx.Pm.EYQ.EYQ.EYQ((com.bytedance.sdk.openadsdk.mZx.Pm.mZx.EYQ<tp>) new com.bytedance.sdk.openadsdk.mZx.Pm.mZx.EYQ(ub, strTd, jSONObjectEYQ, tpVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void mZx(Td td, UB ub, AdSlot adSlot, long j) {
        if (EYQ(td)) {
            String strTd = FH.Td(adSlot.getDurationSlotType());
            JSONObject jSONObjectEYQ = com.bytedance.sdk.openadsdk.mZx.Pm.EYQ.EYQ.EYQ(ub, (String) null, -1, td);
            tsL tsl = new tsL();
            tsl.EYQ(td.pi());
            tsl.EYQ(td.Td());
            tsl.mZx(j);
            if (td.hYh() == 1) {
                tsl.Td(1L);
            } else {
                tsl.Td(0L);
            }
            com.bytedance.sdk.openadsdk.tp.Td.EYQ("load_video_success", new com.bytedance.sdk.openadsdk.mZx.Pm.mZx.EYQ(ub, strTd, jSONObjectEYQ, tsl));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void Td(Td td, UB ub, AdSlot adSlot) {
        if (EYQ(td)) {
            com.bytedance.sdk.openadsdk.mZx.Pm.EYQ.EYQ.mZx((com.bytedance.sdk.openadsdk.mZx.Pm.mZx.EYQ<HX>) new com.bytedance.sdk.openadsdk.mZx.Pm.mZx.EYQ(ub, FH.Td(adSlot.getDurationSlotType()), com.bytedance.sdk.openadsdk.mZx.Pm.EYQ.EYQ.EYQ(ub, (String) null, -1, td), new HX(td.pi(), td.Td())));
        }
    }

    public static boolean EYQ(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.regionMatches(true, 0, "ws:", 0, 3)) {
            str = "http:" + str.substring(3);
        } else if (str.regionMatches(true, 0, "wss:", 0, 4)) {
            str = "https:" + str.substring(4);
        }
        return VwS.Td(str) != null;
    }
}
