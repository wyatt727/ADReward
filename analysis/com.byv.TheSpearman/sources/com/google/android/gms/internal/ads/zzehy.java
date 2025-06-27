package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsIntent;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzehy implements zzegj {
    private final Context zza;
    private final zzdim zzb;
    private final Executor zzc;
    private final zzffm zzd;

    public zzehy(Context context, Executor executor, zzdim zzdimVar, zzffm zzffmVar) {
        this.zza = context;
        this.zzb = zzdimVar;
        this.zzc = executor;
        this.zzd = zzffmVar;
    }

    private static String zzd(zzffn zzffnVar) {
        try {
            return zzffnVar.zzw.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzegj
    public final ListenableFuture zza(final zzffz zzffzVar, final zzffn zzffnVar) {
        String strZzd = zzd(zzffnVar);
        final Uri uri = strZzd != null ? Uri.parse(strZzd) : null;
        return zzgee.zzn(zzgee.zzh(null), new zzgdl() { // from class: com.google.android.gms.internal.ads.zzehw
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj) {
                return this.zza.zzc(uri, zzffzVar, zzffnVar, obj);
            }
        }, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzegj
    public final boolean zzb(zzffz zzffzVar, zzffn zzffnVar) {
        Context context = this.zza;
        return (context instanceof Activity) && zzbew.zzg(context) && !TextUtils.isEmpty(zzd(zzffnVar));
    }

    final /* synthetic */ ListenableFuture zzc(Uri uri, zzffz zzffzVar, zzffn zzffnVar, Object obj) throws Exception {
        try {
            CustomTabsIntent customTabsIntentBuild = new CustomTabsIntent.Builder().build();
            customTabsIntentBuild.intent.setData(uri);
            com.google.android.gms.ads.internal.overlay.zzc zzcVar = new com.google.android.gms.ads.internal.overlay.zzc(customTabsIntentBuild.intent, null);
            final zzcbw zzcbwVar = new zzcbw();
            zzdhm zzdhmVarZze = this.zzb.zze(new zzcul(zzffzVar, zzffnVar, null), new zzdhp(new zzdiu() { // from class: com.google.android.gms.internal.ads.zzehx
                @Override // com.google.android.gms.internal.ads.zzdiu
                public final void zza(boolean z, Context context, zzczd zzczdVar) {
                    zzcbw zzcbwVar2 = zzcbwVar;
                    try {
                        com.google.android.gms.ads.internal.zzu.zzi();
                        com.google.android.gms.ads.internal.overlay.zzn.zza(context, (AdOverlayInfoParcel) zzcbwVar2.get(), true);
                    } catch (Exception unused) {
                    }
                }
            }, null));
            zzcbwVar.zzc(new AdOverlayInfoParcel(zzcVar, null, zzdhmVarZze.zza(), null, new VersionInfoParcel(0, 0, false), null, null));
            this.zzd.zza();
            return zzgee.zzh(zzdhmVarZze.zzg());
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Error in CustomTabsAdRenderer", th);
            throw th;
        }
    }
}
