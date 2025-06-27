package com.mbridge.msdk.video.signal.a;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;

/* compiled from: DefaultJSBTModule.java */
/* loaded from: classes4.dex */
public class c implements com.mbridge.msdk.video.signal.c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f3766a = "c";

    @Override // com.mbridge.msdk.video.signal.e
    public void click(int i, String str) {
        ad.a(f3766a, CampaignEx.JSON_NATIVE_VIDEO_CLICK);
    }

    @Override // com.mbridge.msdk.video.signal.e
    public void handlerH5Exception(int i, String str) {
        ad.a(f3766a, "handlerH5Exception");
    }

    @Override // com.mbridge.msdk.video.signal.c
    public void reactDeveloper(Object obj, String str) {
        ad.a(f3766a, "reactDeveloper");
    }

    @Override // com.mbridge.msdk.video.signal.c
    public void reportUrls(Object obj, String str) {
        ad.a(f3766a, "reportUrls");
    }
}
