package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcoq implements zzcoa {
    private final Context zza;
    private final com.google.android.gms.ads.internal.util.zzg zzb = com.google.android.gms.ads.internal.zzu.zzo().zzi();

    public zzcoq(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzcoa
    public final void zza(Map map) {
        String str;
        if (map.isEmpty() || (str = (String) map.get("gad_idless")) == null) {
            return;
        }
        com.google.android.gms.ads.internal.util.zzg zzgVar = this.zzb;
        boolean z = Boolean.parseBoolean(str);
        zzgVar.zzF(z);
        if (z) {
            Context context = this.zza;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzgm)).booleanValue()) {
                context.deleteDatabase("OfflineUpload.db");
            }
            try {
                zzftr zzftrVarZzj = zzftr.zzj(context);
                zzfts zzftsVarZzi = zzfts.zzi(context);
                zzftrVarZzj.zzk();
                zzftrVarZzj.zzl();
                zzftsVarZzi.zzj();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzcS)).booleanValue()) {
                    zzftsVarZzi.zzk();
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzcT)).booleanValue()) {
                    zzftsVarZzi.zzl();
                }
            } catch (IOException e) {
                com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "clearStorageOnIdlessMode");
            }
        }
    }
}
