package com.google.android.gms.internal.games;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.games.Games;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes3.dex */
public class zzac extends GoogleApi<Games.GamesOptions> {
    public zzac(Activity activity, Games.GamesOptions gamesOptions) {
        super(activity, Games.API, gamesOptions, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    protected zzac(Context context, Games.GamesOptions gamesOptions) {
        super(context, Games.API, gamesOptions, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    @Override // com.google.android.gms.common.api.GoogleApi
    protected ClientSettings.Builder createClientSettingsBuilder() {
        ClientSettings.Builder builderCreateClientSettingsBuilder = super.createClientSettingsBuilder();
        return (getApiOptions() == null || getApiOptions().zzat == null) ? builderCreateClientSettingsBuilder : builderCreateClientSettingsBuilder.setRealClientPackageName(getApiOptions().zzat);
    }

    protected final <ResultT> Task<ResultT> zza(RemoteCall<com.google.android.gms.games.internal.zzf, TaskCompletionSource<ResultT>> remoteCall) {
        return (Task<ResultT>) doRead(zzc(remoteCall));
    }

    protected final <ResultT> Task<ResultT> zzb(RemoteCall<com.google.android.gms.games.internal.zzf, TaskCompletionSource<ResultT>> remoteCall) {
        return (Task<ResultT>) doWrite(zzc(remoteCall));
    }

    private static <ResultT> TaskApiCall<com.google.android.gms.games.internal.zzf, ResultT> zzc(final RemoteCall<com.google.android.gms.games.internal.zzf, TaskCompletionSource<ResultT>> remoteCall) {
        return TaskApiCall.builder().run(new RemoteCall(remoteCall) { // from class: com.google.android.gms.internal.games.zzaf
            private final RemoteCall zzfe;

            {
                this.zzfe = remoteCall;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                try {
                    this.zzfe.accept((com.google.android.gms.games.internal.zzf) obj, taskCompletionSource);
                } catch (RemoteException | SecurityException e) {
                    taskCompletionSource.trySetException(e);
                }
            }
        }).build();
    }
}
