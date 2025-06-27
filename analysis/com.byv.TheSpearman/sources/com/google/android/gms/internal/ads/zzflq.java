package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public enum zzflq implements zzgzz {
    FORMAT_UNKNOWN(0),
    FORMAT_BANNER(1),
    FORMAT_INTERSTITIAL(2),
    FORMAT_REWARDED(3),
    FORMAT_REWARDED_INTERSTITIAL(4),
    FORMAT_APP_OPEN(5),
    FORMAT_NATIVE(6),
    UNRECOGNIZED(-1);

    private static final zzhaa zzi = new zzhaa() { // from class: com.google.android.gms.internal.ads.zzflp
        @Override // com.google.android.gms.internal.ads.zzhaa
        public final /* synthetic */ zzgzz zza(int i) {
            zzflq zzflqVar = zzflq.FORMAT_UNKNOWN;
            switch (i) {
                case 0:
                    return zzflq.FORMAT_UNKNOWN;
                case 1:
                    return zzflq.FORMAT_BANNER;
                case 2:
                    return zzflq.FORMAT_INTERSTITIAL;
                case 3:
                    return zzflq.FORMAT_REWARDED;
                case 4:
                    return zzflq.FORMAT_REWARDED_INTERSTITIAL;
                case 5:
                    return zzflq.FORMAT_APP_OPEN;
                case 6:
                    return zzflq.FORMAT_NATIVE;
                default:
                    return null;
            }
        }
    };
    private final int zzk;

    zzflq(int i) {
        this.zzk = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgzz
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzk;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
