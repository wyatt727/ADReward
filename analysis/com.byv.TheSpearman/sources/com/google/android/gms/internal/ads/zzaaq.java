package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzaaq implements zzaby, zzdn, zzabi {
    private static final Executor zza = new Executor() { // from class: com.google.android.gms.internal.ads.zzaai
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
        }
    };
    private final Context zzb;
    private final zzcp zzc;
    private final CopyOnWriteArraySet zzd;
    private zzel zze;
    private zzabd zzf;
    private zzabj zzg;
    private zzaba zzh;
    private zzev zzi;
    private zzcq zzj;
    private zzaao zzk;
    private List zzl;
    private Pair zzm;
    private int zzn;

    /* synthetic */ zzaaq(zzaaj zzaajVar, zzaap zzaapVar) {
        this.zzb = zzaajVar.zza;
        zzcp zzcpVar = zzaajVar.zzc;
        zzek.zzb(zzcpVar);
        this.zzc = zzcpVar;
        this.zzd = new CopyOnWriteArraySet();
        this.zze = zzel.zza;
        this.zzn = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaby
    public final zzabd zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzaby
    public final zzabx zzb() {
        zzaao zzaaoVar = this.zzk;
        zzek.zzb(zzaaoVar);
        return zzaaoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaby
    public final void zzc() {
        zzfp.zza.zzb();
        zzfp.zza.zza();
        this.zzm = null;
    }

    @Override // com.google.android.gms.internal.ads.zzaby
    public final void zzd(zzam zzamVar) throws zzabw {
        int i;
        zzek.zzf(this.zzn == 0);
        zzek.zzb(this.zzl);
        zzek.zzf((this.zzg == null || this.zzf == null) ? false : true);
        zzel zzelVar = this.zze;
        Looper looperMyLooper = Looper.myLooper();
        zzek.zzb(looperMyLooper);
        this.zzi = zzelVar.zzb(looperMyLooper, null);
        zzt zztVarZzg = zzamVar.zzy;
        if (zztVarZzg == null || ((i = zztVarZzg.zzf) != 7 && i != 6)) {
            zztVarZzg = zzt.zza;
        }
        if (zztVarZzg.zzf == 7) {
            zzr zzrVarZzc = zztVarZzg.zzc();
            zzrVarZzc.zzd(6);
            zztVarZzg = zzrVarZzc.zzg();
        }
        zzt zztVar = zztVarZzg;
        try {
            zzcp zzcpVar = this.zzc;
            Context context = this.zzb;
            zzw zzwVar = zzw.zzb;
            final zzev zzevVar = this.zzi;
            Objects.requireNonNull(zzevVar);
            this.zzj = zzcpVar.zza(context, zztVar, zzwVar, this, new Executor() { // from class: com.google.android.gms.internal.ads.zzaah
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    zzevVar.zzh(runnable);
                }
            }, zzfzn.zzm(), 0L);
            Pair pair = this.zzm;
            if (pair != null) {
                zzfp zzfpVar = (zzfp) this.zzm.second;
                zzfpVar.zzb();
                zzfpVar.zza();
            }
            this.zzk = new zzaao(this.zzb, this, null);
            Objects.requireNonNull(this.zzl);
            throw null;
        } catch (zzdl e) {
            throw new zzabw(e, zzamVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaby
    public final void zze() {
        if (this.zzn == 2) {
            return;
        }
        zzev zzevVar = this.zzi;
        if (zzevVar != null) {
            zzevVar.zze(null);
        }
        this.zzm = null;
        this.zzn = 2;
    }

    @Override // com.google.android.gms.internal.ads.zzaby
    public final void zzf(zzel zzelVar) {
        zzek.zzf(!zzl());
        this.zze = zzelVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaby
    public final void zzg(Surface surface, zzfp zzfpVar) {
        Pair pair = this.zzm;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((zzfp) this.zzm.second).equals(zzfpVar)) {
            return;
        }
        this.zzm = Pair.create(surface, zzfpVar);
        zzfpVar.zzb();
        zzfpVar.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzaby
    public final void zzh(long j) {
        zzek.zzb(this.zzk);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzaby
    public final void zzi(List list) {
        this.zzl = list;
        if (zzl()) {
            zzek.zzb(this.zzk);
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaby
    public final void zzj(zzaba zzabaVar) {
        this.zzh = zzabaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaby
    public final void zzk(zzabd zzabdVar) {
        zzek.zzf(!zzl());
        this.zzf = zzabdVar;
        this.zzg = new zzabj(this, zzabdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaby
    public final boolean zzl() {
        return this.zzn == 1;
    }
}
