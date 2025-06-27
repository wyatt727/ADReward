package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public enum zzhhv implements zzgzz {
    UNDEFINED(0),
    BROWSER_INITIATED(1),
    RENDERER_INITIATED_WITHOUT_USER_GESTURE(2),
    RENDERER_INITIATED_WITH_USER_GESTURE(3),
    COPY_PASTE_USER_INITIATED(4),
    NOTIFICATION_INITIATED(5);

    private static final zzhaa zzg = new zzhaa() { // from class: com.google.android.gms.internal.ads.zzhht
        @Override // com.google.android.gms.internal.ads.zzhaa
        public final /* synthetic */ zzgzz zza(int i) {
            return zzhhv.zzb(i);
        }
    };
    private final int zzi;

    zzhhv(int i) {
        this.zzi = i;
    }

    public static zzhhv zzb(int i) {
        if (i == 0) {
            return UNDEFINED;
        }
        if (i == 1) {
            return BROWSER_INITIATED;
        }
        if (i == 2) {
            return RENDERER_INITIATED_WITHOUT_USER_GESTURE;
        }
        if (i == 3) {
            return RENDERER_INITIATED_WITH_USER_GESTURE;
        }
        if (i == 4) {
            return COPY_PASTE_USER_INITIATED;
        }
        if (i != 5) {
            return null;
        }
        return NOTIFICATION_INITIATED;
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
