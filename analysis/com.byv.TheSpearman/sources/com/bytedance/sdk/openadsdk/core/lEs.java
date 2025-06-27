package com.bytedance.sdk.openadsdk.core;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity;
import com.bytedance.sdk.openadsdk.api.PangleAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.mZx.mZx;
import com.bytedance.sdk.openadsdk.multipro.mZx.EYQ;
import com.bytedance.sdk.openadsdk.utils.FH;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: WebHelper.java */
/* loaded from: classes2.dex */
public class lEs {
    private static boolean EYQ = false;

    public static void EYQ(boolean z) {
        EYQ = z;
    }

    private static com.bytedance.sdk.openadsdk.tp.EYQ.EYQ EYQ(int i, com.bytedance.sdk.openadsdk.core.model.UB ub) {
        com.bytedance.sdk.openadsdk.tp.EYQ.EYQ eyq = new com.bytedance.sdk.openadsdk.tp.EYQ.EYQ();
        eyq.EYQ(mZx.EYQ.EYQ);
        eyq.EYQ(ub);
        eyq.mZx(FH.EYQ(ub));
        eyq.EYQ(i);
        eyq.EYQ(false);
        eyq.mZx(ub.Pf());
        return eyq;
    }

    public static boolean EYQ(Context context, com.bytedance.sdk.openadsdk.core.model.UB ub, int i, PAGNativeAd pAGNativeAd, PangleAd pangleAd, String str, com.com.bytedance.overseas.sdk.EYQ.Td td, boolean z, int i2) {
        com.bytedance.sdk.openadsdk.mZx.Td.EYQ(EYQ(-1, ub));
        if (context == null || ub == null || i == -1) {
            com.bytedance.sdk.openadsdk.mZx.Td.EYQ(EYQ(1, ub));
            return false;
        }
        String strEYQ = null;
        com.bytedance.sdk.openadsdk.core.model.tp tpVarDVQ = ub.dVQ();
        HashMap map = new HashMap();
        if (ub.CE() == 0) {
            map.put("dpl_probability_jump", Boolean.valueOf(i2 >= 11));
        }
        if (i2 != 0 && ub.oIw()) {
            map.put("dsp_click_type", Integer.valueOf(i2));
        }
        if (tpVarDVQ != null && !TextUtils.isEmpty(tpVarDVQ.EYQ())) {
            if (EYQ(context, ub, i, str, z, map)) {
                com.bytedance.sdk.openadsdk.mZx.Td.EYQ(EYQ(2, ub));
                return true;
            }
            if (tpVarDVQ.Td() != 2 || ub.by() == 5 || ub.by() == 15) {
                if (tpVarDVQ.Td() == 1 && !TextUtils.isEmpty(tpVarDVQ.mZx())) {
                    strEYQ = tpVarDVQ.mZx();
                } else {
                    strEYQ = EYQ(ub);
                }
            } else if (td != null) {
                if (!td.EYQ()) {
                    if (td.Kbd()) {
                        com.bytedance.sdk.openadsdk.mZx.Td.EYQ(ub, str, "open_fallback_url", map);
                        com.bytedance.sdk.openadsdk.mZx.Td.EYQ(EYQ(3, ub));
                        return true;
                    }
                    com.bytedance.sdk.openadsdk.mZx.Td.EYQ(ub, str, "open_fallback_url", map);
                    com.bytedance.sdk.openadsdk.mZx.Td.EYQ(EYQ(3, ub));
                    return false;
                }
                com.bytedance.sdk.openadsdk.mZx.Td.EYQ(ub, str, "open_fallback_url", map);
                com.bytedance.sdk.openadsdk.mZx.Td.EYQ(EYQ(3, ub));
                return true;
            }
            com.bytedance.sdk.openadsdk.mZx.Td.EYQ(ub, str, "open_fallback_url", map);
        } else {
            strEYQ = EYQ(ub);
        }
        if (ub.CE() == 0 && !TextUtils.isEmpty(strEYQ) && strEYQ.contains("play.google.com/store")) {
            String strSubstring = strEYQ.substring(strEYQ.indexOf("?id=") + 4);
            com.bytedance.sdk.openadsdk.mZx.Td.EYQ(EYQ(4, ub));
            return com.com.bytedance.overseas.sdk.EYQ.mZx.EYQ(context, strEYQ, strSubstring, str, ub);
        }
        return EYQ(context, ub, i, pAGNativeAd, pangleAd, str, z, strEYQ);
    }

    private static String EYQ(com.bytedance.sdk.openadsdk.core.model.UB ub) {
        if (!ub.oIw() || ub.zzY() == null) {
            return ub.XPd();
        }
        return ub.zzY().HX();
    }

    public static boolean EYQ(Context context, com.bytedance.sdk.openadsdk.core.model.UB ub, int i, String str, boolean z, Map<String, Object> map) throws JSONException {
        if (ub == null) {
            return false;
        }
        com.bytedance.sdk.openadsdk.core.model.tp tpVarDVQ = ub.dVQ();
        if (tpVarDVQ == null || TextUtils.isEmpty(tpVarDVQ.EYQ())) {
            Pm.EYQ(ub, str, tpVarDVQ == null ? -1 : -2, tpVarDVQ != null ? tpVarDVQ.Pm() : null);
            return false;
        }
        Map<String, Object> map2 = map == null ? new HashMap<>() : map;
        String strEYQ = tpVarDVQ.EYQ();
        Uri uri = Uri.parse(strEYQ);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        if (FH.QQ(context)) {
            FH.mZx mZx = FH.mZx(context, intent);
            if (mZx.mZx > 0) {
                if (hu.Pm().QQ()) {
                    FH.EYQ(ub, str);
                }
                ComponentName componentNameResolveActivity = intent.resolveActivity(context.getPackageManager());
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                map2.put("can_query_install", 1);
                if (componentNameResolveActivity != null) {
                    map2.put("resolved_activity", componentNameResolveActivity.getPackageName() + "/" + componentNameResolveActivity.getClassName());
                }
                map2.put("matched_count", Integer.valueOf(mZx.mZx));
                map2.put("url", strEYQ);
                if (mZx.EYQ != null) {
                    map2.put("target_component", mZx.EYQ.getPackageName() + "/" + mZx.EYQ.getClassName());
                    intent.setComponent(mZx.EYQ);
                }
                com.bytedance.sdk.openadsdk.mZx.Td.EYQ(ub, str, "open_url_app", map2);
                try {
                    context.startActivity(intent);
                    com.bytedance.sdk.openadsdk.mZx.MxO.EYQ().EYQ(map2).EYQ(ub, str);
                    com.bytedance.sdk.openadsdk.mZx.Td.EYQ("dp_start_act_success", ub, str, map2);
                    return true;
                } catch (Exception e) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("exception", e.getMessage());
                        jSONObject.put("intent", intent.toString());
                        jSONObject.put("can_query_install", 1);
                    } catch (Exception unused) {
                    }
                    Pm.EYQ(ub, str, -4, jSONObject);
                    if (!hu.Pm().QQ()) {
                        EYQ(context, ub.XPd(), ub, i, str, z);
                        com.bytedance.sdk.component.utils.pi.EYQ("WebHelper", "openDetailPage() -> context.startActivity(intent) fail :", e);
                    }
                    return false;
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("intent", intent.toString());
                jSONObject2.put("can_query_install", 1);
            } catch (Exception unused2) {
            }
            Pm.EYQ(ub, str, -3, jSONObject2);
        } else {
            try {
                if (hu.Pm().QQ()) {
                    FH.EYQ(ub, str);
                }
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                map2.put("can_query_install", 0);
                com.bytedance.sdk.openadsdk.mZx.Td.EYQ(ub, str, "open_url_app", map2);
                context.startActivity(intent);
                com.bytedance.sdk.openadsdk.mZx.MxO.EYQ().EYQ(map2).EYQ(ub, str);
                return true;
            } catch (Throwable unused3) {
            }
        }
        return false;
    }

    public static boolean EYQ(Context context, com.bytedance.sdk.openadsdk.core.model.UB ub, int i, PAGNativeAd pAGNativeAd, PangleAd pangleAd, String str, boolean z, String str2) throws JSONException {
        if (!TextUtils.isEmpty(str2) || com.bytedance.sdk.openadsdk.core.model.zF.mZx(ub)) {
            int iPf = ub.Pf();
            if (iPf == 2 || iPf == 8) {
                return com.bytedance.sdk.openadsdk.utils.hu.EYQ(context, str2, ub, mZx.EYQ.EYQ);
            }
            com.bytedance.sdk.component.utils.mZx.EYQ(context, EYQ(context, str2, ub, i, pAGNativeAd, pangleAd, str, z), null);
            EYQ = false;
            return true;
        }
        com.bytedance.sdk.openadsdk.mZx.Td.EYQ(EYQ(5, ub));
        return false;
    }

    public static boolean EYQ(Context context, String str, com.bytedance.sdk.openadsdk.core.model.UB ub, int i, String str2, boolean z) {
        try {
            context.startActivity(EYQ(context, str, ub, i, (PAGNativeAd) null, (PangleAd) null, str2, z));
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean mZx(Context context, String str, com.bytedance.sdk.openadsdk.core.model.UB ub, int i, String str2, boolean z) {
        try {
            Intent intentEYQ = EYQ(context, str, ub, i, (PAGNativeAd) null, (PangleAd) null, str2, z, true);
            if (!(context instanceof Activity)) {
                intentEYQ.addFlags(268435456);
            }
            context.startActivity(intentEYQ);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static Intent EYQ(Context context, String str, com.bytedance.sdk.openadsdk.core.model.UB ub, int i, PAGNativeAd pAGNativeAd, PangleAd pangleAd, String str2, boolean z) {
        return EYQ(context, str, ub, i, pAGNativeAd, pangleAd, str2, z, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static Intent EYQ(Context context, String str, com.bytedance.sdk.openadsdk.core.model.UB ub, int i, PAGNativeAd pAGNativeAd, PangleAd pangleAd, String str2, boolean z, boolean z2) {
        Intent intent;
        if (!z2 && com.bytedance.sdk.openadsdk.core.model.zF.mZx(ub) && (pAGNativeAd != 0 || pangleAd != null)) {
            intent = new Intent(context, (Class<?>) TTPlayableLandingPageActivity.class);
            intent.putExtra("ad_pending_download", EYQ(ub, z));
            String strKbd = com.bytedance.sdk.openadsdk.core.model.zF.Kbd(ub);
            if (!TextUtils.isEmpty(strKbd)) {
                if (strKbd.contains("?")) {
                    str = strKbd + "&orientation=portrait";
                } else {
                    str = strKbd + "?orientation=portrait";
                }
            }
        } else {
            intent = (z2 || ub.Pf() != 3 || !(ub.nWX() == 2 || (ub.nWX() == 1 && EYQ)) || ub.Vx()) ? new Intent(context, (Class<?>) TTLandingPageActivity.class) : new Intent(context, (Class<?>) TTVideoLandingPageLink2Activity.class);
        }
        intent.putExtra("url", str);
        intent.putExtra("gecko_id", ub.Dd());
        intent.putExtra("web_title", ub.TQF());
        intent.putExtra("sdk_version", BuildConfig.VERSION_CODE);
        intent.putExtra("adid", ub.VOV());
        intent.putExtra("log_extra", ub.GfQ());
        com.bytedance.sdk.openadsdk.multipro.mZx.EYQ eyqTd = null;
        intent.putExtra(CampaignEx.JSON_KEY_ICON_URL, ub.vD() == null ? null : ub.vD().EYQ());
        intent.putExtra("event_tag", str2);
        intent.putExtra(FirebaseAnalytics.Param.SOURCE, i);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        if (com.bytedance.sdk.openadsdk.multipro.mZx.Td()) {
            intent.putExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA, ub.aEX().toString());
        } else {
            zF.EYQ().IPb();
            zF.EYQ().EYQ(ub);
        }
        if (ub.by() == 5 || ub.by() == 15 || ub.by() == 50) {
            if (pAGNativeAd != 0) {
                if (pAGNativeAd instanceof EYQ.InterfaceC0135EYQ) {
                    eyqTd = ((EYQ.InterfaceC0135EYQ) pAGNativeAd).IPb();
                } else if (pAGNativeAd instanceof com.bytedance.sdk.openadsdk.apiImpl.feed.feedexpress.EYQ) {
                    eyqTd = ((com.bytedance.sdk.openadsdk.apiImpl.feed.feedexpress.EYQ) pAGNativeAd).mZx();
                }
                if (eyqTd != null) {
                    intent.putExtra(TTAdConstant.MULTI_PROCESS_DATA, eyqTd.EYQ().toString());
                }
            }
            if ((pangleAd instanceof com.bytedance.sdk.openadsdk.core.bannerexpress.Td) && (eyqTd = ((com.bytedance.sdk.openadsdk.core.bannerexpress.Td) pangleAd).Td()) != null) {
                intent.putExtra(TTAdConstant.MULTI_PROCESS_DATA, eyqTd.EYQ().toString());
            }
            if (eyqTd != null) {
                intent.putExtra("video_is_auto_play", eyqTd.Pm);
                if (com.bytedance.sdk.component.utils.pi.Pm()) {
                    eyqTd.EYQ().toString();
                }
            }
        }
        return intent;
    }

    private static boolean EYQ(com.bytedance.sdk.openadsdk.core.model.UB ub, boolean z) {
        if (z && ub != null && ub.Pf() == 4) {
            return com.bytedance.sdk.openadsdk.core.model.zF.mZx(ub);
        }
        return false;
    }
}
