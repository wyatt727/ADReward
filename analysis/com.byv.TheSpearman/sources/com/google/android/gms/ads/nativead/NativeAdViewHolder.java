package com.google.android.gms.ads.nativead;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbho;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes2.dex */
public final class NativeAdViewHolder {
    public static final WeakHashMap zza = new WeakHashMap();

    @NotOnlyInitialized
    private zzbho zzb;
    private WeakReference zzc;

    public NativeAdViewHolder(View view, Map<String, View> map, Map<String, View> map2) {
        Preconditions.checkNotNull(view, "ContainerView must not be null");
        if (view instanceof NativeAdView) {
            zzm.zzg("The provided containerView is of type of NativeAdView, which cannot be usedwith NativeAdViewHolder.");
            return;
        }
        WeakHashMap weakHashMap = zza;
        if (weakHashMap.get(view) != null) {
            zzm.zzg("The provided containerView is already in use with another NativeAdViewHolder.");
            return;
        }
        weakHashMap.put(view, this);
        this.zzc = new WeakReference(view);
        this.zzb = zzay.zza().zzi(view, zza(map), zza(map2));
    }

    private static final HashMap zza(Map map) {
        return map == null ? new HashMap() : new HashMap(map);
    }

    public final void setClickConfirmingView(View view) {
        try {
            this.zzb.zzb(ObjectWrapper.wrap(view));
        } catch (RemoteException e) {
            zzm.zzh("Unable to call setClickConfirmingView on delegate", e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.google.android.gms.dynamic.IObjectWrapper, java.lang.Object] */
    public void setNativeAd(NativeAd nativeAd) {
        ?? Zza = nativeAd.zza();
        WeakReference weakReference = this.zzc;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view == null) {
            zzm.zzj("NativeAdViewHolder.setNativeAd containerView doesn't exist, returning");
            return;
        }
        WeakHashMap weakHashMap = zza;
        if (!weakHashMap.containsKey(view)) {
            weakHashMap.put(view, this);
        }
        zzbho zzbhoVar = this.zzb;
        if (zzbhoVar != 0) {
            try {
                zzbhoVar.zzc(Zza);
            } catch (RemoteException e) {
                zzm.zzh("Unable to call setNativeAd on delegate", e);
            }
        }
    }

    public void unregisterNativeAd() {
        zzbho zzbhoVar = this.zzb;
        if (zzbhoVar != null) {
            try {
                zzbhoVar.zzd();
            } catch (RemoteException e) {
                zzm.zzh("Unable to call unregisterNativeAd on delegate", e);
            }
        }
        WeakReference weakReference = this.zzc;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null) {
            zza.remove(view);
        }
    }
}
