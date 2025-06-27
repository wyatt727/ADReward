package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.0 */
/* loaded from: classes3.dex */
final class zzil extends zzin {
    private int zza = 0;
    private final int zzb;
    private final /* synthetic */ zzii zzc;

    @Override // com.google.android.gms.internal.measurement.zzio
    public final byte zza() {
        int i = this.zza;
        if (i >= this.zzb) {
            throw new NoSuchElementException();
        }
        this.zza = i + 1;
        return this.zzc.zzb(i);
    }

    zzil(zzii zziiVar) {
        this.zzc = zziiVar;
        this.zzb = zziiVar.zzb();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza < this.zzb;
    }
}
