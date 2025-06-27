package com.json;

import com.json.mediationsdk.impressionData.ImpressionDataListener;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public class m9 {
    private static m9 c;

    /* renamed from: a, reason: collision with root package name */
    private final HashSet<ImpressionDataListener> f1893a = new HashSet<>();
    private ConcurrentHashMap<String, List<String>> b = new ConcurrentHashMap<>();

    m9() {
    }

    public static synchronized m9 b() {
        if (c == null) {
            c = new m9();
        }
        return c;
    }

    public HashSet<ImpressionDataListener> a() {
        return this.f1893a;
    }

    public void a(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f1893a.add(impressionDataListener);
        }
    }

    public void a(String str, List<String> list) {
        this.b.put(str, list);
    }

    public void b(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f1893a.remove(impressionDataListener);
        }
    }

    public ConcurrentHashMap<String, List<String>> c() {
        return this.b;
    }

    public void d() {
        synchronized (this) {
            this.f1893a.clear();
        }
    }
}
