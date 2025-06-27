package com.bytedance.sdk.openadsdk.core.VwS;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.core.VwS.mZx.EYQ;
import com.bytedance.sdk.openadsdk.core.VwS.mZx.Td;
import com.bytedance.sdk.openadsdk.core.VwS.mZx.mZx;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: VideoTrackers.java */
/* loaded from: classes2.dex */
public class Pm {
    private UB UB;
    private boolean Uc;
    private String WU;
    private boolean hYh;
    private long hu;
    private final EYQ pi;
    private boolean zF;
    public List<com.bytedance.sdk.openadsdk.core.VwS.mZx.Td> EYQ = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.VwS.mZx.Td> mZx = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.VwS.mZx.Td> Td = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.VwS.mZx.Td> Pm = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.VwS.mZx.Td> Kbd = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.VwS.mZx.Td> IPb = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.VwS.mZx.Td> VwS = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.VwS.mZx.Td> QQ = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.VwS.mZx.Td> HX = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.VwS.mZx.Td> tp = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.VwS.mZx.mZx> MxO = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.VwS.mZx.EYQ> tsL = new ArrayList();
    private final AtomicBoolean nWX = new AtomicBoolean(false);
    private final AtomicBoolean KO = new AtomicBoolean(false);

    public Pm(EYQ eyq) {
        this.pi = eyq;
    }

    public void EYQ(com.bytedance.sdk.openadsdk.core.VwS.EYQ.EYQ eyq) {
        EYQ(-1L, this.EYQ, eyq);
    }

    public void EYQ(long j) {
        if (this.nWX.compareAndSet(false, true)) {
            EYQ(j, this.mZx, null, new Td.mZx("show_impression", this.UB));
        }
    }

    public void mZx(long j) {
        EYQ(j, this.Td, (com.bytedance.sdk.openadsdk.core.VwS.EYQ.EYQ) null);
    }

    public void Td(long j) {
        EYQ(j, this.Pm, (com.bytedance.sdk.openadsdk.core.VwS.EYQ.EYQ) null);
    }

    public void Pm(long j) {
        EYQ(j, this.Kbd, null, new Td.mZx("video_progress", this.UB, 1.0f));
    }

    public void Kbd(long j) {
        if (this.KO.compareAndSet(false, true)) {
            EYQ(j, this.IPb, (com.bytedance.sdk.openadsdk.core.VwS.EYQ.EYQ) null);
        }
    }

    public void IPb(long j) {
        EYQ(j, this.VwS, (com.bytedance.sdk.openadsdk.core.VwS.EYQ.EYQ) null);
    }

    public void VwS(long j) {
        EYQ(j, this.QQ, null, new Td.mZx(CampaignEx.JSON_NATIVE_VIDEO_CLICK, this.UB));
    }

    public void QQ(long j) {
        EYQ(j, this.HX, (com.bytedance.sdk.openadsdk.core.VwS.EYQ.EYQ) null);
    }

    public void HX(long j) {
        EYQ(j, this.tp, (com.bytedance.sdk.openadsdk.core.VwS.EYQ.EYQ) null);
    }

    public void EYQ(long j, long j2, IPb iPb) {
        if (System.currentTimeMillis() - this.hu >= 1000 && j >= 0 && j2 > 0) {
            this.hu = System.currentTimeMillis();
            float f = j / j2;
            List<com.bytedance.sdk.openadsdk.core.VwS.mZx.Td> listEYQ = EYQ(j, f);
            if (f >= 0.25f && !this.Uc) {
                mZx("firstQuartile");
                this.Uc = true;
                if (iPb != null) {
                    EYQ(iPb, 6);
                }
                f = 0.25f;
            } else if (f >= 0.5f && !this.hYh) {
                mZx(CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT);
                this.hYh = true;
                if (iPb != null) {
                    EYQ(iPb, 7);
                }
                f = 0.5f;
            } else if (f >= 0.75f && !this.zF) {
                mZx("thirdQuartile");
                this.zF = true;
                if (iPb != null) {
                    EYQ(iPb, 8);
                }
                f = 0.75f;
            }
            if (f < 0.03f) {
                f = 0.0f;
            }
            EYQ(j, listEYQ, null, new Td.mZx("video_progress", this.UB, f));
        }
    }

    private void EYQ(final IPb iPb, final int i) {
        com.bytedance.sdk.component.utils.QQ.mZx().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.VwS.Pm.1
            @Override // java.lang.Runnable
            public void run() {
                IPb iPb2 = iPb;
                if (iPb2 != null) {
                    iPb2.EYQ(i);
                }
            }
        });
    }

    private void mZx(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(NotificationCompat.CATEGORY_EVENT, str);
            com.bytedance.sdk.openadsdk.mZx.Td.mZx(this.UB, this.WU, "vast_play_track", jSONObject);
        } catch (Throwable unused) {
        }
    }

    private void EYQ(long j, List<com.bytedance.sdk.openadsdk.core.VwS.mZx.Td> list, com.bytedance.sdk.openadsdk.core.VwS.EYQ.EYQ eyq, Td.mZx mzx) {
        EYQ eyq2 = this.pi;
        com.bytedance.sdk.openadsdk.core.VwS.mZx.Td.EYQ(list, eyq, j, eyq2 != null ? eyq2.VwS() : null, mzx);
    }

    private void EYQ(long j, List<com.bytedance.sdk.openadsdk.core.VwS.mZx.Td> list, com.bytedance.sdk.openadsdk.core.VwS.EYQ.EYQ eyq) {
        EYQ(j, list, eyq, null);
    }

    public List<com.bytedance.sdk.openadsdk.core.VwS.mZx.Td> EYQ(long j, float f) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.MxO.size(); i++) {
            com.bytedance.sdk.openadsdk.core.VwS.mZx.mZx mzx = this.MxO.get(i);
            if (mzx.EYQ(f)) {
                arrayList.add(mzx);
            }
        }
        for (int i2 = 0; i2 < this.tsL.size(); i2++) {
            com.bytedance.sdk.openadsdk.core.VwS.mZx.EYQ eyq = this.tsL.get(i2);
            if (eyq.EYQ(j)) {
                arrayList.add(eyq);
            }
        }
        return arrayList;
    }

    public void EYQ(List<com.bytedance.sdk.openadsdk.core.VwS.mZx.Td> list) {
        this.mZx.addAll(list);
    }

    public void mZx(List<com.bytedance.sdk.openadsdk.core.VwS.mZx.Td> list) {
        this.Td.addAll(list);
    }

    public void Td(List<com.bytedance.sdk.openadsdk.core.VwS.mZx.Td> list) {
        this.Pm.addAll(list);
    }

    public void Pm(List<com.bytedance.sdk.openadsdk.core.VwS.mZx.Td> list) {
        this.Kbd.addAll(list);
    }

    public void Kbd(List<com.bytedance.sdk.openadsdk.core.VwS.mZx.Td> list) {
        this.IPb.addAll(list);
    }

    public void IPb(List<com.bytedance.sdk.openadsdk.core.VwS.mZx.Td> list) {
        this.VwS.addAll(list);
    }

    public void VwS(List<com.bytedance.sdk.openadsdk.core.VwS.mZx.Td> list) {
        this.QQ.addAll(list);
    }

    public void QQ(List<com.bytedance.sdk.openadsdk.core.VwS.mZx.mZx> list) {
        this.MxO.addAll(list);
        Collections.sort(this.MxO);
    }

    public void HX(List<com.bytedance.sdk.openadsdk.core.VwS.mZx.EYQ> list) {
        this.tsL.addAll(list);
        Collections.sort(this.tsL);
    }

    public void tp(List<com.bytedance.sdk.openadsdk.core.VwS.mZx.Td> list) {
        this.EYQ.addAll(list);
    }

    public void MxO(List<com.bytedance.sdk.openadsdk.core.VwS.mZx.Td> list) {
        this.HX.addAll(list);
    }

    public void tsL(List<com.bytedance.sdk.openadsdk.core.VwS.mZx.Td> list) {
        this.tp.addAll(list);
    }

    public JSONObject EYQ() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorTrackers", com.bytedance.sdk.openadsdk.core.VwS.mZx.Td.EYQ(this.EYQ));
        jSONObject.put("impressionTrackers", com.bytedance.sdk.openadsdk.core.VwS.mZx.Td.EYQ(this.mZx));
        jSONObject.put("pauseTrackers", com.bytedance.sdk.openadsdk.core.VwS.mZx.Td.EYQ(this.Td));
        jSONObject.put("resumeTrackers", com.bytedance.sdk.openadsdk.core.VwS.mZx.Td.EYQ(this.Pm));
        jSONObject.put("completeTrackers", com.bytedance.sdk.openadsdk.core.VwS.mZx.Td.EYQ(this.Kbd));
        jSONObject.put("closeTrackers", com.bytedance.sdk.openadsdk.core.VwS.mZx.Td.EYQ(this.IPb));
        jSONObject.put("skipTrackers", com.bytedance.sdk.openadsdk.core.VwS.mZx.Td.EYQ(this.VwS));
        jSONObject.put("clickTrackers", com.bytedance.sdk.openadsdk.core.VwS.mZx.Td.EYQ(this.QQ));
        jSONObject.put("muteTrackers", com.bytedance.sdk.openadsdk.core.VwS.mZx.Td.EYQ(this.HX));
        jSONObject.put("unMuteTrackers", com.bytedance.sdk.openadsdk.core.VwS.mZx.Td.EYQ(this.tp));
        jSONObject.put("fractionalTrackers", mZx());
        jSONObject.put("absoluteTrackers", Td());
        return jSONObject;
    }

    private JSONArray mZx() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Iterator<com.bytedance.sdk.openadsdk.core.VwS.mZx.mZx> it = this.MxO.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().mZx());
        }
        return jSONArray;
    }

    private JSONArray Td() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Iterator<com.bytedance.sdk.openadsdk.core.VwS.mZx.EYQ> it = this.tsL.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().EYQ());
        }
        return jSONArray;
    }

    public void EYQ(JSONObject jSONObject) {
        tp(com.bytedance.sdk.openadsdk.core.VwS.mZx.Td.EYQ(jSONObject.optJSONArray("errorTrackers")));
        EYQ(com.bytedance.sdk.openadsdk.core.VwS.mZx.Td.EYQ(jSONObject.optJSONArray("impressionTrackers")));
        mZx(com.bytedance.sdk.openadsdk.core.VwS.mZx.Td.EYQ(jSONObject.optJSONArray("pauseTrackers"), true));
        Td(com.bytedance.sdk.openadsdk.core.VwS.mZx.Td.EYQ(jSONObject.optJSONArray("resumeTrackers"), true));
        Pm(com.bytedance.sdk.openadsdk.core.VwS.mZx.Td.EYQ(jSONObject.optJSONArray("completeTrackers")));
        Kbd(com.bytedance.sdk.openadsdk.core.VwS.mZx.Td.EYQ(jSONObject.optJSONArray("closeTrackers")));
        IPb(com.bytedance.sdk.openadsdk.core.VwS.mZx.Td.EYQ(jSONObject.optJSONArray("skipTrackers")));
        VwS(com.bytedance.sdk.openadsdk.core.VwS.mZx.Td.EYQ(jSONObject.optJSONArray("clickTrackers")));
        MxO(com.bytedance.sdk.openadsdk.core.VwS.mZx.Td.EYQ(jSONObject.optJSONArray("muteTrackers"), true));
        tsL(com.bytedance.sdk.openadsdk.core.VwS.mZx.Td.EYQ(jSONObject.optJSONArray("unMuteTrackers"), true));
        QQ(com.bytedance.sdk.openadsdk.core.VwS.mZx.Td.mZx(jSONObject.optJSONArray("fractionalTrackers")));
        HX(com.bytedance.sdk.openadsdk.core.VwS.mZx.Td.Td(jSONObject.optJSONArray("absoluteTrackers")));
    }

    public void EYQ(UB ub) {
        this.UB = ub;
    }

    public void EYQ(String str) {
        this.WU = str;
    }

    public void EYQ(String str, long j) {
        if (TextUtils.isEmpty(str) || j < 0) {
            return;
        }
        HX(Collections.singletonList(new EYQ.C0112EYQ(str, j).EYQ()));
    }

    public void EYQ(String str, float f) {
        if (TextUtils.isEmpty(str) || f < 0.0f) {
            return;
        }
        QQ(Collections.singletonList(new mZx.EYQ(str, f).EYQ()));
    }

    public void EYQ(Pm pm) {
        tp(pm.EYQ);
        EYQ(pm.mZx);
        mZx(pm.Td);
        Td(pm.Pm);
        Pm(pm.Kbd);
        Kbd(pm.IPb);
        IPb(pm.VwS);
        VwS(pm.QQ);
        MxO(pm.HX);
        tsL(pm.tp);
        QQ(pm.MxO);
        HX(pm.tsL);
    }
}
