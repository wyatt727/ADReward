package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public enum zzhee implements zzgzz {
    SOURCE_UNSPECIFIED(0),
    CLIENT_GENERATION(1);

    private static final zzhaa zzc = new zzhaa() { // from class: com.google.android.gms.internal.ads.zzhec
        @Override // com.google.android.gms.internal.ads.zzhaa
        public final /* synthetic */ zzgzz zza(int i) {
            return zzhee.zzb(i);
        }
    };
    private final int zze;

    zzhee(int i) {
        this.zze = i;
    }

    public static zzhee zzb(int i) {
        if (i == 0) {
            return SOURCE_UNSPECIFIED;
        }
        if (i != 1) {
            return null;
        }
        return CLIENT_GENERATION;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzgzz
    public final int zza() {
        return this.zze;
    }
}
