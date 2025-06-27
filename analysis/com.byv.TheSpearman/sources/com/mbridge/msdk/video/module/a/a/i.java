package com.mbridge.msdk.video.module.a.a;

/* compiled from: ProxyOnNotifyListener.java */
/* loaded from: classes4.dex */
public class i extends f {
    protected com.mbridge.msdk.video.module.a.a b;

    public i(com.mbridge.msdk.video.module.a.a aVar) {
        this.b = aVar;
    }

    @Override // com.mbridge.msdk.video.module.a.a.f, com.mbridge.msdk.video.module.a.a
    public void a(int i, Object obj) {
        super.a(i, obj);
        com.mbridge.msdk.video.module.a.a aVar = this.b;
        if (aVar != null) {
            aVar.a(i, obj);
        }
    }
}
