package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsClient;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzbz;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzawo;
import com.google.android.gms.internal.ads.zzawp;
import com.google.android.gms.internal.ads.zzbdz;
import com.google.android.gms.internal.ads.zzbfa;
import com.google.android.gms.internal.ads.zzbfm;
import com.google.android.gms.internal.ads.zzbve;
import com.google.android.gms.internal.ads.zzbvn;
import com.google.android.gms.internal.ads.zzcao;
import com.google.android.gms.internal.ads.zzcat;
import com.google.android.gms.internal.ads.zzcbr;
import com.google.android.gms.internal.ads.zzcik;
import com.google.android.gms.internal.ads.zzdpx;
import com.google.android.gms.internal.ads.zzdum;
import com.google.android.gms.internal.ads.zzfgm;
import com.google.android.gms.internal.ads.zzfhh;
import com.google.android.gms.internal.ads.zzflh;
import com.google.android.gms.internal.ads.zzflk;
import com.google.android.gms.internal.ads.zzfmt;
import com.google.android.gms.internal.ads.zzfwf;
import com.google.android.gms.internal.ads.zzfxg;
import com.google.android.gms.internal.ads.zzgdk;
import com.google.android.gms.internal.ads.zzgdl;
import com.google.android.gms.internal.ads.zzgdv;
import com.google.android.gms.internal.ads.zzgee;
import com.google.android.gms.internal.ads.zzgep;
import com.google.common.util.concurrent.ListenableFuture;
import com.json.t2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes2.dex */
public final class zzab extends zzcao {
    protected static final List zza = new ArrayList(Arrays.asList("/aclk", "/pcs/click", "/dbm/clk"));
    protected static final List zzb = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));
    protected static final List zzc = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"));
    protected static final List zzd = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));
    public static final /* synthetic */ int zze = 0;
    private String zzA;
    private final List zzC;
    private final List zzD;
    private final List zzE;
    private final List zzF;
    private final zzbfa zzJ;
    private final zzcik zzf;
    private Context zzg;
    private final zzawo zzh;
    private final zzfgm zzi;
    private final zzfhh zzj;
    private final zzgep zzk;
    private final ScheduledExecutorService zzl;
    private zzbvn zzm;
    private final zzdum zzq;
    private final zzfmt zzr;
    private final VersionInfoParcel zzz;
    private Point zzn = new Point();
    private Point zzo = new Point();
    private final Set zzp = Collections.newSetFromMap(new WeakHashMap());
    private final AtomicInteger zzy = new AtomicInteger(0);
    private final AtomicBoolean zzG = new AtomicBoolean(false);
    private final AtomicBoolean zzH = new AtomicBoolean(false);
    private final AtomicInteger zzI = new AtomicInteger(0);
    private final boolean zzs = ((Boolean) zzba.zzc().zza(zzbdz.zzho)).booleanValue();
    private final boolean zzt = ((Boolean) zzba.zzc().zza(zzbdz.zzhn)).booleanValue();
    private final boolean zzu = ((Boolean) zzba.zzc().zza(zzbdz.zzhq)).booleanValue();
    private final boolean zzv = ((Boolean) zzba.zzc().zza(zzbdz.zzhs)).booleanValue();
    private final String zzw = (String) zzba.zzc().zza(zzbdz.zzhr);
    private final String zzx = (String) zzba.zzc().zza(zzbdz.zzht);
    private final String zzB = (String) zzba.zzc().zza(zzbdz.zzhu);

    public zzab(zzcik zzcikVar, Context context, zzawo zzawoVar, zzfhh zzfhhVar, zzgep zzgepVar, ScheduledExecutorService scheduledExecutorService, zzdum zzdumVar, zzfmt zzfmtVar, VersionInfoParcel versionInfoParcel, zzbfa zzbfaVar, zzfgm zzfgmVar) {
        List listZzaa;
        this.zzf = zzcikVar;
        this.zzg = context;
        this.zzh = zzawoVar;
        this.zzi = zzfgmVar;
        this.zzj = zzfhhVar;
        this.zzk = zzgepVar;
        this.zzl = scheduledExecutorService;
        this.zzq = zzdumVar;
        this.zzr = zzfmtVar;
        this.zzz = versionInfoParcel;
        this.zzJ = zzbfaVar;
        if (((Boolean) zzba.zzc().zza(zzbdz.zzhv)).booleanValue()) {
            this.zzC = zzaa((String) zzba.zzc().zza(zzbdz.zzhw));
            this.zzD = zzaa((String) zzba.zzc().zza(zzbdz.zzhx));
            this.zzE = zzaa((String) zzba.zzc().zza(zzbdz.zzhy));
            listZzaa = zzaa((String) zzba.zzc().zza(zzbdz.zzhz));
        } else {
            this.zzC = zza;
            this.zzD = zzb;
            this.zzE = zzc;
            listZzaa = zzd;
        }
        this.zzF = listZzaa;
    }

    static /* bridge */ /* synthetic */ void zzH(zzab zzabVar, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (zzabVar.zzO((Uri) it.next())) {
                zzabVar.zzy.getAndIncrement();
                return;
            }
        }
    }

    static final /* synthetic */ Uri zzQ(Uri uri, String str) {
        return !TextUtils.isEmpty(str) ? zzZ(uri, "nas", str) : uri;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.google.android.gms.ads.nonagon.signalgeneration.zzj zzR(android.content.Context r8, java.lang.String r9, java.lang.String r10, com.google.android.gms.ads.internal.client.zzq r11, com.google.android.gms.ads.internal.client.zzl r12, android.os.Bundle r13) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzfgg r0 = new com.google.android.gms.internal.ads.zzfgg
            r0.<init>()
            java.lang.String r1 = "REWARDED"
            boolean r2 = r1.equals(r10)
            java.lang.String r3 = "REWARDED_INTERSTITIAL"
            r4 = 3
            r5 = 2
            if (r2 == 0) goto L19
            com.google.android.gms.internal.ads.zzfft r2 = r0.zzp()
            r2.zza(r5)
            goto L26
        L19:
            boolean r2 = r3.equals(r10)
            if (r2 == 0) goto L26
            com.google.android.gms.internal.ads.zzfft r2 = r0.zzp()
            r2.zza(r4)
        L26:
            com.google.android.gms.internal.ads.zzcik r2 = r7.zzf
            com.google.android.gms.ads.nonagon.signalgeneration.zzi r2 = r2.zzp()
            com.google.android.gms.internal.ads.zzcxy r6 = new com.google.android.gms.internal.ads.zzcxy
            r6.<init>()
            r6.zze(r8)
            if (r9 != 0) goto L38
            java.lang.String r9 = "adUnitId"
        L38:
            r0.zzt(r9)
            if (r12 != 0) goto L46
            com.google.android.gms.ads.internal.client.zzm r9 = new com.google.android.gms.ads.internal.client.zzm
            r9.<init>()
            com.google.android.gms.ads.internal.client.zzl r12 = r9.zza()
        L46:
            r0.zzG(r12)
            r9 = 1
            if (r11 != 0) goto Laa
            int r11 = r10.hashCode()
            r12 = 4
            switch(r11) {
                case -1999289321: goto L79;
                case -428325382: goto L6f;
                case 543046670: goto L67;
                case 1854800829: goto L5f;
                case 1951953708: goto L55;
                default: goto L54;
            }
        L54:
            goto L83
        L55:
            java.lang.String r11 = "BANNER"
            boolean r11 = r10.equals(r11)
            if (r11 == 0) goto L83
            r11 = 0
            goto L84
        L5f:
            boolean r11 = r10.equals(r3)
            if (r11 == 0) goto L83
            r11 = r5
            goto L84
        L67:
            boolean r11 = r10.equals(r1)
            if (r11 == 0) goto L83
            r11 = r9
            goto L84
        L6f:
            java.lang.String r11 = "APP_OPEN_AD"
            boolean r11 = r10.equals(r11)
            if (r11 == 0) goto L83
            r11 = r12
            goto L84
        L79:
            java.lang.String r11 = "NATIVE"
            boolean r11 = r10.equals(r11)
            if (r11 == 0) goto L83
            r11 = r4
            goto L84
        L83:
            r11 = -1
        L84:
            if (r11 == 0) goto La3
            if (r11 == r9) goto L9e
            if (r11 == r5) goto L9e
            if (r11 == r4) goto L99
            if (r11 == r12) goto L94
            com.google.android.gms.ads.internal.client.zzq r11 = new com.google.android.gms.ads.internal.client.zzq
            r11.<init>()
            goto Laa
        L94:
            com.google.android.gms.ads.internal.client.zzq r11 = com.google.android.gms.ads.internal.client.zzq.zzb()
            goto Laa
        L99:
            com.google.android.gms.ads.internal.client.zzq r11 = com.google.android.gms.ads.internal.client.zzq.zzc()
            goto Laa
        L9e:
            com.google.android.gms.ads.internal.client.zzq r11 = com.google.android.gms.ads.internal.client.zzq.zzd()
            goto Laa
        La3:
            com.google.android.gms.ads.internal.client.zzq r11 = new com.google.android.gms.ads.internal.client.zzq
            com.google.android.gms.ads.AdSize r12 = com.google.android.gms.ads.AdSize.BANNER
            r11.<init>(r8, r12)
        Laa:
            r0.zzs(r11)
            r0.zzy(r9)
            r0.zzz(r13)
            com.google.android.gms.internal.ads.zzfgi r8 = r0.zzI()
            r6.zzi(r8)
            com.google.android.gms.internal.ads.zzcya r8 = r6.zzj()
            r2.zza(r8)
            com.google.android.gms.ads.nonagon.signalgeneration.zzae r8 = new com.google.android.gms.ads.nonagon.signalgeneration.zzae
            r8.<init>()
            r8.zza(r10)
            com.google.android.gms.ads.nonagon.signalgeneration.zzag r9 = new com.google.android.gms.ads.nonagon.signalgeneration.zzag
            r10 = 0
            r9.<init>(r8, r10)
            r2.zzb(r9)
            com.google.android.gms.internal.ads.zzdef r8 = new com.google.android.gms.internal.ads.zzdef
            r8.<init>()
            com.google.android.gms.ads.nonagon.signalgeneration.zzj r8 = r2.zzc()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.nonagon.signalgeneration.zzab.zzR(android.content.Context, java.lang.String, java.lang.String, com.google.android.gms.ads.internal.client.zzq, com.google.android.gms.ads.internal.client.zzl, android.os.Bundle):com.google.android.gms.ads.nonagon.signalgeneration.zzj");
    }

    private final ListenableFuture zzS(final String str) {
        final zzdpx[] zzdpxVarArr = new zzdpx[1];
        ListenableFuture listenableFutureZzn = zzgee.zzn(this.zzj.zza(), new zzgdl() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzm
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj) {
                return this.zza.zzv(zzdpxVarArr, str, (zzdpx) obj);
            }
        }, this.zzk);
        listenableFutureZzn.addListener(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzn
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzJ(zzdpxVarArr);
            }
        }, this.zzk);
        return zzgee.zze(zzgee.zzm((zzgdv) zzgee.zzo(zzgdv.zzu(listenableFutureZzn), ((Integer) zzba.zzc().zza(zzbdz.zzhF)).intValue(), TimeUnit.MILLISECONDS, this.zzl), new zzfwf() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzt
            @Override // com.google.android.gms.internal.ads.zzfwf
            public final Object apply(Object obj) {
                int i = zzab.zze;
                return ((JSONObject) obj).optString("nas");
            }
        }, this.zzk), Exception.class, new zzfwf() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzu
            @Override // com.google.android.gms.internal.ads.zzfwf
            public final Object apply(Object obj) {
                int i = zzab.zze;
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", (Exception) obj);
                return null;
            }
        }, this.zzk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzT() {
        zzgee.zzr(((Boolean) zzba.zzc().zza(zzbdz.zzkK)).booleanValue() ? zzgee.zzk(new zzgdk() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzk
            @Override // com.google.android.gms.internal.ads.zzgdk
            public final ListenableFuture zza() {
                return this.zza.zzu();
            }
        }, zzcbr.zza) : zzR(this.zzg, null, AdFormat.BANNER.name(), null, null, new Bundle()).zzb(), new zzaa(this), this.zzf.zzB());
    }

    private final void zzU() {
        if (((Boolean) zzba.zzc().zza(zzbdz.zzjv)).booleanValue()) {
            if (((Boolean) zzba.zzc().zza(zzbdz.zzjy)).booleanValue()) {
                return;
            }
            if (((Boolean) zzba.zzc().zza(zzbdz.zzjC)).booleanValue() && this.zzG.getAndSet(true)) {
                return;
            }
            zzT();
        }
    }

    private final void zzV(List list, final IObjectWrapper iObjectWrapper, zzbve zzbveVar, boolean z) {
        ListenableFuture listenableFutureZzb;
        if (!((Boolean) zzba.zzc().zza(zzbdz.zzhE)).booleanValue()) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("The updating URL feature is not enabled.");
            try {
                zzbveVar.zze("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", e);
                return;
            }
        }
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (zzO((Uri) it.next())) {
                i++;
            }
        }
        if (i > 1) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Multiple google urls found: ".concat(String.valueOf(String.valueOf(list))));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            final Uri uri = (Uri) it2.next();
            if (zzO(uri)) {
                listenableFutureZzb = this.zzk.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzo
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.zza.zzn(uri, iObjectWrapper);
                    }
                });
                if (zzY()) {
                    listenableFutureZzb = zzgee.zzn(listenableFutureZzb, new zzgdl() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzp
                        @Override // com.google.android.gms.internal.ads.zzgdl
                        public final ListenableFuture zza(Object obj) {
                            zzab zzabVar = this.zza;
                            return zzgee.zzm(zzabVar.zzS("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new zzfwf() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzq
                                @Override // com.google.android.gms.internal.ads.zzfwf
                                public final Object apply(Object obj2) {
                                    return zzab.zzQ(uri, (String) obj2);
                                }
                            }, zzabVar.zzk);
                        }
                    }, this.zzk);
                } else {
                    com.google.android.gms.ads.internal.util.client.zzm.zzi("Asset view map is empty.");
                }
            } else {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Not a Google URL: ".concat(String.valueOf(String.valueOf(uri))));
                listenableFutureZzb = zzgee.zzh(uri);
            }
            arrayList.add(listenableFutureZzb);
        }
        zzgee.zzr(zzgee.zzd(arrayList), new zzz(this, zzbveVar, z), this.zzf.zzB());
    }

    private final void zzW(final List list, final IObjectWrapper iObjectWrapper, zzbve zzbveVar, boolean z) {
        if (!((Boolean) zzba.zzc().zza(zzbdz.zzhE)).booleanValue()) {
            try {
                zzbveVar.zze("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", e);
                return;
            }
        }
        ListenableFuture listenableFutureZzb = this.zzk.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzC(list, iObjectWrapper);
            }
        });
        if (zzY()) {
            listenableFutureZzb = zzgee.zzn(listenableFutureZzb, new zzgdl() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzw
                @Override // com.google.android.gms.internal.ads.zzgdl
                public final ListenableFuture zza(Object obj) {
                    return this.zza.zzw((ArrayList) obj);
                }
            }, this.zzk);
        } else {
            com.google.android.gms.ads.internal.util.client.zzm.zzi("Asset view map is empty.");
        }
        zzgee.zzr(listenableFutureZzb, new zzy(this, zzbveVar, z), this.zzf.zzB());
    }

    private static boolean zzX(Uri uri, List list, List list2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (host != null && path != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (path.contains((String) it.next())) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (host.endsWith((String) it2.next())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private final boolean zzY() {
        Map map;
        zzbvn zzbvnVar = this.zzm;
        return (zzbvnVar == null || (map = zzbvnVar.zzb) == null || map.isEmpty()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Uri zzZ(Uri uri, String str, String str2) {
        String string = uri.toString();
        int iIndexOf = string.indexOf("&adurl=");
        if (iIndexOf == -1) {
            iIndexOf = string.indexOf("?adurl=");
        }
        if (iIndexOf == -1) {
            return uri.buildUpon().appendQueryParameter(str, str2).build();
        }
        int i = iIndexOf + 1;
        return Uri.parse(string.substring(0, i) + str + t2.i.b + str2 + t2.i.c + string.substring(i));
    }

    private static final List zzaa(String str) {
        String[] strArrSplit = TextUtils.split(str, ",");
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArrSplit) {
            if (!zzfxg.zzd(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    static /* bridge */ /* synthetic */ zzflh zzr(ListenableFuture listenableFuture, zzcat zzcatVar) {
        if (!zzflk.zza() || !((Boolean) zzbfm.zze.zze()).booleanValue()) {
            return null;
        }
        try {
            zzflh zzflhVarZza = ((zzj) zzgee.zzp(listenableFuture)).zza();
            zzflhVarZza.zze(new ArrayList(Collections.singletonList(zzcatVar.zzb)));
            com.google.android.gms.ads.internal.client.zzl zzlVar = zzcatVar.zzd;
            zzflhVarZza.zzb(zzlVar == null ? "" : zzlVar.zzp);
            return zzflhVarZza;
        } catch (ExecutionException e) {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "SignalGeneratorImpl.getConfiguredCriticalUserJourney");
            return null;
        }
    }

    final /* synthetic */ ArrayList zzB(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (!zzP(uri) || TextUtils.isEmpty(str)) {
                arrayList.add(uri);
            } else {
                arrayList.add(zzZ(uri, "nas", str));
            }
        }
        return arrayList;
    }

    final /* synthetic */ ArrayList zzC(List list, IObjectWrapper iObjectWrapper) throws Exception {
        String strZzh = this.zzh.zzc() != null ? this.zzh.zzc().zzh(this.zzg, (View) ObjectWrapper.unwrap(iObjectWrapper), null) : "";
        if (TextUtils.isEmpty(strZzh)) {
            throw new Exception("Failed to get view signals.");
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (zzP(uri)) {
                arrayList.add(zzZ(uri, "ms", strZzh));
            } else {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Not a Google URL: ".concat(String.valueOf(String.valueOf(uri))));
                arrayList.add(uri);
            }
        }
        if (arrayList.isEmpty()) {
            throw new Exception("Empty impression URLs result.");
        }
        return arrayList;
    }

    final /* synthetic */ void zzJ(zzdpx[] zzdpxVarArr) {
        zzdpx zzdpxVar = zzdpxVarArr[0];
        if (zzdpxVar != null) {
            this.zzj.zzb(zzgee.zzh(zzdpxVar));
        }
    }

    final boolean zzO(Uri uri) {
        return zzX(uri, this.zzC, this.zzD);
    }

    final boolean zzP(Uri uri) {
        return zzX(uri, this.zzE, this.zzF);
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final IObjectWrapper zze(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, String str, IObjectWrapper iObjectWrapper3) {
        if (!((Boolean) zzba.zzc().zza(zzbdz.zzjF)).booleanValue()) {
            return ObjectWrapper.wrap(null);
        }
        this.zzJ.zzg((Context) ObjectWrapper.unwrap(iObjectWrapper), (CustomTabsClient) ObjectWrapper.unwrap(iObjectWrapper2), str, (CustomTabsCallback) ObjectWrapper.unwrap(iObjectWrapper3));
        return ObjectWrapper.wrap(this.zzJ.zzb());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x009e  */
    @Override // com.google.android.gms.internal.ads.zzcap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzf(com.google.android.gms.dynamic.IObjectWrapper r10, final com.google.android.gms.internal.ads.zzcat r11, com.google.android.gms.internal.ads.zzcam r12) {
        /*
            r9 = this;
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            com.google.android.gms.internal.ads.zzbdq r0 = com.google.android.gms.internal.ads.zzbdz.zzcc
            com.google.android.gms.internal.ads.zzbdx r1 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L35
            com.google.android.gms.internal.ads.zzdtq r0 = com.google.android.gms.internal.ads.zzdtq.PUBLIC_API_CALL
            java.lang.String r0 = r0.zza()
            com.google.android.gms.ads.internal.client.zzl r1 = r11.zzd
            long r1 = r1.zzz
            r6.putLong(r0, r1)
            com.google.android.gms.internal.ads.zzdtq r0 = com.google.android.gms.internal.ads.zzdtq.DYNAMITE_ENTER
            java.lang.String r0 = r0.zza()
            com.google.android.gms.common.util.Clock r1 = com.google.android.gms.ads.internal.zzu.zzB()
            long r1 = r1.currentTimeMillis()
            r6.putLong(r0, r1)
        L35:
            java.lang.Object r0 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r10)
            android.content.Context r0 = (android.content.Context) r0
            r9.zzg = r0
            com.google.android.gms.internal.ads.zzflo r1 = com.google.android.gms.internal.ads.zzflo.CUI_NAME_SCAR_SIGNALS
            com.google.android.gms.internal.ads.zzfkw r7 = com.google.android.gms.internal.ads.zzfkv.zza(r0, r1)
            r7.zzi()
            java.lang.String r0 = r11.zzb
            java.lang.String r1 = "UNKNOWN"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L9e
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.android.gms.internal.ads.zzbdq r1 = com.google.android.gms.internal.ads.zzbdz.zzhD
            com.google.android.gms.internal.ads.zzbdx r2 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L7d
            com.google.android.gms.internal.ads.zzbdq r0 = com.google.android.gms.internal.ads.zzbdz.zzhD
            com.google.android.gms.internal.ads.zzbdx r1 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = ","
            java.lang.String[] r0 = r0.split(r1)
            java.util.List r0 = java.util.Arrays.asList(r0)
        L7d:
            com.google.android.gms.ads.internal.client.zzl r1 = r11.zzd
            java.lang.String r1 = com.google.android.gms.ads.nonagon.signalgeneration.zzh.zzb(r1)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L9e
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unknown format is no longer supported."
            r0.<init>(r1)
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgee.zzg(r0)
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>(r1)
            com.google.common.util.concurrent.ListenableFuture r1 = com.google.android.gms.internal.ads.zzgee.zzg(r2)
            goto Lc3
        L9e:
            com.google.android.gms.internal.ads.zzbdq r0 = com.google.android.gms.internal.ads.zzbdz.zzkK
            com.google.android.gms.internal.ads.zzbdx r1 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lc6
            com.google.android.gms.internal.ads.zzgep r0 = com.google.android.gms.internal.ads.zzcbr.zza
            com.google.android.gms.ads.nonagon.signalgeneration.zzr r1 = new com.google.android.gms.ads.nonagon.signalgeneration.zzr
            r1.<init>()
            com.google.common.util.concurrent.ListenableFuture r0 = r0.zzb(r1)
            com.google.android.gms.ads.nonagon.signalgeneration.zzs r1 = new com.google.android.gms.internal.ads.zzgdl() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzs
                static {
                    /*
                        com.google.android.gms.ads.nonagon.signalgeneration.zzs r0 = new com.google.android.gms.ads.nonagon.signalgeneration.zzs
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:com.google.android.gms.ads.nonagon.signalgeneration.zzs) com.google.android.gms.ads.nonagon.signalgeneration.zzs.zza com.google.android.gms.ads.nonagon.signalgeneration.zzs
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.nonagon.signalgeneration.zzs.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.nonagon.signalgeneration.zzs.<init>():void");
                }

                @Override // com.google.android.gms.internal.ads.zzgdl
                public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object r1) {
                    /*
                        r0 = this;
                        com.google.android.gms.ads.nonagon.signalgeneration.zzj r1 = (com.google.android.gms.ads.nonagon.signalgeneration.zzj) r1
                        com.google.common.util.concurrent.ListenableFuture r1 = r1.zzb()
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.nonagon.signalgeneration.zzs.zza(java.lang.Object):com.google.common.util.concurrent.ListenableFuture");
                }
            }
            com.google.android.gms.internal.ads.zzgep r2 = com.google.android.gms.internal.ads.zzcbr.zza
            com.google.common.util.concurrent.ListenableFuture r1 = com.google.android.gms.internal.ads.zzgee.zzn(r0, r1, r2)
        Lc3:
            r2 = r0
            r6 = r1
            goto Ldf
        Lc6:
            android.content.Context r1 = r9.zzg
            java.lang.String r2 = r11.zza
            java.lang.String r3 = r11.zzb
            com.google.android.gms.ads.internal.client.zzq r4 = r11.zzc
            com.google.android.gms.ads.internal.client.zzl r5 = r11.zzd
            r0 = r9
            com.google.android.gms.ads.nonagon.signalgeneration.zzj r0 = r0.zzR(r1, r2, r3, r4, r5, r6)
            com.google.common.util.concurrent.ListenableFuture r1 = com.google.android.gms.internal.ads.zzgee.zzh(r0)
            com.google.common.util.concurrent.ListenableFuture r0 = r0.zzb()
            r6 = r0
            r2 = r1
        Ldf:
            com.google.android.gms.ads.nonagon.signalgeneration.zzx r8 = new com.google.android.gms.ads.nonagon.signalgeneration.zzx
            r0 = r8
            r1 = r9
            r3 = r11
            r4 = r12
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            com.google.android.gms.internal.ads.zzcik r0 = r9.zzf
            java.util.concurrent.Executor r0 = r0.zzB()
            com.google.android.gms.internal.ads.zzgee.zzr(r6, r8, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.nonagon.signalgeneration.zzab.zzf(com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.internal.ads.zzcat, com.google.android.gms.internal.ads.zzcam):void");
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final void zzg(zzbvn zzbvnVar) {
        this.zzm = zzbvnVar;
        this.zzj.zzc(1);
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final void zzh(List list, IObjectWrapper iObjectWrapper, zzbve zzbveVar) {
        zzV(list, iObjectWrapper, zzbveVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final void zzi(List list, IObjectWrapper iObjectWrapper, zzbve zzbveVar) {
        zzW(list, iObjectWrapper, zzbveVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final void zzj(IObjectWrapper iObjectWrapper) {
        if (((Boolean) zzba.zzc().zza(zzbdz.zzju)).booleanValue()) {
            if (!((Boolean) zzba.zzc().zza(zzbdz.zzhC)).booleanValue()) {
                zzU();
            }
            WebView webView = (WebView) ObjectWrapper.unwrap(iObjectWrapper);
            if (webView == null) {
                com.google.android.gms.ads.internal.util.client.zzm.zzg("The webView cannot be null.");
                return;
            }
            if (this.zzp.contains(webView)) {
                com.google.android.gms.ads.internal.util.client.zzm.zzi("This webview has already been registered.");
                return;
            }
            this.zzp.add(webView);
            webView.addJavascriptInterface(new TaggingLibraryJsInterface(webView, this.zzh, this.zzq, this.zzr, this.zzi), "gmaSdk");
            if (((Boolean) zzba.zzc().zza(zzbdz.zzjE)).booleanValue()) {
                com.google.android.gms.ads.internal.zzu.zzo().zzs();
            }
            if (((Boolean) zzba.zzc().zza(zzbdz.zzhC)).booleanValue()) {
                zzU();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final void zzk(IObjectWrapper iObjectWrapper) {
        if (((Boolean) zzba.zzc().zza(zzbdz.zzhE)).booleanValue()) {
            MotionEvent motionEvent = (MotionEvent) ObjectWrapper.unwrap(iObjectWrapper);
            zzbvn zzbvnVar = this.zzm;
            this.zzn = zzbz.zza(motionEvent, zzbvnVar == null ? null : zzbvnVar.zza);
            if (motionEvent.getAction() == 0) {
                this.zzo = this.zzn;
            }
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            motionEventObtain.setLocation(this.zzn.x, this.zzn.y);
            this.zzh.zzd(motionEventObtain);
            motionEventObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final void zzl(List list, IObjectWrapper iObjectWrapper, zzbve zzbveVar) {
        zzV(list, iObjectWrapper, zzbveVar, false);
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final void zzm(List list, IObjectWrapper iObjectWrapper, zzbve zzbveVar) {
        zzW(list, iObjectWrapper, zzbveVar, false);
    }

    final /* synthetic */ Uri zzn(Uri uri, IObjectWrapper iObjectWrapper) throws Exception {
        zzfgm zzfgmVar;
        try {
            uri = (!((Boolean) zzba.zzc().zza(zzbdz.zzlF)).booleanValue() || (zzfgmVar = this.zzi) == null) ? this.zzh.zza(uri, this.zzg, (View) ObjectWrapper.unwrap(iObjectWrapper), null) : zzfgmVar.zza(uri, this.zzg, (View) ObjectWrapper.unwrap(iObjectWrapper), null);
        } catch (zzawp e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("", e);
        }
        if (uri.getQueryParameter("ms") != null) {
            return uri;
        }
        throw new Exception("Failed to append spam signals to click url.");
    }

    final /* synthetic */ zzj zzq(zzcat zzcatVar, Bundle bundle) throws Exception {
        return zzR(this.zzg, zzcatVar.zza, zzcatVar.zzb, zzcatVar.zzc, zzcatVar.zzd, bundle);
    }

    final /* synthetic */ ListenableFuture zzu() throws Exception {
        return zzR(this.zzg, null, AdFormat.BANNER.name(), null, null, new Bundle()).zzb();
    }

    final /* synthetic */ ListenableFuture zzv(zzdpx[] zzdpxVarArr, String str, zzdpx zzdpxVar) throws Exception {
        zzdpxVarArr[0] = zzdpxVar;
        Context context = this.zzg;
        zzbvn zzbvnVar = this.zzm;
        Map map = zzbvnVar.zzb;
        JSONObject jSONObjectZzd = zzbz.zzd(context, map, map, zzbvnVar.zza, null);
        JSONObject jSONObjectZzg = zzbz.zzg(this.zzg, this.zzm.zza);
        JSONObject jSONObjectZzf = zzbz.zzf(this.zzm.zza);
        JSONObject jSONObjectZze = zzbz.zze(this.zzg, this.zzm.zza);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("asset_view_signal", jSONObjectZzd);
        jSONObject.put("ad_view_signal", jSONObjectZzg);
        jSONObject.put("scroll_view_signal", jSONObjectZzf);
        jSONObject.put("lock_screen_signal", jSONObjectZze);
        if ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(str)) {
            jSONObject.put("click_signal", zzbz.zzc(null, this.zzg, this.zzo, this.zzn));
        }
        return zzdpxVar.zzg(str, jSONObject);
    }

    final /* synthetic */ ListenableFuture zzw(final ArrayList arrayList) throws Exception {
        return zzgee.zzm(zzS("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new zzfwf() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzl
            @Override // com.google.android.gms.internal.ads.zzfwf
            public final Object apply(Object obj) {
                return this.zza.zzB(arrayList, (String) obj);
            }
        }, this.zzk);
    }
}
