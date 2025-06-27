package com.mbridge.msdk.video.bt.module.b;

import com.mbridge.msdk.video.bt.module.MBTempContainer;

/* compiled from: ReportBTContainerErrorListener.java */
/* loaded from: classes4.dex */
public final class e extends MBTempContainer.a.C0301a {

    /* renamed from: a, reason: collision with root package name */
    private h f3610a;
    private com.mbridge.msdk.foundation.same.report.d.b b;

    public e(com.mbridge.msdk.foundation.same.report.d.b bVar, h hVar) {
        this.f3610a = hVar;
        this.b = bVar;
    }

    @Override // com.mbridge.msdk.video.bt.module.MBTempContainer.a.C0301a, com.mbridge.msdk.video.bt.module.MBTempContainer.a
    public final void a(String str) {
        super.a(str);
        h hVar = this.f3610a;
        if (hVar != null) {
            hVar.a(this.b, str);
        }
    }
}
