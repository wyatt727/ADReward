package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbkx {
    public static final zzbky zza = new zzbky() { // from class: com.google.android.gms.internal.ads.zzbjv
        @Override // com.google.android.gms.internal.ads.zzbky
        public final void zza(Object obj, Map map) {
            zzchr zzchrVar = (zzchr) obj;
            zzbky zzbkyVar = zzbkx.zza;
            String str = (String) map.get("urls");
            if (TextUtils.isEmpty(str)) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("URLs missing in canOpenURLs GMSG.");
                return;
            }
            String[] strArrSplit = str.split(",");
            HashMap map2 = new HashMap();
            PackageManager packageManager = zzchrVar.getContext().getPackageManager();
            for (String str2 : strArrSplit) {
                String[] strArrSplit2 = str2.split(";", 2);
                boolean z = true;
                if (packageManager.resolveActivity(new Intent(strArrSplit2.length > 1 ? strArrSplit2[1].trim() : "android.intent.action.VIEW", Uri.parse(strArrSplit2[0].trim())), 65536) == null) {
                    z = false;
                }
                Boolean boolValueOf = Boolean.valueOf(z);
                map2.put(str2, boolValueOf);
                com.google.android.gms.ads.internal.util.zze.zza("/canOpenURLs;" + str2 + ";" + boolValueOf);
            }
            ((zzbnt) zzchrVar).zzd("openableURLs", map2);
        }
    };
    public static final zzbky zzb = new zzbky() { // from class: com.google.android.gms.internal.ads.zzbjx
        @Override // com.google.android.gms.internal.ads.zzbky
        public final void zza(Object obj, Map map) {
            zzchr zzchrVar = (zzchr) obj;
            zzbky zzbkyVar = zzbkx.zza;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzii)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("canOpenAppGmsgHandler disabled.");
                return;
            }
            String str = (String) map.get("package_name");
            if (TextUtils.isEmpty(str)) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Package name missing in canOpenApp GMSG.");
                return;
            }
            HashMap map2 = new HashMap();
            Boolean boolValueOf = Boolean.valueOf(zzchrVar.getContext().getPackageManager().getLaunchIntentForPackage(str) != null);
            map2.put(str, boolValueOf);
            com.google.android.gms.ads.internal.util.zze.zza("/canOpenApp;" + str + ";" + boolValueOf);
            ((zzbnt) zzchrVar).zzd("openableApp", map2);
        }
    };
    public static final zzbky zzc = new zzbky() { // from class: com.google.android.gms.internal.ads.zzbka
        @Override // com.google.android.gms.internal.ads.zzbky
        public final void zza(Object obj, Map map) throws JSONException, URISyntaxException {
            zzbkx.zzb((zzchr) obj, map);
        }
    };
    public static final zzbky zzd = new zzbkp();
    public static final zzbky zze = new zzbkq();
    public static final zzbky zzf = new zzbky() { // from class: com.google.android.gms.internal.ads.zzbkb
        @Override // com.google.android.gms.internal.ads.zzbky
        public final void zza(Object obj, Map map) {
            zzchr zzchrVar = (zzchr) obj;
            zzbky zzbkyVar = zzbkx.zza;
            String str = (String) map.get("u");
            if (str == null) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("URL missing from httpTrack GMSG.");
            } else {
                new com.google.android.gms.ads.internal.util.zzca(zzchrVar.getContext(), ((zzchy) zzchrVar).zzn().afmaVersion, str).zzb();
            }
        }
    };
    public static final zzbky zzg = new zzbkr();
    public static final zzbky zzh = new zzbks();
    public static final zzbky zzi = new zzbky() { // from class: com.google.android.gms.internal.ads.zzbjz
        @Override // com.google.android.gms.internal.ads.zzbky
        public final void zza(Object obj, Map map) throws NumberFormatException {
            zzchx zzchxVar = (zzchx) obj;
            zzbky zzbkyVar = zzbkx.zza;
            String str = (String) map.get("tx");
            String str2 = (String) map.get("ty");
            String str3 = (String) map.get("td");
            try {
                int i = Integer.parseInt(str);
                int i2 = Integer.parseInt(str2);
                int i3 = Integer.parseInt(str3);
                zzawo zzawoVarZzI = zzchxVar.zzI();
                if (zzawoVarZzI != null) {
                    zzawoVarZzI.zzc().zzl(i, i2, i3);
                }
            } catch (NumberFormatException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not parse touch parameters from gmsg.");
            }
        }
    };
    public static final zzbky zzj = new zzbkt();
    public static final zzbky zzk = new zzbku();
    public static final zzbky zzl = new zzcem();
    public static final zzbky zzm = new zzcen();
    public static final zzbky zzn = new zzbjr();
    public static final zzblo zzo = new zzblo();
    public static final zzbky zzp = new zzbkv();
    public static final zzbky zzq = new zzbkw();
    public static final zzbky zzr = new zzbkc();
    public static final zzbky zzs = new zzbkd();
    public static final zzbky zzt = new zzbke();
    public static final zzbky zzu = new zzbkf();
    public static final zzbky zzv = new zzbkg();
    public static final zzbky zzw = new zzbkh();
    public static final zzbky zzx = new zzbki();
    public static final zzbky zzy = new zzbkj();
    public static final zzbky zzz = new zzbkk();
    public static final zzbky zzA = new zzbkl();
    public static final zzbky zzB = new zzbkn();
    public static final zzbky zzC = new zzbko();

    public static ListenableFuture zza(zzcgm zzcgmVar, String str) {
        Uri uriZza = Uri.parse(str);
        try {
            zzawo zzawoVarZzI = zzcgmVar.zzI();
            zzfgm zzfgmVarZzQ = zzcgmVar.zzQ();
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzlF)).booleanValue() || zzfgmVarZzQ == null) {
                if (zzawoVarZzI != null && zzawoVarZzI.zzf(uriZza)) {
                    uriZza = zzawoVarZzI.zza(uriZza, zzcgmVar.getContext(), zzcgmVar.zzF(), zzcgmVar.zzi());
                }
            } else if (zzawoVarZzI != null && zzawoVarZzI.zzf(uriZza)) {
                uriZza = zzfgmVarZzQ.zza(uriZza, zzcgmVar.getContext(), zzcgmVar.zzF(), zzcgmVar.zzi());
            }
        } catch (zzawp unused) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Unable to append parameter to URL: ".concat(str));
        }
        final String strZzb = zzcaf.zzb(uriZza, zzcgmVar.getContext());
        long jLongValue = ((Long) zzbfs.zze.zze()).longValue();
        return (jLongValue <= 0 || jLongValue > 241199800) ? zzgee.zzh(strZzb) : zzgee.zze(zzgee.zzm(zzgee.zze(zzgdv.zzu(zzcgmVar.zzS()), Throwable.class, new zzfwf() { // from class: com.google.android.gms.internal.ads.zzbjs
            @Override // com.google.android.gms.internal.ads.zzfwf
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                zzbky zzbkyVar = zzbkx.zza;
                if (!((Boolean) zzbfs.zzk.zze()).booleanValue()) {
                    return "failure_click_attok";
                }
                com.google.android.gms.ads.internal.zzu.zzo().zzw(th, "prepareClickUrl.attestation1");
                return "failure_click_attok";
            }
        }, zzcbr.zzf), new zzfwf() { // from class: com.google.android.gms.internal.ads.zzbjt
            /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
            @Override // com.google.android.gms.internal.ads.zzfwf
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object apply(java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.String r6 = (java.lang.String) r6
                    com.google.android.gms.internal.ads.zzbky r0 = com.google.android.gms.internal.ads.zzbkx.zza
                    java.lang.String r0 = r1
                    if (r6 != 0) goto L9
                    goto L74
                L9:
                    com.google.android.gms.internal.ads.zzbff r1 = com.google.android.gms.internal.ads.zzbfs.zzf
                    java.lang.Object r1 = r1.zze()
                    java.lang.Boolean r1 = (java.lang.Boolean) r1
                    boolean r1 = r1.booleanValue()
                    if (r1 != 0) goto L18
                    goto L39
                L18:
                    java.lang.String r1 = ".doubleclick.net"
                    java.lang.String r2 = ".googleadservices.com"
                    java.lang.String r3 = ".googlesyndication.com"
                    java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3}
                    android.net.Uri r2 = android.net.Uri.parse(r0)
                    java.lang.String r2 = r2.getHost()
                    r3 = 0
                L2b:
                    r4 = 3
                    if (r3 >= r4) goto L74
                    r4 = r1[r3]
                    boolean r4 = r2.endsWith(r4)
                    if (r4 != 0) goto L39
                    int r3 = r3 + 1
                    goto L2b
                L39:
                    com.google.android.gms.internal.ads.zzbff r1 = com.google.android.gms.internal.ads.zzbfs.zza
                    java.lang.Object r1 = r1.zze()
                    java.lang.String r1 = (java.lang.String) r1
                    com.google.android.gms.internal.ads.zzbff r2 = com.google.android.gms.internal.ads.zzbfs.zzb
                    java.lang.Object r2 = r2.zze()
                    java.lang.String r2 = (java.lang.String) r2
                    boolean r3 = android.text.TextUtils.isEmpty(r1)
                    if (r3 != 0) goto L53
                    java.lang.String r0 = r0.replace(r1, r6)
                L53:
                    boolean r1 = android.text.TextUtils.isEmpty(r2)
                    if (r1 != 0) goto L74
                    android.net.Uri r1 = android.net.Uri.parse(r0)
                    java.lang.String r3 = r1.getQueryParameter(r2)
                    boolean r3 = android.text.TextUtils.isEmpty(r3)
                    if (r3 == 0) goto L74
                    android.net.Uri$Builder r0 = r1.buildUpon()
                    android.net.Uri$Builder r6 = r0.appendQueryParameter(r2, r6)
                    java.lang.String r6 = r6.toString()
                    return r6
                L74:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbjt.apply(java.lang.Object):java.lang.Object");
            }
        }, zzcbr.zzf), Throwable.class, new zzfwf() { // from class: com.google.android.gms.internal.ads.zzbju
            @Override // com.google.android.gms.internal.ads.zzfwf
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                zzbky zzbkyVar = zzbkx.zza;
                if (((Boolean) zzbfs.zzk.zze()).booleanValue()) {
                    com.google.android.gms.ads.internal.zzu.zzo().zzw(th, "prepareClickUrl.attestation2");
                }
                return strZzb;
            }
        }, zzcbr.zzf);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ void zzb(com.google.android.gms.internal.ads.zzchr r16, java.util.Map r17) throws org.json.JSONException, java.net.URISyntaxException {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbkx.zzb(com.google.android.gms.internal.ads.zzchr, java.util.Map):void");
    }

    public static void zzc(Map map, zzdgn zzdgnVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzku)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("1") && zzdgnVar != null) {
            zzdgnVar.zzdG();
        }
    }
}
