package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfad implements zzhiv {
    public static zzewu zza(Context context, zzcav zzcavVar, zzcaw zzcawVar, Object obj, zzexs zzexsVar, zzezj zzezjVar, zzhip zzhipVar, zzhip zzhipVar2, zzhip zzhipVar3, zzhip zzhipVar4, zzhip zzhipVar5, zzhip zzhipVar6, zzhip zzhipVar7, zzhip zzhipVar8, zzhip zzhipVar9, Executor executor, zzflh zzflhVar, zzduh zzduhVar) {
        HashSet hashSet = new HashSet();
        hashSet.add((zzezc) obj);
        hashSet.add(zzexsVar);
        hashSet.add(zzezjVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzfM)).booleanValue()) {
            hashSet.add((zzewr) zzhipVar.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzfN)).booleanValue()) {
            hashSet.add((zzewr) zzhipVar2.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzfO)).booleanValue()) {
            hashSet.add((zzewr) zzhipVar3.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzfP)).booleanValue()) {
            hashSet.add((zzewr) zzhipVar4.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzfT)).booleanValue()) {
            hashSet.add((zzewr) zzhipVar6.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzfU)).booleanValue()) {
            hashSet.add((zzewr) zzhipVar7.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzcL)).booleanValue()) {
            hashSet.add((zzewr) zzhipVar9.zzb());
        }
        return new zzewu(context, executor, hashSet, zzflhVar, zzduhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhjm
    public final /* bridge */ /* synthetic */ Object zzb() {
        throw null;
    }
}
