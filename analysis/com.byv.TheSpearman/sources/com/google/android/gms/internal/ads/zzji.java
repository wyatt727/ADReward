package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzji {
    final Context zza;
    zzel zzb;
    zzfxh zzc;
    zzfxh zzd;
    zzfxh zze;
    zzfxh zzf;
    zzfxh zzg;
    zzfwf zzh;
    Looper zzi;
    zzk zzj;
    int zzk;
    boolean zzl;
    zzmj zzm;
    long zzn;
    long zzo;
    boolean zzp;
    boolean zzq;
    String zzr;
    zziu zzs;

    static /* synthetic */ zzvg zza(Context context) {
        return new zzuu(context, new zzacy());
    }

    public zzji(final Context context, zzcfw zzcfwVar) {
        zzjb zzjbVar = new zzjb(zzcfwVar);
        zzjc zzjcVar = new zzjc(context);
        zzfxh zzfxhVar = new zzfxh() { // from class: com.google.android.gms.internal.ads.zzjd
            @Override // com.google.android.gms.internal.ads.zzfxh
            public final Object zza() {
                return new zzyx(context);
            }
        };
        zzje zzjeVar = new zzfxh() { // from class: com.google.android.gms.internal.ads.zzje
            @Override // com.google.android.gms.internal.ads.zzfxh
            public final Object zza() {
                return new zziv();
            }
        };
        zzjf zzjfVar = new zzjf(context);
        zzjg zzjgVar = new zzfwf() { // from class: com.google.android.gms.internal.ads.zzjg
            @Override // com.google.android.gms.internal.ads.zzfwf
            public final Object apply(Object obj) {
                return new zzos((zzel) obj);
            }
        };
        Objects.requireNonNull(context);
        this.zza = context;
        this.zzc = zzjbVar;
        this.zzd = zzjcVar;
        this.zze = zzfxhVar;
        this.zzf = zzjeVar;
        this.zzg = zzjfVar;
        this.zzh = zzjgVar;
        this.zzi = zzfx.zzy();
        this.zzj = zzk.zza;
        this.zzk = 1;
        this.zzl = true;
        this.zzm = zzmj.zze;
        this.zzs = new zziu(0.97f, 1.03f, 1000L, 1.0E-7f, zzfx.zzr(20L), zzfx.zzr(500L), 0.999f, null);
        this.zzb = zzel.zza;
        this.zzn = 500L;
        this.zzo = 2000L;
        this.zzp = true;
        this.zzr = "";
    }
}
