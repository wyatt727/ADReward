package com.mbridge.msdk.video.signal.a;

import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.video.module.MBridgeVideoView;

/* compiled from: DefaultJSNotifyProxy.java */
/* loaded from: classes4.dex */
public class f implements com.mbridge.msdk.video.signal.g {
    @Override // com.mbridge.msdk.video.signal.g
    public void a(int i) {
        ad.a("DefaultJSNotifyProxy", "onVideoStatusNotify:" + i);
    }

    @Override // com.mbridge.msdk.video.signal.g
    public void a(int i, String str) {
        ad.a("DefaultJSNotifyProxy", "onClick:" + i + ",pt:" + str);
    }

    @Override // com.mbridge.msdk.video.signal.g
    public void a(MBridgeVideoView.b bVar) {
        ad.a("DefaultJSNotifyProxy", "onProgressNotify:" + bVar.toString());
    }

    @Override // com.mbridge.msdk.video.signal.g
    public void a(Object obj) {
        ad.a("DefaultJSNotifyProxy", "onWebviewShow:" + obj);
    }

    @Override // com.mbridge.msdk.video.signal.g
    public void a(int i, int i2, int i3, int i4) {
        ad.a("DefaultJSNotifyProxy", "showDataInfo");
    }
}
