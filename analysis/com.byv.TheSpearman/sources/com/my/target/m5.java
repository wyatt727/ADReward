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
import com.my.target.mediation.MediationRewardedAdAdapter;
import com.my.target.mediation.MyTargetRewardedAdAdapter;
import com.my.target.o5;

/* loaded from: classes4.dex */
public class m5 extends g5<MediationRewardedAdAdapter> implements f2 {
    public final f2.a k;
    public f2.b l;

    public class a implements MediationRewardedAdAdapter.MediationRewardedAdListener {

        /* renamed from: a, reason: collision with root package name */
        public final f5 f4054a;

        public a(f5 f5Var) {
            this.f4054a = f5Var;
        }

        @Override // com.my.target.mediation.MediationRewardedAdAdapter.MediationRewardedAdListener
        public void onClick(MediationRewardedAdAdapter mediationRewardedAdAdapter) {
            m5 m5Var = m5.this;
            if (m5Var.d != mediationRewardedAdAdapter) {
                return;
            }
            Context contextH = m5Var.h();
            if (contextH != null) {
                w9.a(this.f4054a.h().b(CampaignEx.JSON_NATIVE_VIDEO_CLICK), contextH);
            }
            m5.this.k.onClick();
        }

        @Override // com.my.target.mediation.MediationRewardedAdAdapter.MediationRewardedAdListener
        public void onDismiss(MediationRewardedAdAdapter mediationRewardedAdAdapter) {
            m5 m5Var = m5.this;
            if (m5Var.d != mediationRewardedAdAdapter) {
                return;
            }
            m5Var.k.onDismiss();
        }

        @Override // com.my.target.mediation.MediationRewardedAdAdapter.MediationRewardedAdListener
        public void onDisplay(MediationRewardedAdAdapter mediationRewardedAdAdapter) {
            m5 m5Var = m5.this;
            if (m5Var.d != mediationRewardedAdAdapter) {
                return;
            }
            Context contextH = m5Var.h();
            if (contextH != null) {
                w9.a(this.f4054a.h().b("playbackStarted"), contextH);
            }
            m5.this.k.onDisplay();
        }

        @Override // com.my.target.mediation.MediationRewardedAdAdapter.MediationRewardedAdListener
        public void onLoad(MediationRewardedAdAdapter mediationRewardedAdAdapter) {
            if (m5.this.d != mediationRewardedAdAdapter) {
                return;
            }
            ba.a("MediationRewardedAdEngine$AdapterListener: Data from " + this.f4054a.b() + " ad network loaded successfully");
            m5.this.a(this.f4054a, true);
            m5.this.k.onLoad();
        }

        @Override // com.my.target.mediation.MediationRewardedAdAdapter.MediationRewardedAdListener
        public void onNoAd(IAdLoadingError iAdLoadingError, MediationRewardedAdAdapter mediationRewardedAdAdapter) {
            if (m5.this.d != mediationRewardedAdAdapter) {
                return;
            }
            ba.a("MediationRewardedAdEngine$AdapterListener: No data from " + this.f4054a.b() + " ad network - " + iAdLoadingError);
            m5.this.a(this.f4054a, false);
        }

        @Override // com.my.target.mediation.MediationRewardedAdAdapter.MediationRewardedAdListener
        public void onReward(Reward reward, MediationRewardedAdAdapter mediationRewardedAdAdapter) {
            m5 m5Var = m5.this;
            if (m5Var.d != mediationRewardedAdAdapter) {
                return;
            }
            Context contextH = m5Var.h();
            if (contextH != null) {
                w9.a(this.f4054a.h().b("reward"), contextH);
            }
            f2.b bVarK = m5.this.k();
            if (bVarK != null) {
                bVarK.onReward(reward);
            }
        }
    }

    public m5(e5 e5Var, j jVar, o5.a aVar, f2.a aVar2) {
        super(e5Var, jVar, aVar);
        this.k = aVar2;
    }

    public static m5 a(e5 e5Var, j jVar, o5.a aVar, f2.a aVar2) {
        return new m5(e5Var, jVar, aVar, aVar2);
    }

    @Override // com.my.target.f2
    public void a(Context context) {
        T t = this.d;
        if (t == 0) {
            ba.b("MediationRewardedAdEngine: Error - can't show ad, adapter is not set");
            return;
        }
        try {
            ((MediationRewardedAdAdapter) t).show(context);
        } catch (Throwable th) {
            ba.b("MediationRewardedAdEngine: Error - " + th);
        }
    }

    @Override // com.my.target.f2
    public void a(f2.b bVar) {
        this.l = bVar;
    }

    @Override // com.my.target.g5
    public void a(MediationRewardedAdAdapter mediationRewardedAdAdapter, f5 f5Var, Context context) {
        g5.a aVarA = g5.a.a(f5Var.e(), f5Var.d(), f5Var.c(), this.f3982a.getCustomParams().getAge(), this.f3982a.getCustomParams().getGender(), MyTargetPrivacy.currentPrivacy(), TextUtils.isEmpty(this.h) ? null : this.f3982a.getAdNetworkConfig(this.h));
        if (mediationRewardedAdAdapter instanceof MyTargetRewardedAdAdapter) {
            q qVarG = f5Var.g();
            if (qVarG instanceof e4) {
                ((MyTargetRewardedAdAdapter) mediationRewardedAdAdapter).setSection((e4) qVarG);
            }
        }
        try {
            mediationRewardedAdAdapter.load(aVarA, new a(f5Var), context);
        } catch (Throwable th) {
            ba.b("MediationRewardedAdEngine: Error - " + th);
        }
    }

    @Override // com.my.target.g5
    public boolean a(MediationAdapter mediationAdapter) {
        return mediationAdapter instanceof MediationRewardedAdAdapter;
    }

    @Override // com.my.target.f2
    public void destroy() {
        T t = this.d;
        if (t == 0) {
            ba.b("MediationRewardedAdEngine: Error - can't destroy ad, adapter is not set");
            return;
        }
        try {
            ((MediationRewardedAdAdapter) t).destroy();
        } catch (Throwable th) {
            ba.b("MediationRewardedAdEngine: Error - " + th);
        }
        this.d = null;
    }

    @Override // com.my.target.f2
    public void dismiss() {
        T t = this.d;
        if (t == 0) {
            ba.b("MediationRewardedAdEngine: Error - can't dismiss ad, adapter is not set");
            return;
        }
        try {
            ((MediationRewardedAdAdapter) t).dismiss();
        } catch (Throwable th) {
            ba.b("MediationRewardedAdEngine: Error - " + th);
        }
    }

    @Override // com.my.target.g5
    public void f() {
        this.k.onNoAd(m.u);
    }

    @Override // com.my.target.g5
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public MediationRewardedAdAdapter g() {
        return new MyTargetRewardedAdAdapter();
    }

    public f2.b k() {
        return this.l;
    }
}
