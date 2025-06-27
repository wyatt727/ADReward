package com.mbridge.msdk.video.bt.module.b;

import com.mbridge.msdk.foundation.tools.ad;

/* compiled from: H5ShowRewardListener.java */
/* loaded from: classes4.dex */
public final class c extends b {

    /* renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.video.bt.module.a.b f3608a;
    private String d;

    public c(com.mbridge.msdk.video.bt.module.a.b bVar, String str) {
        this.f3608a = bVar;
        this.d = str;
    }

    @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
    public final void a(com.mbridge.msdk.foundation.same.report.d.b bVar) {
        if (this.f3608a != null) {
            ad.a("H5ShowRewardListener", "onAdShow");
            this.f3608a.a(this.d);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
    public final void a(com.mbridge.msdk.foundation.same.report.d.b bVar, boolean z, com.mbridge.msdk.videocommon.b.c cVar) {
        if (this.f3608a != null) {
            ad.a("H5ShowRewardListener", "onAdClose");
            this.f3608a.a(this.d, z, cVar);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
    public final void a(com.mbridge.msdk.foundation.same.report.d.b bVar, String str) {
        if (this.f3608a != null) {
            ad.a("H5ShowRewardListener", "onShowFail");
            this.f3608a.a(this.d, str);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
    public final void a(boolean z, String str, String str2) {
        if (this.f3608a != null) {
            ad.a("H5ShowRewardListener", "onVideoAdClicked");
            this.f3608a.a(this.d, str, str2);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
    public final void a(String str, String str2) {
        if (this.f3608a != null) {
            ad.a("H5ShowRewardListener", "onVideoComplete");
            this.f3608a.b(this.d, str, str2);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
    public final void b(String str, String str2) {
        if (this.f3608a != null) {
            ad.a("H5ShowRewardListener", "onEndcardShow");
            this.f3608a.c(this.d, str, str2);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
    public final void a(int i, String str, String str2) {
        if (this.f3608a != null) {
            ad.a("H5ShowRewardListener", "onAutoLoad");
            this.f3608a.a(this.d, i, str, str2);
        }
    }
}
