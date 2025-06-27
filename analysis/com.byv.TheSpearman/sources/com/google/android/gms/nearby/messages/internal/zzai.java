package com.google.android.gms.nearby.messages.internal;

import android.app.Activity;
import android.app.Application;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.nearby.zzho;
import com.google.android.gms.internal.nearby.zzhq;
import com.google.android.gms.internal.nearby.zzht;
import com.google.android.gms.internal.nearby.zzhu;
import com.google.android.gms.nearby.Nearby;
import com.google.android.gms.nearby.messages.MessageFilter;
import com.google.android.gms.nearby.messages.MessageListener;
import com.google.android.gms.nearby.messages.MessagesOptions;
import com.google.android.gms.nearby.messages.PublishOptions;
import com.google.android.gms.nearby.messages.StatusCallback;
import com.google.android.gms.nearby.messages.Strategy;
import com.google.android.gms.nearby.messages.SubscribeOptions;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
public final class zzai extends GmsClient<zzs> {
    private final zzhu<ListenerHolder.ListenerKey, IBinder> zze;
    private final ClientAppContext zzf;
    private final int zzg;

    zzai(Context context, Looper looper, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, ClientSettings clientSettings, MessagesOptions messagesOptions) {
        super(context, looper, 62, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.zze = new zzhu<>();
        String realClientPackageName = clientSettings.getRealClientPackageName();
        int iZzp = zzp(context);
        if (messagesOptions != null) {
            this.zzf = new ClientAppContext(1, realClientPackageName, null, false, iZzp, null);
            this.zzg = messagesOptions.zzc;
        } else {
            this.zzf = new ClientAppContext(1, realClientPackageName, null, false, iZzp, null);
            this.zzg = -1;
        }
        if (iZzp == 1 && PlatformVersion.isAtLeastIceCreamSandwich()) {
            Activity activity = (Activity) context;
            if (Log.isLoggable("NearbyMessagesClient", 2)) {
                Log.v("NearbyMessagesClient", String.format("Registering ClientLifecycleSafetyNet's ActivityLifecycleCallbacks for %s", activity.getPackageName()));
            }
            activity.getApplication().registerActivityLifecycleCallbacks(new zzah(activity, this, null));
        }
    }

    static int zzp(Context context) {
        if (context instanceof Activity) {
            return 1;
        }
        if (context instanceof Application) {
            return 2;
        }
        return context instanceof Service ? 3 : 0;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final /* bridge */ /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
        return iInterfaceQueryLocalInterface instanceof zzs ? (zzs) iInterfaceQueryLocalInterface : new zzs(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final void disconnect() {
        try {
            zzB(2);
        } catch (RemoteException e) {
            if (Log.isLoggable("NearbyMessagesClient", 2)) {
                Log.v("NearbyMessagesClient", String.format("Failed to emit CLIENT_DISCONNECTED from override of GmsClient#disconnect(): %s", e));
            }
        }
        this.zze.zze();
        super.disconnect();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final Bundle getGetServiceRequestExtraArgs() {
        Bundle getServiceRequestExtraArgs = super.getGetServiceRequestExtraArgs();
        getServiceRequestExtraArgs.putInt("NearbyPermissions", this.zzg);
        getServiceRequestExtraArgs.putParcelable("ClientAppContext", this.zzf);
        return getServiceRequestExtraArgs;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.nearby.messages.internal.INearbyMessagesService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String getStartServiceAction() {
        return "com.google.android.gms.nearby.messages.service.NearbyMessagesService.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final boolean requiresGooglePlayServices() {
        return Nearby.zza(getContext());
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean usesClientTelemetry() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void zzA(ListenerHolder<BaseImplementation.ResultHolder<Status>> listenerHolder, ListenerHolder<StatusCallback> listenerHolder2) throws RemoteException {
        ListenerHolder.ListenerKey<StatusCallback> listenerKey = listenerHolder2.getListenerKey();
        if (listenerKey == null) {
            return;
        }
        zzhq zzhqVar = new zzhq(listenerHolder);
        if (!this.zze.zza(listenerKey)) {
            zzhqVar.zzd(new Status(0));
            return;
        }
        zzca zzcaVar = new zzca(zzhqVar, this.zze.zzc(listenerKey));
        zzcaVar.zzd = false;
        ((zzs) getService()).zzi(zzcaVar);
        this.zze.zzd(listenerKey);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void zzB(int i) throws RemoteException {
        String str = i != 1 ? "CLIENT_DISCONNECTED" : "ACTIVITY_STOPPED";
        if (!isConnected()) {
            if (Log.isLoggable("NearbyMessagesClient", 3)) {
                Log.d("NearbyMessagesClient", String.format("Failed to emit client lifecycle event %s due to GmsClient being disconnected", str));
            }
        } else {
            zzj zzjVar = new zzj(1, null, i);
            if (Log.isLoggable("NearbyMessagesClient", 3)) {
                Log.d("NearbyMessagesClient", String.format("Emitting client lifecycle event %s", str));
            }
            ((zzs) getService()).zzj(zzjVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void zzq(ListenerHolder<BaseImplementation.ResultHolder<Status>> listenerHolder, zzae zzaeVar, zzu zzuVar, PublishOptions publishOptions, int i) throws RemoteException {
        ((zzs) getService()).zzd(new zzby(2, zzaeVar, publishOptions.getStrategy(), new zzhq(listenerHolder), null, null, false, zzuVar, false, null, i));
    }

    @Deprecated
    final void zzr(ListenerHolder<BaseImplementation.ResultHolder<Status>> listenerHolder, zzae zzaeVar, zzu zzuVar, PublishOptions publishOptions) throws RemoteException {
        zzq(listenerHolder, zzaeVar, zzuVar, publishOptions, this.zzf.zze);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void zzs(ListenerHolder<BaseImplementation.ResultHolder<Status>> listenerHolder, zzae zzaeVar) throws RemoteException {
        ((zzs) getService()).zze(new zzcd(1, zzaeVar, new zzhq(listenerHolder), null, null, false, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void zzt(ListenerHolder<BaseImplementation.ResultHolder<Status>> listenerHolder, ListenerHolder<MessageListener> listenerHolder2, zzaa zzaaVar, SubscribeOptions subscribeOptions, byte[] bArr, int i) throws RemoteException {
        ListenerHolder.ListenerKey<MessageListener> listenerKey = listenerHolder2.getListenerKey();
        if (listenerKey == null) {
            return;
        }
        if (!this.zze.zza(listenerKey)) {
            this.zze.zzb(listenerKey, new zzho(listenerHolder2));
        }
        IBinder iBinderZzc = this.zze.zzc(listenerKey);
        Strategy strategy = subscribeOptions.getStrategy();
        zzhq zzhqVar = new zzhq(listenerHolder);
        MessageFilter filter = subscribeOptions.getFilter();
        boolean z = subscribeOptions.zza;
        ((zzs) getService()).zzf(new SubscribeRequest(iBinderZzc, strategy, zzhqVar, filter, null, null, zzaaVar, false, 0, i));
    }

    @Deprecated
    final void zzu(ListenerHolder<BaseImplementation.ResultHolder<Status>> listenerHolder, ListenerHolder<MessageListener> listenerHolder2, zzaa zzaaVar, SubscribeOptions subscribeOptions, byte[] bArr) throws RemoteException {
        zzt(listenerHolder, listenerHolder2, zzaaVar, subscribeOptions, null, this.zzf.zze);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void zzv(ListenerHolder<BaseImplementation.ResultHolder<Status>> listenerHolder, PendingIntent pendingIntent, zzaa zzaaVar, SubscribeOptions subscribeOptions, int i) throws RemoteException {
        Strategy strategy = subscribeOptions.getStrategy();
        zzhq zzhqVar = new zzhq(listenerHolder);
        MessageFilter filter = subscribeOptions.getFilter();
        boolean z = subscribeOptions.zza;
        int i2 = subscribeOptions.zzb;
        ((zzs) getService()).zzf(new SubscribeRequest(null, strategy, zzhqVar, filter, pendingIntent, null, zzaaVar, false, 0, this.zzf.zze));
    }

    @Deprecated
    final void zzw(ListenerHolder<BaseImplementation.ResultHolder<Status>> listenerHolder, PendingIntent pendingIntent, zzaa zzaaVar, SubscribeOptions subscribeOptions) throws RemoteException {
        zzv(listenerHolder, pendingIntent, zzaaVar, subscribeOptions, this.zzf.zze);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void zzx(ListenerHolder<BaseImplementation.ResultHolder<Status>> listenerHolder, ListenerHolder<MessageListener> listenerHolder2) throws RemoteException {
        ListenerHolder.ListenerKey<MessageListener> listenerKey = listenerHolder2.getListenerKey();
        if (listenerKey == null) {
            return;
        }
        zzhq zzhqVar = new zzhq(listenerHolder);
        if (!this.zze.zza(listenerKey)) {
            zzhqVar.zzd(new Status(0));
            return;
        }
        ((zzs) getService()).zzg(new zzcf(this.zze.zzc(listenerKey), zzhqVar, null));
        this.zze.zzd(listenerKey);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void zzy(ListenerHolder<BaseImplementation.ResultHolder<Status>> listenerHolder, PendingIntent pendingIntent) throws RemoteException {
        ((zzs) getService()).zzg(new zzcf(null, new zzhq(listenerHolder), pendingIntent));
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void zzz(ListenerHolder<BaseImplementation.ResultHolder<Status>> listenerHolder, ListenerHolder<StatusCallback> listenerHolder2) throws RemoteException {
        ListenerHolder.ListenerKey<StatusCallback> listenerKey = listenerHolder2.getListenerKey();
        if (listenerKey == null) {
            return;
        }
        if (!this.zze.zza(listenerKey)) {
            this.zze.zzb(listenerKey, new zzht(listenerHolder2));
        }
        zzca zzcaVar = new zzca(new zzhq(listenerHolder), this.zze.zzc(listenerKey));
        zzcaVar.zzd = true;
        ((zzs) getService()).zzi(zzcaVar);
    }
}
