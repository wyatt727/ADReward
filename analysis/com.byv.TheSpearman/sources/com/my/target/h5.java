package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.my.target.ads.Reward;
import com.my.target.common.MyTargetPrivacy;
import com.my.target.common.models.IAdLoadingError;
import com.my.target.f2;
import com.my.target.g5;
import com.my.target.mediation.MediationAdapter;
import com.my.target.mediation.MediationInterstitialAdAdapter;
import com.my.target.mediation.MyTargetInterstitialAdAdapter;
import com.my.target.o5;

/* loaded from: classes4.dex */
public class h5 extends g5<MediationInterstitialAdAdapter> implements f2 {
    public final f2.a k;
    public f2.b l;

    public class a implements MediationInterstitialAdAdapter.MediationInterstitialAdListener {

        /* renamed from: a, reason: collision with root package name */
        public final f5 f3991a;

        public a(f5 f5Var) {
            this.f3991a = f5Var;
        }

        @Override // com.my.target.mediation.MediationInterstitialAdAdapter.MediationInterstitialAdListener
        public void onClick(MediationInterstitialAdAdapter mediationInterstitialAdAdapter) {
            h5 h5Var = h5.this;
            if (h5Var.d != mediationInterstitialAdAdapter) {
                return;
            }
            Context contextH = h5Var.h();
            if (contextH != null) {
                w9.a(this.f3991a.h().b(CampaignEx.JSON_NATIVE_VIDEO_CLICK), contextH);
            }
            h5.this.k.onClick();
        }

        @Override // com.my.target.mediation.MediationInterstitialAdAdapter.MediationInterstitialAdListener
        public void onDismiss(MediationInterstitialAdAdapter mediationInterstitialAdAdapter) {
            h5 h5Var = h5.this;
            if (h5Var.d != mediationInterstitialAdAdapter) {
                return;
            }
            h5Var.k.onDismiss();
        }

        @Override // com.my.target.mediation.MediationInterstitialAdAdapter.MediationInterstitialAdListener
        public void onDisplay(MediationInterstitialAdAdapter mediationInterstitialAdAdapter) {
            h5 h5Var = h5.this;
            if (h5Var.d != mediationInterstitialAdAdapter) {
                return;
            }
            Context contextH = h5Var.h();
            if (contextH != null) {
                w9.a(this.f3991a.h().b("playbackStarted"), contextH);
            }
            h5.this.k.onDisplay();
        }

        @Override // com.my.target.mediation.MediationInterstitialAdAdapter.MediationInterstitialAdListener
        public void onLoad(MediationInterstitialAdAdapter mediationInterstitialAdAdapter) {
            if (h5.this.d != mediationInterstitialAdAdapter) {
                return;
            }
            ba.a("MediationInterstitialAdEngine$AdapterListener: Data from " + this.f3991a.b() + " ad network loaded successfully");
            h5.this.a(this.f3991a, true);
            h5.this.k.onLoad();
        }

        @Override // com.my.target.mediation.MediationInterstitialAdAdapter.MediationInterstitialAdListener
        public void onNoAd(IAdLoadingError iAdLoadingError, MediationInterstitialAdAdapter mediationInterstitialAdAdapter) {
            if (h5.this.d != mediationInterstitialAdAdapter) {
                return;
            }
            ba.a("MediationInterstitialAdEngine$AdapterListener: No data from " + this.f3991a.b() + " ad network - " + iAdLoadingError);
            h5.this.a(this.f3991a, false);
        }

        @Override // com.my.target.mediation.MediationInterstitialAdAdapter.MediationInterstitialAdListener
        public void onVideoCompleted(MediationInterstitialAdAdapter mediationInterstitialAdAdapter) {
            h5 h5Var = h5.this;
            if (h5Var.d != mediationInterstitialAdAdapter) {
                return;
            }
            h5Var.k.onVideoCompleted();
            Context contextH = h5.this.h();
            if (contextH != null) {
                w9.a(this.f3991a.h().b("reward"), contextH);
            }
            f2.b bVarK = h5.this.k();
            if (bVarK != null) {
                bVarK.onReward(Reward.getDefault());
            }
        }
    }

    public h5(e5 e5Var, j jVar, o5.a aVar, f2.a aVar2) {
        super(e5Var, jVar, aVar);
        this.k = aVar2;
    }

    public static h5 a(e5 e5Var, j jVar, o5.a aVar, f2.a aVar2) {
        return new h5(e5Var, jVar, aVar, aVar2);
    }

    @Override // com.my.target.f2
    public void a(Context context) {
        T t = this.d;
        if (t == 0) {
            ba.b("MediationInterstitialAdEngine: Error - can't show ad, adapter is not set");
            return;
        }
        try {
            ((MediationInterstitialAdAdapter) t).show(context);
        } catch (Throwable th) {
            ba.b("MediationInterstitialAdEngine: Error - " + th);
        }
    }

    @Override // com.my.target.f2
    public void a(f2.b bVar) {
        this.l = bVar;
    }

    @Override // com.my.target.g5
    public void a(MediationInterstitialAdAdapter mediationInterstitialAdAdapter, f5 f5Var, Context context) {
        g5.a aVarA = g5.a.a(f5Var.e(), f5Var.d(), f5Var.c(), this.f3982a.getCustomParams().getAge(), this.f3982a.getCustomParams().getGender(), MyTargetPrivacy.currentPrivacy(), TextUtils.isEmpty(this.h) ? null : this.f3982a.getAdNetworkConfig(this.h));
        if (mediationInterstitialAdAdapter instanceof MyTargetInterstitialAdAdapter) {
            q qVarG = f5Var.g();
            if (qVarG instanceof e4) {
                ((MyTargetInterstitialAdAdapter) mediationInterstitialAdAdapter).setSection((e4) qVarG);
            }
        }
        try {
            mediationInterstitialAdAdapter.load(aVarA, new a(f5Var), context);
        } catch (Throwable th) {
            ba.b("MediationInterstitialAdEngine: Error - " + th);
        }
    }

    @Override // com.my.target.g5
    public boolean a(MediationAdapter mediationAdapter) {
        return mediationAdapter instanceof MediationInterstitialAdAdapter;
    }

    @Override // com.my.target.f2
    public void destroy() {
        T t = this.d;
        if (t == 0) {
            ba.b("MediationInterstitialAdEngine: Error - can't destroy ad, adapter is not set");
            return;
        }
        try {
            ((MediationInterstitialAdAdapter) t).destroy();
        } catch (Throwable th) {
            ba.b("MediationInterstitialAdEngine: Error - " + th);
        }
        this.d = null;
    }

    @Override // com.my.target.f2
    public void dismiss() {
        T t = this.d;
        if (t == 0) {
            ba.b("MediationInterstitialAdEngine: Error - can't dismiss ad, adapter is not set");
            return;
        }
        try {
            ((MediationInterstitialAdAdapter) t).dismiss();
        } catch (Throwable th) {
            ba.b("MediationInterstitialAdEngine: Error - " + th);
        }
    }

    @Override // com.my.target.g5
    public void f() {
        this.k.onNoAd(m.u);
    }

    @Override // com.my.target.g5
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public MediationInterstitialAdAdapter g() {
        return new MyTargetInterstitialAdAdapter();
    }

    public f2.b k() {
        return this.l;
    }
}
