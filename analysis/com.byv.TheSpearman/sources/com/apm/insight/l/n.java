package com.apm.insight.l;

import android.app.ActivityManager;
import android.os.Build;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    static final a f100a;

    private static class a {
        private a() {
        }

        public long a(ActivityManager.MemoryInfo memoryInfo) {
            return 0L;
        }
    }

    private static class b extends a {
        private b() {
            super();
        }

        @Override // com.apm.insight.l.n.a
        public long a(ActivityManager.MemoryInfo memoryInfo) {
            return memoryInfo.totalMem;
        }
    }

    static {
        f100a = Build.VERSION.SDK_INT >= 16 ? new b() : new a();
    }

    public static long a(ActivityManager.MemoryInfo memoryInfo) {
        return f100a.a(memoryInfo);
    }
}
