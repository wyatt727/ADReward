package com.mbridge.msdk.mbsignalcommon.mraid;

import android.content.Context;
import android.text.TextUtils;
import com.json.t2;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.mbsignalcommon.mraid.a;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class MraidSignalCommunication extends BaseMraidSignalCommunication {

    /* renamed from: a, reason: collision with root package name */
    private b f3177a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.mbridge.msdk.mbsignalcommon.windvane.h
    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        super.initialize(context, windVaneWebView);
        try {
            if (context instanceof b) {
                this.f3177a = (b) context;
                return;
            }
            if (windVaneWebView.getObject() != null && (windVaneWebView.getObject() instanceof b)) {
                this.f3177a = (b) windVaneWebView.getObject();
            }
            if (windVaneWebView.getMraidObject() == null || !(windVaneWebView.getMraidObject() instanceof b)) {
                return;
            }
            this.f3177a = (b) windVaneWebView.getMraidObject();
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    public void open(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        if (obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) {
            com.mbridge.msdk.mbsignalcommon.windvane.a aVar = (com.mbridge.msdk.mbsignalcommon.windvane.a) obj;
            windVaneWebView = aVar.b;
            a.C0279a.f3178a.a(aVar.b, "open");
        } else {
            windVaneWebView = null;
        }
        try {
            String strOptString = new JSONObject(str).optString("url");
            ad.b("MraidSignalCommunication", "MRAID Open " + strOptString);
            if (this.f3177a == null || TextUtils.isEmpty(strOptString)) {
                return;
            }
            if (windVaneWebView == null || System.currentTimeMillis() - windVaneWebView.lastTouchTime <= com.mbridge.msdk.click.b.a.c || !com.mbridge.msdk.click.b.a.a(this.f3177a.getMraidCampaign(), windVaneWebView.getUrl(), com.mbridge.msdk.click.b.a.f2525a)) {
                this.f3177a.open(strOptString);
            }
        } catch (Throwable th) {
            ad.a("MraidSignalCommunication", "MRAID Open", th);
        }
    }

    public void close(Object obj, String str) {
        if (obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) {
            a.C0279a.f3178a.a(((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).b, "close");
        }
        try {
            ad.b("MraidSignalCommunication", "MRAID close");
            b bVar = this.f3177a;
            if (bVar != null) {
                bVar.close();
            }
        } catch (Throwable th) {
            ad.a("MraidSignalCommunication", "MRAID close", th);
        }
    }

    public void unload(Object obj, String str) {
        if (obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) {
            a.C0279a.f3178a.a(((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).b, "unload");
        }
        try {
            ad.b("MraidSignalCommunication", "MRAID unload");
            b bVar = this.f3177a;
            if (bVar != null) {
                bVar.unload();
            }
        } catch (Throwable th) {
            ad.a("MraidSignalCommunication", "MRAID unload", th);
        }
    }

    public void useCustomClose(Object obj, String str) {
        if (obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) {
            a.C0279a.f3178a.a(((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).b, "useCustomClose");
        }
        try {
            String strOptString = new JSONObject(str).optString("shouldUseCustomClose");
            ad.b("MraidSignalCommunication", "MRAID useCustomClose " + strOptString);
            if (TextUtils.isEmpty(strOptString) || this.f3177a == null) {
                return;
            }
            this.f3177a.useCustomClose(strOptString.toLowerCase().equals(com.json.mediationsdk.metadata.a.g));
        } catch (Throwable th) {
            ad.a("MraidSignalCommunication", "MRAID useCustomClose", th);
        }
    }

    public void expand(Object obj, String str) {
        if (obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) {
            a.C0279a.f3178a.a(((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).b, "expand");
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("url");
            String strOptString2 = jSONObject.optString("shouldUseCustomClose");
            ad.b("MraidSignalCommunication", "MRAID expand " + strOptString + " " + strOptString2);
            if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2) || this.f3177a == null) {
                return;
            }
            this.f3177a.expand(strOptString, strOptString2.toLowerCase().equals(com.json.mediationsdk.metadata.a.g));
        } catch (Throwable th) {
            ad.a("MraidSignalCommunication", "MRAID expand", th);
        }
    }

    public void setOrientationProperties(Object obj, String str) {
        String str2;
        if (obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) {
            a.C0279a.f3178a.a(((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).b, MRAIDPresenter.SET_ORIENTATION_PROPERTIES);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("allowOrientationChange");
            String strOptString2 = jSONObject.optString("forceOrientation");
            ad.b("MraidSignalCommunication", "MRAID setOrientationProperties");
            if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2) || this.f3177a == null) {
                return;
            }
            strOptString.toLowerCase().equals(com.json.mediationsdk.metadata.a.g);
            String lowerCase = strOptString2.toLowerCase();
            int iHashCode = lowerCase.hashCode();
            if (iHashCode == 729267099) {
                str2 = t2.h.D;
            } else if (iHashCode != 1430647483) {
                return;
            } else {
                str2 = t2.h.C;
            }
            lowerCase.equals(str2);
        } catch (Throwable th) {
            ad.a("MraidSignalCommunication", "MRAID setOrientationProperties", th);
        }
    }
}
