package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzfq<V> {
    private static final Object zza = new Object();
    private final String zzb;
    private final zzfo<V> zzc;
    private final V zzd;
    private final V zze;
    private final Object zzf;
    private volatile V zzg;
    private volatile V zzh;

    public final V zza(V v) {
        synchronized (this.zzf) {
        }
        if (v != null) {
            return v;
        }
        if (zzfn.zza == null) {
            return this.zzd;
        }
        synchronized (zza) {
            if (zzab.zza()) {
                return this.zzh == null ? this.zzd : this.zzh;
            }
            try {
                for (zzfq zzfqVar : zzbf.zzdh) {
                    if (zzab.zza()) {
                        throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                    }
                    V vZza = null;
                    try {
                        zzfo<V> zzfoVar = zzfqVar.zzc;
                        if (zzfoVar != null) {
                            vZza = zzfoVar.zza();
                        }
                    } catch (IllegalStateException unused) {
                    }
                    synchronized (zza) {
                        zzfqVar.zzh = vZza;
                    }
                }
            } catch (SecurityException unused2) {
            }
            zzfo<V> zzfoVar2 = this.zzc;
            if (zzfoVar2 == null) {
                return this.zzd;
            }
            try {
                return zzfoVar2.zza();
            } catch (IllegalStateException unused3) {
                return this.zzd;
            } catch (SecurityException unused4) {
                return this.zzd;
            }
        }
    }

    public final String zza() {
        return this.zzb;
    }

    private zzfq(String str, V v, V v2, zzfo<V> zzfoVar) {
        this.zzf = new Object();
        this.zzg = null;
        this.zzh = null;
        this.zzb = str;
        this.zzd = v;
        this.zze = v2;
        this.zzc = zzfoVar;
    }
}
