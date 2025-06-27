package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public enum zzhfg implements zzgzz {
    SURFACE_UNSPECIFIED(0),
    BUBBLE_MAINPAGE(1),
    BUBBLE_SUBPAGE(2),
    DOWNLOADS_PAGE(3),
    DOWNLOAD_PROMPT(4),
    DOWNLOAD_NOTIFICATION(5);

    private static final zzhaa zzg = new zzhaa() { // from class: com.google.android.gms.internal.ads.zzhfe
        @Override // com.google.android.gms.internal.ads.zzhaa
        public final /* synthetic */ zzgzz zza(int i) {
            return zzhfg.zzb(i);
        }
    };
    private final int zzi;

    zzhfg(int i) {
        this.zzi = i;
    }

    public static zzhfg zzb(int i) {
        if (i == 0) {
            return SURFACE_UNSPECIFIED;
        }
        if (i == 1) {
            return BUBBLE_MAINPAGE;
        }
        if (i == 2) {
            return BUBBLE_SUBPAGE;
        }
        if (i == 3) {
            return DOWNLOADS_PAGE;
        }
        if (i == 4) {
            return DOWNLOAD_PROMPT;
        }
        if (i != 5) {
            return null;
        }
        return DOWNLOAD_NOTIFICATION;
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
