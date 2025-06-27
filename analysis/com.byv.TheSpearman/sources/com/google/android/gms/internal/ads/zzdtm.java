package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.MobileAds;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.json.t2;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Locale;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdtm implements zzddi, com.google.android.gms.ads.internal.client.zza, zzczk, zzcyu {
    private final Context zza;
    private final zzfha zzb;
    private final zzduh zzc;
    private final zzffz zzd;
    private final zzffn zze;
    private final zzefd zzf;
    private final String zzg;
    private Boolean zzh;
    private final boolean zzi = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzgU)).booleanValue();

    public zzdtm(Context context, zzfha zzfhaVar, zzduh zzduhVar, zzffz zzffzVar, zzffn zzffnVar, zzefd zzefdVar, String str) {
        this.zza = context;
        this.zzb = zzfhaVar;
        this.zzc = zzduhVar;
        this.zzd = zzffzVar;
        this.zze = zzffnVar;
        this.zzf = zzefdVar;
        this.zzg = str;
    }

    private final zzdug zzd(String str) {
        zzdug zzdugVarZza = this.zzc.zza();
        zzdugVarZza.zzd(this.zzd.zzb.zzb);
        zzdugVarZza.zzc(this.zze);
        zzdugVarZza.zzb(t2.h.h, str);
        zzdugVarZza.zzb(FirebaseAnalytics.Param.AD_FORMAT, this.zzg.toUpperCase(Locale.ROOT));
        if (!this.zze.zzu.isEmpty()) {
            zzdugVarZza.zzb("ancn", (String) this.zze.zzu.get(0));
        }
        if (this.zze.zzaj) {
            zzdugVarZza.zzb("device_connectivity", true != com.google.android.gms.ads.internal.zzu.zzo().zzz(this.zza) ? "offline" : CustomTabsCallback.ONLINE_EXTRAS_KEY);
            zzdugVarZza.zzb("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis()));
            zzdugVarZza.zzb("offline_ad", "1");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzhd)).booleanValue()) {
            boolean z = com.google.android.gms.ads.nonagon.signalgeneration.zzh.zze(this.zzd.zza.zza) != 1;
            zzdugVarZza.zzb("scar", String.valueOf(z));
            if (z) {
                com.google.android.gms.ads.internal.client.zzl zzlVar = this.zzd.zza.zza.zzd;
                zzdugVarZza.zzb("ragent", zzlVar.zzp);
                zzdugVarZza.zzb("rtype", com.google.android.gms.ads.nonagon.signalgeneration.zzh.zza(com.google.android.gms.ads.nonagon.signalgeneration.zzh.zzb(zzlVar)));
            }
        }
        return zzdugVarZza;
    }

    private final void zze(zzdug zzdugVar) {
        if (!this.zze.zzaj) {
            zzdugVar.zzf();
            return;
        }
        this.zzf.zzd(new zzeff(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis(), this.zzd.zzb.zzb.zzb, zzdugVar.zze(), 2));
    }

    private final boolean zzf() {
        String strZzp;
        if (this.zzh == null) {
            synchronized (this) {
                if (this.zzh == null) {
                    String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzbt);
                    com.google.android.gms.ads.internal.zzu.zzp();
                    try {
                        strZzp = com.google.android.gms.ads.internal.util.zzt.zzp(this.zza);
                    } catch (RemoteException unused) {
                        strZzp = null;
                    }
                    boolean zMatches = false;
                    if (str != null && strZzp != null) {
                        try {
                            zMatches = Pattern.matches(str, strZzp);
                        } catch (RuntimeException e) {
                            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.zzh = Boolean.valueOf(zMatches);
                }
            }
        }
        return this.zzh.booleanValue();
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (this.zze.zzaj) {
            zze(zzd(CampaignEx.JSON_NATIVE_VIDEO_CLICK));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyu
    public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.internal.client.zze zzeVar2;
        if (this.zzi) {
            zzdug zzdugVarZzd = zzd("ifts");
            zzdugVarZzd.zzb("reason", "adapter");
            int i = zzeVar.zza;
            String str = zzeVar.zzb;
            if (zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN) && (zzeVar2 = zzeVar.zzd) != null && !zzeVar2.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                com.google.android.gms.ads.internal.client.zze zzeVar3 = zzeVar.zzd;
                i = zzeVar3.zza;
                str = zzeVar3.zzb;
            }
            if (i >= 0) {
                zzdugVarZzd.zzb("arec", String.valueOf(i));
            }
            String strZza = this.zzb.zza(str);
            if (strZza != null) {
                zzdugVarZzd.zzb("areec", strZza);
            }
            zzdugVarZzd.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyu
    public final void zzb() {
        if (this.zzi) {
            zzdug zzdugVarZzd = zzd("ifts");
            zzdugVarZzd.zzb("reason", "blocked");
            zzdugVarZzd.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyu
    public final void zzc(zzdit zzditVar) {
        if (this.zzi) {
            zzdug zzdugVarZzd = zzd("ifts");
            zzdugVarZzd.zzb("reason", "exception");
            if (!TextUtils.isEmpty(zzditVar.getMessage())) {
                zzdugVarZzd.zzb(NotificationCompat.CATEGORY_MESSAGE, zzditVar.getMessage());
            }
            zzdugVarZzd.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddi
    public final void zzi() {
        if (zzf()) {
            zzd("adapter_shown").zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddi
    public final void zzj() {
        if (zzf()) {
            zzd("adapter_impression").zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczk
    public final void zzr() {
        if (zzf() || this.zze.zzaj) {
            zze(zzd("impression"));
        }
    }
}
