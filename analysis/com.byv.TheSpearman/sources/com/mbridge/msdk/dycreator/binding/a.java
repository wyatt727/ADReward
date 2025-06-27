package com.mbridge.msdk.dycreator.binding;

import android.text.TextUtils;
import android.view.View;
import com.mbridge.msdk.dycreator.baseview.MBCountDownView;
import com.mbridge.msdk.dycreator.baseview.MBLinearLayout;
import com.mbridge.msdk.dycreator.baseview.MBRelativeLayout;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.dycreator.binding.a.e;
import com.mbridge.msdk.dycreator.binding.a.f;
import com.mbridge.msdk.dycreator.binding.a.g;
import com.mbridge.msdk.dycreator.binding.base.BaseStrategy;
import com.mbridge.msdk.dycreator.bridge.MBSplashData;
import com.mbridge.msdk.dycreator.e.d;
import com.vungle.ads.internal.presenter.NativeAdPresenter;

/* compiled from: BindViewClickListener.java */
/* loaded from: classes4.dex */
public final class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.dycreator.f.a.a f2642a;

    public a(com.mbridge.msdk.dycreator.f.a.a aVar) {
        this.f2642a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        com.mbridge.msdk.dycreator.f.a.a aVar;
        if (view == 0 || !(view instanceof InterBase)) {
            return;
        }
        if (!(view instanceof MBCountDownView) || (aVar = this.f2642a) == null || aVar.getEffectData() == null || this.f2642a.getEffectData().isCanSkip()) {
            com.mbridge.msdk.dycreator.f.a.a aVar2 = this.f2642a;
            if (aVar2 != null && (view instanceof MBRelativeLayout) && d.a(view, aVar2)) {
                com.mbridge.msdk.dycreator.f.a.a aVar3 = this.f2642a;
                if (aVar3 instanceof MBSplashData) {
                    MBRelativeLayout mBRelativeLayout = (MBRelativeLayout) view;
                    ((MBSplashData) aVar3).setxInScreen(mBRelativeLayout.getxInScreen());
                    ((MBSplashData) this.f2642a).setyInScreen(mBRelativeLayout.getyInScreen());
                    ((MBSplashData) this.f2642a).setClickType(1);
                }
            }
            com.mbridge.msdk.dycreator.f.a.a aVar4 = this.f2642a;
            if (aVar4 != null && (view instanceof MBLinearLayout) && d.a(view, aVar4)) {
                com.mbridge.msdk.dycreator.f.a.a aVar5 = this.f2642a;
                if (aVar5 instanceof MBSplashData) {
                    MBLinearLayout mBLinearLayout = (MBLinearLayout) view;
                    ((MBSplashData) aVar5).setxInScreen(mBLinearLayout.getxInScreen());
                    ((MBSplashData) this.f2642a).setyInScreen(mBLinearLayout.getyInScreen());
                    ((MBSplashData) this.f2642a).setClickType(0);
                }
            }
            String strategyDes = ((InterBase) view).getStrategyDes();
            if (TextUtils.isEmpty(strategyDes)) {
                return;
            }
            c.a();
            BaseStrategy aVar6 = null;
            if (!TextUtils.isEmpty(strategyDes)) {
                if (strategyDes.equals("close")) {
                    aVar6 = new com.mbridge.msdk.dycreator.binding.a.c();
                } else if (strategyDes.equals(NativeAdPresenter.DOWNLOAD)) {
                    aVar6 = new com.mbridge.msdk.dycreator.binding.a.b();
                } else if (!strategyDes.equals("deeplink") && strategyDes.equals("activity")) {
                    aVar6 = new com.mbridge.msdk.dycreator.binding.a.a();
                }
                if (strategyDes.equals("feedback")) {
                    aVar6 = new com.mbridge.msdk.dycreator.binding.a.d();
                }
                if (strategyDes.equals("notice")) {
                    aVar6 = new e();
                }
                if (strategyDes.equals("permissionInfo")) {
                    aVar6 = new f();
                }
                if (strategyDes.equals("privateAddress")) {
                    aVar6 = new g();
                }
            }
            if (aVar6 != null) {
                aVar6.bindClickData(view, this.f2642a);
            }
        }
    }
}
