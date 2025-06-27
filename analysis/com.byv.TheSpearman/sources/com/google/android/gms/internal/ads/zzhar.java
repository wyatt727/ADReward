package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public class zzhar {
    private static final zzgzf zzb = zzgzf.zza;
    protected volatile zzhbl zza;
    private volatile zzgyj zzc;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzhar)) {
            return false;
        }
        zzhar zzharVar = (zzhar) obj;
        zzhbl zzhblVar = this.zza;
        zzhbl zzhblVar2 = zzharVar.zza;
        if (zzhblVar == null && zzhblVar2 == null) {
            return zzb().equals(zzharVar.zzb());
        }
        if (zzhblVar != null && zzhblVar2 != null) {
            return zzhblVar.equals(zzhblVar2);
        }
        if (zzhblVar != null) {
            zzharVar.zzd(zzhblVar.zzbt());
            return zzhblVar.equals(zzharVar.zza);
        }
        zzd(zzhblVar2.zzbt());
        return this.zza.equals(zzhblVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzc != null) {
            return ((zzgyf) this.zzc).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzaY();
        }
        return 0;
    }

    public final zzgyj zzb() {
        if (this.zzc != null) {
            return this.zzc;
        }
        synchronized (this) {
            if (this.zzc != null) {
                return this.zzc;
            }
            if (this.zza == null) {
                this.zzc = zzgyj.zzb;
            } else {
                this.zzc = this.zza.zzaN();
            }
            return this.zzc;
        }
    }

    public final zzhbl zzc(zzhbl zzhblVar) {
        zzhbl zzhblVar2 = this.zza;
        this.zzc = null;
        this.zza = zzhblVar;
        return zzhblVar2;
    }

    protected final void zzd(zzhbl zzhblVar) {
        if (this.zza != null) {
            return;
        }
        synchronized (this) {
            if (this.zza != null) {
                return;
            }
            try {
                this.zza = zzhblVar;
                this.zzc = zzgyj.zzb;
            } catch (zzhak unused) {
                this.zza = zzhblVar;
                this.zzc = zzgyj.zzb;
            }
        }
    }
}
