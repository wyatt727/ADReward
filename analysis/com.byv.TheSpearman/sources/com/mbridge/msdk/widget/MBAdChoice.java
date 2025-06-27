package com.mbridge.msdk.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.mbridge.msdk.c.g;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.c.b;
import com.mbridge.msdk.foundation.same.net.g.d;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.out.Campaign;

/* loaded from: classes4.dex */
public class MBAdChoice extends MBImageView {

    /* renamed from: a, reason: collision with root package name */
    private final Context f3903a;
    private String b;
    private String c;
    private String d;
    private CampaignEx e;
    private com.mbridge.msdk.foundation.d.a f;

    public MBAdChoice(Context context) {
        super(context);
        this.b = "";
        this.c = "";
        this.d = "";
        this.f3903a = context;
        a();
    }

    private void a() {
        setScaleType(ImageView.ScaleType.FIT_CENTER);
        setClickable(true);
    }

    public MBAdChoice(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = "";
        this.c = "";
        this.d = "";
        this.f3903a = context;
        a();
    }

    public MBAdChoice(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = "";
        this.c = "";
        this.d = "";
        this.f3903a = context;
        a();
    }

    @Override // android.view.View
    public boolean performClick() {
        if (this.f == null) {
            this.f = new com.mbridge.msdk.foundation.d.a() { // from class: com.mbridge.msdk.widget.MBAdChoice.1
                @Override // com.mbridge.msdk.foundation.d.a
                public final void a() {
                }

                @Override // com.mbridge.msdk.foundation.d.a
                public final void a(String str) {
                }

                @Override // com.mbridge.msdk.foundation.d.a
                public final void b() {
                }
            };
        }
        ai.a(this.e, this.f, 4, "");
        return true;
    }

    public void setCampaign(Campaign campaign) {
        if (campaign instanceof CampaignEx) {
            CampaignEx campaignEx = (CampaignEx) campaign;
            this.e = campaignEx;
            this.e = campaignEx;
            g gVarB = h.a().b(c.m().k());
            this.e = campaignEx;
            if (campaignEx != null) {
                String privacyUrl = campaignEx.getPrivacyUrl();
                this.c = privacyUrl;
                if (TextUtils.isEmpty(privacyUrl)) {
                    CampaignEx.a adchoice = campaignEx.getAdchoice();
                    if (adchoice != null) {
                        this.c = adchoice.c();
                    }
                    if (TextUtils.isEmpty(this.c) && gVarB != null) {
                        this.c = gVarB.g();
                    }
                    if (TextUtils.isEmpty(this.c)) {
                        this.c = d.f().f;
                    }
                }
            } else if (gVarB != null) {
                this.c = gVarB.g();
            }
            this.e = campaignEx;
            if (campaignEx != null) {
                CampaignEx.a adchoice2 = campaignEx.getAdchoice();
                if (adchoice2 != null) {
                    this.b = adchoice2.b();
                }
                if (TextUtils.isEmpty(this.b) && gVarB != null) {
                    this.b = gVarB.f();
                }
            } else if (gVarB != null) {
                this.b = gVarB.f();
            }
            this.e = campaignEx;
            if (campaignEx != null) {
                CampaignEx.a adchoice3 = campaignEx.getAdchoice();
                if (adchoice3 != null) {
                    this.d = adchoice3.d();
                }
                if (TextUtils.isEmpty(this.d) && gVarB != null) {
                    this.d = gVarB.h();
                }
            } else if (gVarB != null) {
                this.d = gVarB.h();
            }
            boolean z = (TextUtils.isEmpty(this.b) || TextUtils.isEmpty(this.c) || TextUtils.isEmpty(this.d)) ? false : true;
            setImageUrl(this.b);
            if (!z || this.f3903a == null) {
                return;
            }
            b.a(c.m().c()).a(this.b, new com.mbridge.msdk.foundation.same.c.c() { // from class: com.mbridge.msdk.widget.MBAdChoice.2
                @Override // com.mbridge.msdk.foundation.same.c.c
                public final void onFailedLoad(String str, String str2) {
                }

                @Override // com.mbridge.msdk.foundation.same.c.c
                public final void onSuccessLoad(Bitmap bitmap, String str) {
                    MBAdChoice.this.setImageBitmap(bitmap);
                }
            });
            return;
        }
        this.e = null;
    }

    public void setFeedbackDialogEventListener(com.mbridge.msdk.foundation.d.a aVar) {
        this.f = aVar;
    }
}
