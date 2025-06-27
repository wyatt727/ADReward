package com.mbridge.msdk.newreward.a.b;

import android.content.Context;
import android.graphics.Bitmap;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* compiled from: ReqImageService.java */
/* loaded from: classes4.dex */
public final class h implements com.mbridge.msdk.newreward.a.b.a {
    @Override // com.mbridge.msdk.newreward.a.b.a
    public final void a(Object obj, b bVar) throws IOException {
        List<CampaignEx.c.a> listA;
        com.mbridge.msdk.newreward.function.d.a.a aVar = (com.mbridge.msdk.newreward.function.d.a.a) obj;
        CampaignEx campaignExG = aVar.g();
        String imageUrl = campaignExG.getImageUrl();
        Context contextC = com.mbridge.msdk.foundation.controller.c.m().c();
        com.mbridge.msdk.foundation.same.c.b.a(contextC).a(imageUrl, new a(aVar, bVar));
        com.mbridge.msdk.foundation.same.c.b.a(contextC).a(campaignExG.getIconUrl(), new a(aVar, bVar));
        CampaignEx.c rewardTemplateMode = campaignExG.getRewardTemplateMode();
        if (rewardTemplateMode == null || (listA = rewardTemplateMode.a()) == null) {
            return;
        }
        Iterator<CampaignEx.c.a> it = listA.iterator();
        while (it.hasNext()) {
            List<String> list = it.next().f2806a;
            if (list != null) {
                Iterator<String> it2 = list.iterator();
                while (it2.hasNext()) {
                    com.mbridge.msdk.foundation.same.c.b.a(contextC).a(it2.next(), new a(aVar, bVar));
                }
            }
        }
    }

    /* compiled from: ReqImageService.java */
    private static final class a implements com.mbridge.msdk.foundation.same.c.c {

        /* renamed from: a, reason: collision with root package name */
        private final com.mbridge.msdk.newreward.function.d.a.a f3275a;
        private final b b;

        public a(com.mbridge.msdk.newreward.function.d.a.a aVar, b bVar) {
            this.f3275a = aVar;
            this.b = bVar;
        }

        @Override // com.mbridge.msdk.foundation.same.c.c
        public final void onFailedLoad(String str, String str2) {
            if (this.b != null && this.f3275a.h().x()) {
                this.b.a(this.f3275a);
            }
        }

        @Override // com.mbridge.msdk.foundation.same.c.c
        public final void onSuccessLoad(Bitmap bitmap, String str) {
            if (this.b != null && this.f3275a.h().x()) {
                this.b.a(this.f3275a);
            }
        }
    }
}
