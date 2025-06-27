package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzffa implements zzeoq {
    private final Context zza;
    private final Executor zzb;
    private final zzcik zzc;
    private final zzfeq zzd;
    private final zzfde zze;
    private final zzfga zzf;
    private final zzflk zzg;
    private final zzfgg zzh;
    private ListenableFuture zzi;

    public zzffa(Context context, Executor executor, zzcik zzcikVar, zzfde zzfdeVar, zzfeq zzfeqVar, zzfgg zzfggVar, zzfga zzfgaVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcikVar;
        this.zze = zzfdeVar;
        this.zzd = zzfeqVar;
        this.zzh = zzfggVar;
        this.zzf = zzfgaVar;
        this.zzg = zzcikVar.zzz();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzdqq zzk(zzfdc zzfdcVar) {
        zzdqq zzdqqVarZzi = this.zzc.zzi();
        zzcxy zzcxyVar = new zzcxy();
        zzcxyVar.zze(this.zza);
        zzcxyVar.zzi(((zzfez) zzfdcVar).zza);
        zzcxyVar.zzh(this.zzf);
        zzdqqVarZzi.zzd(zzcxyVar.zzj());
        zzdqqVarZzi.zzc(new zzdef().zzn());
        return zzdqqVarZzi;
    }

    @Override // com.google.android.gms.internal.ads.zzeoq
    public final boolean zza() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    @Override // com.google.android.gms.internal.ads.zzeoq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzl r10, java.lang.String r11, com.google.android.gms.internal.ads.zzeoo r12, com.google.android.gms.internal.ads.zzeop r13) throws org.json.JSONException, android.os.RemoteException {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzffa.zzb(com.google.android.gms.ads.internal.client.zzl, java.lang.String, com.google.android.gms.internal.ads.zzeoo, com.google.android.gms.internal.ads.zzeop):boolean");
    }

    final /* synthetic */ void zzi() {
        this.zzd.zzdB(zzfhk.zzd(6, null, null));
    }

    final void zzj(int i) {
        this.zzh.zzp().zza(i);
    }
}
