package com.google.android.gms.internal.nearby;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import androidx.collection.ArraySet;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.nearby.Nearby;
import com.google.android.gms.nearby.connection.AdvertisingOptions;
import com.google.android.gms.nearby.connection.ConnectionLifecycleCallback;
import com.google.android.gms.nearby.connection.ConnectionOptions;
import com.google.android.gms.nearby.connection.Connections;
import com.google.android.gms.nearby.connection.ConnectionsOptions;
import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;
import com.google.android.gms.nearby.connection.DiscoveryOptions;
import com.google.android.gms.nearby.connection.EndpointDiscoveryCallback;
import com.google.android.gms.nearby.connection.Payload;
import com.google.android.gms.nearby.connection.PayloadCallback;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
public final class zzbf extends GmsClient<zzeh> {
    private final long zze;
    private final Set<zzap> zzf;
    private final Set<zzbb> zzg;
    private final Set<zzag> zzh;
    private zzfx zzi;

    public zzbf(Context context, Looper looper, ClientSettings clientSettings, ConnectionsOptions connectionsOptions, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 54, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.zzf = new ArraySet();
        this.zzg = new ArraySet();
        this.zzh = new ArraySet();
        this.zze = hashCode();
        zzgf.zzb(context.getCacheDir());
    }

    private final void zzF() {
        Iterator<zzap> it = this.zzf.iterator();
        while (it.hasNext()) {
            it.next().zze();
        }
        Iterator<zzbb> it2 = this.zzg.iterator();
        while (it2.hasNext()) {
            it2.next().zzd();
        }
        Iterator<zzag> it3 = this.zzh.iterator();
        while (it3.hasNext()) {
            it3.next().zzf();
        }
        this.zzf.clear();
        this.zzg.clear();
        this.zzh.clear();
        zzfx zzfxVar = this.zzi;
        if (zzfxVar != null) {
            zzfxVar.zzc();
            this.zzi = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Status zzG(int i) {
        return new Status(i, ConnectionsStatusCodes.getStatusCodeString(i));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final /* bridge */ /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
        return iInterfaceQueryLocalInterface instanceof zzeh ? (zzeh) iInterfaceQueryLocalInterface : new zzeh(iBinder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final void disconnect() {
        if (isConnected()) {
            try {
                ((zzeh) getService()).zzn(new zzx());
            } catch (RemoteException e) {
                Log.w("NearbyConnectionsClient", "Failed to notify client disconnect.", e);
            }
        }
        zzF();
        super.disconnect();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] getApiFeatures() {
        return new Feature[]{com.google.android.gms.nearby.zza.zze, com.google.android.gms.nearby.zza.zzr};
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle = new Bundle();
        bundle.putLong("clientId", this.zze);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.nearby.internal.connection.INearbyConnectionService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String getStartServiceAction() {
        return "com.google.android.gms.nearby.connection.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final /* bridge */ /* synthetic */ void onConnectedLocked(IInterface iInterface) {
        super.onConnectedLocked((zzeh) iInterface);
        this.zzi = new zzfx();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final void onConnectionSuspended(int i) {
        if (i == 1) {
            zzF();
            i = 1;
        }
        super.onConnectionSuspended(i);
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
    public final void zzA(BaseImplementation.ResultHolder<Status> resultHolder, String[] strArr, Payload payload, boolean z) throws IOException, RemoteException {
        Pair pairCreate;
        try {
            int type = payload.getType();
            if (type == 1) {
                zzgc zzgcVar = new zzgc();
                zzgcVar.zza(payload.getId());
                zzgcVar.zzb(payload.getType());
                zzgcVar.zzc(payload.asBytes());
                pairCreate = Pair.create(zzgcVar.zzj(), zzhy.zzc());
            } else if (type == 2) {
                Payload.File fileAsFile = payload.asFile();
                zzhz.zza(fileAsFile, "File cannot be null for Payload.Type.FILE");
                File fileAsJavaFile = fileAsFile.asJavaFile();
                String absolutePath = fileAsJavaFile == null ? null : fileAsJavaFile.getAbsolutePath();
                zzgc zzgcVar2 = new zzgc();
                zzgcVar2.zza(payload.getId());
                zzgcVar2.zzb(payload.getType());
                zzgcVar2.zzd(fileAsFile.asParcelFileDescriptor());
                zzgcVar2.zze(absolutePath);
                zzgcVar2.zzf(fileAsFile.getSize());
                zzgcVar2.zzh(payload.getOffset());
                zzgcVar2.zzi(payload.zzd());
                pairCreate = Pair.create(zzgcVar2.zzj(), zzhy.zzc());
            } else {
                if (type != 3) {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(String.format("Outgoing Payload %d has unknown type %d", Long.valueOf(payload.getId()), Integer.valueOf(payload.getType())));
                    Log.wtf("NearbyConnections", "Unknown payload type!", illegalArgumentException);
                    throw illegalArgumentException;
                }
                try {
                    ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
                    ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe2 = ParcelFileDescriptor.createPipe();
                    zzgc zzgcVar3 = new zzgc();
                    zzgcVar3.zza(payload.getId());
                    zzgcVar3.zzb(payload.getType());
                    zzgcVar3.zzd(parcelFileDescriptorArrCreatePipe[0]);
                    zzgcVar3.zzg(parcelFileDescriptorArrCreatePipe2[0]);
                    zzgcVar3.zzh(payload.getOffset());
                    pairCreate = Pair.create(zzgcVar3.zzj(), zzhy.zzd(Pair.create(parcelFileDescriptorArrCreatePipe[1], parcelFileDescriptorArrCreatePipe2[1])));
                } catch (IOException e) {
                    Log.e("NearbyConnections", String.format("Unable to create PFD pipe for streaming payload %d from client to service.", Long.valueOf(payload.getId())), e);
                    throw e;
                }
            }
            zzeh zzehVar = (zzeh) getService();
            zzgp zzgpVar = new zzgp();
            zzgpVar.zza(new zzbc(resultHolder));
            zzgpVar.zzb(strArr);
            zzgpVar.zzc((zzgd) pairCreate.first);
            zzehVar.zzk(zzgpVar.zzd());
            if (((zzhy) pairCreate.second).zza()) {
                Pair pair = (Pair) ((zzhy) pairCreate.second).zzb();
                this.zzi.zza(payload.asStream().asInputStream(), new ParcelFileDescriptor.AutoCloseOutputStream((ParcelFileDescriptor) pair.first), new ParcelFileDescriptor.AutoCloseOutputStream((ParcelFileDescriptor) pair.second), (zzgd) pairCreate.first, payload.getId());
            }
        } catch (IOException e2) {
            Log.w("NearbyConnectionsClient", "Failed to create a Parcelable Payload.", e2);
            resultHolder.setResult(zzG(ConnectionsStatusCodes.STATUS_PAYLOAD_IO_ERROR));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzB(BaseImplementation.ResultHolder<Status> resultHolder, long j) throws RemoteException {
        zzeh zzehVar = (zzeh) getService();
        zzu zzuVar = new zzu();
        zzuVar.zza(new zzbc(resultHolder));
        zzuVar.zzb(j);
        zzehVar.zzo(zzuVar.zzc());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzC(String str) throws RemoteException {
        zzeh zzehVar = (zzeh) getService();
        zzdo zzdoVar = new zzdo();
        zzdoVar.zza(str);
        zzehVar.zzl(zzdoVar.zzb());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzD() throws RemoteException {
        ((zzeh) getService()).zzm(new zzhc());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzp(BaseImplementation.ResultHolder<Status> resultHolder, String str, String str2, ListenerHolder<ConnectionLifecycleCallback> listenerHolder, ConnectionOptions connectionOptions) throws RemoteException {
        zzag zzagVar = new zzag(listenerHolder);
        this.zzh.add(zzagVar);
        zzeh zzehVar = (zzeh) getService();
        zzgl zzglVar = new zzgl();
        zzglVar.zza(new zzbc(resultHolder));
        zzglVar.zzd(str);
        zzglVar.zze(str2);
        zzglVar.zzg(zzagVar);
        zzglVar.zzi(connectionOptions);
        zzehVar.zzh(zzglVar.zzj());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzq(BaseImplementation.ResultHolder<Status> resultHolder, byte[] bArr, String str, ListenerHolder<ConnectionLifecycleCallback> listenerHolder, ConnectionOptions connectionOptions) throws RemoteException {
        zzag zzagVar = new zzag(listenerHolder);
        this.zzh.add(zzagVar);
        zzeh zzehVar = (zzeh) getService();
        zzgl zzglVar = new zzgl();
        zzglVar.zza(new zzbc(resultHolder));
        zzglVar.zzh(bArr);
        zzglVar.zze(str);
        zzglVar.zzg(zzagVar);
        zzglVar.zzi(connectionOptions);
        zzehVar.zzh(zzglVar.zzj());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzr(BaseImplementation.ResultHolder<Connections.StartAdvertisingResult> resultHolder, byte[] bArr, String str, ListenerHolder<ConnectionLifecycleCallback> listenerHolder, AdvertisingOptions advertisingOptions) throws RemoteException {
        zzag zzagVar = new zzag(listenerHolder);
        this.zzh.add(zzagVar);
        zzeh zzehVar = (zzeh) getService();
        zzgt zzgtVar = new zzgt();
        zzgtVar.zza(new zzbe(resultHolder));
        zzgtVar.zzh(bArr);
        zzgtVar.zzd(str);
        zzgtVar.zzf(advertisingOptions);
        zzgtVar.zzg(zzagVar);
        zzehVar.zzd(zzgtVar.zzi());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzs(BaseImplementation.ResultHolder<Status> resultHolder, byte[] bArr, String str, ListenerHolder<ConnectionLifecycleCallback> listenerHolder) throws RemoteException {
        zzag zzagVar = new zzag(listenerHolder);
        this.zzh.add(zzagVar);
        zzeh zzehVar = (zzeh) getService();
        zzgl zzglVar = new zzgl();
        zzglVar.zza(new zzbc(resultHolder));
        zzglVar.zzh(bArr);
        zzglVar.zze(str);
        zzglVar.zzg(zzagVar);
        zzehVar.zzh(zzglVar.zzj());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzt(BaseImplementation.ResultHolder<Connections.StartAdvertisingResult> resultHolder, String str, String str2, ListenerHolder<ConnectionLifecycleCallback> listenerHolder, AdvertisingOptions advertisingOptions) throws RemoteException {
        zzag zzagVar = new zzag(listenerHolder);
        this.zzh.add(zzagVar);
        zzeh zzehVar = (zzeh) getService();
        zzgt zzgtVar = new zzgt();
        zzgtVar.zza(new zzbe(resultHolder));
        zzgtVar.zzc(str);
        zzgtVar.zzd(str2);
        zzgtVar.zzf(advertisingOptions);
        zzgtVar.zzg(zzagVar);
        zzehVar.zzd(zzgtVar.zzi());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzu() throws RemoteException {
        ((zzeh) getService()).zze(new zzha());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzv(BaseImplementation.ResultHolder<Status> resultHolder, String str, ListenerHolder<EndpointDiscoveryCallback> listenerHolder, DiscoveryOptions discoveryOptions) throws RemoteException {
        zzap zzapVar = new zzap(listenerHolder);
        this.zzf.add(zzapVar);
        zzeh zzehVar = (zzeh) getService();
        zzgx zzgxVar = new zzgx();
        zzgxVar.zza(new zzbc(resultHolder));
        zzgxVar.zzb(str);
        zzgxVar.zzd(discoveryOptions);
        zzgxVar.zze(zzapVar);
        zzehVar.zzf(zzgxVar.zzf());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzw() throws RemoteException {
        ((zzeh) getService()).zzg(new zzhe());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzx(BaseImplementation.ResultHolder<Status> resultHolder, String str, String str2, ListenerHolder<ConnectionLifecycleCallback> listenerHolder) throws RemoteException {
        zzag zzagVar = new zzag(listenerHolder);
        this.zzh.add(zzagVar);
        zzeh zzehVar = (zzeh) getService();
        zzgl zzglVar = new zzgl();
        zzglVar.zza(new zzbc(resultHolder));
        zzglVar.zzd(str);
        zzglVar.zze(str2);
        zzglVar.zzg(zzagVar);
        zzehVar.zzh(zzglVar.zzj());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzy(BaseImplementation.ResultHolder<Status> resultHolder, String str, ListenerHolder<PayloadCallback> listenerHolder) throws RemoteException {
        zzbb zzbbVar = new zzbb(getContext(), listenerHolder, this.zzi);
        this.zzg.add(zzbbVar);
        zzeh zzehVar = (zzeh) getService();
        zzq zzqVar = new zzq();
        zzqVar.zza(new zzbc(resultHolder));
        zzqVar.zzc(str);
        zzqVar.zze(zzbbVar);
        zzehVar.zzi(zzqVar.zzf());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzz(BaseImplementation.ResultHolder<Status> resultHolder, String str) throws RemoteException {
        zzeh zzehVar = (zzeh) getService();
        zzgh zzghVar = new zzgh();
        zzghVar.zza(new zzbc(resultHolder));
        zzghVar.zzb(str);
        zzehVar.zzj(zzghVar.zzc());
    }
}
