package com.pgl.ssdk;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public class X extends Handler implements Y {

    /* renamed from: a, reason: collision with root package name */
    protected WeakReference f4303a;
    private final HandlerThread b;

    X(HandlerThread handlerThread, a0 a0Var) {
        super(handlerThread.getLooper());
        if (a0Var != null) {
            this.f4303a = new WeakReference(a0Var);
        }
        this.b = handlerThread;
    }

    public void a(String str) {
        HandlerThread handlerThread = this.b;
        if (handlerThread != null) {
            handlerThread.setName(str);
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        a0 a0Var;
        WeakReference weakReference = this.f4303a;
        if (weakReference == null || (a0Var = (a0) weakReference.get()) == null || message == null) {
            return;
        }
        a0Var.a(message);
    }
}
