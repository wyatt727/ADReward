package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public abstract class zzbha extends zzazp implements zzbhb {
    public zzbha() {
        super("com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.google.android.gms.internal.ads.zzazp
    protected final boolean zzdF(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbim zzbimVar;
        switch (i) {
            case 2:
                float fZze = zze();
                parcel2.writeNoException();
                parcel2.writeFloat(fZze);
                return true;
            case 3:
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzazq.zzc(parcel);
                zzj(iObjectWrapperAsInterface);
                parcel2.writeNoException();
                return true;
            case 4:
                IObjectWrapper iObjectWrapperZzi = zzi();
                parcel2.writeNoException();
                zzazq.zzf(parcel2, iObjectWrapperZzi);
                return true;
            case 5:
                float fZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzg);
                return true;
            case 6:
                float fZzf = zzf();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzf);
                return true;
            case 7:
                com.google.android.gms.ads.internal.client.zzdq zzdqVarZzh = zzh();
                parcel2.writeNoException();
                zzazq.zzf(parcel2, zzdqVarZzh);
                return true;
            case 8:
                boolean zZzl = zzl();
                parcel2.writeNoException();
                int i3 = zzazq.zza;
                parcel2.writeInt(zZzl ? 1 : 0);
                return true;
            case 9:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    zzbimVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener");
                    zzbimVar = iInterfaceQueryLocalInterface instanceof zzbim ? (zzbim) iInterfaceQueryLocalInterface : new zzbim(strongBinder);
                }
                zzazq.zzc(parcel);
                zzm(zzbimVar);
                parcel2.writeNoException();
                return true;
            case 10:
                boolean zZzk = zzk();
                parcel2.writeNoException();
                int i4 = zzazq.zza;
                parcel2.writeInt(zZzk ? 1 : 0);
                return true;
            default:
                return false;
        }
    }
}
