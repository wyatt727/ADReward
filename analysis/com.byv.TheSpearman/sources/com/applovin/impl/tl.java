package com.applovin.impl;

import android.os.Handler;
import android.os.Message;
import com.applovin.impl.ha;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class tl implements ha {
    private static final List b = new ArrayList(50);

    /* renamed from: a, reason: collision with root package name */
    private final Handler f1039a;

    @Override // com.applovin.impl.ha
    public ha.a d(int i) {
        return a().a(this.f1039a.obtainMessage(i), this);
    }

    public tl(Handler handler) {
        this.f1039a = handler;
    }

    @Override // com.applovin.impl.ha
    public boolean a(int i) {
        return this.f1039a.hasMessages(i);
    }

    @Override // com.applovin.impl.ha
    public boolean c(int i) {
        return this.f1039a.sendEmptyMessage(i);
    }

    @Override // com.applovin.impl.ha
    public void b(int i) {
        this.f1039a.removeMessages(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(b bVar) {
        List list = b;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(bVar);
            }
        }
    }

    private static final class b implements ha.a {

        /* renamed from: a, reason: collision with root package name */
        private Message f1040a;
        private tl b;

        private b() {
        }

        public boolean a(Handler handler) {
            boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) a1.a(this.f1040a));
            b();
            return zSendMessageAtFrontOfQueue;
        }

        private void b() {
            this.f1040a = null;
            this.b = null;
            tl.b(this);
        }

        @Override // com.applovin.impl.ha.a
        public void a() {
            ((Message) a1.a(this.f1040a)).sendToTarget();
            b();
        }

        public b a(Message message, tl tlVar) {
            this.f1040a = message;
            this.b = tlVar;
            return this;
        }
    }

    @Override // com.applovin.impl.ha
    public boolean a(Runnable runnable) {
        return this.f1039a.post(runnable);
    }

    @Override // com.applovin.impl.ha
    public void a(Object obj) {
        this.f1039a.removeCallbacksAndMessages(obj);
    }

    @Override // com.applovin.impl.ha
    public boolean a(int i, long j) {
        return this.f1039a.sendEmptyMessageAtTime(i, j);
    }

    @Override // com.applovin.impl.ha
    public boolean a(ha.a aVar) {
        return ((b) aVar).a(this.f1039a);
    }

    @Override // com.applovin.impl.ha
    public ha.a a(int i, Object obj) {
        return a().a(this.f1039a.obtainMessage(i, obj), this);
    }

    @Override // com.applovin.impl.ha
    public ha.a a(int i, int i2, int i3) {
        return a().a(this.f1039a.obtainMessage(i, i2, i3), this);
    }

    @Override // com.applovin.impl.ha
    public ha.a a(int i, int i2, int i3, Object obj) {
        return a().a(this.f1039a.obtainMessage(i, i2, i3, obj), this);
    }

    private static b a() {
        b bVar;
        List list = b;
        synchronized (list) {
            if (list.isEmpty()) {
                bVar = new b();
            } else {
                bVar = (b) list.remove(list.size() - 1);
            }
        }
        return bVar;
    }
}
