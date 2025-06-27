package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public enum zzfqt implements zzgzz {
    EVENT_TYPE_UNKNOWN(0),
    BLOCKED_IMPRESSION(1);

    private static final zzhaa zzc = new zzhaa() { // from class: com.google.android.gms.internal.ads.zzfqr
        @Override // com.google.android.gms.internal.ads.zzhaa
        public final /* synthetic */ zzgzz zza(int i) {
            return zzfqt.zzb(i);
        }
    };
    private final int zze;

    zzfqt(int i) {
        this.zze = i;
    }

    public static zzfqt zzb(int i) {
        if (i == 0) {
            return EVENT_TYPE_UNKNOWN;
        }
        if (i != 1) {
            return null;
        }
        return BLOCKED_IMPRESSION;
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
