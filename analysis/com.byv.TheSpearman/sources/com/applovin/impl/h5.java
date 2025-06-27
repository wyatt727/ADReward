package com.applovin.impl;

import java.io.IOException;

/* loaded from: classes.dex */
public class h5 extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public final int f490a;

    public static boolean a(IOException iOException) {
        for (IOException cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof h5) && ((h5) cause).f490a == 2008) {
                return true;
            }
        }
        return false;
    }

    public h5(int i) {
        this.f490a = i;
    }

    public h5(String str, int i) {
        super(str);
        this.f490a = i;
    }

    public h5(String str, Throwable th, int i) {
        super(str, th);
        this.f490a = i;
    }

    public h5(Throwable th, int i) {
        super(th);
        this.f490a = i;
    }
}
