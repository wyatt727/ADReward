package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.internal.ads.zzbfp;
import com.google.android.gms.internal.ads.zzcbu;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes2.dex */
public final class zzd {
    public static void zza(Context context) {
        int i = com.google.android.gms.ads.internal.util.client.zzl.zza;
        if (((Boolean) zzbfp.zza.zze()).booleanValue()) {
            try {
                if (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) == 0 || com.google.android.gms.ads.internal.util.client.zzl.zzl()) {
                    return;
                }
                ListenableFuture listenableFutureZzb = new zzc(context).zzb();
                com.google.android.gms.ads.internal.util.client.zzm.zzi("Updating ad debug logging enablement.");
                zzcbu.zza(listenableFutureZzb, "AdDebugLogUpdater.updateEnablement");
            } catch (Exception e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("Fail to determine debug setting.", e);
            }
        }
    }
}
