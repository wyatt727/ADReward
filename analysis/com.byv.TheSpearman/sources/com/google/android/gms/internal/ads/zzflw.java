package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public enum zzflw implements zzgzz {
    TAG_UNKNOWN(0),
    UNRECOGNIZED(-1);

    private static final zzhaa zzc = new zzhaa() { // from class: com.google.android.gms.internal.ads.zzflv
        @Override // com.google.android.gms.internal.ads.zzhaa
        public final /* synthetic */ zzgzz zza(int i) {
            return zzflw.zzb(i);
        }
    };
    private final int zze;

    zzflw(int i) {
        this.zze = i;
    }

    public static zzflw zzb(int i) {
        if (i != 0) {
            return null;
        }
        return TAG_UNKNOWN;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgzz
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zze;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
