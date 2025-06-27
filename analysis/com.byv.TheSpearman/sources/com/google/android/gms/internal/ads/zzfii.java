package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfii implements zzfig {
    private final String zza;

    public zzfii(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfig
    public final boolean equals(Object obj) {
        if (obj instanceof zzfii) {
            return this.zza.equals(((zzfii) obj).zza);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfig
    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zza;
    }
}
