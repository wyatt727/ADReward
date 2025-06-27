package com.json;

import com.google.android.exoplayer2.upstream.cache.ContentMetadata;
import com.json.h0;
import com.json.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.json.mediationsdk.logger.IronLog;
import com.json.mediationsdk.p;
import com.json.mediationsdk.utils.IronSourceUtils;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class x1<Listener extends h0> extends u1<Listener> implements AdapterAdRewardListener {
    private e4 r;

    class a extends kc {
        a() {
        }

        @Override // com.json.kc
        public void a() {
            x1.this.T();
        }
    }

    public x1(qb qbVar, u uVar, BaseAdAdapter<?, AdapterAdRewardListener> baseAdAdapter, m0 m0Var, i1 i1Var, Listener listener) {
        super(qbVar, uVar, baseAdAdapter, m0Var, i1Var, listener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T() {
        if (this.g == null) {
            IronLog.INTERNAL.verbose(a("placement is null "));
            a0 a0Var = this.d;
            if (a0Var != null) {
                a0Var.k.c("mCurrentPlacement is null state = " + this.e);
                return;
            }
            return;
        }
        IronLog.INTERNAL.verbose(a("placement name = " + j()));
        if (this.d != null) {
            HashMap map = new HashMap();
            if (p.p().t() != null) {
                for (String str : p.p().t().keySet()) {
                    map.put(ContentMetadata.KEY_CUSTOM_PREFIX + str, p.p().t().get(str));
                }
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.d.j.a(j(), this.g.getCom.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_REWARD_NAME java.lang.String(), this.g.getCom.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_REWARD_AMOUNT java.lang.String(), jCurrentTimeMillis, IronSourceUtils.getTransId(jCurrentTimeMillis, c()), e4.a(this.r), map, p.p().o());
        }
        ((h0) this.b).a((x1<?>) this, this.g);
    }

    @Override // com.json.u1, com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdClosed() {
        this.r = new e4();
        super.onAdClosed();
    }

    @Override // com.json.y1, com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened() {
        this.r = null;
        super.onAdOpened();
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener
    public void onAdRewarded() {
        if (t().c()) {
            t().a(new a());
        } else {
            T();
        }
    }
}
