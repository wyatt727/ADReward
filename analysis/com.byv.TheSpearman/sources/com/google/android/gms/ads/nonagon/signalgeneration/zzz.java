package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbdz;
import com.google.android.gms.internal.ads.zzbve;
import com.google.android.gms.internal.ads.zzgea;
import java.util.List;
import javax.annotation.Nonnull;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes2.dex */
final class zzz implements zzgea {
    final /* synthetic */ zzbve zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzab zzc;

    zzz(zzab zzabVar, zzbve zzbveVar, boolean z) {
        this.zza = zzbveVar;
        this.zzb = z;
        this.zzc = zzabVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final void zza(Throwable th) {
        try {
            this.zza.zze("Internal error: " + th.getMessage());
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final /* bridge */ /* synthetic */ void zzb(@Nonnull Object obj) {
        List<Uri> list = (List) obj;
        try {
            zzab.zzH(this.zzc, list);
            this.zza.zzf(list);
            if (this.zzc.zzt || this.zzb) {
                for (Uri uri : list) {
                    if (this.zzc.zzO(uri)) {
                        this.zzc.zzr.zzc(zzab.zzZ(uri, this.zzc.zzB, "1").toString(), null);
                    } else {
                        if (((Boolean) zzba.zzc().zza(zzbdz.zzhA)).booleanValue()) {
                            this.zzc.zzr.zzc(uri.toString(), null);
                        }
                    }
                }
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e);
        }
    }
}
