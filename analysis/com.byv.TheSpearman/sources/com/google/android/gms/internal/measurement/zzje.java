package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.jacoco.core.runtime.AgentOptions;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.0 */
/* loaded from: classes3.dex */
final class zzje implements zznv {
    private final zzjc zza;

    public static zzje zza(zzjc zzjcVar) {
        return zzjcVar.zza != null ? zzjcVar.zza : new zzje(zzjcVar);
    }

    @Override // com.google.android.gms.internal.measurement.zznv
    public final int zza() {
        return zznu.zza;
    }

    private zzje(zzjc zzjcVar) {
        zzjc zzjcVar2 = (zzjc) zzjy.zza(zzjcVar, AgentOptions.OUTPUT);
        this.zza = zzjcVar2;
        zzjcVar2.zza = this;
    }

    @Override // com.google.android.gms.internal.measurement.zznv
    public final void zza(int i, boolean z) throws IOException {
        this.zza.zzb(i, z);
    }

    @Override // com.google.android.gms.internal.measurement.zznv
    public final void zza(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzig)) {
            if (z) {
                this.zza.zzj(i, 2);
                int iZza = 0;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    iZza += zzjc.zza(list.get(i3).booleanValue());
                }
                this.zza.zzk(iZza);
                while (i2 < list.size()) {
                    this.zza.zzb(list.get(i2).booleanValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                this.zza.zzb(i, list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        zzig zzigVar = (zzig) list;
        if (z) {
            this.zza.zzj(i, 2);
            int iZza2 = 0;
            for (int i4 = 0; i4 < zzigVar.size(); i4++) {
                iZza2 += zzjc.zza(zzigVar.zzb(i4));
            }
            this.zza.zzk(iZza2);
            while (i2 < zzigVar.size()) {
                this.zza.zzb(zzigVar.zzb(i2));
                i2++;
            }
            return;
        }
        while (i2 < zzigVar.size()) {
            this.zza.zzb(i, zzigVar.zzb(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznv
    public final void zza(int i, zzii zziiVar) throws IOException {
        this.zza.zzc(i, zziiVar);
    }

    @Override // com.google.android.gms.internal.measurement.zznv
    public final void zza(int i, List<zzii> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.zza.zzc(i, list.get(i2));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznv
    public final void zza(int i, double d) throws IOException {
        this.zza.zzb(i, d);
    }

    @Override // com.google.android.gms.internal.measurement.zznv
    public final void zzb(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzjh)) {
            if (z) {
                this.zza.zzj(i, 2);
                int iZza = 0;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    iZza += zzjc.zza(list.get(i3).doubleValue());
                }
                this.zza.zzk(iZza);
                while (i2 < list.size()) {
                    this.zza.zzb(list.get(i2).doubleValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                this.zza.zzb(i, list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        zzjh zzjhVar = (zzjh) list;
        if (z) {
            this.zza.zzj(i, 2);
            int iZza2 = 0;
            for (int i4 = 0; i4 < zzjhVar.size(); i4++) {
                iZza2 += zzjc.zza(zzjhVar.zzb(i4));
            }
            this.zza.zzk(iZza2);
            while (i2 < zzjhVar.size()) {
                this.zza.zzb(zzjhVar.zzb(i2));
                i2++;
            }
            return;
        }
        while (i2 < zzjhVar.size()) {
            this.zza.zzb(i, zzjhVar.zzb(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznv
    @Deprecated
    public final void zza(int i) throws IOException {
        this.zza.zzj(i, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zznv
    public final void zza(int i, int i2) throws IOException {
        this.zza.zzh(i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.zznv
    public final void zzc(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzjw)) {
            if (z) {
                this.zza.zzj(i, 2);
                int iZza = 0;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    iZza += zzjc.zza(list.get(i3).intValue());
                }
                this.zza.zzk(iZza);
                while (i2 < list.size()) {
                    this.zza.zzi(list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                this.zza.zzh(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        zzjw zzjwVar = (zzjw) list;
        if (z) {
            this.zza.zzj(i, 2);
            int iZza2 = 0;
            for (int i4 = 0; i4 < zzjwVar.size(); i4++) {
                iZza2 += zzjc.zza(zzjwVar.zzb(i4));
            }
            this.zza.zzk(iZza2);
            while (i2 < zzjwVar.size()) {
                this.zza.zzi(zzjwVar.zzb(i2));
                i2++;
            }
            return;
        }
        while (i2 < zzjwVar.size()) {
            this.zza.zzh(i, zzjwVar.zzb(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznv
    public final void zzb(int i, int i2) throws IOException {
        this.zza.zzg(i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.zznv
    public final void zzd(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzjw)) {
            if (z) {
                this.zza.zzj(i, 2);
                int iZzb = 0;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    iZzb += zzjc.zzb(list.get(i3).intValue());
                }
                this.zza.zzk(iZzb);
                while (i2 < list.size()) {
                    this.zza.zzh(list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                this.zza.zzg(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        zzjw zzjwVar = (zzjw) list;
        if (z) {
            this.zza.zzj(i, 2);
            int iZzb2 = 0;
            for (int i4 = 0; i4 < zzjwVar.size(); i4++) {
                iZzb2 += zzjc.zzb(zzjwVar.zzb(i4));
            }
            this.zza.zzk(iZzb2);
            while (i2 < zzjwVar.size()) {
                this.zza.zzh(zzjwVar.zzb(i2));
                i2++;
            }
            return;
        }
        while (i2 < zzjwVar.size()) {
            this.zza.zzg(i, zzjwVar.zzb(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznv
    public final void zza(int i, long j) throws IOException {
        this.zza.zzf(i, j);
    }

    @Override // com.google.android.gms.internal.measurement.zznv
    public final void zze(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzkt)) {
            if (z) {
                this.zza.zzj(i, 2);
                int iZza = 0;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    iZza += zzjc.zza(list.get(i3).longValue());
                }
                this.zza.zzk(iZza);
                while (i2 < list.size()) {
                    this.zza.zzf(list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                this.zza.zzf(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        zzkt zzktVar = (zzkt) list;
        if (z) {
            this.zza.zzj(i, 2);
            int iZza2 = 0;
            for (int i4 = 0; i4 < zzktVar.size(); i4++) {
                iZza2 += zzjc.zza(zzktVar.zzb(i4));
            }
            this.zza.zzk(iZza2);
            while (i2 < zzktVar.size()) {
                this.zza.zzf(zzktVar.zzb(i2));
                i2++;
            }
            return;
        }
        while (i2 < zzktVar.size()) {
            this.zza.zzf(i, zzktVar.zzb(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznv
    public final void zza(int i, float f) throws IOException {
        this.zza.zzb(i, f);
    }

    @Override // com.google.android.gms.internal.measurement.zznv
    public final void zzf(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzjr)) {
            if (z) {
                this.zza.zzj(i, 2);
                int iZza = 0;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    iZza += zzjc.zza(list.get(i3).floatValue());
                }
                this.zza.zzk(iZza);
                while (i2 < list.size()) {
                    this.zza.zzb(list.get(i2).floatValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                this.zza.zzb(i, list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        zzjr zzjrVar = (zzjr) list;
        if (z) {
            this.zza.zzj(i, 2);
            int iZza2 = 0;
            for (int i4 = 0; i4 < zzjrVar.size(); i4++) {
                iZza2 += zzjc.zza(zzjrVar.zzb(i4));
            }
            this.zza.zzk(iZza2);
            while (i2 < zzjrVar.size()) {
                this.zza.zzb(zzjrVar.zzb(i2));
                i2++;
            }
            return;
        }
        while (i2 < zzjrVar.size()) {
            this.zza.zzb(i, zzjrVar.zzb(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznv
    public final void zza(int i, Object obj, zzma zzmaVar) throws IOException {
        zzjc zzjcVar = this.zza;
        zzjcVar.zzj(i, 3);
        zzmaVar.zza((zzma) obj, (zznv) zzjcVar.zza);
        zzjcVar.zzj(i, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zznv
    public final void zza(int i, List<?> list, zzma zzmaVar) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            zza(i, list.get(i2), zzmaVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznv
    public final void zzc(int i, int i2) throws IOException {
        this.zza.zzh(i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.zznv
    public final void zzg(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzjw)) {
            if (z) {
                this.zza.zzj(i, 2);
                int iZzc = 0;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    iZzc += zzjc.zzc(list.get(i3).intValue());
                }
                this.zza.zzk(iZzc);
                while (i2 < list.size()) {
                    this.zza.zzi(list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                this.zza.zzh(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        zzjw zzjwVar = (zzjw) list;
        if (z) {
            this.zza.zzj(i, 2);
            int iZzc2 = 0;
            for (int i4 = 0; i4 < zzjwVar.size(); i4++) {
                iZzc2 += zzjc.zzc(zzjwVar.zzb(i4));
            }
            this.zza.zzk(iZzc2);
            while (i2 < zzjwVar.size()) {
                this.zza.zzi(zzjwVar.zzb(i2));
                i2++;
            }
            return;
        }
        while (i2 < zzjwVar.size()) {
            this.zza.zzh(i, zzjwVar.zzb(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznv
    public final void zzb(int i, long j) throws IOException {
        this.zza.zzh(i, j);
    }

    @Override // com.google.android.gms.internal.measurement.zznv
    public final void zzh(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzkt)) {
            if (z) {
                this.zza.zzj(i, 2);
                int iZzb = 0;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    iZzb += zzjc.zzb(list.get(i3).longValue());
                }
                this.zza.zzk(iZzb);
                while (i2 < list.size()) {
                    this.zza.zzh(list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                this.zza.zzh(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        zzkt zzktVar = (zzkt) list;
        if (z) {
            this.zza.zzj(i, 2);
            int iZzb2 = 0;
            for (int i4 = 0; i4 < zzktVar.size(); i4++) {
                iZzb2 += zzjc.zzb(zzktVar.zzb(i4));
            }
            this.zza.zzk(iZzb2);
            while (i2 < zzktVar.size()) {
                this.zza.zzh(zzktVar.zzb(i2));
                i2++;
            }
            return;
        }
        while (i2 < zzktVar.size()) {
            this.zza.zzh(i, zzktVar.zzb(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznv
    public final <K, V> void zza(int i, zzkz<K, V> zzkzVar, Map<K, V> map) throws IOException {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.zza.zzj(i, 2);
            this.zza.zzk(zzla.zza(zzkzVar, entry.getKey(), entry.getValue()));
            zzla.zza(this.zza, zzkzVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznv
    public final void zzb(int i, Object obj, zzma zzmaVar) throws IOException {
        this.zza.zzc(i, (zzli) obj, zzmaVar);
    }

    @Override // com.google.android.gms.internal.measurement.zznv
    public final void zzb(int i, List<?> list, zzma zzmaVar) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzb(i, list.get(i2), zzmaVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznv
    public final void zza(int i, Object obj) throws IOException {
        if (obj instanceof zzii) {
            this.zza.zzd(i, (zzii) obj);
        } else {
            this.zza.zzb(i, (zzli) obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznv
    public final void zzd(int i, int i2) throws IOException {
        this.zza.zzg(i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.zznv
    public final void zzi(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzjw)) {
            if (z) {
                this.zza.zzj(i, 2);
                int iZzd = 0;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    iZzd += zzjc.zzd(list.get(i3).intValue());
                }
                this.zza.zzk(iZzd);
                while (i2 < list.size()) {
                    this.zza.zzh(list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                this.zza.zzg(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        zzjw zzjwVar = (zzjw) list;
        if (z) {
            this.zza.zzj(i, 2);
            int iZzd2 = 0;
            for (int i4 = 0; i4 < zzjwVar.size(); i4++) {
                iZzd2 += zzjc.zzd(zzjwVar.zzb(i4));
            }
            this.zza.zzk(iZzd2);
            while (i2 < zzjwVar.size()) {
                this.zza.zzh(zzjwVar.zzb(i2));
                i2++;
            }
            return;
        }
        while (i2 < zzjwVar.size()) {
            this.zza.zzg(i, zzjwVar.zzb(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznv
    public final void zzc(int i, long j) throws IOException {
        this.zza.zzf(i, j);
    }

    @Override // com.google.android.gms.internal.measurement.zznv
    public final void zzj(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzkt)) {
            if (z) {
                this.zza.zzj(i, 2);
                int iZzc = 0;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    iZzc += zzjc.zzc(list.get(i3).longValue());
                }
                this.zza.zzk(iZzc);
                while (i2 < list.size()) {
                    this.zza.zzf(list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                this.zza.zzf(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        zzkt zzktVar = (zzkt) list;
        if (z) {
            this.zza.zzj(i, 2);
            int iZzc2 = 0;
            for (int i4 = 0; i4 < zzktVar.size(); i4++) {
                iZzc2 += zzjc.zzc(zzktVar.zzb(i4));
            }
            this.zza.zzk(iZzc2);
            while (i2 < zzktVar.size()) {
                this.zza.zzf(zzktVar.zzb(i2));
                i2++;
            }
            return;
        }
        while (i2 < zzktVar.size()) {
            this.zza.zzf(i, zzktVar.zzb(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznv
    public final void zze(int i, int i2) throws IOException {
        this.zza.zzi(i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.zznv
    public final void zzk(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzjw)) {
            if (z) {
                this.zza.zzj(i, 2);
                int iZze = 0;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    iZze += zzjc.zze(list.get(i3).intValue());
                }
                this.zza.zzk(iZze);
                while (i2 < list.size()) {
                    this.zza.zzj(list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                this.zza.zzi(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        zzjw zzjwVar = (zzjw) list;
        if (z) {
            this.zza.zzj(i, 2);
            int iZze2 = 0;
            for (int i4 = 0; i4 < zzjwVar.size(); i4++) {
                iZze2 += zzjc.zze(zzjwVar.zzb(i4));
            }
            this.zza.zzk(iZze2);
            while (i2 < zzjwVar.size()) {
                this.zza.zzj(zzjwVar.zzb(i2));
                i2++;
            }
            return;
        }
        while (i2 < zzjwVar.size()) {
            this.zza.zzi(i, zzjwVar.zzb(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznv
    public final void zzd(int i, long j) throws IOException {
        this.zza.zzg(i, j);
    }

    @Override // com.google.android.gms.internal.measurement.zznv
    public final void zzl(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzkt)) {
            if (z) {
                this.zza.zzj(i, 2);
                int iZzd = 0;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    iZzd += zzjc.zzd(list.get(i3).longValue());
                }
                this.zza.zzk(iZzd);
                while (i2 < list.size()) {
                    this.zza.zzg(list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                this.zza.zzg(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        zzkt zzktVar = (zzkt) list;
        if (z) {
            this.zza.zzj(i, 2);
            int iZzd2 = 0;
            for (int i4 = 0; i4 < zzktVar.size(); i4++) {
                iZzd2 += zzjc.zzd(zzktVar.zzb(i4));
            }
            this.zza.zzk(iZzd2);
            while (i2 < zzktVar.size()) {
                this.zza.zzg(zzktVar.zzb(i2));
                i2++;
            }
            return;
        }
        while (i2 < zzktVar.size()) {
            this.zza.zzg(i, zzktVar.zzb(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznv
    @Deprecated
    public final void zzb(int i) throws IOException {
        this.zza.zzj(i, 3);
    }

    @Override // com.google.android.gms.internal.measurement.zznv
    public final void zza(int i, String str) throws IOException {
        this.zza.zzb(i, str);
    }

    @Override // com.google.android.gms.internal.measurement.zznv
    public final void zzb(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (list instanceof zzko) {
            zzko zzkoVar = (zzko) list;
            while (i2 < list.size()) {
                Object objZzb = zzkoVar.zzb(i2);
                if (objZzb instanceof String) {
                    this.zza.zzb(i, (String) objZzb);
                } else {
                    this.zza.zzc(i, (zzii) objZzb);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzb(i, list.get(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznv
    public final void zzf(int i, int i2) throws IOException {
        this.zza.zzk(i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.zznv
    public final void zzm(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzjw)) {
            if (z) {
                this.zza.zzj(i, 2);
                int iZzg = 0;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    iZzg += zzjc.zzg(list.get(i3).intValue());
                }
                this.zza.zzk(iZzg);
                while (i2 < list.size()) {
                    this.zza.zzk(list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                this.zza.zzk(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        zzjw zzjwVar = (zzjw) list;
        if (z) {
            this.zza.zzj(i, 2);
            int iZzg2 = 0;
            for (int i4 = 0; i4 < zzjwVar.size(); i4++) {
                iZzg2 += zzjc.zzg(zzjwVar.zzb(i4));
            }
            this.zza.zzk(iZzg2);
            while (i2 < zzjwVar.size()) {
                this.zza.zzk(zzjwVar.zzb(i2));
                i2++;
            }
            return;
        }
        while (i2 < zzjwVar.size()) {
            this.zza.zzk(i, zzjwVar.zzb(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznv
    public final void zze(int i, long j) throws IOException {
        this.zza.zzh(i, j);
    }

    @Override // com.google.android.gms.internal.measurement.zznv
    public final void zzn(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzkt)) {
            if (z) {
                this.zza.zzj(i, 2);
                int iZze = 0;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    iZze += zzjc.zze(list.get(i3).longValue());
                }
                this.zza.zzk(iZze);
                while (i2 < list.size()) {
                    this.zza.zzh(list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                this.zza.zzh(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        zzkt zzktVar = (zzkt) list;
        if (z) {
            this.zza.zzj(i, 2);
            int iZze2 = 0;
            for (int i4 = 0; i4 < zzktVar.size(); i4++) {
                iZze2 += zzjc.zze(zzktVar.zzb(i4));
            }
            this.zza.zzk(iZze2);
            while (i2 < zzktVar.size()) {
                this.zza.zzh(zzktVar.zzb(i2));
                i2++;
            }
            return;
        }
        while (i2 < zzktVar.size()) {
            this.zza.zzh(i, zzktVar.zzb(i2));
            i2++;
        }
    }
}
