package com.google.android.gms.location;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.json.mediationsdk.utils.IronSourceConstants;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes3.dex */
public class ActivityRecognitionClient extends GoogleApi<Api.ApiOptions.NoOptions> {
    public static final /* synthetic */ int zza = 0;

    public ActivityRecognitionClient(Activity activity) {
        super(activity, LocationServices.API, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public Task<Void> removeActivityTransitionUpdates(final PendingIntent pendingIntent) {
        return doWrite(TaskApiCall.builder().run(new RemoteCall(pendingIntent) { // from class: com.google.android.gms.location.zzg
            private final PendingIntent zza;

            {
                this.zza = pendingIntent;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                PendingIntent pendingIntent2 = this.zza;
                int i = ActivityRecognitionClient.zza;
                ((com.google.android.gms.internal.location.zzaz) obj).zzs(pendingIntent2, new zzj((TaskCompletionSource) obj2));
            }
        }).setMethodKey(2406).build());
    }

    public Task<Void> removeActivityUpdates(final PendingIntent pendingIntent) {
        return doWrite(TaskApiCall.builder().run(new RemoteCall(pendingIntent) { // from class: com.google.android.gms.location.zze
            private final PendingIntent zza;

            {
                this.zza = pendingIntent;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                PendingIntent pendingIntent2 = this.zza;
                int i = ActivityRecognitionClient.zza;
                ((com.google.android.gms.internal.location.zzaz) obj).zzt(pendingIntent2);
                ((TaskCompletionSource) obj2).setResult(null);
            }
        }).setMethodKey(2402).build());
    }

    public Task<Void> removeSleepSegmentUpdates(final PendingIntent pendingIntent) {
        return doWrite(TaskApiCall.builder().run(new RemoteCall(pendingIntent) { // from class: com.google.android.gms.location.zzh
            private final PendingIntent zza;

            {
                this.zza = pendingIntent;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                PendingIntent pendingIntent2 = this.zza;
                int i = ActivityRecognitionClient.zza;
                ((com.google.android.gms.internal.location.zzaz) obj).zzu(pendingIntent2, new zzj((TaskCompletionSource) obj2));
            }
        }).setMethodKey(2411).build());
    }

    public Task<Void> requestActivityTransitionUpdates(final ActivityTransitionRequest activityTransitionRequest, final PendingIntent pendingIntent) {
        activityTransitionRequest.zza(getContextAttributionTag());
        return doWrite(TaskApiCall.builder().run(new RemoteCall(activityTransitionRequest, pendingIntent) { // from class: com.google.android.gms.location.zzf
            private final ActivityTransitionRequest zza;
            private final PendingIntent zzb;

            {
                this.zza = activityTransitionRequest;
                this.zzb = pendingIntent;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ActivityTransitionRequest activityTransitionRequest2 = this.zza;
                PendingIntent pendingIntent2 = this.zzb;
                int i = ActivityRecognitionClient.zza;
                ((com.google.android.gms.internal.location.zzaz) obj).zzr(activityTransitionRequest2, pendingIntent2, new zzj((TaskCompletionSource) obj2));
            }
        }).setMethodKey(2405).build());
    }

    public Task<Void> requestActivityUpdates(final long j, final PendingIntent pendingIntent) {
        return doWrite(TaskApiCall.builder().run(new RemoteCall(j, pendingIntent) { // from class: com.google.android.gms.location.zzc
            private final long zza;
            private final PendingIntent zzb;

            {
                this.zza = j;
                this.zzb = pendingIntent;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                long j2 = this.zza;
                PendingIntent pendingIntent2 = this.zzb;
                int i = ActivityRecognitionClient.zza;
                ((com.google.android.gms.internal.location.zzaz) obj).zzq(j2, pendingIntent2);
                ((TaskCompletionSource) obj2).setResult(null);
            }
        }).setMethodKey(IronSourceConstants.IS_CAP_SESSION).build());
    }

    public Task<Void> requestSleepSegmentUpdates(final PendingIntent pendingIntent, final SleepSegmentRequest sleepSegmentRequest) {
        Preconditions.checkNotNull(pendingIntent, "PendingIntent must be specified.");
        return doRead(TaskApiCall.builder().run(new RemoteCall(this, pendingIntent, sleepSegmentRequest) { // from class: com.google.android.gms.location.zzd
            private final ActivityRecognitionClient zza;
            private final PendingIntent zzb;
            private final SleepSegmentRequest zzc;

            {
                this.zza = this;
                this.zzb = pendingIntent;
                this.zzc = sleepSegmentRequest;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ActivityRecognitionClient activityRecognitionClient = this.zza;
                ((com.google.android.gms.internal.location.zzam) ((com.google.android.gms.internal.location.zzaz) obj).getService()).zzv(this.zzb, this.zzc, new zzi(activityRecognitionClient, (TaskCompletionSource) obj2));
            }
        }).setFeatures(zzu.zzb).setMethodKey(2410).build());
    }

    public ActivityRecognitionClient(Context context) {
        super(context, LocationServices.API, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }
}
