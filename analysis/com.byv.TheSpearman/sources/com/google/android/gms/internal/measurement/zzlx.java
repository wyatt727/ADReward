package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.0 */
/* loaded from: classes3.dex */
interface zzlx {
    double zza() throws IOException;

    <T> void zza(T t, zzma<T> zzmaVar, zzji zzjiVar) throws IOException;

    void zza(List<Boolean> list) throws IOException;

    @Deprecated
    <T> void zza(List<T> list, zzma<T> zzmaVar, zzji zzjiVar) throws IOException;

    <K, V> void zza(Map<K, V> map, zzkz<K, V> zzkzVar, zzji zzjiVar) throws IOException;

    float zzb() throws IOException;

    <T> void zzb(T t, zzma<T> zzmaVar, zzji zzjiVar) throws IOException;

    void zzb(List<zzii> list) throws IOException;

    <T> void zzb(List<T> list, zzma<T> zzmaVar, zzji zzjiVar) throws IOException;

    int zzc() throws IOException;

    void zzc(List<Double> list) throws IOException;

    int zzd();

    void zzd(List<Integer> list) throws IOException;

    int zze() throws IOException;

    void zze(List<Integer> list) throws IOException;

    int zzf() throws IOException;

    void zzf(List<Long> list) throws IOException;

    int zzg() throws IOException;

    void zzg(List<Float> list) throws IOException;

    int zzh() throws IOException;

    void zzh(List<Integer> list) throws IOException;

    int zzi() throws IOException;

    void zzi(List<Long> list) throws IOException;

    int zzj() throws IOException;

    void zzj(List<Integer> list) throws IOException;

    long zzk() throws IOException;

    void zzk(List<Long> list) throws IOException;

    long zzl() throws IOException;

    void zzl(List<Integer> list) throws IOException;

    long zzm() throws IOException;

    void zzm(List<Long> list) throws IOException;

    long zzn() throws IOException;

    void zzn(List<String> list) throws IOException;

    long zzo() throws IOException;

    void zzo(List<String> list) throws IOException;

    zzii zzp() throws IOException;

    void zzp(List<Integer> list) throws IOException;

    String zzq() throws IOException;

    void zzq(List<Long> list) throws IOException;

    String zzr() throws IOException;

    boolean zzs() throws IOException;

    boolean zzt() throws IOException;
}
