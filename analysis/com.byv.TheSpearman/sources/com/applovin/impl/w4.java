package com.applovin.impl;

import android.R;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.core.net.MailTo;
import androidx.webkit.internal.AssetHelper;
import com.applovin.creative.MaxCreativeDebuggerActivity;
import com.applovin.creative.MaxCreativeDebuggerDisplayedAdActivity;
import com.applovin.impl.q6;
import com.applovin.impl.r;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.unity3d.ads.core.domain.InitializeAndroidBoldSDK;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;

/* loaded from: classes.dex */
public class w4 implements q6.a {
    private static WeakReference m;
    private static final AtomicBoolean n = new AtomicBoolean();

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f1114a;
    private final Context b;
    private final v4 e;
    private q6 g;
    private ho h;
    private int i;
    private boolean j;
    private long k;
    private boolean l;
    private final List c = new ArrayList(10);
    private final Object d = new Object();
    private WeakReference f = new WeakReference(null);

    private Drawable f() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.rgb(5, 131, Opcodes.TABLESWITCH));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(1);
        gradientDrawable2.setColor(Color.rgb(2, 98, 127));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        return stateListDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean h() {
        WeakReference weakReference = m;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    public w4(com.applovin.impl.sdk.k kVar) {
        this.f1114a = kVar;
        Context contextK = com.applovin.impl.sdk.k.k();
        this.b = contextK;
        this.e = new v4(contextK);
    }

    public void l() {
        if (g()) {
            this.j = ((Boolean) this.f1114a.a(oj.E1)).booleanValue();
            if (this.g == null) {
                this.g = new q6(this.f1114a, this);
            }
            this.g.a();
        }
    }

    public void k() {
        q6 q6Var = this.g;
        if (q6Var != null) {
            q6Var.b();
        }
    }

    public void d(Object obj) {
        if (g() && obj != null) {
            if (!ve.b(obj) || c(obj)) {
                if (ve.a(obj) && c(obj)) {
                    return;
                }
                synchronized (this.d) {
                    this.c.add(0, new u6(obj, System.currentTimeMillis()));
                    if (this.c.size() > 10) {
                        this.c.remove(r7.size() - 1);
                    }
                }
            }
        }
    }

    public void n() {
        ArrayList arrayList;
        if (!h() && n.compareAndSet(false, true)) {
            Object objA = this.f1114a.E().a();
            if (objA != null) {
                e(objA);
                return;
            }
            synchronized (this.d) {
                arrayList = new ArrayList(this.c);
            }
            this.e.a(arrayList, this.f1114a);
            if (!this.l) {
                m();
                this.l = true;
            }
            com.applovin.impl.sdk.t.g("AppLovinSdk", "Starting Creative Debugger...");
            r.a(this.b, MaxCreativeDebuggerActivity.class);
            return;
        }
        com.applovin.impl.sdk.t.h("AppLovinSdk", "Creative Debugger is already showing");
    }

    public boolean g() {
        return ((Boolean) this.f1114a.a(oj.D1)).booleanValue() && this.f1114a.g0().isCreativeDebuggerEnabled();
    }

    class a extends p {
        a() {
        }

        @Override // com.applovin.impl.p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof MaxCreativeDebuggerActivity) {
                com.applovin.impl.sdk.t.g("AppLovinSdk", "Started Creative Debugger");
                if (!w4.this.h() || w4.m.get() != activity) {
                    MaxCreativeDebuggerActivity maxCreativeDebuggerActivity = (MaxCreativeDebuggerActivity) activity;
                    WeakReference unused = w4.m = new WeakReference(maxCreativeDebuggerActivity);
                    maxCreativeDebuggerActivity.a(w4.this.e, w4.this.f1114a.e());
                }
                w4.n.set(false);
            }
        }

        @Override // com.applovin.impl.p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (activity instanceof MaxCreativeDebuggerActivity) {
                com.applovin.impl.sdk.t.g("AppLovinSdk", "Creative Debugger destroyed");
                WeakReference unused = w4.m = null;
            }
        }
    }

    private void m() {
        this.f1114a.e().a(new a());
    }

    class b implements r.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f1116a;

        b(Object obj) {
            this.f1116a = obj;
        }

        @Override // com.applovin.impl.r.b
        public void a(MaxCreativeDebuggerDisplayedAdActivity maxCreativeDebuggerDisplayedAdActivity) {
            maxCreativeDebuggerDisplayedAdActivity.a(new u6(this.f1116a, w4.this.f1114a.E().b()), w4.this.f1114a);
            w4.n.set(false);
        }
    }

    private boolean c(Object obj) {
        MaxAdFormat format;
        if (obj instanceof com.applovin.impl.sdk.ad.b) {
            format = ((com.applovin.impl.sdk.ad.b) obj).getAdZone().d();
        } else {
            format = obj instanceof be ? ((be) obj).getFormat() : null;
        }
        return format != null && format.isFullscreenAd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j() {
        this.i = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (g() && this.f.get() == null && !h()) {
            Activity activityB = this.f1114a.e().b();
            if (activityB == null) {
                this.f1114a.L();
                if (com.applovin.impl.sdk.t.a()) {
                    this.f1114a.L().b("AppLovinSdk", "Failed to display Creative Debugger button");
                    return;
                }
                return;
            }
            View viewFindViewById = activityB.findViewById(R.id.content);
            if (viewFindViewById instanceof FrameLayout) {
                final FrameLayout frameLayout = (FrameLayout) viewFindViewById;
                final View viewA = a(frameLayout, activityB);
                frameLayout.addView(viewA);
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(150L);
                viewA.startAnimation(alphaAnimation);
                final ViewTreeObserver viewTreeObserver = viewFindViewById.getViewTreeObserver();
                final ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.applovin.impl.w4$$ExternalSyntheticLambda2
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public final void onGlobalLayout() {
                        this.f$0.a(viewA, frameLayout);
                    }
                };
                viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
                AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.w4$$ExternalSyntheticLambda6
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.a(viewA, frameLayout, viewTreeObserver, onGlobalLayoutListener);
                    }
                }, TimeUnit.SECONDS.toMillis(5L));
                this.f = new WeakReference(viewA);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        long seconds = TimeUnit.MILLISECONDS.toSeconds(SystemClock.elapsedRealtime() - this.k);
        if (this.k == 0 || seconds < 10) {
            return;
        }
        this.f1114a.B().a(o.b.GENERIC, "showingMediationDebuggerFromHoldingCreativeDebuggerButton");
        this.f1114a.X0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.view.View, android.widget.ImageButton, android.widget.ImageView] */
    private View a(final FrameLayout frameLayout, Activity activity) {
        Button button;
        int iDpToPx = AppLovinSdkUtils.dpToPx(activity, 40);
        int i = iDpToPx / 10;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iDpToPx, iDpToPx, 8388629);
        layoutParams.setMargins(i, i, i, i);
        try {
            ?? imageButton = new ImageButton(activity);
            imageButton.setImageDrawable(activity.getResources().getDrawable(com.applovin.sdk.R.drawable.applovin_ic_white_small));
            imageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageButton.setPadding(i, i, i, i * 2);
            button = imageButton;
        } catch (Throwable unused) {
            Button button2 = new Button(activity);
            button2.setText("ⓘ");
            button2.setTextColor(-1);
            button2.setAllCaps(false);
            button2.setTextSize(2, 20.0f);
            button2.setPadding(0, 0, 0, 0);
            button = button2;
        }
        button.setLayoutParams(layoutParams);
        button.setBackground(f());
        if (this.j) {
            button.setOnTouchListener(new View.OnTouchListener() { // from class: com.applovin.impl.w4$$ExternalSyntheticLambda1
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return this.f$0.a(frameLayout, view, motionEvent);
                }
            });
        } else {
            button.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.w4$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f$0.a(view);
                }
            });
        }
        if (x3.f()) {
            button.setElevation(AppLovinSdkUtils.dpToPx(activity, 5));
        }
        return button;
    }

    public String b(Object obj) {
        JSONObject jSONObjectA;
        if (obj instanceof com.applovin.impl.sdk.ad.b) {
            return ((com.applovin.impl.sdk.ad.b) obj).getOriginalFullResponse().toString();
        }
        if (!(obj instanceof be)) {
            return null;
        }
        String strC = ((be) obj).C();
        return (!ve.a(obj) || (jSONObjectA = new w(strC, this.f1114a).a()) == null) ? strC : jSONObjectA.toString();
    }

    private void e(Object obj) {
        com.applovin.impl.sdk.t.g("AppLovinSdk", "Starting Creative Debugger for current fullscreen ad...");
        r.a(this.b, MaxCreativeDebuggerDisplayedAdActivity.class, this.f1114a.e(), new b(obj));
    }

    @Override // com.applovin.impl.q6.a
    public void b() {
        if (this.i == 0) {
            this.h = ho.a(TimeUnit.SECONDS.toMillis(3L), this.f1114a, new Runnable() { // from class: com.applovin.impl.w4$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.j();
                }
            });
        }
        int i = this.i;
        if (i % 2 == 0) {
            this.i = i + 1;
        }
    }

    public void a(u6 u6Var, Context context, boolean z) {
        Object objA = u6Var.a();
        String strA = a(u6Var);
        lc lcVar = new lc();
        if (z) {
            lcVar.b("Please describe the issue you had with this ad:\n\n\n\n");
        }
        lcVar.b(strA);
        String strB = this.f1114a.v().b(objA);
        if (strB != null) {
            lcVar.a("\nBid Response:\n");
            lcVar.a(strB);
        }
        String str = "AppLovin Ad Report";
        Intent intentCreateChooser = Intent.createChooser(new Intent("android.intent.action.SEND").setType(AssetHelper.DEFAULT_MIME_TYPE).putExtra("android.intent.extra.SUBJECT", objA instanceof com.applovin.impl.sdk.ad.b ? "AppLovin Ad Report" : "MAX Ad Report").putExtra("android.intent.extra.TEXT", lcVar.toString()).setPackage(null), "Share Ad Report");
        if (z) {
            try {
                Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse(MailTo.MAILTO_SCHEME));
                if (!(objA instanceof com.applovin.impl.sdk.ad.b)) {
                    str = "MAX Ad Report";
                }
                context.startActivity(intent.putExtra("android.intent.extra.SUBJECT", str).putExtra("android.intent.extra.TEXT", lcVar.toString()).setPackage("com.google.android.gm"));
                return;
            } catch (ActivityNotFoundException unused) {
                context.startActivity(intentCreateChooser);
                return;
            }
        }
        context.startActivity(intentCreateChooser);
    }

    private void b(View view, FrameLayout frameLayout) {
        if (this.j) {
            view.setOnTouchListener(null);
            this.k = 0L;
        }
        frameLayout.removeView(view);
        this.f = new WeakReference(null);
    }

    public String a(u6 u6Var) {
        String strV;
        Object objA = u6Var.a();
        lc lcVar = new lc();
        lcVar.b("Ad Info:\n");
        if (objA instanceof com.applovin.impl.sdk.ad.b) {
            com.applovin.impl.sdk.ad.b bVar = (com.applovin.impl.sdk.ad.b) objA;
            lcVar.a(InitializeAndroidBoldSDK.MSG_NETWORK, "APPLOVIN").a(bVar).b(bVar);
        } else if (objA instanceof be) {
            lcVar.a((be) objA);
        }
        lcVar.a(this.f1114a);
        lcVar.a("Epoch Timestamp (ms)", Long.valueOf(u6Var.b()));
        if (this.f1114a.y() != null) {
            strV = this.f1114a.z().u();
        } else {
            strV = this.f1114a.x().v();
        }
        lcVar.a("\nDebug Info:\n").a("Platform", "fireos".equals(strV) ? "Fire OS" : com.json.t2.e).a("AppLovin SDK Version", AppLovinSdk.VERSION).a("Plugin Version", this.f1114a.a(oj.U3)).a("App Package Name", this.b.getPackageName()).a("Device", String.format("%s %s (%s)", Build.BRAND, Build.MODEL, Build.DEVICE)).a("OS Version", Build.VERSION.RELEASE).a("AppLovin Random Token", this.f1114a.c0()).a("Ad Review Version", v.b()).a(a(objA)).a("User ID", this.f1114a.t0().c() != null ? this.f1114a.t0().c() : "None").a("AEI", this.f1114a.a(oj.z)).a("MEI", this.f1114a.a(oj.A)).a(com.json.td.B, this.f1114a.a(oj.B));
        return lcVar.toString();
    }

    private Bundle a(Object obj) {
        this.f1114a.L();
        if (com.applovin.impl.sdk.t.a()) {
            this.f1114a.L().a("CreativeDebuggerService", "Retrieving Ad Review info for ad: " + obj);
        }
        String strA = zp.a(obj);
        Bundle bundleA = this.f1114a.h().a(strA);
        this.f1114a.L();
        if (com.applovin.impl.sdk.t.a()) {
            this.f1114a.L().a("CreativeDebuggerService", "Serve id: " + strA);
        }
        this.f1114a.L();
        if (com.applovin.impl.sdk.t.a()) {
            this.f1114a.L().a("CreativeDebuggerService", "Public data: " + bundleA);
        }
        if (bundleA == null) {
            return null;
        }
        for (String str : bundleA.keySet()) {
            Object obj2 = bundleA.get(str);
            bundleA.remove(str);
            BundleUtils.put(StringUtils.toHumanReadableString(str), obj2, bundleA);
        }
        return bundleA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view, FrameLayout frameLayout) {
        if (view.getParent() != null || this.f.get() == null) {
            return;
        }
        frameLayout.addView(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view, FrameLayout frameLayout, ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (this.k > 0 && this.j) {
            view.setVisibility(4);
        } else {
            b(view, frameLayout);
        }
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean a(FrameLayout frameLayout, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.k = SystemClock.elapsedRealtime();
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.w4$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.i();
                }
            }, TimeUnit.SECONDS.toMillis(10L));
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (view.getVisibility() == 0) {
                this.k = 0L;
                n();
            } else {
                b(view, frameLayout);
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        n();
    }

    @Override // com.applovin.impl.q6.a
    public void a() {
        int i = this.i;
        if (i % 2 == 1) {
            this.i = i + 1;
        }
        if (this.i / 2 == 2) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.w4$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.e();
                }
            });
            this.i = 0;
            this.h.a();
        }
    }
}
