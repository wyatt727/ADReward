package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzcah implements SharedPreferences.OnSharedPreferenceChangeListener {
    final /* synthetic */ zzcai zza;
    private final String zzb;

    public zzcah(zzcai zzcaiVar, String str) {
        this.zza = zzcaiVar;
        this.zzb = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        synchronized (this.zza) {
            for (zzcag zzcagVar : this.zza.zzb) {
                zzcagVar.zza.zzb(zzcagVar.zzb, sharedPreferences, this.zzb, str);
            }
        }
    }
}
