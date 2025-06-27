package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public enum zzhhl implements zzgzz {
    UNKNOWN(0),
    PHISHING_INTERSTITIAL(1),
    CLIENT_SIDE_PHISHING_INTERSTITIAL(2),
    MALWARE_INTERSTITIAL(3),
    UWS_INTERSTITIAL(4),
    BILLING_INTERSTITIAL(5),
    BINARY_MALWARE_DOWNLOAD_WARNING(6);

    private static final zzhaa zzh = new zzhaa() { // from class: com.google.android.gms.internal.ads.zzhhj
        @Override // com.google.android.gms.internal.ads.zzhaa
        public final /* synthetic */ zzgzz zza(int i) {
            return zzhhl.zzb(i);
        }
    };
    private final int zzj;

    zzhhl(int i) {
        this.zzj = i;
    }

    public static zzhhl zzb(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return PHISHING_INTERSTITIAL;
            case 2:
                return CLIENT_SIDE_PHISHING_INTERSTITIAL;
            case 3:
                return MALWARE_INTERSTITIAL;
            case 4:
                return UWS_INTERSTITIAL;
            case 5:
                return BILLING_INTERSTITIAL;
            case 6:
                return BINARY_MALWARE_DOWNLOAD_WARNING;
            default:
                return null;
        }
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzgzz
    public final int zza() {
        return this.zzj;
    }
}
