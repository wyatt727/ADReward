package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public abstract class zzcif extends zzazp implements zzcig {
    public zzcif() {
        super("com.google.android.gms.ads.measurement.IAppMeasurementProxy");
    }

    @Override // com.google.android.gms.internal.ads.zzazp
    protected final boolean zzdF(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                Bundle bundle = (Bundle) zzazq.zza(parcel, Bundle.CREATOR);
                zzazq.zzc(parcel);
                zzp(bundle);
                parcel2.writeNoException();
                return true;
            case 2:
                Bundle bundle2 = (Bundle) zzazq.zza(parcel, Bundle.CREATOR);
                zzazq.zzc(parcel);
                Bundle bundleZzd = zzd(bundle2);
                parcel2.writeNoException();
                zzazq.zze(parcel2, bundleZzd);
                return true;
            case 3:
                String string = parcel.readString();
                String string2 = parcel.readString();
                Bundle bundle3 = (Bundle) zzazq.zza(parcel, Bundle.CREATOR);
                zzazq.zzc(parcel);
                zzo(string, string2, bundle3);
                parcel2.writeNoException();
                return true;
            case 4:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzazq.zzc(parcel);
                zzt(string3, string4, iObjectWrapperAsInterface);
                parcel2.writeNoException();
                return true;
            case 5:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                boolean zZzg = zzazq.zzg(parcel);
                zzazq.zzc(parcel);
                Map mapZzk = zzk(string5, string6, zZzg);
                parcel2.writeNoException();
                parcel2.writeMap(mapZzk);
                return true;
            case 6:
                String string7 = parcel.readString();
                zzazq.zzc(parcel);
                int iZzb = zzb(string7);
                parcel2.writeNoException();
                parcel2.writeInt(iZzb);
                return true;
            case 7:
                Bundle bundle4 = (Bundle) zzazq.zza(parcel, Bundle.CREATOR);
                zzazq.zzc(parcel);
                zzq(bundle4);
                parcel2.writeNoException();
                return true;
            case 8:
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                Bundle bundle5 = (Bundle) zzazq.zza(parcel, Bundle.CREATOR);
                zzazq.zzc(parcel);
                zzm(string8, string9, bundle5);
                parcel2.writeNoException();
                return true;
            case 9:
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                zzazq.zzc(parcel);
                List listZzj = zzj(string10, string11);
                parcel2.writeNoException();
                parcel2.writeList(listZzj);
                return true;
            case 10:
                String strZzf = zzf();
                parcel2.writeNoException();
                parcel2.writeString(strZzf);
                return true;
            case 11:
                String strZzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(strZzi);
                return true;
            case 12:
                long jZzc = zzc();
                parcel2.writeNoException();
                parcel2.writeLong(jZzc);
                return true;
            case 13:
                String string12 = parcel.readString();
                zzazq.zzc(parcel);
                zzl(string12);
                parcel2.writeNoException();
                return true;
            case 14:
                String string13 = parcel.readString();
                zzazq.zzc(parcel);
                zzn(string13);
                parcel2.writeNoException();
                return true;
            case 15:
                IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                zzazq.zzc(parcel);
                zzs(iObjectWrapperAsInterface2, string14, string15);
                parcel2.writeNoException();
                return true;
            case 16:
                String strZzh = zzh();
                parcel2.writeNoException();
                parcel2.writeString(strZzh);
                return true;
            case 17:
                String strZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeString(strZzg);
                return true;
            case 18:
                String strZze = zze();
                parcel2.writeNoException();
                parcel2.writeString(strZze);
                return true;
            case 19:
                Bundle bundle6 = (Bundle) zzazq.zza(parcel, Bundle.CREATOR);
                zzazq.zzc(parcel);
                zzr(bundle6);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
