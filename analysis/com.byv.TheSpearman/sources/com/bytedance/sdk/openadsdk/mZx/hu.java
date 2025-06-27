package com.bytedance.sdk.openadsdk.mZx;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.core.model.UB;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: WebviewTimeTrack.java */
/* loaded from: classes2.dex */
public class hu implements com.bytedance.sdk.openadsdk.mZx.Td.Kbd {
    private String EYQ;
    private JSONObject IPb;
    private Boolean Kbd;
    private Boolean Pm;
    private JSONArray QQ;
    private Boolean Td;
    private JSONArray VwS;
    private UB mZx;

    public hu(int i, String str, UB ub) throws JSONException {
        this.EYQ = "embeded_ad";
        this.Td = Boolean.FALSE;
        this.Pm = Boolean.FALSE;
        this.Kbd = Boolean.FALSE;
        this.EYQ = str;
        this.mZx = ub;
        this.IPb = new JSONObject();
        this.VwS = new JSONArray();
        this.QQ = new JSONArray();
        EYQ(this.IPb, "webview_source", Integer.valueOf(i));
    }

    protected hu() {
        this.EYQ = "embeded_ad";
        this.Td = Boolean.FALSE;
        this.Pm = Boolean.FALSE;
        this.Kbd = Boolean.FALSE;
    }

    @Override // com.bytedance.sdk.openadsdk.mZx.Td.Pm
    public void EYQ() {
        com.bytedance.sdk.component.utils.QQ.EYQ().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.mZx.hu.1
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                hu.this.EYQ(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                hu huVar = hu.this;
                huVar.EYQ(jSONObject, "render_sequence", Integer.valueOf(huVar.mZx.NZ()));
                if (hu.this.mZx != null && hu.this.mZx.PI() != null) {
                    if (hu.this.mZx.PI().pi()) {
                        hu.this.EYQ(jSONObject, "webview_count", Integer.valueOf(com.bytedance.sdk.component.adexpress.Kbd.Kbd.EYQ().Pm()));
                        hu.this.EYQ(jSONObject, "available_cache_count", Integer.valueOf(com.bytedance.sdk.component.adexpress.Kbd.Kbd.EYQ().Pm()));
                    } else {
                        hu.this.EYQ(jSONObject, "webview_count", Integer.valueOf(com.bytedance.sdk.component.adexpress.Kbd.Kbd.EYQ().Td()));
                        hu.this.EYQ(jSONObject, "available_cache_count", Integer.valueOf(com.bytedance.sdk.component.adexpress.Kbd.Kbd.EYQ().Td()));
                    }
                }
                hu huVar2 = hu.this;
                huVar2.EYQ(huVar2.IPb, "render_start", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.mZx.Td.Pm
    public void mZx() {
        com.bytedance.sdk.component.utils.QQ.EYQ().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.mZx.hu.12
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                hu.this.EYQ(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                hu huVar = hu.this;
                huVar.EYQ(huVar.IPb, "render_success", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.mZx.Td.Pm
    public void EYQ(final int i, final String str) {
        com.bytedance.sdk.component.utils.QQ.EYQ().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.mZx.hu.23
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                hu.this.EYQ(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                hu.this.EYQ(jSONObject, "code", Integer.valueOf(i));
                String str2 = str;
                if (str2 != null) {
                    hu.this.EYQ(jSONObject, NotificationCompat.CATEGORY_MESSAGE, str2);
                }
                hu huVar = hu.this;
                huVar.EYQ(huVar.IPb, "render_error", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.mZx.Td.mZx
    public void Td() {
        com.bytedance.sdk.component.utils.QQ.EYQ().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.mZx.hu.24
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                hu.this.EYQ(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                hu huVar = hu.this;
                huVar.EYQ(huVar.IPb, "native_render_start", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.mZx.Td.Td
    public void Pm() {
        com.bytedance.sdk.component.utils.QQ.EYQ().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.mZx.hu.25
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                hu.this.EYQ(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                hu huVar = hu.this;
                huVar.EYQ(huVar.IPb, "native_render_end", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.mZx.Td.IPb
    public void Kbd() {
        com.bytedance.sdk.component.utils.QQ.EYQ().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.mZx.hu.26
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                hu.this.EYQ(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                hu huVar = hu.this;
                huVar.EYQ(huVar.IPb, "webview_load_start", (Object) jSONObject, false);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.mZx.Td.IPb
    public void IPb() {
        com.bytedance.sdk.component.utils.QQ.EYQ().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.mZx.hu.27
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                hu.this.EYQ(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                hu huVar = hu.this;
                huVar.EYQ(huVar.IPb, "webview_load_success", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.mZx.Td.IPb
    public void EYQ(final JSONObject jSONObject) {
        com.bytedance.sdk.component.utils.QQ.EYQ().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.mZx.hu.28
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                JSONObject jSONObject2 = jSONObject;
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                hu.this.EYQ(jSONObject2, "ts", Long.valueOf(System.currentTimeMillis()));
                hu huVar = hu.this;
                huVar.EYQ(huVar.IPb, "webview_load_error", jSONObject2);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.mZx.Td.Td
    public void VwS() {
        com.bytedance.sdk.component.utils.QQ.EYQ().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.mZx.hu.29
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                hu.this.EYQ(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                hu huVar = hu.this;
                huVar.EYQ(huVar.IPb, "native_endcard_show", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.mZx.Td.Td
    public void QQ() {
        com.bytedance.sdk.component.utils.QQ.EYQ().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.mZx.hu.2
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                hu.this.EYQ(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                hu huVar = hu.this;
                huVar.EYQ(huVar.IPb, "native_endcard_close", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.mZx.Td.Td
    public void HX() {
        com.bytedance.sdk.component.utils.QQ.EYQ().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.mZx.hu.3
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                hu.this.EYQ(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                hu.this.EYQ(jSONObject, "type", "native_enterBackground");
                hu huVar = hu.this;
                huVar.EYQ(huVar.VwS, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.mZx.Td.Td
    public void tp() {
        com.bytedance.sdk.component.utils.QQ.EYQ().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.mZx.hu.4
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                hu.this.EYQ(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                hu.this.EYQ(jSONObject, "type", "native_enterForeground");
                hu huVar = hu.this;
                huVar.EYQ(huVar.VwS, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.mZx.Td.IPb
    public void EYQ(final String str, final long j, final long j2, final int i) {
        com.bytedance.sdk.component.utils.QQ.EYQ().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.mZx.hu.5
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                if (TextUtils.isEmpty(str) || j2 < j) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                hu.this.EYQ(jSONObject, "start_ts", Long.valueOf(j));
                hu.this.EYQ(jSONObject, "end_ts", Long.valueOf(j2));
                hu.this.EYQ(jSONObject, "intercept_type", Integer.valueOf(i));
                hu.this.EYQ(jSONObject, "type", "intercept_html");
                hu.this.EYQ(jSONObject, "url", str);
                hu.this.EYQ(jSONObject, "duration", Long.valueOf(j2 - j));
                hu huVar = hu.this;
                huVar.EYQ(huVar.QQ, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.mZx.Td.IPb
    public void mZx(final String str, final long j, final long j2, final int i) {
        com.bytedance.sdk.component.utils.QQ.EYQ().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.mZx.hu.6
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                if (TextUtils.isEmpty(str) || j2 < j) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                hu.this.EYQ(jSONObject, "start_ts", Long.valueOf(j));
                hu.this.EYQ(jSONObject, "end_ts", Long.valueOf(j2));
                hu.this.EYQ(jSONObject, "intercept_type", Integer.valueOf(i));
                hu.this.EYQ(jSONObject, "type", "intercept_js");
                hu.this.EYQ(jSONObject, "url", str);
                hu.this.EYQ(jSONObject, "duration", Long.valueOf(j2 - j));
                hu huVar = hu.this;
                huVar.EYQ(huVar.QQ, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.mZx.Td.IPb
    public void EYQ(final String str) {
        com.bytedance.sdk.component.utils.QQ.EYQ().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.mZx.hu.7
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                hu.this.EYQ(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                hu.this.EYQ(jSONObject, "jsb", str);
                hu huVar = hu.this;
                huVar.EYQ(huVar.IPb, "webview_jsb_start", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.mZx.Td.IPb
    public void mZx(final String str) {
        com.bytedance.sdk.component.utils.QQ.EYQ().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.mZx.hu.8
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                hu.this.EYQ(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                hu.this.EYQ(jSONObject, "jsb", str);
                hu huVar = hu.this;
                huVar.EYQ(huVar.IPb, "webview_jsb_end", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.mZx.Td.IPb
    public void mZx(final JSONObject jSONObject) {
        com.bytedance.sdk.component.utils.QQ.EYQ().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.mZx.hu.9
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                JSONObject jSONObject2;
                if (hu.this.IPb == null || (jSONObject2 = jSONObject) == null) {
                    return;
                }
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    hu huVar = hu.this;
                    huVar.EYQ(huVar.IPb, next, jSONObject.opt(next));
                }
                hu.this.Pm = Boolean.TRUE;
                hu.this.tsL();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.mZx.Td.Kbd
    public void MxO() {
        this.Td = Boolean.TRUE;
    }

    @Override // com.bytedance.sdk.openadsdk.mZx.Td.Kbd
    public void EYQ(boolean z) {
        this.Kbd = Boolean.valueOf(z);
    }

    @Override // com.bytedance.sdk.openadsdk.mZx.Td.Kbd
    public void tsL() {
        com.bytedance.sdk.component.utils.QQ.EYQ().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.mZx.hu.10
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                if (hu.this.hu()) {
                    if (hu.this.VwS != null && hu.this.VwS.length() != 0) {
                        try {
                            hu.this.IPb.put("native_switchBackgroundAndForeground", hu.this.VwS);
                        } catch (Exception unused) {
                        }
                    }
                    if (hu.this.QQ != null && hu.this.QQ.length() != 0) {
                        try {
                            hu.this.IPb.put("intercept_source", hu.this.QQ);
                        } catch (Exception unused2) {
                        }
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("webview_time_track", hu.this.IPb);
                    } catch (JSONException e) {
                        com.bytedance.sdk.component.utils.pi.EYQ("WebviewTimeTrack", "trySendTrackInfo json error", e);
                    }
                    if (com.bytedance.sdk.openadsdk.core.QQ.mZx().UB() && hu.this.IPb != null) {
                        JSONObject unused3 = hu.this.IPb;
                    }
                    Td.mZx(hu.this.mZx, hu.this.EYQ, "webview_time_track", jSONObject);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hu() {
        if (this.Kbd.booleanValue()) {
            return true;
        }
        return this.Pm.booleanValue() && this.Td.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EYQ(JSONObject jSONObject, String str, Object obj, boolean z) throws JSONException {
        if (jSONObject == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (!z) {
            try {
                if (jSONObject.has(str)) {
                    return;
                }
            } catch (Exception unused) {
                return;
            }
        }
        jSONObject.put(str, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EYQ(JSONObject jSONObject, String str, Object obj) throws JSONException {
        EYQ(jSONObject, str, obj, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EYQ(JSONArray jSONArray, Object obj) {
        if (jSONArray == null || jSONArray.length() >= 10) {
            return;
        }
        try {
            jSONArray.put(obj);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mZx.Td.EYQ
    public void Td(final String str) {
        com.bytedance.sdk.component.utils.QQ.EYQ().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.mZx.hu.11
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                hu.this.EYQ(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                hu huVar = hu.this;
                huVar.EYQ(huVar.IPb, str, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.mZx.Td.EYQ
    public void mZx(final int i, final String str) {
        com.bytedance.sdk.component.utils.QQ.EYQ().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.mZx.hu.13
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                hu.this.EYQ(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                hu.this.EYQ(jSONObject, "code", Integer.valueOf(i));
                hu huVar = hu.this;
                huVar.EYQ(huVar.IPb, str, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.mZx.Td.mZx
    public void pi() {
        com.bytedance.sdk.component.utils.QQ.EYQ().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.mZx.hu.14
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                hu.this.EYQ(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                hu huVar = hu.this;
                huVar.EYQ(huVar.IPb, "native_render_end", jSONObject);
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                JSONObject jSONObject2 = new JSONObject();
                hu.this.EYQ(jSONObject2, "ts", Long.valueOf(jCurrentTimeMillis2));
                hu huVar2 = hu.this;
                huVar2.EYQ(huVar2.IPb, "render_success", jSONObject2);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.mZx.Td.mZx
    public void nWX() {
        com.bytedance.sdk.component.utils.QQ.EYQ().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.mZx.hu.15
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                hu.this.EYQ(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                hu huVar = hu.this;
                huVar.EYQ(huVar.IPb, "no_native_render", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.mZx.Td.Pm
    public void KO() {
        com.bytedance.sdk.component.utils.QQ.EYQ().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.mZx.hu.16
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                hu.this.EYQ(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                hu huVar = hu.this;
                huVar.EYQ(huVar.IPb, "render_failed", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.mZx.Td.EYQ
    public void Pm(final String str) {
        com.bytedance.sdk.component.utils.QQ.EYQ().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.mZx.hu.17
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                hu.this.EYQ(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                hu huVar = hu.this;
                huVar.EYQ(huVar.IPb, str, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.mZx.Td.EYQ
    public void Kbd(final String str) {
        try {
            com.bytedance.sdk.component.utils.QQ.EYQ().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.mZx.hu.18
                @Override // java.lang.Runnable
                public void run() throws JSONException {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    hu.this.EYQ(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                    hu huVar = hu.this;
                    huVar.EYQ(huVar.IPb, str, jSONObject);
                }
            });
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mZx.Td.EYQ
    public void IPb(final String str) {
        try {
            com.bytedance.sdk.component.utils.QQ.EYQ().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.mZx.hu.19
                @Override // java.lang.Runnable
                public void run() throws JSONException {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    hu.this.EYQ(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                    hu huVar = hu.this;
                    huVar.EYQ(huVar.IPb, str, jSONObject);
                }
            });
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mZx.Td.EYQ
    public void Td(final int i, final String str) {
        try {
            com.bytedance.sdk.component.utils.QQ.EYQ().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.mZx.hu.20
                @Override // java.lang.Runnable
                public void run() throws JSONException {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    hu.this.EYQ(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                    hu.this.EYQ(jSONObject, "code", Integer.valueOf(i));
                    hu huVar = hu.this;
                    huVar.EYQ(huVar.IPb, str, jSONObject);
                }
            });
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mZx.Td.EYQ
    public void VwS(final String str) {
        com.bytedance.sdk.component.utils.QQ.EYQ().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.mZx.hu.21
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                hu.this.EYQ(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                hu huVar = hu.this;
                huVar.EYQ(huVar.IPb, str, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.mZx.Td.IPb
    public void EYQ(final int i) {
        com.bytedance.sdk.component.utils.QQ.EYQ().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.mZx.hu.22
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                hu.this.EYQ(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                hu.this.EYQ(jSONObject, "isWebViewCache", Integer.valueOf(i));
                if (hu.this.mZx != null && hu.this.mZx.PI() != null) {
                    if (!hu.this.mZx.PI().pi()) {
                        hu.this.EYQ(jSONObject, "engine_version", "v1");
                    } else {
                        hu huVar = hu.this;
                        huVar.EYQ(jSONObject, "engine_version", huVar.mZx.PI().tsL());
                    }
                }
                hu huVar2 = hu.this;
                huVar2.EYQ(huVar2.IPb, "before_webview_request", jSONObject);
            }
        });
    }
}
