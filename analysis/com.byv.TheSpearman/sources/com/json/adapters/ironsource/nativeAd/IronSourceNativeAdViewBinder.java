package com.json.adapters.ironsource.nativeAd;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.json.ISNNativeAdData;
import com.json.ISNNativeAdViewHolder;
import com.json.mediationsdk.ads.nativead.LevelPlayMediaView;
import com.json.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.json.mediationsdk.adunit.adapter.utility.AdOptionsPosition;
import com.json.mediationsdk.adunit.adapter.utility.NativeAdProperties;
import com.json.mediationsdk.logger.IronLog;
import com.json.r7;
import com.json.sdk.mediation.R;
import com.json.u7;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0003J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR(\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/ironsource/adapters/ironsource/nativeAd/IronSourceNativeAdViewBinder;", "Lcom/ironsource/mediationsdk/adunit/adapter/internal/nativead/AdapterNativeAdViewBinder;", "Landroid/widget/FrameLayout$LayoutParams;", "getPrivacyIconLayoutParams", "Landroid/view/View;", "nativeAdView", "", "setNativeAdView", "Lcom/ironsource/u7;", "nativeAd", "Lcom/ironsource/u7;", "Lcom/ironsource/mediationsdk/adunit/adapter/utility/NativeAdProperties;", "nativeAdProperties", "Lcom/ironsource/mediationsdk/adunit/adapter/utility/NativeAdProperties;", "Lcom/ironsource/r7;", "<set-?>", "networkNativeAdView", "Lcom/ironsource/r7;", "getNetworkNativeAdView", "()Lcom/ironsource/r7;", "<init>", "(Lcom/ironsource/u7;Lcom/ironsource/mediationsdk/adunit/adapter/utility/NativeAdProperties;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class IronSourceNativeAdViewBinder extends AdapterNativeAdViewBinder {
    private final u7 nativeAd;
    private final NativeAdProperties nativeAdProperties;
    private r7 networkNativeAdView;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdOptionsPosition.values().length];
            try {
                iArr[AdOptionsPosition.TOP_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdOptionsPosition.TOP_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdOptionsPosition.BOTTOM_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AdOptionsPosition.BOTTOM_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public IronSourceNativeAdViewBinder(u7 nativeAd, NativeAdProperties nativeAdProperties) {
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        Intrinsics.checkNotNullParameter(nativeAdProperties, "nativeAdProperties");
        this.nativeAd = nativeAd;
        this.nativeAdProperties = nativeAdProperties;
    }

    private final FrameLayout.LayoutParams getPrivacyIconLayoutParams() {
        int i;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int i2 = WhenMappings.$EnumSwitchMapping$0[this.nativeAdProperties.getAdOptionsPosition().ordinal()];
        if (i2 == 1) {
            i = 51;
        } else if (i2 == 2) {
            i = 53;
        } else if (i2 == 3) {
            i = 83;
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i = 85;
        }
        layoutParams.gravity = i;
        return layoutParams;
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinderInterface
    public r7 getNetworkNativeAdView() {
        return this.networkNativeAdView;
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinderInterface
    public void setNativeAdView(View nativeAdView) {
        if (nativeAdView == null) {
            IronLog.INTERNAL.error("nativeAdView is null");
            return;
        }
        if (this.nativeAd.b() == null) {
            IronLog.INTERNAL.error("nativeAd.adData is null");
            return;
        }
        LevelPlayMediaView mediaView = getNativeAdViewHolder().getMediaView();
        if (mediaView != null) {
            ISNNativeAdData iSNNativeAdDataB = this.nativeAd.b();
            Intrinsics.checkNotNull(iSNNativeAdDataB);
            WebView webViewL = iSNNativeAdDataB.l();
            if (webViewL != null) {
                mediaView.addView(webViewL, new ViewGroup.LayoutParams(-1, -1));
            }
        }
        ISNNativeAdData iSNNativeAdDataB2 = this.nativeAd.b();
        Intrinsics.checkNotNull(iSNNativeAdDataB2);
        View viewM = iSNNativeAdDataB2.m();
        viewM.setId(R.id.privacy_icon_button);
        viewM.setLayoutParams(getPrivacyIconLayoutParams());
        Context context = nativeAdView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        r7 r7Var = new r7(context);
        r7Var.addView(nativeAdView);
        r7Var.addView(viewM);
        this.networkNativeAdView = r7Var;
        r7 networkNativeAdView = getNetworkNativeAdView();
        Intrinsics.checkNotNull(networkNativeAdView);
        this.nativeAd.a(new ISNNativeAdViewHolder(networkNativeAdView, getNativeAdViewHolder().getTitleView(), getNativeAdViewHolder().getAdvertiserView(), getNativeAdViewHolder().getIconView(), getNativeAdViewHolder().getBodyView(), getNativeAdViewHolder().getMediaView(), getNativeAdViewHolder().getCallToActionView(), viewM));
    }
}
