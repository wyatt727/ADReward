package com.unity3d.player;

import android.database.ContentObserver;
import android.os.Handler;

/* loaded from: classes4.dex */
class E extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    private D f4332a;

    public E(F f, Handler handler, D d) {
        super(handler);
        this.f4332a = d;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        return super.deliverSelfNotifications();
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        D d = this.f4332a;
        if (d != null) {
            ((OrientationLockListener) d).a(z);
        }
    }
}
