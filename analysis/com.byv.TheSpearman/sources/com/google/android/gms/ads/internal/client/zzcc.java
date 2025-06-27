package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzazo;
import com.google.android.gms.internal.ads.zzazq;
import com.google.android.gms.internal.ads.zzbhh;
import com.google.android.gms.internal.ads.zzbhi;
import com.google.android.gms.internal.ads.zzbhn;
import com.google.android.gms.internal.ads.zzbho;
import com.google.android.gms.internal.ads.zzblx;
import com.google.android.gms.internal.ads.zzblz;
import com.google.android.gms.internal.ads.zzbma;
import com.google.android.gms.internal.ads.zzbqo;
import com.google.android.gms.internal.ads.zzbuh;
import com.google.android.gms.internal.ads.zzbui;
import com.google.android.gms.internal.ads.zzbuo;
import com.google.android.gms.internal.ads.zzbup;
import com.google.android.gms.internal.ads.zzbxt;
import com.google.android.gms.internal.ads.zzbyi;
import com.google.android.gms.internal.ads.zzbyj;
import com.google.android.gms.internal.ads.zzcao;
import com.google.android.gms.internal.ads.zzcap;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes2.dex */
public final class zzcc extends zzazo implements zzce {
    zzcc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbq zzb(IObjectWrapper iObjectWrapper, String str, zzbqo zzbqoVar, int i) throws RemoteException {
        zzbq zzboVar;
        Parcel parcelZza = zza();
        zzazq.zzf(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        zzazq.zzf(parcelZza, zzbqoVar);
        parcelZza.writeInt(241199000);
        Parcel parcelZzdb = zzdb(3, parcelZza);
        IBinder strongBinder = parcelZzdb.readStrongBinder();
        if (strongBinder == null) {
            zzboVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            zzboVar = iInterfaceQueryLocalInterface instanceof zzbq ? (zzbq) iInterfaceQueryLocalInterface : new zzbo(strongBinder);
        }
        parcelZzdb.recycle();
        return zzboVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzc(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, zzbqo zzbqoVar, int i) throws RemoteException {
        zzbu zzbsVar;
        Parcel parcelZza = zza();
        zzazq.zzf(parcelZza, iObjectWrapper);
        zzazq.zzd(parcelZza, zzqVar);
        parcelZza.writeString(str);
        zzazq.zzf(parcelZza, zzbqoVar);
        parcelZza.writeInt(241199000);
        Parcel parcelZzdb = zzdb(13, parcelZza);
        IBinder strongBinder = parcelZzdb.readStrongBinder();
        if (strongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbsVar = iInterfaceQueryLocalInterface instanceof zzbu ? (zzbu) iInterfaceQueryLocalInterface : new zzbs(strongBinder);
        }
        parcelZzdb.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzd(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, zzbqo zzbqoVar, int i) throws RemoteException {
        zzbu zzbsVar;
        Parcel parcelZza = zza();
        zzazq.zzf(parcelZza, iObjectWrapper);
        zzazq.zzd(parcelZza, zzqVar);
        parcelZza.writeString(str);
        zzazq.zzf(parcelZza, zzbqoVar);
        parcelZza.writeInt(241199000);
        Parcel parcelZzdb = zzdb(1, parcelZza);
        IBinder strongBinder = parcelZzdb.readStrongBinder();
        if (strongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbsVar = iInterfaceQueryLocalInterface instanceof zzbu ? (zzbu) iInterfaceQueryLocalInterface : new zzbs(strongBinder);
        }
        parcelZzdb.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zze(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, zzbqo zzbqoVar, int i) throws RemoteException {
        zzbu zzbsVar;
        Parcel parcelZza = zza();
        zzazq.zzf(parcelZza, iObjectWrapper);
        zzazq.zzd(parcelZza, zzqVar);
        parcelZza.writeString(str);
        zzazq.zzf(parcelZza, zzbqoVar);
        parcelZza.writeInt(241199000);
        Parcel parcelZzdb = zzdb(2, parcelZza);
        IBinder strongBinder = parcelZzdb.readStrongBinder();
        if (strongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbsVar = iInterfaceQueryLocalInterface instanceof zzbu ? (zzbu) iInterfaceQueryLocalInterface : new zzbs(strongBinder);
        }
        parcelZzdb.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzf(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, int i) throws RemoteException {
        zzbu zzbsVar;
        Parcel parcelZza = zza();
        zzazq.zzf(parcelZza, iObjectWrapper);
        zzazq.zzd(parcelZza, zzqVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(241199000);
        Parcel parcelZzdb = zzdb(10, parcelZza);
        IBinder strongBinder = parcelZzdb.readStrongBinder();
        if (strongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbsVar = iInterfaceQueryLocalInterface instanceof zzbu ? (zzbu) iInterfaceQueryLocalInterface : new zzbs(strongBinder);
        }
        parcelZzdb.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzco zzg(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        zzco zzcmVar;
        Parcel parcelZza = zza();
        zzazq.zzf(parcelZza, iObjectWrapper);
        parcelZza.writeInt(241199000);
        Parcel parcelZzdb = zzdb(9, parcelZza);
        IBinder strongBinder = parcelZzdb.readStrongBinder();
        if (strongBinder == null) {
            zzcmVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            zzcmVar = iInterfaceQueryLocalInterface instanceof zzco ? (zzco) iInterfaceQueryLocalInterface : new zzcm(strongBinder);
        }
        parcelZzdb.recycle();
        return zzcmVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzdj zzh(IObjectWrapper iObjectWrapper, zzbqo zzbqoVar, int i) throws RemoteException {
        zzdj zzdhVar;
        Parcel parcelZza = zza();
        zzazq.zzf(parcelZza, iObjectWrapper);
        zzazq.zzf(parcelZza, zzbqoVar);
        parcelZza.writeInt(241199000);
        Parcel parcelZzdb = zzdb(17, parcelZza);
        IBinder strongBinder = parcelZzdb.readStrongBinder();
        if (strongBinder == null) {
            zzdhVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            zzdhVar = iInterfaceQueryLocalInterface instanceof zzdj ? (zzdj) iInterfaceQueryLocalInterface : new zzdh(strongBinder);
        }
        parcelZzdb.recycle();
        return zzdhVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbhi zzi(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzf(parcelZza, iObjectWrapper);
        zzazq.zzf(parcelZza, iObjectWrapper2);
        Parcel parcelZzdb = zzdb(5, parcelZza);
        zzbhi zzbhiVarZzdA = zzbhh.zzdA(parcelZzdb.readStrongBinder());
        parcelZzdb.recycle();
        return zzbhiVarZzdA;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbho zzj(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzf(parcelZza, iObjectWrapper);
        zzazq.zzf(parcelZza, iObjectWrapper2);
        zzazq.zzf(parcelZza, iObjectWrapper3);
        Parcel parcelZzdb = zzdb(11, parcelZza);
        zzbho zzbhoVarZze = zzbhn.zze(parcelZzdb.readStrongBinder());
        parcelZzdb.recycle();
        return zzbhoVarZze;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbma zzk(IObjectWrapper iObjectWrapper, zzbqo zzbqoVar, int i, zzblx zzblxVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzf(parcelZza, iObjectWrapper);
        zzazq.zzf(parcelZza, zzbqoVar);
        parcelZza.writeInt(241199000);
        zzazq.zzf(parcelZza, zzblxVar);
        Parcel parcelZzdb = zzdb(16, parcelZza);
        zzbma zzbmaVarZzb = zzblz.zzb(parcelZzdb.readStrongBinder());
        parcelZzdb.recycle();
        return zzbmaVarZzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbui zzl(IObjectWrapper iObjectWrapper, zzbqo zzbqoVar, int i) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzf(parcelZza, iObjectWrapper);
        zzazq.zzf(parcelZza, zzbqoVar);
        parcelZza.writeInt(241199000);
        Parcel parcelZzdb = zzdb(15, parcelZza);
        zzbui zzbuiVarZzb = zzbuh.zzb(parcelZzdb.readStrongBinder());
        parcelZzdb.recycle();
        return zzbuiVarZzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbup zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzf(parcelZza, iObjectWrapper);
        Parcel parcelZzdb = zzdb(8, parcelZza);
        zzbup zzbupVarZzI = zzbuo.zzI(parcelZzdb.readStrongBinder());
        parcelZzdb.recycle();
        return zzbupVarZzI;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbxt zzn(IObjectWrapper iObjectWrapper, zzbqo zzbqoVar, int i) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbyj zzo(IObjectWrapper iObjectWrapper, String str, zzbqo zzbqoVar, int i) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzf(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        zzazq.zzf(parcelZza, zzbqoVar);
        parcelZza.writeInt(241199000);
        Parcel parcelZzdb = zzdb(12, parcelZza);
        zzbyj zzbyjVarZzq = zzbyi.zzq(parcelZzdb.readStrongBinder());
        parcelZzdb.recycle();
        return zzbyjVarZzq;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzcap zzp(IObjectWrapper iObjectWrapper, zzbqo zzbqoVar, int i) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzf(parcelZza, iObjectWrapper);
        zzazq.zzf(parcelZza, zzbqoVar);
        parcelZza.writeInt(241199000);
        Parcel parcelZzdb = zzdb(14, parcelZza);
        zzcap zzcapVarZzb = zzcao.zzb(parcelZzdb.readStrongBinder());
        parcelZzdb.recycle();
        return zzcapVarZzb;
    }
}
