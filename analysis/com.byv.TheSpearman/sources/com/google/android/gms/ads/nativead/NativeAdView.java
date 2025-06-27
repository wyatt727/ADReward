package com.google.android.gms.ads.nativead;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzep;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbdz;
import com.google.android.gms.internal.ads.zzbhi;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes2.dex */
public final class NativeAdView extends FrameLayout {

    @NotOnlyInitialized
    private final FrameLayout zza;

    @NotOnlyInitialized
    private final zzbhi zzb;

    public NativeAdView(Context context) {
        super(context);
        this.zza = zzd(context);
        this.zzb = zze();
    }

    private final FrameLayout zzd(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        return frameLayout;
    }

    @RequiresNonNull({"overlayFrame"})
    private final zzbhi zze() {
        if (isInEditMode()) {
            return null;
        }
        FrameLayout frameLayout = this.zza;
        return zzay.zza().zzh(frameLayout.getContext(), this, frameLayout);
    }

    private final void zzf(String str, View view) {
        zzbhi zzbhiVar = this.zzb;
        if (zzbhiVar == null) {
            return;
        }
        try {
            zzbhiVar.zzdv(str, ObjectWrapper.wrap(view));
        } catch (RemoteException e) {
            zzm.zzh("Unable to call setAssetView on delegate", e);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.zza);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void bringChildToFront(View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.zza;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    public void destroy() {
        zzbhi zzbhiVar = this.zzb;
        if (zzbhiVar == null) {
            return;
        }
        try {
            zzbhiVar.zzc();
        } catch (RemoteException e) {
            zzm.zzh("Unable to destroy native ad view", e);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.zzb != null) {
            if (((Boolean) zzba.zzc().zza(zzbdz.zzlj)).booleanValue()) {
                try {
                    this.zzb.zzd(ObjectWrapper.wrap(motionEvent));
                } catch (RemoteException e) {
                    zzm.zzh("Unable to call handleTouchEvent on delegate", e);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public AdChoicesView getAdChoicesView() {
        View viewZza = zza("3011");
        if (viewZza instanceof AdChoicesView) {
            return (AdChoicesView) viewZza;
        }
        return null;
    }

    public final View getAdvertiserView() {
        return zza("3005");
    }

    public final View getBodyView() {
        return zza("3004");
    }

    public final View getCallToActionView() {
        return zza("3002");
    }

    public final View getHeadlineView() {
        return zza("3001");
    }

    public final View getIconView() {
        return zza("3003");
    }

    public final View getImageView() {
        return zza("3008");
    }

    public final MediaView getMediaView() {
        View viewZza = zza("3010");
        if (viewZza instanceof MediaView) {
            return (MediaView) viewZza;
        }
        if (viewZza == null) {
            return null;
        }
        zzm.zze("View is not an instance of MediaView");
        return null;
    }

    public final View getPriceView() {
        return zza("3007");
    }

    public final View getStarRatingView() {
        return zza("3009");
    }

    public final View getStoreView() {
        return zza("3006");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        zzbhi zzbhiVar = this.zzb;
        if (zzbhiVar == null) {
            return;
        }
        try {
            zzbhiVar.zze(ObjectWrapper.wrap(view), i);
        } catch (RemoteException e) {
            zzm.zzh("Unable to call onVisibilityChanged on delegate", e);
        }
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        super.removeAllViews();
        super.addView(this.zza);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.zza == view) {
            return;
        }
        super.removeView(view);
    }

    public void setAdChoicesView(AdChoicesView adChoicesView) {
        zzf("3011", adChoicesView);
    }

    public final void setAdvertiserView(View view) {
        zzf("3005", view);
    }

    public final void setBodyView(View view) {
        zzf("3004", view);
    }

    public final void setCallToActionView(View view) {
        zzf("3002", view);
    }

    public final void setClickConfirmingView(View view) {
        zzbhi zzbhiVar = this.zzb;
        if (zzbhiVar == null) {
            return;
        }
        try {
            zzbhiVar.zzdw(ObjectWrapper.wrap(view));
        } catch (RemoteException e) {
            zzm.zzh("Unable to call setClickConfirmingView on delegate", e);
        }
    }

    public final void setHeadlineView(View view) {
        zzf("3001", view);
    }

    public final void setIconView(View view) {
        zzf("3003", view);
    }

    public final void setImageView(View view) {
        zzf("3008", view);
    }

    public final void setMediaView(MediaView mediaView) {
        zzf("3010", mediaView);
        if (mediaView == null) {
            return;
        }
        mediaView.zza(new zzb(this));
        mediaView.zzb(new zzc(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.android.gms.dynamic.IObjectWrapper, java.lang.Object] */
    public void setNativeAd(NativeAd nativeAd) {
        zzbhi zzbhiVar = this.zzb;
        if (zzbhiVar == 0) {
            return;
        }
        try {
            zzbhiVar.zzdz(nativeAd.zza());
        } catch (RemoteException e) {
            zzm.zzh("Unable to call setNativeAd on delegate", e);
        }
    }

    public final void setPriceView(View view) {
        zzf("3007", view);
    }

    public final void setStarRatingView(View view) {
        zzf("3009", view);
    }

    public final void setStoreView(View view) {
        zzf("3006", view);
    }

    protected final View zza(String str) {
        zzbhi zzbhiVar = this.zzb;
        if (zzbhiVar != null) {
            try {
                IObjectWrapper iObjectWrapperZzb = zzbhiVar.zzb(str);
                if (iObjectWrapperZzb != null) {
                    return (View) ObjectWrapper.unwrap(iObjectWrapperZzb);
                }
            } catch (RemoteException e) {
                zzm.zzh("Unable to call getAssetView on delegate", e);
            }
        }
        return null;
    }

    final /* synthetic */ void zzb(MediaContent mediaContent) {
        zzbhi zzbhiVar = this.zzb;
        if (zzbhiVar == null) {
            return;
        }
        try {
            if (mediaContent instanceof zzep) {
                zzbhiVar.zzdx(((zzep) mediaContent).zzc());
            } else if (mediaContent == null) {
                zzbhiVar.zzdx(null);
            } else {
                zzm.zze("Use MediaContent provided by NativeAd.getMediaContent");
            }
        } catch (RemoteException e) {
            zzm.zzh("Unable to call setMediaContent on delegate", e);
        }
    }

    final /* synthetic */ void zzc(ImageView.ScaleType scaleType) {
        zzbhi zzbhiVar = this.zzb;
        if (zzbhiVar == null || scaleType == null) {
            return;
        }
        try {
            zzbhiVar.zzdy(ObjectWrapper.wrap(scaleType));
        } catch (RemoteException e) {
            zzm.zzh("Unable to call setMediaViewImageScaleType on delegate", e);
        }
    }

    public NativeAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.zza = zzd(context);
        this.zzb = zze();
    }

    public NativeAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.zza = zzd(context);
        this.zzb = zze();
    }

    public NativeAdView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.zza = zzd(context);
        this.zzb = zze();
    }
}
