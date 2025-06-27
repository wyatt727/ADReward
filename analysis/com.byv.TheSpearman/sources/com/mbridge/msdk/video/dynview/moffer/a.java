package com.mbridge.msdk.video.dynview.moffer;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.v;
import com.mbridge.msdk.video.dynview.e.f;
import java.lang.ref.SoftReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: MOfferEnergize.java */
/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile a f3665a;
    private Map<String, SoftReference<MOfferModel>> b = new ConcurrentHashMap();
    private int c = 500;

    private a() {
    }

    public static a a() {
        a aVar;
        if (f3665a == null) {
            synchronized (a.class) {
                if (f3665a == null) {
                    f3665a = new a();
                }
                aVar = f3665a;
            }
            return aVar;
        }
        return f3665a;
    }

    public final void a(final ViewGroup viewGroup, String str, com.mbridge.msdk.video.module.a.a aVar) {
        if (viewGroup == null || aVar == null || this.b == null || TextUtils.isEmpty(str)) {
            return;
        }
        final MOfferModel mOfferModel = null;
        if (this.b.containsKey(str)) {
            SoftReference<MOfferModel> softReference = this.b.get(str);
            if (softReference != null && softReference.get() != null) {
                mOfferModel = softReference.get();
            }
            if (mOfferModel == null || mOfferModel == null) {
                return;
            }
            mOfferModel.setMoreOfferListener(new f() { // from class: com.mbridge.msdk.video.dynview.moffer.a.1
                @Override // com.mbridge.msdk.video.dynview.e.f
                public final void a(ViewGroup viewGroup2, CampaignUnit campaignUnit) {
                    ViewGroup viewGroup3;
                    if (viewGroup2 == null || (viewGroup3 = viewGroup) == null) {
                        return;
                    }
                    try {
                        a.a(a.this, mOfferModel, viewGroup3, viewGroup2, campaignUnit);
                    } catch (Exception e) {
                        ad.b("MOfferEnergize", e.getMessage());
                    }
                }

                @Override // com.mbridge.msdk.video.dynview.e.f
                public final void a(int i, String str2) {
                    ad.b("MOfferEnergize", str2);
                }
            }, aVar);
            mOfferModel.showView();
        }
    }

    public final void a(CampaignEx campaignEx, int i) {
        if (campaignEx == null) {
            return;
        }
        String str = campaignEx.getRequestId() + "_" + campaignEx.getId();
        if (this.b == null) {
            this.b = new ConcurrentHashMap();
        }
        if (this.b.containsKey(str)) {
            return;
        }
        try {
            MOfferModel mOfferModel = new MOfferModel();
            mOfferModel.setFromType(i);
            SoftReference<MOfferModel> softReference = new SoftReference<>(mOfferModel);
            if (softReference.get() != null) {
                this.b.put(str, softReference);
                softReference.get().buildMofferAd(campaignEx);
            }
        } catch (Exception e) {
            ad.b("MOfferEnergize", e.getMessage());
        }
    }

    public final void a(CampaignEx campaignEx, final ViewGroup viewGroup, com.mbridge.msdk.video.module.a.a aVar, int i) {
        if (campaignEx == null) {
            return;
        }
        String str = campaignEx.getRequestId() + "_" + campaignEx.getId();
        if (this.b == null) {
            this.b = new ConcurrentHashMap();
        }
        try {
            MOfferModel mOfferModel = new MOfferModel();
            mOfferModel.setFromType(i);
            SoftReference<MOfferModel> softReference = new SoftReference<>(mOfferModel);
            if (softReference.get() != null) {
                this.b.put(str, softReference);
                final MOfferModel mOfferModel2 = softReference.get();
                mOfferModel2.setMoreOfferListener(new f() { // from class: com.mbridge.msdk.video.dynview.moffer.a.3
                    @Override // com.mbridge.msdk.video.dynview.e.f
                    public final void a(int i2, String str2) {
                    }

                    @Override // com.mbridge.msdk.video.dynview.e.f
                    public final void a(ViewGroup viewGroup2, CampaignUnit campaignUnit) {
                        if (viewGroup2 == null || campaignUnit == null) {
                            return;
                        }
                        try {
                            a.a(a.this, mOfferModel2, viewGroup, viewGroup2, campaignUnit);
                        } catch (Exception e) {
                            ad.b("MOfferEnergize", e.getMessage());
                        }
                    }
                }, aVar);
                mOfferModel2.setIsRetry(true);
                mOfferModel2.buildMofferAd(campaignEx);
            }
        } catch (Exception e) {
            ad.b("MOfferEnergize", e.getMessage());
        }
    }

    public final boolean a(String str) {
        if (this.b == null || TextUtils.isEmpty(str)) {
            return false;
        }
        return this.b.containsKey(str);
    }

    public final void b() {
        MOfferModel mOfferModel;
        try {
            Map<String, SoftReference<MOfferModel>> map = this.b;
            if (map != null) {
                for (SoftReference<MOfferModel> softReference : map.values()) {
                    if (softReference != null && (mOfferModel = softReference.get()) != null) {
                        mOfferModel.mofDestroy();
                    }
                }
                this.b.clear();
            }
        } catch (Exception e) {
            ad.b("MOfferEnergize", e.getMessage());
        }
    }

    private int b(String str) {
        return v.a(com.mbridge.msdk.foundation.controller.c.m().c(), str, "id");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ void a(com.mbridge.msdk.video.dynview.moffer.a r19, final com.mbridge.msdk.video.dynview.moffer.MOfferModel r20, android.view.ViewGroup r21, android.view.ViewGroup r22, com.mbridge.msdk.foundation.entity.CampaignUnit r23) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 607
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.dynview.moffer.a.a(com.mbridge.msdk.video.dynview.moffer.a, com.mbridge.msdk.video.dynview.moffer.MOfferModel, android.view.ViewGroup, android.view.ViewGroup, com.mbridge.msdk.foundation.entity.CampaignUnit):void");
    }
}
