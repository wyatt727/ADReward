package com.mbridge.msdk.dycreator.viewmodel;

import android.content.Context;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.mbridge.msdk.dycreator.binding.b;
import com.mbridge.msdk.dycreator.binding.response.SplashResData;
import com.mbridge.msdk.dycreator.bridge.MBSplashData;
import com.mbridge.msdk.dycreator.bus.EventBus;
import com.mbridge.msdk.dycreator.g.c;
import com.mbridge.msdk.dycreator.g.d;
import com.mbridge.msdk.dycreator.g.f;
import com.mbridge.msdk.dycreator.g.h;
import com.mbridge.msdk.dycreator.listener.action.EAction;
import com.mbridge.msdk.dycreator.wrapper.DyOption;
import com.mbridge.msdk.dycreator.wrapper.DynamicViewBackListener;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.v;
import com.mbridge.msdk.foundation.tools.z;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes4.dex */
public class MBSplashViewVModel implements BaseViewModel {

    /* renamed from: a, reason: collision with root package name */
    private d f2681a;
    private c b;
    private f c;
    private h d;
    private DynamicViewBackListener e;
    private DyOption f;

    public MBSplashViewVModel(DyOption dyOption) throws IllegalAccessException, Error, IllegalArgumentException, InvocationTargetException {
        this.f = dyOption;
        String campaignUnitId = (dyOption == null || dyOption.getCampaignEx() == null) ? "" : dyOption.getCampaignEx().getCampaignUnitId();
        if (!TextUtils.isEmpty(campaignUnitId)) {
            EventBus.getDefault().register(campaignUnitId, this);
        } else {
            EventBus.getDefault().register(this);
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setModelDataAndBind() {
        MBSplashData mBSplashData = new MBSplashData(this.f);
        Context contextC = com.mbridge.msdk.foundation.controller.c.m().c();
        if (contextC != null) {
            DyOption dyOption = this.f;
            if (dyOption != null) {
                CampaignEx campaignEx = dyOption.getCampaignEx();
                if (campaignEx != null) {
                    mBSplashData.setAdClickText(campaignEx.getAdCall());
                }
                mBSplashData.setCountDownText(contextC.getResources().getString(v.a(contextC, this.f.isCanSkip() ? "mbridge_splash_count_time_can_skip" : "mbridge_splash_count_time_can_skip_not", TypedValues.Custom.S_STRING)));
            }
            mBSplashData.setNoticeImage(v.a(contextC, "mbridge_splash_notice", "drawable"));
            String strS = z.s(contextC);
            mBSplashData.setLogoText((TextUtils.isEmpty(strS) || !strS.contains("zh")) ? "AD" : "广告");
        }
        d dVar = this.f2681a;
        if (dVar != null) {
            dVar.a(mBSplashData);
        }
        c cVar = this.b;
        if (cVar != null) {
            cVar.a(mBSplashData);
        }
        f fVar = this.c;
        if (fVar != null) {
            fVar.a(mBSplashData);
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setDynamicViewBackListener(DynamicViewBackListener dynamicViewBackListener) {
        if (dynamicViewBackListener != null) {
            this.e = dynamicViewBackListener;
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setClickSubject(c cVar) {
        if (cVar != null) {
            this.b = cVar;
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setConcreteSubject(d dVar) {
        if (dVar != null) {
            this.f2681a = dVar;
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setEffectSubject(f fVar) {
        if (fVar != null) {
            this.c = fVar;
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setReportSubject(h hVar) {
        if (hVar != null) {
            this.d = hVar;
        }
    }

    /* renamed from: com.mbridge.msdk.dycreator.viewmodel.MBSplashViewVModel$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2682a;

        static {
            int[] iArr = new int[EAction.values().length];
            f2682a = iArr;
            try {
                iArr[EAction.DOWNLOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2682a[EAction.CLOSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public void onEventMainThread(SplashResData splashResData) {
        if (this.e == null || splashResData == null) {
            return;
        }
        int i = AnonymousClass1.f2682a[splashResData.geteAction().ordinal()];
        if (i == 1 || i == 2) {
            try {
                String campaignUnitId = "";
                if (splashResData.getBaseViewData() != null && splashResData.getBaseViewData().getBindData() != null) {
                    campaignUnitId = splashResData.getBaseViewData().getBindData().getCampaignUnitId();
                }
                if (!TextUtils.isEmpty(campaignUnitId)) {
                    EventBus.getDefault().unregister(campaignUnitId);
                    b.a().b();
                } else {
                    EventBus.getDefault().unregister(this);
                    b.a().b();
                }
            } catch (Exception e) {
                e.printStackTrace();
                EventBus.getDefault().unregister(this);
                EventBus.getDefault().release();
                b.a().b();
            }
        }
        this.e.viewClicked(splashResData);
    }
}
