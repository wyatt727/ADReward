package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
final class zzgzo implements zzhbj {
    private static final zzgzo zza = new zzgzo();

    private zzgzo() {
    }

    public static zzgzo zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhbj
    public final zzhbi zzb(Class cls) {
        if (!zzgzv.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(String.valueOf(cls.getName())));
        }
        try {
            return (zzhbi) zzgzv.zzbh(cls.asSubclass(zzgzv.class)).zzbN();
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(String.valueOf(cls.getName())), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbj
    public final boolean zzc(Class cls) {
        return zzgzv.class.isAssignableFrom(cls);
    }
}
