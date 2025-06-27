package com.google.android.gms.internal.nearby;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.nearby.connection.AdvertisingOptions;
import com.google.android.gms.nearby.connection.ConnectionLifecycleCallback;
import com.google.android.gms.nearby.connection.ConnectionOptions;
import com.google.android.gms.nearby.connection.ConnectionsClient;
import com.google.android.gms.nearby.connection.ConnectionsOptions;
import com.google.android.gms.nearby.connection.DiscoveryOptions;
import com.google.android.gms.nearby.connection.EndpointDiscoveryCallback;
import com.google.android.gms.nearby.connection.Payload;
import com.google.android.gms.nearby.connection.PayloadCallback;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
public final class zzcn extends GoogleApi<ConnectionsOptions> implements ConnectionsClient {
    public static final /* synthetic */ int zza = 0;
    private static final Api.ClientKey<zzbf> zzb;
    private static final Api.AbstractClientBuilder<zzbf, ConnectionsOptions> zzc;
    private static final Api<ConnectionsOptions> zzd;
    private final zzo zze;
    private final zzet zzf;

    static {
        Api.ClientKey<zzbf> clientKey = new Api.ClientKey<>();
        zzb = clientKey;
        zzce zzceVar = new zzce();
        zzc = zzceVar;
        zzd = new Api<>("Nearby.CONNECTIONS_API", zzceVar, clientKey);
    }

    public zzcn(Activity activity, ConnectionsOptions connectionsOptions) {
        super(activity, (Api<Api.ApiOptions>) zzd, (Api.ApiOptions) null, GoogleApi.Settings.DEFAULT_SETTINGS);
        this.zze = zzo.zza(this, null);
        if (Build.VERSION.SDK_INT >= 19) {
            this.zzf = zzet.zza(activity);
        } else {
            this.zzf = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzf(String str) {
        this.zze.zze(this, RegistrationMethods.builder().withHolder(this.zze.zzc(this, str, "connection")).register(zzbt.zza).unregister(zzbu.zza).setMethodKey(1268).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzg(String str) {
        zzo zzoVar = this.zze;
        zzoVar.zzf(this, zzoVar.zzd(str, "connection"));
    }

    private final Task<Void> zzh(final zzcj zzcjVar) {
        return doWrite(TaskApiCall.builder().setMethodKey(1229).run(new RemoteCall(this, zzcjVar) { // from class: com.google.android.gms.internal.nearby.zzbv
            private final zzcn zza;
            private final zzcj zzb;

            {
                this.zza = this;
                this.zzb = zzcjVar;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                this.zzb.zza((zzbf) obj, new zzcl(this.zza, (TaskCompletionSource) obj2));
            }
        }).build());
    }

    private final Task<Void> zzi(final zzcm zzcmVar) {
        return doWrite(TaskApiCall.builder().setMethodKey(1229).run(new RemoteCall(zzcmVar) { // from class: com.google.android.gms.internal.nearby.zzbw
            private final zzcm zza;

            {
                this.zza = zzcmVar;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                int i = zzcn.zza;
                this.zza.zza((zzbf) obj);
                ((TaskCompletionSource) obj2).setResult(null);
            }
        }).build());
    }

    @Override // com.google.android.gms.nearby.connection.ConnectionsClient
    public final Task<Void> acceptConnection(final String str, PayloadCallback payloadCallback) {
        final ListenerHolder<L> listenerHolderRegisterListener = registerListener(payloadCallback, PayloadCallback.class.getName());
        return doWrite(TaskApiCall.builder().run(new RemoteCall(this, str, listenerHolderRegisterListener) { // from class: com.google.android.gms.internal.nearby.zzbk
            private final zzcn zza;
            private final String zzb;
            private final ListenerHolder zzc;

            {
                this.zza = this;
                this.zzb = str;
                this.zzc = listenerHolderRegisterListener;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                zzcn zzcnVar = this.zza;
                ((zzbf) obj).zzy(new zzcl(zzcnVar, (TaskCompletionSource) obj2), this.zzb, this.zzc);
            }
        }).setMethodKey(1227).build());
    }

    @Override // com.google.android.gms.nearby.connection.ConnectionsClient
    public final Task<Void> cancelPayload(final long j) {
        return zzh(new zzcj(j) { // from class: com.google.android.gms.internal.nearby.zzbo
            private final long zza;

            {
                this.zza = j;
            }

            @Override // com.google.android.gms.internal.nearby.zzcj
            public final void zza(zzbf zzbfVar, BaseImplementation.ResultHolder resultHolder) throws RemoteException {
                long j2 = this.zza;
                int i = zzcn.zza;
                zzbfVar.zzB(resultHolder, j2);
            }
        });
    }

    @Override // com.google.android.gms.nearby.connection.ConnectionsClient
    public final void disconnectFromEndpoint(final String str) {
        zzi(new zzcm(str) { // from class: com.google.android.gms.internal.nearby.zzbp
            private final String zza;

            {
                this.zza = str;
            }

            @Override // com.google.android.gms.internal.nearby.zzcm
            public final void zza(zzbf zzbfVar) throws RemoteException {
                String str2 = this.zza;
                int i = zzcn.zza;
                zzbfVar.zzC(str2);
            }
        });
        zzg(str);
    }

    @Override // com.google.android.gms.nearby.connection.ConnectionsClient
    public final Task<Void> rejectConnection(final String str) {
        return zzh(new zzcj(str) { // from class: com.google.android.gms.internal.nearby.zzbl
            private final String zza;

            {
                this.zza = str;
            }

            @Override // com.google.android.gms.internal.nearby.zzcj
            public final void zza(zzbf zzbfVar, BaseImplementation.ResultHolder resultHolder) throws RemoteException {
                String str2 = this.zza;
                int i = zzcn.zza;
                zzbfVar.zzz(resultHolder, str2);
            }
        });
    }

    @Override // com.google.android.gms.nearby.connection.ConnectionsClient
    public final Task<Void> requestConnection(final String str, final String str2, ConnectionLifecycleCallback connectionLifecycleCallback) {
        final ListenerHolder<L> listenerHolderRegisterListener = registerListener(new zzck(this, connectionLifecycleCallback), ConnectionLifecycleCallback.class.getName());
        zzf(str2);
        return doWrite(TaskApiCall.builder().run(new RemoteCall(this, str, str2, listenerHolderRegisterListener) { // from class: com.google.android.gms.internal.nearby.zzbj
            private final zzcn zza;
            private final String zzb;
            private final String zzc;
            private final ListenerHolder zzd;

            {
                this.zza = this;
                this.zzb = str;
                this.zzc = str2;
                this.zzd = listenerHolderRegisterListener;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                zzcn zzcnVar = this.zza;
                ((zzbf) obj).zzx(new zzcl(zzcnVar, (TaskCompletionSource) obj2), this.zzb, this.zzc, this.zzd);
            }
        }).setMethodKey(1226).build()).addOnFailureListener(new zzci(this, str2));
    }

    @Override // com.google.android.gms.nearby.connection.ConnectionsClient
    public final Task<Void> sendPayload(final String str, final Payload payload) {
        return doWrite(TaskApiCall.builder().run(new RemoteCall(this, str, payload) { // from class: com.google.android.gms.internal.nearby.zzbm
            private final zzcn zza;
            private final String zzb;
            private final Payload zzc;

            {
                this.zza = this;
                this.zzb = str;
                this.zzc = payload;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws IOException, RemoteException {
                zzcn zzcnVar = this.zza;
                String str2 = this.zzb;
                ((zzbf) obj).zzA(new zzcl(zzcnVar, (TaskCompletionSource) obj2), new String[]{str2}, this.zzc, false);
            }
        }).setMethodKey(1228).build());
    }

    @Override // com.google.android.gms.nearby.connection.ConnectionsClient
    public final Task<Void> startAdvertising(final String str, final String str2, ConnectionLifecycleCallback connectionLifecycleCallback, final AdvertisingOptions advertisingOptions) {
        final ListenerHolder<L> listenerHolderRegisterListener = registerListener(new zzck(this, connectionLifecycleCallback), ConnectionLifecycleCallback.class.getName());
        return this.zze.zze(this, RegistrationMethods.builder().withHolder(this.zze.zzb(this, new Object(), "advertising")).register(new RemoteCall(this, str, str2, listenerHolderRegisterListener, advertisingOptions) { // from class: com.google.android.gms.internal.nearby.zzcb
            private final zzcn zza;
            private final String zzb;
            private final String zzc;
            private final ListenerHolder zzd;
            private final AdvertisingOptions zze;

            {
                this.zza = this;
                this.zzb = str;
                this.zzc = str2;
                this.zzd = listenerHolderRegisterListener;
                this.zze = advertisingOptions;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                zzcn zzcnVar = this.zza;
                ((zzbf) obj).zzt(new zzcl(zzcnVar, (TaskCompletionSource) obj2), this.zzb, this.zzc, this.zzd, this.zze);
            }
        }).unregister(zzcc.zza).setMethodKey(1266).build());
    }

    @Override // com.google.android.gms.nearby.connection.ConnectionsClient
    public final Task<Void> startDiscovery(final String str, EndpointDiscoveryCallback endpointDiscoveryCallback, final DiscoveryOptions discoveryOptions) {
        final ListenerHolder listenerHolderZzb = this.zze.zzb(this, endpointDiscoveryCallback, "discovery");
        return this.zze.zze(this, RegistrationMethods.builder().withHolder(listenerHolderZzb).register(new RemoteCall(this, str, listenerHolderZzb, discoveryOptions) { // from class: com.google.android.gms.internal.nearby.zzcd
            private final zzcn zza;
            private final String zzb;
            private final ListenerHolder zzc;
            private final DiscoveryOptions zzd;

            {
                this.zza = this;
                this.zzb = str;
                this.zzc = listenerHolderZzb;
                this.zzd = discoveryOptions;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                zzcn zzcnVar = this.zza;
                ((zzbf) obj).zzv(new zzcl(zzcnVar, (TaskCompletionSource) obj2), this.zzb, this.zzc, this.zzd);
            }
        }).unregister(zzbg.zza).setMethodKey(1267).build()).addOnSuccessListener(new OnSuccessListener(this, discoveryOptions) { // from class: com.google.android.gms.internal.nearby.zzbh
            private final zzcn zza;
            private final DiscoveryOptions zzb;

            {
                this.zza = this;
                this.zzb = discoveryOptions;
            }

            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                this.zza.zzc(this.zzb, (Void) obj);
            }
        });
    }

    @Override // com.google.android.gms.nearby.connection.ConnectionsClient
    public final void stopAdvertising() {
        this.zze.zzg(this, "advertising");
    }

    @Override // com.google.android.gms.nearby.connection.ConnectionsClient
    public final void stopAllEndpoints() {
        this.zze.zzg(this, "advertising");
        this.zze.zzg(this, "discovery").addOnSuccessListener(new zzbi(this));
        zzi(zzbr.zza).addOnCompleteListener(new OnCompleteListener(this) { // from class: com.google.android.gms.internal.nearby.zzbs
            private final zzcn zza;

            {
                this.zza = this;
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.zza.zza(task);
            }
        });
    }

    @Override // com.google.android.gms.nearby.connection.ConnectionsClient
    public final void stopDiscovery() {
        this.zze.zzg(this, "discovery").addOnSuccessListener(new zzbi(this));
    }

    final /* synthetic */ void zza(Task task) {
        this.zze.zzg(this, "connection");
        disconnectService();
    }

    final /* synthetic */ void zzb(Void r1) {
        zzet zzetVar = this.zzf;
        if (zzetVar != null) {
            zzetVar.zzc();
        }
    }

    final /* synthetic */ void zzc(DiscoveryOptions discoveryOptions, Void r2) {
        if (discoveryOptions.zza()) {
            zzet zzetVar = this.zzf;
            if (zzetVar == null) {
                Log.d("NearbyConnections", "Discovery started with NFC requested, but there is no NfcDispatcher available. Discovery will continue over other mediums instead. To use NFC discovery, pass in an Activity when calling Nearby.getConnectionsClient().");
            } else {
                zzetVar.zzb();
            }
        }
    }

    public zzcn(Context context, ConnectionsOptions connectionsOptions) {
        super(context, zzd, (Api.ApiOptions) null, GoogleApi.Settings.DEFAULT_SETTINGS);
        this.zze = zzo.zza(this, null);
        this.zzf = null;
    }

    @Override // com.google.android.gms.nearby.connection.ConnectionsClient
    public final Task<Void> sendPayload(final List<String> list, final Payload payload) {
        return doWrite(TaskApiCall.builder().run(new RemoteCall(this, list, payload) { // from class: com.google.android.gms.internal.nearby.zzbn
            private final zzcn zza;
            private final List zzb;
            private final Payload zzc;

            {
                this.zza = this;
                this.zzb = list;
                this.zzc = payload;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws IOException, RemoteException {
                zzcn zzcnVar = this.zza;
                List list2 = this.zzb;
                ((zzbf) obj).zzA(new zzcl(zzcnVar, (TaskCompletionSource) obj2), (String[]) list2.toArray(new String[0]), this.zzc, false);
            }
        }).setMethodKey(1228).build());
    }

    @Override // com.google.android.gms.nearby.connection.ConnectionsClient
    public final Task<Void> requestConnection(final String str, final String str2, ConnectionLifecycleCallback connectionLifecycleCallback, final ConnectionOptions connectionOptions) {
        final ListenerHolder<L> listenerHolderRegisterListener = registerListener(new zzck(this, connectionLifecycleCallback), ConnectionLifecycleCallback.class.getName());
        zzf(str2);
        return doWrite(TaskApiCall.builder().setFeatures(com.google.android.gms.nearby.zza.zze).run(new RemoteCall(this, str, str2, listenerHolderRegisterListener, connectionOptions) { // from class: com.google.android.gms.internal.nearby.zzbq
            private final zzcn zza;
            private final String zzb;
            private final String zzc;
            private final ListenerHolder zzd;
            private final ConnectionOptions zze;

            {
                this.zza = this;
                this.zzb = str;
                this.zzc = str2;
                this.zzd = listenerHolderRegisterListener;
                this.zze = connectionOptions;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                zzcn zzcnVar = this.zza;
                ((zzbf) obj).zzp(new zzcl(zzcnVar, (TaskCompletionSource) obj2), this.zzb, this.zzc, this.zzd, this.zze);
            }
        }).setMethodKey(1226).build()).addOnFailureListener(new zzcf(this, str2));
    }

    @Override // com.google.android.gms.nearby.connection.ConnectionsClient
    public final Task<Void> startAdvertising(final byte[] bArr, final String str, ConnectionLifecycleCallback connectionLifecycleCallback, final AdvertisingOptions advertisingOptions) {
        final ListenerHolder<L> listenerHolderRegisterListener = registerListener(new zzck(this, connectionLifecycleCallback), ConnectionLifecycleCallback.class.getName());
        return this.zze.zze(this, RegistrationMethods.builder().withHolder(this.zze.zzb(this, new Object(), "advertising")).setFeatures(com.google.android.gms.nearby.zza.zze).register(new RemoteCall(this, bArr, str, listenerHolderRegisterListener, advertisingOptions) { // from class: com.google.android.gms.internal.nearby.zzby
            private final zzcn zza;
            private final byte[] zzb;
            private final String zzc;
            private final ListenerHolder zzd;
            private final AdvertisingOptions zze;

            {
                this.zza = this;
                this.zzb = bArr;
                this.zzc = str;
                this.zzd = listenerHolderRegisterListener;
                this.zze = advertisingOptions;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                zzcn zzcnVar = this.zza;
                ((zzbf) obj).zzr(new zzcl(zzcnVar, (TaskCompletionSource) obj2), this.zzb, this.zzc, this.zzd, this.zze);
            }
        }).unregister(zzbz.zza).setMethodKey(1266).build());
    }

    @Override // com.google.android.gms.nearby.connection.ConnectionsClient
    public final Task<Void> requestConnection(final byte[] bArr, final String str, ConnectionLifecycleCallback connectionLifecycleCallback) {
        final ListenerHolder<L> listenerHolderRegisterListener = registerListener(new zzck(this, connectionLifecycleCallback), ConnectionLifecycleCallback.class.getName());
        zzf(str);
        return doWrite(TaskApiCall.builder().setFeatures(com.google.android.gms.nearby.zza.zze).run(new RemoteCall(this, bArr, str, listenerHolderRegisterListener) { // from class: com.google.android.gms.internal.nearby.zzca
            private final zzcn zza;
            private final byte[] zzb;
            private final String zzc;
            private final ListenerHolder zzd;

            {
                this.zza = this;
                this.zzb = bArr;
                this.zzc = str;
                this.zzd = listenerHolderRegisterListener;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                zzcn zzcnVar = this.zza;
                ((zzbf) obj).zzs(new zzcl(zzcnVar, (TaskCompletionSource) obj2), this.zzb, this.zzc, this.zzd);
            }
        }).setMethodKey(1226).build()).addOnFailureListener(new zzch(this, str));
    }

    @Override // com.google.android.gms.nearby.connection.ConnectionsClient
    public final Task<Void> requestConnection(final byte[] bArr, final String str, ConnectionLifecycleCallback connectionLifecycleCallback, final ConnectionOptions connectionOptions) {
        final ListenerHolder<L> listenerHolderRegisterListener = registerListener(new zzck(this, connectionLifecycleCallback), ConnectionLifecycleCallback.class.getName());
        zzf(str);
        return doWrite(TaskApiCall.builder().setFeatures(com.google.android.gms.nearby.zza.zze).run(new RemoteCall(this, bArr, str, listenerHolderRegisterListener, connectionOptions) { // from class: com.google.android.gms.internal.nearby.zzbx
            private final zzcn zza;
            private final byte[] zzb;
            private final String zzc;
            private final ListenerHolder zzd;
            private final ConnectionOptions zze;

            {
                this.zza = this;
                this.zzb = bArr;
                this.zzc = str;
                this.zzd = listenerHolderRegisterListener;
                this.zze = connectionOptions;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                zzcn zzcnVar = this.zza;
                ((zzbf) obj).zzq(new zzcl(zzcnVar, (TaskCompletionSource) obj2), this.zzb, this.zzc, this.zzd, this.zze);
            }
        }).setMethodKey(1226).build()).addOnFailureListener(new zzcg(this, str));
    }
}
