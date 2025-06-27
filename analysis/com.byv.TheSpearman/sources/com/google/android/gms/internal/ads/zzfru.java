package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Log;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfru {
    final /* synthetic */ zzfrv zza;
    private final byte[] zzb;
    private int zzc;
    private int zzd;

    /* synthetic */ zzfru(zzfrv zzfrvVar, byte[] bArr, zzfrt zzfrtVar) {
        this.zza = zzfrvVar;
        this.zzb = bArr;
    }

    public final zzfru zza(int i) {
        this.zzd = i;
        return this;
    }

    public final zzfru zzb(int i) {
        this.zzc = i;
        return this;
    }

    public final synchronized void zzc() {
        try {
            zzfrv zzfrvVar = this.zza;
            if (zzfrvVar.zzb) {
                zzfrvVar.zza.zzj(this.zzb);
                this.zza.zza.zzi(this.zzc);
                this.zza.zza.zzg(this.zzd);
                this.zza.zza.zzh(null);
                this.zza.zza.zzf();
            }
        } catch (RemoteException e) {
            Log.d("GASS", "Clearcut log failed", e);
        }
    }
}
