package com.applovin.impl.mediation;

import android.os.Bundle;
import com.applovin.impl.be;
import com.applovin.impl.ke;
import com.applovin.impl.wj;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import java.util.Map;

/* loaded from: classes.dex */
public class MaxAdapterParametersImpl implements MaxAdapterResponseParameters, MaxAdapterSignalCollectionParameters, MaxAdapterInitializationParameters {

    /* renamed from: a, reason: collision with root package name */
    private String f656a;
    private Map b;
    private Bundle c;
    private Bundle d;
    private Boolean e;
    private Boolean f;
    private Boolean g;
    private String h;
    private boolean i;
    private String j;
    private String k;
    private long l;
    private MaxAdFormat m;

    private MaxAdapterParametersImpl() {
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters
    public MaxAdFormat getAdFormat() {
        return this.m;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public String getAdUnitId() {
        return this.f656a;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public long getBidExpirationMillis() {
        return this.l;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public String getBidResponse() {
        return this.k;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public String getConsentString() {
        return this.h;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Bundle getCustomParameters() {
        return this.d;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Map<String, Object> getLocalExtraParameters() {
        return this.b;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Bundle getServerParameters() {
        return this.c;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public String getThirdPartyAdPlacementId() {
        return this.j;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Boolean hasUserConsent() {
        return this.e;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Boolean isAgeRestrictedUser() {
        return this.f;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Boolean isDoNotSell() {
        return this.g;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public boolean isTesting() {
        return this.i;
    }

    static MaxAdapterParametersImpl a(be beVar) {
        MaxAdapterParametersImpl maxAdapterParametersImplA = a((ke) beVar);
        maxAdapterParametersImplA.j = beVar.S();
        maxAdapterParametersImplA.k = beVar.C();
        maxAdapterParametersImplA.l = beVar.B();
        return maxAdapterParametersImplA;
    }

    static MaxAdapterParametersImpl a(wj wjVar, String str, MaxAdFormat maxAdFormat) {
        MaxAdapterParametersImpl maxAdapterParametersImplA = a(wjVar);
        maxAdapterParametersImplA.f656a = str;
        maxAdapterParametersImplA.m = maxAdFormat;
        return maxAdapterParametersImplA;
    }

    static MaxAdapterParametersImpl a(ke keVar) {
        MaxAdapterParametersImpl maxAdapterParametersImpl = new MaxAdapterParametersImpl();
        maxAdapterParametersImpl.f656a = keVar.getAdUnitId();
        maxAdapterParametersImpl.e = keVar.n();
        maxAdapterParametersImpl.f = keVar.o();
        maxAdapterParametersImpl.g = keVar.p();
        maxAdapterParametersImpl.h = keVar.d();
        maxAdapterParametersImpl.b = keVar.i();
        maxAdapterParametersImpl.c = keVar.l();
        maxAdapterParametersImpl.d = keVar.f();
        maxAdapterParametersImpl.i = keVar.q();
        return maxAdapterParametersImpl;
    }
}
