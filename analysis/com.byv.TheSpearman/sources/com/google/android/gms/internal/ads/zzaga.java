package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzaga extends zzadu {
    final /* synthetic */ zzaef zza;
    final /* synthetic */ zzagb zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzaga(zzagb zzagbVar, zzaef zzaefVar, zzaef zzaefVar2) {
        super(zzaefVar);
        this.zza = zzaefVar2;
        this.zzb = zzagbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadu, com.google.android.gms.internal.ads.zzaef
    public final zzaed zzg(long j) {
        zzaed zzaedVarZzg = this.zza.zzg(j);
        zzaeg zzaegVar = zzaedVarZzg.zza;
        zzaeg zzaegVar2 = new zzaeg(zzaegVar.zzb, zzaegVar.zzc + this.zzb.zzb);
        zzaeg zzaegVar3 = zzaedVarZzg.zzb;
        return new zzaed(zzaegVar2, new zzaeg(zzaegVar3.zzb, zzaegVar3.zzc + this.zzb.zzb));
    }
}
