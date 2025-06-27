package com.mbridge.msdk.video.module.a.a;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;

/* compiled from: CommonContainerNotifyListener.java */
/* loaded from: classes4.dex */
public class a extends f {

    /* renamed from: a, reason: collision with root package name */
    private Activity f3750a;
    private CampaignEx b;

    public a(Activity activity, CampaignEx campaignEx) {
        this.f3750a = activity;
        this.b = campaignEx;
    }

    @Override // com.mbridge.msdk.video.module.a.a.f, com.mbridge.msdk.video.module.a.a
    public void a(int i, Object obj) {
        super.a(i, obj);
        if (i != 106 || this.f3750a == null || this.b == null) {
            return;
        }
        try {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            String strA = com.mbridge.msdk.click.c.a(this.b.getClickURL(), "-999", "-999");
            if (!TextUtils.isEmpty(strA)) {
                intent.setData(Uri.parse(strA));
                this.f3750a.startActivity(intent);
            }
        } catch (Throwable th) {
            ad.a("NotifyListener", th.getMessage(), th);
        }
        this.f3750a.finish();
    }
}
