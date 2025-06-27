package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzeqo implements zzewr {
    private final Executor zza;
    private final zzcbh zzb;

    zzeqo(Executor executor, zzcbh zzcbhVar) {
        this.zza = executor;
        this.zzb = zzcbhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final int zza() {
        return 10;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final ListenableFuture zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzcE)).booleanValue()) {
            return zzgee.zzh(null);
        }
        zzcbh zzcbhVar = this.zzb;
        return zzgee.zzm(zzcbhVar.zzk(), new zzfwf() { // from class: com.google.android.gms.internal.ads.zzeqn
            @Override // com.google.android.gms.internal.ads.zzfwf
            public final Object apply(Object obj) {
                final ArrayList arrayList = (ArrayList) obj;
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new zzewq() { // from class: com.google.android.gms.internal.ads.zzeqm
                    @Override // com.google.android.gms.internal.ads.zzewq
                    public final void zzj(Object obj2) {
                        ((Bundle) obj2).putStringArrayList("android_permissions", arrayList);
                    }
                };
            }
        }, this.zza);
    }
}
