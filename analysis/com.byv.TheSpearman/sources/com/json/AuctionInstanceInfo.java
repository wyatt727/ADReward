package com.json;

import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.json.mediationsdk.h;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b(\u0010)J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u0016\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012\"\u0004\b\u0003\u0010\u0015R\"\u0010\u001a\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0003\u0010\u0019R.\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u0005\u0010\u001fR$\u0010%\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\"\u001a\u0004\b\u0017\u0010#\"\u0004\b\u0003\u0010$R.\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001c\u001a\u0004\b\u0013\u0010\u001e\"\u0004\b\u0003\u0010\u001f¨\u0006*"}, d2 = {"Lcom/ironsource/b1;", "", "", "a", "", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "name", "bidder", "toString", "", "hashCode", "other", "equals", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "Z", "e", "()Z", "c", CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, "(Z)V", "useTestAds", "d", CmcdHeadersFactory.STREAMING_FORMAT_HLS, "(Ljava/lang/String;)V", "plumbus", "", "Ljava/util/Map;", "f", "()Ljava/util/Map;", "(Ljava/util/Map;)V", "biddingData", "Lcom/ironsource/mediationsdk/h;", "Lcom/ironsource/mediationsdk/h;", "()Lcom/ironsource/mediationsdk/h;", "(Lcom/ironsource/mediationsdk/h;)V", "auctionHistory", "", "additionalData", "<init>", "(Ljava/lang/String;Z)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: com.ironsource.b1, reason: from toString */
/* loaded from: classes4.dex */
public final /* data */ class AuctionInstanceInfo {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* renamed from: b, reason: from kotlin metadata and from toString */
    private final boolean bidder;

    /* renamed from: c, reason: from kotlin metadata */
    private boolean useTestAds;

    /* renamed from: d, reason: from kotlin metadata */
    private String plumbus;

    /* renamed from: e, reason: from kotlin metadata */
    private Map<String, ? extends Object> biddingData;

    /* renamed from: f, reason: from kotlin metadata */
    private h auctionHistory;

    /* renamed from: g, reason: from kotlin metadata */
    private Map<String, Object> additionalData;

    public AuctionInstanceInfo(String name, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.bidder = z;
        this.plumbus = "";
        this.biddingData = MapsKt.emptyMap();
        this.additionalData = new HashMap();
    }

    public static /* synthetic */ AuctionInstanceInfo a(AuctionInstanceInfo auctionInstanceInfo, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = auctionInstanceInfo.name;
        }
        if ((i & 2) != 0) {
            z = auctionInstanceInfo.bidder;
        }
        return auctionInstanceInfo.a(str, z);
    }

    public final AuctionInstanceInfo a(String name, boolean bidder) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new AuctionInstanceInfo(name, bidder);
    }

    /* renamed from: a, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final void a(h hVar) {
        this.auctionHistory = hVar;
    }

    public final void a(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.plumbus = str;
    }

    public final void a(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.additionalData = map;
    }

    public final void a(boolean z) {
        this.useTestAds = z;
    }

    public final void b(Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.biddingData = map;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getBidder() {
        return this.bidder;
    }

    public final Map<String, Object> c() {
        return this.additionalData;
    }

    /* renamed from: d, reason: from getter */
    public final h getAuctionHistory() {
        return this.auctionHistory;
    }

    public final boolean e() {
        return this.bidder;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuctionInstanceInfo)) {
            return false;
        }
        AuctionInstanceInfo auctionInstanceInfo = (AuctionInstanceInfo) other;
        return Intrinsics.areEqual(this.name, auctionInstanceInfo.name) && this.bidder == auctionInstanceInfo.bidder;
    }

    public final Map<String, Object> f() {
        return this.biddingData;
    }

    public final String g() {
        return this.name;
    }

    /* renamed from: h, reason: from getter */
    public final String getPlumbus() {
        return this.plumbus;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        boolean z = this.bidder;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return iHashCode + i;
    }

    /* renamed from: i, reason: from getter */
    public final boolean getUseTestAds() {
        return this.useTestAds;
    }

    public String toString() {
        return "AuctionInstanceInfo(name=" + this.name + ", bidder=" + this.bidder + ')';
    }
}
