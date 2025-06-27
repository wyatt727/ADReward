package com.mbridge.msdk.video.bt.module.b;

import com.mbridge.msdk.foundation.tools.ad;

/* compiled from: DefaultShowRewardListener.java */
/* loaded from: classes4.dex */
public class b implements h {
    public boolean b = false;
    public boolean c = false;

    @Override // com.mbridge.msdk.video.bt.module.b.h
    public void a(com.mbridge.msdk.foundation.same.report.d.b bVar) {
        ad.a("ShowRewardListener", "onAdShow");
    }

    @Override // com.mbridge.msdk.video.bt.module.b.h
    public void a(com.mbridge.msdk.foundation.same.report.d.b bVar, boolean z, com.mbridge.msdk.videocommon.b.c cVar) {
        ad.a("ShowRewardListener", "onAdClose:isCompleteView:" + z + ",reward:" + cVar);
    }

    @Override // com.mbridge.msdk.video.bt.module.b.h
    public void a(com.mbridge.msdk.foundation.same.report.d.b bVar, String str) {
        ad.a("ShowRewardListener", "onShowFail:" + str);
    }

    @Override // com.mbridge.msdk.video.bt.module.b.h
    public void a(boolean z, String str, String str2) {
        ad.a("ShowRewardListener", "onVideoAdClicked:" + str2);
    }

    @Override // com.mbridge.msdk.video.bt.module.b.h
    public void a(String str, String str2) {
        ad.a("ShowRewardListener", "onVideoComplete: " + str2);
    }

    @Override // com.mbridge.msdk.video.bt.module.b.h
    public void a(boolean z, int i) {
        ad.a("ShowRewardListener", "onAdCloseWithIVReward: " + z + "  " + i);
    }

    @Override // com.mbridge.msdk.video.bt.module.b.h
    public void b(String str, String str2) {
        ad.a("ShowRewardListener", "onEndcardShow: " + str2);
    }

    @Override // com.mbridge.msdk.video.bt.module.b.h
    public void a(int i, String str, String str2) {
        ad.a("ShowRewardListener", "onAutoLoad: " + str2);
    }
}
