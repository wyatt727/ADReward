package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.my.tracker.ads.AdFormat;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzegb implements zzegc {
    static /* synthetic */ zzfmy zzc(String str, String str2, String str3, zzegd zzegdVar, String str4, WebView webView, String str5, String str6, zzege zzegeVar) {
        zzfni zzfniVarZza = zzfni.zza("Google", str2);
        zzfnh zzfnhVarZzm = zzm("javascript");
        zzfnd zzfndVarZzk = zzk(zzegdVar.toString());
        if (zzfnhVarZzm == zzfnh.NONE) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Omid html session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (zzfndVarZzk == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Omid html session error; Unable to parse creative type: ".concat(String.valueOf(String.valueOf(zzegdVar))));
            return null;
        }
        zzfnh zzfnhVarZzm2 = zzm(str4);
        if (zzfndVarZzk == zzfnd.VIDEO && zzfnhVarZzm2 == zzfnh.NONE) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Omid html session error; Video events owner unknown for video creative: ".concat(String.valueOf(str4)));
            return null;
        }
        return zzfmy.zza(zzfmz.zza(zzfndVarZzk, zzl(zzegeVar.toString()), zzfnhVarZzm, zzfnhVarZzm2, true), zzfna.zzb(zzfniVarZza, webView, str5, ""));
    }

    static /* synthetic */ zzfmy zzd(String str, String str2, String str3, String str4, zzegd zzegdVar, WebView webView, String str5, String str6, zzege zzegeVar) {
        zzfni zzfniVarZza = zzfni.zza(str, str2);
        zzfnh zzfnhVarZzm = zzm("javascript");
        zzfnh zzfnhVarZzm2 = zzm(str4);
        zzfnd zzfndVarZzk = zzk(zzegdVar.toString());
        if (zzfnhVarZzm == zzfnh.NONE) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Omid js session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (zzfndVarZzk == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Omid js session error; Unable to parse creative type: ".concat(String.valueOf(String.valueOf(zzegdVar))));
            return null;
        }
        if (zzfndVarZzk == zzfnd.VIDEO && zzfnhVarZzm2 == zzfnh.NONE) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Omid js session error; Video events owner unknown for video creative: ".concat(String.valueOf(str4)));
            return null;
        }
        return zzfmy.zza(zzfmz.zza(zzfndVarZzk, zzl(zzegeVar.toString()), zzfnhVarZzm, zzfnhVarZzm2, true), zzfna.zzc(zzfniVarZza, webView, str5, ""));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.gms.internal.ads.zzfnd zzk(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = -382745961(0xffffffffe92fc297, float:-1.3280059E25)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L2a
            r1 = 112202875(0x6b0147b, float:6.6233935E-35)
            if (r0 == r1) goto L20
            r1 = 714893483(0x2a9c68ab, float:2.7783795E-13)
            if (r0 == r1) goto L16
            goto L34
        L16:
            java.lang.String r0 = "nativeDisplay"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = r3
            goto L35
        L20:
            java.lang.String r0 = "video"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = r2
            goto L35
        L2a:
            java.lang.String r0 = "htmlDisplay"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = 0
            goto L35
        L34:
            r4 = -1
        L35:
            if (r4 == 0) goto L43
            if (r4 == r3) goto L40
            if (r4 == r2) goto L3d
            r4 = 0
            return r4
        L3d:
            com.google.android.gms.internal.ads.zzfnd r4 = com.google.android.gms.internal.ads.zzfnd.VIDEO
            return r4
        L40:
            com.google.android.gms.internal.ads.zzfnd r4 = com.google.android.gms.internal.ads.zzfnd.NATIVE_DISPLAY
            return r4
        L43:
            com.google.android.gms.internal.ads.zzfnd r4 = com.google.android.gms.internal.ads.zzfnd.HTML_DISPLAY
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzegb.zzk(java.lang.String):com.google.android.gms.internal.ads.zzfnd");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.gms.internal.ads.zzfng zzl(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = -1104128070(0xffffffffbe3057ba, float:-0.17220965)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L2a
            r1 = 1318088141(0x4e906dcd, float:1.2115575E9)
            if (r0 == r1) goto L20
            r1 = 1988248512(0x768243c0, float:1.3210405E33)
            if (r0 == r1) goto L16
            goto L34
        L16:
            java.lang.String r0 = "onePixel"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = r2
            goto L35
        L20:
            java.lang.String r0 = "definedByJavascript"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = r3
            goto L35
        L2a:
            java.lang.String r0 = "beginToRender"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = 0
            goto L35
        L34:
            r4 = -1
        L35:
            if (r4 == 0) goto L44
            if (r4 == r3) goto L41
            if (r4 == r2) goto L3e
            com.google.android.gms.internal.ads.zzfng r4 = com.google.android.gms.internal.ads.zzfng.UNSPECIFIED
            return r4
        L3e:
            com.google.android.gms.internal.ads.zzfng r4 = com.google.android.gms.internal.ads.zzfng.ONE_PIXEL
            return r4
        L41:
            com.google.android.gms.internal.ads.zzfng r4 = com.google.android.gms.internal.ads.zzfng.DEFINED_BY_JAVASCRIPT
            return r4
        L44:
            com.google.android.gms.internal.ads.zzfng r4 = com.google.android.gms.internal.ads.zzfng.BEGIN_TO_RENDER
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzegb.zzl(java.lang.String):com.google.android.gms.internal.ads.zzfng");
    }

    private static zzfnh zzm(String str) {
        return AdFormat.NATIVE.equals(str) ? zzfnh.NATIVE : "javascript".equals(str) ? zzfnh.JAVASCRIPT : zzfnh.NONE;
    }

    private static final Object zzn(zzega zzegaVar) {
        try {
            return zzegaVar.zza();
        } catch (RuntimeException e) {
            com.google.android.gms.ads.internal.zzu.zzo().zzv(e, "omid exception");
            return null;
        }
    }

    private static final void zzo(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e) {
            com.google.android.gms.ads.internal.zzu.zzo().zzv(e, "omid exception");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzegc
    public final zzfmy zza(final String str, final WebView webView, String str2, String str3, final String str4, final zzege zzegeVar, final zzegd zzegdVar, final String str5) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzeW)).booleanValue() || !zzfmw.zzb()) {
            return null;
        }
        final String str6 = "Google";
        final String str7 = "javascript";
        final String str8 = "";
        return (zzfmy) zzn(new zzega(str6, str, str7, zzegdVar, str4, webView, str5, str8, zzegeVar) { // from class: com.google.android.gms.internal.ads.zzefx
            public final /* synthetic */ String zzb;
            public final /* synthetic */ zzegd zzd;
            public final /* synthetic */ String zze;
            public final /* synthetic */ WebView zzf;
            public final /* synthetic */ String zzg;
            public final /* synthetic */ zzege zzi;
            public final /* synthetic */ String zza = "Google";
            public final /* synthetic */ String zzc = "javascript";
            public final /* synthetic */ String zzh = "";

            {
                this.zzb = str;
                this.zzd = zzegdVar;
                this.zze = str4;
                this.zzf = webView;
                this.zzg = str5;
                this.zzi = zzegeVar;
            }

            @Override // com.google.android.gms.internal.ads.zzega
            public final Object zza() {
                return zzegb.zzc(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzegc
    public final zzfmy zzb(final String str, final WebView webView, String str2, String str3, final String str4, final String str5, final zzege zzegeVar, final zzegd zzegdVar, final String str6) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzeW)).booleanValue() || !zzfmw.zzb()) {
            return null;
        }
        final String str7 = "javascript";
        final String str8 = "";
        return (zzfmy) zzn(new zzega(str5, str, str7, str4, zzegdVar, webView, str6, str8, zzegeVar) { // from class: com.google.android.gms.internal.ads.zzefu
            public final /* synthetic */ String zza;
            public final /* synthetic */ String zzb;
            public final /* synthetic */ String zzd;
            public final /* synthetic */ zzegd zze;
            public final /* synthetic */ WebView zzf;
            public final /* synthetic */ String zzg;
            public final /* synthetic */ zzege zzi;
            public final /* synthetic */ String zzc = "javascript";
            public final /* synthetic */ String zzh = "";

            {
                this.zzd = str4;
                this.zze = zzegdVar;
                this.zzf = webView;
                this.zzg = str6;
                this.zzi = zzegeVar;
            }

            @Override // com.google.android.gms.internal.ads.zzega
            public final Object zza() {
                return zzegb.zzd(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzegc
    public final String zze(Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzeW)).booleanValue()) {
            return (String) zzn(new zzega() { // from class: com.google.android.gms.internal.ads.zzefy
                @Override // com.google.android.gms.internal.ads.zzega
                public final Object zza() {
                    return "a.1.4.10-google_20240110";
                }
            });
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzegc
    public final void zzf(final zzfmy zzfmyVar, final View view) {
        zzo(new Runnable() { // from class: com.google.android.gms.internal.ads.zzefs
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzeW)).booleanValue() && zzfmw.zzb()) {
                    zzfmyVar.zzb(view, zzfnf.NOT_VISIBLE, "Ad overlay");
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzegc
    public final void zzg(final zzfmy zzfmyVar) {
        zzo(new Runnable() { // from class: com.google.android.gms.internal.ads.zzefz
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzeW)).booleanValue() && zzfmw.zzb()) {
                    zzfmyVar.zzc();
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzegc
    public final void zzh(final zzfmy zzfmyVar, final View view) {
        zzo(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeft
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzeW)).booleanValue() && zzfmw.zzb()) {
                    zzfmyVar.zzd(view);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzegc
    public final void zzi(final zzfmy zzfmyVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzeW)).booleanValue() && zzfmw.zzb()) {
            Objects.requireNonNull(zzfmyVar);
            zzo(new Runnable() { // from class: com.google.android.gms.internal.ads.zzefv
                @Override // java.lang.Runnable
                public final void run() {
                    zzfmyVar.zze();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzegc
    public final boolean zzj(final Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzeW)).booleanValue()) {
            Boolean bool = (Boolean) zzn(new zzega() { // from class: com.google.android.gms.internal.ads.zzefw
                @Override // com.google.android.gms.internal.ads.zzega
                public final Object zza() {
                    if (zzfmw.zzb()) {
                        return true;
                    }
                    zzfmw.zza(context);
                    return Boolean.valueOf(zzfmw.zzb());
                }
            });
            return bool != null && bool.booleanValue();
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Omid flag is disabled");
        return false;
    }
}
