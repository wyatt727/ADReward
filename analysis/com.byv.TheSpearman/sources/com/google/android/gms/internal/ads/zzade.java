package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzade implements zzaem {
    private final byte[] zza = new byte[4096];

    @Override // com.google.android.gms.internal.ads.zzaem
    public final /* synthetic */ int zzf(zzu zzuVar, int i, boolean z) {
        return zzaek.zza(this, zzuVar, i, z);
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final int zzg(zzu zzuVar, int i, boolean z, int i2) throws IOException {
        int iZza = zzuVar.zza(this.zza, 0, Math.min(4096, i));
        if (iZza != -1) {
            return iZza;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final void zzl(zzam zzamVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final /* synthetic */ void zzq(zzfo zzfoVar, int i) {
        zzaek.zzb(this, zzfoVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final void zzr(zzfo zzfoVar, int i, int i2) {
        zzfoVar.zzL(i);
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final void zzs(long j, int i, int i2, int i3, zzael zzaelVar) {
    }
}
