package com.applovin.impl;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.listeners.MaxAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.hybridAds.MaxHybridMRecAdActivity;
import com.applovin.mediation.hybridAds.MaxHybridNativeAdActivity;

/* loaded from: classes.dex */
public class yc {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f1203a;

    public yc(com.applovin.impl.sdk.k kVar) {
        this.f1203a = kVar;
    }

    public void a(de deVar, Activity activity, MaxAdapterListener maxAdapterListener) {
        zp.b();
        if (activity == null) {
            activity = this.f1203a.e().b();
        }
        if (deVar.getNativeAd() != null) {
            this.f1203a.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.f1203a.L().a("MaxHybridAdService", "Showing fullscreen native ad...");
            }
            this.f1203a.e().a(new b(deVar, this.f1203a, maxAdapterListener));
            activity.startActivity(new Intent(activity, (Class<?>) MaxHybridNativeAdActivity.class));
            return;
        }
        if (deVar.x() != null) {
            this.f1203a.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.f1203a.L().a("MaxHybridAdService", "Showing fullscreen MREC ad...");
            }
            this.f1203a.e().a(new a(deVar, this.f1203a, maxAdapterListener));
            activity.startActivity(new Intent(activity, (Class<?>) MaxHybridMRecAdActivity.class));
            return;
        }
        if (maxAdapterListener instanceof MaxInterstitialAdapterListener) {
            ((MaxInterstitialAdapterListener) maxAdapterListener).onInterstitialAdDisplayFailed(MaxAdapterError.AD_DISPLAY_FAILED);
        } else {
            if (maxAdapterListener instanceof MaxAppOpenAdapterListener) {
                ((MaxAppOpenAdapterListener) maxAdapterListener).onAppOpenAdDisplayFailed(MaxAdapterError.AD_DISPLAY_FAILED);
                return;
            }
            throw new IllegalStateException("Failed to display hybrid ad: neither native nor adview ad");
        }
    }

    private static class b extends p {

        /* renamed from: a, reason: collision with root package name */
        private final de f1205a;
        private final com.applovin.impl.sdk.k b;
        private final MaxAdapterListener c;

        public b(de deVar, com.applovin.impl.sdk.k kVar, MaxAdapterListener maxAdapterListener) {
            this.f1205a = deVar;
            this.b = kVar;
            this.c = maxAdapterListener;
        }

        @Override // com.applovin.impl.p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof MaxHybridNativeAdActivity) {
                ((MaxHybridNativeAdActivity) activity).a(this.f1205a.G(), this.f1205a.getNativeAd(), this.b, this.c);
            }
        }

        @Override // com.applovin.impl.p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if ((activity instanceof MaxHybridNativeAdActivity) && !activity.isChangingConfigurations() && this.f1205a.v().get()) {
                this.b.e().b(this);
            }
        }
    }

    private static class a extends p {

        /* renamed from: a, reason: collision with root package name */
        private final de f1204a;
        private final com.applovin.impl.sdk.k b;
        private final MaxAdapterListener c;

        public a(de deVar, com.applovin.impl.sdk.k kVar, MaxAdapterListener maxAdapterListener) {
            this.f1204a = deVar;
            this.b = kVar;
            this.c = maxAdapterListener;
        }

        @Override // com.applovin.impl.p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof MaxHybridMRecAdActivity) {
                ((MaxHybridMRecAdActivity) activity).a(this.f1204a.G(), this.f1204a.x(), this.b, this.c);
            }
        }

        @Override // com.applovin.impl.p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if ((activity instanceof MaxHybridMRecAdActivity) && !activity.isChangingConfigurations() && this.f1204a.v().get()) {
                this.b.e().b(this);
            }
        }
    }
}
