package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public enum zzhgj implements zzgzz {
    UNSPECIFIED(0),
    PHISHY_CLICK_EVENT(1),
    PHISHY_KEY_EVENT(2),
    PHISHY_PASTE_EVENT(3);

    private static final zzhaa zze = new zzhaa() { // from class: com.google.android.gms.internal.ads.zzhgh
        @Override // com.google.android.gms.internal.ads.zzhaa
        public final /* synthetic */ zzgzz zza(int i) {
            return zzhgj.zzb(i);
        }
    };
    private final int zzg;

    zzhgj(int i) {
        this.zzg = i;
    }

    public static zzhgj zzb(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return PHISHY_CLICK_EVENT;
        }
        if (i == 2) {
            return PHISHY_KEY_EVENT;
        }
        if (i != 3) {
            return null;
        }
        return PHISHY_PASTE_EVENT;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzgzz
    public final int zza() {
        return this.zzg;
    }
}
