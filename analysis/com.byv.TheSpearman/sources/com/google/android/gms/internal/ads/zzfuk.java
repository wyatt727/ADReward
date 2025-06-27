package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzfuk extends zzfvc {
    private final int zza;
    private final String zzb;

    /* synthetic */ zzfuk(int i, String str, zzfuj zzfujVar) {
        this.zza = i;
        this.zzb = str;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfvc) {
            zzfvc zzfvcVar = (zzfvc) obj;
            if (this.zza == zzfvcVar.zza() && ((str = this.zzb) != null ? str.equals(zzfvcVar.zzb()) : zzfvcVar.zzb() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zzb;
        return (str == null ? 0 : str.hashCode()) ^ ((this.zza ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "OverlayDisplayState{statusCode=" + this.zza + ", sessionToken=" + this.zzb + "}";
    }

    @Override // com.google.android.gms.internal.ads.zzfvc
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfvc
    public final String zzb() {
        return this.zzb;
    }
}
