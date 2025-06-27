package com.my.tracker.recsys;

import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.json.m4;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.my.tracker.MyTracker;
import com.my.tracker.obfuscated.g;
import com.my.tracker.obfuscated.z;
import com.my.tracker.obfuscated.z0;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class OfferRequest {

    /* renamed from: a, reason: collision with root package name */
    final OnCompleteListener f4282a;
    final Handler b;
    public final String data;
    public final List<String> placementIds;
    public final Boolean reset;
    public final String userId;
    private final AtomicBoolean d = new AtomicBoolean(false);
    final String c = "https://recsys.tracker.my.com/api/public/v3/rec/item";

    public interface OnCompleteListener {
        void onComplete(OfferRequest offerRequest, List<Offer> list, String str);
    }

    class a implements z.a {
        a() {
        }

        @Override // com.my.tracker.obfuscated.z.a
        public String a() {
            return m4.K;
        }

        @Override // com.my.tracker.obfuscated.z.a
        public void a(OutputStream outputStream) throws IOException {
            if (TextUtils.isEmpty(OfferRequest.this.data)) {
                return;
            }
            outputStream.write(OfferRequest.this.data.getBytes(C.UTF8_NAME));
        }
    }

    OfferRequest(String str, List<String> list, String str2, Boolean bool, OnCompleteListener onCompleteListener, Handler handler) {
        this.userId = str;
        this.placementIds = list;
        this.data = str2;
        this.reset = bool;
        this.f4282a = onCompleteListener;
        this.b = handler;
    }

    static List<Offer> a(String str) {
        try {
            JSONArray jSONArray = new JSONObject(str).getJSONArray("data");
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    String strOptString = jSONObject.optString("placement_id");
                    int iOptInt = jSONObject.optInt("test_id");
                    int iOptInt2 = jSONObject.optInt("split_id");
                    JSONObject jSONObject2 = jSONObject.getJSONObject("offer");
                    arrayList.add(new Offer(strOptString, jSONObject2.optString(FirebaseAnalytics.Param.ITEM_ID), jSONObject2.optDouble("price"), jSONObject2.optDouble("discount_price"), jSONObject2.optInt("value"), jSONObject2.optInt("discount_value"), iOptInt, iOptInt2));
                } catch (Throwable unused) {
                    z0.a("OfferRequest: json response has invalid item");
                }
            }
            return arrayList;
        } catch (Throwable unused2) {
            z0.a("OfferRequest: error occurred while parsing values from json response");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a() {
        String id = MyTracker.getTrackerConfig().getId();
        if (TextUtils.isEmpty(id)) {
            z0.b("OfferRequest: MyTracker hasn't been initialized yet, MyTracker.initTracker() should be called first");
            a(this, this.b, this.f4282a, (z.b<String>) null);
        } else {
            a(this, this.b, this.f4282a, z.a(new a(), null, false).a(a(this.c, id)));
        }
    }

    static void a(final OfferRequest offerRequest, Handler handler, final OnCompleteListener onCompleteListener, z.b<String> bVar) {
        final String str;
        final List<Offer> list = null;
        if (bVar == null) {
            str = "MyTracker hasn't been initialized yet";
        } else if (bVar.b()) {
            String strA = bVar.a();
            if (TextUtils.isEmpty(strA)) {
                z0.a("OfferRequest: http response is empty ");
                str = "Empty response";
            } else {
                List<Offer> listA = a(strA);
                if (listA == null) {
                    z0.a("OfferRequest: error while parsing offers from response");
                    str = "Offers parsing error";
                } else {
                    list = listA;
                    str = null;
                }
            }
        } else {
            z0.a("OfferRequest: http response is unsuccessful");
            str = "Unsuccessful response";
        }
        handler.post(new Runnable() { // from class: com.my.tracker.recsys.OfferRequest$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                onCompleteListener.onComplete(offerRequest, list, str);
            }
        });
    }

    String a(String str, String str2) {
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        builderBuildUpon.appendQueryParameter("custom_user_id", this.userId);
        builderBuildUpon.appendQueryParameter(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, str2);
        Boolean bool = this.reset;
        if (bool != null) {
            builderBuildUpon.appendQueryParameter("reset", String.valueOf(bool));
        }
        if (!this.placementIds.isEmpty()) {
            int size = this.placementIds.size();
            for (int i = 0; i < size; i++) {
                builderBuildUpon.appendQueryParameter("placement_id", this.placementIds.get(i));
            }
        }
        return builderBuildUpon.toString();
    }

    public void send() {
        if (this.f4282a == null) {
            z0.a("OfferRequest: listener is null, offers from response can not be returned");
        } else if (this.d.compareAndSet(false, true)) {
            g.b(new Runnable() { // from class: com.my.tracker.recsys.OfferRequest$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a();
                }
            });
        } else {
            z0.a("OfferRequest: send has already been called");
        }
    }
}
