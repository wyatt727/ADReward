package com.my.target;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.my.target.common.MyTargetActivity;
import com.my.target.nativeads.NativeAppwallAd;
import com.my.target.nativeads.factories.NativeAppwallViewsFactory;
import com.my.target.nativeads.views.AppwallAdView;
import com.my.target.v;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public class w6 implements MyTargetActivity.ActivityEngine {

    /* renamed from: a, reason: collision with root package name */
    public final NativeAppwallAd f4175a;
    public WeakReference<MyTargetActivity> b;
    public boolean c;

    public w6(NativeAppwallAd nativeAppwallAd) {
        this.f4175a = nativeAppwallAd;
    }

    public static w6 a(NativeAppwallAd nativeAppwallAd) {
        return new w6(nativeAppwallAd);
    }

    public void a() {
        b();
    }

    public final void a(ActionBar actionBar, int i) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(actionBar.getTitle());
        spannableStringBuilder.setSpan(new ForegroundColorSpan(i), 0, actionBar.getTitle().length(), 18);
        actionBar.setTitle(spannableStringBuilder);
    }

    public void a(Context context) {
        if (this.c) {
            ba.a("NativeAppwallAdEngine: Unable to open Appwall Ad twice, please dismiss currently showing ad first");
            return;
        }
        this.c = true;
        MyTargetActivity.activityEngine = this;
        Intent intent = new Intent(context, (Class<?>) MyTargetActivity.class);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        context.startActivity(intent);
    }

    public final void a(ViewGroup viewGroup) {
        v vVar = new v(viewGroup.getContext());
        vVar.setTitle(this.f4175a.getTitle());
        vVar.setStripeColor(this.f4175a.getTitleSupplementaryColor());
        vVar.setMainColor(this.f4175a.getTitleBackgroundColor());
        vVar.setTitleColor(this.f4175a.getTitleTextColor());
        vVar.setLayoutParams(new ViewGroup.LayoutParams(-1, ca.e(viewGroup.getContext()).b(52)));
        viewGroup.addView(vVar);
        vVar.setOnCloseClickListener(new v.a() { // from class: com.my.target.w6$$ExternalSyntheticLambda0
            @Override // com.my.target.v.a
            public final void a() {
                this.f$0.b();
            }
        });
    }

    public final void a(MyTargetActivity myTargetActivity) {
        Window window = myTargetActivity.getWindow();
        window.addFlags(Integer.MIN_VALUE);
        myTargetActivity.setTheme(android.R.style.Theme.Material.Light.DarkActionBar);
        ActionBar actionBar = myTargetActivity.getActionBar();
        if (actionBar != null) {
            actionBar.setTitle(this.f4175a.getTitle());
            actionBar.setIcon(android.R.color.transparent);
            actionBar.setDisplayShowTitleEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setBackgroundDrawable(new ColorDrawable(this.f4175a.getTitleBackgroundColor()));
            a(actionBar, this.f4175a.getTitleTextColor());
            actionBar.setElevation(ca.e(myTargetActivity).b(4));
        }
        window.setStatusBarColor(this.f4175a.getTitleSupplementaryColor());
    }

    public void b() {
        this.c = false;
        WeakReference<MyTargetActivity> weakReference = this.b;
        MyTargetActivity myTargetActivity = weakReference == null ? null : weakReference.get();
        if (myTargetActivity != null) {
            myTargetActivity.finish();
        }
    }

    public final void b(ViewGroup viewGroup) {
        AppwallAdView appwallView = NativeAppwallViewsFactory.getAppwallView(this.f4175a, viewGroup.getContext());
        this.f4175a.registerAppwallAdView(appwallView);
        appwallView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        viewGroup.addView(appwallView);
    }

    @Override // com.my.target.common.MyTargetActivity.ActivityEngine
    public void onActivityAttach(MyTargetActivity myTargetActivity) {
    }

    @Override // com.my.target.common.MyTargetActivity.ActivityEngine
    public boolean onActivityBackPressed() {
        return true;
    }

    @Override // com.my.target.common.MyTargetActivity.ActivityEngine
    public void onActivityCreate(MyTargetActivity myTargetActivity, Intent intent, FrameLayout frameLayout) {
        this.b = new WeakReference<>(myTargetActivity);
        a(myTargetActivity);
        if (myTargetActivity.getActionBar() == null) {
            LinearLayout linearLayout = new LinearLayout(myTargetActivity);
            linearLayout.setOrientation(1);
            linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            frameLayout.addView(linearLayout);
            a(linearLayout);
            b(linearLayout);
        } else {
            b(frameLayout);
        }
        NativeAppwallAd.AppwallAdListener listener = this.f4175a.getListener();
        if (listener != null) {
            listener.onDisplay(this.f4175a);
        }
    }

    @Override // com.my.target.common.MyTargetActivity.ActivityEngine
    public void onActivityDestroy() {
        this.c = false;
        this.b = null;
        NativeAppwallAd.AppwallAdListener listener = this.f4175a.getListener();
        if (listener != null) {
            listener.onDismiss(this.f4175a);
        }
    }

    @Override // com.my.target.common.MyTargetActivity.ActivityEngine
    public boolean onActivityOptionsItemSelected(MenuItem menuItem) {
        WeakReference<MyTargetActivity> weakReference;
        MyTargetActivity myTargetActivity;
        if (menuItem.getItemId() != 16908332 || (weakReference = this.b) == null || (myTargetActivity = weakReference.get()) == null) {
            return false;
        }
        myTargetActivity.finish();
        return true;
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
