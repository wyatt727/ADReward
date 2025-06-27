package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public enum zzflu implements zzgzz {
    OS_UNKNOWN(0),
    OS_ANDROID(1),
    OS_IOS(2),
    UNRECOGNIZED(-1);

    private static final zzhaa zze = new zzhaa() { // from class: com.google.android.gms.internal.ads.zzflt
        @Override // com.google.android.gms.internal.ads.zzhaa
        public final /* synthetic */ zzgzz zza(int i) {
            zzflu zzfluVar = zzflu.OS_UNKNOWN;
            if (i == 0) {
                return zzflu.OS_UNKNOWN;
            }
            if (i == 1) {
                return zzflu.OS_ANDROID;
            }
            if (i != 2) {
                return null;
            }
            return zzflu.OS_IOS;
        }
    };
    private final int zzg;

    zzflu(int i) {
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
