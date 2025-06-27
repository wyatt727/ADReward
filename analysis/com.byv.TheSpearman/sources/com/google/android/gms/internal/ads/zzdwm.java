package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdwm implements zzdfo {
    private final Bundle zza = new Bundle();

    @Override // com.google.android.gms.internal.ads.zzdfo
    public final void zza(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzdfo
    public final synchronized void zzb(String str, String str2) {
        this.zza.putInt(str, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzdfo
    public final synchronized void zzc(String str) {
        this.zza.putInt(str, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzdfo
    public final synchronized void zzd(String str) {
        this.zza.putInt(str, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzdfo
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzdfo
    public final void zzf() {
    }

    public final synchronized Bundle zzg() {
        return new Bundle(this.zza);
    }
}
