package com.bytedance.sdk.openadsdk.activity;

import com.bykv.vk.openvk.component.video.api.Pm.Td;
import com.bytedance.sdk.component.utils.pi;
import com.bytedance.sdk.openadsdk.component.reward.mZx.QQ;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.mZx.VwS;
import com.google.android.gms.nearby.messages.Strategy;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class TTFullScreenExpressVideoActivity extends TTFullScreenVideoActivity {
    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    protected void IPb() {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public boolean UB() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public boolean hu() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity, com.bytedance.sdk.openadsdk.core.video.Td.mZx
    public boolean EYQ(long j, boolean z) {
        VwS vwS;
        if (this.mZx.mN != null && this.mZx.mN.EYQ() != null) {
            vwS = this.mZx.mN.EYQ().getAdShowTime();
        } else {
            vwS = new VwS();
        }
        if (this.Td != null && (this.Td instanceof QQ) && !this.mZx.HX) {
            this.mZx.FtN.EYQ(((QQ) this.Td).FH(), vwS);
        } else {
            this.mZx.FtN.EYQ(this.mZx.mN.mZx(), vwS);
        }
        HashMap map = new HashMap();
        if (this.mZx.mN != null) {
            map.put("dynamic_show_type", Integer.valueOf(this.mZx.mN.HX()));
            JSONObject jSONObjectEYQ = this.mZx.mN.EYQ((JSONObject) null);
            if (jSONObjectEYQ != null) {
                Iterator<String> itKeys = jSONObjectEYQ.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        map.put(next, jSONObjectEYQ.get(next));
                    } catch (JSONException unused) {
                    }
                }
            }
        }
        this.mZx.FtN.EYQ(new Td.EYQ() { // from class: com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.1
            boolean EYQ;

            @Override // com.bykv.vk.openvk.component.video.api.Pm.Td.EYQ
            public void EYQ(long j2, int i) {
                if (this.EYQ) {
                    return;
                }
                this.EYQ = true;
                TTFullScreenExpressVideoActivity.this.Pm.removeMessages(Strategy.TTL_SECONDS_DEFAULT);
                TTFullScreenExpressVideoActivity.this.pi();
                TTFullScreenExpressVideoActivity.this.mZx.mN.mZx(true);
                if (TTFullScreenExpressVideoActivity.this.mZx.EYQ.nWX() == 21 && !TTFullScreenExpressVideoActivity.this.mZx.EYQ.Td()) {
                    TTFullScreenExpressVideoActivity.this.mZx.EYQ.mZx(true);
                    TTFullScreenExpressVideoActivity.this.mZx.TQF.UB();
                }
                if (TTFullScreenExpressVideoActivity.this.mZx.mZx) {
                    TTFullScreenExpressVideoActivity.this.EYQ(false, 5);
                    return;
                }
                if (UB.Kbd(TTFullScreenExpressVideoActivity.this.mZx.EYQ)) {
                    TTFullScreenExpressVideoActivity.this.finish();
                    return;
                }
                if (TTFullScreenExpressVideoActivity.this.mZx.mN == null || TTFullScreenExpressVideoActivity.this.mZx.mN.EYQ() == null) {
                    return;
                }
                TTFullScreenExpressVideoActivity.this.mZx.mN.EYQ().EYQ("0", 0, 0, false);
                if (TTFullScreenExpressVideoActivity.this.mZx.mN.QQ()) {
                    TTFullScreenExpressVideoActivity.this.mZx.KR.EYQ("0", "X");
                    TTFullScreenExpressVideoActivity.this.mZx.KR.Kbd(true);
                }
            }

            @Override // com.bykv.vk.openvk.component.video.api.Pm.Td.EYQ
            public void mZx(long j2, int i) {
                TTFullScreenExpressVideoActivity.this.Pm.removeMessages(Strategy.TTL_SECONDS_DEFAULT);
                if (TTFullScreenExpressVideoActivity.this.mZx.FtN.mZx()) {
                    TTFullScreenExpressVideoActivity.this.tsL();
                    return;
                }
                TTFullScreenExpressVideoActivity.this.mZx.FtN.pi();
                pi.EYQ("TTAD.FSEVA", "fullscreen_interstitial_ad", "onError、、、、、、、、");
                TTFullScreenExpressVideoActivity.this.mZx.mN.EYQ(true);
                if (TTFullScreenExpressVideoActivity.this.mZx.mZx) {
                    TTFullScreenExpressVideoActivity.this.EYQ(false, 3);
                    TTFullScreenExpressVideoActivity.this.mZx.FtN.EYQ(!TTFullScreenExpressVideoActivity.this.mZx.FtN.rfB() ? 1 : 0, 2);
                } else {
                    TTFullScreenExpressVideoActivity.this.finish();
                }
            }

            @Override // com.bykv.vk.openvk.component.video.api.Pm.Td.EYQ
            public void EYQ() {
                TTFullScreenExpressVideoActivity.this.Pm.removeMessages(Strategy.TTL_SECONDS_DEFAULT);
                TTFullScreenExpressVideoActivity.this.pi();
                if (TTFullScreenExpressVideoActivity.this.mZx.mZx) {
                    TTFullScreenExpressVideoActivity.this.EYQ(false, 6);
                } else {
                    TTFullScreenExpressVideoActivity.this.finish();
                }
                TTFullScreenExpressVideoActivity.this.mZx.FtN.EYQ(!TTFullScreenExpressVideoActivity.this.mZx.FtN.rfB() ? 1 : 0, !TTFullScreenExpressVideoActivity.this.mZx.FtN.rfB() ? 1 : 0);
                TTFullScreenExpressVideoActivity.this.mZx.FtN.pi();
            }

            @Override // com.bykv.vk.openvk.component.video.api.Pm.Td.EYQ
            public void EYQ(long j2, long j3) {
                if (!TTFullScreenExpressVideoActivity.this.mZx.Kbd && TTFullScreenExpressVideoActivity.this.mZx.FtN.mZx()) {
                    TTFullScreenExpressVideoActivity.this.mZx.FtN.KO();
                }
                if (TTFullScreenExpressVideoActivity.this.mZx.WU.get()) {
                    return;
                }
                TTFullScreenExpressVideoActivity.this.Pm.removeMessages(Strategy.TTL_SECONDS_DEFAULT);
                if (j2 != TTFullScreenExpressVideoActivity.this.mZx.FtN.QQ()) {
                    TTFullScreenExpressVideoActivity.this.pi();
                }
                if (TTFullScreenExpressVideoActivity.this.mZx.FtN.mZx()) {
                    TTFullScreenExpressVideoActivity.this.mZx.FtN.EYQ(j2, j3);
                    TTFullScreenExpressVideoActivity tTFullScreenExpressVideoActivity = TTFullScreenExpressVideoActivity.this;
                    long j4 = j2 / 1000;
                    tTFullScreenExpressVideoActivity.IPb = (int) (tTFullScreenExpressVideoActivity.mZx.FtN.lEs() - j4);
                    int i = (int) j4;
                    if ((TTFullScreenExpressVideoActivity.this.mZx.tr.get() || TTFullScreenExpressVideoActivity.this.mZx.XN.get()) && TTFullScreenExpressVideoActivity.this.mZx.FtN.mZx()) {
                        TTFullScreenExpressVideoActivity.this.mZx.FtN.KO();
                    }
                    if (TTFullScreenExpressVideoActivity.this.mZx.mN != null && TTFullScreenExpressVideoActivity.this.mZx.mN.EYQ() != null) {
                        TTFullScreenExpressVideoActivity.this.mZx.mN.EYQ().EYQ(String.valueOf(TTFullScreenExpressVideoActivity.this.IPb), i, 0, false);
                    }
                    if (TTFullScreenExpressVideoActivity.this.mZx.mN.QQ() || TTFullScreenExpressVideoActivity.this.mZx.EYQ.HG()) {
                        TTFullScreenExpressVideoActivity.this.mZx(i);
                        if (TTFullScreenExpressVideoActivity.this.IPb >= 0) {
                            TTFullScreenExpressVideoActivity.this.mZx.KR.Pm(true);
                            TTFullScreenExpressVideoActivity.this.mZx.KR.EYQ(String.valueOf(TTFullScreenExpressVideoActivity.this.IPb), null);
                        }
                    }
                }
            }
        });
        return this.mZx.FtN.EYQ(j, z, map, this.Td);
    }
}
