package com.com.bytedance.overseas.sdk.EYQ;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.pi;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.core.lEs;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.mZx.MxO;
import com.bytedance.sdk.openadsdk.utils.FH;
import com.json.t2;
import com.mbridge.msdk.MBridgeConstans;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: GPDownLoader.java */
/* loaded from: classes2.dex */
public class mZx implements Td {
    protected static Boolean Kbd;
    protected com.bytedance.sdk.openadsdk.core.model.Td EYQ;
    private final WeakReference<Context> QQ;
    protected String Td;
    protected int VwS;
    protected UB mZx;
    protected boolean Pm = false;
    protected final AtomicBoolean IPb = new AtomicBoolean(false);
    private boolean HX = false;

    public mZx(Context context, UB ub, String str) {
        this.QQ = new WeakReference<>(context);
        this.mZx = ub;
        this.EYQ = ub.xh();
        this.Td = str;
        "====tag===".concat(String.valueOf(str));
        if (hu.EYQ() == null) {
            hu.EYQ(context);
        }
    }

    @Override // com.com.bytedance.overseas.sdk.EYQ.Td
    public void EYQ(boolean z) {
        this.HX = z;
    }

    @Override // com.com.bytedance.overseas.sdk.EYQ.Td
    public void EYQ(int i) {
        this.VwS = i;
    }

    public boolean EYQ(Context context, String str, String str2) {
        return EYQ(context, str, str2, this.Td, this.mZx);
    }

    public static boolean EYQ(Context context, String str, String str2, String str3, UB ub) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            Boolean bool = Kbd;
            jSONObject.put("storeOpenType", (bool == null || !bool.booleanValue()) ? t2.h.K : MBridgeConstans.DYNAMIC_VIEW_WX_APP);
        } catch (JSONException e) {
            pi.EYQ("GPDownLoader", "gotoGooglePlayByPackageNameAndUrl json error", e);
        }
        if (!TextUtils.isEmpty(str3) && str3.contains("_landingpage")) {
            str3 = str3.replace("_landingpage", "");
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent.setFlags(268435456);
                context.startActivity(intent);
                com.bytedance.sdk.openadsdk.mZx.Td.mZx(ub, str3, "store_open", jSONObject);
                jSONObject.toString();
                return true;
            } catch (Throwable unused) {
            }
        }
        if (context != null && str2 != null && !TextUtils.isEmpty(str2)) {
            try {
                Intent intent2 = new Intent("android.intent.action.VIEW");
                Uri uri = Uri.parse("market://details?id=".concat(String.valueOf(str2)));
                intent2.setData(uri);
                Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(intent2, 65536).iterator();
                while (it.hasNext()) {
                    if (it.next().activityInfo.packageName.equals("com.android.vending") && context.getPackageManager().getLaunchIntentForPackage("com.android.vending") != null) {
                        Intent intent3 = new Intent("android.intent.action.VIEW");
                        intent3.setData(uri);
                        intent3.setPackage("com.android.vending");
                        if (!(context instanceof Activity)) {
                            intent3.setFlags(268435456);
                        }
                        context.startActivity(intent3);
                        jSONObject.put("storeOpenType", MBridgeConstans.DYNAMIC_VIEW_WX_APP);
                        com.bytedance.sdk.openadsdk.mZx.Td.mZx(ub, str3, "store_open", jSONObject);
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                ApmHelper.reportCustomError("gotoGooglePlayByPackageNameAndUrl error", "gotoGooglePlay", th);
            }
        }
        return false;
    }

    public static void EYQ(Context context) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("market://details"));
        try {
            Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(intent, 65536).iterator();
            while (it.hasNext()) {
                if (it.next().activityInfo.packageName.equals("com.android.vending")) {
                    Kbd = Boolean.TRUE;
                    return;
                }
            }
        } catch (Throwable unused) {
            Kbd = Boolean.FALSE;
        }
        Kbd = Boolean.FALSE;
    }

    protected Context Td() {
        WeakReference<Context> weakReference = this.QQ;
        return (weakReference == null || weakReference.get() == null) ? hu.EYQ() : this.QQ.get();
    }

    @Override // com.com.bytedance.overseas.sdk.EYQ.Td
    public void Pm() {
        if (Td() == null) {
            return;
        }
        if (mZx()) {
            this.IPb.set(true);
            this.mZx.Td(true);
            return;
        }
        if (EYQ()) {
            this.mZx.Td(true);
            return;
        }
        if (Kbd()) {
            this.mZx.Td(true);
        } else {
            if (this.mZx.xh() != null || this.mZx.XPd() == null) {
                return;
            }
            lEs.EYQ(Td(), this.mZx.XPd(), this.mZx, FH.EYQ(this.Td), this.Td, true);
            this.mZx.Td(true);
        }
    }

    public boolean mZx() throws JSONException {
        com.bytedance.sdk.openadsdk.core.Pm.EYQ(this.mZx, this.Td, 1, null);
        if (this.mZx.dVQ() != null) {
            String strEYQ = this.mZx.dVQ().EYQ();
            if (!TextUtils.isEmpty(strEYQ)) {
                Uri uri = Uri.parse(strEYQ);
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(uri);
                FH.mZx mZx = FH.mZx(Td(), intent);
                if (mZx.mZx > 0) {
                    if (!(Td() instanceof Activity)) {
                        intent.addFlags(268435456);
                    }
                    try {
                        Map<String, Object> map = new HashMap<>();
                        EYQ(map);
                        ComponentName componentNameResolveActivity = intent.resolveActivity(Td().getPackageManager());
                        if (componentNameResolveActivity != null) {
                            map.put("resolved_activity", componentNameResolveActivity.getPackageName() + "/" + componentNameResolveActivity.getClassName());
                        }
                        map.put("matched_count", Integer.valueOf(mZx.mZx));
                        map.put("url", strEYQ);
                        if (mZx.EYQ != null) {
                            map.put("target_component", mZx.EYQ.getPackageName() + "/" + mZx.EYQ.getClassName());
                            intent.setComponent(mZx.EYQ);
                        }
                        com.bytedance.sdk.openadsdk.mZx.Td.EYQ(this.mZx, this.Td, "open_url_app", map);
                        Td().startActivity(intent);
                        MxO.EYQ().EYQ(map).EYQ(this.mZx, this.Td);
                        com.bytedance.sdk.openadsdk.mZx.Td.EYQ("dp_start_act_success", this.mZx, this.Td, map);
                        return true;
                    } catch (Throwable th) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("exception", th.getMessage());
                            jSONObject.put("intent", intent.toString());
                            jSONObject.put("can_query_install", 1);
                        } catch (Exception unused) {
                        }
                        com.bytedance.sdk.openadsdk.core.Pm.EYQ(this.mZx, this.Td, -4, jSONObject);
                    }
                } else {
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("intent", intent.toString());
                        jSONObject2.put("can_query_install", 1);
                    } catch (Exception unused2) {
                    }
                    com.bytedance.sdk.openadsdk.core.Pm.EYQ(this.mZx, this.Td, -3, jSONObject2);
                }
            } else {
                UB ub = this.mZx;
                com.bytedance.sdk.openadsdk.core.Pm.EYQ(ub, this.Td, -2, ub.dVQ().Pm());
            }
            if (this.Pm && !this.IPb.get()) {
                return false;
            }
            this.Pm = true;
            Map<String, Object> map2 = new HashMap<>();
            EYQ(map2);
            com.bytedance.sdk.openadsdk.mZx.Td.EYQ(this.mZx, this.Td, "open_fallback_url", map2);
            return false;
        }
        com.bytedance.sdk.openadsdk.core.Pm.EYQ(this.mZx, this.Td, -1, null);
        return false;
    }

    private void EYQ(Map<String, Object> map) {
        UB ub = this.mZx;
        if (ub != null && ub.CE() == 0) {
            UB ub2 = this.mZx;
            map.put("auto_click", Boolean.valueOf((ub2 == null || ub2.Td()) ? false : true));
        }
        UB ub3 = this.mZx;
        if (ub3 != null && ub3.CE() == 0) {
            map.put("dpl_probability_jump", Boolean.valueOf(this.VwS >= 11));
        }
        map.put("can_query_install", 1);
    }

    @Override // com.com.bytedance.overseas.sdk.EYQ.Td
    public boolean Kbd() {
        this.IPb.set(true);
        return this.EYQ != null && EYQ(Td(), this.EYQ.EYQ(), this.EYQ.Td());
    }

    @Override // com.com.bytedance.overseas.sdk.EYQ.Td
    public boolean EYQ() {
        Intent intentEYQ;
        if (this.EYQ == null) {
            return false;
        }
        UB ub = this.mZx;
        if (ub != null && ub.Ko() == 0) {
            return false;
        }
        String strTd = this.EYQ.Td();
        if (TextUtils.isEmpty(strTd) || !FH.mZx(Td(), strTd) || (intentEYQ = FH.EYQ(Td(), strTd)) == null) {
            return false;
        }
        intentEYQ.putExtra("START_ONLY_FOR_ANDROID", true);
        try {
            Td().startActivity(intentEYQ);
            HashMap map = new HashMap();
            EYQ(map);
            com.bytedance.sdk.openadsdk.mZx.Td.EYQ(this.mZx, this.Td, "click_open", map);
            return true;
        } catch (Throwable th) {
            pi.EYQ("GPDownLoader", th.getMessage());
            return false;
        }
    }
}
