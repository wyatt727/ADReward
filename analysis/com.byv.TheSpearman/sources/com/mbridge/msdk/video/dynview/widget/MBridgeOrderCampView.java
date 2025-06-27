package com.mbridge.msdk.video.dynview.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.d.d;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.video.bt.module.b.f;
import com.mbridge.msdk.video.dynview.e.b;
import com.mbridge.msdk.video.dynview.e.c;
import com.mbridge.msdk.video.dynview.e.g;
import com.mbridge.msdk.video.module.MBridgeBaseView;
import com.mbridge.msdk.widget.FeedBackButton;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes4.dex */
public class MBridgeOrderCampView extends MBridgeBaseView {
    private MBridgeOrderCampView n;
    private List<CampaignEx> o;
    private int p;
    private int q;
    private int r;
    private int s;
    private String t;
    private FeedBackButton u;
    private ImageView v;
    private boolean w;
    private c x;
    private b y;
    private boolean z;

    public MBridgeOrderCampView(Context context) {
        super(context);
        this.w = false;
        this.x = new c() { // from class: com.mbridge.msdk.video.dynview.widget.MBridgeOrderCampView.1
            @Override // com.mbridge.msdk.video.dynview.e.c
            public final void a(CampaignEx campaignEx, int i) {
                if (campaignEx != null) {
                    try {
                        MBridgeOrderCampView.this.setCampaign(campaignEx);
                        campaignEx.setClickTempSource(2);
                        campaignEx.setTriggerClickSource(2);
                        MBridgeOrderCampView.a(MBridgeOrderCampView.this, campaignEx, 0, i);
                    } catch (Exception e) {
                        ad.b(MBridgeBaseView.TAG, e.getMessage());
                    }
                }
            }

            @Override // com.mbridge.msdk.video.dynview.e.c
            public final void a() {
                MBridgeOrderCampView.a(MBridgeOrderCampView.this);
            }
        };
        this.z = false;
    }

    public MBridgeOrderCampView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.w = false;
        this.x = new c() { // from class: com.mbridge.msdk.video.dynview.widget.MBridgeOrderCampView.1
            @Override // com.mbridge.msdk.video.dynview.e.c
            public final void a(CampaignEx campaignEx, int i) {
                if (campaignEx != null) {
                    try {
                        MBridgeOrderCampView.this.setCampaign(campaignEx);
                        campaignEx.setClickTempSource(2);
                        campaignEx.setTriggerClickSource(2);
                        MBridgeOrderCampView.a(MBridgeOrderCampView.this, campaignEx, 0, i);
                    } catch (Exception e) {
                        ad.b(MBridgeBaseView.TAG, e.getMessage());
                    }
                }
            }

            @Override // com.mbridge.msdk.video.dynview.e.c
            public final void a() {
                MBridgeOrderCampView.a(MBridgeOrderCampView.this);
            }
        };
        this.z = false;
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
        this.n = this;
    }

    public void createView(final ViewGroup viewGroup) {
        if (this.o == null) {
            b bVar = this.y;
            if (bVar != null) {
                bVar.b();
                return;
            }
            return;
        }
        HashMap map = new HashMap();
        map.put("order_view_callback", this.x);
        com.mbridge.msdk.video.dynview.c cVarB = new com.mbridge.msdk.video.dynview.j.c().b(com.mbridge.msdk.foundation.controller.c.m().c(), this.o);
        com.mbridge.msdk.video.dynview.b.a();
        new com.mbridge.msdk.video.dynview.h.a(cVarB, new g() { // from class: com.mbridge.msdk.video.dynview.widget.MBridgeOrderCampView.2
            @Override // com.mbridge.msdk.video.dynview.e.g
            public final void a(com.mbridge.msdk.video.dynview.a aVar) {
                if (aVar != null) {
                    try {
                        MBridgeOrderCampView.this.n.addView(aVar.a());
                        MBridgeOrderCampView.this.w = aVar.c();
                        viewGroup.removeAllViews();
                        viewGroup.addView(MBridgeOrderCampView.this.n);
                        f.a(com.mbridge.msdk.foundation.controller.c.m().c(), (List<CampaignEx>) MBridgeOrderCampView.this.o, ((CampaignEx) MBridgeOrderCampView.this.o.get(0)).getCampaignUnitId());
                        MBridgeOrderCampView.this.setViewStatus();
                        if (MBridgeOrderCampView.this.y != null) {
                            MBridgeOrderCampView.this.y.a();
                        }
                    } catch (Exception e) {
                        ad.b(MBridgeBaseView.TAG, e.getMessage());
                    }
                }
            }

            @Override // com.mbridge.msdk.video.dynview.e.g
            public final void a(com.mbridge.msdk.video.dynview.c.a aVar) {
                try {
                    f.a(com.mbridge.msdk.foundation.controller.c.m().c(), (List<CampaignEx>) MBridgeOrderCampView.this.o, ((CampaignEx) MBridgeOrderCampView.this.o.get(0)).getCampaignUnitId(), aVar.b());
                    if (MBridgeOrderCampView.this.y != null) {
                        MBridgeOrderCampView.this.y.b();
                    }
                } catch (Exception e) {
                    ad.b(MBridgeBaseView.TAG, e.getMessage());
                }
            }
        }, map);
    }

    public void setCampaignExes(List<CampaignEx> list) {
        this.o = list;
    }

    public void setCampOrderViewBuildCallback(b bVar) {
        this.y = bVar;
    }

    public void setRewarded(boolean z) {
        this.z = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0031 A[SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onAttachedToWindow() throws org.json.JSONException {
        /*
            r5 = this;
            super.onAttachedToWindow()
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r0 = r5.o
            if (r0 != 0) goto L8
            return
        L8:
            r0 = 0
        L9:
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r1 = r5.o
            int r1 = r1.size()
            if (r0 >= r1) goto L34
            r1 = 0
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L1f
            r2.<init>()     // Catch: org.json.JSONException -> L1f
            java.lang.String r1 = "camp_position"
            r2.put(r1, r0)     // Catch: org.json.JSONException -> L1d
            goto L26
        L1d:
            r1 = move-exception
            goto L23
        L1f:
            r2 = move-exception
            r4 = r2
            r2 = r1
            r1 = r4
        L23:
            r1.printStackTrace()
        L26:
            com.mbridge.msdk.video.module.a.a r1 = r5.e
            if (r1 == 0) goto L31
            com.mbridge.msdk.video.module.a.a r1 = r5.e
            r3 = 110(0x6e, float:1.54E-43)
            r1.a(r3, r2)
        L31:
            int r0 = r0 + 1
            goto L9
        L34:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.dynview.widget.MBridgeOrderCampView.onAttachedToWindow():void");
    }

    public void setViewStatus() {
        MBridgeOrderCampView mBridgeOrderCampView = this.n;
        if (mBridgeOrderCampView == null || !this.z) {
            return;
        }
        RelativeLayout relativeLayout = (RelativeLayout) mBridgeOrderCampView.findViewById(filterFindViewId(this.w, "mbridge_native_order_camp_controller"));
        this.u = (FeedBackButton) this.n.findViewById(filterFindViewId(this.w, "mbridge_native_order_camp_feed_btn"));
        this.v = (ImageView) this.n.findViewById(filterFindViewId(this.w, "mbridge_iv_link"));
        if (relativeLayout != null) {
            relativeLayout.setPadding(this.p, this.r, this.q, this.s);
        }
        if (this.u != null) {
            try {
                List<CampaignEx> list = this.o;
                if (list == null || list.get(0) == null) {
                    FeedBackButton feedBackButton = this.u;
                    if (feedBackButton != null) {
                        feedBackButton.setVisibility(8);
                    }
                } else {
                    this.t = this.o.get(0).getCampaignUnitId();
                    this.b = this.o.get(0);
                    com.mbridge.msdk.foundation.d.b.a().a(this.t + "_2", this.b);
                    if (this.u != null) {
                        if (com.mbridge.msdk.foundation.d.b.a().b()) {
                            com.mbridge.msdk.foundation.d.b.a().a(this.t + "_2", new com.mbridge.msdk.foundation.d.a() { // from class: com.mbridge.msdk.video.dynview.widget.MBridgeOrderCampView.3
                                @Override // com.mbridge.msdk.foundation.d.a
                                public final void a() {
                                }

                                @Override // com.mbridge.msdk.foundation.d.a
                                public final void a(String str) {
                                }

                                @Override // com.mbridge.msdk.foundation.d.a
                                public final void b() {
                                }
                            });
                            com.mbridge.msdk.foundation.d.b.a().a(this.t + "_2", this.u);
                        } else {
                            this.u.setVisibility(8);
                        }
                    }
                }
            } catch (Exception e) {
                ad.b(MBridgeBaseView.TAG, e.getMessage());
            }
        }
        ImageView imageView = this.v;
        if (imageView == null || imageView == null) {
            return;
        }
        try {
            com.mbridge.msdk.c.g gVarB = h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
            if (gVarB != null) {
                final String strG = gVarB.g();
                if (TextUtils.isEmpty(strG)) {
                    this.v.setVisibility(8);
                }
                this.v.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.dynview.widget.MBridgeOrderCampView.4
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        com.mbridge.msdk.click.c.e(MBridgeOrderCampView.this.f3680a, strG);
                    }
                });
                return;
            }
            this.v.setVisibility(8);
        } catch (Exception e2) {
            ad.b(MBridgeBaseView.TAG, e2.getMessage());
        }
    }

    public void setNotchPadding(int i, int i2, int i3, int i4) {
        this.p = i;
        this.q = i2;
        this.r = i3;
        this.s = i4;
        setViewStatus();
    }

    public void startAlphaAnimation() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(500L);
        this.n.startAnimation(alphaAnimation);
    }

    public void startTranslateAnimation() {
        TranslateAnimation translateAnimation = new TranslateAnimation(2, 1.0f, 2, 0.0f, 2, 0.0f, 2, 0.0f);
        translateAnimation.setDuration(500L);
        this.n.startAnimation(translateAnimation);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ void a(com.mbridge.msdk.video.dynview.widget.MBridgeOrderCampView r8, com.mbridge.msdk.foundation.entity.CampaignEx r9, int r10, int r11) throws org.json.JSONException {
        /*
            if (r9 == 0) goto L5f
            boolean r0 = r9.isDynamicView()
            if (r0 == 0) goto L5f
            com.mbridge.msdk.foundation.entity.CampaignEx$c r0 = r9.getRewardTemplateMode()     // Catch: java.lang.Exception -> L55
            java.lang.String r1 = ""
            if (r0 == 0) goto L23
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L55
            r2.<init>()     // Catch: java.lang.Exception -> L55
            int r0 = r0.f()     // Catch: java.lang.Exception -> L55
            r2.append(r0)     // Catch: java.lang.Exception -> L55
            r2.append(r1)     // Catch: java.lang.Exception -> L55
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Exception -> L55
        L23:
            r7 = r1
            com.mbridge.msdk.foundation.controller.c r0 = com.mbridge.msdk.foundation.controller.c.m()     // Catch: java.lang.Exception -> L55
            android.content.Context r0 = r0.c()     // Catch: java.lang.Exception -> L55
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L55
            r1.<init>()     // Catch: java.lang.Exception -> L55
            java.lang.String r2 = "order_view_click"
            r1.append(r2)     // Catch: java.lang.Exception -> L55
            r1.append(r7)     // Catch: java.lang.Exception -> L55
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L55
            java.lang.String r2 = r9.getCampaignUnitId()     // Catch: java.lang.Exception -> L55
            boolean r3 = r9.isBidCampaign()     // Catch: java.lang.Exception -> L55
            java.lang.String r4 = r9.getRequestId()     // Catch: java.lang.Exception -> L55
            java.lang.String r5 = r9.getRequestIdNotice()     // Catch: java.lang.Exception -> L55
            java.lang.String r6 = r9.getId()     // Catch: java.lang.Exception -> L55
            com.mbridge.msdk.foundation.same.report.k.a(r0, r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L55
            goto L5f
        L55:
            r9 = move-exception
            java.lang.String r9 = r9.getMessage()
            java.lang.String r0 = "MBridgeBaseView"
            com.mbridge.msdk.foundation.tools.ad.b(r0, r9)
        L5f:
            r9 = 0
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L76
            r0.<init>()     // Catch: org.json.JSONException -> L76
            java.lang.String r9 = com.mbridge.msdk.foundation.same.a.j     // Catch: org.json.JSONException -> L74
            org.json.JSONObject r10 = r8.a(r10)     // Catch: org.json.JSONException -> L74
            r0.put(r9, r10)     // Catch: org.json.JSONException -> L74
            java.lang.String r9 = "camp_position"
            r0.put(r9, r11)     // Catch: org.json.JSONException -> L74
            goto L7c
        L74:
            r9 = move-exception
            goto L79
        L76:
            r10 = move-exception
            r0 = r9
            r9 = r10
        L79:
            r9.printStackTrace()
        L7c:
            com.mbridge.msdk.video.module.a.a r9 = r8.e
            if (r9 == 0) goto L87
            com.mbridge.msdk.video.module.a.a r8 = r8.e
            r9 = 105(0x69, float:1.47E-43)
            r8.a(r9, r0)
        L87:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.dynview.widget.MBridgeOrderCampView.a(com.mbridge.msdk.video.dynview.widget.MBridgeOrderCampView, com.mbridge.msdk.foundation.entity.CampaignEx, int, int):void");
    }

    static /* synthetic */ void a(MBridgeOrderCampView mBridgeOrderCampView) {
        try {
            d dVar = new d();
            dVar.a("type", 2);
            com.mbridge.msdk.foundation.same.report.d.c.a().a("2000152", dVar);
            com.mbridge.msdk.foundation.same.report.d.c.a().a("2000134", mBridgeOrderCampView.b);
        } catch (Throwable th) {
            ad.a(MBridgeBaseView.TAG, th.getMessage());
        }
        try {
            com.mbridge.msdk.video.dynview.moffer.a.a().b();
        } catch (Exception e) {
            ad.b(MBridgeBaseView.TAG, e.getMessage());
        }
        if (mBridgeOrderCampView.e != null) {
            mBridgeOrderCampView.e.a(104, "");
        }
    }
}
