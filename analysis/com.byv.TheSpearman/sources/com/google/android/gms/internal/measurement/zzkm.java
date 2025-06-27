package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.0 */
/* loaded from: classes3.dex */
public class zzkm {
    private static final zzji zza = zzji.zza;
    private zzii zzb;
    private volatile zzli zzc;
    private volatile zzii zzd;

    public int hashCode() {
        return 1;
    }

    public final int zzb() {
        if (this.zzd != null) {
            return this.zzd.zzb();
        }
        if (this.zzc != null) {
            return this.zzc.zzby();
        }
        return 0;
    }

    public final zzii zzc() {
        if (this.zzd != null) {
            return this.zzd;
        }
        synchronized (this) {
            if (this.zzd != null) {
                return this.zzd;
            }
            if (this.zzc == null) {
                this.zzd = zzii.zza;
            } else {
                this.zzd = this.zzc.zzbw();
            }
            return this.zzd;
        }
    }

    private final zzli zzb(zzli zzliVar) {
        if (this.zzc == null) {
            synchronized (this) {
                if (this.zzc == null) {
                    try {
                        this.zzc = zzliVar;
                        this.zzd = zzii.zza;
                    } catch (zzkd unused) {
                        this.zzc = zzliVar;
                        this.zzd = zzii.zza;
                    }
                }
            }
        }
        return this.zzc;
    }

    public final zzli zza(zzli zzliVar) {
        zzli zzliVar2 = this.zzc;
        this.zzb = null;
        this.zzd = null;
        this.zzc = zzliVar;
        return zzliVar2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzkm)) {
            return false;
        }
        zzkm zzkmVar = (zzkm) obj;
        zzli zzliVar = this.zzc;
        zzli zzliVar2 = zzkmVar.zzc;
        if (zzliVar == null && zzliVar2 == null) {
            return zzc().equals(zzkmVar.zzc());
        }
        if (zzliVar != null && zzliVar2 != null) {
            return zzliVar.equals(zzliVar2);
        }
        if (zzliVar != null) {
            return zzliVar.equals(zzkmVar.zzb(zzliVar.zzaj()));
        }
        return zzb(zzliVar2.zzaj()).equals(zzliVar2);
    }
}
