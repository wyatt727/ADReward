package com.mbridge.msdk.video.signal.container;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.widget.FrameLayout;
import com.mbridge.msdk.foundation.d.b;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.video.signal.a.k;
import com.mbridge.msdk.video.signal.d;
import com.mbridge.msdk.video.signal.f;
import com.mbridge.msdk.video.signal.factory.IJSFactory;
import com.mbridge.msdk.video.signal.factory.a;
import com.mbridge.msdk.video.signal.g;
import com.mbridge.msdk.video.signal.i;
import com.mbridge.msdk.video.signal.j;
import com.mbridge.msdk.videocommon.a;
import com.mbridge.msdk.videocommon.d.c;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class AbstractJSContainer extends FrameLayout implements IJSFactory {

    /* renamed from: a, reason: collision with root package name */
    private int f3868a;
    private int b;
    protected Activity i;
    protected String j;
    protected String k;
    protected c l;
    protected String m;
    protected com.mbridge.msdk.videocommon.b.c n;
    protected String o;
    protected int p;
    protected boolean q;
    protected boolean r;
    protected int s;
    protected int t;
    protected int u;
    protected boolean v;
    protected IJSFactory w;

    public AbstractJSContainer(Context context) {
        super(context);
        this.f3868a = 0;
        this.b = 1;
        this.p = 2;
        this.q = false;
        this.r = false;
        this.v = false;
        this.w = new a();
    }

    public AbstractJSContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3868a = 0;
        this.b = 1;
        this.p = 2;
        this.q = false;
        this.r = false;
        this.v = false;
        this.w = new a();
    }

    public void registerJsFactory(IJSFactory iJSFactory) {
        this.w = iJSFactory;
    }

    public void onResume() {
        if (b.c) {
            return;
        }
        if (getJSCommon().b()) {
            getActivityProxy().b();
        }
        getActivityProxy().a(0);
    }

    public void onPause() {
        if (getJSCommon().b()) {
            getActivityProxy().a();
        }
        getActivityProxy().a(1);
    }

    public void onStop() {
        if (getJSCommon().b()) {
            getActivityProxy().d();
        }
        getActivityProxy().a(3);
    }

    public void onRestart() {
        if (getJSCommon().b()) {
            getActivityProxy().f();
        }
        getActivityProxy().a(4);
    }

    public void onStart() {
        if (getJSCommon().b()) {
            getActivityProxy().e();
        }
        getActivityProxy().a(2);
    }

    public void onDestroy() {
        if (getJSCommon().b()) {
            getActivityProxy().c();
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        if (getJSCommon().b()) {
            getActivityProxy().a(configuration);
        }
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public com.mbridge.msdk.video.signal.b getActivityProxy() {
        return this.w.getActivityProxy();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public d getJSCommon() {
        return this.w.getJSCommon();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public j getJSVideoModule() {
        return this.w.getJSVideoModule();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public g getJSNotifyProxy() {
        return this.w.getJSNotifyProxy();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public f getJSContainerModule() {
        return this.w.getJSContainerModule();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public i getIJSRewardVideoV1() {
        return this.w.getIJSRewardVideoV1();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public com.mbridge.msdk.video.signal.c getJSBTModule() {
        return this.w.getJSBTModule();
    }

    protected final void a(Object obj) {
        com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(obj, a(this.f3868a));
    }

    protected final void a(Object obj, String str) {
        com.mbridge.msdk.mbsignalcommon.windvane.g.a().b(obj, Base64.encodeToString(str.getBytes(), 2));
    }

    private String a(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i);
            String string = jSONObject.toString();
            return !TextUtils.isEmpty(string) ? Base64.encodeToString(string.getBytes(), 2) : "";
        } catch (Throwable unused) {
            ad.b("AbstractJSContainer", "code to string is error");
            return "";
        }
    }

    public void setRewardId(String str) {
        this.o = str;
    }

    public void setUserId(String str) {
        this.m = str;
    }

    public void setUnitId(String str) {
        this.j = str;
    }

    public String getUnitId() {
        return this.j;
    }

    public String getPlacementId() {
        return this.k;
    }

    public void setPlacementId(String str) {
        this.k = str;
    }

    public void setActivity(Activity activity) {
        this.i = activity;
    }

    public void setReward(com.mbridge.msdk.videocommon.b.c cVar) {
        this.n = cVar;
    }

    public void setMute(int i) {
        this.p = i;
    }

    public void setIV(boolean z) {
        this.q = z;
    }

    public void setBidCampaign(boolean z) {
        this.r = z;
    }

    public void setIVRewardEnable(int i, int i2, int i3) {
        this.s = i;
        this.t = i2;
        this.u = i3;
    }

    public void setBigOffer(boolean z) {
        this.v = z;
    }

    public void setRewardUnitSetting(c cVar) {
        this.l = cVar;
    }

    protected void a(String str) {
        ad.b("AbstractJSContainer", str);
        Activity activity = this.i;
        if (activity != null) {
            activity.finish();
        }
    }

    protected final k b(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return null;
        }
        a.C0310a c0310aA = com.mbridge.msdk.videocommon.a.a(this.q ? 287 : 94, campaignEx);
        if (c0310aA != null && c0310aA.c()) {
            WindVaneWebView windVaneWebViewA = c0310aA.a();
            if (windVaneWebViewA.getObject() instanceof k) {
                return (k) windVaneWebViewA.getObject();
            }
        }
        return null;
    }

    protected final int c(CampaignEx campaignEx) {
        k kVarB = b(campaignEx);
        if (kVarB != null) {
            return kVarB.o();
        }
        return 0;
    }

    protected final void a(c cVar, CampaignEx campaignEx) {
        CampaignEx.c rewardTemplateMode;
        if (c(campaignEx) == 1) {
            return;
        }
        boolean zB = false;
        if (campaignEx != null && (rewardTemplateMode = campaignEx.getRewardTemplateMode()) != null) {
            zB = b(rewardTemplateMode.b());
        }
        if (zB || cVar == null) {
            return;
        }
        b(this.l.c());
    }

    private boolean b(int i) {
        boolean z = false;
        try {
            if (i != 1) {
                if (i != 2) {
                    return false;
                }
                if (Build.VERSION.SDK_INT >= 18) {
                    this.i.setRequestedOrientation(11);
                } else {
                    this.i.setRequestedOrientation(0);
                }
            } else if (Build.VERSION.SDK_INT >= 18) {
                this.i.setRequestedOrientation(12);
            } else {
                this.i.setRequestedOrientation(1);
            }
            z = true;
            return true;
        } catch (Throwable th) {
            ad.a("AbstractJSContainer", th.getMessage(), th);
            return z;
        }
    }

    protected final String b() {
        c cVar;
        if (TextUtils.isEmpty(this.k) && (cVar = this.l) != null && !TextUtils.isEmpty(cVar.z())) {
            return this.l.z();
        }
        return this.k;
    }
}
