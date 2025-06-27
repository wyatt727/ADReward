package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzfui extends zzfvb {
    private int zza;
    private String zzb;
    private byte zzc;

    zzfui() {
    }

    @Override // com.google.android.gms.internal.ads.zzfvb
    public final zzfvb zza(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfvb
    public final zzfvb zzb(int i) {
        this.zza = i;
        this.zzc = (byte) 1;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfvb
    public final zzfvc zzc() {
        if (this.zzc == 1) {
            return new zzfuk(this.zza, this.zzb, null);
        }
        throw new IllegalStateException("Missing required properties: statusCode");
    }
}
