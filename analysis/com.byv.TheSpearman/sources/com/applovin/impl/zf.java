package com.applovin.impl;

import android.os.Process;
import androidx.core.util.Consumer;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class zf {

    /* renamed from: a, reason: collision with root package name */
    private final PriorityBlockingQueue f1237a = new PriorityBlockingQueue();
    private final com.applovin.impl.sdk.k b;

    public zf(com.applovin.impl.sdk.k kVar) {
        this.b = kVar;
    }

    public void a(c cVar) {
        if (cVar != null) {
            this.f1237a.add(cVar);
            return;
        }
        throw new IllegalArgumentException("No request specified");
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class b extends Thread {

        /* renamed from: a, reason: collision with root package name */
        private final BlockingQueue f1238a;
        private final com.applovin.impl.sdk.k b;

        private b(BlockingQueue blockingQueue, int i, com.applovin.impl.sdk.k kVar) {
            super("AppLovinSdk:network");
            if (blockingQueue == null) {
                throw new IllegalArgumentException("No request queue specified");
            }
            if (kVar != null) {
                this.f1238a = blockingQueue;
                this.b = kVar;
                setPriority(((Integer) kVar.a(oj.T)).intValue());
                return;
            }
            throw new IllegalArgumentException("No sdk specified");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() throws SecurityException, IllegalArgumentException {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    a();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void b(c cVar, d dVar) {
            cVar.g.accept(dVar);
        }

        private HttpURLConnection a(c cVar) throws ProtocolException {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(cVar.f1239a).openConnection();
            httpURLConnection.setRequestMethod(cVar.b);
            httpURLConnection.setConnectTimeout(cVar.f);
            httpURLConnection.setReadTimeout(cVar.f);
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setAllowUserInteraction(false);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setDoInput(true);
            if (!cVar.c.isEmpty()) {
                for (Map.Entry entry : cVar.c.entrySet()) {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
            return httpURLConnection;
        }

        /* JADX WARN: Removed duplicated region for block: B:148:0x00dc A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:58:0x00d1 A[Catch: all -> 0x013f, TRY_LEAVE, TryCatch #19 {all -> 0x013f, blocks: (B:56:0x00c2, B:58:0x00d1), top: B:153:0x00c2 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void b(final com.applovin.impl.zf.c r18) {
            /*
                Method dump skipped, instructions count: 538
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.zf.b.b(com.applovin.impl.zf$c):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void a(c cVar, d dVar) {
            cVar.g.accept(dVar);
        }

        private void a() {
            b((c) this.f1238a.take());
        }
    }

    public void a() {
        for (int i = 0; i < ((Integer) this.b.a(oj.S)).intValue(); i++) {
            new b(this.f1237a, i, this.b).start();
        }
    }

    public static class c implements Comparable {
        private static final AtomicInteger j = new AtomicInteger();

        /* renamed from: a, reason: collision with root package name */
        private final String f1239a;
        private final String b;
        private final Map c;
        private final byte[] d;
        private final int f;
        private final Consumer g;
        private final Executor h;
        private final int i;

        private c(a aVar) {
            this.f1239a = aVar.f1240a;
            this.b = aVar.b;
            this.c = aVar.c != null ? aVar.c : Collections.emptyMap();
            this.d = aVar.d;
            this.f = aVar.e;
            this.g = aVar.f;
            this.h = aVar.g;
            this.i = j.incrementAndGet();
        }

        @Override // java.lang.Comparable
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            return this.i - cVar.i;
        }

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            private String f1240a;
            private String b;
            private Map c = new HashMap();
            private byte[] d;
            private int e;
            private Consumer f;
            private Executor g;

            public a b(String str) {
                this.b = str;
                return this;
            }

            public a a(byte[] bArr) {
                this.d = bArr;
                return this;
            }

            public a a(String str) {
                this.f1240a = str;
                return this;
            }

            public a a(String str, String str2) {
                this.c.put(str, str2);
                return this;
            }

            public a a(Map map) {
                if (map == null) {
                    map = new HashMap();
                }
                this.c = map;
                return this;
            }

            public a a(Consumer consumer) {
                this.f = consumer;
                return this;
            }

            public a a(Executor executor) {
                this.g = executor;
                return this;
            }

            public a a(int i) {
                this.e = i;
                return this;
            }

            public c a() {
                return new c(this);
            }
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        private final int f1241a;
        private final byte[] b;
        private final byte[] c;
        private final long d;
        private final Throwable e;

        public static a a() {
            return new a();
        }

        private d(a aVar) {
            this.f1241a = aVar.f1242a;
            this.b = aVar.b;
            this.c = aVar.c;
            this.d = aVar.d;
            this.e = aVar.e;
        }

        public int c() throws Throwable {
            Throwable th = this.e;
            if (th == null) {
                return this.f1241a;
            }
            throw th;
        }

        public int b() {
            return this.f1241a;
        }

        public byte[] d() throws Throwable {
            Throwable th = this.e;
            if (th == null) {
                return this.b;
            }
            throw th;
        }

        public byte[] f() {
            return this.c;
        }

        public long e() {
            return this.d;
        }

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            private int f1242a;
            private byte[] b;
            private byte[] c;
            private long d;
            private Throwable e;

            public a a(int i) {
                this.f1242a = i;
                return this;
            }

            public a b(byte[] bArr) {
                this.c = bArr;
                return this;
            }

            public a a(byte[] bArr) {
                this.b = bArr;
                return this;
            }

            public a a(long j) {
                this.d = j;
                return this;
            }

            public a a(Throwable th) {
                this.e = th;
                return this;
            }

            public d a() {
                return new d(this);
            }
        }
    }
}
