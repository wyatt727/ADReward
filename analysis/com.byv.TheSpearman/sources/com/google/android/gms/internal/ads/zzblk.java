package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.view.View;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.json.t2;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzblk implements zzbky {
    private final com.google.android.gms.ads.internal.zzb zza;
    private final zzduh zzb;
    private final zzbtm zzd;
    private final zzefd zze;
    private final zzcpk zzf;
    private com.google.android.gms.ads.internal.overlay.zzy zzg = null;
    private final zzgep zzh = zzcbr.zzf;
    private final com.google.android.gms.ads.internal.util.client.zzr zzc = new com.google.android.gms.ads.internal.util.client.zzr(null);

    public zzblk(com.google.android.gms.ads.internal.zzb zzbVar, zzbtm zzbtmVar, zzefd zzefdVar, zzduh zzduhVar, zzcpk zzcpkVar) {
        this.zza = zzbVar;
        this.zzd = zzbtmVar;
        this.zze = zzefdVar;
        this.zzb = zzduhVar;
        this.zzf = zzcpkVar;
    }

    public static int zzb(Map map) {
        String str = (String) map.get("o");
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            return 7;
        }
        if (CmcdHeadersFactory.STREAM_TYPE_LIVE.equalsIgnoreCase(str)) {
            return 6;
        }
        return "c".equalsIgnoreCase(str) ? 14 : -1;
    }

    static Uri zzc(Context context, zzawo zzawoVar, Uri uri, View view, Activity activity, zzfgm zzfgmVar) {
        if (zzawoVar == null) {
            return uri;
        }
        try {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzlF)).booleanValue() || zzfgmVar == null) {
                if (zzawoVar.zze(uri)) {
                    uri = zzawoVar.zza(uri, context, view, activity);
                }
            } else if (zzawoVar.zze(uri)) {
                uri = zzfgmVar.zza(uri, context, view, activity);
            }
        } catch (zzawp unused) {
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "OpenGmsgHandler.maybeAddClickSignalsToUri");
        }
        return uri;
    }

    static Uri zzd(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Error adding click uptime parameter to url: ".concat(String.valueOf(uri.toString())), e);
        }
        return uri;
    }

    public static boolean zzf(Map map) {
        return "1".equals(map.get("custom_close"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzh(java.lang.String r30, com.google.android.gms.ads.internal.client.zza r31, java.util.Map r32, java.lang.String r33) throws java.net.URISyntaxException {
        /*
            Method dump skipped, instructions count: 993
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzblk.zzh(java.lang.String, com.google.android.gms.ads.internal.client.zza, java.util.Map, java.lang.String):void");
    }

    private final void zzi(Context context, String str, String str2) {
        this.zze.zzc(str);
        zzduh zzduhVar = this.zzb;
        if (zzduhVar != null) {
            zzefo.zzc(context, zzduhVar, this.zze, str, "dialog_not_shown", zzfzq.zze("dialog_not_shown_reason", str2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0152, code lost:
    
        r21 = r6;
        r10 = r15;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzj(com.google.android.gms.ads.internal.client.zza r20, java.util.Map r21, boolean r22, java.lang.String r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzblk.zzj(com.google.android.gms.ads.internal.client.zza, java.util.Map, boolean, java.lang.String, boolean):void");
    }

    private final void zzk(boolean z) {
        zzbtm zzbtmVar = this.zzd;
        if (zzbtmVar != null) {
            zzbtmVar.zza(z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008f, code lost:
    
        if ((android.os.Build.VERSION.SDK_INT < 33 ? ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbdz.zzit)).booleanValue() : ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbdz.zzis)).booleanValue()) != false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean zzl(com.google.android.gms.ads.internal.client.zza r9, android.content.Context r10, java.lang.String r11, java.lang.String r12) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.ClassNotFoundException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzblk.zzl(com.google.android.gms.ads.internal.client.zza, android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzm(int i) {
        String str;
        zzduh zzduhVar = this.zzb;
        if (zzduhVar == null) {
            return;
        }
        zzdug zzdugVarZza = zzduhVar.zza();
        zzdugVarZza.zzb(t2.h.h, "cct_action");
        switch (i) {
            case 2:
                str = "CONTEXT_NOT_AN_ACTIVITY";
                break;
            case 3:
                str = "CONTEXT_NULL";
                break;
            case 4:
                str = "CCT_NOT_SUPPORTED";
                break;
            case 5:
                str = "CCT_READY_TO_OPEN";
                break;
            case 6:
                str = "ACTIVITY_NOT_FOUND";
                break;
            case 7:
                str = "EMPTY_URL";
                break;
            case 8:
                str = "UNKNOWN";
                break;
            default:
                str = "WRONG_EXP_SETUP";
                break;
        }
        zzdugVarZza.zzb("cct_open_status", str);
        zzdugVarZza.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzbky
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        com.google.android.gms.ads.internal.client.zza zzaVar = (com.google.android.gms.ads.internal.client.zza) obj;
        String strZzc = zzcaf.zzc((String) map.get("u"), ((zzcgm) zzaVar).getContext(), true);
        String str = (String) map.get("a");
        if (str == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Action missing from an open GMSG.");
            return;
        }
        com.google.android.gms.ads.internal.zzb zzbVar = this.zza;
        if (zzbVar == null || zzbVar.zzc()) {
            zzgee.zzr((((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzjR)).booleanValue() && this.zzf != null && zzcpk.zzj(strZzc)) ? this.zzf.zzb(strZzc, com.google.android.gms.ads.internal.client.zzay.zze()) : zzgee.zzh(strZzc), new zzblg(this, zzaVar, map, str), this.zzh);
        } else {
            zzbVar.zzb(strZzc);
        }
    }
}
