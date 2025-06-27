package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbhc extends zzazo implements zzbhe {
    zzbhc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override // com.google.android.gms.internal.ads.zzbhe
    public final double zzb() throws RemoteException {
        Parcel parcelZzdb = zzdb(3, zza());
        double d = parcelZzdb.readDouble();
        parcelZzdb.recycle();
        return d;
    }

    @Override // com.google.android.gms.internal.ads.zzbhe
    public final int zzc() throws RemoteException {
        Parcel parcelZzdb = zzdb(5, zza());
        int i = parcelZzdb.readInt();
        parcelZzdb.recycle();
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzbhe
    public final int zzd() throws RemoteException {
        Parcel parcelZzdb = zzdb(4, zza());
        int i = parcelZzdb.readInt();
        parcelZzdb.recycle();
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzbhe
    public final Uri zze() throws RemoteException {
        Parcel parcelZzdb = zzdb(2, zza());
        Uri uri = (Uri) zzazq.zza(parcelZzdb, Uri.CREATOR);
        parcelZzdb.recycle();
        return uri;
    }

    @Override // com.google.android.gms.internal.ads.zzbhe
    public final IObjectWrapper zzf() throws RemoteException {
        Parcel parcelZzdb = zzdb(1, zza());
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZzdb.readStrongBinder());
        parcelZzdb.recycle();
        return iObjectWrapperAsInterface;
    }
}
