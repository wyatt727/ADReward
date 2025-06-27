package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.utils.FH;
import com.bytedance.sdk.openadsdk.utils.tr;
import com.json.i5;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: TTAdManagerImpl.java */
@Deprecated
/* loaded from: classes2.dex */
public class tPj implements XN {
    private static final Map<Integer, String> Kbd = new HashMap<Integer, String>(12) { // from class: com.bytedance.sdk.openadsdk.core.tPj.1
        {
            put(1, "abtest");
            put(2, "user_data");
            put(3, i5.w0);
            put(4, "apk-sign");
            put(5, "app_set_id_scope");
            put(6, "app_set_id");
            put(7, "installed_source");
            put(8, "app_running_time");
            put(9, "vendor");
            put(10, i5.u);
            put(11, "user_agent_device");
            put(12, "user_agent_webview");
            put(13, "sys_compiling_time");
            put(14, "sec_did");
            put(15, "url");
            put(16, "X-Argus");
            put(17, "X-Ladon");
            put(18, "X-Khronos");
            put(19, "X-Gorgon");
            put(20, "pangle_m");
            put(21, "screen_height");
            put(22, "screen_width");
            put(23, "rom_version");
            put(24, "carrier_name");
            put(25, "os_version");
            put(26, "conn_type");
            put(27, "boot");
        }
    };
    boolean EYQ = false;
    boolean mZx = false;
    String Td = "com.union_test.internationad";
    String Pm = "8025677";
    private int IPb = 0;

    @Override // com.bytedance.sdk.openadsdk.core.XN
    public String Pm() {
        return BuildConfig.VERSION_NAME;
    }

    @Override // com.bytedance.sdk.openadsdk.core.XN
    /* renamed from: Pm, reason: merged with bridge method [inline-methods] */
    public tPj EYQ(String str) throws JSONException {
        QQ.mZx().EYQ(str);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.XN
    /* renamed from: Kbd, reason: merged with bridge method [inline-methods] */
    public tPj mZx(String str) {
        QQ.mZx().mZx(str);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.XN
    public XN EYQ(int i) {
        QQ.mZx().Kbd(i);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.XN
    public XN EYQ() {
        com.bytedance.sdk.component.utils.pi.EYQ("PangleSDK-5906");
        com.bykv.vk.openvk.component.video.api.IPb.Td.EYQ("PangleSDK-5906");
        com.bytedance.sdk.component.utils.pi.mZx();
        com.bytedance.sdk.component.IPb.EYQ.EYQ();
        com.bykv.vk.openvk.component.video.api.IPb.Td.EYQ();
        com.bytedance.sdk.openadsdk.utils.UB.EYQ();
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.XN
    public XN EYQ(boolean z) {
        QQ.mZx().Td(z);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.XN
    public XN mZx(int i) {
        QQ.mZx().mZx(i);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.XN
    public int mZx() {
        return QQ.mZx().VwS();
    }

    @Override // com.bytedance.sdk.openadsdk.core.XN
    public XN Td(int i) {
        QQ.mZx().Td(i);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.XN
    public int Td() {
        return QQ.mZx().QQ();
    }

    @Override // com.bytedance.sdk.openadsdk.core.XN
    public String Kbd() {
        return Td((String) null);
    }

    @Override // com.bytedance.sdk.openadsdk.core.XN
    public String Td(String str) {
        int size;
        FH.tp("getBiddingToken");
        com.bytedance.sdk.openadsdk.core.Kbd.Td.EYQ();
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("is_init", pi.Kbd() ? 1 : 0);
            String strTp = hu.Pm().tp();
            String strWU = hu.Pm().WU();
            if (strTp != null && strWU != null) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("version", strTp);
                jSONObject3.put("param", strWU);
                jSONObject2.put("abtest", jSONObject3);
            }
            jSONObject2.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            jSONObject2.put("package_name", FH.Kbd());
            jSONObject2.put("user_data", Uc.EYQ(TextUtils.isEmpty(str) ? null : new AdSlot.Builder().setCodeId(str).build()));
            jSONObject2.put("ts", System.currentTimeMillis() / 1000);
            if (jSONObject2.toString().getBytes().length <= 2680) {
                com.bytedance.sdk.openadsdk.core.settings.Kbd kbdPm = hu.Pm();
                if (kbdPm.lEs(i5.w0)) {
                    jSONObject2.put(i5.w0, com.com.bytedance.overseas.sdk.mZx.EYQ.EYQ().mZx());
                }
                Context contextEYQ = hu.EYQ();
                jSONObject2.put("apk-sign", com.bytedance.sdk.openadsdk.common.EYQ.VwS());
                jSONObject2.put("app_set_id_scope", com.bytedance.sdk.openadsdk.core.settings.Td.mZx());
                jSONObject2.put("app_set_id", com.bytedance.sdk.openadsdk.core.settings.Td.Td());
                jSONObject2.put("installed_source", com.bytedance.sdk.openadsdk.core.settings.Td.Pm());
                jSONObject2.put("app_running_time", (System.currentTimeMillis() - pi.EYQ()) / 1000);
                jSONObject2.put("vendor", Build.MANUFACTURER);
                jSONObject2.put(i5.u, Build.MODEL);
                jSONObject2.put("user_agent_device", FH.mZx());
                jSONObject2.put("user_agent_webview", FH.Td());
                jSONObject2.put("sys_compiling_time", MxO.mZx(contextEYQ));
                jSONObject2.put("screen_height", tr.Pm(contextEYQ));
                jSONObject2.put("screen_width", tr.Td(contextEYQ));
                jSONObject2.put("rom_version", com.bytedance.sdk.openadsdk.utils.WU.EYQ());
                jSONObject2.put("carrier_name", com.bytedance.sdk.openadsdk.utils.XN.EYQ());
                jSONObject2.put("os_version", Build.VERSION.RELEASE);
                jSONObject2.put("conn_type", FH.tsL(contextEYQ));
                if (kbdPm.lEs("boot")) {
                    jSONObject2.put("boot", String.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
                }
                com.bytedance.sdk.openadsdk.core.Kbd.Td.EYQ(jSONObject2);
                size = Kbd.size();
            } else {
                size = 2;
            }
            while (size > 0 && jSONObject2.toString().getBytes().length > 2680) {
                jSONObject2.remove(Kbd.get(Integer.valueOf(size)));
                size--;
            }
            jSONObject = com.bytedance.sdk.component.utils.EYQ.EYQ(jSONObject2);
            while (size > 0 && jSONObject.toString().getBytes().length > 4096) {
                jSONObject2.remove(Kbd.get(Integer.valueOf(size)));
                jSONObject = com.bytedance.sdk.component.utils.EYQ.EYQ(jSONObject2);
                size--;
            }
            if (com.bytedance.sdk.component.utils.pi.Pm()) {
                Objects.toString(jSONObject);
                int length = jSONObject.toString().getBytes().length;
            }
        } catch (Throwable unused) {
        }
        Objects.toString(jSONObject);
        return jSONObject.toString();
    }

    @Override // com.bytedance.sdk.openadsdk.core.XN
    public boolean EYQ(String str, int i, String str2, String str3, String str4) {
        if (!this.Td.equals(hu.EYQ().getPackageName()) || !this.Pm.equals(QQ.mZx().Pm()) || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Method methodEYQ = com.bytedance.sdk.component.utils.tPj.EYQ("com.bytedance.sdk.openadsdk.TTC3Proxy", "verityPlayable", String.class, Integer.TYPE, String.class, String.class, String.class);
            if (methodEYQ != null) {
                methodEYQ.invoke(null, str, Integer.valueOf(i), str2, str3, str4);
            }
        } catch (Throwable unused) {
        }
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.XN
    public XN Pm(int i) {
        QQ.mZx().IPb(i);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.XN
    public int IPb() {
        return QQ.mZx().zF();
    }

    @Override // com.bytedance.sdk.openadsdk.core.XN
    public XN Kbd(int i) {
        this.IPb = i;
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.XN
    public int VwS() {
        return this.IPb;
    }

    @Override // com.bytedance.sdk.openadsdk.core.XN
    public XN IPb(int i) {
        QQ.mZx().EYQ(i);
        return this;
    }
}
