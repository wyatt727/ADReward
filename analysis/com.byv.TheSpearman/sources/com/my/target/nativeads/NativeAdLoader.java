package com.my.target.nativeads;

import android.content.Context;
import com.my.target.ba;
import com.my.target.common.BaseAd;
import com.my.target.common.menu.MenuFactory;
import com.my.target.common.models.IAdLoadingError;
import com.my.target.d6;
import com.my.target.k6;
import com.my.target.l;
import com.my.target.m;
import com.my.target.o5;
import com.my.target.q;
import com.my.target.q6;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class NativeAdLoader extends BaseAd {
    private l<q6> adFactory;
    private final Context appContext;
    private final MenuFactory menuFactory;
    private OnLoad onLoad;

    public interface OnLoad {
        void onLoad(List<NativeAd> list);
    }

    private NativeAdLoader(int i, int i2, Context context, MenuFactory menuFactory) {
        super(i, "nativeads");
        if (i2 < 1) {
            ba.a("NativeAdLoader: Invalid bannersCount < 1, bannersCount set to 1");
            i2 = 1;
        }
        this.adConfig.setBannersCount(i2);
        this.adConfig.setMediationEnabled(false);
        this.appContext = context.getApplicationContext();
        this.menuFactory = menuFactory;
        ba.c("Native ad loader created. Version - 5.20.0");
    }

    private void handleResult(q6 q6Var, IAdLoadingError iAdLoadingError) {
        OnLoad onLoad;
        ArrayList arrayList;
        if (this.onLoad == null) {
            return;
        }
        List<d6> listC = q6Var == null ? null : q6Var.c();
        if (listC == null || listC.size() < 1) {
            onLoad = this.onLoad;
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList();
            for (d6 d6Var : listC) {
                NativeAd nativeAd = new NativeAd(this.adConfig.getSlotId(), this.menuFactory, this.appContext);
                nativeAd.setCachePolicy(this.adConfig.getCachePolicy());
                nativeAd.setBanner(d6Var);
                arrayList.add(nativeAd);
            }
            onLoad = this.onLoad;
        }
        onLoad.onLoad(arrayList);
    }

    public static NativeAdLoader newLoader(int i, int i2, Context context) {
        return new NativeAdLoader(i, i2, context, null);
    }

    public static NativeAdLoader newLoader(int i, int i2, Context context, MenuFactory menuFactory) {
        return new NativeAdLoader(i, i2, context, menuFactory);
    }

    public int getCachePolicy() {
        return this.adConfig.getCachePolicy();
    }

    /* renamed from: lambda$load$0$com-my-target-nativeads-NativeAdLoader, reason: not valid java name */
    public /* synthetic */ void m649lambda$load$0$commytargetnativeadsNativeAdLoader(l lVar, q6 q6Var, m mVar) {
        if (lVar == this.adFactory) {
            this.adFactory = null;
            handleResult(q6Var, mVar);
        }
    }

    public NativeAdLoader load() {
        o5 o5VarA = this.metricFactory.a();
        final l<q6> lVarA = k6.a(this.adConfig, this.metricFactory);
        this.adFactory = lVarA;
        lVarA.a(new l.b() { // from class: com.my.target.nativeads.NativeAdLoader$$ExternalSyntheticLambda0
            @Override // com.my.target.l.b
            public final void a(q qVar, m mVar) {
                this.f$0.m649lambda$load$0$commytargetnativeadsNativeAdLoader(lVarA, (q6) qVar, mVar);
            }
        }).a(o5VarA, this.appContext);
        return this;
    }

    public void setCachePolicy(int i) {
        this.adConfig.setCachePolicy(i);
    }

    public NativeAdLoader setOnLoad(OnLoad onLoad) {
        this.onLoad = onLoad;
        return this;
    }
}
