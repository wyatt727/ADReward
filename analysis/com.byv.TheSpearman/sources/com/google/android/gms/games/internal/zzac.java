package com.google.android.gms.games.internal;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.snapshot.SnapshotMetadataChangeEntity;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes2.dex */
public interface zzac extends IInterface {
    Bundle getConnectionHint() throws RemoteException;

    Intent zza(PlayerEntity playerEntity) throws RemoteException;

    Intent zza(String str, String str2, String str3) throws RemoteException;

    Intent zza(String str, boolean z, boolean z2, int i) throws RemoteException;

    void zza(long j) throws RemoteException;

    void zza(IBinder iBinder, Bundle bundle) throws RemoteException;

    void zza(Contents contents) throws RemoteException;

    void zza(zzaa zzaaVar, long j) throws RemoteException;

    void zza(zzy zzyVar) throws RemoteException;

    void zza(zzy zzyVar, int i) throws RemoteException;

    void zza(zzy zzyVar, int i, boolean z, boolean z2) throws RemoteException;

    void zza(zzy zzyVar, long j) throws RemoteException;

    void zza(zzy zzyVar, Bundle bundle, int i, int i2) throws RemoteException;

    void zza(zzy zzyVar, String str) throws RemoteException;

    void zza(zzy zzyVar, String str, int i, int i2, int i3, boolean z) throws RemoteException;

    void zza(zzy zzyVar, String str, int i, IBinder iBinder, Bundle bundle) throws RemoteException;

    void zza(zzy zzyVar, String str, int i, boolean z, boolean z2) throws RemoteException;

    void zza(zzy zzyVar, String str, long j, String str2) throws RemoteException;

    void zza(zzy zzyVar, String str, IBinder iBinder, Bundle bundle) throws RemoteException;

    void zza(zzy zzyVar, String str, SnapshotMetadataChangeEntity snapshotMetadataChangeEntity, Contents contents) throws RemoteException;

    void zza(zzy zzyVar, String str, String str2, int i, int i2) throws RemoteException;

    void zza(zzy zzyVar, String str, String str2, SnapshotMetadataChangeEntity snapshotMetadataChangeEntity, Contents contents) throws RemoteException;

    void zza(zzy zzyVar, String str, boolean z) throws RemoteException;

    void zza(zzy zzyVar, String str, boolean z, int i) throws RemoteException;

    void zza(zzy zzyVar, boolean z) throws RemoteException;

    void zza(zzy zzyVar, boolean z, String[] strArr) throws RemoteException;

    String zzai() throws RemoteException;

    Intent zzao() throws RemoteException;

    Intent zzaq() throws RemoteException;

    Intent zzar() throws RemoteException;

    int zzat() throws RemoteException;

    int zzav() throws RemoteException;

    boolean zzaz() throws RemoteException;

    Intent zzb(String str, int i, int i2) throws RemoteException;

    void zzb(long j) throws RemoteException;

    void zzb(zzy zzyVar) throws RemoteException;

    void zzb(zzy zzyVar, String str, int i, int i2, int i3, boolean z) throws RemoteException;

    void zzb(zzy zzyVar, String str, int i, IBinder iBinder, Bundle bundle) throws RemoteException;

    void zzb(zzy zzyVar, String str, IBinder iBinder, Bundle bundle) throws RemoteException;

    void zzb(zzy zzyVar, String str, boolean z) throws RemoteException;

    void zzb(zzy zzyVar, boolean z) throws RemoteException;

    void zzb(String str, int i) throws RemoteException;

    void zzbd() throws RemoteException;

    String zzbe() throws RemoteException;

    String zzbf() throws RemoteException;

    DataHolder zzbg() throws RemoteException;

    DataHolder zzbh() throws RemoteException;

    Intent zzbi() throws RemoteException;

    Intent zzbj() throws RemoteException;

    PendingIntent zzbk() throws RemoteException;

    void zzc(zzy zzyVar) throws RemoteException;

    void zzc(zzy zzyVar, boolean z) throws RemoteException;

    void zzd(zzy zzyVar) throws RemoteException;

    void zzd(zzy zzyVar, boolean z) throws RemoteException;

    void zze(zzy zzyVar, boolean z) throws RemoteException;

    void zzf(zzy zzyVar, boolean z) throws RemoteException;
}
