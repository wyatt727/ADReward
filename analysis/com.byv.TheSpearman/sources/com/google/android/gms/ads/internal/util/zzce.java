package com.google.android.gms.ads.internal.util;

import android.content.SharedPreferences;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes2.dex */
final class zzce implements SharedPreferences.OnSharedPreferenceChangeListener {
    final /* synthetic */ zzcf zza;
    private final String zzb;

    public zzce(zzcf zzcfVar, String str) {
        this.zza = zzcfVar;
        this.zzb = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        synchronized (this.zza) {
            for (zzcd zzcdVar : this.zza.zzb) {
                String str2 = this.zzb;
                Map map = zzcdVar.zza;
                if (map.containsKey(str2) && ((Set) map.get(str2)).contains(str)) {
                    com.google.android.gms.ads.internal.zzu.zzo().zzi().zzG(false);
                }
            }
        }
    }
}
