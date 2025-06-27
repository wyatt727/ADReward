package com.json;

import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.json.mediationsdk.IronSource;
import com.json.mediationsdk.d;
import com.json.mediationsdk.model.NetworkSettings;
import com.json.mediationsdk.utils.a;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000f\b\u0016\u0018\u0000 \u00072\u00020\u0001:\u0001\u0005B\u009b\u0001\u0012\u0006\u0010\r\u001a\u00020\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u001c\u001a\u00020\u0018\u0012\u0006\u0010#\u001a\u00020\u001d\u0012\u0006\u0010&\u001a\u00020\u001d\u0012\u0006\u0010+\u001a\u00020\u0006\u0012\u0006\u0010-\u001a\u00020\u001d\u0012\u0006\u0010.\u001a\u00020\u001d\u0012\u0006\u00102\u001a\u00020/\u0012\u0006\u00104\u001a\u00020\u0006\u0012\u0006\u00109\u001a\u000205\u0012\u0006\u0010;\u001a\u00020\u0006\u0012\u0006\u0010=\u001a\u00020\u0006\u0012\u0006\u0010?\u001a\u00020\u0006\u0012\u0006\u0010@\u001a\u00020\u0006\u0012\b\b\u0002\u0010A\u001a\u00020\u0006¢\u0006\u0004\bB\u0010CJ\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\b\u001a\u00020\u0002R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001c\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\"\u0010#\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\u0005\u0010\"R\u0017\u0010&\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!R\"\u0010+\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b\u0013\u0010)\"\u0004\b\u0005\u0010*R\u0017\u0010-\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b,\u0010\u001f\u001a\u0004\b'\u0010!R\u0017\u0010.\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b\u0005\u0010!R\u0017\u00102\u001a\u00020/8\u0006¢\u0006\f\n\u0004\b\u0015\u00100\u001a\u0004\b,\u00101R\u0017\u00104\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b3\u0010(\u001a\u0004\b\u001e\u0010)R\u0017\u00109\u001a\u0002058\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b$\u00108R\u0017\u0010;\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b:\u0010(\u001a\u0004\b3\u0010)R\u0017\u0010=\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b%\u0010(\u001a\u0004\b<\u0010)R\u0017\u0010?\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b>\u0010(\u001a\u0004\b>\u0010)R\u0017\u0010@\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010(\u001a\u0004\b6\u0010)R\"\u0010A\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010(\u001a\u0004\b:\u0010)\"\u0004\b\u000b\u0010*¨\u0006D"}, d2 = {"Lcom/ironsource/p;", "", "", "instanceName", "Lcom/ironsource/mediationsdk/model/NetworkSettings;", "a", "", "r", CmcdHeadersFactory.STREAMING_FORMAT_SS, "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "()Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "adUnit", "Ljava/lang/String;", "p", "()Ljava/lang/String;", "userId", "", "c", "Ljava/util/List;", "j", "()Ljava/util/List;", "providerList", "Lcom/ironsource/mediationsdk/utils/a;", "d", "Lcom/ironsource/mediationsdk/utils/a;", "()Lcom/ironsource/mediationsdk/utils/a;", "auctionSettings", "", "e", "I", CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, "()I", "(I)V", "maxSmashesToLoad", "f", m4.p, "smashLoadTimeout", "g", "Z", "()Z", "(Z)V", "advancedLoading", CmcdHeadersFactory.STREAMING_FORMAT_HLS, "delayLoadFailure", "adExpirationInMinutes", "Lcom/ironsource/d0;", "Lcom/ironsource/d0;", "()Lcom/ironsource/d0;", "loadingData", CampaignEx.JSON_KEY_AD_K, "collectBiddingDataAsyncEnabled", "", CmcdHeadersFactory.STREAM_TYPE_LIVE, "J", "()J", "collectBiddingDataTimeout", "m", "providersParallelInit", CampaignEx.JSON_KEY_AD_Q, "waitUntilAllProvidersFinishInit", "o", "threadPerManager", "sharedManagersThread", d.q0, "<init>", "(Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;Ljava/lang/String;Ljava/util/List;Lcom/ironsource/mediationsdk/utils/a;IIZIILcom/ironsource/d0;ZJZZZZZ)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public class p {
    public static final int s = -1;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final IronSource.AD_UNIT adUnit;

    /* renamed from: b, reason: from kotlin metadata */
    private final String userId;

    /* renamed from: c, reason: from kotlin metadata */
    private final List<NetworkSettings> providerList;

    /* renamed from: d, reason: from kotlin metadata */
    private final a auctionSettings;

    /* renamed from: e, reason: from kotlin metadata */
    private int maxSmashesToLoad;

    /* renamed from: f, reason: from kotlin metadata */
    private final int smashLoadTimeout;

    /* renamed from: g, reason: from kotlin metadata */
    private boolean advancedLoading;

    /* renamed from: h, reason: from kotlin metadata */
    private final int delayLoadFailure;

    /* renamed from: i, reason: from kotlin metadata */
    private final int adExpirationInMinutes;

    /* renamed from: j, reason: from kotlin metadata */
    private final d0 loadingData;

    /* renamed from: k, reason: from kotlin metadata */
    private final boolean collectBiddingDataAsyncEnabled;

    /* renamed from: l, reason: from kotlin metadata */
    private final long collectBiddingDataTimeout;

    /* renamed from: m, reason: from kotlin metadata */
    private final boolean providersParallelInit;

    /* renamed from: n, reason: from kotlin metadata */
    private final boolean waitUntilAllProvidersFinishInit;

    /* renamed from: o, reason: from kotlin metadata */
    private final boolean threadPerManager;

    /* renamed from: p, reason: from kotlin metadata */
    private final boolean sharedManagersThread;

    /* renamed from: q, reason: from kotlin metadata */
    private boolean showPriorityEnabled;

    /* JADX WARN: Multi-variable type inference failed */
    public p(IronSource.AD_UNIT adUnit, String str, List<? extends NetworkSettings> list, a auctionSettings, int i, int i2, boolean z, int i3, int i4, d0 loadingData, boolean z2, long j, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(auctionSettings, "auctionSettings");
        Intrinsics.checkNotNullParameter(loadingData, "loadingData");
        this.adUnit = adUnit;
        this.userId = str;
        this.providerList = list;
        this.auctionSettings = auctionSettings;
        this.maxSmashesToLoad = i;
        this.smashLoadTimeout = i2;
        this.advancedLoading = z;
        this.delayLoadFailure = i3;
        this.adExpirationInMinutes = i4;
        this.loadingData = loadingData;
        this.collectBiddingDataAsyncEnabled = z2;
        this.collectBiddingDataTimeout = j;
        this.providersParallelInit = z3;
        this.waitUntilAllProvidersFinishInit = z4;
        this.threadPerManager = z5;
        this.sharedManagersThread = z6;
        this.showPriorityEnabled = z7;
    }

    public /* synthetic */ p(IronSource.AD_UNIT ad_unit, String str, List list, a aVar, int i, int i2, boolean z, int i3, int i4, d0 d0Var, boolean z2, long j, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(ad_unit, str, list, aVar, i, i2, z, i3, i4, d0Var, z2, j, z3, z4, z5, z6, (i5 & 65536) != 0 ? false : z7);
    }

    /* renamed from: a, reason: from getter */
    public final int getAdExpirationInMinutes() {
        return this.adExpirationInMinutes;
    }

    public final NetworkSettings a(String instanceName) {
        Intrinsics.checkNotNullParameter(instanceName, "instanceName");
        List<NetworkSettings> listJ = j();
        Object obj = null;
        if (listJ == null) {
            return null;
        }
        Iterator<T> it = listJ.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((NetworkSettings) next).getProviderInstanceName().equals(instanceName)) {
                obj = next;
                break;
            }
        }
        return (NetworkSettings) obj;
    }

    public final void a(int i) {
        this.maxSmashesToLoad = i;
    }

    public final void a(boolean z) {
        this.advancedLoading = z;
    }

    /* renamed from: b, reason: from getter */
    public final IronSource.AD_UNIT getAdUnit() {
        return this.adUnit;
    }

    public final void b(boolean z) {
        this.showPriorityEnabled = z;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getAdvancedLoading() {
        return this.advancedLoading;
    }

    /* renamed from: d, reason: from getter */
    public final a getAuctionSettings() {
        return this.auctionSettings;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getCollectBiddingDataAsyncEnabled() {
        return this.collectBiddingDataAsyncEnabled;
    }

    /* renamed from: f, reason: from getter */
    public final long getCollectBiddingDataTimeout() {
        return this.collectBiddingDataTimeout;
    }

    /* renamed from: g, reason: from getter */
    public final int getDelayLoadFailure() {
        return this.delayLoadFailure;
    }

    /* renamed from: h, reason: from getter */
    public final d0 getLoadingData() {
        return this.loadingData;
    }

    /* renamed from: i, reason: from getter */
    public final int getMaxSmashesToLoad() {
        return this.maxSmashesToLoad;
    }

    public List<NetworkSettings> j() {
        return this.providerList;
    }

    /* renamed from: k, reason: from getter */
    public final boolean getProvidersParallelInit() {
        return this.providersParallelInit;
    }

    /* renamed from: l, reason: from getter */
    public final boolean getSharedManagersThread() {
        return this.sharedManagersThread;
    }

    /* renamed from: m, reason: from getter */
    public final boolean getShowPriorityEnabled() {
        return this.showPriorityEnabled;
    }

    /* renamed from: n, reason: from getter */
    public final int getSmashLoadTimeout() {
        return this.smashLoadTimeout;
    }

    /* renamed from: o, reason: from getter */
    public final boolean getThreadPerManager() {
        return this.threadPerManager;
    }

    /* renamed from: p, reason: from getter */
    public String getUserId() {
        return this.userId;
    }

    /* renamed from: q, reason: from getter */
    public final boolean getWaitUntilAllProvidersFinishInit() {
        return this.waitUntilAllProvidersFinishInit;
    }

    public final boolean r() {
        return this.auctionSettings.g() > 0;
    }

    public final String s() {
        String str = String.format(Locale.getDefault(), "%s: %d, %s: %b, %s: %b", d.o0, Integer.valueOf(this.maxSmashesToLoad), d.p0, Boolean.valueOf(this.advancedLoading), d.q0, Boolean.valueOf(this.showPriorityEnabled));
        Intrinsics.checkNotNullExpressionValue(str, "format(\n        Locale.g…showPriorityEnabled\n    )");
        return str;
    }
}
