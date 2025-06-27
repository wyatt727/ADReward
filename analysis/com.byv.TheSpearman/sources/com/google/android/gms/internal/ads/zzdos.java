package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import com.json.x6;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdos {
    private final Executor zza;
    private final zzcqr zzb;
    private final zzdgh zzc;
    private final zzcpk zzd;

    zzdos(Executor executor, zzcqr zzcqrVar, zzdgh zzdghVar, zzcpk zzcpkVar) {
        this.zza = executor;
        this.zzc = zzdghVar;
        this.zzb = zzcqrVar;
        this.zzd = zzcpkVar;
    }

    public final void zza(final zzcgm zzcgmVar) {
        if (zzcgmVar == null) {
            return;
        }
        this.zzc.zza(zzcgmVar.zzF());
        this.zzc.zzo(new zzazy() { // from class: com.google.android.gms.internal.ads.zzdoo
            @Override // com.google.android.gms.internal.ads.zzazy
            public final void zzdp(zzazx zzazxVar) {
                zzcic zzcicVarZzN = zzcgmVar.zzN();
                Rect rect = zzazxVar.zzd;
                zzcicVarZzN.zzq(rect.left, rect.top, false);
            }
        }, this.zza);
        this.zzc.zzo(new zzazy() { // from class: com.google.android.gms.internal.ads.zzdop
            @Override // com.google.android.gms.internal.ads.zzazy
            public final void zzdp(zzazx zzazxVar) {
                HashMap map = new HashMap();
                map.put(x6.k, true != zzazxVar.zzj ? "0" : "1");
                zzcgmVar.zzd("onAdVisibilityChanged", map);
            }
        }, this.zza);
        this.zzc.zzo(this.zzb, this.zza);
        this.zzb.zzf(zzcgmVar);
        zzcic zzcicVarZzN = zzcgmVar.zzN();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzjT)).booleanValue() && zzcicVarZzN != null) {
            zzcicVarZzN.zzJ(this.zzd);
            zzcicVarZzN.zzK(this.zzd, null, null);
        }
        zzcgmVar.zzae("/trackActiveViewUnit", new zzbky() { // from class: com.google.android.gms.internal.ads.zzdoq
            @Override // com.google.android.gms.internal.ads.zzbky
            public final void zza(Object obj, Map map) {
                this.zza.zzb((zzcgm) obj, map);
            }
        });
        zzcgmVar.zzae("/untrackActiveViewUnit", new zzbky() { // from class: com.google.android.gms.internal.ads.zzdor
            @Override // com.google.android.gms.internal.ads.zzbky
            public final void zza(Object obj, Map map) {
                this.zza.zzc((zzcgm) obj, map);
            }
        });
    }

    final /* synthetic */ void zzb(zzcgm zzcgmVar, Map map) {
        this.zzb.zzb();
    }

    final /* synthetic */ void zzc(zzcgm zzcgmVar, Map map) {
        this.zzb.zza();
    }
}
