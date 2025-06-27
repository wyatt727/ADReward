package com.bytedance.sdk.openadsdk.activity;

import com.bykv.vk.openvk.component.video.api.Pm.Td;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.mZx.VwS;
import com.google.android.gms.nearby.messages.Strategy;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class TTRewardExpressVideoActivity extends TTRewardVideoActivity {
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

    @Override // com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity, com.bytedance.sdk.openadsdk.core.video.Td.mZx
    public boolean EYQ(long j, boolean z) {
        VwS vwS;
        if (this.mZx.mN != null && this.mZx.mN.EYQ() != null) {
            vwS = this.mZx.mN.EYQ().getAdShowTime();
        } else {
            vwS = new VwS();
        }
        this.mZx.FtN.EYQ(this.mZx.mN.mZx(), vwS);
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
        this.mZx.FtN.EYQ(new Td.EYQ() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.1
            boolean EYQ;

            @Override // com.bykv.vk.openvk.component.video.api.Pm.Td.EYQ
            public void EYQ(long j2, int i) {
                if (this.EYQ) {
                    return;
                }
                this.EYQ = true;
                TTRewardExpressVideoActivity.this.Pm.removeMessages(Strategy.TTL_SECONDS_DEFAULT);
                TTRewardExpressVideoActivity.this.pi();
                TTRewardExpressVideoActivity.this.mZx.mN.mZx(true);
                if (TTRewardExpressVideoActivity.this.mZx.EYQ.nWX() == 21 && !TTRewardExpressVideoActivity.this.mZx.EYQ.Td()) {
                    TTRewardExpressVideoActivity.this.mZx.EYQ.mZx(true);
                    TTRewardExpressVideoActivity.this.mZx.TQF.UB();
                }
                if (TTRewardExpressVideoActivity.this.mZx.mZx) {
                    TTRewardExpressVideoActivity.this.EYQ(false, 5);
                } else {
                    TTRewardExpressVideoActivity.this.finish();
                }
                TTRewardExpressVideoActivity.this.pi = (int) (System.currentTimeMillis() / 1000);
                TTRewardExpressVideoActivity.this.zF();
            }

            @Override // com.bykv.vk.openvk.component.video.api.Pm.Td.EYQ
            public void mZx(long j2, int i) {
                TTRewardExpressVideoActivity.this.Pm.removeMessages(Strategy.TTL_SECONDS_DEFAULT);
                if (TTRewardExpressVideoActivity.this.mZx.FtN.mZx()) {
                    TTRewardExpressVideoActivity.this.tsL();
                    return;
                }
                TTRewardExpressVideoActivity.this.zF();
                TTRewardExpressVideoActivity.this.mZx.FtN.pi();
                if (TTRewardExpressVideoActivity.this.mZx.mZx) {
                    TTRewardExpressVideoActivity.this.EYQ(false, 3);
                } else {
                    TTRewardExpressVideoActivity.this.finish();
                }
                TTRewardExpressVideoActivity.this.mZx.mN.EYQ(true);
                TTRewardExpressVideoActivity.this.mZx.FtN.EYQ(1 ^ (TTRewardExpressVideoActivity.this.mZx.FtN.rfB() ? 1 : 0), 2);
            }

            @Override // com.bykv.vk.openvk.component.video.api.Pm.Td.EYQ
            public void EYQ() {
                TTRewardExpressVideoActivity.this.Pm.removeMessages(Strategy.TTL_SECONDS_DEFAULT);
                TTRewardExpressVideoActivity.this.pi();
                TTRewardExpressVideoActivity.this.zF();
                if (TTRewardExpressVideoActivity.this.mZx.mZx) {
                    TTRewardExpressVideoActivity.this.EYQ(false, 6);
                } else {
                    TTRewardExpressVideoActivity.this.finish();
                }
                TTRewardExpressVideoActivity.this.mZx.FtN.EYQ(!TTRewardExpressVideoActivity.this.mZx.FtN.rfB() ? 1 : 0, !TTRewardExpressVideoActivity.this.mZx.FtN.rfB() ? 1 : 0);
                TTRewardExpressVideoActivity.this.mZx.FtN.pi();
            }

            @Override // com.bykv.vk.openvk.component.video.api.Pm.Td.EYQ
            public void EYQ(long j2, long j3) {
                if (!TTRewardExpressVideoActivity.this.mZx.Kbd && TTRewardExpressVideoActivity.this.mZx.FtN.mZx()) {
                    TTRewardExpressVideoActivity.this.mZx.FtN.KO();
                }
                if (TTRewardExpressVideoActivity.this.mZx.WU.get()) {
                    return;
                }
                TTRewardExpressVideoActivity.this.Pm.removeMessages(Strategy.TTL_SECONDS_DEFAULT);
                if (j2 != TTRewardExpressVideoActivity.this.mZx.FtN.QQ()) {
                    TTRewardExpressVideoActivity.this.pi();
                }
                if (TTRewardExpressVideoActivity.this.mZx.FtN.mZx()) {
                    TTRewardExpressVideoActivity.this.mZx.FtN.EYQ(j2, j3);
                    int iTp = hu.Pm().tp(String.valueOf(TTRewardExpressVideoActivity.this.mZx.KO));
                    boolean z2 = TTRewardExpressVideoActivity.this.mZx.mN.QQ() && iTp != -1 && iTp >= 0;
                    TTRewardExpressVideoActivity tTRewardExpressVideoActivity = TTRewardExpressVideoActivity.this;
                    long j4 = j2 / 1000;
                    tTRewardExpressVideoActivity.IPb = (int) (tTRewardExpressVideoActivity.mZx.FtN.lEs() - j4);
                    int i = (int) j4;
                    if ((TTRewardExpressVideoActivity.this.mZx.tr.get() || TTRewardExpressVideoActivity.this.mZx.XN.get()) && TTRewardExpressVideoActivity.this.mZx.FtN.mZx()) {
                        TTRewardExpressVideoActivity.this.mZx.FtN.KO();
                    }
                    if (TTRewardExpressVideoActivity.this.IPb >= 0) {
                        TTRewardExpressVideoActivity.this.mZx.KR.EYQ(String.valueOf(TTRewardExpressVideoActivity.this.IPb), null);
                    }
                    TTRewardExpressVideoActivity.this.mZx.TQF.Kbd(i);
                    TTRewardExpressVideoActivity.this.EYQ(j2, j3);
                    if (TTRewardExpressVideoActivity.this.mZx.mN != null && TTRewardExpressVideoActivity.this.mZx.mN.EYQ() != null) {
                        TTRewardExpressVideoActivity.this.mZx.mN.EYQ().EYQ(String.valueOf(TTRewardExpressVideoActivity.this.IPb), i, 0, false);
                    }
                    if (TTRewardExpressVideoActivity.this.IPb > 0) {
                        if (z2 && i >= iTp && TTRewardExpressVideoActivity.this.mZx.EYQ.nWX() != 5) {
                            TTRewardExpressVideoActivity.this.mZx.EYQ(true);
                            TTRewardExpressVideoActivity.this.mZx.KR.EYQ(String.valueOf(TTRewardExpressVideoActivity.this.IPb), TTAdDislikeToast.getSkipText());
                            TTRewardExpressVideoActivity.this.mZx.KR.Kbd(true);
                            return;
                        }
                        TTRewardExpressVideoActivity.this.mZx.KR.EYQ(String.valueOf(TTRewardExpressVideoActivity.this.IPb), null);
                    }
                }
            }
        });
        boolean zEYQ = this.mZx.FtN.EYQ(j, z, map, this.Td);
        if (zEYQ && !z) {
            this.tsL = (int) (System.currentTimeMillis() / 1000);
        }
        return zEYQ;
    }
}
