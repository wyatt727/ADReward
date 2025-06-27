package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzend extends com.google.android.gms.ads.internal.client.zzbp {
    final zzfgg zza;
    final zzdlh zzb;
    private final Context zzc;
    private final zzcik zzd;
    private com.google.android.gms.ads.internal.client.zzbh zze;

    public zzend(zzcik zzcikVar, Context context, String str) {
        zzfgg zzfggVar = new zzfgg();
        this.zza = zzfggVar;
        this.zzb = new zzdlh();
        this.zzd = zzcikVar;
        zzfggVar.zzt(str);
        this.zzc = context;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final com.google.android.gms.ads.internal.client.zzbn zze() {
        zzdlj zzdljVarZzg = this.zzb.zzg();
        this.zza.zzD(zzdljVarZzg.zzi());
        this.zza.zzE(zzdljVarZzg.zzh());
        zzfgg zzfggVar = this.zza;
        if (zzfggVar.zzh() == null) {
            zzfggVar.zzs(com.google.android.gms.ads.internal.client.zzq.zzc());
        }
        return new zzene(this.zzc, this.zzd, this.zza, zzdljVarZzg, this.zze);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzf(zzbic zzbicVar) {
        this.zzb.zza(zzbicVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzg(zzbif zzbifVar) {
        this.zzb.zzb(zzbifVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzh(String str, zzbil zzbilVar, zzbii zzbiiVar) {
        this.zzb.zzc(str, zzbilVar, zzbiiVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzi(zzbnr zzbnrVar) {
        this.zzb.zzd(zzbnrVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzj(zzbip zzbipVar, com.google.android.gms.ads.internal.client.zzq zzqVar) {
        this.zzb.zze(zzbipVar);
        this.zza.zzs(zzqVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzk(zzbis zzbisVar) {
        this.zzb.zzf(zzbisVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzl(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        this.zze = zzbhVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzm(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.zza.zzr(adManagerAdViewOptions);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzn(zzbni zzbniVar) {
        this.zza.zzw(zzbniVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzo(zzbgt zzbgtVar) {
        this.zza.zzC(zzbgtVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzp(PublisherAdViewOptions publisherAdViewOptions) {
        this.zza.zzF(publisherAdViewOptions);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzq(com.google.android.gms.ads.internal.client.zzcf zzcfVar) {
        this.zza.zzS(zzcfVar);
    }
}
