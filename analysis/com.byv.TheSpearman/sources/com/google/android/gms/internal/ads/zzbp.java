package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbp {
    public final String zzc;
    public final zzbi zzd;

    @Deprecated
    public final zzbi zze;
    public final zzbf zzf;
    public final zzbv zzg;
    public final zzav zzh;

    @Deprecated
    public final zzax zzi;
    public final zzbl zzj;
    public static final zzbp zza = new zzar().zzc();
    private static final String zzk = Integer.toString(0, 36);
    private static final String zzl = Integer.toString(1, 36);
    private static final String zzm = Integer.toString(2, 36);
    private static final String zzn = Integer.toString(3, 36);
    private static final String zzo = Integer.toString(4, 36);
    private static final String zzp = Integer.toString(5, 36);

    @Deprecated
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzao
    };

    /* synthetic */ zzbp(String str, zzax zzaxVar, zzbi zzbiVar, zzbf zzbfVar, zzbv zzbvVar, zzbl zzblVar, zzbo zzboVar) {
        this.zzc = str;
        this.zzd = zzbiVar;
        this.zze = zzbiVar;
        this.zzf = zzbfVar;
        this.zzg = zzbvVar;
        this.zzh = zzaxVar;
        this.zzi = zzaxVar;
        this.zzj = zzblVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbp)) {
            return false;
        }
        zzbp zzbpVar = (zzbp) obj;
        return zzfx.zzG(this.zzc, zzbpVar.zzc) && this.zzh.equals(zzbpVar.zzh) && zzfx.zzG(this.zzd, zzbpVar.zzd) && zzfx.zzG(this.zzf, zzbpVar.zzf) && zzfx.zzG(this.zzg, zzbpVar.zzg) && zzfx.zzG(this.zzj, zzbpVar.zzj);
    }

    public final int hashCode() {
        int iHashCode = this.zzc.hashCode() * 31;
        zzbi zzbiVar = this.zzd;
        return (((((((iHashCode + (zzbiVar != null ? zzbiVar.hashCode() : 0)) * 31) + this.zzf.hashCode()) * 31) + this.zzh.hashCode()) * 31) + this.zzg.hashCode()) * 31;
    }
}
