package com.mbridge.msdk.click;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* compiled from: CommonJumpLoader.java */
/* loaded from: classes4.dex */
public final class d extends e {
    private int d;
    private com.mbridge.msdk.foundation.same.e.b g;
    private n h;

    /* renamed from: a, reason: collision with root package name */
    JumpLoaderResult f2528a = null;
    private int b = 0;
    private String c = null;
    private f e = null;
    private boolean f = true;
    private Handler i = new Handler(Looper.getMainLooper());

    public d(Context context) {
        this.g = new com.mbridge.msdk.foundation.same.e.b(context);
        this.h = new n(context);
    }

    public final void a(String str, CampaignEx campaignEx, f fVar, String str2, boolean z, boolean z2, int i) {
        String id;
        this.c = str2;
        this.e = fVar;
        this.f2528a = null;
        this.d = i;
        if (campaignEx != null) {
            z = CampaignEx.CLICKMODE_ON.equals(campaignEx.getClick_mode()) || "6".equals(campaignEx.getClick_mode());
            id = campaignEx.getId();
        } else {
            id = "";
        }
        this.h.a(str2, fVar, z, id, str, campaignEx, z, z2, i);
    }

    public final void a(String str, CampaignEx campaignEx, f fVar) {
        this.c = new String(campaignEx.getClickURL());
        this.e = fVar;
        this.f2528a = null;
        this.h.a(campaignEx.getClickURL(), fVar, CampaignEx.CLICKMODE_ON.equals(campaignEx.getClick_mode()) || "6".equals(campaignEx.getClick_mode()), campaignEx.getId(), str, campaignEx, true, false, com.mbridge.msdk.click.a.a.j);
    }

    @Override // com.mbridge.msdk.click.e
    public final void a() {
        this.f = false;
    }
}
