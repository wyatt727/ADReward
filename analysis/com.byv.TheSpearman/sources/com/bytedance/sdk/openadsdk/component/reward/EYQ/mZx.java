package com.bytedance.sdk.openadsdk.component.reward.EYQ;

import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.core.model.Uc;
import com.bytedance.sdk.openadsdk.core.zF;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* compiled from: RewardFullDataManager.java */
/* loaded from: classes2.dex */
public class mZx {
    private static final SparseArray<WeakReference<UB>> EYQ = new SparseArray<>();

    public static void EYQ(EYQ eyq, Intent intent, Bundle bundle) {
        EYQ(intent, eyq);
        EYQ(bundle, eyq);
    }

    public static UB EYQ(Intent intent, Bundle bundle, com.bytedance.sdk.openadsdk.core.video.Td.mZx mzx) {
        UB uc = null;
        if (!com.bytedance.sdk.openadsdk.multipro.mZx.Td()) {
            UB ubMZx = zF.EYQ().mZx();
            com.bytedance.sdk.openadsdk.core.model.EYQ eyqVwS = zF.EYQ().VwS();
            if (ubMZx == null && eyqVwS != null) {
                ubMZx = new Uc(eyqVwS);
            }
            uc = ubMZx;
            if (mzx != null) {
                mzx.EYQ(bundle);
            }
            zF.EYQ().IPb();
        } else if (intent != null) {
            try {
                String stringExtra = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_AD_INFO);
                if (stringExtra != null) {
                    uc = new Uc(com.bytedance.sdk.openadsdk.core.model.EYQ.mZx(new JSONObject(stringExtra)));
                }
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.pi.EYQ("TTAD.RFDM", "", e);
            }
        }
        if (bundle != null) {
            try {
                WeakReference<UB> weakReference = EYQ.get(bundle.getInt("meta_tmp"));
                if (weakReference != null) {
                    uc = weakReference.get();
                }
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.pi.EYQ("TTAD.RFDM", "", th);
            }
        }
        if (uc != null) {
            uc.EYQ(uc.KO(), 7);
        }
        return uc;
    }

    private static void EYQ(Intent intent, EYQ eyq) {
        if (intent == null) {
            return;
        }
        eyq.FtN.Td(intent.getBooleanExtra("video_is_cached", false));
        eyq.Td = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_META_MD5);
        eyq.nWX = intent.getIntExtra("orientation_angle", 0) == 3;
    }

    public static void EYQ(Bundle bundle, EYQ eyq) {
        if (bundle == null) {
            return;
        }
        eyq.Td = bundle.getString(TTAdConstant.MULTI_PROCESS_META_MD5);
        eyq.FtN.Td(bundle.getBoolean("video_is_cached", false));
        eyq.Pm = bundle.getBoolean("is_mute");
        if (bundle.getLong("video_current") > 0) {
            eyq.FtN.EYQ(bundle.getLong("video_current", 0L));
        }
        eyq.EYQ(bundle.getBoolean("has_show_skip_btn"));
    }

    public static void EYQ(EYQ eyq, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            UB ub = eyq.EYQ;
            EYQ.append(ub.hashCode(), new WeakReference<>(ub));
            bundle.putInt("meta_tmp", ub.hashCode());
            bundle.putString(TTAdConstant.MULTI_PROCESS_META_MD5, eyq.Td);
            bundle.putBoolean("video_is_cached", eyq.FtN.tPj());
            bundle.putLong("video_current", eyq.FtN.VwS());
            bundle.putBoolean("is_mute", eyq.Pm);
            bundle.putBoolean("has_show_skip_btn", eyq.hu);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.pi.EYQ("TTAD.RFDM", "onSaveInstanceState: ", th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void EYQ(android.content.Intent r2, android.app.Activity r3, boolean r4, com.bytedance.sdk.openadsdk.core.model.EYQ r5, java.lang.String r6) {
        /*
            if (r3 != 0) goto L8
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            r2.addFlags(r3)
            goto L1d
        L8:
            android.view.WindowManager r3 = r3.getWindowManager()     // Catch: java.lang.Exception -> L15
            android.view.Display r3 = r3.getDefaultDisplay()     // Catch: java.lang.Exception -> L15
            int r3 = r3.getRotation()     // Catch: java.lang.Exception -> L15
            goto L1e
        L15:
            r3 = move-exception
            java.lang.String r0 = "TTAD.RFDM"
            java.lang.String r1 = ""
            com.bytedance.sdk.component.utils.pi.EYQ(r0, r1, r3)
        L1d:
            r3 = 0
        L1e:
            java.lang.String r0 = "orientation_angle"
            r2.putExtra(r0, r3)
            java.lang.String r3 = "video_is_cached"
            r2.putExtra(r3, r4)
            boolean r3 = com.bytedance.sdk.openadsdk.multipro.mZx.Td()
            if (r3 == 0) goto L49
            org.json.JSONObject r3 = r5.MxO()
            if (r3 != 0) goto L3a
            java.lang.String r2 = "toJsonObj return null"
            com.bytedance.sdk.component.utils.pi.mZx(r2)
            return
        L3a:
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "multi_process_ad_info"
            r2.putExtra(r4, r3)
            java.lang.String r3 = "multi_process_meta_md5"
            r2.putExtra(r3, r6)
            return
        L49:
            com.bytedance.sdk.openadsdk.core.zF r2 = com.bytedance.sdk.openadsdk.core.zF.EYQ()
            r2.IPb()
            com.bytedance.sdk.openadsdk.core.zF r2 = com.bytedance.sdk.openadsdk.core.zF.EYQ()
            r2.EYQ(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.EYQ.mZx.EYQ(android.content.Intent, android.app.Activity, boolean, com.bytedance.sdk.openadsdk.core.model.EYQ, java.lang.String):void");
    }
}
