package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcpw implements zzcyq, zzdae, zzczk, com.google.android.gms.ads.internal.client.zza, zzczg, zzdge {
    private final Context zza;
    private final Executor zzb;
    private final Executor zzc;
    private final ScheduledExecutorService zzd;
    private final zzffz zze;
    private final zzffn zzf;
    private final zzfmp zzg;
    private final zzfgu zzh;
    private final zzawo zzi;
    private final zzbfc zzj;
    private final zzflh zzk;
    private final WeakReference zzl;
    private final WeakReference zzm;
    private final zzcxs zzn;
    private boolean zzo;
    private final AtomicBoolean zzp = new AtomicBoolean();
    private final zzbfe zzq;

    zzcpw(Context context, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, zzffz zzffzVar, zzffn zzffnVar, zzfmp zzfmpVar, zzfgu zzfguVar, View view, zzcgm zzcgmVar, zzawo zzawoVar, zzbfc zzbfcVar, zzbfe zzbfeVar, zzflh zzflhVar, zzcxs zzcxsVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = executor2;
        this.zzd = scheduledExecutorService;
        this.zze = zzffzVar;
        this.zzf = zzffnVar;
        this.zzg = zzfmpVar;
        this.zzh = zzfguVar;
        this.zzi = zzawoVar;
        this.zzl = new WeakReference(view);
        this.zzm = new WeakReference(zzcgmVar);
        this.zzj = zzbfcVar;
        this.zzq = zzbfeVar;
        this.zzk = zzflhVar;
        this.zzn = zzcxsVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List zzu() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzlb)).booleanValue()) {
            com.google.android.gms.ads.internal.zzu.zzp();
            if (com.google.android.gms.ads.internal.util.zzt.zzB(this.zza)) {
                com.google.android.gms.ads.internal.zzu.zzp();
                Integer numZzs = com.google.android.gms.ads.internal.util.zzt.zzs(this.zza);
                if (numZzs != null) {
                    Integer numValueOf = Integer.valueOf(Math.min(numZzs.intValue(), 20));
                    ArrayList arrayList = new ArrayList();
                    Iterator it = this.zzf.zzd.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Uri.parse((String) it.next()).buildUpon().appendQueryParameter("dspct", Integer.toString(numValueOf.intValue())).toString());
                    }
                    return arrayList;
                }
            }
        }
        return this.zzf.zzd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzv() {
        String strZzh;
        int i;
        List list = this.zzf.zzd;
        if (list == null || list.isEmpty()) {
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzds)).booleanValue()) {
            strZzh = this.zzi.zzc().zzh(this.zza, (View) this.zzl.get(), null);
        } else {
            strZzh = null;
        }
        if ((((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzan)).booleanValue() && this.zze.zzb.zzb.zzg) || !((Boolean) zzbfs.zzh.zze()).booleanValue()) {
            this.zzh.zza(this.zzg.zzd(this.zze, this.zzf, false, strZzh, null, zzu()));
            return;
        }
        if (((Boolean) zzbfs.zzg.zze()).booleanValue() && ((i = this.zzf.zzb) == 1 || i == 2 || i == 5)) {
        }
        zzgee.zzr((zzgdv) zzgee.zzo(zzgdv.zzu(zzgee.zzh(null)), ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzaV)).longValue(), TimeUnit.MILLISECONDS, this.zzd), new zzcpv(this, strZzh), this.zzb);
    }

    private final void zzw(final int i, final int i2) {
        View view;
        if (i <= 0 || !((view = (View) this.zzl.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            zzv();
        } else {
            this.zzd.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcpt
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzp(i, i2);
                }
            }, i2, TimeUnit.MILLISECONDS);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (!(((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzan)).booleanValue() && this.zze.zzb.zzb.zzg) && ((Boolean) zzbfs.zzd.zze()).booleanValue()) {
            zzgee.zzr(zzgee.zze(zzgdv.zzu(this.zzj.zza()), Throwable.class, new zzfwf() { // from class: com.google.android.gms.internal.ads.zzcpq
                @Override // com.google.android.gms.internal.ads.zzfwf
                public final Object apply(Object obj) {
                    return "failure_click_attok";
                }
            }, zzcbr.zzf), new zzcpu(this), this.zzb);
            return;
        }
        zzfgu zzfguVar = this.zzh;
        zzfmp zzfmpVar = this.zzg;
        zzffz zzffzVar = this.zze;
        zzffn zzffnVar = this.zzf;
        zzfguVar.zzc(zzfmpVar.zzc(zzffzVar, zzffnVar, zzffnVar.zzc), true == com.google.android.gms.ads.internal.zzu.zzo().zzz(this.zza) ? 2 : 1);
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzds(zzbxq zzbxqVar, String str, String str2) {
        zzfmp zzfmpVar = this.zzg;
        zzffn zzffnVar = this.zzf;
        this.zzh.zza(zzfmpVar.zze(zzffnVar, zzffnVar.zzi, zzbxqVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zze() {
        zzfmp zzfmpVar = this.zzg;
        zzffz zzffzVar = this.zze;
        zzffn zzffnVar = this.zzf;
        this.zzh.zza(zzfmpVar.zzc(zzffzVar, zzffnVar, zzffnVar.zzj));
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzf() {
        zzfmp zzfmpVar = this.zzg;
        zzffz zzffzVar = this.zze;
        zzffn zzffnVar = this.zzf;
        this.zzh.zza(zzfmpVar.zzc(zzffzVar, zzffnVar, zzffnVar.zzh));
    }

    final /* synthetic */ void zzn() {
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcps
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzv();
            }
        });
    }

    final /* synthetic */ void zzo(int i, int i2) {
        zzw(i - 1, i2);
    }

    final /* synthetic */ void zzp(final int i, final int i2) {
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcpr
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzo(i, i2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzczg
    public final void zzq(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzbv)).booleanValue()) {
            this.zzh.zza(this.zzg.zzc(this.zze, this.zzf, zzfmp.zzf(2, zzeVar.zza, this.zzf.zzp)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczk
    public final void zzr() {
        if (this.zzp.compareAndSet(false, true)) {
            int iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzdB)).intValue();
            if (iIntValue > 0) {
                zzw(iIntValue, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzdC)).intValue());
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzdA)).booleanValue()) {
                this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcpp
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzn();
                    }
                });
            } else {
                zzv();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdae
    public final synchronized void zzs() {
        zzcxs zzcxsVar;
        if (this.zzo) {
            ArrayList arrayList = new ArrayList(zzu());
            arrayList.addAll(this.zzf.zzg);
            this.zzh.zza(this.zzg.zzd(this.zze, this.zzf, true, null, null, arrayList));
        } else {
            zzfgu zzfguVar = this.zzh;
            zzfmp zzfmpVar = this.zzg;
            zzffz zzffzVar = this.zze;
            zzffn zzffnVar = this.zzf;
            zzfguVar.zza(zzfmpVar.zzc(zzffzVar, zzffnVar, zzffnVar.zzn));
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzdx)).booleanValue() && (zzcxsVar = this.zzn) != null) {
                List listZzh = zzfmp.zzh(zzfmp.zzg(zzcxsVar.zzb().zzn, zzcxsVar.zza().zzg()), this.zzn.zza().zza());
                zzfgu zzfguVar2 = this.zzh;
                zzfmp zzfmpVar2 = this.zzg;
                zzcxs zzcxsVar2 = this.zzn;
                zzfguVar2.zza(zzfmpVar2.zzc(zzcxsVar2.zzc(), zzcxsVar2.zzb(), listZzh));
            }
            zzfgu zzfguVar3 = this.zzh;
            zzfmp zzfmpVar3 = this.zzg;
            zzffz zzffzVar2 = this.zze;
            zzffn zzffnVar2 = this.zzf;
            zzfguVar3.zza(zzfmpVar3.zzc(zzffzVar2, zzffnVar2, zzffnVar2.zzg));
        }
        this.zzo = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdge
    public final void zzt() {
        zzfmp zzfmpVar = this.zzg;
        zzffz zzffzVar = this.zze;
        zzffn zzffnVar = this.zzf;
        this.zzh.zza(zzfmpVar.zzc(zzffzVar, zzffnVar, zzffnVar.zzau));
    }
}
