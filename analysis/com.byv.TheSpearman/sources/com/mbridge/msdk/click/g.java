package com.mbridge.msdk.click;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.scheme.applet.AppletSchemeCallBack;
import com.mbridge.msdk.scheme.applet.AppletsModel;

/* compiled from: DefaultAppletSchemeCallBack.java */
/* loaded from: classes4.dex */
public final class g extends AppletSchemeCallBack {

    /* renamed from: a, reason: collision with root package name */
    private final NativeListener.NativeTrackingListener f2532a;
    private final CampaignEx b;
    private final AppletsModel c;
    private final a d;

    @Override // com.mbridge.msdk.scheme.applet.AppletSchemeCallBack
    protected final void onRequestStart() {
    }

    public g(NativeListener.NativeTrackingListener nativeTrackingListener, CampaignEx campaignEx, AppletsModel appletsModel, a aVar) {
        this.f2532a = nativeTrackingListener;
        this.b = campaignEx;
        this.c = appletsModel;
        this.d = aVar;
    }

    @Override // com.mbridge.msdk.scheme.applet.AppletSchemeCallBack
    protected final void onRequestSuccess(String str) {
        CampaignEx campaignEx = this.b;
        if (campaignEx == null || this.c == null) {
            return;
        }
        try {
            NativeListener.NativeTrackingListener nativeTrackingListener = this.f2532a;
            if (nativeTrackingListener != null) {
                try {
                    nativeTrackingListener.onFinishRedirection(campaignEx, campaignEx.getClickURL());
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("DefaultAppletSchemeCallBack", e.getMessage());
                    }
                }
            }
            this.c.setUserClick(false);
            this.c.setRequestingFinish();
            this.b.setDeepLinkUrl(str);
            a aVar = this.d;
            if (aVar != null) {
                try {
                    aVar.a(this.b);
                } catch (Exception e2) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("DefaultAppletSchemeCallBack", e2.getMessage());
                    }
                }
            }
        } catch (Exception e3) {
            if (MBridgeConstans.DEBUG) {
                ad.b("DefaultAppletSchemeCallBack", e3.getMessage());
            }
        }
    }

    @Override // com.mbridge.msdk.scheme.applet.AppletSchemeCallBack
    protected final void onRequestFailed(int i, String str, String str2) {
        CampaignEx campaignEx = this.b;
        if (campaignEx == null || this.c == null) {
            return;
        }
        try {
            NativeListener.NativeTrackingListener nativeTrackingListener = this.f2532a;
            if (nativeTrackingListener != null) {
                try {
                    nativeTrackingListener.onFinishRedirection(campaignEx, campaignEx.getClickURL());
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("DefaultAppletSchemeCallBack", e.getMessage());
                    }
                }
            }
            this.c.setUserClick(false);
            this.c.setRequestingFinish();
            this.b.setClickURL(str2);
            a aVar = this.d;
            if (aVar != null) {
                try {
                    aVar.a(this.b);
                } catch (Exception e2) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("DefaultAppletSchemeCallBack", e2.getMessage());
                    }
                }
            }
        } catch (Exception e3) {
            if (MBridgeConstans.DEBUG) {
                ad.b("DefaultAppletSchemeCallBack", e3.getMessage());
            }
        }
    }
}
