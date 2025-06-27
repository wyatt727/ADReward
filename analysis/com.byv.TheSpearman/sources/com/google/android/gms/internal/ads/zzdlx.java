package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzdlx implements zzbgs {
    final /* synthetic */ zzdmu zza;
    final /* synthetic */ ViewGroup zzb;

    zzdlx(zzdmu zzdmuVar, ViewGroup viewGroup) {
        this.zza = zzdmuVar;
        this.zzb = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final JSONObject zza() {
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final JSONObject zzb() {
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final void zzc() {
        zzfzn zzfznVar = zzdlu.zza;
        Map mapZzm = this.zza.zzm();
        if (mapZzm == null) {
            return;
        }
        int size = zzfznVar.size();
        int i = 0;
        while (i < size) {
            Object obj = mapZzm.get((String) zzfznVar.get(i));
            i++;
            if (obj != null) {
                this.zza.onClick(this.zzb);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final void zzd(MotionEvent motionEvent) {
        this.zza.onTouch(null, motionEvent);
    }
}
