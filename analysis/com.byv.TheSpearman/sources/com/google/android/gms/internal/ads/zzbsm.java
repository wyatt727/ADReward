package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public abstract class zzbsm extends zzazp implements zzbsn {
    public zzbsm() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public static zzbsn zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        return iInterfaceQueryLocalInterface instanceof zzbsn ? (zzbsn) iInterfaceQueryLocalInterface : new zzbsl(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzazp
    protected final boolean zzdF(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbsq zzbsoVar = null;
        zzbry zzbrwVar = null;
        zzbsh zzbsfVar = null;
        zzbsb zzbrzVar = null;
        zzbsk zzbsiVar = null;
        zzbsh zzbsfVar2 = null;
        zzbsk zzbsiVar2 = null;
        zzbse zzbscVar = null;
        zzbsb zzbrzVar2 = null;
        if (i == 1) {
            IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            String string = parcel.readString();
            Bundle bundle = (Bundle) zzazq.zza(parcel, Bundle.CREATOR);
            Bundle bundle2 = (Bundle) zzazq.zza(parcel, Bundle.CREATOR);
            com.google.android.gms.ads.internal.client.zzq zzqVar = (com.google.android.gms.ads.internal.client.zzq) zzazq.zza(parcel, com.google.android.gms.ads.internal.client.zzq.CREATOR);
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                zzbsoVar = iInterfaceQueryLocalInterface instanceof zzbsq ? (zzbsq) iInterfaceQueryLocalInterface : new zzbso(strongBinder);
            }
            zzbsq zzbsqVar = zzbsoVar;
            zzazq.zzc(parcel);
            zzh(iObjectWrapperAsInterface, string, bundle, bundle2, zzqVar, zzbsqVar);
            parcel2.writeNoException();
        } else if (i == 2) {
            zzbtc zzbtcVarZzf = zzf();
            parcel2.writeNoException();
            zzazq.zze(parcel2, zzbtcVarZzf);
        } else if (i == 3) {
            zzbtc zzbtcVarZzg = zzg();
            parcel2.writeNoException();
            zzazq.zze(parcel2, zzbtcVarZzg);
        } else if (i == 5) {
            com.google.android.gms.ads.internal.client.zzdq zzdqVarZze = zze();
            parcel2.writeNoException();
            zzazq.zzf(parcel2, zzdqVarZze);
        } else if (i == 10) {
            IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzazq.zzc(parcel);
            parcel2.writeNoException();
        } else if (i != 11) {
            switch (i) {
                case 13:
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzl zzlVar = (com.google.android.gms.ads.internal.client.zzl) zzazq.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                    IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder strongBinder2 = parcel.readStrongBinder();
                    if (strongBinder2 != null) {
                        IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        zzbrzVar2 = iInterfaceQueryLocalInterface2 instanceof zzbsb ? (zzbsb) iInterfaceQueryLocalInterface2 : new zzbrz(strongBinder2);
                    }
                    zzbsb zzbsbVar = zzbrzVar2;
                    zzbqu zzbquVarZzb = zzbqt.zzb(parcel.readStrongBinder());
                    com.google.android.gms.ads.internal.client.zzq zzqVar2 = (com.google.android.gms.ads.internal.client.zzq) zzazq.zza(parcel, com.google.android.gms.ads.internal.client.zzq.CREATOR);
                    zzazq.zzc(parcel);
                    zzj(string2, string3, zzlVar, iObjectWrapperAsInterface2, zzbsbVar, zzbquVarZzb, zzqVar2);
                    parcel2.writeNoException();
                    break;
                case 14:
                    String string4 = parcel.readString();
                    String string5 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzl zzlVar2 = (com.google.android.gms.ads.internal.client.zzl) zzazq.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                    IObjectWrapper iObjectWrapperAsInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder strongBinder3 = parcel.readStrongBinder();
                    if (strongBinder3 != null) {
                        IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                        zzbscVar = iInterfaceQueryLocalInterface3 instanceof zzbse ? (zzbse) iInterfaceQueryLocalInterface3 : new zzbsc(strongBinder3);
                    }
                    zzbse zzbseVar = zzbscVar;
                    zzbqu zzbquVarZzb2 = zzbqt.zzb(parcel.readStrongBinder());
                    zzazq.zzc(parcel);
                    zzl(string4, string5, zzlVar2, iObjectWrapperAsInterface3, zzbseVar, zzbquVarZzb2);
                    parcel2.writeNoException();
                    break;
                case 15:
                    IObjectWrapper iObjectWrapperAsInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    zzazq.zzc(parcel);
                    boolean zZzs = zzs(iObjectWrapperAsInterface4);
                    parcel2.writeNoException();
                    parcel2.writeInt(zZzs ? 1 : 0);
                    break;
                case 16:
                    String string6 = parcel.readString();
                    String string7 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzl zzlVar3 = (com.google.android.gms.ads.internal.client.zzl) zzazq.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                    IObjectWrapper iObjectWrapperAsInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder strongBinder4 = parcel.readStrongBinder();
                    if (strongBinder4 != null) {
                        IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        zzbsiVar2 = iInterfaceQueryLocalInterface4 instanceof zzbsk ? (zzbsk) iInterfaceQueryLocalInterface4 : new zzbsi(strongBinder4);
                    }
                    zzbsk zzbskVar = zzbsiVar2;
                    zzbqu zzbquVarZzb3 = zzbqt.zzb(parcel.readStrongBinder());
                    zzazq.zzc(parcel);
                    zzp(string6, string7, zzlVar3, iObjectWrapperAsInterface5, zzbskVar, zzbquVarZzb3);
                    parcel2.writeNoException();
                    break;
                case 17:
                    IObjectWrapper iObjectWrapperAsInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    zzazq.zzc(parcel);
                    boolean zZzt = zzt(iObjectWrapperAsInterface6);
                    parcel2.writeNoException();
                    parcel2.writeInt(zZzt ? 1 : 0);
                    break;
                case 18:
                    String string8 = parcel.readString();
                    String string9 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzl zzlVar4 = (com.google.android.gms.ads.internal.client.zzl) zzazq.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                    IObjectWrapper iObjectWrapperAsInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder strongBinder5 = parcel.readStrongBinder();
                    if (strongBinder5 != null) {
                        IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        zzbsfVar2 = iInterfaceQueryLocalInterface5 instanceof zzbsh ? (zzbsh) iInterfaceQueryLocalInterface5 : new zzbsf(strongBinder5);
                    }
                    zzbsh zzbshVar = zzbsfVar2;
                    zzbqu zzbquVarZzb4 = zzbqt.zzb(parcel.readStrongBinder());
                    zzazq.zzc(parcel);
                    zzm(string8, string9, zzlVar4, iObjectWrapperAsInterface7, zzbshVar, zzbquVarZzb4);
                    parcel2.writeNoException();
                    break;
                case 19:
                    String string10 = parcel.readString();
                    zzazq.zzc(parcel);
                    zzq(string10);
                    parcel2.writeNoException();
                    break;
                case 20:
                    String string11 = parcel.readString();
                    String string12 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzl zzlVar5 = (com.google.android.gms.ads.internal.client.zzl) zzazq.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                    IObjectWrapper iObjectWrapperAsInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder strongBinder6 = parcel.readStrongBinder();
                    if (strongBinder6 != null) {
                        IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        zzbsiVar = iInterfaceQueryLocalInterface6 instanceof zzbsk ? (zzbsk) iInterfaceQueryLocalInterface6 : new zzbsi(strongBinder6);
                    }
                    zzbsk zzbskVar2 = zzbsiVar;
                    zzbqu zzbquVarZzb5 = zzbqt.zzb(parcel.readStrongBinder());
                    zzazq.zzc(parcel);
                    zzo(string11, string12, zzlVar5, iObjectWrapperAsInterface8, zzbskVar2, zzbquVarZzb5);
                    parcel2.writeNoException();
                    break;
                case 21:
                    String string13 = parcel.readString();
                    String string14 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzl zzlVar6 = (com.google.android.gms.ads.internal.client.zzl) zzazq.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                    IObjectWrapper iObjectWrapperAsInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder strongBinder7 = parcel.readStrongBinder();
                    if (strongBinder7 != null) {
                        IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        zzbrzVar = iInterfaceQueryLocalInterface7 instanceof zzbsb ? (zzbsb) iInterfaceQueryLocalInterface7 : new zzbrz(strongBinder7);
                    }
                    zzbsb zzbsbVar2 = zzbrzVar;
                    zzbqu zzbquVarZzb6 = zzbqt.zzb(parcel.readStrongBinder());
                    com.google.android.gms.ads.internal.client.zzq zzqVar3 = (com.google.android.gms.ads.internal.client.zzq) zzazq.zza(parcel, com.google.android.gms.ads.internal.client.zzq.CREATOR);
                    zzazq.zzc(parcel);
                    zzk(string13, string14, zzlVar6, iObjectWrapperAsInterface9, zzbsbVar2, zzbquVarZzb6, zzqVar3);
                    parcel2.writeNoException();
                    break;
                case 22:
                    String string15 = parcel.readString();
                    String string16 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzl zzlVar7 = (com.google.android.gms.ads.internal.client.zzl) zzazq.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                    IObjectWrapper iObjectWrapperAsInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder strongBinder8 = parcel.readStrongBinder();
                    if (strongBinder8 != null) {
                        IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        zzbsfVar = iInterfaceQueryLocalInterface8 instanceof zzbsh ? (zzbsh) iInterfaceQueryLocalInterface8 : new zzbsf(strongBinder8);
                    }
                    zzbsh zzbshVar2 = zzbsfVar;
                    zzbqu zzbquVarZzb7 = zzbqt.zzb(parcel.readStrongBinder());
                    zzbgt zzbgtVar = (zzbgt) zzazq.zza(parcel, zzbgt.CREATOR);
                    zzazq.zzc(parcel);
                    zzn(string15, string16, zzlVar7, iObjectWrapperAsInterface10, zzbshVar2, zzbquVarZzb7, zzbgtVar);
                    parcel2.writeNoException();
                    break;
                case 23:
                    String string17 = parcel.readString();
                    String string18 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzl zzlVar8 = (com.google.android.gms.ads.internal.client.zzl) zzazq.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                    IObjectWrapper iObjectWrapperAsInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder strongBinder9 = parcel.readStrongBinder();
                    if (strongBinder9 != null) {
                        IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
                        zzbrwVar = iInterfaceQueryLocalInterface9 instanceof zzbry ? (zzbry) iInterfaceQueryLocalInterface9 : new zzbrw(strongBinder9);
                    }
                    zzbry zzbryVar = zzbrwVar;
                    zzbqu zzbquVarZzb8 = zzbqt.zzb(parcel.readStrongBinder());
                    zzazq.zzc(parcel);
                    zzi(string17, string18, zzlVar8, iObjectWrapperAsInterface11, zzbryVar, zzbquVarZzb8);
                    parcel2.writeNoException();
                    break;
                case 24:
                    IObjectWrapper iObjectWrapperAsInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    zzazq.zzc(parcel);
                    boolean zZzr = zzr(iObjectWrapperAsInterface12);
                    parcel2.writeNoException();
                    parcel2.writeInt(zZzr ? 1 : 0);
                    break;
                default:
                    return false;
            }
        } else {
            parcel.createStringArray();
            zzazq.zzc(parcel);
            parcel2.writeNoException();
        }
        return true;
    }
}
