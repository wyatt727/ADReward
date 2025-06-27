package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdms {
    private final zzdri zza;
    private final zzdpx zzb;
    private ViewTreeObserver.OnScrollChangedListener zzc = null;

    public zzdms(zzdri zzdriVar, zzdpx zzdpxVar) {
        this.zza = zzdriVar;
        this.zzb = zzdpxVar;
    }

    private static final int zzf(Context context, String str, int i) throws NumberFormatException {
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        com.google.android.gms.ads.internal.client.zzay.zzb();
        return com.google.android.gms.ads.internal.util.client.zzf.zzy(context, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View zza(final View view, final WindowManager windowManager) throws zzcgy {
        zzcgm zzcgmVarZza = this.zza.zza(com.google.android.gms.ads.internal.client.zzq.zzc(), null, null);
        View view2 = (View) zzcgmVarZza;
        view2.setVisibility(4);
        view2.setContentDescription("policy_validator");
        zzcgmVarZza.zzae("/sendMessageToSdk", new zzbky() { // from class: com.google.android.gms.internal.ads.zzdmm
            @Override // com.google.android.gms.internal.ads.zzbky
            public final void zza(Object obj, Map map) {
                this.zza.zzb((zzcgm) obj, map);
            }
        });
        zzcgmVarZza.zzae("/hideValidatorOverlay", new zzbky() { // from class: com.google.android.gms.internal.ads.zzdmn
            @Override // com.google.android.gms.internal.ads.zzbky
            public final void zza(Object obj, Map map) {
                this.zza.zzc(windowManager, view, (zzcgm) obj, map);
            }
        });
        zzcgmVarZza.zzae("/open", new zzblk(null, null, null, null, null));
        this.zzb.zzm(new WeakReference(zzcgmVarZza), "/loadNativeAdPolicyViolations", new zzbky() { // from class: com.google.android.gms.internal.ads.zzdmo
            @Override // com.google.android.gms.internal.ads.zzbky
            public final void zza(Object obj, Map map) throws NumberFormatException {
                this.zza.zze(view, windowManager, (zzcgm) obj, map);
            }
        });
        this.zzb.zzm(new WeakReference(zzcgmVarZza), "/showValidatorOverlay", new zzbky() { // from class: com.google.android.gms.internal.ads.zzdmp
            @Override // com.google.android.gms.internal.ads.zzbky
            public final void zza(Object obj, Map map) {
                com.google.android.gms.ads.internal.util.client.zzm.zze("Show native ad policy validator overlay.");
                ((zzcgm) obj).zzF().setVisibility(0);
            }
        });
        return view2;
    }

    final /* synthetic */ void zzb(zzcgm zzcgmVar, Map map) {
        this.zzb.zzj("sendMessageToNativeJs", map);
    }

    final /* synthetic */ void zzc(WindowManager windowManager, View view, zzcgm zzcgmVar, Map map) {
        com.google.android.gms.ads.internal.util.client.zzm.zze("Hide native ad policy validator overlay.");
        zzcgmVar.zzF().setVisibility(8);
        if (zzcgmVar.zzF().getWindowToken() != null) {
            windowManager.removeView(zzcgmVar.zzF());
        }
        zzcgmVar.destroy();
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (this.zzc == null || viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            return;
        }
        viewTreeObserver.removeOnScrollChangedListener(this.zzc);
    }

    final /* synthetic */ void zzd(Map map, boolean z, int i, String str, String str2) {
        HashMap map2 = new HashMap();
        map2.put("messageType", "validatorHtmlLoaded");
        map2.put("id", (String) map.get("id"));
        this.zzb.zzj("sendMessageToNativeJs", map2);
    }

    final /* synthetic */ void zze(final View view, final WindowManager windowManager, final zzcgm zzcgmVar, final Map map) throws NumberFormatException {
        zzcgmVar.zzN().zzB(new zzcia() { // from class: com.google.android.gms.internal.ads.zzdmr
            @Override // com.google.android.gms.internal.ads.zzcia
            public final void zza(boolean z, int i, String str, String str2) {
                this.zza.zzd(map, z, i, str, str2);
            }
        });
        if (map == null) {
            return;
        }
        Context context = view.getContext();
        int iZzf = zzf(context, (String) map.get("validator_width"), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzia)).intValue());
        int iZzf2 = zzf(context, (String) map.get("validator_height"), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzib)).intValue());
        int iZzf3 = zzf(context, (String) map.get("validator_x"), 0);
        int iZzf4 = zzf(context, (String) map.get("validator_y"), 0);
        zzcgmVar.zzah(zzcie.zzb(iZzf, iZzf2));
        try {
            zzcgmVar.zzG().getSettings().setUseWideViewPort(((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzic)).booleanValue());
            zzcgmVar.zzG().getSettings().setLoadWithOverviewMode(((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzid)).booleanValue());
        } catch (NullPointerException unused) {
        }
        final WindowManager.LayoutParams layoutParamsZzb = com.google.android.gms.ads.internal.util.zzbz.zzb();
        layoutParamsZzb.x = iZzf3;
        layoutParamsZzb.y = iZzf4;
        windowManager.updateViewLayout(zzcgmVar.zzF(), layoutParamsZzb);
        final String str = (String) map.get("orientation");
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect)) {
            final int i = (("1".equals(str) || "2".equals(str)) ? rect.bottom : rect.top) - iZzf4;
            this.zzc = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.gms.internal.ads.zzdmq
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    Rect rect2 = new Rect();
                    if (view.getGlobalVisibleRect(rect2)) {
                        zzcgm zzcgmVar2 = zzcgmVar;
                        if (zzcgmVar2.zzF().getWindowToken() == null) {
                            return;
                        }
                        int i2 = i;
                        WindowManager.LayoutParams layoutParams = layoutParamsZzb;
                        String str2 = str;
                        if ("1".equals(str2) || "2".equals(str2)) {
                            layoutParams.y = rect2.bottom - i2;
                        } else {
                            layoutParams.y = rect2.top - i2;
                        }
                        windowManager.updateViewLayout(zzcgmVar2.zzF(), layoutParams);
                    }
                }
            };
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnScrollChangedListener(this.zzc);
            }
        }
        String str2 = (String) map.get("overlay_url");
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        zzcgmVar.loadUrl(str2);
    }
}
