package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzfzl extends zzfxn {
    private final zzfzn zza;

    zzfzl(zzfzn zzfznVar, int i) {
        super(zzfznVar.size(), i);
        this.zza = zzfznVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfxn
    protected final Object zza(int i) {
        return this.zza.get(i);
    }
}
