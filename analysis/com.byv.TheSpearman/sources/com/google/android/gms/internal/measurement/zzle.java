package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.0 */
/* loaded from: classes3.dex */
final class zzle implements zzlb {
    @Override // com.google.android.gms.internal.measurement.zzlb
    public final int zza(int i, Object obj, Object obj2) {
        zzlc zzlcVar = (zzlc) obj;
        if (zzlcVar.isEmpty()) {
            return 0;
        }
        Iterator it = zzlcVar.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    public final zzkz<?, ?> zza(Object obj) {
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    public final Object zza(Object obj, Object obj2) {
        zzlc zzlcVarZzb = (zzlc) obj;
        zzlc zzlcVar = (zzlc) obj2;
        if (!zzlcVar.isEmpty()) {
            if (!zzlcVarZzb.zzd()) {
                zzlcVarZzb = zzlcVarZzb.zzb();
            }
            zzlcVarZzb.zza(zzlcVar);
        }
        return zzlcVarZzb;
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    public final Object zzb(Object obj) {
        return zzlc.zza().zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    public final Object zzc(Object obj) {
        ((zzlc) obj).zzc();
        return obj;
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    public final Map<?, ?> zzd(Object obj) {
        return (zzlc) obj;
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    public final Map<?, ?> zze(Object obj) {
        return (zzlc) obj;
    }

    zzle() {
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    public final boolean zzf(Object obj) {
        return !((zzlc) obj).zzd();
    }
}
