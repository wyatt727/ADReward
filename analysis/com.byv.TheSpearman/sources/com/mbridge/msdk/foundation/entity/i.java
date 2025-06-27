package com.mbridge.msdk.foundation.entity;

import java.io.Serializable;

/* compiled from: LoopEntity.java */
/* loaded from: classes4.dex */
public final class i implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private int f2814a;
    private String b;
    private String c;

    public i(String str, String str2, int i) {
        this.b = str;
        this.c = str2;
        this.f2814a = i;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.c;
    }
}
