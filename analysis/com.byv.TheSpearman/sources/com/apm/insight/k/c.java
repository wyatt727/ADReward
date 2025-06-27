package com.apm.insight.k;

import com.apm.insight.CrashType;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private static ConcurrentLinkedQueue<c> f76a = new ConcurrentLinkedQueue<>();

    /* renamed from: com.apm.insight.k.c$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f77a;

        static {
            int[] iArr = new int[CrashType.values().length];
            f77a = iArr;
            try {
                iArr[CrashType.JAVA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f77a[CrashType.LAUNCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f77a[CrashType.NATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private JSONObject f78a;
        private JSONObject b;
        private CrashType c;

        a(JSONObject jSONObject, CrashType crashType) {
            this.c = crashType;
            if (crashType == CrashType.LAUNCH) {
                this.f78a = ((JSONArray) jSONObject.opt("data")).optJSONObject(0);
            } else {
                this.f78a = jSONObject;
            }
            this.b = jSONObject.optJSONObject("header");
        }

        public String a() {
            return this.f78a.optString("crash_thread_name", null);
        }

        public long b() {
            return this.f78a.optInt("app_start_time", -1);
        }

        public String c() {
            int i = AnonymousClass1.f77a[this.c.ordinal()];
            if (i == 1) {
                return this.f78a.optString("data", null);
            }
            if (i == 2) {
                return this.f78a.optString("stack", null);
            }
            if (i != 3) {
                return null;
            }
            return this.f78a.optString("data", null);
        }
    }

    static void a(CrashType crashType, JSONObject jSONObject) {
        ConcurrentLinkedQueue<c> concurrentLinkedQueue = f76a;
        if (concurrentLinkedQueue == null || concurrentLinkedQueue.isEmpty()) {
            return;
        }
        a aVar = new a(jSONObject, crashType);
        while (!f76a.isEmpty()) {
            c cVarPoll = f76a.poll();
            if (cVarPoll != null) {
                cVarPoll.a(crashType, aVar);
            }
        }
        f76a = null;
    }

    public abstract void a(CrashType crashType, a aVar);
}
