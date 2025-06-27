package com.mbridge.msdk.video.signal.a;

import android.util.Base64;
import android.webkit.WebView;
import com.json.t2;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: JSNotifyProxy.java */
/* loaded from: classes4.dex */
public final class n extends f {

    /* renamed from: a, reason: collision with root package name */
    private WebView f3771a;

    public n(WebView webView) {
        this.f3771a = webView;
    }

    @Override // com.mbridge.msdk.video.signal.a.f, com.mbridge.msdk.video.signal.g
    public final void a(int i) throws JSONException {
        super.a(i);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", i);
            com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(this.f3771a, "onVideoStatusNotify", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.f, com.mbridge.msdk.video.signal.g
    public final void a(int i, String str) throws JSONException {
        super.a(i, str);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", i);
            jSONObject.put("pt", str);
            com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(this.f3771a, "onJSClick", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.f, com.mbridge.msdk.video.signal.g
    public final void a(MBridgeVideoView.b bVar) throws JSONException {
        super.a(bVar);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("progress", a(bVar.f3748a, bVar.b));
            jSONObject.put("time", String.valueOf(bVar.f3748a));
            jSONObject.put("duration", String.valueOf(bVar.b));
            com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(this.f3771a, "onVideoProgressNotify", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String a(int i, int i2) {
        if (i2 != 0) {
            try {
                return ai.a(Double.valueOf(i / i2)) + "";
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return i2 + "";
    }

    @Override // com.mbridge.msdk.video.signal.a.f, com.mbridge.msdk.video.signal.g
    public final void a(Object obj) {
        super.a(obj);
        com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(this.f3771a, "webviewshow", (obj == null || !(obj instanceof String)) ? "" : Base64.encodeToString(obj.toString().getBytes(), 2));
    }

    @Override // com.mbridge.msdk.video.signal.a.f, com.mbridge.msdk.video.signal.g
    public final void a(int i, int i2, int i3, int i4) throws JSONException {
        super.a(i, i2, i3, i4);
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            String str = t2.h.C;
            if (i != 2 ? i2 != 2 : i2 == 1) {
                str = t2.h.D;
            }
            jSONObject2.put("orientation", str);
            jSONObject2.put("screen_width", i3);
            jSONObject2.put("screen_height", i4);
            jSONObject.put("data", jSONObject2);
            com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(this.f3771a, "showDataInfo", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }
}
