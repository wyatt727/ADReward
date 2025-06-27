package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbgr extends zzbhd {
    private final Drawable zza;
    private final Uri zzb;
    private final double zzc;
    private final int zzd;
    private final int zze;

    public zzbgr(Drawable drawable, Uri uri, double d, int i, int i2) {
        this.zza = drawable;
        this.zzb = uri;
        this.zzc = d;
        this.zzd = i;
        this.zze = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzbhe
    public final double zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzbhe
    public final int zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzbhe
    public final int zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbhe
    public final Uri zze() throws RemoteException {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbhe
    public final IObjectWrapper zzf() throws RemoteException {
        return ObjectWrapper.wrap(this.zza);
    }
}
