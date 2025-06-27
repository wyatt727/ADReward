package com.json;

import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0005BY\b\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u001f\u0012\b\u0010'\u001a\u0004\u0018\u00010#\u0012\b\u0010+\u001a\u0004\u0018\u00010(¢\u0006\u0004\b,\u0010-J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u0011\u0010\u0018R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0019\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\f\n\u0004\b\u0013\u0010 \u001a\u0004\b\u000b\u0010!R\u0019\u0010'\u001a\u0004\u0018\u00010#8\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010+\u001a\u0004\u0018\u00010(8\u0006¢\u0006\f\n\u0004\b%\u0010)\u001a\u0004\b\u0005\u0010*¨\u0006."}, d2 = {"Lcom/ironsource/l2;", "", "", "toString", "Lcom/ironsource/cc;", "a", "Lcom/ironsource/cc;", "g", "()Lcom/ironsource/cc;", "rewardedVideoConfigurations", "Lcom/ironsource/n8;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lcom/ironsource/n8;", "d", "()Lcom/ironsource/n8;", "interstitialConfigurations", "Lcom/ironsource/ua;", "c", "Lcom/ironsource/ua;", "f", "()Lcom/ironsource/ua;", "offerwallConfigurations", "Lcom/ironsource/p1;", "Lcom/ironsource/p1;", "()Lcom/ironsource/p1;", "bannerConfigurations", "Lcom/ironsource/fa;", "e", "Lcom/ironsource/fa;", "()Lcom/ironsource/fa;", "nativeAdConfigurations", "Lcom/ironsource/o0;", "Lcom/ironsource/o0;", "()Lcom/ironsource/o0;", "applicationConfigurations", "Lcom/ironsource/jd;", "Lcom/ironsource/jd;", CmcdHeadersFactory.STREAMING_FORMAT_HLS, "()Lcom/ironsource/jd;", "testSuiteSettings", "Lcom/ironsource/r;", "Lcom/ironsource/r;", "()Lcom/ironsource/r;", "adQualityConfigurations", "<init>", "(Lcom/ironsource/cc;Lcom/ironsource/n8;Lcom/ironsource/ua;Lcom/ironsource/p1;Lcom/ironsource/fa;Lcom/ironsource/o0;Lcom/ironsource/jd;Lcom/ironsource/r;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class l2 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final cc rewardedVideoConfigurations;

    /* renamed from: b, reason: from kotlin metadata */
    private final n8 interstitialConfigurations;

    /* renamed from: c, reason: from kotlin metadata */
    private final ua offerwallConfigurations;

    /* renamed from: d, reason: from kotlin metadata */
    private final p1 bannerConfigurations;

    /* renamed from: e, reason: from kotlin metadata */
    private final fa nativeAdConfigurations;

    /* renamed from: f, reason: from kotlin metadata */
    private final o0 applicationConfigurations;

    /* renamed from: g, reason: from kotlin metadata */
    private final TestSuiteSettings testSuiteSettings;

    /* renamed from: h, reason: from kotlin metadata */
    private final r adQualityConfigurations;

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b$\b\u0086\b\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\bC\u0010DJ\u0010\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0004\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u0004\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u0004\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\tJ\u0010\u0010\u0004\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\u0004\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\rJ\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010\u0004\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012J\u0006\u0010\u0004\u001a\u00020\u0014J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0012HÆ\u0003Ji\u0010\u0004\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0001J\t\u0010\u001d\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001f\u001a\u00020\u001eHÖ\u0001J\u0013\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010%\"\u0004\b\u0011\u0010&R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010'\u001a\u0004\b(\u0010)\"\u0004\b\u0011\u0010*R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010+\u001a\u0004\b,\u0010-\"\u0004\b\u0011\u0010.R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010/\u001a\u0004\b0\u00101\"\u0004\b\u0011\u00102R$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u00103\u001a\u0004\b4\u00105\"\u0004\b\u0011\u00106R$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u00107\u001a\u0004\b8\u00109\"\u0004\b\u0011\u0010:R$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010;\u001a\u0004\b<\u0010=\"\u0004\b\u0004\u0010>R$\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010?\u001a\u0004\b@\u0010A\"\u0004\b\u0011\u0010B¨\u0006E"}, d2 = {"Lcom/ironsource/l2$a;", "", "Lcom/ironsource/cc;", "rewardedVideoConfigurations", "a", "Lcom/ironsource/n8;", "interstitialConfigurations", "Lcom/ironsource/ua;", "offerwallConfigurations", "Lcom/ironsource/p1;", "bannerConfigurations", "Lcom/ironsource/fa;", "nativeAdConfigurations", "Lcom/ironsource/o0;", "applicationConfigurations", "Lcom/ironsource/jd;", "testSuiteSettings", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lcom/ironsource/r;", "adQualityConfigurations", "Lcom/ironsource/l2;", "c", "d", "e", "f", "g", CmcdHeadersFactory.STREAMING_FORMAT_HLS, CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, "", "toString", "", "hashCode", "other", "", "equals", "Lcom/ironsource/cc;", "p", "()Lcom/ironsource/cc;", "(Lcom/ironsource/cc;)V", "Lcom/ironsource/n8;", "m", "()Lcom/ironsource/n8;", "(Lcom/ironsource/n8;)V", "Lcom/ironsource/ua;", "o", "()Lcom/ironsource/ua;", "(Lcom/ironsource/ua;)V", "Lcom/ironsource/p1;", CmcdHeadersFactory.STREAM_TYPE_LIVE, "()Lcom/ironsource/p1;", "(Lcom/ironsource/p1;)V", "Lcom/ironsource/fa;", m4.p, "()Lcom/ironsource/fa;", "(Lcom/ironsource/fa;)V", "Lcom/ironsource/o0;", CampaignEx.JSON_KEY_AD_K, "()Lcom/ironsource/o0;", "(Lcom/ironsource/o0;)V", "Lcom/ironsource/jd;", CampaignEx.JSON_KEY_AD_Q, "()Lcom/ironsource/jd;", "(Lcom/ironsource/jd;)V", "Lcom/ironsource/r;", "j", "()Lcom/ironsource/r;", "(Lcom/ironsource/r;)V", "<init>", "(Lcom/ironsource/cc;Lcom/ironsource/n8;Lcom/ironsource/ua;Lcom/ironsource/p1;Lcom/ironsource/fa;Lcom/ironsource/o0;Lcom/ironsource/jd;Lcom/ironsource/r;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: com.ironsource.l2$a, reason: from toString */
    public static final /* data */ class Builder {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private cc rewardedVideoConfigurations;

        /* renamed from: b, reason: from kotlin metadata and from toString */
        private n8 interstitialConfigurations;

        /* renamed from: c, reason: from kotlin metadata and from toString */
        private ua offerwallConfigurations;

        /* renamed from: d, reason: from kotlin metadata and from toString */
        private p1 bannerConfigurations;

        /* renamed from: e, reason: from kotlin metadata and from toString */
        private fa nativeAdConfigurations;

        /* renamed from: f, reason: from kotlin metadata and from toString */
        private o0 applicationConfigurations;

        /* renamed from: g, reason: from kotlin metadata and from toString */
        private TestSuiteSettings testSuiteSettings;

        /* renamed from: h, reason: from kotlin metadata and from toString */
        private r adQualityConfigurations;

        public Builder() {
            this(null, null, null, null, null, null, null, null, 255, null);
        }

        public Builder(cc ccVar, n8 n8Var, ua uaVar, p1 p1Var, fa faVar, o0 o0Var, TestSuiteSettings testSuiteSettings, r rVar) {
            this.rewardedVideoConfigurations = ccVar;
            this.interstitialConfigurations = n8Var;
            this.offerwallConfigurations = uaVar;
            this.bannerConfigurations = p1Var;
            this.nativeAdConfigurations = faVar;
            this.applicationConfigurations = o0Var;
            this.testSuiteSettings = testSuiteSettings;
            this.adQualityConfigurations = rVar;
        }

        public /* synthetic */ Builder(cc ccVar, n8 n8Var, ua uaVar, p1 p1Var, fa faVar, o0 o0Var, TestSuiteSettings testSuiteSettings, r rVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : ccVar, (i & 2) != 0 ? null : n8Var, (i & 4) != 0 ? null : uaVar, (i & 8) != 0 ? null : p1Var, (i & 16) != 0 ? null : faVar, (i & 32) != 0 ? null : o0Var, (i & 64) != 0 ? null : testSuiteSettings, (i & 128) == 0 ? rVar : null);
        }

        public final Builder a(cc rewardedVideoConfigurations) {
            this.rewardedVideoConfigurations = rewardedVideoConfigurations;
            return this;
        }

        public final Builder a(cc rewardedVideoConfigurations, n8 interstitialConfigurations, ua offerwallConfigurations, p1 bannerConfigurations, fa nativeAdConfigurations, o0 applicationConfigurations, TestSuiteSettings testSuiteSettings, r adQualityConfigurations) {
            return new Builder(rewardedVideoConfigurations, interstitialConfigurations, offerwallConfigurations, bannerConfigurations, nativeAdConfigurations, applicationConfigurations, testSuiteSettings, adQualityConfigurations);
        }

        public final Builder a(fa nativeAdConfigurations) {
            this.nativeAdConfigurations = nativeAdConfigurations;
            return this;
        }

        public final Builder a(n8 interstitialConfigurations) {
            this.interstitialConfigurations = interstitialConfigurations;
            return this;
        }

        public final Builder a(o0 applicationConfigurations) {
            this.applicationConfigurations = applicationConfigurations;
            return this;
        }

        public final Builder a(p1 bannerConfigurations) {
            this.bannerConfigurations = bannerConfigurations;
            return this;
        }

        public final Builder a(r adQualityConfigurations) {
            this.adQualityConfigurations = adQualityConfigurations;
            return this;
        }

        public final Builder a(ua offerwallConfigurations) {
            this.offerwallConfigurations = offerwallConfigurations;
            return this;
        }

        public final l2 a() {
            return new l2(this.rewardedVideoConfigurations, this.interstitialConfigurations, this.offerwallConfigurations, this.bannerConfigurations, this.nativeAdConfigurations, this.applicationConfigurations, this.testSuiteSettings, this.adQualityConfigurations, null);
        }

        public final void a(TestSuiteSettings testSuiteSettings) {
            this.testSuiteSettings = testSuiteSettings;
        }

        /* renamed from: b, reason: from getter */
        public final cc getRewardedVideoConfigurations() {
            return this.rewardedVideoConfigurations;
        }

        public final Builder b(TestSuiteSettings testSuiteSettings) {
            this.testSuiteSettings = testSuiteSettings;
            return this;
        }

        public final void b(cc ccVar) {
            this.rewardedVideoConfigurations = ccVar;
        }

        public final void b(fa faVar) {
            this.nativeAdConfigurations = faVar;
        }

        public final void b(n8 n8Var) {
            this.interstitialConfigurations = n8Var;
        }

        public final void b(o0 o0Var) {
            this.applicationConfigurations = o0Var;
        }

        public final void b(p1 p1Var) {
            this.bannerConfigurations = p1Var;
        }

        public final void b(r rVar) {
            this.adQualityConfigurations = rVar;
        }

        public final void b(ua uaVar) {
            this.offerwallConfigurations = uaVar;
        }

        /* renamed from: c, reason: from getter */
        public final n8 getInterstitialConfigurations() {
            return this.interstitialConfigurations;
        }

        /* renamed from: d, reason: from getter */
        public final ua getOfferwallConfigurations() {
            return this.offerwallConfigurations;
        }

        /* renamed from: e, reason: from getter */
        public final p1 getBannerConfigurations() {
            return this.bannerConfigurations;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Builder)) {
                return false;
            }
            Builder builder = (Builder) other;
            return Intrinsics.areEqual(this.rewardedVideoConfigurations, builder.rewardedVideoConfigurations) && Intrinsics.areEqual(this.interstitialConfigurations, builder.interstitialConfigurations) && Intrinsics.areEqual(this.offerwallConfigurations, builder.offerwallConfigurations) && Intrinsics.areEqual(this.bannerConfigurations, builder.bannerConfigurations) && Intrinsics.areEqual(this.nativeAdConfigurations, builder.nativeAdConfigurations) && Intrinsics.areEqual(this.applicationConfigurations, builder.applicationConfigurations) && Intrinsics.areEqual(this.testSuiteSettings, builder.testSuiteSettings) && Intrinsics.areEqual(this.adQualityConfigurations, builder.adQualityConfigurations);
        }

        /* renamed from: f, reason: from getter */
        public final fa getNativeAdConfigurations() {
            return this.nativeAdConfigurations;
        }

        /* renamed from: g, reason: from getter */
        public final o0 getApplicationConfigurations() {
            return this.applicationConfigurations;
        }

        /* renamed from: h, reason: from getter */
        public final TestSuiteSettings getTestSuiteSettings() {
            return this.testSuiteSettings;
        }

        public int hashCode() {
            cc ccVar = this.rewardedVideoConfigurations;
            int iHashCode = (ccVar == null ? 0 : ccVar.hashCode()) * 31;
            n8 n8Var = this.interstitialConfigurations;
            int iHashCode2 = (iHashCode + (n8Var == null ? 0 : n8Var.hashCode())) * 31;
            ua uaVar = this.offerwallConfigurations;
            int iHashCode3 = (iHashCode2 + (uaVar == null ? 0 : uaVar.hashCode())) * 31;
            p1 p1Var = this.bannerConfigurations;
            int iHashCode4 = (iHashCode3 + (p1Var == null ? 0 : p1Var.hashCode())) * 31;
            fa faVar = this.nativeAdConfigurations;
            int iHashCode5 = (iHashCode4 + (faVar == null ? 0 : faVar.hashCode())) * 31;
            o0 o0Var = this.applicationConfigurations;
            int iHashCode6 = (iHashCode5 + (o0Var == null ? 0 : o0Var.hashCode())) * 31;
            TestSuiteSettings testSuiteSettings = this.testSuiteSettings;
            int iHashCode7 = (iHashCode6 + (testSuiteSettings == null ? 0 : testSuiteSettings.hashCode())) * 31;
            r rVar = this.adQualityConfigurations;
            return iHashCode7 + (rVar != null ? rVar.hashCode() : 0);
        }

        /* renamed from: i, reason: from getter */
        public final r getAdQualityConfigurations() {
            return this.adQualityConfigurations;
        }

        public final r j() {
            return this.adQualityConfigurations;
        }

        public final o0 k() {
            return this.applicationConfigurations;
        }

        public final p1 l() {
            return this.bannerConfigurations;
        }

        public final n8 m() {
            return this.interstitialConfigurations;
        }

        public final fa n() {
            return this.nativeAdConfigurations;
        }

        public final ua o() {
            return this.offerwallConfigurations;
        }

        public final cc p() {
            return this.rewardedVideoConfigurations;
        }

        public final TestSuiteSettings q() {
            return this.testSuiteSettings;
        }

        public String toString() {
            return "Builder(rewardedVideoConfigurations=" + this.rewardedVideoConfigurations + ", interstitialConfigurations=" + this.interstitialConfigurations + ", offerwallConfigurations=" + this.offerwallConfigurations + ", bannerConfigurations=" + this.bannerConfigurations + ", nativeAdConfigurations=" + this.nativeAdConfigurations + ", applicationConfigurations=" + this.applicationConfigurations + ", testSuiteSettings=" + this.testSuiteSettings + ", adQualityConfigurations=" + this.adQualityConfigurations + ')';
        }
    }

    private l2(cc ccVar, n8 n8Var, ua uaVar, p1 p1Var, fa faVar, o0 o0Var, TestSuiteSettings testSuiteSettings, r rVar) {
        this.rewardedVideoConfigurations = ccVar;
        this.interstitialConfigurations = n8Var;
        this.offerwallConfigurations = uaVar;
        this.bannerConfigurations = p1Var;
        this.nativeAdConfigurations = faVar;
        this.applicationConfigurations = o0Var;
        this.testSuiteSettings = testSuiteSettings;
        this.adQualityConfigurations = rVar;
    }

    public /* synthetic */ l2(cc ccVar, n8 n8Var, ua uaVar, p1 p1Var, fa faVar, o0 o0Var, TestSuiteSettings testSuiteSettings, r rVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(ccVar, n8Var, uaVar, p1Var, faVar, o0Var, testSuiteSettings, rVar);
    }

    /* renamed from: a, reason: from getter */
    public final r getAdQualityConfigurations() {
        return this.adQualityConfigurations;
    }

    /* renamed from: b, reason: from getter */
    public final o0 getApplicationConfigurations() {
        return this.applicationConfigurations;
    }

    /* renamed from: c, reason: from getter */
    public final p1 getBannerConfigurations() {
        return this.bannerConfigurations;
    }

    /* renamed from: d, reason: from getter */
    public final n8 getInterstitialConfigurations() {
        return this.interstitialConfigurations;
    }

    /* renamed from: e, reason: from getter */
    public final fa getNativeAdConfigurations() {
        return this.nativeAdConfigurations;
    }

    /* renamed from: f, reason: from getter */
    public final ua getOfferwallConfigurations() {
        return this.offerwallConfigurations;
    }

    /* renamed from: g, reason: from getter */
    public final cc getRewardedVideoConfigurations() {
        return this.rewardedVideoConfigurations;
    }

    /* renamed from: h, reason: from getter */
    public final TestSuiteSettings getTestSuiteSettings() {
        return this.testSuiteSettings;
    }

    public String toString() {
        return "configurations(\n" + this.rewardedVideoConfigurations + '\n' + this.interstitialConfigurations + '\n' + this.bannerConfigurations + '\n' + this.nativeAdConfigurations + ')';
    }
}
