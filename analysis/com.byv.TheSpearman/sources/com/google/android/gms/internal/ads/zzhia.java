package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public enum zzhia implements zzgzz {
    EVENT_URL(1),
    LANDING_PAGE(2),
    LANDING_REFERRER(3),
    CLIENT_REDIRECT(4),
    SERVER_REDIRECT(5),
    RECENT_NAVIGATION(6),
    REFERRER(7);

    private static final zzhaa zzh = new zzhaa() { // from class: com.google.android.gms.internal.ads.zzhhy
        @Override // com.google.android.gms.internal.ads.zzhaa
        public final /* synthetic */ zzgzz zza(int i) {
            return zzhia.zzb(i);
        }
    };
    private final int zzj;

    zzhia(int i) {
        this.zzj = i;
    }

    public static zzhia zzb(int i) {
        switch (i) {
            case 1:
                return EVENT_URL;
            case 2:
                return LANDING_PAGE;
            case 3:
                return LANDING_REFERRER;
            case 4:
                return CLIENT_REDIRECT;
            case 5:
                return SERVER_REDIRECT;
            case 6:
                return RECENT_NAVIGATION;
            case 7:
                return REFERRER;
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
