package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbq;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzcd;
import com.google.android.gms.ads.internal.client.zzco;
import com.google.android.gms.ads.internal.client.zzdj;
import com.google.android.gms.ads.internal.client.zzew;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzad;
import com.google.android.gms.ads.internal.overlay.zzaf;
import com.google.android.gms.ads.internal.overlay.zzag;
import com.google.android.gms.ads.internal.overlay.zzz;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbdz;
import com.google.android.gms.internal.ads.zzbhi;
import com.google.android.gms.internal.ads.zzbho;
import com.google.android.gms.internal.ads.zzblx;
import com.google.android.gms.internal.ads.zzbma;
import com.google.android.gms.internal.ads.zzbqo;
import com.google.android.gms.internal.ads.zzbui;
import com.google.android.gms.internal.ads.zzbup;
import com.google.android.gms.internal.ads.zzbxt;
import com.google.android.gms.internal.ads.zzbyj;
import com.google.android.gms.internal.ads.zzcap;
import com.google.android.gms.internal.ads.zzcik;
import com.google.android.gms.internal.ads.zzdls;
import com.google.android.gms.internal.ads.zzdlu;
import com.google.android.gms.internal.ads.zzdvq;
import com.google.android.gms.internal.ads.zzend;
import com.google.android.gms.internal.ads.zzfan;
import com.google.android.gms.internal.ads.zzfcb;
import com.google.android.gms.internal.ads.zzfds;
import com.google.android.gms.internal.ads.zzffg;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes2.dex */
public class ClientApi extends zzcd {
    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbq zzb(IObjectWrapper iObjectWrapper, String str, zzbqo zzbqoVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        return new zzend(zzcik.zzb(context, zzbqoVar, i), context, str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzc(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, String str, zzbqo zzbqoVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfan zzfanVarZzt = zzcik.zzb(context, zzbqoVar, i).zzt();
        zzfanVarZzt.zza(str);
        zzfanVarZzt.zzb(context);
        return i >= ((Integer) zzba.zzc().zza(zzbdz.zzfj)).intValue() ? zzfanVarZzt.zzc().zza() : new zzew();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzd(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, String str, zzbqo zzbqoVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfcb zzfcbVarZzu = zzcik.zzb(context, zzbqoVar, i).zzu();
        zzfcbVarZzu.zzc(context);
        zzfcbVarZzu.zza(zzqVar);
        zzfcbVarZzu.zzb(str);
        return zzfcbVarZzu.zzd().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zze(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, String str, zzbqo zzbqoVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfds zzfdsVarZzv = zzcik.zzb(context, zzbqoVar, i).zzv();
        zzfdsVarZzv.zzc(context);
        zzfdsVarZzv.zza(zzqVar);
        zzfdsVarZzv.zzb(str);
        return zzfdsVarZzv.zzd().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzf(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, String str, int i) {
        return new zzt((Context) ObjectWrapper.unwrap(iObjectWrapper), zzqVar, str, new VersionInfoParcel(241199000, i, true, false));
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzco zzg(IObjectWrapper iObjectWrapper, int i) {
        return zzcik.zzb((Context) ObjectWrapper.unwrap(iObjectWrapper), null, i).zzc();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzdj zzh(IObjectWrapper iObjectWrapper, zzbqo zzbqoVar, int i) {
        return zzcik.zzb((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbqoVar, i).zzm();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbhi zzi(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        return new zzdlu((FrameLayout) ObjectWrapper.unwrap(iObjectWrapper), (FrameLayout) ObjectWrapper.unwrap(iObjectWrapper2), 241199000);
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbho zzj(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        return new zzdls((View) ObjectWrapper.unwrap(iObjectWrapper), (HashMap) ObjectWrapper.unwrap(iObjectWrapper2), (HashMap) ObjectWrapper.unwrap(iObjectWrapper3));
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbma zzk(IObjectWrapper iObjectWrapper, zzbqo zzbqoVar, int i, zzblx zzblxVar) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzdvq zzdvqVarZzk = zzcik.zzb(context, zzbqoVar, i).zzk();
        zzdvqVarZzk.zzb(context);
        zzdvqVarZzk.zza(zzblxVar);
        return zzdvqVarZzk.zzc().zzd();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbui zzl(IObjectWrapper iObjectWrapper, zzbqo zzbqoVar, int i) {
        return zzcik.zzb((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbqoVar, i).zzn();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbup zzm(IObjectWrapper iObjectWrapper) {
        Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
        AdOverlayInfoParcel adOverlayInfoParcelZza = AdOverlayInfoParcel.zza(activity.getIntent());
        if (adOverlayInfoParcelZza == null) {
            return new com.google.android.gms.ads.internal.overlay.zzu(activity);
        }
        int i = adOverlayInfoParcelZza.zzk;
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? new com.google.android.gms.ads.internal.overlay.zzu(activity) : new zzad(activity) : new zzz(activity, adOverlayInfoParcelZza) : new zzag(activity) : new zzaf(activity) : new com.google.android.gms.ads.internal.overlay.zzt(activity);
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbxt zzn(IObjectWrapper iObjectWrapper, zzbqo zzbqoVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzffg zzffgVarZzw = zzcik.zzb(context, zzbqoVar, i).zzw();
        zzffgVarZzw.zzb(context);
        return zzffgVarZzw.zzc().zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbyj zzo(IObjectWrapper iObjectWrapper, String str, zzbqo zzbqoVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzffg zzffgVarZzw = zzcik.zzb(context, zzbqoVar, i).zzw();
        zzffgVarZzw.zzb(context);
        zzffgVarZzw.zza(str);
        return zzffgVarZzw.zzc().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzcap zzp(IObjectWrapper iObjectWrapper, zzbqo zzbqoVar, int i) {
        return zzcik.zzb((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbqoVar, i).zzq();
    }
}
