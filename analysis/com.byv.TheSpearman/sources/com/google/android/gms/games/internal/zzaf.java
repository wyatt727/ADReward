package com.google.android.gms.games.internal;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.games.GamesStatusCodes;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.snapshot.SnapshotMetadataChangeEntity;
import com.json.mediationsdk.utils.IronSourceConstants;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzaf extends com.google.android.gms.internal.games.zzb implements zzac {
    zzaf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.games.internal.IGamesService");
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final void zza(long j) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeLong(j);
        zzb(5001, parcelZza);
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final void zza(zzy zzyVar) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.games.zzd.zza(parcelZza, zzyVar);
        zzb(5002, parcelZza);
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final String zzbe() throws RemoteException {
        Parcel parcelZza = zza(IronSourceConstants.errorCode_loadInProgress, zza());
        String string = parcelZza.readString();
        parcelZza.recycle();
        return string;
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final Bundle getConnectionHint() throws RemoteException {
        Parcel parcelZza = zza(IronSourceConstants.errorCode_showInProgress, zza());
        Bundle bundle = (Bundle) com.google.android.gms.internal.games.zzd.zza(parcelZza, Bundle.CREATOR);
        parcelZza.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final void zza(IBinder iBinder, Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeStrongBinder(iBinder);
        com.google.android.gms.internal.games.zzd.zza(parcelZza, bundle);
        zzb(IronSourceConstants.errorCode_loadException, parcelZza);
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final void zzbd() throws RemoteException {
        zzb(IronSourceConstants.errorCode_showFailed, zza());
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final String zzai() throws RemoteException {
        Parcel parcelZza = zza(IronSourceConstants.errorCode_initSuccess, zza());
        String string = parcelZza.readString();
        parcelZza.recycle();
        return string;
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final String zzbf() throws RemoteException {
        Parcel parcelZza = zza(5012, zza());
        String string = parcelZza.readString();
        parcelZza.recycle();
        return string;
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final DataHolder zzbg() throws RemoteException {
        Parcel parcelZza = zza(5013, zza());
        DataHolder dataHolder = (DataHolder) com.google.android.gms.internal.games.zzd.zza(parcelZza, DataHolder.CREATOR);
        parcelZza.recycle();
        return dataHolder;
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final void zza(zzy zzyVar, int i, boolean z, boolean z2) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.games.zzd.zza(parcelZza, zzyVar);
        parcelZza.writeInt(i);
        com.google.android.gms.internal.games.zzd.writeBoolean(parcelZza, z);
        com.google.android.gms.internal.games.zzd.writeBoolean(parcelZza, z2);
        zzb(5015, parcelZza);
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final void zza(zzy zzyVar, String str, int i, int i2, int i3, boolean z) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.games.zzd.zza(parcelZza, zzyVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(i);
        parcelZza.writeInt(i2);
        parcelZza.writeInt(i3);
        com.google.android.gms.internal.games.zzd.writeBoolean(parcelZza, z);
        zzb(5019, parcelZza);
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final void zzb(zzy zzyVar, String str, int i, int i2, int i3, boolean z) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.games.zzd.zza(parcelZza, zzyVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(i);
        parcelZza.writeInt(i2);
        parcelZza.writeInt(i3);
        com.google.android.gms.internal.games.zzd.writeBoolean(parcelZza, z);
        zzb(5020, parcelZza);
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final void zza(zzy zzyVar, Bundle bundle, int i, int i2) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.games.zzd.zza(parcelZza, zzyVar);
        com.google.android.gms.internal.games.zzd.zza(parcelZza, bundle);
        parcelZza.writeInt(i);
        parcelZza.writeInt(i2);
        zzb(5021, parcelZza);
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final void zza(zzy zzyVar, String str, IBinder iBinder, Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.games.zzd.zza(parcelZza, zzyVar);
        parcelZza.writeString(str);
        parcelZza.writeStrongBinder(iBinder);
        com.google.android.gms.internal.games.zzd.zza(parcelZza, bundle);
        zzb(5023, parcelZza);
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final void zzb(zzy zzyVar, String str, IBinder iBinder, Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.games.zzd.zza(parcelZza, zzyVar);
        parcelZza.writeString(str);
        parcelZza.writeStrongBinder(iBinder);
        com.google.android.gms.internal.games.zzd.zza(parcelZza, bundle);
        zzb(5024, parcelZza);
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final void zza(zzy zzyVar, String str, int i, IBinder iBinder, Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.games.zzd.zza(parcelZza, zzyVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(i);
        parcelZza.writeStrongBinder(iBinder);
        com.google.android.gms.internal.games.zzd.zza(parcelZza, bundle);
        zzb(5025, parcelZza);
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final void zzb(zzy zzyVar) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.games.zzd.zza(parcelZza, zzyVar);
        zzb(5026, parcelZza);
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final DataHolder zzbh() throws RemoteException {
        Parcel parcelZza = zza(5502, zza());
        DataHolder dataHolder = (DataHolder) com.google.android.gms.internal.games.zzd.zza(parcelZza, DataHolder.CREATOR);
        parcelZza.recycle();
        return dataHolder;
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final void zza(zzy zzyVar, boolean z) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.games.zzd.zza(parcelZza, zzyVar);
        com.google.android.gms.internal.games.zzd.writeBoolean(parcelZza, z);
        zzb(6001, parcelZza);
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final void zzb(zzy zzyVar, boolean z) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.games.zzd.zza(parcelZza, zzyVar);
        com.google.android.gms.internal.games.zzd.writeBoolean(parcelZza, z);
        zzb(GamesStatusCodes.STATUS_MATCH_ERROR_OUT_OF_DATE_VERSION, parcelZza);
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final void zza(zzy zzyVar, String str, boolean z) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.games.zzd.zza(parcelZza, zzyVar);
        parcelZza.writeString(str);
        com.google.android.gms.internal.games.zzd.writeBoolean(parcelZza, z);
        zzb(GamesStatusCodes.STATUS_MATCH_ERROR_INVALID_MATCH_RESULTS, parcelZza);
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final void zza(zzy zzyVar, String str, long j, String str2) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.games.zzd.zza(parcelZza, zzyVar);
        parcelZza.writeString(str);
        parcelZza.writeLong(j);
        parcelZza.writeString(str2);
        zzb(7002, parcelZza);
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final void zzb(zzy zzyVar, String str, int i, IBinder iBinder, Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.games.zzd.zza(parcelZza, zzyVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(i);
        parcelZza.writeStrongBinder(iBinder);
        com.google.android.gms.internal.games.zzd.zza(parcelZza, bundle);
        zzb(7003, parcelZza);
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final void zza(zzy zzyVar, String str, String str2, int i, int i2) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.games.zzd.zza(parcelZza, zzyVar);
        parcelZza.writeString(null);
        parcelZza.writeString(str2);
        parcelZza.writeInt(i);
        parcelZza.writeInt(i2);
        zzb(8001, parcelZza);
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final void zzc(zzy zzyVar, boolean z) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.games.zzd.zza(parcelZza, zzyVar);
        com.google.android.gms.internal.games.zzd.writeBoolean(parcelZza, z);
        zzb(8027, parcelZza);
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final Intent zzao() throws RemoteException {
        Parcel parcelZza = zza(GamesStatusCodes.STATUS_VIDEO_STORAGE_ERROR, zza());
        Intent intent = (Intent) com.google.android.gms.internal.games.zzd.zza(parcelZza, Intent.CREATOR);
        parcelZza.recycle();
        return intent;
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final Intent zzaq() throws RemoteException {
        Parcel parcelZza = zza(9005, zza());
        Intent intent = (Intent) com.google.android.gms.internal.games.zzd.zza(parcelZza, Intent.CREATOR);
        parcelZza.recycle();
        return intent;
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final Intent zzar() throws RemoteException {
        Parcel parcelZza = zza(9010, zza());
        Intent intent = (Intent) com.google.android.gms.internal.games.zzd.zza(parcelZza, Intent.CREATOR);
        parcelZza.recycle();
        return intent;
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final Intent zzbi() throws RemoteException {
        Parcel parcelZza = zza(9012, zza());
        Intent intent = (Intent) com.google.android.gms.internal.games.zzd.zza(parcelZza, Intent.CREATOR);
        parcelZza.recycle();
        return intent;
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final void zza(zzy zzyVar, String str, int i, boolean z, boolean z2) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.games.zzd.zza(parcelZza, zzyVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(i);
        com.google.android.gms.internal.games.zzd.writeBoolean(parcelZza, z);
        com.google.android.gms.internal.games.zzd.writeBoolean(parcelZza, z2);
        zzb(9020, parcelZza);
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final Intent zza(String str, boolean z, boolean z2, int i) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        com.google.android.gms.internal.games.zzd.writeBoolean(parcelZza, z);
        com.google.android.gms.internal.games.zzd.writeBoolean(parcelZza, z2);
        parcelZza.writeInt(i);
        Parcel parcelZza2 = zza(12001, parcelZza);
        Intent intent = (Intent) com.google.android.gms.internal.games.zzd.zza(parcelZza2, Intent.CREATOR);
        parcelZza2.recycle();
        return intent;
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final void zzd(zzy zzyVar, boolean z) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.games.zzd.zza(parcelZza, zzyVar);
        com.google.android.gms.internal.games.zzd.writeBoolean(parcelZza, z);
        zzb(12002, parcelZza);
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final void zza(zzy zzyVar, String str, SnapshotMetadataChangeEntity snapshotMetadataChangeEntity, Contents contents) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.games.zzd.zza(parcelZza, zzyVar);
        parcelZza.writeString(str);
        com.google.android.gms.internal.games.zzd.zza(parcelZza, snapshotMetadataChangeEntity);
        com.google.android.gms.internal.games.zzd.zza(parcelZza, contents);
        zzb(12007, parcelZza);
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final void zza(Contents contents) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.games.zzd.zza(parcelZza, contents);
        zzb(12019, parcelZza);
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final void zza(zzy zzyVar, String str) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.games.zzd.zza(parcelZza, zzyVar);
        parcelZza.writeString(str);
        zzb(12020, parcelZza);
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final void zza(zzy zzyVar, String str, String str2, SnapshotMetadataChangeEntity snapshotMetadataChangeEntity, Contents contents) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.games.zzd.zza(parcelZza, zzyVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        com.google.android.gms.internal.games.zzd.zza(parcelZza, snapshotMetadataChangeEntity);
        com.google.android.gms.internal.games.zzd.zza(parcelZza, contents);
        zzb(12033, parcelZza);
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final int zzat() throws RemoteException {
        Parcel parcelZza = zza(12035, zza());
        int i = parcelZza.readInt();
        parcelZza.recycle();
        return i;
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final int zzav() throws RemoteException {
        Parcel parcelZza = zza(12036, zza());
        int i = parcelZza.readInt();
        parcelZza.recycle();
        return i;
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final void zze(zzy zzyVar, boolean z) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.games.zzd.zza(parcelZza, zzyVar);
        com.google.android.gms.internal.games.zzd.writeBoolean(parcelZza, z);
        zzb(12016, parcelZza);
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final void zza(zzy zzyVar, boolean z, String[] strArr) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.games.zzd.zza(parcelZza, zzyVar);
        com.google.android.gms.internal.games.zzd.writeBoolean(parcelZza, z);
        parcelZza.writeStringArray(strArr);
        zzb(12031, parcelZza);
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final void zzb(String str, int i) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeInt(i);
        zzb(12017, parcelZza);
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final void zzb(zzy zzyVar, String str, boolean z) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.games.zzd.zza(parcelZza, zzyVar);
        parcelZza.writeString(str);
        com.google.android.gms.internal.games.zzd.writeBoolean(parcelZza, z);
        zzb(13006, parcelZza);
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final void zza(zzy zzyVar, String str, boolean z, int i) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.games.zzd.zza(parcelZza, zzyVar);
        parcelZza.writeString(str);
        com.google.android.gms.internal.games.zzd.writeBoolean(parcelZza, z);
        parcelZza.writeInt(i);
        zzb(15001, parcelZza);
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final void zza(zzaa zzaaVar, long j) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.games.zzd.zza(parcelZza, zzaaVar);
        parcelZza.writeLong(j);
        zzb(15501, parcelZza);
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final Intent zza(PlayerEntity playerEntity) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.games.zzd.zza(parcelZza, playerEntity);
        Parcel parcelZza2 = zza(15503, parcelZza);
        Intent intent = (Intent) com.google.android.gms.internal.games.zzd.zza(parcelZza2, Intent.CREATOR);
        parcelZza2.recycle();
        return intent;
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final void zzf(zzy zzyVar, boolean z) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.games.zzd.zza(parcelZza, zzyVar);
        com.google.android.gms.internal.games.zzd.writeBoolean(parcelZza, z);
        zzb(17001, parcelZza);
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final Intent zzb(String str, int i, int i2) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeInt(i);
        parcelZza.writeInt(i2);
        Parcel parcelZza2 = zza(18001, parcelZza);
        Intent intent = (Intent) com.google.android.gms.internal.games.zzd.zza(parcelZza2, Intent.CREATOR);
        parcelZza2.recycle();
        return intent;
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final Intent zzbj() throws RemoteException {
        Parcel parcelZza = zza(19002, zza());
        Intent intent = (Intent) com.google.android.gms.internal.games.zzd.zza(parcelZza, Intent.CREATOR);
        parcelZza.recycle();
        return intent;
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final void zzc(zzy zzyVar) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.games.zzd.zza(parcelZza, zzyVar);
        zzb(21007, parcelZza);
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final void zza(zzy zzyVar, int i) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.games.zzd.zza(parcelZza, zzyVar);
        parcelZza.writeInt(i);
        zzb(22016, parcelZza);
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final void zza(zzy zzyVar, long j) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.games.zzd.zza(parcelZza, zzyVar);
        parcelZza.writeLong(j);
        zzb(22026, parcelZza);
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final void zzb(long j) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeLong(j);
        zzb(22027, parcelZza);
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final void zzd(zzy zzyVar) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.games.zzd.zza(parcelZza, zzyVar);
        zzb(22028, parcelZza);
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final boolean zzaz() throws RemoteException {
        Parcel parcelZza = zza(22030, zza());
        boolean zZza = com.google.android.gms.internal.games.zzd.zza(parcelZza);
        parcelZza.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final PendingIntent zzbk() throws RemoteException {
        Parcel parcelZza = zza(25015, zza());
        PendingIntent pendingIntent = (PendingIntent) com.google.android.gms.internal.games.zzd.zza(parcelZza, PendingIntent.CREATOR);
        parcelZza.recycle();
        return pendingIntent;
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final Intent zza(String str, String str2, String str3) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        parcelZza.writeString(str3);
        Parcel parcelZza2 = zza(25016, parcelZza);
        Intent intent = (Intent) com.google.android.gms.internal.games.zzd.zza(parcelZza2, Intent.CREATOR);
        parcelZza2.recycle();
        return intent;
    }
}
