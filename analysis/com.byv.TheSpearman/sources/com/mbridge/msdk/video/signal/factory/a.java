package com.mbridge.msdk.video.signal.factory;

import com.mbridge.msdk.video.signal.a.e;
import com.mbridge.msdk.video.signal.a.h;
import com.mbridge.msdk.video.signal.c;
import com.mbridge.msdk.video.signal.d;
import com.mbridge.msdk.video.signal.f;
import com.mbridge.msdk.video.signal.g;
import com.mbridge.msdk.video.signal.i;
import com.mbridge.msdk.video.signal.j;

/* compiled from: DefaultJSFactory.java */
/* loaded from: classes4.dex */
public class a implements IJSFactory {

    /* renamed from: a, reason: collision with root package name */
    protected com.mbridge.msdk.video.signal.b f3869a;
    protected d b;
    protected j c;
    protected g d;
    protected f e;
    protected i f;
    protected c g;

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public com.mbridge.msdk.video.signal.b getActivityProxy() {
        if (this.f3869a == null) {
            this.f3869a = new com.mbridge.msdk.video.signal.a.b();
        }
        return this.f3869a;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public d getJSCommon() {
        if (this.b == null) {
            this.b = new com.mbridge.msdk.video.signal.a.d();
        }
        return this.b;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public j getJSVideoModule() {
        if (this.c == null) {
            this.c = new h();
        }
        return this.c;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public g getJSNotifyProxy() {
        if (this.d == null) {
            this.d = new com.mbridge.msdk.video.signal.a.f();
        }
        return this.d;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public f getJSContainerModule() {
        if (this.e == null) {
            this.e = new e();
        }
        return this.e;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public i getIJSRewardVideoV1() {
        if (this.f == null) {
            this.f = new com.mbridge.msdk.video.signal.a.g();
        }
        return this.f;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public c getJSBTModule() {
        if (this.g == null) {
            this.g = new com.mbridge.msdk.video.signal.a.c();
        }
        return this.g;
    }
}
