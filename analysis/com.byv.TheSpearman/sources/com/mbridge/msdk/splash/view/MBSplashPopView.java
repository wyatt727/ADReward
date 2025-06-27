package com.mbridge.msdk.splash.view;

import android.content.Context;
import android.util.AttributeSet;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.splash.d.d;
import com.mbridge.msdk.splash.view.BaseSplashPopView;

/* loaded from: classes4.dex */
public class MBSplashPopView extends BaseSplashPopView {
    public MBSplashPopView(Context context, BaseSplashPopView.a aVar, d dVar) {
        super(context, aVar, dVar);
    }

    public MBSplashPopView(Context context) {
        super(context);
    }

    public MBSplashPopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MBSplashPopView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public MBSplashPopView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // com.mbridge.msdk.splash.view.BaseSplashPopView
    protected final void a(CampaignEx campaignEx) {
        super.a(campaignEx);
        b(campaignEx);
    }
}
