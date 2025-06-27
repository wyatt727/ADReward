package com.json;

import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.json.mediationsdk.utils.a;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u0000 E2\u00020\u0001:\u0001\u0005Bg\u0012\u0006\u0010\u001d\u001a\u00020\u0018\u0012\u0006\u0010#\u001a\u00020\u001e\u0012\u0006\u0010&\u001a\u00020\t\u0012\u0006\u0010>\u001a\u00020\u0011\u0012\u0006\u00105\u001a\u000200\u0012\u0006\u0010/\u001a\u00020\u0018\u0012\u0006\u0010?\u001a\u00020\t\u0012\u0006\u0010@\u001a\u00020\u001e\u0012\u0006\u0010A\u001a\u00020\t\u0012\u0006\u0010B\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\t¢\u0006\u0004\bC\u0010DJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006J\b\u0010\b\u001a\u00020\u0006H\u0016R\u001a\u0010\r\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\"\u0010\u0017\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0005\u0010\u0016R\"\u0010\u001d\u001a\u00020\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u000e\u0010\u001b\"\u0004\b\u0005\u0010\u001cR\"\u0010#\u001a\u00020\u001e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0012\u0010!\"\u0004\b\u0005\u0010\"R\"\u0010&\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b$\u0010\n\u001a\u0004\b\u0005\u0010\f\"\u0004\b\u0005\u0010%R$\u0010*\u001a\u0012\u0012\u0004\u0012\u00020\u00020'j\b\u0012\u0004\u0012\u00020\u0002`(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010)R\u0018\u0010-\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\"\u0010/\u001a\u00020\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b.\u0010\u001a\u001a\u0004\b$\u0010\u001b\"\u0004\b\u000e\u0010\u001cR\"\u00105\u001a\u0002008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b\u0019\u00103\"\u0004\b\u0005\u00104R\"\u00106\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\n\u001a\u0004\b+\u0010\f\"\u0004\b\u000e\u0010%R\"\u00107\u001a\u00020\u001e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010 \u001a\u0004\b.\u0010!\"\u0004\b\u000e\u0010\"R\"\u00109\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b8\u0010\n\u001a\u0004\b1\u0010\f\"\u0004\b\u0012\u0010%R\"\u0010;\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b:\u0010\n\u001a\u0004\b8\u0010\f\"\u0004\b\u0019\u0010%R\u0013\u0010=\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u001f\u0010<¨\u0006F"}, d2 = {"Lcom/ironsource/fa;", "", "Lcom/ironsource/la;", "placement", "", "a", "", "placementName", "toString", "", "Z", CmcdHeadersFactory.STREAM_TYPE_LIVE, "()Z", "mThreadPerManager", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, CampaignEx.JSON_KEY_AD_K, "mSharedManagersThread", "Lcom/ironsource/r0;", "c", "Lcom/ironsource/r0;", "g", "()Lcom/ironsource/r0;", "(Lcom/ironsource/r0;)V", "eventsConfigurations", "", "d", "I", "()I", "(I)V", "adaptersSmartLoadAmount", "", "e", "J", "()J", "(J)V", "adaptersSmartLoadTimeoutInMills", "f", "(Z)V", "adapterAdvancedLoading", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "mPlacements", CmcdHeadersFactory.STREAMING_FORMAT_HLS, "Lcom/ironsource/la;", "mDefaultPlacement", CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, "delayLoadFailure", "Lcom/ironsource/mediationsdk/utils/a;", "j", "Lcom/ironsource/mediationsdk/utils/a;", "()Lcom/ironsource/mediationsdk/utils/a;", "(Lcom/ironsource/mediationsdk/utils/a;)V", "auctionSettings", "mCollectBiddingDataAsyncEnabled", "mCollectBiddingDataTimeout", "m", "mProvidersParallelInit", m4.p, "mWaitUntilAllProvidersFinishInit", "()Lcom/ironsource/la;", "defaultPlacement", "events", "collectBiddingDataAsyncEnabled", "collectBiddingDataTimeout", "providersParallelInit", "waitUntilAllProvidersFinishInit", "<init>", "(IJZLcom/ironsource/r0;Lcom/ironsource/mediationsdk/utils/a;IZJZZZZ)V", "o", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class fa {
    private static final int p = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean mThreadPerManager;

    /* renamed from: b, reason: from kotlin metadata */
    private final boolean mSharedManagersThread;

    /* renamed from: c, reason: from kotlin metadata */
    private r0 eventsConfigurations;

    /* renamed from: d, reason: from kotlin metadata */
    private int adaptersSmartLoadAmount;

    /* renamed from: e, reason: from kotlin metadata */
    private long adaptersSmartLoadTimeoutInMills;

    /* renamed from: f, reason: from kotlin metadata and from toString */
    private boolean bidderExclusive;

    /* renamed from: g, reason: from kotlin metadata */
    private final ArrayList<la> mPlacements;

    /* renamed from: h, reason: from kotlin metadata */
    private la mDefaultPlacement;

    /* renamed from: i, reason: from kotlin metadata */
    private int delayLoadFailure;

    /* renamed from: j, reason: from kotlin metadata */
    private a auctionSettings;

    /* renamed from: k, reason: from kotlin metadata */
    private boolean mCollectBiddingDataAsyncEnabled;

    /* renamed from: l, reason: from kotlin metadata */
    private long mCollectBiddingDataTimeout;

    /* renamed from: m, reason: from kotlin metadata */
    private boolean mProvidersParallelInit;

    /* renamed from: n, reason: from kotlin metadata */
    private boolean mWaitUntilAllProvidersFinishInit;

    public fa(int i, long j, boolean z, r0 events, a auctionSettings, int i2, boolean z2, long j2, boolean z3, boolean z4, boolean z5, boolean z6) {
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(auctionSettings, "auctionSettings");
        this.mThreadPerManager = z5;
        this.mSharedManagersThread = z6;
        this.mPlacements = new ArrayList<>();
        this.adaptersSmartLoadAmount = i;
        this.adaptersSmartLoadTimeoutInMills = j;
        this.bidderExclusive = z;
        this.eventsConfigurations = events;
        this.delayLoadFailure = i2;
        this.auctionSettings = auctionSettings;
        this.mCollectBiddingDataAsyncEnabled = z2;
        this.mCollectBiddingDataTimeout = j2;
        this.mProvidersParallelInit = z3;
        this.mWaitUntilAllProvidersFinishInit = z4;
    }

    public final la a(String placementName) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        Iterator<la> it = this.mPlacements.iterator();
        while (it.hasNext()) {
            la next = it.next();
            if (Intrinsics.areEqual(next.getPlacementName(), placementName)) {
                return next;
            }
        }
        return null;
    }

    public final void a(int i) {
        this.adaptersSmartLoadAmount = i;
    }

    public final void a(long j) {
        this.adaptersSmartLoadTimeoutInMills = j;
    }

    public final void a(la placement) {
        if (placement != null) {
            this.mPlacements.add(placement);
            if (this.mDefaultPlacement == null || placement.getCom.ironsource.t2.k java.lang.String() == 0) {
                this.mDefaultPlacement = placement;
            }
        }
    }

    public final void a(a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.auctionSettings = aVar;
    }

    public final void a(r0 r0Var) {
        Intrinsics.checkNotNullParameter(r0Var, "<set-?>");
        this.eventsConfigurations = r0Var;
    }

    public final void a(boolean z) {
        this.bidderExclusive = z;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getBidderExclusive() {
        return this.bidderExclusive;
    }

    /* renamed from: b, reason: from getter */
    public final int getAdaptersSmartLoadAmount() {
        return this.adaptersSmartLoadAmount;
    }

    public final void b(int i) {
        this.delayLoadFailure = i;
    }

    public final void b(long j) {
        this.mCollectBiddingDataTimeout = j;
    }

    public final void b(boolean z) {
        this.mCollectBiddingDataAsyncEnabled = z;
    }

    /* renamed from: c, reason: from getter */
    public final long getAdaptersSmartLoadTimeoutInMills() {
        return this.adaptersSmartLoadTimeoutInMills;
    }

    public final void c(boolean z) {
        this.mProvidersParallelInit = z;
    }

    /* renamed from: d, reason: from getter */
    public final a getAuctionSettings() {
        return this.auctionSettings;
    }

    public final void d(boolean z) {
        this.mWaitUntilAllProvidersFinishInit = z;
    }

    public final la e() {
        Iterator<la> it = this.mPlacements.iterator();
        while (it.hasNext()) {
            la next = it.next();
            if (next.getIsDefault()) {
                return next;
            }
        }
        return this.mDefaultPlacement;
    }

    /* renamed from: f, reason: from getter */
    public final int getDelayLoadFailure() {
        return this.delayLoadFailure;
    }

    /* renamed from: g, reason: from getter */
    public final r0 getEventsConfigurations() {
        return this.eventsConfigurations;
    }

    /* renamed from: h, reason: from getter */
    public final boolean getMCollectBiddingDataAsyncEnabled() {
        return this.mCollectBiddingDataAsyncEnabled;
    }

    /* renamed from: i, reason: from getter */
    public final long getMCollectBiddingDataTimeout() {
        return this.mCollectBiddingDataTimeout;
    }

    /* renamed from: j, reason: from getter */
    public final boolean getMProvidersParallelInit() {
        return this.mProvidersParallelInit;
    }

    /* renamed from: k, reason: from getter */
    public final boolean getMSharedManagersThread() {
        return this.mSharedManagersThread;
    }

    /* renamed from: l, reason: from getter */
    public final boolean getMThreadPerManager() {
        return this.mThreadPerManager;
    }

    /* renamed from: m, reason: from getter */
    public final boolean getMWaitUntilAllProvidersFinishInit() {
        return this.mWaitUntilAllProvidersFinishInit;
    }

    public String toString() {
        return "NativeAdConfigurations{parallelLoad=" + this.adaptersSmartLoadAmount + ", bidderExclusive=" + this.bidderExclusive + AbstractJsonLexerKt.END_OBJ;
    }
}
