package com.json;

import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b%\u0010&J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0013\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0017\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0019\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012R\u0017\u0010\u001b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u001a\u0010\u0012R\u0017\u0010\u001f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010!\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b \u0010\u0010\u001a\u0004\b \u0010\u0012R\u0017\u0010#\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\"\u0010\u0010\u001a\u0004\b\"\u0010\u0012R\u0017\u0010$\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u000f\u0010\u001e¨\u0006'"}, d2 = {"Lcom/ironsource/t0;", "", "Lorg/json/JSONObject;", "a", "config", "", "toString", "", "hashCode", "other", "", "equals", "Lorg/json/JSONObject;", "c", "()Lorg/json/JSONObject;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Z", "j", "()Z", "isExternalArmEventsEnabled", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "externalArmEventsUrl", "f", "shouldUseAppSet", "e", "shouldReuseAdvId", "I", CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, "()I", "userAgentExpirationThresholdInHours", "g", "shouldUseSharedThreadPool", CmcdHeadersFactory.STREAMING_FORMAT_HLS, "shouldUseSharedThreadPoolAdPlayer", "cmpId", "<init>", "(Lorg/json/JSONObject;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: com.ironsource.t0, reason: from toString */
/* loaded from: classes4.dex */
public final /* data */ class ApplicationGeneralSettings {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final JSONObject config;

    /* renamed from: b, reason: from kotlin metadata */
    private final boolean isExternalArmEventsEnabled;

    /* renamed from: c, reason: from kotlin metadata */
    private final String externalArmEventsUrl;

    /* renamed from: d, reason: from kotlin metadata */
    private final boolean shouldUseAppSet;

    /* renamed from: e, reason: from kotlin metadata */
    private final boolean shouldReuseAdvId;

    /* renamed from: f, reason: from kotlin metadata */
    private final int userAgentExpirationThresholdInHours;

    /* renamed from: g, reason: from kotlin metadata */
    private final boolean shouldUseSharedThreadPool;

    /* renamed from: h, reason: from kotlin metadata */
    private final boolean shouldUseSharedThreadPoolAdPlayer;

    /* renamed from: i, reason: from kotlin metadata */
    private final int cmpId;

    public ApplicationGeneralSettings(JSONObject config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.config = config;
        this.isExternalArmEventsEnabled = config.optBoolean("isExternalArmEventsEnabled", true);
        String strOptString = config.optString("externalArmEventsUrl", x4.j);
        Intrinsics.checkNotNullExpressionValue(strOptString, "config.optString(EXTERNA…AL_EVENTS_IMPRESSION_URL)");
        this.externalArmEventsUrl = strOptString;
        this.shouldUseAppSet = config.optBoolean("sid", true);
        this.shouldReuseAdvId = config.optBoolean("radvid", false);
        this.userAgentExpirationThresholdInHours = config.optInt("uaeh", 0);
        this.shouldUseSharedThreadPool = config.optBoolean("sharedThreadPool", false);
        this.shouldUseSharedThreadPoolAdPlayer = config.optBoolean("sharedThreadPoolADP", true);
        this.cmpId = config.optInt(i5.u0, -1);
    }

    public static /* synthetic */ ApplicationGeneralSettings a(ApplicationGeneralSettings applicationGeneralSettings, JSONObject jSONObject, int i, Object obj) {
        if ((i & 1) != 0) {
            jSONObject = applicationGeneralSettings.config;
        }
        return applicationGeneralSettings.a(jSONObject);
    }

    public final ApplicationGeneralSettings a(JSONObject config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return new ApplicationGeneralSettings(config);
    }

    /* renamed from: a, reason: from getter */
    public final JSONObject getConfig() {
        return this.config;
    }

    /* renamed from: b, reason: from getter */
    public final int getCmpId() {
        return this.cmpId;
    }

    public final JSONObject c() {
        return this.config;
    }

    /* renamed from: d, reason: from getter */
    public final String getExternalArmEventsUrl() {
        return this.externalArmEventsUrl;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getShouldReuseAdvId() {
        return this.shouldReuseAdvId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ApplicationGeneralSettings) && Intrinsics.areEqual(this.config, ((ApplicationGeneralSettings) other).config);
    }

    /* renamed from: f, reason: from getter */
    public final boolean getShouldUseAppSet() {
        return this.shouldUseAppSet;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getShouldUseSharedThreadPool() {
        return this.shouldUseSharedThreadPool;
    }

    /* renamed from: h, reason: from getter */
    public final boolean getShouldUseSharedThreadPoolAdPlayer() {
        return this.shouldUseSharedThreadPoolAdPlayer;
    }

    public int hashCode() {
        return this.config.hashCode();
    }

    /* renamed from: i, reason: from getter */
    public final int getUserAgentExpirationThresholdInHours() {
        return this.userAgentExpirationThresholdInHours;
    }

    /* renamed from: j, reason: from getter */
    public final boolean getIsExternalArmEventsEnabled() {
        return this.isExternalArmEventsEnabled;
    }

    public String toString() {
        return "ApplicationGeneralSettings(config=" + this.config + ')';
    }
}
