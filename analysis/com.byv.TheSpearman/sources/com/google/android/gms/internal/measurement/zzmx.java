package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.0 */
/* loaded from: classes3.dex */
final class zzmx extends zzmv<zzmy, zzmy> {
    @Override // com.google.android.gms.internal.measurement.zzmv
    final /* synthetic */ int zza(zzmy zzmyVar) {
        return zzmyVar.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzmv
    final boolean zza(zzlx zzlxVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzmv
    final /* synthetic */ int zzb(zzmy zzmyVar) {
        return zzmyVar.zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzmv
    final /* synthetic */ zzmy zzc(Object obj) {
        zzmy zzmyVar = ((zzjv) obj).zzb;
        if (zzmyVar != zzmy.zzc()) {
            return zzmyVar;
        }
        zzmy zzmyVarZzd = zzmy.zzd();
        zza(obj, zzmyVarZzd);
        return zzmyVarZzd;
    }

    @Override // com.google.android.gms.internal.measurement.zzmv
    final /* synthetic */ zzmy zzd(Object obj) {
        return ((zzjv) obj).zzb;
    }

    @Override // com.google.android.gms.internal.measurement.zzmv
    final /* synthetic */ zzmy zza(zzmy zzmyVar, zzmy zzmyVar2) {
        zzmy zzmyVar3 = zzmyVar;
        zzmy zzmyVar4 = zzmyVar2;
        if (zzmy.zzc().equals(zzmyVar4)) {
            return zzmyVar3;
        }
        if (zzmy.zzc().equals(zzmyVar3)) {
            return zzmy.zza(zzmyVar3, zzmyVar4);
        }
        return zzmyVar3.zza(zzmyVar4);
    }

    @Override // com.google.android.gms.internal.measurement.zzmv
    final /* synthetic */ zzmy zza() {
        return zzmy.zzd();
    }

    @Override // com.google.android.gms.internal.measurement.zzmv
    final /* synthetic */ zzmy zze(zzmy zzmyVar) {
        zzmy zzmyVar2 = zzmyVar;
        zzmyVar2.zze();
        return zzmyVar2;
    }

    zzmx() {
    }

    @Override // com.google.android.gms.internal.measurement.zzmv
    final /* synthetic */ void zza(zzmy zzmyVar, int i, int i2) {
        zzmyVar.zza((i << 3) | 5, Integer.valueOf(i2));
    }

    @Override // com.google.android.gms.internal.measurement.zzmv
    final /* synthetic */ void zza(zzmy zzmyVar, int i, long j) {
        zzmyVar.zza((i << 3) | 1, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.measurement.zzmv
    final /* synthetic */ void zza(zzmy zzmyVar, int i, zzmy zzmyVar2) {
        zzmyVar.zza((i << 3) | 3, zzmyVar2);
    }

    @Override // com.google.android.gms.internal.measurement.zzmv
    final /* synthetic */ void zza(zzmy zzmyVar, int i, zzii zziiVar) {
        zzmyVar.zza((i << 3) | 2, zziiVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzmv
    final /* synthetic */ void zzb(zzmy zzmyVar, int i, long j) {
        zzmyVar.zza(i << 3, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.measurement.zzmv
    final void zzf(Object obj) {
        ((zzjv) obj).zzb.zze();
    }

    @Override // com.google.android.gms.internal.measurement.zzmv
    final /* synthetic */ void zzb(Object obj, zzmy zzmyVar) {
        zza(obj, zzmyVar);
    }

    private static void zza(Object obj, zzmy zzmyVar) {
        ((zzjv) obj).zzb = zzmyVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzmv
    final /* synthetic */ void zzc(Object obj, zzmy zzmyVar) {
        zza(obj, zzmyVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzmv
    final /* synthetic */ void zza(zzmy zzmyVar, zznv zznvVar) throws IOException {
        zzmyVar.zza(zznvVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzmv
    final /* synthetic */ void zzb(zzmy zzmyVar, zznv zznvVar) throws IOException {
        zzmyVar.zzb(zznvVar);
    }
}
