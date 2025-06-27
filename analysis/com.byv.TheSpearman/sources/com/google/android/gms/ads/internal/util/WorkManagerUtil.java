package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.work.Configuration;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.NetworkType;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes2.dex */
public class WorkManagerUtil extends zzbs {
    private static void zzb(Context context) {
        try {
            WorkManager.initialize(context.getApplicationContext(), new Configuration.Builder().build());
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzbt
    public final void zze(IObjectWrapper iObjectWrapper) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzb(context);
        try {
            WorkManager workManager = WorkManager.getInstance(context);
            workManager.cancelAllWorkByTag("offline_ping_sender_work");
            workManager.enqueue(new OneTimeWorkRequest.Builder(OfflinePingSender.class).setConstraints(new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build()).addTag("offline_ping_sender_work").build());
        } catch (IllegalStateException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to instantiate WorkManager.", e);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzbt
    public final boolean zzf(IObjectWrapper iObjectWrapper, String str, String str2) {
        return zzg(iObjectWrapper, new com.google.android.gms.ads.internal.offline.buffering.zza(str, str2, ""));
    }

    @Override // com.google.android.gms.ads.internal.util.zzbt
    public final boolean zzg(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.offline.buffering.zza zzaVar) throws Throwable {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzb(context);
        Constraints constraintsBuild = new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build();
        try {
            WorkManager.getInstance(context).enqueue(new OneTimeWorkRequest.Builder(OfflineNotificationPoster.class).setConstraints(constraintsBuild).setInputData(new Data.Builder().putString("uri", zzaVar.zza).putString("gws_query_id", zzaVar.zzb).putString(CampaignEx.JSON_KEY_IMAGE_URL, zzaVar.zzc).build()).addTag("offline_notification_work").build());
            return true;
        } catch (IllegalStateException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to instantiate WorkManager.", e);
            return false;
        }
    }
}
