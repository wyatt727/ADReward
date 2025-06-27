package com.mbridge.msdk.newreward.a.c;

import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.ad;
import java.util.HashMap;
import java.util.Map;

/* compiled from: MBridgeTimer.java */
/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile a f3290a;
    private Map<String, c> b;
    private Handler c;

    /* compiled from: MBridgeTimer.java */
    /* renamed from: com.mbridge.msdk.newreward.a.c.a$a, reason: collision with other inner class name */
    public interface InterfaceC0282a {
        void a(String str, long j);
    }

    public a() {
        HandlerThread handlerThread = new HandlerThread("MBridgeTimerThread");
        handlerThread.start();
        this.c = new Handler(handlerThread.getLooper());
        this.b = new HashMap();
    }

    public static a a() {
        if (f3290a == null) {
            synchronized (a.class) {
                if (f3290a == null) {
                    f3290a = new a();
                }
            }
        }
        return f3290a;
    }

    public final void a(String str, long j, InterfaceC0282a interfaceC0282a) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (MBridgeConstans.DEBUG) {
            ad.a("MBridgeTimer", "startTimer taskID: " + str + " timeout: " + j);
        }
        if (this.b.containsKey(str)) {
            return;
        }
        c cVar = new c(new b(str, j), interfaceC0282a);
        this.b.put(str, cVar);
        this.c.postDelayed(cVar, j);
    }

    public final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        c cVarRemove = this.b.remove(str);
        if (MBridgeConstans.DEBUG) {
            ad.a("MBridgeTimer", "stopTimer taskID: " + str);
        }
        if (cVarRemove != null) {
            cVarRemove.f3292a.c = true;
            if (cVarRemove == null) {
                return;
            }
            this.c.removeCallbacks(cVarRemove);
        }
    }

    /* compiled from: MBridgeTimer.java */
    public static class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final b f3292a;
        private final InterfaceC0282a b;

        public c(b bVar, InterfaceC0282a interfaceC0282a) {
            this.f3292a = bVar;
            this.b = interfaceC0282a;
        }

        @Override // java.lang.Runnable
        public final void run() {
            InterfaceC0282a interfaceC0282a;
            if (MBridgeConstans.DEBUG) {
                ad.a("MBridgeTimer", "TimerTask run taskID: " + this.f3292a.f3291a + " isStop: " + this.f3292a.c);
            }
            if (this.f3292a.c || (interfaceC0282a = this.b) == null) {
                return;
            }
            try {
                interfaceC0282a.a(this.f3292a.f3291a, this.f3292a.b);
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: MBridgeTimer.java */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f3291a;
        private final long b;
        private boolean c;

        public b(String str, long j) {
            this.f3291a = str;
            this.b = j;
        }
    }
}
