package com.mbridge.msdk.newreward.function.d.a;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.newreward.function.d.c.d;
import com.mbridge.msdk.newreward.function.d.c.f;
import com.mbridge.msdk.newreward.function.d.c.g;
import com.mbridge.msdk.newreward.function.d.c.h;
import com.mbridge.msdk.newreward.function.d.c.j;
import com.mbridge.msdk.newreward.function.d.c.k;
import com.mbridge.msdk.newreward.function.d.c.l;
import com.mbridge.msdk.newreward.function.d.c.m;
import com.mbridge.msdk.newreward.function.d.c.n;

/* compiled from: MBridgeCampaign.java */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private b f3342a;
    private CampaignEx b;
    private String c;
    private String d;
    private String e;
    private d<?> f;
    private n g;
    private d<?> h;
    private l i;
    private h j;
    private m k;

    public a(b bVar) {
        this.f3342a = bVar;
    }

    public final m a() {
        CampaignEx.c rewardTemplateMode;
        m mVar = this.k;
        if (mVar != null) {
            return mVar;
        }
        CampaignEx campaignEx = this.b;
        if (campaignEx == null || (rewardTemplateMode = campaignEx.getRewardTemplateMode()) == null) {
            return null;
        }
        String strC = rewardTemplateMode.c();
        if (TextUtils.isEmpty(strC)) {
            return null;
        }
        if (this.k == null) {
            this.k = new m(this.f3342a, this, strC);
        }
        return this.k;
    }

    public final h b() {
        h hVar = this.j;
        if (hVar != null) {
            return hVar;
        }
        CampaignEx campaignEx = this.b;
        if (campaignEx == null || TextUtils.isEmpty(campaignEx.getEndScreenUrl())) {
            return null;
        }
        if (this.j == null) {
            this.j = new h(this.f3342a, this);
        }
        return this.j;
    }

    public final d<?> c() {
        d<?> dVar = this.f;
        if (dVar != null) {
            return dVar;
        }
        CampaignEx campaignEx = this.b;
        if (campaignEx == null || campaignEx.getRewardTemplateMode() == null) {
            return null;
        }
        String strE = campaignEx.getRewardTemplateMode().e();
        if (TextUtils.isEmpty(strE)) {
            return null;
        }
        if (this.f == null) {
            if (com.mbridge.msdk.newreward.function.h.a.b(strE)) {
                this.f = new g(this.f3342a, this);
            } else {
                this.f = new k(this.f3342a, this);
            }
        }
        return this.f;
    }

    public final n d() {
        n nVar = this.g;
        if (nVar != null) {
            return nVar;
        }
        CampaignEx campaignEx = this.b;
        if (campaignEx == null || TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
            return null;
        }
        if (this.g == null) {
            this.g = new n(this.f3342a, this);
        }
        return this.g;
    }

    public final l e() {
        l lVar = this.i;
        if (lVar != null) {
            return lVar;
        }
        CampaignEx campaignEx = this.b;
        if (campaignEx == null || TextUtils.isEmpty(campaignEx.getMraid())) {
            return null;
        }
        if (this.i == null) {
            this.i = new l(this.f3342a, this);
        }
        return this.i;
    }

    public final d<?> f() {
        d<?> dVar = this.h;
        if (dVar != null) {
            return dVar;
        }
        CampaignEx campaignEx = this.b;
        if (campaignEx == null) {
            return null;
        }
        String str = campaignEx.getendcard_url();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (this.h == null) {
            if (!com.mbridge.msdk.newreward.function.h.a.b(str) || ai.l(str)) {
                this.h = new j(this.f3342a, this);
            } else {
                this.h = new f(this.f3342a, this);
            }
        }
        return this.h;
    }

    public final void a(String str) {
        this.c = str;
    }

    public final void a(CampaignEx campaignEx) {
        this.b = campaignEx;
    }

    public final void b(String str) {
        this.d = str;
    }

    public final void c(String str) {
        this.e = str;
    }

    public final CampaignEx g() {
        return this.b;
    }

    public final b h() {
        return this.f3342a;
    }

    public final boolean i() {
        CampaignEx campaignEx = this.b;
        if (campaignEx != null) {
            return campaignEx.isMraid();
        }
        return false;
    }
}
