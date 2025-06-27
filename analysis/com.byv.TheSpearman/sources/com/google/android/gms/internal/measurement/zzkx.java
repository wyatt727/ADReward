package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.0 */
/* loaded from: classes3.dex */
final class zzkx implements zzlf {
    private zzlf[] zza;

    @Override // com.google.android.gms.internal.measurement.zzlf
    public final zzlg zza(Class<?> cls) {
        for (zzlf zzlfVar : this.zza) {
            if (zzlfVar.zzb(cls)) {
                return zzlfVar.zza(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
    }

    zzkx(zzlf... zzlfVarArr) {
        this.zza = zzlfVarArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzlf
    public final boolean zzb(Class<?> cls) {
        for (zzlf zzlfVar : this.zza) {
            if (zzlfVar.zzb(cls)) {
                return true;
            }
        }
        return false;
    }
}
