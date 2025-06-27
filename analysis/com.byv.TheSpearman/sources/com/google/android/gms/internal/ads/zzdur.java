package com.google.android.gms.internal.ads;

import com.json.t2;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdur {
    private final String zze;
    private final zzdum zzf;
    private final List zzb = new ArrayList();
    private boolean zzc = false;
    private boolean zzd = false;
    private final com.google.android.gms.ads.internal.util.zzg zza = com.google.android.gms.ads.internal.zzu.zzo().zzi();

    public zzdur(String str, zzdum zzdumVar) {
        this.zze = str;
        this.zzf = zzdumVar;
    }

    private final Map zzg() {
        Map mapZza = this.zzf.zza();
        mapZza.put("tms", Long.toString(com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime(), 10));
        mapZza.put(ScarConstants.TOKEN_ID_KEY, this.zza.zzO() ? "" : this.zze);
        return mapZza;
    }

    public final synchronized void zza(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzbZ)).booleanValue()) {
            Map mapZzg = zzg();
            mapZzg.put(t2.h.h, "aaia");
            mapZzg.put("aair", "MalformedJson");
            this.zzb.add(mapZzg);
        }
    }

    public final synchronized void zzb(String str, String str2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzbZ)).booleanValue()) {
            Map mapZzg = zzg();
            mapZzg.put(t2.h.h, "adapter_init_finished");
            mapZzg.put("ancn", str);
            mapZzg.put("rqe", str2);
            this.zzb.add(mapZzg);
        }
    }

    public final synchronized void zzc(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzbZ)).booleanValue()) {
            Map mapZzg = zzg();
            mapZzg.put(t2.h.h, "adapter_init_started");
            mapZzg.put("ancn", str);
            this.zzb.add(mapZzg);
        }
    }

    public final synchronized void zzd(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzbZ)).booleanValue()) {
            Map mapZzg = zzg();
            mapZzg.put(t2.h.h, "adapter_init_finished");
            mapZzg.put("ancn", str);
            this.zzb.add(mapZzg);
        }
    }

    public final synchronized void zze() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzbZ)).booleanValue() && !this.zzd) {
            Map mapZzg = zzg();
            mapZzg.put(t2.h.h, "init_finished");
            this.zzb.add(mapZzg);
            Iterator it = this.zzb.iterator();
            while (it.hasNext()) {
                this.zzf.zzf((Map) it.next());
            }
            this.zzd = true;
        }
    }

    public final synchronized void zzf() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzbZ)).booleanValue() && !this.zzc) {
            Map mapZzg = zzg();
            mapZzg.put(t2.h.h, "init_started");
            this.zzb.add(mapZzg);
            this.zzc = true;
        }
    }
}
