package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.my.target.ads.MyTargetView;
import com.my.target.common.MyTargetPrivacy;
import com.my.target.common.models.IAdLoadingError;
import com.my.target.g5;
import com.my.target.i2;
import com.my.target.mediation.MediationAdapter;
import com.my.target.mediation.MediationStandardAdAdapter;
import com.my.target.mediation.MyTargetStandardAdAdapter;
import com.my.target.o5;

/* loaded from: classes4.dex */
public class n5 extends g5<MediationStandardAdAdapter> implements i2 {
    public final MyTargetView k;
    public i2.a l;

    public class a implements MediationStandardAdAdapter.MediationStandardAdListener {

        /* renamed from: a, reason: collision with root package name */
        public final f5 f4069a;

        public a(f5 f5Var) {
            this.f4069a = f5Var;
        }

        @Override // com.my.target.mediation.MediationStandardAdAdapter.MediationStandardAdListener
        public void onClick(MediationStandardAdAdapter mediationStandardAdAdapter) {
            n5 n5Var = n5.this;
            if (n5Var.d != mediationStandardAdAdapter) {
                return;
            }
            Context contextH = n5Var.h();
            if (contextH != null) {
                w9.a(this.f4069a.h().b(CampaignEx.JSON_NATIVE_VIDEO_CLICK), contextH);
            }
            i2.a aVar = n5.this.l;
            if (aVar != null) {
                aVar.onClick();
            }
        }

        @Override // com.my.target.mediation.MediationStandardAdAdapter.MediationStandardAdListener
        public void onLoad(View view, MediationStandardAdAdapter mediationStandardAdAdapter) {
            if (n5.this.d != mediationStandardAdAdapter) {
                return;
            }
            ba.a("MediationStandardAdEngine: Data from " + this.f4069a.b() + " ad network loaded successfully");
            n5.this.a(this.f4069a, true);
            n5.this.a(view);
            i2.a aVar = n5.this.l;
            if (aVar != null) {
                aVar.onLoad();
            }
        }

        @Override // com.my.target.mediation.MediationStandardAdAdapter.MediationStandardAdListener
        public void onNoAd(IAdLoadingError iAdLoadingError, MediationStandardAdAdapter mediationStandardAdAdapter) {
            if (n5.this.d != mediationStandardAdAdapter) {
                return;
            }
            ba.a("MediationStandardAdEngine: No data from " + this.f4069a.b() + " ad network - " + iAdLoadingError);
            n5.this.a(this.f4069a, false);
        }

        @Override // com.my.target.mediation.MediationStandardAdAdapter.MediationStandardAdListener
        public void onShow(MediationStandardAdAdapter mediationStandardAdAdapter) {
            n5 n5Var = n5.this;
            if (n5Var.d != mediationStandardAdAdapter) {
                return;
            }
            Context contextH = n5Var.h();
            if (contextH != null) {
                w9.a(this.f4069a.h().b("playbackStarted"), contextH);
            }
            i2.a aVar = n5.this.l;
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    public n5(MyTargetView myTargetView, e5 e5Var, j jVar, o5.a aVar) {
        super(e5Var, jVar, aVar);
        this.k = myTargetView;
    }

    public static n5 a(MyTargetView myTargetView, e5 e5Var, j jVar, o5.a aVar) {
        return new n5(myTargetView, e5Var, jVar, aVar);
    }

    @Override // com.my.target.i2
    public void a() {
    }

    public void a(View view) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        view.setLayoutParams(layoutParams);
        this.k.removeAllViews();
        this.k.addView(view);
    }

    @Override // com.my.target.i2
    public void a(MyTargetView.AdSize adSize) {
    }

    @Override // com.my.target.i2
    public void a(i2.a aVar) {
        this.l = aVar;
    }

    @Override // com.my.target.g5
    public void a(MediationStandardAdAdapter mediationStandardAdAdapter, f5 f5Var, Context context) {
        g5.a aVarA = g5.a.a(f5Var.e(), f5Var.d(), f5Var.c(), this.f3982a.getCustomParams().getAge(), this.f3982a.getCustomParams().getGender(), MyTargetPrivacy.currentPrivacy(), TextUtils.isEmpty(this.h) ? null : this.f3982a.getAdNetworkConfig(this.h));
        if (mediationStandardAdAdapter instanceof MyTargetStandardAdAdapter) {
            q qVarG = f5Var.g();
            if (qVarG instanceof q9) {
                ((MyTargetStandardAdAdapter) mediationStandardAdAdapter).setSection((q9) qVarG);
            }
        }
        try {
            mediationStandardAdAdapter.load(aVarA, this.k.getSize(), new a(f5Var), context);
        } catch (Throwable th) {
            ba.b("MediationStandardAdEngine: Error - " + th);
        }
    }

    @Override // com.my.target.g5
    public boolean a(MediationAdapter mediationAdapter) {
        return mediationAdapter instanceof MediationStandardAdAdapter;
    }

    @Override // com.my.target.i2
    public void destroy() {
        if (this.d == 0) {
            ba.b("MediationStandardAdEngine: Error - can't destroy ad, adapter is not set");
            return;
        }
        this.k.removeAllViews();
        try {
            ((MediationStandardAdAdapter) this.d).destroy();
        } catch (Throwable th) {
            ba.b("MediationStandardAdEngine: Error - " + th);
        }
        this.d = null;
    }

    @Override // com.my.target.g5
    public void f() {
        i2.a aVar = this.l;
        if (aVar != null) {
            aVar.onNoAd(m.u);
        }
    }

    @Override // com.my.target.g5
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public MediationStandardAdAdapter g() {
        return new MyTargetStandardAdAdapter();
    }

    @Override // com.my.target.i2
    public void pause() {
    }

    @Override // com.my.target.i2
    public void prepare() {
        super.b(this.k.getContext());
    }

    @Override // com.my.target.i2
    public void start() {
    }

    @Override // com.my.target.i2
    public void stop() {
    }
}
