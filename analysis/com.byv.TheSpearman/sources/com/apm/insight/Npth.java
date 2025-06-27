package com.apm.insight;

import android.app.Application;
import android.content.Context;
import com.apm.insight.l.r;
import com.apm.insight.runtime.ConfigManager;
import com.apm.insight.runtime.o;
import java.util.Map;

/* loaded from: classes.dex */
public final class Npth {
    private static boolean sInit;

    public static void addAttachLongUserData(AttachUserData attachUserData, CrashType crashType) {
        if (attachUserData != null) {
            i.b().b(attachUserData, crashType);
        }
    }

    public static void addAttachUserData(AttachUserData attachUserData, CrashType crashType) {
        if (attachUserData != null) {
            i.b().a(attachUserData, crashType);
        }
    }

    public static void addTags(Map<? extends String, ? extends String> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        i.b().a(map);
    }

    public static void checkInnerNpth(boolean z) {
        o.c(z);
    }

    public static void dumpHprof(String str) {
        o.c(str);
    }

    public static void enableALogCollector(String str, com.apm.insight.a.b bVar, com.apm.insight.a.c cVar) {
        o.a(str, bVar, cVar);
    }

    public static void enableAnrInfo(boolean z) {
        o.b(z);
    }

    public static void enableLoopMonitor(boolean z) {
        o.a(z);
    }

    public static void enableNativeDump(boolean z) {
        o.d(z);
    }

    public static void enableThreadsBoost() {
        i.a(1);
    }

    public static ConfigManager getConfigManager() {
        return i.i();
    }

    public static boolean hasCrash() {
        return o.k();
    }

    public static boolean hasCrashWhenJavaCrash() {
        return o.l();
    }

    public static boolean hasCrashWhenNativeCrash() {
        return o.m();
    }

    public static synchronized void init(Application application, Context context, ICommonParams iCommonParams, boolean z, boolean z2, boolean z3, boolean z4, long j) {
        if (sInit) {
            return;
        }
        sInit = true;
        o.a(application, context, true, true, true, true, j);
        i.a(application, context, iCommonParams);
        Map<String, Object> mapA = i.a().a();
        MonitorCrash monitorCrashInit = MonitorCrash.init(context, String.valueOf(r.a(mapA.get("aid"), 4444)), r.a(mapA.get("update_version_code"), 0), String.valueOf(mapA.get("app_version")));
        if (monitorCrashInit != null) {
            monitorCrashInit.config().setDeviceId(i.a().d()).setChannel(String.valueOf(mapA.get("channel")));
        }
    }

    public static synchronized void init(Context context, ICommonParams iCommonParams) {
        init(context, iCommonParams, true, false, false);
    }

    public static synchronized void init(Context context, ICommonParams iCommonParams, boolean z, boolean z2, boolean z3) {
        init(context, iCommonParams, z, z, z2, z3);
    }

    public static synchronized void init(Context context, ICommonParams iCommonParams, boolean z, boolean z2, boolean z3, boolean z4) {
        init(context, iCommonParams, z, z2, z3, z4, 0L);
    }

    public static synchronized void init(Context context, ICommonParams iCommonParams, boolean z, boolean z2, boolean z3, boolean z4, long j) {
        Application applicationH;
        Context baseContext = context;
        synchronized (Npth.class) {
            if (i.h() != null) {
                applicationH = i.h();
            } else if (baseContext instanceof Application) {
                applicationH = (Application) baseContext;
                if (applicationH.getBaseContext() == null) {
                    throw new IllegalArgumentException("The Application passed in when init has not been attached, please pass a attachBaseContext as param and call Npth.setApplication(Application) before init.");
                }
            } else {
                applicationH = (Application) context.getApplicationContext();
                if (applicationH == null) {
                    throw new IllegalArgumentException("Can not get the Application instance since a baseContext was passed in when init, please call Npth.setApplication(Application) before init.");
                }
                if (applicationH.getBaseContext() != null) {
                    baseContext = applicationH.getBaseContext();
                }
            }
            init(applicationH, baseContext, iCommonParams, z, z2, z3, z4, j);
        }
    }

    public static synchronized void initMiniApp(Context context, ICommonParams iCommonParams) {
        i.a(true);
        init(context, iCommonParams, true, false, true, true);
    }

    public static synchronized void initMiniApp(Context context, ICommonParams iCommonParams, int i, String str) {
        i.a(true);
        i.b(i, str);
        init(context, iCommonParams, true, true, true, true);
    }

    public static boolean isANREnable() {
        return o.c();
    }

    public static boolean isInit() {
        return sInit;
    }

    public static boolean isJavaCrashEnable() {
        return o.b();
    }

    public static boolean isNativeCrashEnable() {
        return o.d();
    }

    public static boolean isRunning() {
        return o.i();
    }

    public static boolean isStopUpload() {
        return o.n();
    }

    public static void openANRMonitor() {
        o.g();
    }

    public static void openJavaCrashMonitor() {
        o.f();
    }

    public static boolean openNativeCrashMonitor() {
        return o.h();
    }

    public static void registerCrashCallback(ICrashCallback iCrashCallback, CrashType crashType) {
        o.a(iCrashCallback, crashType);
    }

    public static void registerOOMCallback(IOOMCallback iOOMCallback) {
        o.a(iOOMCallback);
    }

    public static void registerSdk(int i, String str) {
        i.a(i, str);
    }

    public static void removeAttachLongUserData(AttachUserData attachUserData, CrashType crashType) {
        if (attachUserData != null) {
            i.b().b(crashType, attachUserData);
        }
    }

    public static void removeAttachUserData(AttachUserData attachUserData, CrashType crashType) {
        if (attachUserData != null) {
            i.b().a(crashType, attachUserData);
        }
    }

    public static void reportDartError(String str) {
        o.a(str);
    }

    public static void reportDartError(String str, Map<? extends String, ? extends String> map, Map<String, String> map2, g gVar) {
        o.a(str, map, map2, gVar);
    }

    public static void reportDartError(String str, Map<? extends String, ? extends String> map, Map<String, String> map2, Map<String, String> map3, g gVar) {
        o.a(str, map, map2, map3, gVar);
    }

    @Deprecated
    public static void reportError(String str) {
        o.b(str);
    }

    @Deprecated
    public static void reportError(Throwable th) {
        o.a(th);
    }

    public static void setAlogFlushAddr(long j) {
        o.a(j);
    }

    public static void setAlogFlushV2Addr(long j) {
        o.b(j);
    }

    public static void setAlogLogDirAddr(long j) {
        o.c(j);
    }

    public static void setAlogWriteAddr(long j) {
    }

    public static void setAnrInfoFileObserver(String str, f fVar) {
        o.a(str, fVar);
    }

    public static void setApplication(Application application) {
        i.a(application);
    }

    @Deprecated
    public static void setAttachUserData(AttachUserData attachUserData, CrashType crashType) {
        if (attachUserData != null) {
            i.b().a(attachUserData, crashType);
        }
    }

    public static void setBusiness(String str) {
        if (str != null) {
            i.a(str);
        }
    }

    public static void setCrashFilter(ICrashFilter iCrashFilter) {
        i.b().a(iCrashFilter);
    }

    public static void setCurProcessName(String str) {
        com.apm.insight.l.a.a(str);
    }

    public static void setEncryptImpl(e eVar) {
        o.a(eVar);
    }

    public static void setLogcatImpl(com.apm.insight.runtime.j jVar) {
        o.a(jVar);
    }

    public static void setRequestIntercept(com.apm.insight.k.h hVar) {
        o.a(hVar);
    }

    public static void stopAnr() {
        o.j();
    }

    public static void stopUpload() {
        o.o();
    }

    public static void unregisterCrashCallback(ICrashCallback iCrashCallback, CrashType crashType) {
        o.b(iCrashCallback, crashType);
    }

    public static void unregisterOOMCallback(IOOMCallback iOOMCallback, CrashType crashType) {
        o.a(iOOMCallback, crashType);
    }
}
