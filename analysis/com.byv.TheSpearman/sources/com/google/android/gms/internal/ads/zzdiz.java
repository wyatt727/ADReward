package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.internal.ads.zzbdg;
import java.lang.reflect.InvocationTargetException;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdiz implements zzcyq, zzdfs {
    private final zzbzz zza;
    private final Context zzb;
    private final zzcad zzc;
    private final View zzd;
    private String zze;
    private final zzbdg.zza.EnumC0145zza zzf;

    public zzdiz(zzbzz zzbzzVar, Context context, zzcad zzcadVar, View view, zzbdg.zza.EnumC0145zza enumC0145zza) {
        this.zza = zzbzzVar;
        this.zzb = context;
        this.zzc = zzcadVar;
        this.zzd = view;
        this.zzf = enumC0145zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zza() {
        this.zza.zzb(false);
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzc() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        View view = this.zzd;
        if (view != null && this.zze != null) {
            this.zzc.zzo(view.getContext(), this.zze);
        }
        this.zza.zzb(true);
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    @ParametersAreNonnullByDefault
    public final void zzds(zzbxq zzbxqVar, String str, String str2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.zzc.zzp(this.zzb)) {
            try {
                zzcad zzcadVar = this.zzc;
                Context context = this.zzb;
                zzcadVar.zzl(context, zzcadVar.zza(context), this.zza.zza(), zzbxqVar.zzc(), zzbxqVar.zzb());
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("Remote Exception to get reward item.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzdfs
    public final void zzk() {
    }

    @Override // com.google.android.gms.internal.ads.zzdfs
    public final void zzl() {
        if (this.zzf == zzbdg.zza.EnumC0145zza.APP_OPEN) {
            return;
        }
        String strZzc = this.zzc.zzc(this.zzb);
        this.zze = strZzc;
        this.zze = String.valueOf(strZzc).concat(this.zzf == zzbdg.zza.EnumC0145zza.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial");
    }
}
