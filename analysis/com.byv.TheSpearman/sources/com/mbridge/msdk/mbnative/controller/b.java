package com.mbridge.msdk.mbnative.controller;

import android.os.Handler;
import com.mbridge.msdk.c.k;

/* compiled from: DemandNativePreloadController.java */
/* loaded from: classes4.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    protected Handler f3121a;

    public abstract void a(int i, long j, int i2, k kVar, String str, String str2, com.mbridge.msdk.b.a.a aVar, boolean z);

    public final synchronized void a(int i, long j, int i2, k kVar, String str, String str2, boolean z, com.mbridge.msdk.b.a.a aVar) {
        try {
            a(i, j, i2, kVar, str, str2, aVar, z);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
