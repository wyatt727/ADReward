package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcqh implements zzazy, zzczl, com.google.android.gms.ads.internal.overlay.zzp, zzczk {
    private final zzcqc zza;
    private final zzcqd zzb;
    private final zzbqc zzd;
    private final Executor zze;
    private final Clock zzf;
    private final Set zzc = new HashSet();
    private final AtomicBoolean zzg = new AtomicBoolean(false);
    private final zzcqg zzh = new zzcqg();
    private boolean zzi = false;
    private WeakReference zzj = new WeakReference(this);

    public zzcqh(zzbpz zzbpzVar, zzcqd zzcqdVar, Executor executor, zzcqc zzcqcVar, Clock clock) {
        this.zza = zzcqcVar;
        this.zzd = zzbpzVar.zza("google.afma.activeView.handleUpdate", zzbpn.zza, zzbpn.zza);
        this.zzb = zzcqdVar;
        this.zze = executor;
        this.zzf = clock;
    }

    private final void zzk() {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            this.zza.zzf((zzcgm) it.next());
        }
        this.zza.zze();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final synchronized void zzdH() {
        this.zzh.zzb = false;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    public final synchronized void zzdj(Context context) {
        this.zzh.zze = "u";
        zzg();
        zzk();
        this.zzi = true;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final synchronized void zzdk() {
        this.zzh.zzb = true;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    public final synchronized void zzdl(Context context) {
        this.zzh.zzb = true;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    public final synchronized void zzdm(Context context) {
        this.zzh.zzb = false;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzazy
    public final synchronized void zzdp(zzazx zzazxVar) {
        zzcqg zzcqgVar = this.zzh;
        zzcqgVar.zza = zzazxVar.zzj;
        zzcqgVar.zzf = zzazxVar;
        zzg();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdq() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdr() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdt() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdu(int i) {
    }

    public final synchronized void zzg() {
        if (this.zzj.get() == null) {
            zzj();
            return;
        }
        if (this.zzi || !this.zzg.get()) {
            return;
        }
        try {
            this.zzh.zzd = this.zzf.elapsedRealtime();
            final JSONObject jSONObjectZza = this.zzb.zzb(this.zzh);
            for (final zzcgm zzcgmVar : this.zzc) {
                this.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqf
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcgmVar.zzl("AFMA_updateActiveView", jSONObjectZza);
                    }
                });
            }
            zzcbu.zzb(this.zzd.zzb(jSONObjectZza), "ActiveViewListener.callActiveViewJs");
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed to call ActiveViewJS", e);
        }
    }

    public final synchronized void zzh(zzcgm zzcgmVar) {
        this.zzc.add(zzcgmVar);
        this.zza.zzd(zzcgmVar);
    }

    public final void zzi(Object obj) {
        this.zzj = new WeakReference(obj);
    }

    public final synchronized void zzj() {
        zzk();
        this.zzi = true;
    }

    @Override // com.google.android.gms.internal.ads.zzczk
    public final synchronized void zzr() {
        if (this.zzg.compareAndSet(false, true)) {
            this.zza.zzc(this);
            zzg();
        }
    }
}
