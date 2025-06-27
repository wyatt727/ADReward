package com.my.target;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.browser.customtabs.CustomTabsIntent;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.my.target.common.MyTargetActivity;
import com.my.target.da;
import com.my.target.ua;
import java.util.WeakHashMap;

/* loaded from: classes4.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public static final WeakHashMap<com.my.target.b, Boolean> f4186a = new WeakHashMap<>();

    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        public final com.my.target.b f4187a;

        public a(com.my.target.b bVar) {
            this.f4187a = bVar;
        }

        public static a a(com.my.target.b bVar) {
            return new b(bVar);
        }

        public static a a(String str, com.my.target.b bVar) {
            return da.d(str) ? new c(str, bVar) : new d(str, bVar);
        }

        public abstract boolean a(Context context);
    }

    public static final class b extends a {
        public b(com.my.target.b bVar) {
            super(bVar);
        }

        @Override // com.my.target.y0.a
        public boolean a(Context context) {
            Intent launchIntentForPackage;
            if (!"store".equals(this.f4187a.getNavigationType())) {
                return false;
            }
            String bundleId = null;
            if (Build.VERSION.SDK_INT < 30 || this.f4187a.isAppInWhiteList()) {
                bundleId = this.f4187a.getBundleId();
                if (bundleId == null || (launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(bundleId)) == null) {
                    return false;
                }
            } else {
                launchIntentForPackage = null;
            }
            if (y0.a(bundleId, this.f4187a.getDeeplink(), context)) {
                w9.a(this.f4187a.getStatHolder().b("deeplinkClick"), context);
                return true;
            }
            if (!a(bundleId, this.f4187a.getUrlscheme(), context) && !a(launchIntentForPackage, context)) {
                return false;
            }
            w9.a(this.f4187a.getStatHolder().b(CampaignEx.JSON_NATIVE_VIDEO_CLICK), context);
            String trackingLink = this.f4187a.getTrackingLink();
            if (trackingLink != null && !da.d(trackingLink)) {
                da.g(trackingLink).b(context);
            }
            return true;
        }

        public final boolean a(Intent intent, Context context) {
            if (intent == null) {
                return false;
            }
            return j3.a(intent, context);
        }

        public final boolean a(String str, String str2, Context context) {
            if (str2 == null) {
                return false;
            }
            return y0.b(str, str2, context);
        }
    }

    public static final class c extends d {
        public c(String str, com.my.target.b bVar) {
            super(str, bVar);
        }

        @Override // com.my.target.y0.d, com.my.target.y0.a
        public boolean a(Context context) {
            if (d(this.b, context)) {
                return true;
            }
            return super.a(context);
        }

        public final boolean d(String str, Context context) {
            return j3.a(str, context);
        }
    }

    public static class d extends a {
        public final String b;

        public d(String str, com.my.target.b bVar) {
            super(bVar);
            this.b = str;
        }

        @Override // com.my.target.y0.a
        public boolean a(Context context) {
            if (b(context)) {
                return true;
            }
            if (this.f4187a.isOpenInBrowser()) {
                return b(this.b, context);
            }
            if (a(this.b, context)) {
                return true;
            }
            return ("store".equals(this.f4187a.getNavigationType()) || (Build.VERSION.SDK_INT >= 28 && !da.c(this.b))) ? b(this.b, context) : c(this.b, context);
        }

        public final boolean a(String str, Context context) {
            Bundle bundle = new Bundle();
            bundle.putBinder(CustomTabsIntent.EXTRA_SESSION, null);
            return j3.a(str, "com.android.chrome", bundle, context);
        }

        public final boolean b(Context context) {
            if (!context.getPackageName().equals("ru.mail.browser")) {
                return false;
            }
            Bundle bundle = new Bundle();
            bundle.putString("com.android.browser.application_id", "ru.mail.browser");
            return j3.a(this.b, "ru.mail.browser", bundle, context);
        }

        public final boolean b(String str, Context context) {
            return j3.a(str, context);
        }

        public final boolean c(String str, Context context) {
            e.a(str).a(context);
            return true;
        }
    }

    public static final class e implements MyTargetActivity.ActivityEngine {

        /* renamed from: a, reason: collision with root package name */
        public final String f4188a;
        public ua b;

        public e(String str) {
            this.f4188a = str;
        }

        public static e a(String str) {
            return new e(str);
        }

        public void a(Context context) {
            MyTargetActivity.activityEngine = this;
            Intent intent = new Intent(context, (Class<?>) MyTargetActivity.class);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            context.startActivity(intent);
        }

        @Override // com.my.target.common.MyTargetActivity.ActivityEngine
        public void onActivityAttach(MyTargetActivity myTargetActivity) {
        }

        @Override // com.my.target.common.MyTargetActivity.ActivityEngine
        public boolean onActivityBackPressed() {
            ua uaVar = this.b;
            if (uaVar == null || !uaVar.a()) {
                return true;
            }
            this.b.c();
            return false;
        }

        @Override // com.my.target.common.MyTargetActivity.ActivityEngine
        public void onActivityCreate(final MyTargetActivity myTargetActivity, Intent intent, FrameLayout frameLayout) {
            myTargetActivity.setTheme(android.R.style.Theme.Light.NoTitleBar);
            Window window = myTargetActivity.getWindow();
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(-12232092);
            try {
                ua uaVar = new ua(myTargetActivity);
                this.b = uaVar;
                frameLayout.addView(uaVar);
                this.b.d();
                this.b.setUrl(this.f4188a);
                this.b.setListener(new ua.d() { // from class: com.my.target.y0$e$$ExternalSyntheticLambda0
                    @Override // com.my.target.ua.d
                    public final void a() {
                        myTargetActivity.finish();
                    }
                });
            } catch (Throwable th) {
                ba.b("ClickHandler: Error - " + th.getMessage());
                myTargetActivity.finish();
            }
        }

        @Override // com.my.target.common.MyTargetActivity.ActivityEngine
        public void onActivityDestroy() {
            ua uaVar = this.b;
            if (uaVar == null) {
                return;
            }
            uaVar.b();
            this.b = null;
        }

        @Override // com.my.target.common.MyTargetActivity.ActivityEngine
        public boolean onActivityOptionsItemSelected(MenuItem menuItem) {
            return false;
        }

        @Override // com.my.target.common.MyTargetActivity.ActivityEngine
        public void onActivityPause() {
        }

        @Override // com.my.target.common.MyTargetActivity.ActivityEngine
        public void onActivityResume() {
        }

        @Override // com.my.target.common.MyTargetActivity.ActivityEngine
        public void onActivityStart() {
        }

        @Override // com.my.target.common.MyTargetActivity.ActivityEngine
        public void onActivityStop() {
        }
    }

    public static y0 a() {
        return new y0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.my.target.b bVar, Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            a(str, bVar, context);
        }
        f4186a.remove(bVar);
    }

    public static boolean a(String str, String str2, Context context) {
        if (str2 == null) {
            return false;
        }
        return b(str, str2, context);
    }

    public static boolean b(String str, String str2, Context context) {
        return str == null ? j3.a(str2, context) : j3.a(str2, str, context);
    }

    public void a(com.my.target.b bVar, Context context) {
        a(bVar, bVar.getTrackingLink(), context);
    }

    public void a(com.my.target.b bVar, String str, Context context) {
        if (f4186a.containsKey(bVar) || a.a(bVar).a(context)) {
            return;
        }
        if (str != null) {
            b(str, bVar, context);
        }
        w9.a(bVar.getStatHolder().b(CampaignEx.JSON_NATIVE_VIDEO_CLICK), context);
    }

    public void a(com.my.target.b bVar, String str, String str2, String str3, Context context) {
        if (a(bVar.getBundleId(), str, context)) {
            return;
        }
        if ((TextUtils.isEmpty(str2) || !j3.a(str2, context)) && !TextUtils.isEmpty(str3)) {
            a(str3, bVar, context);
        }
    }

    public final void a(String str, com.my.target.b bVar, Context context) {
        a.a(str, bVar).a(context);
    }

    public final void b(String str, final com.my.target.b bVar, final Context context) {
        if (bVar.isDirectLink() || da.d(str)) {
            a(str, bVar, context);
        } else {
            f4186a.put(bVar, Boolean.TRUE);
            da.g(str).a(new da.a() { // from class: com.my.target.y0$$ExternalSyntheticLambda0
                @Override // com.my.target.da.a
                public final void a(String str2) {
                    this.f$0.a(bVar, context, str2);
                }
            }).b(context);
        }
    }
}
