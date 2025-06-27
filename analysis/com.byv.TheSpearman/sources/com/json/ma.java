package com.json;

import android.app.Activity;
import androidx.core.app.NotificationCompat;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.json.environment.ContextProvider;
import com.json.mediationsdk.IronSource;
import com.json.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.json.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface;
import com.json.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.json.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.json.mediationsdk.adunit.adapter.listener.NativeAdListener;
import com.json.mediationsdk.adunit.adapter.utility.AdData;
import com.json.mediationsdk.logger.IronLog;
import com.json.mediationsdk.model.Placement;
import com.json.y1;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\u00020\u0004BI\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0014\u0010$\u001a\u0010\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010#\u0018\u00010\"\u0012\b\u0010&\u001a\u0004\u0018\u00010%\u0012\u0006\u0010(\u001a\u00020'\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b*\u0010+J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\u000b\u001a\u00020\tH\u0002J\b\u0010\f\u001a\u00020\tH\u0014J\u0006\u0010\r\u001a\u00020\tJ\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\u000f\u001a\u00020\tH\u0016J\u001c\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016R(\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R(\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006,"}, d2 = {"Lcom/ironsource/ma;", "Lcom/ironsource/y1;", "Lcom/ironsource/f0;", "Lcom/ironsource/mediationsdk/adunit/adapter/listener/NativeAdListener;", "Lcom/ironsource/z;", "Lcom/ironsource/mediationsdk/ads/nativead/AdapterNativeAdData;", "adapterNativeAdData", "Lcom/ironsource/mediationsdk/adunit/adapter/internal/nativead/AdapterNativeAdViewBinder;", "nativeAdViewBinder", "", "a", "I", "F", "O", "onAdLoadSuccess", id.c, "Lcom/ironsource/y;", NotificationCompat.CATEGORY_EVENT, "", "", "", "<set-?>", "r", "Lcom/ironsource/mediationsdk/ads/nativead/AdapterNativeAdData;", "P", "()Lcom/ironsource/mediationsdk/ads/nativead/AdapterNativeAdData;", CmcdHeadersFactory.STREAMING_FORMAT_SS, "Lcom/ironsource/mediationsdk/adunit/adapter/internal/nativead/AdapterNativeAdViewBinder;", "Q", "()Lcom/ironsource/mediationsdk/adunit/adapter/internal/nativead/AdapterNativeAdViewBinder;", "Lcom/ironsource/qb;", "threadInterface", "Lcom/ironsource/u;", "adSmashData", "Lcom/ironsource/mediationsdk/adunit/adapter/internal/BaseAdAdapter;", "Lcom/ironsource/mediationsdk/adunit/adapter/internal/listener/AdapterAdListener;", "adapter", "Lcom/ironsource/mediationsdk/model/Placement;", "placement", "Lcom/ironsource/i1;", "item", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lcom/ironsource/qb;Lcom/ironsource/u;Lcom/ironsource/mediationsdk/adunit/adapter/internal/BaseAdAdapter;Lcom/ironsource/mediationsdk/model/Placement;Lcom/ironsource/i1;Lcom/ironsource/f0;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class ma extends y1<f0> implements NativeAdListener, z {

    /* renamed from: r, reason: from kotlin metadata */
    private AdapterNativeAdData adapterNativeAdData;

    /* renamed from: s, reason: from kotlin metadata */
    private AdapterNativeAdViewBinder nativeAdViewBinder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ma(qb threadInterface, u adSmashData, BaseAdAdapter<?, AdapterAdListener> baseAdAdapter, Placement placement, i1 item, f0 f0Var) {
        super(threadInterface, adSmashData, baseAdAdapter, new m0(adSmashData.g(), adSmashData.g().getNativeAdSettings(), IronSource.AD_UNIT.NATIVE_AD), item, f0Var);
        Intrinsics.checkNotNullParameter(threadInterface, "threadInterface");
        Intrinsics.checkNotNullParameter(adSmashData, "adSmashData");
        Intrinsics.checkNotNullParameter(item, "item");
        this.g = placement;
    }

    private final void I() {
        xd xdVar;
        IronLog.INTERNAL.verbose(d());
        if (x()) {
            super.onAdOpened();
            return;
        }
        if (this.e != y1.h.FAILED) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("unexpected onAdOpened for %s, state - %s", Arrays.copyOf(new Object[]{k(), this.e}, 2));
            Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
            a0 a0Var = this.d;
            if (a0Var == null || (xdVar = a0Var.k) == null) {
                return;
            }
            xdVar.l(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ma this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.I();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ma this$0, AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder nativeAdViewBinder) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adapterNativeAdData, "$adapterNativeAdData");
        Intrinsics.checkNotNullParameter(nativeAdViewBinder, "$nativeAdViewBinder");
        this$0.a(adapterNativeAdData, nativeAdViewBinder);
    }

    private final void a(AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder nativeAdViewBinder) {
        this.adapterNativeAdData = adapterNativeAdData;
        this.nativeAdViewBinder = nativeAdViewBinder;
        super.onAdLoadSuccess();
    }

    @Override // com.json.y1
    protected void F() {
        xd xdVar;
        if (!(this.c instanceof AdapterNativeAdInterface)) {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterNativeAdInterface"));
            return;
        }
        if (ContextProvider.getInstance().getCurrentActiveActivity() == null) {
            IronLog.INTERNAL.error(a("activity must not be null"));
            a0 a0Var = this.d;
            if (a0Var == null || (xdVar = a0Var.k) == null) {
                return;
            }
            xdVar.c("activity must not be null");
            return;
        }
        Object obj = this.c;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface<com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener>");
        AdData mCurrentAdData = this.k;
        Intrinsics.checkNotNullExpressionValue(mCurrentAdData, "mCurrentAdData");
        Activity currentActiveActivity = ContextProvider.getInstance().getCurrentActiveActivity();
        Intrinsics.checkNotNullExpressionValue(currentActiveActivity, "getInstance().currentActiveActivity");
        ((AdapterNativeAdInterface) obj).loadAd(mCurrentAdData, currentActiveActivity, this);
    }

    public final void O() {
        xd xdVar;
        x9 x9Var;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(k());
        a(y1.h.NONE);
        Object obj = this.c;
        if (obj == null) {
            ironLog.warning("mAdapter == null");
            return;
        }
        try {
            if (obj instanceof AdapterNativeAdInterface) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface<*>");
                AdData mCurrentAdData = this.k;
                Intrinsics.checkNotNullExpressionValue(mCurrentAdData, "mCurrentAdData");
                ((AdapterNativeAdInterface) obj).destroyAd(mCurrentAdData);
            } else {
                ironLog.error(a("adapter not instance of AdapterNativeAdInterface"));
            }
        } catch (Throwable th) {
            String str = "destroyNativeAd - exception = " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(a(str));
            a0 a0Var = this.d;
            if (a0Var != null && (xdVar = a0Var.k) != null) {
                xdVar.c(str);
            }
        }
        a0 a0Var2 = this.d;
        if (a0Var2 == null || (x9Var = a0Var2.g) == null) {
            return;
        }
        Integer sessionDepth = r();
        Intrinsics.checkNotNullExpressionValue(sessionDepth, "sessionDepth");
        x9Var.a(sessionDepth.intValue());
    }

    /* renamed from: P, reason: from getter */
    public final AdapterNativeAdData getAdapterNativeAdData() {
        return this.adapterNativeAdData;
    }

    /* renamed from: Q, reason: from getter */
    public final AdapterNativeAdViewBinder getNativeAdViewBinder() {
        return this.nativeAdViewBinder;
    }

    @Override // com.json.y1, com.json.z
    public Map<String, Object> a(y event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Map<String, Object> data = super.a(event);
        if (this.g != null) {
            Intrinsics.checkNotNullExpressionValue(data, "data");
            data.put("placement", j());
        }
        Intrinsics.checkNotNullExpressionValue(data, "data");
        return data;
    }

    @Override // com.json.mediationsdk.adunit.adapter.listener.NativeAdListener
    public void onAdLoadSuccess(final AdapterNativeAdData adapterNativeAdData, final AdapterNativeAdViewBinder nativeAdViewBinder) {
        Intrinsics.checkNotNullParameter(adapterNativeAdData, "adapterNativeAdData");
        Intrinsics.checkNotNullParameter(nativeAdViewBinder, "nativeAdViewBinder");
        if (t().c()) {
            t().a(new Runnable() { // from class: com.ironsource.ma$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    ma.a(this.f$0, adapterNativeAdData, nativeAdViewBinder);
                }
            });
        } else {
            a(adapterNativeAdData, nativeAdViewBinder);
        }
    }

    @Override // com.json.y1, com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened() {
        if (t().c()) {
            t().a(new Runnable() { // from class: com.ironsource.ma$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    ma.a(this.f$0);
                }
            });
        } else {
            I();
        }
    }
}
