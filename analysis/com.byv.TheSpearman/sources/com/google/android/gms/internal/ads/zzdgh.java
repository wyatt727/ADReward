package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdgh extends zzdee implements zzazy {
    private final Map zzb;
    private final Context zzc;
    private final zzffn zzd;

    public zzdgh(Context context, Set set, zzffn zzffnVar) {
        super(set);
        this.zzb = new WeakHashMap(1);
        this.zzc = context;
        this.zzd = zzffnVar;
    }

    public final synchronized void zza(View view) {
        zzazz zzazzVar = (zzazz) this.zzb.get(view);
        if (zzazzVar == null) {
            zzazz zzazzVar2 = new zzazz(this.zzc, view);
            zzazzVar2.zzc(this);
            this.zzb.put(view, zzazzVar2);
            zzazzVar = zzazzVar2;
        }
        if (this.zzd.zzY) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzbo)).booleanValue()) {
                zzazzVar.zzg(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzbn)).longValue());
                return;
            }
        }
        zzazzVar.zzf();
    }

    public final synchronized void zzb(View view) {
        if (this.zzb.containsKey(view)) {
            ((zzazz) this.zzb.get(view)).zze(this);
            this.zzb.remove(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzazy
    public final synchronized void zzdp(final zzazx zzazxVar) {
        zzq(new zzded() { // from class: com.google.android.gms.internal.ads.zzdgg
            @Override // com.google.android.gms.internal.ads.zzded
            public final void zza(Object obj) {
                ((zzazy) obj).zzdp(zzazxVar);
            }
        });
    }
}
