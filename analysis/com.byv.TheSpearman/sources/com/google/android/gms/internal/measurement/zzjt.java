package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjv;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.0 */
/* loaded from: classes3.dex */
final class zzjt implements zzlf {
    private static final zzjt zza = new zzjt();

    public static zzjt zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzlf
    public final zzlg zza(Class<?> cls) {
        if (!zzjv.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (zzlg) zzjv.zza(cls.asSubclass(zzjv.class)).zza(zzjv.zzf.zzc, (Object) null, (Object) null);
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e);
        }
    }

    private zzjt() {
    }

    @Override // com.google.android.gms.internal.measurement.zzlf
    public final boolean zzb(Class<?> cls) {
        return zzjv.class.isAssignableFrom(cls);
    }
}
