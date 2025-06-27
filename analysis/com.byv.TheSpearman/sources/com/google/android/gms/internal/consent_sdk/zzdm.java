package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.2.0 */
/* loaded from: classes3.dex */
public final class zzdm implements zzdq {
    private static final Object zza = new Object();
    private volatile zzdq zzb;
    private volatile Object zzc = zza;

    private zzdm(zzdq zzdqVar) {
        this.zzb = zzdqVar;
    }

    public static zzdq zzb(zzdq zzdqVar) {
        return zzdqVar instanceof zzdm ? zzdqVar : new zzdm(zzdqVar);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdr
    public final Object zza() {
        Object objZza = this.zzc;
        Object obj = zza;
        if (objZza == obj) {
            synchronized (this) {
                objZza = this.zzc;
                if (objZza == obj) {
                    objZza = this.zzb.zza();
                    Object obj2 = this.zzc;
                    if (obj2 != obj && obj2 != objZza) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + objZza + ". This is likely due to a circular dependency.");
                    }
                    this.zzc = objZza;
                    this.zzb = null;
                }
            }
        }
        return objZza;
    }
}
