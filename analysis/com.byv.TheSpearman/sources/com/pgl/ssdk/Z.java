package com.pgl.ssdk;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes4.dex */
public class Z {

    /* renamed from: a, reason: collision with root package name */
    private BlockingQueue f4304a = new LinkedBlockingQueue();

    private Z(int i) {
    }

    public static Z a(int i) {
        return new Z(i);
    }

    public Y a() {
        return (Y) this.f4304a.poll();
    }
}
