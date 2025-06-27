package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.JsonReader;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.zzbxd;
import com.google.android.gms.internal.ads.zzdzh;
import com.google.android.gms.internal.ads.zzeam;
import com.google.android.gms.internal.ads.zzgdl;
import com.google.android.gms.internal.ads.zzgee;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStreamReader;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes2.dex */
public final class zzan implements zzgdl {
    private final Executor zza;
    private final zzdzh zzb;

    public zzan(Executor executor, zzdzh zzdzhVar) {
        this.zza = executor;
        this.zzb = zzdzhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgdl
    public final /* bridge */ /* synthetic */ ListenableFuture zza(Object obj) throws Exception {
        final zzbxd zzbxdVar = (zzbxd) obj;
        return zzgee.zzn(this.zzb.zzc(zzbxdVar), new zzgdl() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzam
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj2) {
                zzeam zzeamVar = (zzeam) obj2;
                zzap zzapVar = new zzap(new JsonReader(new InputStreamReader(zzeamVar.zzb())), zzeamVar.zza());
                try {
                    zzapVar.zzb = zzay.zzb().zzi(zzbxdVar.zza).toString();
                } catch (JSONException unused) {
                    zzapVar.zzb = JsonUtils.EMPTY_JSON;
                }
                return zzgee.zzh(zzapVar);
            }
        }, this.zza);
    }
}
