package com.bytedance.sdk.openadsdk.component.reward.EYQ;

import android.R;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.component.reward.EYQ.Pm;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.core.mZx.EYQ;
import com.bytedance.sdk.openadsdk.core.mZx.Td;
import com.bytedance.sdk.openadsdk.core.model.HX;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.core.model.Uc;
import com.bytedance.sdk.openadsdk.core.model.zF;
import com.bytedance.sdk.openadsdk.utils.tr;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: RewardFullReportManager.java */
/* loaded from: classes2.dex */
public class QQ {
    private final EYQ EYQ;
    private final com.bytedance.sdk.openadsdk.core.mZx.Kbd Td;
    private final View.OnClickListener mZx;

    public QQ(EYQ eyq) {
        this.EYQ = eyq;
        this.Td = new com.bytedance.sdk.openadsdk.core.mZx.Kbd(eyq.TZn, eyq.EYQ, eyq.VwS, eyq.IPb ? 7 : 5) { // from class: com.bytedance.sdk.openadsdk.component.reward.EYQ.QQ.1
            @Override // com.bytedance.sdk.openadsdk.core.mZx.Kbd
            public void EYQ(View view, float f, float f2, float f3, float f4, SparseArray<Td.EYQ> sparseArray, int i, int i2, int i3, boolean z) throws JSONException {
                if (QQ.this.EYQ.EYQ.oIw() && view != null) {
                    Object tag = view.getTag(570425345);
                    if (tag instanceof String) {
                        EYQ((String) tag);
                    }
                }
                HashMap map = new HashMap();
                map.put("duration", Long.valueOf(QQ.this.EYQ.FtN.VwS()));
                if (!QQ.this.EYQ.WU.get()) {
                    if (zF.MxO(QQ.this.EYQ.EYQ)) {
                        map.put("click_scence", 3);
                    } else {
                        map.put("click_scence", 1);
                    }
                } else {
                    map.put("click_scence", 2);
                }
                EYQ(map);
                QQ.this.EYQ.TZn.Uc();
                if (view.getId() == com.bytedance.sdk.openadsdk.utils.tp.wY && zF.MxO(QQ.this.EYQ.EYQ)) {
                    JSONObject jSONObject = new JSONObject();
                    if (QQ.this.EYQ.EYQ.mN() != null) {
                        try {
                            jSONObject.put("playable_url", QQ.this.EYQ.EYQ.mN().tsL());
                        } catch (JSONException e) {
                            com.bytedance.sdk.component.utils.pi.EYQ("TTAD.RFReportManager", "onRewardBarClick json error", e);
                        }
                    }
                    com.bytedance.sdk.openadsdk.mZx.Td.mZx(QQ.this.EYQ.EYQ, QQ.this.EYQ.VwS, "click_playable_download_button_loading", jSONObject);
                }
                QQ.this.EYQ.PI.EYQ(view, f, f2, f3, f4, sparseArray, i, i2, i3, new Pm.EYQ() { // from class: com.bytedance.sdk.openadsdk.component.reward.EYQ.QQ.1.1
                    @Override // com.bytedance.sdk.openadsdk.component.reward.EYQ.Pm.EYQ
                    public void EYQ(String str, JSONObject jSONObject2) throws JSONException {
                        QQ.this.EYQ(str, jSONObject2);
                    }

                    @Override // com.bytedance.sdk.openadsdk.component.reward.EYQ.Pm.EYQ
                    public void EYQ(View view2, float f5, float f6, float f7, float f8, SparseArray<Td.EYQ> sparseArray2, int i4, int i5, int i6) throws JSONException {
                        QQ.this.EYQ(view2, f5, f6, f7, f8, sparseArray2, i4, i5, i6);
                    }
                });
                com.bytedance.sdk.openadsdk.nWX.EYQ.Kbd.EYQ(QQ.this.EYQ.EYQ, 9);
            }
        };
        this.mZx = new com.bytedance.sdk.openadsdk.core.mZx.mZx(eyq.TZn, eyq.EYQ, eyq.VwS, eyq.IPb ? 7 : 5) { // from class: com.bytedance.sdk.openadsdk.component.reward.EYQ.QQ.2
            @Override // com.bytedance.sdk.openadsdk.core.mZx.mZx, com.bytedance.sdk.openadsdk.core.mZx.Td
            public void EYQ(View view, float f, float f2, float f3, float f4, SparseArray<Td.EYQ> sparseArray, boolean z) {
                try {
                    QQ.this.EYQ(view, f, f2, f3, f4, sparseArray, this.xt, this.rfB, this.lEs);
                } catch (Exception e) {
                    com.bytedance.sdk.component.utils.pi.EYQ("TTAD.RFReportManager", "onClickReport error :" + e.getMessage());
                }
                com.bytedance.sdk.openadsdk.nWX.EYQ.Kbd.EYQ(QQ.this.EYQ.EYQ, 9);
            }
        };
    }

    public void EYQ() {
        JSONObject jSONObject = new JSONObject();
        UB ub = this.EYQ.EYQ;
        if ((ub instanceof Uc) && ((Uc) ub).cOq()) {
            try {
                jSONObject.put("choose_one_ad_real_show", true);
            } catch (JSONException e) {
                com.bytedance.sdk.component.utils.pi.EYQ("TTAD.RFReportManager", "reportShow json error", e);
            }
        }
        if (this.EYQ.tPj.get() && com.bytedance.sdk.openadsdk.core.model.KO.Td(ub)) {
            return;
        }
        this.EYQ.tPj.set(true);
        com.bytedance.sdk.openadsdk.mZx.Td.EYQ(ub, this.EYQ.VwS, jSONObject);
        if (this.EYQ.TZn instanceof com.bytedance.sdk.openadsdk.core.video.Td.mZx) {
            this.EYQ.TZn.VwS();
        }
        com.bytedance.sdk.openadsdk.nWX.EYQ.Kbd.EYQ(this.EYQ.TZn.findViewById(R.id.content), ub, -1);
    }

    public void mZx() throws JSONException {
        if (this.EYQ.tPj.get()) {
            return;
        }
        boolean z = false;
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.EYQ.TZn.hu() && this.EYQ.mN != null) {
                jSONObject.put("dynamic_show_type", this.EYQ.mN.HX());
                this.EYQ.mN.EYQ(jSONObject);
                z = true;
            }
            UB ub = this.EYQ.EYQ;
            if ((ub instanceof Uc) && ((Uc) ub).cOq()) {
                jSONObject.put("choose_one_ad_real_show", true);
            }
            View viewFindViewById = this.EYQ.TZn.findViewById(R.id.content);
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("width", viewFindViewById.getWidth());
                jSONObject2.put("height", viewFindViewById.getHeight());
                jSONObject2.put("alpha", viewFindViewById.getAlpha());
            } catch (Throwable unused) {
            }
            jSONObject.put("root_view", jSONObject2.toString());
            this.EYQ.tPj.set(true);
            com.bytedance.sdk.openadsdk.mZx.Td.EYQ(ub, this.EYQ.VwS, jSONObject);
            if (this.EYQ.TZn instanceof com.bytedance.sdk.openadsdk.core.video.Td.mZx) {
                this.EYQ.TZn.VwS();
            }
            com.bytedance.sdk.openadsdk.nWX.EYQ.Kbd.EYQ(this.EYQ.TZn.findViewById(R.id.content), ub, z ? this.EYQ.mN.HX() : -1);
        } catch (JSONException e) {
            com.bytedance.sdk.component.utils.pi.EYQ("TTAD.RFReportManager", "reportShowWhenBindVideoAd error", e);
        }
    }

    public void EYQ(final Map<String, Object> map) {
        if (this.EYQ.tPj.get()) {
            return;
        }
        this.EYQ.tPj.set(true);
        final View viewFindViewById = this.EYQ.TZn.findViewById(R.id.content);
        if (viewFindViewById == null) {
            viewFindViewById = this.EYQ.TZn.getWindow().getDecorView();
        }
        viewFindViewById.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.EYQ.QQ.3
            @Override // java.lang.Runnable
            public void run() {
                Map map2;
                JSONObject jSONObject;
                if (QQ.this.EYQ.wBa.getAndSet(true)) {
                    return;
                }
                UB ub = QQ.this.EYQ.EYQ;
                JSONObject jSONObject2 = null;
                try {
                    if (map != null) {
                        jSONObject = new JSONObject(map);
                    } else {
                        jSONObject = new JSONObject();
                    }
                    jSONObject2 = jSONObject;
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("width", viewFindViewById.getWidth());
                    jSONObject3.put("height", viewFindViewById.getHeight());
                    jSONObject3.put("alpha", viewFindViewById.getAlpha());
                    jSONObject2.put("root_view", jSONObject3.toString());
                    if ((ub instanceof Uc) && ((Uc) ub).cOq()) {
                        jSONObject2.put("choose_one_ad_real_show", true);
                    }
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.pi.EYQ("TTAD.RFReportManager", "run: ", th);
                }
                com.bytedance.sdk.openadsdk.mZx.Td.EYQ(ub, QQ.this.EYQ.VwS, jSONObject2);
                if (QQ.this.EYQ.TZn instanceof com.bytedance.sdk.openadsdk.core.video.Td.mZx) {
                    QQ.this.EYQ.TZn.VwS();
                }
                com.bytedance.sdk.openadsdk.nWX.EYQ.Kbd.EYQ(QQ.this.EYQ.TZn.findViewById(R.id.content), ub, (QQ.this.EYQ.mN == null || (map2 = map) == null || !map2.containsKey("dynamic_show_type")) ? false : true ? QQ.this.EYQ.mN.HX() : -1);
            }
        });
    }

    public void EYQ(boolean z) {
        if (this.EYQ.EYQ == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.tp.EYQ.Td tdKbd = com.bytedance.sdk.openadsdk.tp.EYQ.Td.mZx().EYQ(z ? 7 : 8).Td(String.valueOf(this.EYQ.EYQ.yK())).Kbd(this.EYQ.EYQ.ZFP());
        tdKbd.mZx(this.EYQ.wJ.zF()).IPb(this.EYQ.wJ.WU());
        tdKbd.VwS(this.EYQ.EYQ.GfQ()).Pm(this.EYQ.EYQ.VOV());
        com.bytedance.sdk.openadsdk.tp.Td.EYQ().mZx(tdKbd);
    }

    public com.bytedance.sdk.openadsdk.core.mZx.Kbd Td() {
        this.Td.EYQ(this.EYQ.TZn.findViewById(R.id.content));
        this.Td.mZx(this.EYQ.TZn.findViewById(520093713));
        if (this.EYQ.PI.Td() != null) {
            this.Td.EYQ(this.EYQ.PI.Td());
        }
        this.EYQ.kf.EYQ(this.Td);
        this.Td.EYQ(new EYQ.InterfaceC0118EYQ() { // from class: com.bytedance.sdk.openadsdk.component.reward.EYQ.QQ.4
            @Override // com.bytedance.sdk.openadsdk.core.mZx.EYQ.InterfaceC0118EYQ
            public long getVideoProgress() {
                return QQ.this.EYQ.FtN.VwS();
            }
        });
        com.bytedance.sdk.openadsdk.component.reward.view.Kbd kbd = this.EYQ.TQF;
        com.bytedance.sdk.openadsdk.core.mZx.Kbd kbd2 = this.Td;
        kbd.EYQ(kbd2, kbd2, this.mZx);
        this.EYQ.na.EYQ(this.Td);
        return this.Td;
    }

    public View.OnClickListener Pm() {
        return this.mZx;
    }

    public com.bytedance.sdk.openadsdk.core.mZx.Kbd Kbd() {
        return this.Td;
    }

    public void mZx(boolean z) {
        EYQ eyq = this.EYQ;
        if (eyq == null) {
            return;
        }
        if (!z && eyq.tPj.get() && this.EYQ.Uc > 0) {
            com.bytedance.sdk.openadsdk.mZx.Td.EYQ(String.valueOf(SystemClock.elapsedRealtime() - this.EYQ.Uc), this.EYQ.EYQ, this.EYQ.TZn.EYQ, this.EYQ.FtN.EYQ());
            this.EYQ.Uc = 0L;
        } else {
            this.EYQ.Uc = SystemClock.elapsedRealtime();
        }
        com.bytedance.sdk.openadsdk.nWX.EYQ.Kbd.EYQ(this.EYQ.EYQ, z ? 4 : 8);
    }

    public void IPb() {
        JSONObject jSONObject = new JSONObject();
        if (zF.MxO(this.EYQ.EYQ)) {
            this.EYQ.kf.EYQ(jSONObject);
        }
        int i = 1;
        try {
            if (this.EYQ.WU.get()) {
                if (!this.EYQ.wJ.Td()) {
                    i = this.EYQ.wJ.Pm() ? 2 : 0;
                }
                jSONObject.put("endcard_content", i);
            } else {
                jSONObject.put("endCardNotShow", 1);
            }
        } catch (JSONException unused) {
        }
        com.bytedance.sdk.openadsdk.mZx.Td.mZx(this.EYQ.EYQ, this.EYQ.TZn.EYQ, "click_close", jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EYQ(View view, float f, float f2, float f3, float f4, SparseArray<Td.EYQ> sparseArray, int i, int i2, int i3) throws JSONException {
        if (view == null) {
            return;
        }
        if (view.getId() == com.bytedance.sdk.openadsdk.utils.tp.Kbd) {
            EYQ("click_play_star_level", null);
        } else if (view.getId() == com.bytedance.sdk.openadsdk.utils.tp.Pm || view.getId() == com.bytedance.sdk.openadsdk.utils.tp.VwS) {
            EYQ("click_play_star_nums", null);
        } else if (view.getId() == com.bytedance.sdk.openadsdk.utils.tp.Td) {
            EYQ("click_play_source", null);
        } else if (view.getId() == com.bytedance.sdk.openadsdk.utils.tp.mZx) {
            EYQ("click_play_logo", null);
        } else if (view.getId() == com.bytedance.sdk.openadsdk.utils.tp.tsL || view.getId() == com.bytedance.sdk.openadsdk.utils.tp.dub || view.getId() == com.bytedance.sdk.openadsdk.utils.tp.UB) {
            EYQ("click_start_play_bar", HX());
        } else if (view.getId() == 520093705) {
            EYQ("click_start_play", HX());
        } else if (view.getId() == com.bytedance.sdk.openadsdk.utils.tp.MxO) {
            EYQ("click_video", HX());
        } else if (view.getId() == 520093707 || view.getId() == com.bytedance.sdk.openadsdk.utils.tp.QQ) {
            EYQ("fallback_endcard_click", HX());
        }
        mZx(view, f, f2, f3, f4, sparseArray, i, i2, i3);
    }

    private void mZx(View view, float f, float f2, float f3, float f4, SparseArray<Td.EYQ> sparseArray, int i, int i2, int i3) {
        if (!QQ() || this.EYQ.EYQ == null || view == null) {
            return;
        }
        int id = view.getId();
        if (id == com.bytedance.sdk.openadsdk.utils.tp.Kbd || id == com.bytedance.sdk.openadsdk.utils.tp.Pm || id == com.bytedance.sdk.openadsdk.utils.tp.Td || id == com.bytedance.sdk.openadsdk.utils.tp.mZx || id == com.bytedance.sdk.openadsdk.utils.tp.tsL || id == com.bytedance.sdk.openadsdk.utils.tp.dub || id == com.bytedance.sdk.openadsdk.utils.tp.UB || id == 520093705 || id == com.bytedance.sdk.openadsdk.utils.tp.MxO || id == 520093707 || id == com.bytedance.sdk.openadsdk.utils.tp.VwS) {
            int iVwS = tr.VwS(hu.EYQ());
            com.bytedance.sdk.openadsdk.core.model.HX hxEYQ = new HX.EYQ().IPb(f).Kbd(f2).Pm(f3).Td(f4).mZx(System.currentTimeMillis()).EYQ(0L).mZx(tr.EYQ(this.EYQ.TQF.MxO())).EYQ(tr.EYQ((View) null)).Td(tr.Td(this.EYQ.TQF.MxO())).Pm(tr.Td((View) null)).Pm(i2).Kbd(i3).IPb(i).EYQ(sparseArray).mZx(com.bytedance.sdk.openadsdk.core.QQ.mZx().EYQ() ? 1 : 2).Td(iVwS).EYQ(tr.Kbd(hu.EYQ())).mZx(tr.IPb(hu.EYQ())).EYQ();
            HashMap map = new HashMap();
            map.put("duration", Long.valueOf(this.EYQ.FtN.VwS()));
            com.bytedance.sdk.openadsdk.mZx.Td.EYQ("click_other", this.EYQ.EYQ, hxEYQ, this.EYQ.VwS, true, (Map<String, Object>) map, -1);
        }
    }

    private boolean QQ() {
        return this.EYQ.EYQ != null && this.EYQ.EYQ.kf() == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EYQ(String str, JSONObject jSONObject) throws JSONException {
        UB ub = this.EYQ.EYQ;
        String str2 = this.EYQ.VwS;
        if (!this.EYQ.IPb) {
            jSONObject = null;
        }
        com.bytedance.sdk.openadsdk.mZx.Td.EYQ(ub, str2, str, jSONObject);
    }

    private JSONObject HX() {
        try {
            long jHu = this.EYQ.FtN.hu();
            int iUB = this.EYQ.FtN.UB();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("duration", jHu);
                jSONObject.put("percent", iUB);
                return jSONObject;
            } catch (Throwable unused) {
                return jSONObject;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    public void Td(boolean z) {
        EYQ eyq = this.EYQ;
        if (eyq != null && z && eyq.EYQ.lv() && !this.EYQ.EYQ.zAe()) {
            this.EYQ.EYQ.VwS(true);
            com.bytedance.sdk.openadsdk.mZx.Td.EYQ(this.EYQ.EYQ, this.EYQ.VwS, this.EYQ.EYQ.Hrh());
        }
    }

    public void VwS() {
        JSONObject jSONObject = new JSONObject();
        UB ub = this.EYQ.EYQ;
        if ((ub instanceof Uc) && ((Uc) ub).cOq()) {
            try {
                jSONObject.put("choose_one_ad_real_show", true);
            } catch (JSONException e) {
                com.bytedance.sdk.component.utils.pi.EYQ("TTAD.RFReportManager", "reportShow json error", e);
            }
        }
        com.bytedance.sdk.openadsdk.mZx.Td.Td(ub, this.EYQ.VwS, jSONObject);
    }
}
