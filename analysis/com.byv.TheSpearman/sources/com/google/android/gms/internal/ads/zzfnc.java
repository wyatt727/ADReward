package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfnc extends zzfmy {
    private final zzfna zza;
    private final zzfmz zzb;
    private final zzfnu zzc;
    private zzfpg zzd;
    private zzfoe zze;
    private boolean zzf;
    private boolean zzg;
    private final String zzh;

    zzfnc(zzfmz zzfmzVar, zzfna zzfnaVar) {
        String string = UUID.randomUUID().toString();
        this.zzc = new zzfnu();
        this.zzf = false;
        this.zzg = false;
        this.zzb = zzfmzVar;
        this.zza = zzfnaVar;
        this.zzh = string;
        zzk(null);
        if (zzfnaVar.zzd() == zzfnb.HTML || zzfnaVar.zzd() == zzfnb.JAVASCRIPT) {
            this.zze = new zzfof(string, zzfnaVar.zza());
        } else {
            this.zze = new zzfoi(string, zzfnaVar.zzi(), null);
        }
        this.zze.zzn();
        zzfnq.zza().zzd(this);
        this.zze.zzf(zzfmzVar);
    }

    private final void zzk(View view) {
        this.zzd = new zzfpg(view);
    }

    @Override // com.google.android.gms.internal.ads.zzfmy
    public final void zzb(View view, zzfnf zzfnfVar, String str) {
        if (this.zzg) {
            return;
        }
        this.zzc.zzb(view, zzfnfVar, "Ad overlay");
    }

    @Override // com.google.android.gms.internal.ads.zzfmy
    public final void zzc() {
        if (this.zzg) {
            return;
        }
        this.zzd.clear();
        if (!this.zzg) {
            this.zzc.zzc();
        }
        this.zzg = true;
        this.zze.zze();
        zzfnq.zza().zze(this);
        this.zze.zzc();
        this.zze = null;
    }

    @Override // com.google.android.gms.internal.ads.zzfmy
    public final void zzd(View view) {
        if (this.zzg || zzf() == view) {
            return;
        }
        zzk(view);
        this.zze.zzb();
        Collection<zzfnc> collectionZzc = zzfnq.zza().zzc();
        if (collectionZzc == null || collectionZzc.isEmpty()) {
            return;
        }
        for (zzfnc zzfncVar : collectionZzc) {
            if (zzfncVar != this && zzfncVar.zzf() == view) {
                zzfncVar.zzd.clear();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfmy
    public final void zze() {
        if (this.zzf) {
            return;
        }
        this.zzf = true;
        zzfnq.zza().zzf(this);
        this.zze.zzl(zzfny.zzb().zza());
        this.zze.zzg(zzfno.zza().zzb());
        this.zze.zzi(this, this.zza);
    }

    public final View zzf() {
        return (View) this.zzd.get();
    }

    public final zzfoe zzg() {
        return this.zze;
    }

    public final String zzh() {
        return this.zzh;
    }

    public final List zzi() {
        return this.zzc.zza();
    }

    public final boolean zzj() {
        return this.zzf && !this.zzg;
    }
}
