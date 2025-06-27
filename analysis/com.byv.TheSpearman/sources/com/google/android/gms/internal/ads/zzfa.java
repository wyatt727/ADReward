package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzfa {
    public final Object zza;
    private zzaf zzb = new zzaf();
    private boolean zzc;
    private boolean zzd;

    public zzfa(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.zza.equals(((zzfa) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zza(int i, zzey zzeyVar) {
        if (this.zzd) {
            return;
        }
        if (i != -1) {
            this.zzb.zza(i);
        }
        this.zzc = true;
        zzeyVar.zza(this.zza);
    }

    public final void zzb(zzez zzezVar) {
        if (this.zzd || !this.zzc) {
            return;
        }
        zzah zzahVarZzb = this.zzb.zzb();
        this.zzb = new zzaf();
        this.zzc = false;
        zzezVar.zza(this.zza, zzahVarZzb);
    }

    public final void zzc(zzez zzezVar) {
        this.zzd = true;
        if (this.zzc) {
            this.zzc = false;
            zzezVar.zza(this.zza, this.zzb.zzb());
        }
    }
}
