package com.applovin.impl.mediation;

import com.applovin.impl.be;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.MaxNetworkResponseInfo;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public class MaxAdWaterfallInfoImpl implements MaxAdWaterfallInfo {

    /* renamed from: a, reason: collision with root package name */
    private final be f655a;
    private final String b;
    private final String c;
    private final List d;
    private final long e;
    private final List f;
    private final String g;

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public long getLatencyMillis() {
        return this.e;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public MaxAd getLoadedAd() {
        return this.f655a;
    }

    public String getMCode() {
        return this.g;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public String getName() {
        return this.b;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public List<MaxNetworkResponseInfo> getNetworkResponses() {
        return this.d;
    }

    public List<String> getPostbackUrls() {
        return this.f;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public String getTestName() {
        return this.c;
    }

    public String toString() {
        return "MaxAdWaterfallInfo{name=" + this.b + ", testName=" + this.c + ", networkResponses=" + this.d + ", latencyMillis=" + this.e + AbstractJsonLexerKt.END_OBJ;
    }

    public MaxAdWaterfallInfoImpl(be beVar, long j, List<MaxNetworkResponseInfo> list, String str) {
        this(beVar, beVar.U(), beVar.V(), j, list, beVar.T(), str);
    }

    public MaxAdWaterfallInfoImpl(be beVar, String str, String str2, long j, List<MaxNetworkResponseInfo> list, List<String> list2, String str3) {
        this.f655a = beVar;
        this.b = str;
        this.c = str2;
        this.d = list;
        this.e = j;
        this.f = list2;
        this.g = str3;
    }
}
