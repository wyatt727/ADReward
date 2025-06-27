package com.google.android.gms.nearby.messages.internal;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.nearby.zzho;
import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.MessageListener;
import com.google.android.gms.nearby.messages.MessagesClient;
import com.google.android.gms.nearby.messages.MessagesOptions;
import com.google.android.gms.nearby.messages.PublishOptions;
import com.google.android.gms.nearby.messages.StatusCallback;
import com.google.android.gms.nearby.messages.SubscribeOptions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
public final class zzbg extends GoogleApi<MessagesOptions> implements MessagesClient {
    public static final /* synthetic */ int zza = 0;
    private static final Api.ClientKey<zzai> zzb;
    private static final Api.AbstractClientBuilder<zzai, MessagesOptions> zzc;
    private static final Api<MessagesOptions> zzd;
    private final int zze;

    static {
        Api.ClientKey<zzai> clientKey = new Api.ClientKey<>();
        zzb = clientKey;
        zzav zzavVar = new zzav();
        zzc = zzavVar;
        zzd = new Api<>("Nearby.MESSAGES_API", zzavVar, clientKey);
    }

    public zzbg(Activity activity, MessagesOptions messagesOptions) {
        super(activity, zzd, messagesOptions, GoogleApi.Settings.DEFAULT_SETTINGS);
        this.zze = 1;
        activity.getApplication().registerActivityLifecycleCallbacks(new zzba(activity, this, null));
    }

    static /* synthetic */ void zzg(zzbg zzbgVar, int i) {
        final int i2 = 1;
        zzbgVar.zzl(new zzbb(i2) { // from class: com.google.android.gms.nearby.messages.internal.zzat
            @Override // com.google.android.gms.nearby.messages.internal.zzbb
            public final void zza(zzai zzaiVar, ListenerHolder listenerHolder) throws RemoteException {
                int i3 = zzbg.zza;
                zzaiVar.zzB(1);
            }
        }, 0);
    }

    private final <T> ListenerHolder<BaseImplementation.ResultHolder<Status>> zzh(TaskCompletionSource<T> taskCompletionSource) {
        return registerListener(new zzay(this, taskCompletionSource), Status.class.getName());
    }

    private final <T> Task<Void> zzi(T t, int i) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        doUnregisterEventListener(ListenerHolders.createListenerKey(t, t.getClass().getName()), i).addOnCompleteListener(new zzaz(this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private final <T> ListenerHolder<T> zzj(T t) {
        if (t == null) {
            return null;
        }
        return (ListenerHolder<T>) registerListener(t, t.getClass().getName());
    }

    private final <T> Task<Void> zzk(ListenerHolder<T> listenerHolder, final zzbb zzbbVar, final zzbb zzbbVar2, int i) {
        return doRegisterEventListener(RegistrationMethods.builder().withHolder(listenerHolder).register(new RemoteCall(this, zzbbVar) { // from class: com.google.android.gms.nearby.messages.internal.zzau
            private final zzbg zza;
            private final zzbb zzb;

            {
                this.zza = this;
                this.zzb = zzbbVar;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                this.zza.zzc(this.zzb, (zzai) obj, (TaskCompletionSource) obj2);
            }
        }).unregister(new RemoteCall(this, zzbbVar2) { // from class: com.google.android.gms.nearby.messages.internal.zzak
            private final zzbg zza;
            private final zzbb zzb;

            {
                this.zza = this;
                this.zzb = zzbbVar2;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                this.zza.zzb(this.zzb, (zzai) obj, (TaskCompletionSource) obj2);
            }
        }).setMethodKey(i).build());
    }

    private final Task<Void> zzl(final zzbb zzbbVar, int i) {
        return doWrite(TaskApiCall.builder().setMethodKey(i).run(new RemoteCall(this, zzbbVar) { // from class: com.google.android.gms.nearby.messages.internal.zzal
            private final zzbg zza;
            private final zzbb zzb;

            {
                this.zza = this;
                this.zzb = zzbbVar;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                this.zza.zza(this.zzb, (zzai) obj, (TaskCompletionSource) obj2);
            }
        }).build());
    }

    @Override // com.google.android.gms.common.api.GoogleApi
    protected final ClientSettings.Builder createClientSettingsBuilder() {
        ClientSettings.Builder builderCreateClientSettingsBuilder = super.createClientSettingsBuilder();
        if (getApiOptions() != null) {
            String str = getApiOptions().zze;
        }
        return builderCreateClientSettingsBuilder;
    }

    @Override // com.google.android.gms.nearby.messages.MessagesClient
    public final void handleIntent(Intent intent, MessageListener messageListener) {
        zzho.zzc(intent, messageListener);
    }

    @Override // com.google.android.gms.nearby.messages.MessagesClient
    public final Task<Void> publish(Message message) {
        PublishOptions publishOptions = PublishOptions.DEFAULT;
        Preconditions.checkNotNull(message);
        Preconditions.checkNotNull(publishOptions);
        ListenerHolder listenerHolderZzj = zzj(message);
        return zzk(listenerHolderZzj, new zzaj(this, message, new zzaw(this, zzj(publishOptions.getCallback()), listenerHolderZzj), publishOptions), new zzam(message), 1291);
    }

    @Override // com.google.android.gms.nearby.messages.MessagesClient
    public final Task<Void> registerStatusCallback(StatusCallback statusCallback) {
        Preconditions.checkNotNull(statusCallback);
        final ListenerHolder listenerHolderZzj = zzj(statusCallback);
        return zzk(listenerHolderZzj, new zzbb(listenerHolderZzj) { // from class: com.google.android.gms.nearby.messages.internal.zzar
            private final ListenerHolder zza;

            {
                this.zza = listenerHolderZzj;
            }

            @Override // com.google.android.gms.nearby.messages.internal.zzbb
            public final void zza(zzai zzaiVar, ListenerHolder listenerHolder) throws RemoteException {
                ListenerHolder<StatusCallback> listenerHolder2 = this.zza;
                int i = zzbg.zza;
                zzaiVar.zzz(listenerHolder, listenerHolder2);
            }
        }, new zzbb(listenerHolderZzj) { // from class: com.google.android.gms.nearby.messages.internal.zzas
            private final ListenerHolder zza;

            {
                this.zza = listenerHolderZzj;
            }

            @Override // com.google.android.gms.nearby.messages.internal.zzbb
            public final void zza(zzai zzaiVar, ListenerHolder listenerHolder) throws RemoteException {
                ListenerHolder<StatusCallback> listenerHolder2 = this.zza;
                int i = zzbg.zza;
                zzaiVar.zzA(listenerHolder, listenerHolder2);
            }
        }, 1270);
    }

    @Override // com.google.android.gms.nearby.messages.MessagesClient
    public final Task<Void> subscribe(PendingIntent pendingIntent) {
        SubscribeOptions subscribeOptions = SubscribeOptions.DEFAULT;
        Preconditions.checkNotNull(pendingIntent);
        Preconditions.checkNotNull(subscribeOptions);
        ListenerHolder listenerHolderZzj = zzj(subscribeOptions.getCallback());
        return zzl(new zzap(this, pendingIntent, listenerHolderZzj == null ? null : new zzbf(listenerHolderZzj), subscribeOptions), 1288);
    }

    @Override // com.google.android.gms.nearby.messages.MessagesClient
    public final Task<Void> unpublish(Message message) {
        Preconditions.checkNotNull(message);
        return zzi(message, 1290);
    }

    @Override // com.google.android.gms.nearby.messages.MessagesClient
    public final Task<Void> unregisterStatusCallback(StatusCallback statusCallback) {
        Preconditions.checkNotNull(statusCallback);
        return zzi(statusCallback, 1271);
    }

    @Override // com.google.android.gms.nearby.messages.MessagesClient
    public final Task<Void> unsubscribe(final PendingIntent pendingIntent) {
        Preconditions.checkNotNull(pendingIntent);
        return zzl(new zzbb(pendingIntent) { // from class: com.google.android.gms.nearby.messages.internal.zzaq
            private final PendingIntent zza;

            {
                this.zza = pendingIntent;
            }

            @Override // com.google.android.gms.nearby.messages.internal.zzbb
            public final void zza(zzai zzaiVar, ListenerHolder listenerHolder) throws RemoteException {
                PendingIntent pendingIntent2 = this.zza;
                int i = zzbg.zza;
                zzaiVar.zzy(listenerHolder, pendingIntent2);
            }
        }, 1287);
    }

    final /* synthetic */ void zza(zzbb zzbbVar, zzai zzaiVar, TaskCompletionSource taskCompletionSource) throws RemoteException {
        zzbbVar.zza(zzaiVar, zzh(taskCompletionSource));
    }

    final /* synthetic */ void zzb(zzbb zzbbVar, zzai zzaiVar, TaskCompletionSource taskCompletionSource) throws RemoteException {
        zzbbVar.zza(zzaiVar, zzh(taskCompletionSource));
    }

    final /* synthetic */ void zzc(zzbb zzbbVar, zzai zzaiVar, TaskCompletionSource taskCompletionSource) throws RemoteException {
        zzbbVar.zza(zzaiVar, zzh(taskCompletionSource));
    }

    final /* synthetic */ void zzd(PendingIntent pendingIntent, zzbf zzbfVar, SubscribeOptions subscribeOptions, zzai zzaiVar, ListenerHolder listenerHolder) throws RemoteException {
        zzaiVar.zzv(listenerHolder, pendingIntent, zzbfVar, subscribeOptions, this.zze);
    }

    final /* synthetic */ void zze(ListenerHolder listenerHolder, zzbf zzbfVar, SubscribeOptions subscribeOptions, zzai zzaiVar, ListenerHolder listenerHolder2) throws RemoteException {
        zzaiVar.zzt(listenerHolder2, listenerHolder, zzbfVar, subscribeOptions, null, this.zze);
    }

    final /* synthetic */ void zzf(Message message, zzbd zzbdVar, PublishOptions publishOptions, zzai zzaiVar, ListenerHolder listenerHolder) throws RemoteException {
        zzaiVar.zzq(listenerHolder, zzae.zza(message), zzbdVar, publishOptions, this.zze);
    }

    @Override // com.google.android.gms.nearby.messages.MessagesClient
    public final Task<Void> unsubscribe(MessageListener messageListener) {
        Preconditions.checkNotNull(messageListener);
        return zzi(messageListener, 1286);
    }

    public zzbg(Context context, MessagesOptions messagesOptions) {
        super(context, zzd, messagesOptions, GoogleApi.Settings.DEFAULT_SETTINGS);
        this.zze = zzai.zzp(context);
    }

    @Override // com.google.android.gms.nearby.messages.MessagesClient
    public final Task<Void> subscribe(PendingIntent pendingIntent, SubscribeOptions subscribeOptions) {
        Preconditions.checkNotNull(pendingIntent);
        Preconditions.checkNotNull(subscribeOptions);
        ListenerHolder listenerHolderZzj = zzj(subscribeOptions.getCallback());
        return zzl(new zzap(this, pendingIntent, listenerHolderZzj == null ? null : new zzbf(listenerHolderZzj), subscribeOptions), 1288);
    }

    @Override // com.google.android.gms.nearby.messages.MessagesClient
    public final Task<Void> publish(Message message, PublishOptions publishOptions) {
        Preconditions.checkNotNull(message);
        Preconditions.checkNotNull(publishOptions);
        ListenerHolder listenerHolderZzj = zzj(message);
        return zzk(listenerHolderZzj, new zzaj(this, message, new zzaw(this, zzj(publishOptions.getCallback()), listenerHolderZzj), publishOptions), new zzam(message), 1291);
    }

    @Override // com.google.android.gms.nearby.messages.MessagesClient
    public final Task<Void> subscribe(MessageListener messageListener) {
        SubscribeOptions subscribeOptions = SubscribeOptions.DEFAULT;
        Preconditions.checkNotNull(messageListener);
        Preconditions.checkNotNull(subscribeOptions);
        Preconditions.checkArgument(subscribeOptions.getStrategy().zza() == 0, "Strategy.setBackgroundScanMode() is only supported by background subscribe (the version which takes a PendingIntent).");
        ListenerHolder listenerHolderZzj = zzj(messageListener);
        ListenerHolder listenerHolderZzj2 = zzj(subscribeOptions.getCallback());
        return zzk(listenerHolderZzj, new zzan(this, listenerHolderZzj, new zzax(this, listenerHolderZzj2, listenerHolderZzj2), subscribeOptions), new zzao(listenerHolderZzj), 1289);
    }

    @Override // com.google.android.gms.nearby.messages.MessagesClient
    public final Task<Void> subscribe(MessageListener messageListener, SubscribeOptions subscribeOptions) {
        Preconditions.checkNotNull(messageListener);
        Preconditions.checkNotNull(subscribeOptions);
        Preconditions.checkArgument(subscribeOptions.getStrategy().zza() == 0, "Strategy.setBackgroundScanMode() is only supported by background subscribe (the version which takes a PendingIntent).");
        ListenerHolder listenerHolderZzj = zzj(messageListener);
        ListenerHolder listenerHolderZzj2 = zzj(subscribeOptions.getCallback());
        return zzk(listenerHolderZzj, new zzan(this, listenerHolderZzj, new zzax(this, listenerHolderZzj2, listenerHolderZzj2), subscribeOptions), new zzao(listenerHolderZzj), 1289);
    }
}
