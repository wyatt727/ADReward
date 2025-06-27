package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzdpe implements zzbgs {
    final /* synthetic */ String zza = NativeCustomFormatAd.ASSET_NAME_VIDEO;
    final /* synthetic */ zzdpf zzb;

    zzdpe(zzdpf zzdpfVar, String str) {
        this.zzb = zzdpfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final JSONObject zza() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final JSONObject zzb() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final void zzc() {
        zzdpf zzdpfVar = this.zzb;
        if (zzdpfVar.zzd != null) {
            zzdpfVar.zzd.zzE(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final void zzd(MotionEvent motionEvent) {
    }
}
