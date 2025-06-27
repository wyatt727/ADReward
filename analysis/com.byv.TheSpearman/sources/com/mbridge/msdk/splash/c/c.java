package com.mbridge.msdk.splash.c;

import android.content.Context;
import android.view.View;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.dycreator.binding.response.SplashResData;
import com.mbridge.msdk.dycreator.binding.response.base.BaseRespData;
import com.mbridge.msdk.dycreator.bridge.MBSplashData;
import com.mbridge.msdk.dycreator.listener.DyCountDownListener;
import com.mbridge.msdk.dycreator.listener.action.EAction;
import com.mbridge.msdk.dycreator.wrapper.DyAdType;
import com.mbridge.msdk.dycreator.wrapper.DyOption;
import com.mbridge.msdk.dycreator.wrapper.DynamicViewBackListener;
import com.mbridge.msdk.dycreator.wrapper.DynamicViewCreator;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.splash.view.MBSplashView;
import java.util.List;

/* compiled from: NativeViewRenderManager.java */
/* loaded from: classes4.dex */
final class c extends com.mbridge.msdk.splash.c.a {
    private c() {
    }

    /* compiled from: NativeViewRenderManager.java */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final c f3486a = new c();
    }

    @Override // com.mbridge.msdk.splash.c.a
    protected final void a(List<String> list, final MBSplashView mBSplashView, final com.mbridge.msdk.splash.a.d dVar, final com.mbridge.msdk.splash.b.a aVar) {
        h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
        final DyOption dyOptionBuild = new DyOption.Builder().campaignEx(dVar.c()).fileDirs(list).dyAdType(DyAdType.SPLASH).canSkip(dVar.d()).isScreenClick(dVar.g() == 1).isClickButtonVisible(dVar.f() == 0).isShakeVisible(dVar.i() == 1).isApkInfoVisible(dVar.h() == 0).isLogoVisible(dVar.m() == 1).shakeStrenght(dVar.j()).shakeTime(dVar.k()).orientation(dVar.l()).countDownTime(dVar.e()).adChoiceLink(ai.a(dVar.c())).build();
        mBSplashView.setDyCountDownListener(new DyCountDownListener() { // from class: com.mbridge.msdk.splash.c.c.1
            @Override // com.mbridge.msdk.dycreator.listener.DyCountDownListener
            public final void getCountDownValue(int i) {
                dyOptionBuild.setDyCountDownListener(i);
            }
        });
        DynamicViewCreator.getInstance().createDynamicView(dyOptionBuild, new DynamicViewBackListener() { // from class: com.mbridge.msdk.splash.c.c.2
            @Override // com.mbridge.msdk.dycreator.wrapper.DynamicViewBackListener
            public final void viewCreatedSuccess(View view) {
                com.mbridge.msdk.splash.b.a aVar2 = aVar;
                if (aVar2 != null) {
                    if (view != null) {
                        aVar2.a(view);
                    } else {
                        aVar2.a("View render error.");
                    }
                }
            }

            @Override // com.mbridge.msdk.dycreator.wrapper.DynamicViewBackListener
            public final void viewCreateFail(com.mbridge.msdk.dycreator.b.a aVar2) {
                MBSplashView mBSplashView2 = mBSplashView;
                if (mBSplashView2 != null) {
                    Context context = mBSplashView2.getContext();
                    if (context == null) {
                        context = com.mbridge.msdk.foundation.controller.c.m().c();
                    }
                    c.this.a(context, mBSplashView, dVar, aVar);
                }
            }

            @Override // com.mbridge.msdk.dycreator.wrapper.DynamicViewBackListener
            public final void viewClicked(BaseRespData baseRespData) {
                float f;
                com.mbridge.msdk.splash.signal.c splashSignalCommunicationImpl;
                MBSplashView mBSplashView2 = mBSplashView;
                final com.mbridge.msdk.splash.d.a aVarA = (mBSplashView2 == null || (splashSignalCommunicationImpl = mBSplashView2.getSplashSignalCommunicationImpl()) == null) ? null : splashSignalCommunicationImpl.a();
                DyOption dyOption = dyOptionBuild;
                CampaignEx campaignEx = dyOption != null ? dyOption.getCampaignEx() : null;
                boolean z = baseRespData instanceof SplashResData;
                EAction eAction = z ? ((SplashResData) baseRespData).geteAction() : null;
                if (eAction != null) {
                    int i = AnonymousClass3.f3485a[eAction.ordinal()];
                    if (i == 1) {
                        if (aVarA != null) {
                            if (baseRespData == null) {
                                aVarA.a(campaignEx);
                                return;
                            }
                            if (z) {
                                SplashResData splashResData = (SplashResData) baseRespData;
                                if (splashResData.getBaseViewData() != null) {
                                    com.mbridge.msdk.dycreator.f.a.a baseViewData = splashResData.getBaseViewData();
                                    float f2 = 0.0f;
                                    if (baseViewData == null || !(baseViewData instanceof MBSplashData)) {
                                        f = 0.0f;
                                    } else {
                                        MBSplashData mBSplashData = (MBSplashData) baseViewData;
                                        f2 = mBSplashData.getxInScreen();
                                        f = mBSplashData.getyInScreen();
                                        clickType = mBSplashData.getClickType();
                                    }
                                    if (aVarA != null) {
                                        try {
                                            aVarA.a(com.mbridge.msdk.splash.a.a.a.a(com.mbridge.msdk.splash.a.a.a.a(clickType, f2, f), campaignEx));
                                            return;
                                        } catch (Throwable th) {
                                            th.printStackTrace();
                                            aVarA.a(campaignEx);
                                            return;
                                        }
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (i == 2) {
                        if (aVarA != null) {
                            aVarA.a();
                            return;
                        }
                        return;
                    }
                    if (i == 3) {
                        if (dyOptionBuild != null) {
                            com.mbridge.msdk.click.c.e(com.mbridge.msdk.foundation.controller.c.m().c(), dyOptionBuild.getAdChoiceLink());
                            return;
                        }
                        return;
                    }
                    if (i == 4 && baseRespData != null && z) {
                        SplashResData splashResData2 = (SplashResData) baseRespData;
                        if (splashResData2.getBaseViewData() != null) {
                            com.mbridge.msdk.dycreator.f.a.a baseViewData2 = splashResData2.getBaseViewData();
                            final c cVar = c.this;
                            if (campaignEx != null) {
                                String campaignUnitId = campaignEx.getCampaignUnitId();
                                String requestId = campaignEx.getRequestId();
                                clickType = baseViewData2 != null ? baseViewData2.getEffectData().getCurrentCountDown() : 0;
                                aVarA.a(1, clickType);
                                com.mbridge.msdk.foundation.d.a.a aVarA2 = com.mbridge.msdk.foundation.d.b.a().a(campaignUnitId + "_" + requestId);
                                if (aVarA2 != null) {
                                    aVarA2.a(campaignEx);
                                    com.mbridge.msdk.foundation.d.b.a().a(campaignUnitId + "_" + requestId, new com.mbridge.msdk.foundation.d.a() { // from class: com.mbridge.msdk.splash.c.a.1

                                        /* renamed from: a */
                                        final /* synthetic */ com.mbridge.msdk.splash.d.a f3473a;
                                        final /* synthetic */ int b;

                                        @Override // com.mbridge.msdk.foundation.d.a
                                        public final void a() {
                                        }

                                        AnonymousClass1(final com.mbridge.msdk.splash.d.a aVarA3, final int clickType) {
                                            aVar = aVarA3;
                                            i = clickType;
                                        }

                                        @Override // com.mbridge.msdk.foundation.d.a
                                        public final void b() {
                                            aVar.a(2, i);
                                        }

                                        @Override // com.mbridge.msdk.foundation.d.a
                                        public final void a(String str) {
                                            aVar.a(2, i);
                                        }
                                    });
                                    aVarA2.e();
                                }
                            }
                        }
                    }
                }
            }
        });
    }

    /* compiled from: NativeViewRenderManager.java */
    /* renamed from: com.mbridge.msdk.splash.c.c$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3485a;

        static {
            int[] iArr = new int[EAction.values().length];
            f3485a = iArr;
            try {
                iArr[EAction.DOWNLOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3485a[EAction.CLOSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3485a[EAction.NOTICE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3485a[EAction.FEEDBACK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }
}
