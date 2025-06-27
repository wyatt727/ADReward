package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;

/* compiled from: com.android.billingclient:billing@@6.2.1 */
/* loaded from: classes3.dex */
public interface zzs extends IInterface {
    int zza(int i, String str, String str2) throws RemoteException;

    int zzc(int i, String str, String str2, Bundle bundle) throws RemoteException;

    Bundle zzd(int i, String str, String str2, Bundle bundle) throws RemoteException;

    Bundle zze(int i, String str, String str2, Bundle bundle) throws RemoteException;

    Bundle zzf(int i, String str, String str2, String str3, String str4) throws RemoteException;

    Bundle zzg(int i, String str, String str2, String str3, String str4, Bundle bundle) throws RemoteException;

    Bundle zzh(int i, String str, String str2, String str3, Bundle bundle) throws RemoteException;

    Bundle zzi(int i, String str, String str2, String str3) throws RemoteException;

    Bundle zzj(int i, String str, String str2, String str3, Bundle bundle) throws RemoteException;

    Bundle zzk(int i, String str, String str2, Bundle bundle) throws RemoteException;

    Bundle zzl(int i, String str, String str2, Bundle bundle, Bundle bundle2) throws RemoteException;

    void zzm(int i, String str, Bundle bundle, zzd zzdVar) throws RemoteException;

    void zzn(int i, String str, Bundle bundle, zzf zzfVar) throws RemoteException;

    void zzo(int i, String str, Bundle bundle, zzh zzhVar) throws RemoteException;

    void zzp(int i, String str, Bundle bundle, zzj zzjVar) throws RemoteException;

    void zzq(int i, String str, Bundle bundle, zzl zzlVar) throws RemoteException;

    void zzr(int i, String str, Bundle bundle, zzn zznVar) throws RemoteException;

    void zzs(int i, String str, Bundle bundle, zzp zzpVar) throws RemoteException;

    void zzt(int i, String str, Bundle bundle, zzu zzuVar) throws RemoteException;

    int zzy(int i, String str, String str2) throws RemoteException;
}
