package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes3.dex */
public final class zzbzj implements zzbzo {
    public static final /* synthetic */ int zzb = 0;
    private static final List zzc = Collections.synchronizedList(new ArrayList());
    boolean zza;
    private final zzhet zzd;
    private final LinkedHashMap zze;
    private final Context zzh;
    private final zzbzl zzi;
    private final zzbzk zzn;
    private final List zzf = new ArrayList();
    private final List zzg = new ArrayList();
    private final Object zzj = new Object();
    private HashSet zzk = new HashSet();
    private boolean zzl = false;
    private boolean zzm = false;

    public zzbzj(Context context, VersionInfoParcel versionInfoParcel, zzbzl zzbzlVar, String str, zzbzk zzbzkVar) {
        Preconditions.checkNotNull(zzbzlVar, "SafeBrowsing config is not present.");
        this.zzh = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zze = new LinkedHashMap();
        this.zzn = zzbzkVar;
        this.zzi = zzbzlVar;
        Iterator it = zzbzlVar.zze.iterator();
        while (it.hasNext()) {
            this.zzk.add(((String) it.next()).toLowerCase(Locale.ENGLISH));
        }
        this.zzk.remove("cookie".toLowerCase(Locale.ENGLISH));
        zzhet zzhetVarZzc = zzhhn.zzc();
        zzhetVarZzc.zzj(zzhgs.OCTAGON_AD);
        zzhetVarZzc.zzk(str);
        zzhetVarZzc.zzh(str);
        zzheu zzheuVarZzc = zzhev.zzc();
        String str2 = this.zzi.zza;
        if (str2 != null) {
            zzheuVarZzc.zza(str2);
        }
        zzhetVarZzc.zzg((zzhev) zzheuVarZzc.zzbr());
        zzhgy zzhgyVarZzc = zzhgz.zzc();
        zzhgyVarZzc.zzc(Wrappers.packageManager(this.zzh).isCallerInstantApp());
        String str3 = versionInfoParcel.afmaVersion;
        if (str3 != null) {
            zzhgyVarZzc.zza(str3);
        }
        long apkVersion = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzh);
        if (apkVersion > 0) {
            zzhgyVarZzc.zzb(apkVersion);
        }
        zzhetVarZzc.zzf((zzhgz) zzhgyVarZzc.zzbr());
        this.zzd = zzhetVarZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzbzo
    public final zzbzl zza() {
        return this.zzi;
    }

    final /* synthetic */ ListenableFuture zzb(Map map) throws Exception {
        zzhgw zzhgwVar;
        ListenableFuture listenableFutureZzm;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray jSONArrayOptJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (jSONArrayOptJSONArray != null) {
                        synchronized (this.zzj) {
                            int length = jSONArrayOptJSONArray.length();
                            synchronized (this.zzj) {
                                zzhgwVar = (zzhgw) this.zze.get(str);
                            }
                            if (zzhgwVar == null) {
                                zzbzn.zza("Cannot find the corresponding resource object for " + str);
                            } else {
                                for (int i = 0; i < length; i++) {
                                    zzhgwVar.zza(jSONArrayOptJSONArray.getJSONObject(i).getString("threat_type"));
                                }
                                this.zza = (length > 0) | this.zza;
                            }
                        }
                    }
                }
            } catch (JSONException e) {
                if (((Boolean) zzbga.zzb.zze()).booleanValue()) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzf("Failed to get SafeBrowsing metadata", e);
                }
                return zzgee.zzg(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.zza) {
            synchronized (this.zzj) {
                this.zzd.zzj(zzhgs.OCTAGON_AD_SB_MATCH);
            }
        }
        boolean z = this.zza;
        if (!(z && this.zzi.zzg) && (!(this.zzm && this.zzi.zzf) && (z || !this.zzi.zzd))) {
            return zzgee.zzh(null);
        }
        synchronized (this.zzj) {
            Iterator it = this.zze.values().iterator();
            while (it.hasNext()) {
                this.zzd.zzc((zzhgx) ((zzhgw) it.next()).zzbr());
            }
            this.zzd.zza(this.zzf);
            this.zzd.zzb(this.zzg);
            if (zzbzn.zzb()) {
                StringBuilder sb = new StringBuilder("Sending SB report\n  url: " + this.zzd.zzm() + "\n  clickUrl: " + this.zzd.zzl() + "\n  resources: \n");
                for (zzhgx zzhgxVar : this.zzd.zzn()) {
                    sb.append("    [");
                    sb.append(zzhgxVar.zzc());
                    sb.append("] ");
                    sb.append(zzhgxVar.zzg());
                }
                zzbzn.zza(sb.toString());
            }
            ListenableFuture listenableFutureZzb = new com.google.android.gms.ads.internal.util.zzbq(this.zzh).zzb(1, this.zzi.zzb, null, ((zzhhn) this.zzd.zzbr()).zzaV());
            if (zzbzn.zzb()) {
                listenableFutureZzb.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbzg
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzbzn.zza("Pinged SB successfully.");
                    }
                }, zzcbr.zza);
            }
            listenableFutureZzm = zzgee.zzm(listenableFutureZzb, new zzfwf() { // from class: com.google.android.gms.internal.ads.zzbzh
                @Override // com.google.android.gms.internal.ads.zzfwf
                public final Object apply(Object obj) {
                    int i2 = zzbzj.zzb;
                    return null;
                }
            }, zzcbr.zzf);
        }
        return listenableFutureZzm;
    }

    @Override // com.google.android.gms.internal.ads.zzbzo
    public final void zzd(String str, Map map, int i) {
        zzhgv zzhgvVar;
        synchronized (this.zzj) {
            if (i == 3) {
                this.zzm = true;
            }
            if (this.zze.containsKey(str)) {
                if (i == 3 && (zzhgvVar = zzhgv.AD_RESOURCE_AUTO_CLICK_DESTINATION) != null) {
                    ((zzhgw) this.zze.get(str)).zzb(zzhgvVar);
                }
                return;
            }
            zzhgw zzhgwVarZze = zzhgx.zze();
            zzhgv zzhgvVarZzb = zzhgv.zzb(i);
            if (zzhgvVarZzb != null) {
                zzhgwVarZze.zzb(zzhgvVarZzb);
            }
            zzhgwVarZze.zzc(this.zze.size());
            zzhgwVarZze.zze(str);
            zzhfk zzhfkVarZzc = zzhfn.zzc();
            if (!this.zzk.isEmpty() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = entry.getKey() != null ? (String) entry.getKey() : "";
                    String str3 = entry.getValue() != null ? (String) entry.getValue() : "";
                    if (this.zzk.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        zzhfi zzhfiVarZzc = zzhfj.zzc();
                        zzhfiVarZzc.zza(zzgyj.zzw(str2));
                        zzhfiVarZzc.zzb(zzgyj.zzw(str3));
                        zzhfkVarZzc.zza((zzhfj) zzhfiVarZzc.zzbr());
                    }
                }
            }
            zzhgwVarZze.zzd((zzhfn) zzhfkVarZzc.zzbr());
            this.zze.put(str, zzhgwVarZze);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzo
    public final void zze() {
        synchronized (this.zzj) {
            this.zze.keySet();
            ListenableFuture listenableFutureZzn = zzgee.zzn(zzgee.zzh(Collections.emptyMap()), new zzgdl() { // from class: com.google.android.gms.internal.ads.zzbze
                @Override // com.google.android.gms.internal.ads.zzgdl
                public final ListenableFuture zza(Object obj) {
                    return this.zza.zzb((Map) obj);
                }
            }, zzcbr.zzf);
            ListenableFuture listenableFutureZzo = zzgee.zzo(listenableFutureZzn, 10L, TimeUnit.SECONDS, zzcbr.zzd);
            zzgee.zzr(listenableFutureZzn, new zzbzi(this, listenableFutureZzo), zzcbr.zzf);
            zzc.add(listenableFutureZzo);
        }
    }

    final /* synthetic */ void zzf(Bitmap bitmap) {
        zzgyg zzgygVarZzt = zzgyj.zzt();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, zzgygVarZzt);
        synchronized (this.zzj) {
            zzhet zzhetVar = this.zzd;
            zzhgl zzhglVarZzc = zzhgp.zzc();
            zzhglVarZzc.zza(zzgygVarZzt.zzb());
            zzhglVarZzc.zzb(MimeTypes.IMAGE_PNG);
            zzhglVarZzc.zzc(zzhgo.TYPE_CREATIVE);
            zzhetVar.zzi((zzhgp) zzhglVarZzc.zzbr());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0036 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzbzo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzg(android.view.View r8) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzbzl r0 = r7.zzi
            boolean r0 = r0.zzc
            if (r0 != 0) goto L8
            goto L93
        L8:
            boolean r0 = r7.zzl
            if (r0 != 0) goto L93
            com.google.android.gms.ads.internal.zzu.zzp()
            r0 = 1
            r1 = 0
            if (r8 != 0) goto L14
            goto L6d
        L14:
            boolean r2 = r8.isDrawingCacheEnabled()     // Catch: java.lang.RuntimeException -> L2d
            r8.setDrawingCacheEnabled(r0)     // Catch: java.lang.RuntimeException -> L2d
            android.graphics.Bitmap r3 = r8.getDrawingCache()     // Catch: java.lang.RuntimeException -> L2d
            if (r3 == 0) goto L26
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3)     // Catch: java.lang.RuntimeException -> L2d
            goto L27
        L26:
            r3 = r1
        L27:
            r8.setDrawingCacheEnabled(r2)     // Catch: java.lang.RuntimeException -> L2b
            goto L34
        L2b:
            r2 = move-exception
            goto L2f
        L2d:
            r2 = move-exception
            r3 = r1
        L2f:
            java.lang.String r4 = "Fail to capture the web view"
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r4, r2)
        L34:
            if (r3 != 0) goto L6c
            int r2 = r8.getWidth()     // Catch: java.lang.RuntimeException -> L65
            int r3 = r8.getHeight()     // Catch: java.lang.RuntimeException -> L65
            if (r2 == 0) goto L5f
            if (r3 != 0) goto L43
            goto L5f
        L43:
            int r4 = r8.getWidth()     // Catch: java.lang.RuntimeException -> L65
            int r5 = r8.getHeight()     // Catch: java.lang.RuntimeException -> L65
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.RGB_565     // Catch: java.lang.RuntimeException -> L65
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4, r5, r6)     // Catch: java.lang.RuntimeException -> L65
            android.graphics.Canvas r5 = new android.graphics.Canvas     // Catch: java.lang.RuntimeException -> L65
            r5.<init>(r4)     // Catch: java.lang.RuntimeException -> L65
            r6 = 0
            r8.layout(r6, r6, r2, r3)     // Catch: java.lang.RuntimeException -> L65
            r8.draw(r5)     // Catch: java.lang.RuntimeException -> L65
            r1 = r4
            goto L6d
        L5f:
            java.lang.String r8 = "Width or height of view is zero"
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r8)     // Catch: java.lang.RuntimeException -> L65
            goto L6d
        L65:
            r8 = move-exception
            java.lang.String r2 = "Fail to capture the webview"
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r2, r8)
            goto L6d
        L6c:
            r1 = r3
        L6d:
            if (r1 != 0) goto L75
            java.lang.String r8 = "Failed to capture the webview bitmap."
            com.google.android.gms.internal.ads.zzbzn.zza(r8)
            return
        L75:
            r7.zzl = r0
            com.google.android.gms.internal.ads.zzbzf r8 = new com.google.android.gms.internal.ads.zzbzf
            r8.<init>()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            if (r0 == r1) goto L8e
            r8.run()
            return
        L8e:
            com.google.android.gms.internal.ads.zzgep r0 = com.google.android.gms.internal.ads.zzcbr.zza
            r0.execute(r8)
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbzj.zzg(android.view.View):void");
    }

    @Override // com.google.android.gms.internal.ads.zzbzo
    public final void zzh(String str) {
        synchronized (this.zzj) {
            if (str == null) {
                this.zzd.zzd();
            } else {
                this.zzd.zze(str);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzo
    public final boolean zzi() {
        return PlatformVersion.isAtLeastKitKat() && this.zzi.zzc && !this.zzl;
    }
}
