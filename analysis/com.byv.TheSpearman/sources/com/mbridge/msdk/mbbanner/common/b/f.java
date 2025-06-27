package com.mbridge.msdk.mbbanner.common.b;

import com.mbridge.msdk.c.k;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.List;

/* compiled from: ProxyBannerShowListener.java */
/* loaded from: classes4.dex */
public class f implements c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f3043a = "f";
    private c b;
    private k c;

    public f(c cVar, k kVar) {
        this.c = kVar;
        this.b = cVar;
    }

    @Override // com.mbridge.msdk.mbbanner.common.b.c
    public final void a(List<CampaignEx> list) {
        c cVar = this.b;
        if (cVar != null) {
            cVar.a(list);
        }
    }

    @Override // com.mbridge.msdk.mbbanner.common.b.c
    public final void a(String str) {
        c cVar = this.b;
        if (cVar != null) {
            cVar.a(str);
        }
    }

    @Override // com.mbridge.msdk.mbbanner.common.b.c
    public final void a() {
        c cVar = this.b;
        if (cVar != null) {
            cVar.a();
        }
    }

    @Override // com.mbridge.msdk.mbbanner.common.b.c
    public final void b() {
        c cVar = this.b;
        if (cVar != null) {
            cVar.b();
        }
    }

    @Override // com.mbridge.msdk.mbbanner.common.b.c
    public final void c() {
        c cVar = this.b;
        if (cVar != null) {
            cVar.c();
        }
    }

    @Override // com.mbridge.msdk.mbbanner.common.b.c
    public final void d() {
        c cVar = this.b;
        if (cVar != null) {
            cVar.d();
        }
    }

    @Override // com.mbridge.msdk.mbbanner.common.b.c
    public final void a(CampaignEx campaignEx) {
        c cVar = this.b;
        if (cVar != null) {
            cVar.a(campaignEx);
        }
    }

    @Override // com.mbridge.msdk.mbbanner.common.b.c
    public final void e() {
        c cVar = this.b;
        if (cVar != null) {
            cVar.e();
        }
    }
}
