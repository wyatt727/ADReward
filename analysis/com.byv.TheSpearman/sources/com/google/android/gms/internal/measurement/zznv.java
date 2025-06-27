package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.0 */
/* loaded from: classes3.dex */
interface zznv {
    int zza();

    @Deprecated
    void zza(int i) throws IOException;

    void zza(int i, double d) throws IOException;

    void zza(int i, float f) throws IOException;

    void zza(int i, int i2) throws IOException;

    void zza(int i, long j) throws IOException;

    void zza(int i, zzii zziiVar) throws IOException;

    <K, V> void zza(int i, zzkz<K, V> zzkzVar, Map<K, V> map) throws IOException;

    void zza(int i, Object obj) throws IOException;

    @Deprecated
    void zza(int i, Object obj, zzma zzmaVar) throws IOException;

    void zza(int i, String str) throws IOException;

    void zza(int i, List<zzii> list) throws IOException;

    @Deprecated
    void zza(int i, List<?> list, zzma zzmaVar) throws IOException;

    void zza(int i, List<Boolean> list, boolean z) throws IOException;

    void zza(int i, boolean z) throws IOException;

    @Deprecated
    void zzb(int i) throws IOException;

    void zzb(int i, int i2) throws IOException;

    void zzb(int i, long j) throws IOException;

    void zzb(int i, Object obj, zzma zzmaVar) throws IOException;

    void zzb(int i, List<String> list) throws IOException;

    void zzb(int i, List<?> list, zzma zzmaVar) throws IOException;

    void zzb(int i, List<Double> list, boolean z) throws IOException;

    void zzc(int i, int i2) throws IOException;

    void zzc(int i, long j) throws IOException;

    void zzc(int i, List<Integer> list, boolean z) throws IOException;

    void zzd(int i, int i2) throws IOException;

    void zzd(int i, long j) throws IOException;

    void zzd(int i, List<Integer> list, boolean z) throws IOException;

    void zze(int i, int i2) throws IOException;

    void zze(int i, long j) throws IOException;

    void zze(int i, List<Long> list, boolean z) throws IOException;

    void zzf(int i, int i2) throws IOException;

    void zzf(int i, List<Float> list, boolean z) throws IOException;

    void zzg(int i, List<Integer> list, boolean z) throws IOException;

    void zzh(int i, List<Long> list, boolean z) throws IOException;

    void zzi(int i, List<Integer> list, boolean z) throws IOException;

    void zzj(int i, List<Long> list, boolean z) throws IOException;

    void zzk(int i, List<Integer> list, boolean z) throws IOException;

    void zzl(int i, List<Long> list, boolean z) throws IOException;

    void zzm(int i, List<Integer> list, boolean z) throws IOException;

    void zzn(int i, List<Long> list, boolean z) throws IOException;
}
