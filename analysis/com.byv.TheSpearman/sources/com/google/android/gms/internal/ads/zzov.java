package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.Random;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzov implements zzoz {
    public static final zzfxh zza = new zzfxh() { // from class: com.google.android.gms.internal.ads.zzot
        @Override // com.google.android.gms.internal.ads.zzfxh
        public final Object zza() {
            return zzov.zzn();
        }
    };
    private static final Random zzb = new Random();
    private final zzcw zzc;
    private final zzcu zzd;
    private final HashMap zze;
    private final zzfxh zzf;
    private zzoy zzg;
    private zzcx zzh;
    private String zzi;
    private long zzj;

    public zzov() {
        this(zza);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzl() {
        zzou zzouVar = (zzou) this.zze.get(this.zzi);
        return (zzouVar == null || zzouVar.zzd == -1) ? this.zzj + 1 : zzouVar.zzd;
    }

    private final zzou zzm(int i, zzvh zzvhVar) {
        long j = Long.MAX_VALUE;
        zzou zzouVar = null;
        for (zzou zzouVar2 : this.zze.values()) {
            zzouVar2.zzg(i, zzvhVar);
            if (zzouVar2.zzj(i, zzvhVar)) {
                long j2 = zzouVar2.zzd;
                if (j2 == -1 || j2 < j) {
                    zzouVar = zzouVar2;
                    j = j2;
                } else if (j2 == j) {
                    int i2 = zzfx.zza;
                    if (zzouVar.zze != null && zzouVar2.zze != null) {
                        zzouVar = zzouVar2;
                    }
                }
            }
        }
        if (zzouVar != null) {
            return zzouVar;
        }
        String strZzn = zzn();
        zzou zzouVar3 = new zzou(this, strZzn, i, zzvhVar);
        this.zze.put(strZzn, zzouVar3);
        return zzouVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzn() {
        byte[] bArr = new byte[12];
        zzb.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    private final void zzo(zzou zzouVar) {
        if (zzouVar.zzd != -1) {
            this.zzj = zzouVar.zzd;
        }
        this.zzi = null;
    }

    @RequiresNonNull({ServiceSpecificExtraArgs.CastExtraArgs.LISTENER})
    private final void zzp(zzmq zzmqVar) {
        if (zzmqVar.zzb.zzo()) {
            String str = this.zzi;
            if (str != null) {
                zzou zzouVar = (zzou) this.zze.get(str);
                Objects.requireNonNull(zzouVar);
                zzo(zzouVar);
                return;
            }
            return;
        }
        zzou zzouVar2 = (zzou) this.zze.get(this.zzi);
        zzou zzouVarZzm = zzm(zzmqVar.zzc, zzmqVar.zzd);
        this.zzi = zzouVarZzm.zzb;
        zzi(zzmqVar);
        zzvh zzvhVar = zzmqVar.zzd;
        if (zzvhVar == null || !zzvhVar.zzb()) {
            return;
        }
        if (zzouVar2 != null) {
            if (zzouVar2.zzd == zzvhVar.zzd && zzouVar2.zze != null && zzouVar2.zze.zzb == zzmqVar.zzd.zzb && zzouVar2.zze.zzc == zzmqVar.zzd.zzc) {
                return;
            }
        }
        zzvh zzvhVar2 = zzmqVar.zzd;
        String unused = zzm(zzmqVar.zzc, new zzvh(zzvhVar2.zza, zzvhVar2.zzd)).zzb;
        String unused2 = zzouVarZzm.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzoz
    public final synchronized String zze() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzoz
    public final synchronized String zzf(zzcx zzcxVar, zzvh zzvhVar) {
        return zzm(zzcxVar.zzn(zzvhVar.zza, this.zzd).zzd, zzvhVar).zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzoz
    public final synchronized void zzg(zzmq zzmqVar) {
        zzoy zzoyVar;
        String str = this.zzi;
        if (str != null) {
            zzou zzouVar = (zzou) this.zze.get(str);
            Objects.requireNonNull(zzouVar);
            zzo(zzouVar);
        }
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzou zzouVar2 = (zzou) it.next();
            it.remove();
            if (zzouVar2.zzf && (zzoyVar = this.zzg) != null) {
                zzoyVar.zzd(zzmqVar, zzouVar2.zzb, false);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzoz
    public final void zzh(zzoy zzoyVar) {
        this.zzg = zzoyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzoz
    public final synchronized void zzi(zzmq zzmqVar) {
        zzou zzouVar;
        Objects.requireNonNull(this.zzg);
        if (!zzmqVar.zzb.zzo()) {
            zzvh zzvhVar = zzmqVar.zzd;
            if (zzvhVar != null) {
                if (zzvhVar.zzd >= zzl() && ((zzouVar = (zzou) this.zze.get(this.zzi)) == null || zzouVar.zzd != -1 || zzouVar.zzc == zzmqVar.zzc)) {
                }
            }
            zzou zzouVarZzm = zzm(zzmqVar.zzc, zzmqVar.zzd);
            if (this.zzi == null) {
                this.zzi = zzouVarZzm.zzb;
            }
            zzvh zzvhVar2 = zzmqVar.zzd;
            if (zzvhVar2 != null && zzvhVar2.zzb()) {
                zzou zzouVarZzm2 = zzm(zzmqVar.zzc, new zzvh(zzvhVar2.zza, zzvhVar2.zzd, zzvhVar2.zzb));
                if (!zzouVarZzm2.zzf) {
                    zzouVarZzm2.zzf = true;
                    zzmqVar.zzb.zzn(zzmqVar.zzd.zza, this.zzd);
                    this.zzd.zzi(zzmqVar.zzd.zzb);
                    Math.max(0L, zzfx.zzu(0L) + zzfx.zzu(0L));
                    String unused = zzouVarZzm2.zzb;
                }
            }
            if (!zzouVarZzm.zzf) {
                zzouVarZzm.zzf = true;
                String unused2 = zzouVarZzm.zzb;
            }
            if (zzouVarZzm.zzb.equals(this.zzi) && !zzouVarZzm.zzg) {
                zzouVarZzm.zzg = true;
                this.zzg.zzc(zzmqVar, zzouVarZzm.zzb);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzoz
    public final synchronized void zzj(zzmq zzmqVar, int i) {
        Objects.requireNonNull(this.zzg);
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzou zzouVar = (zzou) it.next();
            if (zzouVar.zzk(zzmqVar)) {
                it.remove();
                if (zzouVar.zzf) {
                    boolean zEquals = zzouVar.zzb.equals(this.zzi);
                    boolean z = false;
                    if (i == 0 && zEquals && zzouVar.zzg) {
                        z = true;
                    }
                    if (zEquals) {
                        zzo(zzouVar);
                    }
                    this.zzg.zzd(zzmqVar, zzouVar.zzb, z);
                }
            }
        }
        zzp(zzmqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzoz
    public final synchronized void zzk(zzmq zzmqVar) {
        Objects.requireNonNull(this.zzg);
        zzcx zzcxVar = this.zzh;
        this.zzh = zzmqVar.zzb;
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzou zzouVar = (zzou) it.next();
            if (!zzouVar.zzl(zzcxVar, this.zzh) || zzouVar.zzk(zzmqVar)) {
                it.remove();
                if (zzouVar.zzf) {
                    if (zzouVar.zzb.equals(this.zzi)) {
                        zzo(zzouVar);
                    }
                    this.zzg.zzd(zzmqVar, zzouVar.zzb, false);
                }
            }
        }
        zzp(zzmqVar);
    }

    public zzov(zzfxh zzfxhVar) {
        this.zzf = zzfxhVar;
        this.zzc = new zzcw();
        this.zzd = new zzcu();
        this.zze = new HashMap();
        this.zzh = zzcx.zza;
        this.zzj = -1L;
    }
}
