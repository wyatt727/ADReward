package com.my.tracker.personalize;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.my.tracker.MyTracker;
import com.my.tracker.MyTrackerConfig;
import com.my.tracker.obfuscated.g;
import com.my.tracker.obfuscated.z;
import com.my.tracker.obfuscated.z0;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class PersonalizeApiClient {

    /* renamed from: a, reason: collision with root package name */
    private final a f4275a;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private List<String> f4276a;
        private Context b;

        public PersonalizeApiClient build() {
            String id = MyTracker.getTrackerConfig().getId();
            if (TextUtils.isEmpty(id)) {
                z0.a("Builder: MyTracker hasn't been initialized. Initialize it before using Personalize API");
                return null;
            }
            Context context = this.b;
            return new PersonalizeApiClient(new a(id, context != null ? MyTracker.getInstanceId(context) : null, this.f4276a));
        }

        public Builder withTestDevices(Context context, List<String> list) {
            this.f4276a = list;
            this.b = context;
            return this;
        }
    }

    public interface OnCompleteListener<T> {
        void onRequestComplete(PersonalizeApiClient personalizeApiClient, PersonalizeRequest<T> personalizeRequest, PersonalizeResponse<T> personalizeResponse);
    }

    PersonalizeApiClient(a aVar) {
        this.f4275a = aVar;
    }

    private String a(PersonalizeRequest<?> personalizeRequest, a aVar) {
        String str = aVar.b + "/api/v1/recommendation" + personalizeRequest.a();
        Map<String, List<String>> mapB = personalizeRequest.b();
        mapB.remove(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY);
        if (mapB.isEmpty()) {
            return str;
        }
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry<String, List<String>> entry : mapB.entrySet()) {
            String key = entry.getKey();
            Iterator<String> it = entry.getValue().iterator();
            while (it.hasNext()) {
                builderBuildUpon.appendQueryParameter(key, it.next());
            }
        }
        builderBuildUpon.appendQueryParameter(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, aVar.f4279a);
        return builderBuildUpon.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(OnCompleteListener onCompleteListener, PersonalizeRequest personalizeRequest, PersonalizeResponse personalizeResponse) {
        onCompleteListener.onRequestComplete(this, personalizeRequest, personalizeResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(OnCompleteListener onCompleteListener, PersonalizeRequest personalizeRequest, String str) {
        onCompleteListener.onRequestComplete(this, personalizeRequest, new PersonalizeResponse(null, str, null));
    }

    private <T> void a(PersonalizeRequest<T> personalizeRequest, z.b<String> bVar, Handler handler, OnCompleteListener<T> onCompleteListener) {
        T t;
        String str;
        String str2;
        if (bVar == null) {
            z0.a("PersonalizeApiClient: MyTracker hasn't been initialized yet");
            t = null;
            str = null;
            str2 = "MyTracker hasn't been initialized yet";
        } else {
            String strA = bVar.a();
            if (!TextUtils.isEmpty(strA)) {
                try {
                    c<T> cVarA = personalizeRequest.c().a(new JSONObject(strA));
                    String strA2 = cVarA.a();
                    if (strA2 != null) {
                        a(personalizeRequest, null, null, handler, strA2, onCompleteListener);
                    } else {
                        a(personalizeRequest, cVarA.b(), strA, handler, null, onCompleteListener);
                    }
                    return;
                } catch (Throwable th) {
                    String str3 = "Can't parse JSON with error: " + th.getMessage();
                    z0.a("PersonalizeApiClient: " + str3);
                    a(personalizeRequest, null, null, handler, str3, onCompleteListener);
                    return;
                }
            }
            z0.a("PersonalizeApiClient: HTTP response is empty");
            t = null;
            str = null;
            str2 = "HTTP response is empty";
        }
        a(personalizeRequest, t, str, handler, str2, onCompleteListener);
    }

    private <T> void a(final PersonalizeRequest<T> personalizeRequest, T t, String str, Handler handler, final String str2, final OnCompleteListener<T> onCompleteListener) {
        Runnable runnable;
        if (handler == null) {
            handler = g.f4225a;
        }
        if (TextUtils.isEmpty(str2)) {
            final PersonalizeResponse personalizeResponse = new PersonalizeResponse(t, null, str);
            runnable = new Runnable() { // from class: com.my.tracker.personalize.PersonalizeApiClient$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(onCompleteListener, personalizeRequest, personalizeResponse);
                }
            };
        } else {
            z0.b("PersonalizeApiClient: " + str2);
            runnable = new Runnable() { // from class: com.my.tracker.personalize.PersonalizeApiClient$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(onCompleteListener, personalizeRequest, str2);
                }
            };
        }
        handler.post(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, PersonalizeRequest personalizeRequest, Handler handler, OnCompleteListener onCompleteListener) {
        a(personalizeRequest, z.a((MyTrackerConfig.OkHttpClientProvider) null).a(str), handler, onCompleteListener);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public <T> void sendRequest(final PersonalizeRequest<T> personalizeRequest, final Handler handler, final OnCompleteListener<T> onCompleteListener) {
        final String strA = a(personalizeRequest, this.f4275a);
        g.b(new Runnable() { // from class: com.my.tracker.personalize.PersonalizeApiClient$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(strA, personalizeRequest, handler, onCompleteListener);
            }
        });
    }
}
