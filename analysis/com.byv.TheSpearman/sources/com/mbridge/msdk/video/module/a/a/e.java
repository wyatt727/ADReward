package com.mbridge.msdk.video.module.a.a;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.db.q;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.z;

/* compiled from: DefaultImageLoaderListener.java */
/* loaded from: classes4.dex */
public class e implements com.mbridge.msdk.foundation.same.c.c {

    /* renamed from: a, reason: collision with root package name */
    private CampaignEx f3751a;
    protected ImageView b;
    private String c;

    public e(ImageView imageView) {
        this.b = imageView;
    }

    public e(ImageView imageView, CampaignEx campaignEx, String str) {
        this.b = imageView;
        this.f3751a = campaignEx;
        this.c = str;
    }

    @Override // com.mbridge.msdk.foundation.same.c.c
    public void onSuccessLoad(Bitmap bitmap, String str) {
        try {
            if (bitmap == null) {
                ad.b("ImageLoaderListener", "bitmap=null");
            } else {
                if (this.b == null || bitmap.isRecycled()) {
                    return;
                }
                this.b.setImageBitmap(bitmap);
                this.b.setVisibility(0);
            }
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                th.printStackTrace();
            }
        }
    }

    @Override // com.mbridge.msdk.foundation.same.c.c
    public void onFailedLoad(final String str, String str2) {
        Runnable runnable = new Runnable() { // from class: com.mbridge.msdk.video.module.a.a.e.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    q qVarA = q.a(com.mbridge.msdk.foundation.db.h.a(com.mbridge.msdk.foundation.controller.c.m().c()));
                    if (e.this.f3751a == null) {
                        ad.a("ImageLoaderListener", "campaign is null");
                        return;
                    }
                    com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
                    nVar.a("2000044");
                    nVar.a(z.l(com.mbridge.msdk.foundation.controller.c.m().c()));
                    nVar.e(e.this.f3751a.getId());
                    nVar.p(e.this.f3751a.getImageUrl());
                    nVar.f(e.this.f3751a.getRequestId());
                    nVar.g(e.this.f3751a.getRequestIdNotice());
                    nVar.c(e.this.c);
                    nVar.h(str);
                    qVarA.a(nVar);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        com.mbridge.msdk.foundation.controller.d.a();
        com.mbridge.msdk.foundation.same.f.b.b().execute(runnable);
        ad.b("ImageLoaderListener", "desc:" + str);
    }
}
