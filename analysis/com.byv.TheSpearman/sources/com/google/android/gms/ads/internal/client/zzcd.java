package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzazp;
import com.google.android.gms.internal.ads.zzazq;
import com.google.android.gms.internal.ads.zzbhi;
import com.google.android.gms.internal.ads.zzbho;
import com.google.android.gms.internal.ads.zzblw;
import com.google.android.gms.internal.ads.zzblx;
import com.google.android.gms.internal.ads.zzbma;
import com.google.android.gms.internal.ads.zzbqn;
import com.google.android.gms.internal.ads.zzbqo;
import com.google.android.gms.internal.ads.zzbui;
import com.google.android.gms.internal.ads.zzbup;
import com.google.android.gms.internal.ads.zzbxt;
import com.google.android.gms.internal.ads.zzbyj;
import com.google.android.gms.internal.ads.zzcap;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes2.dex */
public abstract class zzcd extends zzazp implements zzce {
    public zzcd() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.internal.ads.zzazp
    protected final boolean zzdF(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzq zzqVar = (zzq) zzazq.zza(parcel, zzq.CREATOR);
                String string = parcel.readString();
                zzbqo zzbqoVarZzf = zzbqn.zzf(parcel.readStrongBinder());
                int i3 = parcel.readInt();
                zzazq.zzc(parcel);
                zzbu zzbuVarZzd = zzd(iObjectWrapperAsInterface, zzqVar, string, zzbqoVarZzf, i3);
                parcel2.writeNoException();
                zzazq.zzf(parcel2, zzbuVarZzd);
                return true;
            case 2:
                IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzq zzqVar2 = (zzq) zzazq.zza(parcel, zzq.CREATOR);
                String string2 = parcel.readString();
                zzbqo zzbqoVarZzf2 = zzbqn.zzf(parcel.readStrongBinder());
                int i4 = parcel.readInt();
                zzazq.zzc(parcel);
                zzbu zzbuVarZze = zze(iObjectWrapperAsInterface2, zzqVar2, string2, zzbqoVarZzf2, i4);
                parcel2.writeNoException();
                zzazq.zzf(parcel2, zzbuVarZze);
                return true;
            case 3:
                IObjectWrapper iObjectWrapperAsInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String string3 = parcel.readString();
                zzbqo zzbqoVarZzf3 = zzbqn.zzf(parcel.readStrongBinder());
                int i5 = parcel.readInt();
                zzazq.zzc(parcel);
                zzbq zzbqVarZzb = zzb(iObjectWrapperAsInterface3, string3, zzbqoVarZzf3, i5);
                parcel2.writeNoException();
                zzazq.zzf(parcel2, zzbqVarZzb);
                return true;
            case 4:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzazq.zzc(parcel);
                parcel2.writeNoException();
                zzazq.zzf(parcel2, null);
                return true;
            case 5:
                IObjectWrapper iObjectWrapperAsInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperAsInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzazq.zzc(parcel);
                zzbhi zzbhiVarZzi = zzi(iObjectWrapperAsInterface4, iObjectWrapperAsInterface5);
                parcel2.writeNoException();
                zzazq.zzf(parcel2, zzbhiVarZzi);
                return true;
            case 6:
                IObjectWrapper iObjectWrapperAsInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbqo zzbqoVarZzf4 = zzbqn.zzf(parcel.readStrongBinder());
                int i6 = parcel.readInt();
                zzazq.zzc(parcel);
                zzbxt zzbxtVarZzn = zzn(iObjectWrapperAsInterface6, zzbqoVarZzf4, i6);
                parcel2.writeNoException();
                zzazq.zzf(parcel2, zzbxtVarZzn);
                return true;
            case 7:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzazq.zzc(parcel);
                parcel2.writeNoException();
                zzazq.zzf(parcel2, null);
                return true;
            case 8:
                IObjectWrapper iObjectWrapperAsInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzazq.zzc(parcel);
                zzbup zzbupVarZzm = zzm(iObjectWrapperAsInterface7);
                parcel2.writeNoException();
                zzazq.zzf(parcel2, zzbupVarZzm);
                return true;
            case 9:
                IObjectWrapper iObjectWrapperAsInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                int i7 = parcel.readInt();
                zzazq.zzc(parcel);
                zzco zzcoVarZzg = zzg(iObjectWrapperAsInterface8, i7);
                parcel2.writeNoException();
                zzazq.zzf(parcel2, zzcoVarZzg);
                return true;
            case 10:
                IObjectWrapper iObjectWrapperAsInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzq zzqVar3 = (zzq) zzazq.zza(parcel, zzq.CREATOR);
                String string4 = parcel.readString();
                int i8 = parcel.readInt();
                zzazq.zzc(parcel);
                zzbu zzbuVarZzf = zzf(iObjectWrapperAsInterface9, zzqVar3, string4, i8);
                parcel2.writeNoException();
                zzazq.zzf(parcel2, zzbuVarZzf);
                return true;
            case 11:
                IObjectWrapper iObjectWrapperAsInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperAsInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperAsInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzazq.zzc(parcel);
                zzbho zzbhoVarZzj = zzj(iObjectWrapperAsInterface10, iObjectWrapperAsInterface11, iObjectWrapperAsInterface12);
                parcel2.writeNoException();
                zzazq.zzf(parcel2, zzbhoVarZzj);
                return true;
            case 12:
                IObjectWrapper iObjectWrapperAsInterface13 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String string5 = parcel.readString();
                zzbqo zzbqoVarZzf5 = zzbqn.zzf(parcel.readStrongBinder());
                int i9 = parcel.readInt();
                zzazq.zzc(parcel);
                zzbyj zzbyjVarZzo = zzo(iObjectWrapperAsInterface13, string5, zzbqoVarZzf5, i9);
                parcel2.writeNoException();
                zzazq.zzf(parcel2, zzbyjVarZzo);
                return true;
            case 13:
                IObjectWrapper iObjectWrapperAsInterface14 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzq zzqVar4 = (zzq) zzazq.zza(parcel, zzq.CREATOR);
                String string6 = parcel.readString();
                zzbqo zzbqoVarZzf6 = zzbqn.zzf(parcel.readStrongBinder());
                int i10 = parcel.readInt();
                zzazq.zzc(parcel);
                zzbu zzbuVarZzc = zzc(iObjectWrapperAsInterface14, zzqVar4, string6, zzbqoVarZzf6, i10);
                parcel2.writeNoException();
                zzazq.zzf(parcel2, zzbuVarZzc);
                return true;
            case 14:
                IObjectWrapper iObjectWrapperAsInterface15 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbqo zzbqoVarZzf7 = zzbqn.zzf(parcel.readStrongBinder());
                int i11 = parcel.readInt();
                zzazq.zzc(parcel);
                zzcap zzcapVarZzp = zzp(iObjectWrapperAsInterface15, zzbqoVarZzf7, i11);
                parcel2.writeNoException();
                zzazq.zzf(parcel2, zzcapVarZzp);
                return true;
            case 15:
                IObjectWrapper iObjectWrapperAsInterface16 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbqo zzbqoVarZzf8 = zzbqn.zzf(parcel.readStrongBinder());
                int i12 = parcel.readInt();
                zzazq.zzc(parcel);
                zzbui zzbuiVarZzl = zzl(iObjectWrapperAsInterface16, zzbqoVarZzf8, i12);
                parcel2.writeNoException();
                zzazq.zzf(parcel2, zzbuiVarZzl);
                return true;
            case 16:
                IObjectWrapper iObjectWrapperAsInterface17 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbqo zzbqoVarZzf9 = zzbqn.zzf(parcel.readStrongBinder());
                int i13 = parcel.readInt();
                zzblx zzblxVarZzc = zzblw.zzc(parcel.readStrongBinder());
                zzazq.zzc(parcel);
                zzbma zzbmaVarZzk = zzk(iObjectWrapperAsInterface17, zzbqoVarZzf9, i13, zzblxVarZzc);
                parcel2.writeNoException();
                zzazq.zzf(parcel2, zzbmaVarZzk);
                return true;
            case 17:
                IObjectWrapper iObjectWrapperAsInterface18 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbqo zzbqoVarZzf10 = zzbqn.zzf(parcel.readStrongBinder());
                int i14 = parcel.readInt();
                zzazq.zzc(parcel);
                zzdj zzdjVarZzh = zzh(iObjectWrapperAsInterface18, zzbqoVarZzf10, i14);
                parcel2.writeNoException();
                zzazq.zzf(parcel2, zzdjVarZzh);
                return true;
            default:
                return false;
        }
    }
}
