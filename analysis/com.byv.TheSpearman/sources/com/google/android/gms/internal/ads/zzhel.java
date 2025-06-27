package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public enum zzhel implements zzgzz {
    UNSPECIFIED(0),
    TAILORED_WARNING_CT_BASE(1),
    TAILORED_WARNING_CT(2),
    TAILORED_WARNING_CT_ACCOUNT_INFO(3),
    TAILORED_WARNING_SUSPICIOUS_BASE(4),
    TAILORED_WARNING_SUSPICIOUS(5);

    private static final zzhaa zzg = new zzhaa() { // from class: com.google.android.gms.internal.ads.zzhej
        @Override // com.google.android.gms.internal.ads.zzhaa
        public final /* synthetic */ zzgzz zza(int i) {
            return zzhel.zzb(i);
        }
    };
    private final int zzi;

    zzhel(int i) {
        this.zzi = i;
    }

    public static zzhel zzb(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return TAILORED_WARNING_CT_BASE;
        }
        if (i == 2) {
            return TAILORED_WARNING_CT;
        }
        if (i == 3) {
            return TAILORED_WARNING_CT_ACCOUNT_INFO;
        }
        if (i == 4) {
            return TAILORED_WARNING_SUSPICIOUS_BASE;
        }
        if (i != 5) {
            return null;
        }
        return TAILORED_WARNING_SUSPICIOUS;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzi);
    }

    @Override // com.google.android.gms.internal.ads.zzgzz
    public final int zza() {
        return this.zzi;
    }
}
