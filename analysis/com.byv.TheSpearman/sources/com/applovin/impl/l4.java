package com.applovin.impl;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.net.Uri;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import com.applovin.impl.f4;
import com.applovin.impl.g4;
import com.applovin.impl.h4;
import com.applovin.impl.j4;
import com.applovin.impl.privacy.cmp.CmpServiceImpl;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinCmpError;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.applovin.sdk.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class l4 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f619a;
    private final int b;
    private List c;
    private String d;
    private h4 e;
    private f4.c f;
    private f4.b g;
    private h4 h;
    private Dialog i;
    private final p j = new a();

    class a extends p {
        a() {
        }

        @Override // com.applovin.impl.p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            super.onActivityResumed(activity);
            if ((activity instanceof AppLovinWebViewActivity) || l4.this.h == null) {
                return;
            }
            if (l4.this.i != null) {
                l4 l4Var = l4.this;
                if (!r.a(l4Var.a(l4Var.i))) {
                    l4.this.i.dismiss();
                }
                l4.this.i = null;
            }
            h4 h4Var = l4.this.h;
            l4.this.h = null;
            l4 l4Var2 = l4.this;
            l4Var2.a(l4Var2.e, h4Var, activity);
        }
    }

    public l4(com.applovin.impl.sdk.k kVar) {
        this.f619a = kVar;
        this.b = ((Integer) kVar.a(oj.w6)).intValue();
    }

    public void c() {
        f4.b bVar;
        this.c = null;
        this.e = null;
        this.f619a.e().b(this.j);
        f4.c cVar = this.f;
        if (cVar != null && (bVar = this.g) != null) {
            cVar.a(bVar);
        }
        this.f = null;
        this.g = null;
    }

    class b implements DialogInterface.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ j4 f621a;
        final /* synthetic */ h4 b;
        final /* synthetic */ Activity c;

        b(j4 j4Var, h4 h4Var, Activity activity) {
            this.f621a = j4Var;
            this.b = h4Var;
            this.c = activity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            l4.this.h = null;
            l4.this.i = null;
            h4 h4VarA = l4.this.a(this.f621a.a());
            if (h4VarA == null) {
                l4.this.b("Destination state for TOS/PP alert is null");
                return;
            }
            l4.this.a(this.b, h4VarA, this.c);
            if (h4VarA.c() != h4.b.ALERT) {
                dialogInterface.dismiss();
            }
        }
    }

    class c extends ClickableSpan {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Uri f622a;
        final /* synthetic */ Activity b;

        c(Uri uri, Activity activity) {
            this.f622a = uri;
            this.b = activity;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            zp.a(this.f622a, this.b, l4.this.f619a);
        }
    }

    class d extends ClickableSpan {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Uri f623a;
        final /* synthetic */ Activity b;

        d(Uri uri, Activity activity) {
            this.f623a = uri;
            this.b = activity;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            zp.a(this.f623a, this.b, l4.this.f619a);
        }
    }

    class e implements CmpServiceImpl.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ h4 f624a;
        final /* synthetic */ Activity b;

        e(h4 h4Var, Activity activity) {
            this.f624a = h4Var;
            this.b = activity;
        }

        @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.d
        public void a(AppLovinCmpError appLovinCmpError) {
            l4.this.a(this.f624a, this.b, Boolean.valueOf(appLovinCmpError == null));
        }
    }

    class f implements CmpServiceImpl.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ h4 f625a;
        final /* synthetic */ Activity b;

        f(h4 h4Var, Activity activity) {
            this.f625a = h4Var;
            this.b = activity;
        }

        @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.e
        public void a(AppLovinCmpError appLovinCmpError) {
            if (appLovinCmpError == null && l4.this.g != null) {
                l4.this.g.a(true);
            }
            l4.this.b(this.f625a, this.b);
        }
    }

    private void c(final h4 h4Var, final Activity activity) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.l4$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(h4Var, activity);
            }
        });
    }

    class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ h4 f626a;

        g(h4 h4Var) {
            this.f626a = h4Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            l4 l4Var = l4.this;
            l4Var.a(l4Var.e, this.f626a, l4.this.f619a.p0());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        o6.a(str, new Object[0]);
        this.f619a.B().a(o.b.CONSENT_FLOW_ERROR, str, (Map) CollectionUtils.hashMap("details", "Last started states: " + this.d + "\nLast successful state: " + this.e));
        f4.b bVar = this.g;
        if (bVar != null) {
            bVar.a(new d4(d4.f, str));
        }
        c();
    }

    public boolean b() {
        return this.c != null;
    }

    private h4 a() {
        List<h4> list = this.c;
        if (list == null) {
            return null;
        }
        for (h4 h4Var : list) {
            if (h4Var.d()) {
                return h4Var;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(h4 h4Var, Activity activity) {
        a(h4Var, activity, (Boolean) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Activity a(Dialog dialog) {
        Context context = dialog.getContext();
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        if (baseContext instanceof Activity) {
            return (Activity) baseContext;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public h4 a(String str) {
        List<h4> list = this.c;
        if (list == null) {
            return null;
        }
        for (h4 h4Var : list) {
            if (str.equalsIgnoreCase(h4Var.b())) {
                return h4Var;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AlertDialog alertDialog, DialogInterface dialogInterface) {
        TextView textView = (TextView) alertDialog.findViewById(alertDialog.getContext().getResources().getIdentifier("android:id/alertTitle", null, null));
        textView.setLinkTextColor(textView.getCurrentTextColor());
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setMaxLines(this.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(h4 h4Var, Activity activity) {
        if (h4Var == null) {
            b("Consent flow state is null");
            return;
        }
        this.f619a.L();
        if (com.applovin.impl.sdk.t.a()) {
            this.f619a.L().a("AppLovinSdk", "Transitioning to state: " + h4Var);
        }
        if (h4Var.c() == h4.b.ALERT) {
            if (r.a(activity)) {
                a(h4Var);
                return;
            }
            i4 i4Var = (i4) h4Var;
            this.h = i4Var;
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            builder.setCancelable(false);
            for (j4 j4Var : i4Var.e()) {
                b bVar = new b(j4Var, h4Var, activity);
                if (j4Var.c() == j4.a.POSITIVE) {
                    builder.setPositiveButton(j4Var.d(), bVar);
                } else if (j4Var.c() == j4.a.NEGATIVE) {
                    builder.setNegativeButton(j4Var.d(), bVar);
                } else {
                    builder.setNeutralButton(j4Var.d(), bVar);
                }
            }
            String strG = i4Var.g();
            SpannableString spannableString = null;
            if (StringUtils.isValidString(strG)) {
                spannableString = new SpannableString(strG);
                String strA = com.applovin.impl.sdk.k.a(R.string.applovin_terms_of_service_text);
                String strA2 = com.applovin.impl.sdk.k.a(R.string.applovin_privacy_policy_text);
                if (StringUtils.containsAtLeastOneSubstring(strG, Arrays.asList(strA, strA2))) {
                    Uri uriI = this.f619a.t().i();
                    if (uriI != null) {
                        StringUtils.addLinks(spannableString, Pattern.compile(strA), new c(uriI, activity), true);
                    }
                    StringUtils.addLinks(spannableString, Pattern.compile(strA2), new d(this.f619a.t().h(), activity), true);
                }
            }
            final AlertDialog alertDialogCreate = builder.setTitle(spannableString).setMessage(i4Var.f()).create();
            alertDialogCreate.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.applovin.impl.l4$$ExternalSyntheticLambda0
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    this.f$0.a(alertDialogCreate, dialogInterface);
                }
            });
            this.i = alertDialogCreate;
            alertDialogCreate.show();
            return;
        }
        if (h4Var.c() == h4.b.EVENT) {
            k4 k4Var = (k4) h4Var;
            String strF = k4Var.f();
            Map<String, String> mapE = k4Var.e();
            if (mapE == null) {
                mapE = new HashMap<>(1);
            }
            mapE.put("flow_type", this.f619a.t().e().b());
            this.f619a.C().trackEvent(strF, mapE);
            b(k4Var, activity);
            return;
        }
        if (h4Var.c() == h4.b.HAS_USER_CONSENT) {
            a(true);
            b(h4Var, activity);
            return;
        }
        if (h4Var.c() == h4.b.CMP_LOAD) {
            if (r.a(activity)) {
                a(h4Var);
                return;
            } else {
                this.f619a.n().loadCmp(activity, new e(h4Var, activity));
                return;
            }
        }
        if (h4Var.c() == h4.b.CMP_SHOW) {
            if (r.a(activity)) {
                a(h4Var);
                return;
            } else {
                this.f619a.C().trackEvent("cf_start");
                this.f619a.n().showCmp(activity, new f(h4Var, activity));
                return;
            }
        }
        if (h4Var.c() == h4.b.DECISION) {
            h4.a aVarA = h4Var.a();
            if (aVarA != h4.a.IS_AL_GDPR) {
                b("Invalid consent flow decision type: " + aVarA);
                return;
            }
            AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeographyF = this.f619a.t().f();
            AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography = AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR;
            a(h4Var, activity, Boolean.valueOf(this.f619a.q().getConsentFlowUserGeography() == consentFlowUserGeography || (consentFlowUserGeographyF == consentFlowUserGeography && zp.c(this.f619a))));
            return;
        }
        if (h4Var.c() == h4.b.TERMS_FLOW) {
            List listA = e4.a(this.f619a);
            if (listA != null && listA.size() > 0) {
                this.f619a.C().trackEvent("cf_start");
                this.c = listA;
                a(h4Var, a(), activity);
                return;
            }
            c();
            return;
        }
        if (h4Var.c() == h4.b.REINIT) {
            c();
            return;
        }
        b("Invalid consent flow destination state: " + h4Var);
    }

    public void a(boolean z) {
        if (this.f619a.t().e() == g4.a.TERMS) {
            return;
        }
        y3.b(z, com.applovin.impl.sdk.k.k());
    }

    public void a(List list, Activity activity, f4.c cVar) {
        if (this.c != null) {
            this.f619a.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.f619a.L().a("AppLovinSdk", "Unable to start states: " + list);
            }
            this.f619a.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.f619a.L().a("AppLovinSdk", "Consent flow already in progress for states: " + this.c);
            }
            cVar.a(new f4.b(new d4(d4.e, "Consent flow is already in progress.")));
            return;
        }
        this.c = list;
        this.d = String.valueOf(list);
        this.f = cVar;
        this.g = new f4.b();
        com.applovin.impl.sdk.k.a(activity).a(this.j);
        a((h4) null, a(), activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(h4 h4Var, Activity activity, Boolean bool) {
        a(h4Var, a(h4Var.a(bool)), activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(h4 h4Var, h4 h4Var2, Activity activity) {
        this.e = h4Var;
        c(h4Var2, activity);
    }

    private void a(h4 h4Var) {
        AppLovinSdkUtils.runOnUiThreadDelayed(new g(h4Var), TimeUnit.SECONDS.toMillis(1L));
    }
}
