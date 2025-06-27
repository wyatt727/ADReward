package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.wrappers.Wrappers;
import com.json.i5;
import com.json.t2;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes3.dex */
public final class zzbvs implements zzbvu {
    public static zzbvu zza;
    static zzbvu zzb;
    static zzbvu zzc;
    private static final Object zzd = new Object();
    private final Context zzf;
    private final ExecutorService zzh;
    private final VersionInfoParcel zzi;
    private final String zzj;
    private final String zzk;
    private final Object zze = new Object();
    private final WeakHashMap zzg = new WeakHashMap();

    protected zzbvs(Context context, VersionInfoParcel versionInfoParcel) {
        PackageInfo packageInfo;
        zzftf.zza();
        this.zzh = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzf = context;
        this.zzi = versionInfoParcel;
        String string = "unknown";
        this.zzj = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzhK)).booleanValue() ? Locale.getDefault().getCountry() : "unknown";
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzhK)).booleanValue()) {
            Handler handler = com.google.android.gms.ads.internal.util.client.zzf.zza;
            if (context != null) {
                try {
                    packageInfo = Wrappers.packageManager(context).getPackageInfo("com.android.vending", 128);
                } catch (PackageManager.NameNotFoundException unused) {
                }
                string = packageInfo == null ? null : Integer.toString(packageInfo.versionCode);
            }
        }
        this.zzk = string;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0033 A[Catch: all -> 0x003e, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0015, B:10:0x0027, B:11:0x0033, B:12:0x003a), top: B:18:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzbvu zza(android.content.Context r3) {
        /*
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzbvs.zzd
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzbvu r1 = com.google.android.gms.internal.ads.zzbvs.zza     // Catch: java.lang.Throwable -> L3e
            if (r1 != 0) goto L3a
            com.google.android.gms.internal.ads.zzbff r1 = com.google.android.gms.internal.ads.zzbgb.zze     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r1 = r1.zze()     // Catch: java.lang.Throwable -> L3e
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L3e
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L3e
            if (r1 == 0) goto L33
            com.google.android.gms.internal.ads.zzbdq r1 = com.google.android.gms.internal.ads.zzbdz.zzhG     // Catch: java.lang.Throwable -> L3e
            com.google.android.gms.internal.ads.zzbdx r2 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r1 = r2.zza(r1)     // Catch: java.lang.Throwable -> L3e
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L3e
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L3e
            if (r1 != 0) goto L33
            com.google.android.gms.internal.ads.zzbvs r1 = new com.google.android.gms.internal.ads.zzbvs     // Catch: java.lang.Throwable -> L3e
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r2 = com.google.android.gms.ads.internal.util.client.VersionInfoParcel.forPackage()     // Catch: java.lang.Throwable -> L3e
            r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L3e
            com.google.android.gms.internal.ads.zzbvs.zza = r1     // Catch: java.lang.Throwable -> L3e
            goto L3a
        L33:
            com.google.android.gms.internal.ads.zzbvt r3 = new com.google.android.gms.internal.ads.zzbvt     // Catch: java.lang.Throwable -> L3e
            r3.<init>()     // Catch: java.lang.Throwable -> L3e
            com.google.android.gms.internal.ads.zzbvs.zza = r3     // Catch: java.lang.Throwable -> L3e
        L3a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            com.google.android.gms.internal.ads.zzbvu r3 = com.google.android.gms.internal.ads.zzbvs.zza
            return r3
        L3e:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbvs.zza(android.content.Context):com.google.android.gms.internal.ads.zzbvu");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0063 A[Catch: all -> 0x006e, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0015, B:10:0x0027, B:12:0x0036, B:13:0x0038, B:16:0x0044, B:20:0x0053, B:21:0x0054, B:22:0x0063, B:23:0x006a, B:14:0x0039, B:15:0x0043), top: B:31:0x0003, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzbvu zzb(android.content.Context r4, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r5) {
        /*
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzbvs.zzd
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzbvu r1 = com.google.android.gms.internal.ads.zzbvs.zzc     // Catch: java.lang.Throwable -> L6e
            if (r1 != 0) goto L6a
            com.google.android.gms.internal.ads.zzbff r1 = com.google.android.gms.internal.ads.zzbgb.zze     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r1 = r1.zze()     // Catch: java.lang.Throwable -> L6e
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L6e
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L6e
            if (r1 == 0) goto L63
            com.google.android.gms.internal.ads.zzbdq r1 = com.google.android.gms.internal.ads.zzbdz.zzhG     // Catch: java.lang.Throwable -> L6e
            com.google.android.gms.internal.ads.zzbdx r2 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r1 = r2.zza(r1)     // Catch: java.lang.Throwable -> L6e
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L6e
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L6e
            if (r1 != 0) goto L63
            com.google.android.gms.internal.ads.zzbvs r1 = new com.google.android.gms.internal.ads.zzbvs     // Catch: java.lang.Throwable -> L6e
            r1.<init>(r4, r5)     // Catch: java.lang.Throwable -> L6e
            android.os.Looper r4 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L6e
            java.lang.Thread r4 = r4.getThread()     // Catch: java.lang.Throwable -> L6e
            if (r4 == 0) goto L54
            java.lang.Object r5 = r1.zze     // Catch: java.lang.Throwable -> L6e
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L6e
            java.util.WeakHashMap r2 = r1.zzg     // Catch: java.lang.Throwable -> L51
            r3 = 1
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L51
            r2.put(r4, r3)     // Catch: java.lang.Throwable -> L51
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L51
            java.lang.Thread$UncaughtExceptionHandler r5 = r4.getUncaughtExceptionHandler()     // Catch: java.lang.Throwable -> L6e
            com.google.android.gms.internal.ads.zzbvr r2 = new com.google.android.gms.internal.ads.zzbvr     // Catch: java.lang.Throwable -> L6e
            r2.<init>(r1, r5)     // Catch: java.lang.Throwable -> L6e
            r4.setUncaughtExceptionHandler(r2)     // Catch: java.lang.Throwable -> L6e
            goto L54
        L51:
            r4 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L51
            throw r4     // Catch: java.lang.Throwable -> L6e
        L54:
            java.lang.Thread$UncaughtExceptionHandler r4 = java.lang.Thread.getDefaultUncaughtExceptionHandler()     // Catch: java.lang.Throwable -> L6e
            com.google.android.gms.internal.ads.zzbvq r5 = new com.google.android.gms.internal.ads.zzbvq     // Catch: java.lang.Throwable -> L6e
            r5.<init>(r1, r4)     // Catch: java.lang.Throwable -> L6e
            java.lang.Thread.setDefaultUncaughtExceptionHandler(r5)     // Catch: java.lang.Throwable -> L6e
            com.google.android.gms.internal.ads.zzbvs.zzc = r1     // Catch: java.lang.Throwable -> L6e
            goto L6a
        L63:
            com.google.android.gms.internal.ads.zzbvt r4 = new com.google.android.gms.internal.ads.zzbvt     // Catch: java.lang.Throwable -> L6e
            r4.<init>()     // Catch: java.lang.Throwable -> L6e
            com.google.android.gms.internal.ads.zzbvs.zzc = r4     // Catch: java.lang.Throwable -> L6e
        L6a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6e
            com.google.android.gms.internal.ads.zzbvu r4 = com.google.android.gms.internal.ads.zzbvs.zzc
            return r4
        L6e:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6e
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbvs.zzb(android.content.Context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel):com.google.android.gms.internal.ads.zzbvu");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037 A[Catch: all -> 0x0042, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0019, B:10:0x002b, B:11:0x0037, B:12:0x003e), top: B:18:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzbvu zzc(android.content.Context r3) {
        /*
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzbvs.zzd
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzbvu r1 = com.google.android.gms.internal.ads.zzbvs.zzb     // Catch: java.lang.Throwable -> L42
            if (r1 != 0) goto L3e
            com.google.android.gms.internal.ads.zzbdq r1 = com.google.android.gms.internal.ads.zzbdz.zzhH     // Catch: java.lang.Throwable -> L42
            com.google.android.gms.internal.ads.zzbdx r2 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L42
            java.lang.Object r1 = r2.zza(r1)     // Catch: java.lang.Throwable -> L42
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L42
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L37
            com.google.android.gms.internal.ads.zzbdq r1 = com.google.android.gms.internal.ads.zzbdz.zzhG     // Catch: java.lang.Throwable -> L42
            com.google.android.gms.internal.ads.zzbdx r2 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L42
            java.lang.Object r1 = r2.zza(r1)     // Catch: java.lang.Throwable -> L42
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L42
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L42
            if (r1 != 0) goto L37
            com.google.android.gms.internal.ads.zzbvs r1 = new com.google.android.gms.internal.ads.zzbvs     // Catch: java.lang.Throwable -> L42
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r2 = com.google.android.gms.ads.internal.util.client.VersionInfoParcel.forPackage()     // Catch: java.lang.Throwable -> L42
            r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L42
            com.google.android.gms.internal.ads.zzbvs.zzb = r1     // Catch: java.lang.Throwable -> L42
            goto L3e
        L37:
            com.google.android.gms.internal.ads.zzbvt r3 = new com.google.android.gms.internal.ads.zzbvt     // Catch: java.lang.Throwable -> L42
            r3.<init>()     // Catch: java.lang.Throwable -> L42
            com.google.android.gms.internal.ads.zzbvs.zzb = r3     // Catch: java.lang.Throwable -> L42
        L3e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
            com.google.android.gms.internal.ads.zzbvu r3 = com.google.android.gms.internal.ads.zzbvs.zzb
            return r3
        L42:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbvs.zzc(android.content.Context):com.google.android.gms.internal.ads.zzbvu");
    }

    public static String zzd(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static String zze(Throwable th) {
        return zzfxg.zzc(com.google.android.gms.ads.internal.util.client.zzf.zzg(zzd(th)));
    }

    protected final void zzf(Thread thread, Throwable th) {
        if (th != null) {
            boolean zZzp = false;
            boolean zEquals = false;
            for (Throwable cause = th; cause != null; cause = cause.getCause()) {
                for (StackTraceElement stackTraceElement : cause.getStackTrace()) {
                    zZzp |= com.google.android.gms.ads.internal.util.client.zzf.zzp(stackTraceElement.getClassName());
                    zEquals |= getClass().getName().equals(stackTraceElement.getClassName());
                }
            }
            if (!zZzp || zEquals) {
                return;
            }
            zzh(th, "", 1.0f);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvu
    public final void zzg(Throwable th, String str) {
        zzh(th, str, 1.0f);
    }

    @Override // com.google.android.gms.internal.ads.zzbvu
    public final void zzh(Throwable th, String str, float f) {
        Throwable th2;
        String packageName;
        PackageInfo packageInfo;
        ActivityManager.MemoryInfo memoryInfoZzc;
        Handler handler = com.google.android.gms.ads.internal.util.client.zzf.zza;
        boolean zIsCallerInstantApp = false;
        if (((Boolean) zzbgb.zzf.zze()).booleanValue()) {
            th2 = th;
        } else {
            LinkedList linkedList = new LinkedList();
            for (Throwable cause = th; cause != null; cause = cause.getCause()) {
                linkedList.push(cause);
            }
            th2 = null;
            while (!linkedList.isEmpty()) {
                Throwable th3 = (Throwable) linkedList.pop();
                StackTraceElement[] stackTrace = th3.getStackTrace();
                ArrayList arrayList = new ArrayList();
                arrayList.add(new StackTraceElement(th3.getClass().getName(), "<filtered>", "<filtered>", 1));
                boolean z = false;
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (com.google.android.gms.ads.internal.util.client.zzf.zzp(stackTraceElement.getClassName())) {
                        arrayList.add(stackTraceElement);
                        z = true;
                    } else {
                        String className = stackTraceElement.getClassName();
                        if (!TextUtils.isEmpty(className) && (className.startsWith("android.") || className.startsWith("java."))) {
                            arrayList.add(stackTraceElement);
                        } else {
                            arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                        }
                    }
                }
                if (z) {
                    th2 = th2 == null ? new Throwable(th3.getMessage()) : new Throwable(th3.getMessage(), th2);
                    th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                }
            }
        }
        if (th2 == null) {
            return;
        }
        String name = th.getClass().getName();
        String strZzd = zzd(th);
        String strZze = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zziJ)).booleanValue() ? zze(th) : "";
        double d = f;
        double dRandom = Math.random();
        int i = f > 0.0f ? (int) (1.0f / f) : 1;
        if (dRandom < d) {
            ArrayList<String> arrayList2 = new ArrayList();
            try {
                zIsCallerInstantApp = Wrappers.packageManager(this.zzf).isCallerInstantApp();
            } catch (Throwable th4) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Error fetching instant app info", th4);
            }
            try {
                packageName = this.zzf.getPackageName();
            } catch (Throwable unused) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Cannot obtain package name, proceeding.");
                packageName = "unknown";
            }
            Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(zIsCallerInstantApp)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter(i5.x, Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT));
            String str2 = Build.MANUFACTURER;
            String str3 = Build.MODEL;
            if (!str3.startsWith(str2)) {
                str3 = str2 + " " + str3;
            }
            Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter(t2.h.G, str3).appendQueryParameter("js", this.zzi.afmaVersion).appendQueryParameter("appid", packageName).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", strZzd).appendQueryParameter("eids", TextUtils.join(",", com.google.android.gms.ads.internal.client.zzba.zza().zza())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "619949182").appendQueryParameter(DownloadCommon.DOWNLOAD_REPORT_RETRY_COUNT, "dev").appendQueryParameter("sampling_rate", Integer.toString(i)).appendQueryParameter("pb_tm", String.valueOf(zzbgb.zzc.zze())).appendQueryParameter("gmscv", String.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzf))).appendQueryParameter("lite", true != this.zzi.isLiteSdk ? "0" : "1");
            if (!TextUtils.isEmpty(strZze)) {
                builderAppendQueryParameter2.appendQueryParameter("hash", strZze);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzhL)).booleanValue() && (memoryInfoZzc = com.google.android.gms.ads.internal.util.client.zzf.zzc(this.zzf)) != null) {
                builderAppendQueryParameter2.appendQueryParameter("available_memory", Long.toString(memoryInfoZzc.availMem));
                builderAppendQueryParameter2.appendQueryParameter("total_memory", Long.toString(memoryInfoZzc.totalMem));
                builderAppendQueryParameter2.appendQueryParameter("is_low_memory", true == memoryInfoZzc.lowMemory ? "1" : "0");
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzhK)).booleanValue()) {
                if (!TextUtils.isEmpty(this.zzj)) {
                    builderAppendQueryParameter2.appendQueryParameter("countrycode", this.zzj);
                }
                if (!TextUtils.isEmpty(this.zzk)) {
                    builderAppendQueryParameter2.appendQueryParameter("psv", this.zzk);
                }
                Context context = this.zzf;
                if (Build.VERSION.SDK_INT >= 26) {
                    packageInfo = WebView.getCurrentWebViewPackage();
                } else if (context == null) {
                    packageInfo = null;
                } else {
                    try {
                        packageInfo = Wrappers.packageManager(context).getPackageInfo("com.android.webview", 128);
                    } catch (PackageManager.NameNotFoundException unused2) {
                    }
                }
                if (packageInfo != null) {
                    builderAppendQueryParameter2.appendQueryParameter("wvvc", Integer.toString(packageInfo.versionCode));
                    builderAppendQueryParameter2.appendQueryParameter("wvvn", packageInfo.versionName);
                    builderAppendQueryParameter2.appendQueryParameter("wvpn", packageInfo.packageName);
                }
            }
            arrayList2.add(builderAppendQueryParameter2.toString());
            for (final String str4 : arrayList2) {
                final com.google.android.gms.ads.internal.util.client.zzr zzrVar = new com.google.android.gms.ads.internal.util.client.zzr(null);
                this.zzh.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbvp
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzrVar.zza(str4);
                    }
                });
            }
        }
    }
}
