package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public enum zzhfc implements zzgzz {
    ACTION_UNSPECIFIED(0),
    PROCEED(1),
    DISCARD(2),
    KEEP(3),
    CLOSE(4),
    CANCEL(5),
    DISMISS(6),
    BACK(7),
    OPEN_SUBPAGE(8),
    PROCEED_DEEP_SCAN(9),
    OPEN_LEARN_MORE_LINK(10);

    private static final zzhaa zzl = new zzhaa() { // from class: com.google.android.gms.internal.ads.zzhfa
        @Override // com.google.android.gms.internal.ads.zzhaa
        public final /* synthetic */ zzgzz zza(int i) {
            return zzhfc.zzb(i);
        }
    };
    private final int zzn;

    zzhfc(int i) {
        this.zzn = i;
    }

    public static zzhfc zzb(int i) {
        switch (i) {
            case 0:
                return ACTION_UNSPECIFIED;
            case 1:
                return PROCEED;
            case 2:
                return DISCARD;
            case 3:
                return KEEP;
            case 4:
                return CLOSE;
            case 5:
                return CANCEL;
            case 6:
                return DISMISS;
            case 7:
                return BACK;
            case 8:
                return OPEN_SUBPAGE;
            case 9:
                return PROCEED_DEEP_SCAN;
            case 10:
                return OPEN_LEARN_MORE_LINK;
            default:
                return null;
        }
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzn);
    }

    @Override // com.google.android.gms.internal.ads.zzgzz
    public final int zza() {
        return this.zzn;
    }
}
