package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcqr implements zzazy {
    private zzcgm zza;
    private final Executor zzb;
    private final zzcqd zzc;
    private final Clock zzd;
    private boolean zze = false;
    private boolean zzf = false;
    private final zzcqg zzg = new zzcqg();

    public zzcqr(Executor executor, zzcqd zzcqdVar, Clock clock) {
        this.zzb = executor;
        this.zzc = zzcqdVar;
        this.zzd = clock;
    }

    private final void zzg() {
        try {
            final JSONObject jSONObjectZzb = this.zzc.zzb(this.zzg);
            if (this.zza != null) {
                this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqq
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzd(jSONObjectZzb);
                    }
                });
            }
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed to call video active view js", e);
        }
    }

    public final void zza() {
        this.zze = false;
    }

    public final void zzb() {
        this.zze = true;
        zzg();
    }

    final /* synthetic */ void zzd(JSONObject jSONObject) {
        this.zza.zzl("AFMA_updateActiveView", jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzazy
    public final void zzdp(zzazx zzazxVar) {
        boolean z = this.zzf ? false : zzazxVar.zzj;
        zzcqg zzcqgVar = this.zzg;
        zzcqgVar.zza = z;
        zzcqgVar.zzd = this.zzd.elapsedRealtime();
        this.zzg.zzf = zzazxVar;
        if (this.zze) {
            zzg();
        }
    }

    public final void zze(boolean z) {
        this.zzf = z;
    }

    public final void zzf(zzcgm zzcgmVar) {
        this.zza = zzcgmVar;
    }
}
