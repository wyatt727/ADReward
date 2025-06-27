package com.my.tracker.obfuscated;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.my.tracker.MyTracker;
import com.my.tracker.MyTrackerAttribution;
import java.net.URLDecoder;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    final AtomicBoolean f4229a = new AtomicBoolean(false);
    final a1 b;
    final Context c;

    h(a1 a1Var, Context context) {
        this.b = a1Var;
        this.c = context.getApplicationContext();
    }

    public static h a(a1 a1Var, Context context) {
        return new h(a1Var, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(MyTracker.AttributionListener attributionListener, MyTrackerAttribution myTrackerAttribution) {
        try {
            attributionListener.onReceiveAttribution(myTrackerAttribution);
        } catch (Throwable unused) {
            z0.b("AttributionHandler error: exception at AttributionListener::onReceiveAttribution()");
        }
    }

    public void a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "AttributionHandler: referrer is empty";
        } else {
            if (!a()) {
                try {
                    String queryParameter = Uri.parse("https://my.com/?" + URLDecoder.decode(str, C.UTF8_NAME)).getQueryParameter("mt_deeplink");
                    if (TextUtils.isEmpty(queryParameter)) {
                        z0.a("AttributionHandler: deeplink is empty");
                        return;
                    } else {
                        a(new JSONObject().put("deeplink", queryParameter));
                        return;
                    }
                } catch (Throwable th) {
                    z0.b("AttributionHandler error: handling referrer failed with error: ", th);
                    return;
                }
            }
            str2 = "AttributionHandler: attribution has already been received";
        }
        z0.a(str2);
    }

    void a(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("deeplink");
        if (TextUtils.isEmpty(strOptString)) {
            z0.a("AttributionHandler: deeplink is empty");
            return;
        }
        if (!this.f4229a.compareAndSet(false, true)) {
            z0.a("AttributionHandler: attribution has already been received");
            return;
        }
        r0 r0VarA = r0.a(this.c);
        if (!TextUtils.isEmpty(r0VarA.g())) {
            z0.a("AttributionHandler: attribution has already been received");
            return;
        }
        r0VarA.i(jSONObject.toString());
        final MyTracker.AttributionListener attributionListenerD = this.b.d();
        if (attributionListenerD == null) {
            return;
        }
        Handler handlerC = this.b.c();
        if (handlerC == null) {
            handlerC = g.f4225a;
        }
        final MyTrackerAttribution myTrackerAttributionNewAttribution = MyTrackerAttribution.newAttribution(strOptString);
        try {
            handlerC.post(new Runnable() { // from class: com.my.tracker.obfuscated.h$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    h.a(attributionListenerD, myTrackerAttributionNewAttribution);
                }
            });
        } catch (Throwable th) {
            z0.b("AttributionHandler error: exception occurred while post runnable", th);
        }
    }

    boolean a() {
        if (this.f4229a.get()) {
            return true;
        }
        return !TextUtils.isEmpty(r0.a(this.c).g());
    }

    public void b(String str) {
        if (a()) {
            z0.a("AttributionHandler: attribution has already been received");
            return;
        }
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("attribution");
            if (jSONObjectOptJSONObject == null) {
                z0.a("AttributionHandler: empty attribution object has been returned");
                return;
            }
            if (!jSONObjectOptJSONObject.has("error")) {
                a(jSONObjectOptJSONObject);
                return;
            }
            z0.a("AttributionHandler: attribution response returned error " + jSONObjectOptJSONObject.optInt("error"));
        } catch (Throwable th) {
            z0.b("AttributionHandler error: handling server attribution failed with error: ", th);
        }
    }
}
