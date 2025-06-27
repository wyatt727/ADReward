package com.mbridge.msdk.splash.f;

import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.out.Frame;
import java.util.List;

/* compiled from: SplashLoadResponseHandler.java */
/* loaded from: classes4.dex */
public abstract class b extends d {

    /* renamed from: a, reason: collision with root package name */
    private int f3511a;

    public abstract void a(int i, String str);

    public abstract void a(CampaignUnit campaignUnit, int i);

    @Override // com.mbridge.msdk.splash.f.d
    public final void a(List<Frame> list) {
    }

    public b(int i) {
        this.f3511a = i;
    }

    @Override // com.mbridge.msdk.splash.f.d
    public final void a(List<com.mbridge.msdk.foundation.same.net.d.b> list, CampaignUnit campaignUnit) {
        a(campaignUnit, this.f3511a);
    }

    @Override // com.mbridge.msdk.splash.f.d
    public final void b(int i, String str) {
        a(i, str);
    }
}
