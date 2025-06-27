package com.applovin.impl;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorPublisher;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.f4;
import com.applovin.impl.g4;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.gms.ads.AdError;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class f4 implements AppLovinCommunicatorSubscriber, AppLovinCommunicatorPublisher {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f410a;
    private final l4 b;
    private List c;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f411a;

        static {
            int[] iArr = new int[g4.a.values().length];
            f411a = iArr;
            try {
                iArr[g4.a.UNIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f411a[g4.a.TERMS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public interface c {
        void a(b bVar);
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "consent_flow_manager";
    }

    public boolean j() {
        com.applovin.impl.sdk.k kVar = com.applovin.impl.sdk.k.A0;
        if (!kVar.D0()) {
            return false;
        }
        f4 f4VarT = kVar.t();
        List list = f4VarT.c;
        return f4VarT.b.b() || (list != null && list.size() > 0);
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private boolean f412a;
        private d4 b;

        public b() {
        }

        public String toString() {
            return "ConsentFlowManager.FlowCompletionStatus(cmpPromptShown=" + b() + ", error=" + a() + ")";
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (!bVar.a((Object) this) || b() != bVar.b()) {
                return false;
            }
            d4 d4VarA = a();
            d4 d4VarA2 = bVar.a();
            return d4VarA != null ? d4VarA.equals(d4VarA2) : d4VarA2 == null;
        }

        public int hashCode() {
            int i = b() ? 79 : 97;
            d4 d4VarA = a();
            return ((i + 59) * 59) + (d4VarA == null ? 43 : d4VarA.hashCode());
        }

        public boolean b() {
            return this.f412a;
        }

        public b(d4 d4Var) {
            this.b = d4Var;
        }

        protected boolean a(Object obj) {
            return obj instanceof b;
        }

        public d4 a() {
            return this.b;
        }

        public void a(boolean z) {
            this.f412a = z;
        }

        public void a(d4 d4Var) {
            this.b = d4Var;
        }
    }

    public f4(com.applovin.impl.sdk.k kVar) {
        this.f410a = kVar;
        this.b = new l4(kVar);
    }

    public g4 d() {
        return (g4) this.f410a.u();
    }

    public boolean k() {
        Map<String, String> extraParameters = this.f410a.g0().getExtraParameters();
        if (extraParameters.containsKey("consent_flow_enabled")) {
            return Boolean.parseBoolean(extraParameters.get("consent_flow_enabled"));
        }
        return d().isEnabled();
    }

    public g4.a e() {
        return d().a();
    }

    public Uri h() {
        return d().getPrivacyPolicyUri();
    }

    public Uri i() {
        return d().getTermsOfServiceUri();
    }

    public AppLovinSdkConfiguration.ConsentFlowUserGeography f() {
        return d().getDebugUserGeography();
    }

    public static g4 b(JSONObject jSONObject) {
        Boolean bool = JsonUtils.getBoolean(jSONObject, "consent_flow_enabled", Boolean.FALSE);
        String string = JsonUtils.getString(jSONObject, "consent_flow_debug_user_geography", "");
        String string2 = JsonUtils.getString(jSONObject, "consent_flow_terms_of_service", null);
        Uri uri = StringUtils.isValidString(string2) ? Uri.parse(string2) : null;
        String string3 = JsonUtils.getString(jSONObject, "consent_flow_privacy_policy", null);
        return new g4(bool.booleanValue(), a(string), g4.a.UNIFIED, StringUtils.isValidString(string3) ? Uri.parse(string3) : null, uri);
    }

    public static g4 a(JSONObject jSONObject) {
        Boolean bool = JsonUtils.getBoolean(jSONObject, "terms_flow_enabled", Boolean.FALSE);
        String string = JsonUtils.getString(jSONObject, "terms_flow_terms_of_service", null);
        Uri uri = StringUtils.isValidString(string) ? Uri.parse(string) : null;
        String string2 = JsonUtils.getString(jSONObject, "terms_flow_privacy_policy", null);
        return new g4(bool.booleanValue(), AppLovinSdkConfiguration.ConsentFlowUserGeography.UNKNOWN, g4.a.TERMS, StringUtils.isValidString(string2) ? Uri.parse(string2) : null, uri);
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if (i() != null && appLovinCommunicatorMessage.getMessageData().getBoolean("include_tos")) {
            this.c = m4.b(this.f410a);
        } else {
            this.c = m4.a(this.f410a);
        }
        if (this.c.size() == 0) {
            zp.a("No Consent Flow Available", (String) null, this.f410a.p0());
        } else {
            b(this.f410a.p0(), new c() { // from class: com.applovin.impl.f4$$ExternalSyntheticLambda2
                @Override // com.applovin.impl.f4.c
                public final void a(f4.b bVar) {
                    this.f$0.a(bVar);
                }
            });
        }
    }

    public static g4 a(Context context) {
        if (context == null) {
            com.applovin.impl.sdk.t.h("AppLovinSdk", "Failed to get default terms flow settings.");
            return new g4(false, AppLovinSdkConfiguration.ConsentFlowUserGeography.UNKNOWN, g4.a.TERMS, null, null);
        }
        String strA = zp.a(context.getResources().getIdentifier("applovin_settings", "raw", context.getPackageName()), context, (com.applovin.impl.sdk.k) null);
        JSONObject jSONObjectJsonObjectFromJsonString = StringUtils.isValidString(strA) ? JsonUtils.jsonObjectFromJsonString(strA, new JSONObject()) : new JSONObject();
        g4.a aVarC = c(jSONObjectJsonObjectFromJsonString);
        int i = a.f411a[aVarC.ordinal()];
        if (i == 1) {
            return b(JsonUtils.getJSONObject(jSONObjectJsonObjectFromJsonString, "consent_flow_settings", new JSONObject()));
        }
        if (i == 2) {
            return a(JsonUtils.getJSONObject(jSONObjectJsonObjectFromJsonString, "terms_flow_settings", new JSONObject()));
        }
        throw new IllegalStateException("Unknown consent flow type: " + aVarC);
    }

    public JSONObject c() throws JSONException {
        g4 g4VarD = d();
        Uri privacyPolicyUri = g4VarD.getPrivacyPolicyUri();
        Uri termsOfServiceUri = g4VarD.getTermsOfServiceUri();
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, com.json.m4.r, String.valueOf(k()));
        JsonUtils.putString(jSONObject, "privacy_policy_url", privacyPolicyUri != null ? privacyPolicyUri.toString() : "");
        JsonUtils.putString(jSONObject, "terms_of_service_url", termsOfServiceUri != null ? termsOfServiceUri.toString() : "");
        return jSONObject;
    }

    public String g() {
        d();
        Object objH = h();
        Object objI = i();
        StringBuilder sb = new StringBuilder();
        sb.append("\nConsent Flow Enabled - ");
        sb.append(k());
        sb.append("\nPrivacy Policy - ");
        if (objH == null) {
            objH = AdError.UNDEFINED_DOMAIN;
        }
        sb.append(objH);
        sb.append("\nTerms of Service - ");
        if (objI == null) {
            objI = AdError.UNDEFINED_DOMAIN;
        }
        sb.append(objI);
        return sb.toString();
    }

    private Uri b() {
        return Uri.parse((String) this.f410a.a(this.f410a.E0() ? oj.v6 : oj.u6));
    }

    private static g4.a c(JSONObject jSONObject) {
        return jSONObject.has("consent_flow_settings") ? g4.a.UNIFIED : g4.a.TERMS;
    }

    public void a() {
        if (k()) {
            if (d().a() == g4.a.UNIFIED) {
                this.f410a.L();
                if (com.applovin.impl.sdk.t.a()) {
                    this.f410a.L().a("AppLovinSdk", "Generating Unified Consent Flow...");
                }
                this.c = e4.c(this.f410a);
            } else {
                this.f410a.L();
                if (com.applovin.impl.sdk.t.a()) {
                    this.f410a.L().a("AppLovinSdk", "Generating Terms Flow...");
                }
                this.c = e4.a(this.f410a);
            }
        }
        if (zp.i(com.applovin.impl.sdk.k.k())) {
            AppLovinCommunicator.getInstance(com.applovin.impl.sdk.k.k()).subscribe(this, "start_sdk_consent_flow");
        }
    }

    public void b(final Activity activity, final c cVar) {
        if (!k()) {
            cVar.a(new b(new d4(d4.d, "Failed to start consent flow. Please make sure that the consent flow is enabled.")));
            return;
        }
        List list = this.c;
        if (list != null && list.size() != 0) {
            a(activity, new Runnable() { // from class: com.applovin.impl.f4$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(activity, cVar);
                }
            });
        } else {
            this.f410a.b(qj.o, Boolean.FALSE);
            cVar.a(new b(new d4(d4.c, "User may not be eligible for flow.")));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(Uri uri, DialogInterface dialogInterface, int i) {
        throw new IllegalStateException("You cannot use the AppLovin SDK's consent flow without defining a Privacy Policy URL Please refer to " + uri.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Uri uri, DialogInterface dialogInterface, int i) {
        up.a(uri, com.applovin.impl.sdk.k.k(), this.f410a);
        throw new IllegalStateException("You cannot use the AppLovin SDK's consent flow without defining a Privacy Policy URL Please refer to " + uri.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Activity activity) {
        final Uri uriB = b();
        new AlertDialog.Builder(activity).setTitle("Missing Privacy Policy URL").setMessage("You cannot use the AppLovin SDK's consent flow without defining a Privacy Policy URL").setNeutralButton("Go To Documentation", new DialogInterface.OnClickListener() { // from class: com.applovin.impl.f4$$ExternalSyntheticLambda1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f$0.a(uriB, dialogInterface, i);
            }
        }).setNegativeButton("DISMISS", new DialogInterface.OnClickListener() { // from class: com.applovin.impl.f4$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                f4.b(uriB, dialogInterface, i);
            }
        }).create().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(c cVar, b bVar) {
        if (bVar.b != null) {
            if (bVar.b.a() != d4.e) {
                this.c = null;
            }
        } else {
            this.f410a.b(qj.o, Boolean.FALSE);
            this.c = null;
        }
        cVar.a(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Activity activity, final c cVar) {
        this.f410a.L();
        if (com.applovin.impl.sdk.t.a()) {
            this.f410a.L().a("ConsentFlowManager", "Starting consent flow with states: " + this.c);
        }
        if (!this.f410a.w0()) {
            this.f410a.b(qj.o, Boolean.TRUE);
        }
        this.b.a(this.c, activity, new c() { // from class: com.applovin.impl.f4$$ExternalSyntheticLambda3
            @Override // com.applovin.impl.f4.c
            public final void a(f4.b bVar) {
                this.f$0.a(cVar, bVar);
            }
        });
    }

    private void a(final Activity activity, Runnable runnable) {
        if (d().getPrivacyPolicyUri() != null) {
            runnable.run();
        } else {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.f4$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(activity);
                }
            });
        }
    }

    private static AppLovinSdkConfiguration.ConsentFlowUserGeography a(String str) {
        if ("gdpr".equalsIgnoreCase(str)) {
            return AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR;
        }
        if ("other".equalsIgnoreCase(str)) {
            return AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER;
        }
        return AppLovinSdkConfiguration.ConsentFlowUserGeography.UNKNOWN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(b bVar) {
        AppLovinCommunicator.getInstance(com.applovin.impl.sdk.k.k()).getMessagingService().publish(new AppLovinCommunicatorMessage(new Bundle(), "sdk_consent_flow_finished", this));
    }
}
