package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbgy extends NativeAd.AdChoicesInfo {
    private final zzbgx zza;
    private final List zzb = new ArrayList();
    private String zzc;

    public zzbgy(zzbgx zzbgxVar) {
        IBinder iBinder;
        this.zza = zzbgxVar;
        try {
            this.zzc = zzbgxVar.zzg();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e);
            this.zzc = "";
        }
        try {
            for (Object obj : zzbgxVar.zzh()) {
                zzbhe zzbhcVar = null;
                if ((obj instanceof IBinder) && (iBinder = (IBinder) obj) != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    zzbhcVar = iInterfaceQueryLocalInterface instanceof zzbhe ? (zzbhe) iInterfaceQueryLocalInterface : new zzbhc(iBinder);
                }
                if (zzbhcVar != null) {
                    this.zzb.add(new zzbhf(zzbhcVar));
                }
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final List<NativeAd.Image> getImages() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final CharSequence getText() {
        return this.zzc;
    }
}
