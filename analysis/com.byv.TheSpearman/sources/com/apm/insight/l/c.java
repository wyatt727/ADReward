package com.apm.insight.l;

import android.os.Build;
import android.os.Debug;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    static final a f93a;

    private static class a {
        private a() {
        }

        public int a(Debug.MemoryInfo memoryInfo) {
            return -1;
        }

        public int b(Debug.MemoryInfo memoryInfo) {
            return -1;
        }

        public int c(Debug.MemoryInfo memoryInfo) {
            return -1;
        }
    }

    private static class b extends a {
        private b() {
            super();
        }

        @Override // com.apm.insight.l.c.a
        public int a(Debug.MemoryInfo memoryInfo) {
            return memoryInfo.getTotalPrivateClean();
        }

        @Override // com.apm.insight.l.c.a
        public int b(Debug.MemoryInfo memoryInfo) {
            return memoryInfo.getTotalSharedClean();
        }

        @Override // com.apm.insight.l.c.a
        public int c(Debug.MemoryInfo memoryInfo) {
            return memoryInfo.getTotalSwappablePss();
        }
    }

    static {
        f93a = Build.VERSION.SDK_INT >= 19 ? new b() : new a();
    }

    public static int a(Debug.MemoryInfo memoryInfo) {
        return f93a.a(memoryInfo);
    }

    public static int b(Debug.MemoryInfo memoryInfo) {
        return f93a.b(memoryInfo);
    }

    public static int c(Debug.MemoryInfo memoryInfo) {
        return f93a.c(memoryInfo);
    }
}
