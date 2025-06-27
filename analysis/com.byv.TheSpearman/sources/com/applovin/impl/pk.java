package com.applovin.impl;

import com.applovin.impl.qd;
import com.applovin.impl.we;

/* loaded from: classes.dex */
public abstract class pk implements we.b {
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

    public String toString() {
        return "SCTE-35 splice command: type=" + getClass().getSimpleName();
    }
}
