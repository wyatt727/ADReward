package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.internal.ads.zzbhi;
import com.google.android.gms.internal.ads.zzbho;
import com.google.android.gms.internal.ads.zzbjd;
import com.google.android.gms.internal.ads.zzbje;
import com.google.android.gms.internal.ads.zzbma;
import com.google.android.gms.internal.ads.zzbqo;
import com.google.android.gms.internal.ads.zzbui;
import com.google.android.gms.internal.ads.zzbum;
import com.google.android.gms.internal.ads.zzbup;
import com.google.android.gms.internal.ads.zzbvu;
import com.google.android.gms.internal.ads.zzbyj;
import com.google.android.gms.internal.ads.zzbyv;
import com.google.android.gms.internal.ads.zzcap;
import com.json.t2;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes2.dex */
public final class zzaw {
    private final zzk zza;
    private final zzi zzb;
    private final zzeq zzc;
    private final zzbjd zzd;
    private final zzbyv zze;
    private final zzbum zzf;
    private final zzbje zzg;
    private zzbvu zzh;

    public zzaw(zzk zzkVar, zzi zziVar, zzeq zzeqVar, zzbjd zzbjdVar, zzbyv zzbyvVar, zzbum zzbumVar, zzbje zzbjeVar) {
        this.zza = zzkVar;
        this.zzb = zziVar;
        this.zzc = zzeqVar;
        this.zzd = zzbjdVar;
        this.zze = zzbyvVar;
        this.zzf = zzbumVar;
        this.zzg = zzbjeVar;
    }

    static /* bridge */ /* synthetic */ void zzt(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString(t2.h.h, "no_ads_fallback");
        bundle.putString("flow", str);
        zzay.zzb().zzo(context, zzay.zzc().afmaVersion, "gmob-apps", bundle, true);
    }

    public final zzbq zzc(Context context, String str, zzbqo zzbqoVar) {
        return (zzbq) new zzao(this, context, str, zzbqoVar).zzd(context, false);
    }

    public final zzbu zzd(Context context, zzq zzqVar, String str, zzbqo zzbqoVar) {
        return (zzbu) new zzak(this, context, zzqVar, str, zzbqoVar).zzd(context, false);
    }

    public final zzbu zze(Context context, zzq zzqVar, String str, zzbqo zzbqoVar) {
        return (zzbu) new zzam(this, context, zzqVar, str, zzbqoVar).zzd(context, false);
    }

    public final zzdj zzf(Context context, zzbqo zzbqoVar) {
        return (zzdj) new zzac(this, context, zzbqoVar).zzd(context, false);
    }

    public final zzbhi zzh(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return (zzbhi) new zzas(this, frameLayout, frameLayout2, context).zzd(context, false);
    }

    public final zzbho zzi(View view, HashMap map, HashMap map2) {
        return (zzbho) new zzau(this, view, map, map2).zzd(view.getContext(), false);
    }

    public final zzbma zzl(Context context, zzbqo zzbqoVar, OnH5AdsEventListener onH5AdsEventListener) {
        return (zzbma) new zzai(this, context, zzbqoVar, onH5AdsEventListener).zzd(context, false);
    }

    public final zzbui zzm(Context context, zzbqo zzbqoVar) {
        return (zzbui) new zzag(this, context, zzbqoVar).zzd(context, false);
    }

    public final zzbup zzo(Activity activity) {
        zzaa zzaaVar = new zzaa(this, activity);
        Intent intent = activity.getIntent();
        boolean booleanExtra = false;
        if (intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            booleanExtra = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        } else {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("useClientJar flag not found in activity intent extras.");
        }
        return (zzbup) zzaaVar.zzd(activity, booleanExtra);
    }

    public final zzbyj zzq(Context context, String str, zzbqo zzbqoVar) {
        return (zzbyj) new zzav(this, context, str, zzbqoVar).zzd(context, false);
    }

    public final zzcap zzr(Context context, zzbqo zzbqoVar) {
        return (zzcap) new zzae(this, context, zzbqoVar).zzd(context, false);
    }
}
