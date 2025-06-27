package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public enum zzfqm implements zzgzz {
    BLOCKED_REASON_UNKNOWN(1),
    BLOCKED_REASON_BACKGROUND(2);

    private static final zzhaa zzc = new zzhaa() { // from class: com.google.android.gms.internal.ads.zzfqk
        @Override // com.google.android.gms.internal.ads.zzhaa
        public final /* synthetic */ zzgzz zza(int i) {
            return zzfqm.zzb(i);
        }
    };
    private final int zze;

    zzfqm(int i) {
        this.zze = i;
    }

    public static zzfqm zzb(int i) {
        if (i == 1) {
            return BLOCKED_REASON_UNKNOWN;
        }
        if (i != 2) {
            return null;
        }
        return BLOCKED_REASON_BACKGROUND;
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
