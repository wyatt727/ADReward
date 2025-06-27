package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public enum zzasn implements zzgzz {
    UNKNOWN(0),
    ENABLED(1),
    DISABLED(2);

    private static final zzhaa zzd = new zzhaa() { // from class: com.google.android.gms.internal.ads.zzasl
        @Override // com.google.android.gms.internal.ads.zzhaa
        public final /* synthetic */ zzgzz zza(int i) {
            return zzasn.zzb(i);
        }
    };
    private final int zzf;

    zzasn(int i) {
        this.zzf = i;
    }

    public static zzasn zzb(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return ENABLED;
        }
        if (i != 2) {
            return null;
        }
        return DISABLED;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzgzz
    public final int zza() {
        return this.zzf;
    }
}
