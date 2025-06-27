package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.json.mediationsdk.metadata.a;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzduc {
    private final ConcurrentHashMap zza;
    private final zzcbl zzb;
    private final zzfgi zzc;
    private final String zzd;
    private final String zze;
    private final com.google.android.gms.ads.internal.zzj zzf;
    private final Bundle zzg = new Bundle();
    private final Context zzh;

    public zzduc(Context context, zzdum zzdumVar, zzcbl zzcblVar, zzfgi zzfgiVar, String str, String str2, com.google.android.gms.ads.internal.zzj zzjVar) {
        ActivityManager.MemoryInfo memoryInfoZzc;
        ConcurrentHashMap concurrentHashMapZzc = zzdumVar.zzc();
        this.zza = concurrentHashMapZzc;
        this.zzb = zzcblVar;
        this.zzc = zzfgiVar;
        this.zzd = str;
        this.zze = str2;
        this.zzf = zzjVar;
        this.zzh = context;
        concurrentHashMapZzc.put(FirebaseAnalytics.Param.AD_FORMAT, str2.toUpperCase(Locale.ROOT));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzjt)).booleanValue()) {
            int iZzj = zzjVar.zzj();
            int i = iZzj - 1;
            if (iZzj == 0) {
                throw null;
            }
            concurrentHashMapZzc.put("asv", i != 0 ? i != 1 ? "na" : "2" : "1");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzcc)).booleanValue()) {
            Runtime runtime = Runtime.getRuntime();
            zzc("rt_f", String.valueOf(runtime.freeMemory()));
            zzc("rt_m", String.valueOf(runtime.maxMemory()));
            zzc("rt_t", String.valueOf(runtime.totalMemory()));
            zzc("wv_c", String.valueOf(com.google.android.gms.ads.internal.zzu.zzo().zzb()));
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzce)).booleanValue() && (memoryInfoZzc = com.google.android.gms.ads.internal.util.client.zzf.zzc(context)) != null) {
                zzc("mem_avl", String.valueOf(memoryInfoZzc.availMem));
                zzc("mem_tt", String.valueOf(memoryInfoZzc.totalMem));
                zzc("low_m", true != memoryInfoZzc.lowMemory ? "0" : "1");
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzhd)).booleanValue()) {
            int iZze = com.google.android.gms.ads.nonagon.signalgeneration.zzh.zze(zzfgiVar) - 1;
            if (iZze == 0) {
                concurrentHashMapZzc.put("request_id", str);
                concurrentHashMapZzc.put("scar", "false");
                return;
            }
            if (iZze == 1) {
                concurrentHashMapZzc.put("request_id", str);
                concurrentHashMapZzc.put("se", "query_g");
            } else if (iZze == 2) {
                concurrentHashMapZzc.put("se", "r_adinfo");
            } else if (iZze != 3) {
                concurrentHashMapZzc.put("se", "r_both");
            } else {
                concurrentHashMapZzc.put("se", "r_adstring");
            }
            concurrentHashMapZzc.put("scar", a.g);
            zzc("ragent", zzfgiVar.zzd.zzp);
            zzc("rtype", com.google.android.gms.ads.nonagon.signalgeneration.zzh.zza(com.google.android.gms.ads.nonagon.signalgeneration.zzh.zzb(zzfgiVar.zzd)));
        }
    }

    public final Bundle zza() {
        return this.zzg;
    }

    public final Map zzb() {
        return this.zza;
    }

    public final void zzc(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        this.zza.put(str, str2);
    }

    public final void zzd(zzffz zzffzVar) {
        if (!zzffzVar.zzb.zza.isEmpty()) {
            zzffn zzffnVar = (zzffn) zzffzVar.zzb.zza.get(0);
            zzc(FirebaseAnalytics.Param.AD_FORMAT, zzffn.zza(zzffnVar.zzb));
            if (zzffnVar.zzb == 6) {
                this.zza.put("as", true != this.zzb.zzm() ? "0" : "1");
            }
        }
        zzc("gqi", zzffzVar.zzb.zzb.zzb);
    }

    public final void zze(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (bundle.containsKey("cnt")) {
            zzc("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            zzc("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }
}
