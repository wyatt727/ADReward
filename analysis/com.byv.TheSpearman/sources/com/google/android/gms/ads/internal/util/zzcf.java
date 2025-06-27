package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.internal.ads.zzbdz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes2.dex */
public final class zzcf {
    private final Map zza = new HashMap();
    private final List zzb = new ArrayList();
    private final Context zzc;

    zzcf(Context context) {
        this.zzc = context;
    }

    final synchronized void zzb(String str) {
        if (this.zza.containsKey(str)) {
            return;
        }
        SharedPreferences defaultSharedPreferences = Objects.equals(str, "__default__") ? PreferenceManager.getDefaultSharedPreferences(this.zzc) : this.zzc.getSharedPreferences(str, 0);
        zzce zzceVar = new zzce(this, str);
        this.zza.put(str, zzceVar);
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(zzceVar);
    }

    public final void zzc() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzkd)).booleanValue()) {
            com.google.android.gms.ads.internal.zzu.zzp();
            Map mapZzv = zzt.zzv((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzkh));
            Iterator it = mapZzv.keySet().iterator();
            while (it.hasNext()) {
                zzb((String) it.next());
            }
            zzd(new zzcd(mapZzv));
        }
    }

    final synchronized void zzd(zzcd zzcdVar) {
        this.zzb.add(zzcdVar);
    }
}
