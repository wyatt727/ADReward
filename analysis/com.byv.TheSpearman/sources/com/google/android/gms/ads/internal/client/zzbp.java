package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzazp;
import com.google.android.gms.internal.ads.zzazq;
import com.google.android.gms.internal.ads.zzbgt;
import com.google.android.gms.internal.ads.zzbib;
import com.google.android.gms.internal.ads.zzbic;
import com.google.android.gms.internal.ads.zzbie;
import com.google.android.gms.internal.ads.zzbif;
import com.google.android.gms.internal.ads.zzbih;
import com.google.android.gms.internal.ads.zzbii;
import com.google.android.gms.internal.ads.zzbik;
import com.google.android.gms.internal.ads.zzbil;
import com.google.android.gms.internal.ads.zzbio;
import com.google.android.gms.internal.ads.zzbip;
import com.google.android.gms.internal.ads.zzbir;
import com.google.android.gms.internal.ads.zzbis;
import com.google.android.gms.internal.ads.zzbni;
import com.google.android.gms.internal.ads.zzbnq;
import com.google.android.gms.internal.ads.zzbnr;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes2.dex */
public abstract class zzbp extends zzazp implements zzbq {
    public zzbp() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.zzazp
    protected final boolean zzdF(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbh zzbfVar = null;
        zzcf zzcfVar = null;
        switch (i) {
            case 1:
                zzbn zzbnVarZze = zze();
                parcel2.writeNoException();
                zzazq.zzf(parcel2, zzbnVarZze);
                return true;
            case 2:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    zzbfVar = iInterfaceQueryLocalInterface instanceof zzbh ? (zzbh) iInterfaceQueryLocalInterface : new zzbf(strongBinder);
                }
                zzazq.zzc(parcel);
                zzl(zzbfVar);
                parcel2.writeNoException();
                return true;
            case 3:
                zzbic zzbicVarZzb = zzbib.zzb(parcel.readStrongBinder());
                zzazq.zzc(parcel);
                zzf(zzbicVarZzb);
                parcel2.writeNoException();
                return true;
            case 4:
                zzbif zzbifVarZzb = zzbie.zzb(parcel.readStrongBinder());
                zzazq.zzc(parcel);
                zzg(zzbifVarZzb);
                parcel2.writeNoException();
                return true;
            case 5:
                String string = parcel.readString();
                zzbil zzbilVarZzb = zzbik.zzb(parcel.readStrongBinder());
                zzbii zzbiiVarZzb = zzbih.zzb(parcel.readStrongBinder());
                zzazq.zzc(parcel);
                zzh(string, zzbilVarZzb, zzbiiVarZzb);
                parcel2.writeNoException();
                return true;
            case 6:
                zzbgt zzbgtVar = (zzbgt) zzazq.zza(parcel, zzbgt.CREATOR);
                zzazq.zzc(parcel);
                zzo(zzbgtVar);
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    zzcfVar = iInterfaceQueryLocalInterface2 instanceof zzcf ? (zzcf) iInterfaceQueryLocalInterface2 : new zzcf(strongBinder2);
                }
                zzazq.zzc(parcel);
                zzq(zzcfVar);
                parcel2.writeNoException();
                return true;
            case 8:
                zzbip zzbipVarZzb = zzbio.zzb(parcel.readStrongBinder());
                zzq zzqVar = (zzq) zzazq.zza(parcel, zzq.CREATOR);
                zzazq.zzc(parcel);
                zzj(zzbipVarZzb, zzqVar);
                parcel2.writeNoException();
                return true;
            case 9:
                PublisherAdViewOptions publisherAdViewOptions = (PublisherAdViewOptions) zzazq.zza(parcel, PublisherAdViewOptions.CREATOR);
                zzazq.zzc(parcel);
                zzp(publisherAdViewOptions);
                parcel2.writeNoException();
                return true;
            case 10:
                zzbis zzbisVarZzb = zzbir.zzb(parcel.readStrongBinder());
                zzazq.zzc(parcel);
                zzk(zzbisVarZzb);
                parcel2.writeNoException();
                return true;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                zzbni zzbniVar = (zzbni) zzazq.zza(parcel, zzbni.CREATOR);
                zzazq.zzc(parcel);
                zzn(zzbniVar);
                parcel2.writeNoException();
                return true;
            case 14:
                zzbnr zzbnrVarZzb = zzbnq.zzb(parcel.readStrongBinder());
                zzazq.zzc(parcel);
                zzi(zzbnrVarZzb);
                parcel2.writeNoException();
                return true;
            case 15:
                AdManagerAdViewOptions adManagerAdViewOptions = (AdManagerAdViewOptions) zzazq.zza(parcel, AdManagerAdViewOptions.CREATOR);
                zzazq.zzc(parcel);
                zzm(adManagerAdViewOptions);
                parcel2.writeNoException();
                return true;
        }
    }
}
