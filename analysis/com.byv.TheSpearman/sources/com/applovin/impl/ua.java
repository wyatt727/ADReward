package com.applovin.impl;

import com.applovin.impl.qd;
import com.applovin.impl.we;

/* loaded from: classes.dex */
public abstract class ua implements we.b {

    /* renamed from: a, reason: collision with root package name */
    public final String f1060a;

    @Override // com.applovin.impl.we.b
    public /* synthetic */ void a(qd.b bVar) {
        we.b.CC.$default$a(this, bVar);
    }

    @Override // com.applovin.impl.we.b
    public /* synthetic */ byte[] a() {
        return we.b.CC.$default$a(this);
    }

    @Override // com.applovin.impl.we.b
    public /* synthetic */ d9 b() {
        return we.b.CC.$default$b(this);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ua(String str) {
        this.f1060a = str;
    }

    public String toString() {
        return this.f1060a;
    }
}
