package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public abstract class zzzf {
    private zzze zza;
    private zzzn zzb;

    public zzmg zze() {
        throw null;
    }

    public void zzj() {
        this.zza = null;
        this.zzb = null;
    }

    public void zzk(zzk zzkVar) {
        throw null;
    }

    public boolean zzn() {
        throw null;
    }

    public abstract zzzg zzp(zzmh[] zzmhVarArr, zzxk zzxkVar, zzvh zzvhVar, zzcx zzcxVar) throws zziz;

    public abstract void zzq(Object obj);

    protected final zzzn zzr() {
        zzzn zzznVar = this.zzb;
        zzek.zzb(zzznVar);
        return zzznVar;
    }

    public final void zzs(zzze zzzeVar, zzzn zzznVar) {
        this.zza = zzzeVar;
        this.zzb = zzznVar;
    }

    protected final void zzt() {
        zzze zzzeVar = this.zza;
        if (zzzeVar != null) {
            zzzeVar.zzj();
        }
    }
}
