package com.bytedance.sdk.openadsdk.mZx.Pm.EYQ;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bykv.vk.openvk.component.video.api.Td.Td;
import com.bykv.vk.openvk.component.video.api.Td.mZx;
import com.bytedance.sdk.component.utils.pi;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.mZx.Pm.mZx.HX;
import com.bytedance.sdk.openadsdk.mZx.Pm.mZx.IPb;
import com.bytedance.sdk.openadsdk.mZx.Pm.mZx.KO;
import com.bytedance.sdk.openadsdk.mZx.Pm.mZx.Kbd;
import com.bytedance.sdk.openadsdk.mZx.Pm.mZx.Pm;
import com.bytedance.sdk.openadsdk.mZx.Pm.mZx.QQ;
import com.bytedance.sdk.openadsdk.mZx.Pm.mZx.nWX;
import com.bytedance.sdk.openadsdk.mZx.Pm.mZx.tp;
import com.bytedance.sdk.openadsdk.mZx.VwS;
import com.bytedance.sdk.openadsdk.utils.FH;
import com.bytedance.sdk.openadsdk.utils.hYh;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: VideoEventManager.java */
/* loaded from: classes2.dex */
public class EYQ {
    private static final Map<com.bykv.vk.openvk.component.video.api.mZx.EYQ, KO> EYQ = Collections.synchronizedMap(new WeakHashMap());

    public static JSONObject EYQ(UB ub, String str, int i, Td td) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("session_id", str);
            }
            if (i > 0) {
                jSONObject.put("play_type", String.valueOf(i));
            }
            if (ub != null) {
                mZx mzxMN = ub.mN();
                if (mzxMN != null) {
                    jSONObject.put(CampaignEx.JSON_KEY_VIDEO_RESOLUTION, mzxMN.HX());
                    jSONObject.put(CampaignEx.JSON_KEY_VIDEO_SIZE, Long.valueOf(mzxMN.Kbd()));
                    jSONObject.put(CampaignEx.JSON_KEY_VIDEO_URL, mzxMN.MxO());
                    jSONObject.put("player_type", td.KO());
                    jSONObject.put("video_encode_type", td.MxO() ? 1 : 0);
                }
                jSONObject.put("dp_creative_type", ub.CE());
            }
        } catch (JSONException e) {
            pi.EYQ("TTAD.VideoEventManager", "", e);
        }
        return jSONObject;
    }

    public static void EYQ(com.bytedance.sdk.openadsdk.mZx.Pm.mZx.EYQ<tp> eyq) {
        com.bytedance.sdk.openadsdk.tp.Td.EYQ("load_video_error", eyq);
    }

    public static void mZx(com.bytedance.sdk.openadsdk.mZx.Pm.mZx.EYQ<HX> eyq) {
        com.bytedance.sdk.openadsdk.tp.Td.EYQ("load_video_cancel", eyq);
    }

    public static void EYQ(UB ub, com.bykv.vk.openvk.component.video.api.mZx.EYQ eyq, Td td) throws JSONException {
        if (ub == null || eyq == null || td == null) {
            return;
        }
        String strEYQ = hYh.EYQ();
        int i = CacheDirFactory.getICacheDir(ub.Cia()).EYQ(td) ? 1 : 2;
        EYQ.put(eyq, new KO(SystemClock.elapsedRealtime(), strEYQ, i, td, ub));
        JSONObject jSONObjectEYQ = EYQ(ub, strEYQ, i, td);
        String strEYQ2 = FH.EYQ(ub);
        if (td.Pm > 0) {
            try {
                jSONObjectEYQ.put("play_time", td.Pm);
            } catch (JSONException e) {
                pi.EYQ("TTAD.VideoEventManager", "", e);
            }
        }
        com.bytedance.sdk.openadsdk.mZx.Pm.mZx.EYQ eyq2 = new com.bytedance.sdk.openadsdk.mZx.Pm.mZx.EYQ(ub, strEYQ2, jSONObjectEYQ, null);
        eyq2.EYQ(td.KO() == -1);
        EYQ(eyq2, "play_start");
    }

    public static void EYQ(Context context, com.bykv.vk.openvk.component.video.api.mZx.EYQ eyq, KO.EYQ eyq2, VwS vwS) throws JSONException {
        KO ko;
        if (context == null || eyq == null || eyq2 == null || (ko = EYQ.get(eyq)) == null) {
            return;
        }
        Td tdPm = ko.Pm();
        UB ubKbd = ko.Kbd();
        if (tdPm == null || ubKbd == null) {
            return;
        }
        if (!eyq2.tp()) {
            EYQ(ubKbd, tdPm, eyq2);
        }
        QQ qq = new QQ();
        qq.EYQ(eyq2.MxO() ? 1 : 0);
        qq.mZx(CacheDirFactory.getICacheDir(ubKbd.Cia()).mZx(tdPm));
        qq.EYQ(SystemClock.elapsedRealtime() - ko.EYQ());
        JSONObject jSONObjectEYQ = EYQ(ubKbd, ko.mZx(), ko.Td(), tdPm);
        if (tdPm.Pm > 0) {
            try {
                jSONObjectEYQ.put("play_time", tdPm.Pm);
            } catch (JSONException e) {
                pi.EYQ("TTAD.VideoEventManager", "", e);
            }
        }
        com.bytedance.sdk.openadsdk.mZx.Pm.mZx.EYQ eyq3 = new com.bytedance.sdk.openadsdk.mZx.Pm.mZx.EYQ(ubKbd, FH.EYQ(ubKbd), jSONObjectEYQ, qq);
        eyq3.EYQ(eyq2.tp());
        EYQ(eyq3, "feed_play", vwS);
    }

    public static void EYQ(com.bykv.vk.openvk.component.video.api.mZx.EYQ eyq, KO.EYQ eyq2) throws JSONException {
        KO ko;
        if (eyq == null || eyq2 == null || (ko = EYQ.get(eyq)) == null) {
            return;
        }
        Td tdPm = ko.Pm();
        UB ubKbd = ko.Kbd();
        if (tdPm == null || ubKbd == null) {
            return;
        }
        long jEYQ = eyq2.EYQ();
        long jTd = eyq2.Td();
        if (jTd <= 0 || jEYQ <= 0) {
            return;
        }
        com.bytedance.sdk.openadsdk.mZx.Pm.mZx.VwS vwS = new com.bytedance.sdk.openadsdk.mZx.Pm.mZx.VwS();
        vwS.EYQ(eyq2.mZx());
        vwS.mZx(jTd);
        JSONObject jSONObjectEYQ = EYQ(ubKbd, ko.mZx(), ko.Td(), tdPm);
        if (tdPm.Pm > 0) {
            try {
                jSONObjectEYQ.put("play_time", tdPm.Pm);
            } catch (JSONException e) {
                pi.EYQ("TTAD.VideoEventManager", "", e);
            }
        }
        com.bytedance.sdk.openadsdk.mZx.Pm.mZx.EYQ eyq3 = new com.bytedance.sdk.openadsdk.mZx.Pm.mZx.EYQ(ubKbd, FH.EYQ(ubKbd), jSONObjectEYQ, vwS);
        eyq3.EYQ(eyq2.tp());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", jEYQ);
            jSONObject.put("percent", eyq2.IPb());
            EYQ(eyq3, "feed_pause", jSONObject);
        } catch (JSONException e2) {
            pi.EYQ("TTAD.VideoEventManager", "", e2);
        }
    }

    public static void mZx(com.bykv.vk.openvk.component.video.api.mZx.EYQ eyq, KO.EYQ eyq2) throws JSONException {
        KO ko;
        if (eyq == null || eyq2 == null || (ko = EYQ.get(eyq)) == null) {
            return;
        }
        Td tdPm = ko.Pm();
        UB ubKbd = ko.Kbd();
        if (tdPm == null || ubKbd == null) {
            return;
        }
        long jEYQ = eyq2.EYQ();
        long jTd = eyq2.Td();
        if (jTd <= 0 || jEYQ <= 0) {
            return;
        }
        Kbd kbd = new Kbd();
        kbd.EYQ(eyq2.mZx());
        kbd.mZx(jTd);
        JSONObject jSONObjectEYQ = EYQ(ubKbd, ko.mZx(), ko.Td(), tdPm);
        if (tdPm.Pm > 0) {
            try {
                jSONObjectEYQ.put("play_time", tdPm.Pm);
            } catch (JSONException e) {
                pi.EYQ("TTAD.VideoEventManager", "", e);
            }
        }
        com.bytedance.sdk.openadsdk.mZx.Pm.mZx.EYQ eyq3 = new com.bytedance.sdk.openadsdk.mZx.Pm.mZx.EYQ(ubKbd, FH.EYQ(ubKbd), jSONObjectEYQ, kbd);
        eyq3.EYQ(eyq2.tp());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", jEYQ);
            jSONObject.put("percent", eyq2.IPb());
            EYQ(eyq3, "feed_continue", jSONObject);
        } catch (JSONException e2) {
            pi.EYQ("TTAD.VideoEventManager", "", e2);
        }
    }

    public static void Td(com.bykv.vk.openvk.component.video.api.mZx.EYQ eyq, KO.EYQ eyq2) throws JSONException {
        KO ko;
        if (eyq == null || eyq2 == null || (ko = EYQ.get(eyq)) == null) {
            return;
        }
        Td tdPm = ko.Pm();
        UB ubKbd = ko.Kbd();
        if (tdPm == null || ubKbd == null) {
            return;
        }
        long jEYQ = eyq2.EYQ();
        long jTd = eyq2.Td();
        nWX nwx = new nWX(eyq2.tsL());
        nwx.EYQ(eyq2.mZx());
        nwx.mZx(jTd);
        JSONObject jSONObjectEYQ = EYQ(ubKbd, ko.mZx(), ko.Td(), tdPm);
        if (tdPm.Pm > 0) {
            try {
                jSONObjectEYQ.put("play_time", tdPm.Pm);
            } catch (JSONException e) {
                pi.EYQ("TTAD.VideoEventManager", "", e);
            }
        }
        com.bytedance.sdk.openadsdk.mZx.Pm.mZx.EYQ eyq3 = new com.bytedance.sdk.openadsdk.mZx.Pm.mZx.EYQ(ubKbd, FH.EYQ(ubKbd), jSONObjectEYQ, nwx);
        eyq3.EYQ(eyq2.tp());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", jEYQ);
            jSONObject.put("percent", eyq2.IPb());
            EYQ(eyq3, "play_error", jSONObject);
        } catch (JSONException e2) {
            pi.EYQ("TTAD.VideoEventManager", "", e2);
        }
        EYQ.remove(eyq);
    }

    public static void Pm(com.bykv.vk.openvk.component.video.api.mZx.EYQ eyq, KO.EYQ eyq2) throws JSONException {
        KO ko;
        if (eyq == null || eyq2 == null || (ko = EYQ.get(eyq)) == null) {
            return;
        }
        Td tdPm = ko.Pm();
        UB ubKbd = ko.Kbd();
        if (tdPm == null || ubKbd == null) {
            return;
        }
        long jEYQ = eyq2.EYQ();
        long jTd = eyq2.Td();
        com.bytedance.sdk.openadsdk.mZx.Pm.mZx.mZx mzx = new com.bytedance.sdk.openadsdk.mZx.Pm.mZx.mZx();
        mzx.EYQ(eyq2.mZx());
        mzx.mZx(jTd);
        mzx.EYQ(eyq2.Pm());
        mzx.mZx(eyq2.Kbd());
        com.bytedance.sdk.openadsdk.mZx.Pm.mZx.EYQ eyq3 = new com.bytedance.sdk.openadsdk.mZx.Pm.mZx.EYQ(ubKbd, FH.EYQ(ubKbd), EYQ(ubKbd, ko.mZx(), ko.Td(), tdPm), mzx);
        eyq3.EYQ(eyq2.tp());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", jEYQ);
            jSONObject.put("percent", eyq2.IPb());
            EYQ(eyq3, "endcard_skip", jSONObject);
        } catch (JSONException e) {
            pi.EYQ("TTAD.VideoEventManager", "", e);
        }
    }

    public static void EYQ(com.bykv.vk.openvk.component.video.api.mZx.EYQ eyq, KO.EYQ eyq2, VwS vwS) {
        KO ko;
        if (eyq == null || eyq2 == null || (ko = EYQ.get(eyq)) == null) {
            return;
        }
        Td tdPm = ko.Pm();
        UB ubKbd = ko.Kbd();
        if (tdPm == null || ubKbd == null) {
            return;
        }
        long jEYQ = eyq2.EYQ();
        long jTd = eyq2.Td();
        Pm pm = new Pm();
        pm.mZx(eyq2.mZx());
        pm.EYQ(jTd);
        pm.EYQ(eyq2.VwS());
        pm.mZx(eyq2.QQ());
        JSONObject jSONObjectEYQ = EYQ(ubKbd, ko.mZx(), ko.Td(), tdPm);
        if (tdPm.Pm > 0) {
            try {
                jSONObjectEYQ.put("play_time", tdPm.Pm);
            } catch (JSONException e) {
                pi.EYQ("TTAD.VideoEventManager", "", e);
            }
        }
        com.bytedance.sdk.openadsdk.mZx.Pm.mZx.EYQ eyq3 = new com.bytedance.sdk.openadsdk.mZx.Pm.mZx.EYQ(ubKbd, FH.EYQ(ubKbd), jSONObjectEYQ, pm);
        eyq3.EYQ(eyq2.tp());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", jEYQ);
            jSONObject.put("percent", eyq2.IPb());
            EYQ(eyq3, "feed_break", jSONObject, vwS);
        } catch (JSONException e2) {
            pi.EYQ("TTAD.VideoEventManager", "", e2);
        }
    }

    public static void mZx(com.bykv.vk.openvk.component.video.api.mZx.EYQ eyq, KO.EYQ eyq2, VwS vwS) throws JSONException {
        if (eyq == null || eyq2 == null) {
            return;
        }
        Kbd(eyq, eyq2);
        KO ko = EYQ.get(eyq);
        if (ko == null) {
            return;
        }
        Td tdPm = ko.Pm();
        UB ubKbd = ko.Kbd();
        if (tdPm == null || ubKbd == null) {
            return;
        }
        long jEYQ = eyq2.EYQ();
        long jTd = eyq2.Td();
        IPb iPb = new IPb();
        iPb.mZx(eyq2.mZx());
        iPb.EYQ(jTd);
        iPb.EYQ(eyq2.QQ());
        JSONObject jSONObjectEYQ = EYQ(ubKbd, ko.mZx(), ko.Td(), tdPm);
        if (tdPm.Pm > 0) {
            try {
                jSONObjectEYQ.put("play_time", tdPm.Pm);
            } catch (JSONException e) {
                pi.EYQ("TTAD.VideoEventManager", "", e);
            }
        }
        com.bytedance.sdk.openadsdk.mZx.Pm.mZx.EYQ eyq3 = new com.bytedance.sdk.openadsdk.mZx.Pm.mZx.EYQ(ubKbd, FH.EYQ(ubKbd), jSONObjectEYQ, iPb);
        eyq3.EYQ(eyq2.tp());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", jEYQ);
            jSONObject.put("percent", eyq2.IPb());
            EYQ(eyq3, "feed_over", jSONObject, vwS);
        } catch (JSONException e2) {
            pi.EYQ("TTAD.VideoEventManager", "", e2);
        }
        EYQ.remove(eyq);
    }

    public static void Kbd(com.bykv.vk.openvk.component.video.api.mZx.EYQ eyq, KO.EYQ eyq2) throws JSONException {
        KO ko;
        if (eyq == null || eyq2 == null || eyq2.HX() <= 0 || (ko = EYQ.get(eyq)) == null) {
            return;
        }
        Td tdPm = ko.Pm();
        UB ubKbd = ko.Kbd();
        if (tdPm == null || ubKbd == null) {
            return;
        }
        long jTd = eyq2.Td();
        com.bytedance.sdk.openadsdk.mZx.Pm.mZx.pi piVar = new com.bytedance.sdk.openadsdk.mZx.Pm.mZx.pi();
        piVar.EYQ(eyq2.mZx());
        piVar.mZx(jTd);
        piVar.EYQ(eyq2.HX());
        JSONObject jSONObjectEYQ = EYQ(ubKbd, ko.mZx(), ko.Td(), tdPm);
        if (tdPm.Pm > 0) {
            try {
                jSONObjectEYQ.put("play_time", tdPm.Pm);
            } catch (JSONException e) {
                pi.EYQ("TTAD.VideoEventManager", "", e);
            }
        }
        com.bytedance.sdk.openadsdk.mZx.Pm.mZx.EYQ eyq3 = new com.bytedance.sdk.openadsdk.mZx.Pm.mZx.EYQ(ubKbd, FH.EYQ(ubKbd), jSONObjectEYQ, piVar);
        eyq3.EYQ(eyq2.tp());
        EYQ(eyq3, "play_buffer");
    }

    private static void EYQ(com.bytedance.sdk.openadsdk.mZx.Pm.mZx.EYQ eyq, String str) {
        EYQ(eyq, str, (JSONObject) null, (VwS) null);
    }

    private static void EYQ(com.bytedance.sdk.openadsdk.mZx.Pm.mZx.EYQ eyq, String str, JSONObject jSONObject) {
        EYQ(eyq, str, jSONObject, (VwS) null);
    }

    private static void EYQ(com.bytedance.sdk.openadsdk.mZx.Pm.mZx.EYQ eyq, String str, VwS vwS) {
        EYQ(eyq, str, (JSONObject) null, vwS);
    }

    private static void EYQ(final com.bytedance.sdk.openadsdk.mZx.Pm.mZx.EYQ eyq, String str, JSONObject jSONObject, final VwS vwS) {
        if (eyq == null) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        JSONObject jSONObject2 = jSONObject;
        if (eyq.Kbd() && !TextUtils.isEmpty(eyq.mZx())) {
            String strMZx = eyq.mZx();
            strMZx.hashCode();
            if (strMZx.equals("stream") || strMZx.equals("embeded_ad")) {
                str = "customer_".concat(String.valueOf(str));
            }
        }
        final String str2 = str;
        com.bytedance.sdk.openadsdk.mZx.Td.EYQ(System.currentTimeMillis(), eyq.EYQ(), eyq.mZx(), str2, jSONObject2, vwS, new com.bytedance.sdk.openadsdk.mZx.mZx.EYQ() { // from class: com.bytedance.sdk.openadsdk.mZx.Pm.EYQ.EYQ.1
            @Override // com.bytedance.sdk.openadsdk.mZx.mZx.EYQ
            public void EYQ(JSONObject jSONObject3) throws JSONException {
                VwS vwS2;
                JSONObject jSONObjectTd = eyq.Td();
                if (eyq.Pm() != null) {
                    eyq.Pm().EYQ(jSONObjectTd);
                }
                if (("feed_play".equals(str2) || "feed_over".equals(str2) || "feed_break".equals(str2)) && (vwS2 = vwS) != null) {
                    vwS2.EYQ(jSONObjectTd);
                }
                jSONObject3.put("ad_extra_data", jSONObjectTd.toString());
            }
        });
    }

    private static void EYQ(final UB ub, final Td td, final KO.EYQ eyq) {
        com.bytedance.sdk.openadsdk.tp.Td.EYQ();
        com.bytedance.sdk.openadsdk.tp.Td.EYQ("pangle_video_play_state", false, new com.bytedance.sdk.openadsdk.tp.mZx() { // from class: com.bytedance.sdk.openadsdk.mZx.Pm.EYQ.EYQ.2
            @Override // com.bytedance.sdk.openadsdk.tp.mZx
            public com.bytedance.sdk.openadsdk.tp.EYQ.mZx getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("service_duration", EYQ.Td(td));
                jSONObject.put("player_duration", eyq.Td());
                jSONObject.put("cache_path_type", CacheDirFactory.getCacheType());
                jSONObject.put("url", td.pi());
                jSONObject.put("path", EYQ.Pm(td));
                jSONObject.put("player_type", td.KO());
                com.bytedance.sdk.openadsdk.tp.EYQ.Td tdEYQ = com.bytedance.sdk.openadsdk.tp.EYQ.Td.mZx().EYQ("pangle_video_play_state");
                UB ub2 = ub;
                return tdEYQ.EYQ(ub2 != null ? ub2.KvC() : 0).mZx(jSONObject.toString());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long Td(Td td) {
        if (td == null) {
            return 0L;
        }
        mZx mzxWU = td.MxO() ? td.WU() : td.zF();
        if (mzxWU != null) {
            return Double.valueOf(mzxWU.IPb() * 1000.0d).longValue();
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String Pm(Td td) {
        return new File(td.mZx(), td.nWX()).getAbsolutePath();
    }
}
