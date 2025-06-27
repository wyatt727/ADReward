package com.google.android.gms.internal.ads;

import java.util.LinkedHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzekb implements zzgea {
    final /* synthetic */ long zza;
    final /* synthetic */ zzffq zzb;
    final /* synthetic */ zzffn zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzfmp zze;
    final /* synthetic */ zzffz zzf;
    final /* synthetic */ zzekd zzg;

    zzekb(zzekd zzekdVar, long j, zzffq zzffqVar, zzffn zzffnVar, String str, zzfmp zzfmpVar, zzffz zzffzVar) {
        this.zza = j;
        this.zzb = zzffqVar;
        this.zzc = zzffnVar;
        this.zzd = str;
        this.zze = zzfmpVar;
        this.zzf = zzffzVar;
        this.zzg = zzekdVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001a A[PHI: r5
      0x001a: PHI (r5v10 int) = (r5v0 int), (r5v1 int), (r5v1 int), (r5v1 int), (r5v11 int) binds: [B:17:0x0031, B:22:0x004c, B:24:0x0050, B:26:0x0059, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.ads.zzgea
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(java.lang.Throwable r17) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzekb.zza(java.lang.Throwable):void");
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final void zzb(Object obj) {
        long jElapsedRealtime = this.zzg.zza.elapsedRealtime() - this.zza;
        synchronized (this.zzg) {
            zzekd zzekdVar = this.zzg;
            if (zzekdVar.zze) {
                zzekdVar.zzb.zza(this.zzb, this.zzc, 0, null, jElapsedRealtime);
            }
            zzekd zzekdVar2 = this.zzg;
            if (zzekdVar2.zzg) {
                return;
            }
            if (zzekdVar2.zzq(this.zzc)) {
                ((zzekc) this.zzg.zzd.get(this.zzc)).zzd = jElapsedRealtime;
            } else {
                LinkedHashMap linkedHashMap = this.zzg.zzd;
                zzffn zzffnVar = this.zzc;
                linkedHashMap.put(zzffnVar, new zzekc(this.zzd, zzffnVar.zzag, 0, jElapsedRealtime, null));
            }
            this.zzg.zzf.zzg(this.zzc, jElapsedRealtime, null);
        }
    }
}
