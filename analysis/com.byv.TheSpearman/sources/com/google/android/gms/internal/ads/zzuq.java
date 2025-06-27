package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzuq implements zzxa {
    private final zzxa zza;
    private final zzfzn zzb;

    public zzuq(zzxa zzxaVar, List list) {
        this.zza = zzxaVar;
        this.zzb = zzfzn.zzk(list);
    }

    public final zzfzn zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    public final long zzb() {
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    public final long zzc() {
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    public final void zzm(long j) {
        this.zza.zzm(j);
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    public final boolean zzo(zzlg zzlgVar) {
        return this.zza.zzo(zzlgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    public final boolean zzp() {
        return this.zza.zzp();
    }
}
