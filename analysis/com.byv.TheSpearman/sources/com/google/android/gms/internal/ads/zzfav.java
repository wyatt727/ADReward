package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public abstract class zzfav implements zzeoq {
    protected final zzcik zza;
    private final Context zzb;
    private final Executor zzc;
    private final zzfbl zzd;
    private final zzfde zze;
    private final VersionInfoParcel zzf;
    private final ViewGroup zzg;
    private final zzflk zzh;
    private final zzfgg zzi;

    @Nullable
    private ListenableFuture zzj;

    protected zzfav(Context context, Executor executor, zzcik zzcikVar, zzfde zzfdeVar, zzfbl zzfblVar, zzfgg zzfggVar, VersionInfoParcel versionInfoParcel) {
        this.zzb = context;
        this.zzc = executor;
        this.zza = zzcikVar;
        this.zze = zzfdeVar;
        this.zzd = zzfblVar;
        this.zzi = zzfggVar;
        this.zzf = versionInfoParcel;
        this.zzg = new FrameLayout(context);
        this.zzh = zzcikVar.zzz();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized zzcxw zzm(zzfdc zzfdcVar) {
        zzfau zzfauVar = (zzfau) zzfdcVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzif)).booleanValue()) {
            zzcrj zzcrjVar = new zzcrj(this.zzg);
            zzcxy zzcxyVar = new zzcxy();
            zzcxyVar.zze(this.zzb);
            zzcxyVar.zzi(zzfauVar.zza);
            zzcya zzcyaVarZzj = zzcxyVar.zzj();
            zzdef zzdefVar = new zzdef();
            zzdefVar.zzc(this.zzd, this.zzc);
            zzdefVar.zzl(this.zzd, this.zzc);
            return zze(zzcrjVar, zzcyaVarZzj, zzdefVar.zzn());
        }
        zzfbl zzfblVarZzi = zzfbl.zzi(this.zzd);
        zzdef zzdefVar2 = new zzdef();
        zzdefVar2.zzb(zzfblVarZzi, this.zzc);
        zzdefVar2.zzg(zzfblVarZzi, this.zzc);
        zzdefVar2.zzh(zzfblVarZzi, this.zzc);
        zzdefVar2.zzi(zzfblVarZzi, this.zzc);
        zzdefVar2.zzc(zzfblVarZzi, this.zzc);
        zzdefVar2.zzl(zzfblVarZzi, this.zzc);
        zzdefVar2.zzm(zzfblVarZzi);
        zzcrj zzcrjVar2 = new zzcrj(this.zzg);
        zzcxy zzcxyVar2 = new zzcxy();
        zzcxyVar2.zze(this.zzb);
        zzcxyVar2.zzi(zzfauVar.zza);
        return zze(zzcrjVar2, zzcxyVar2.zzj(), zzdefVar2.zzn());
    }

    @Override // com.google.android.gms.internal.ads.zzeoq
    public final boolean zza() {
        ListenableFuture listenableFuture = this.zzj;
        return (listenableFuture == null || listenableFuture.isDone()) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
    @Override // com.google.android.gms.internal.ads.zzeoq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean zzb(com.google.android.gms.ads.internal.client.zzl r9, java.lang.String r10, com.google.android.gms.internal.ads.zzeoo r11, com.google.android.gms.internal.ads.zzeop r12) throws android.os.RemoteException {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfav.zzb(com.google.android.gms.ads.internal.client.zzl, java.lang.String, com.google.android.gms.internal.ads.zzeoo, com.google.android.gms.internal.ads.zzeop):boolean");
    }

    protected abstract zzcxw zze(zzcrj zzcrjVar, zzcya zzcyaVar, zzdeh zzdehVar);

    final /* synthetic */ void zzk() {
        this.zzd.zzdB(zzfhk.zzd(6, null, null));
    }

    public final void zzl(com.google.android.gms.ads.internal.client.zzw zzwVar) {
        this.zzi.zzu(zzwVar);
    }
}
