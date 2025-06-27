package com.mbridge.msdk.foundation.controller;

import com.mbridge.msdk.foundation.controller.a;

/* compiled from: MBSDKContext.java */
/* loaded from: classes4.dex */
public class c extends a {
    private static volatile c f;

    @Override // com.mbridge.msdk.foundation.controller.a
    protected final void a(a.InterfaceC0263a interfaceC0263a) {
    }

    private c() {
    }

    public static c m() {
        if (f == null) {
            synchronized (c.class) {
                if (f == null) {
                    f = new c();
                }
            }
        }
        return f;
    }
}
