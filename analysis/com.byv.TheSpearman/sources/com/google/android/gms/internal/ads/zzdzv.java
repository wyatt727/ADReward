package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdzv extends zzbwv {
    final /* synthetic */ zzdzw zza;

    protected zzdzv(zzdzw zzdzwVar) {
        this.zza = zzdzwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbww
    public final void zze(com.google.android.gms.ads.internal.util.zzbb zzbbVar) {
        this.zza.zza.zzd(zzbbVar.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbww
    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) {
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        zzdzw zzdzwVar = this.zza;
        zzdzwVar.zza.zzc(new zzeam(autoCloseInputStream, zzdzwVar.zze));
    }

    @Override // com.google.android.gms.internal.ads.zzbww
    public final void zzg(ParcelFileDescriptor parcelFileDescriptor, zzbxd zzbxdVar) {
        this.zza.zza.zzc(new zzeam(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), zzbxdVar));
    }
}
