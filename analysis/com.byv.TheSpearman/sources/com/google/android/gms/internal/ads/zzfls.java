package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public enum zzfls implements zzgzz {
    ORIENTATION_UNKNOWN(0),
    ORIENTATION_PORTRAIT(1),
    ORIENTATION_LANDSCAPE(2),
    UNRECOGNIZED(-1);

    private static final zzhaa zze = new zzhaa() { // from class: com.google.android.gms.internal.ads.zzflr
        @Override // com.google.android.gms.internal.ads.zzhaa
        public final /* synthetic */ zzgzz zza(int i) {
            zzfls zzflsVar = zzfls.ORIENTATION_UNKNOWN;
            if (i == 0) {
                return zzfls.ORIENTATION_UNKNOWN;
            }
            if (i == 1) {
                return zzfls.ORIENTATION_PORTRAIT;
            }
            if (i != 2) {
                return null;
            }
            return zzfls.ORIENTATION_LANDSCAPE;
        }
    };
    private final int zzg;

    zzfls(int i) {
        this.zzg = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgzz
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzg;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
