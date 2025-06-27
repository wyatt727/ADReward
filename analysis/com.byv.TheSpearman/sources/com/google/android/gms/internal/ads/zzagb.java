package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzagb implements zzadi {
    private final long zzb;
    private final zzadi zzc;

    public zzagb(long j, zzadi zzadiVar) {
        this.zzb = j;
        this.zzc = zzadiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final void zzD() {
        this.zzc.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final void zzO(zzaef zzaefVar) {
        this.zzc.zzO(new zzaga(this, zzaefVar, zzaefVar));
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final zzaem zzw(int i, int i2) {
        return this.zzc.zzw(i, i2);
    }
}
