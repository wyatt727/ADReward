package com.json.mediationsdk;

import android.content.Context;
import com.json.h1;
import com.json.mediationsdk.e;
import com.json.mediationsdk.utils.a;
import com.json.y0;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.net.URL;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J \u0010\u0007\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u0007\u001a\u00020\u000bH\u0016R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/ironsource/mediationsdk/f;", "Lcom/ironsource/mediationsdk/g;", "Landroid/content/Context;", "context", "Lcom/ironsource/mediationsdk/i;", "auctionRequestParams", "Lorg/json/JSONObject;", "a", "Lcom/ironsource/y0;", "auctionListener", "Lcom/ironsource/mediationsdk/e$a;", "", "Lcom/ironsource/mediationsdk/utils/a;", "Lcom/ironsource/mediationsdk/utils/a;", d.g, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Z", "isOneToken", "", "c", "Ljava/lang/String;", "sessionId", "<init>", "(Lcom/ironsource/mediationsdk/utils/a;ZLjava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class f implements g {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a settings;

    /* renamed from: b, reason: from kotlin metadata */
    private final boolean isOneToken;

    /* renamed from: c, reason: from kotlin metadata */
    private final String sessionId;

    public f(a settings, boolean z, String sessionId) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.settings = settings;
        this.isOneToken = z;
        this.sessionId = sessionId;
    }

    private final JSONObject a(Context context, AuctionRequestParams auctionRequestParams) throws JSONException {
        new JSONObject();
        if (this.isOneToken) {
            JSONObject jSONObjectA = d.c().a(auctionRequestParams);
            Intrinsics.checkNotNullExpressionValue(jSONObjectA, "getInstance().enrichToke…low(auctionRequestParams)");
            return jSONObjectA;
        }
        IronSourceSegment segment = auctionRequestParams.getSegment();
        JSONObject jSONObjectA2 = d.c().a(context, auctionRequestParams.e(), auctionRequestParams.i(), auctionRequestParams.getAuctionHistory(), auctionRequestParams.getSessionDepth(), this.sessionId, this.settings, auctionRequestParams.getBannerSize(), segment != null ? segment.toJson() : null, auctionRequestParams.getTestSuiteLaunched(), auctionRequestParams.getUseTestAds());
        Intrinsics.checkNotNullExpressionValue(jSONObjectA2, "getInstance().enrichToke….useTestAds\n            )");
        jSONObjectA2.put("adUnit", auctionRequestParams.b());
        jSONObjectA2.put(d.l0, auctionRequestParams.getIsEncryptedResponse() ? "false" : com.json.mediationsdk.metadata.a.g);
        if (auctionRequestParams.getIsDemandOnly()) {
            jSONObjectA2.put("isDemandOnly", 1);
        }
        if (!auctionRequestParams.getIsOneFlow()) {
            return jSONObjectA2;
        }
        jSONObjectA2.put("isOneFlow", 1);
        return jSONObjectA2;
    }

    @Override // com.json.mediationsdk.g
    public e.a a(Context context, AuctionRequestParams auctionRequestParams, y0 auctionListener) throws JSONException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(auctionRequestParams, "auctionRequestParams");
        Intrinsics.checkNotNullParameter(auctionListener, "auctionListener");
        JSONObject jSONObjectA = a(context, auctionRequestParams);
        String strA = this.settings.a(auctionRequestParams.getIsDemandOnly());
        return auctionRequestParams.getIsDemandOnly() ? new h1(auctionListener, new URL(strA), jSONObjectA, auctionRequestParams.getIsEncryptedResponse(), this.settings.g(), this.settings.m(), this.settings.n(), this.settings.o(), this.settings.d()) : new e.a(auctionListener, new URL(strA), jSONObjectA, auctionRequestParams.getIsEncryptedResponse(), this.settings.g(), this.settings.m(), this.settings.n(), this.settings.o(), this.settings.d());
    }

    @Override // com.json.mediationsdk.g
    public boolean a() {
        return this.settings.g() > 0;
    }
}
