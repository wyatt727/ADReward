package com.json;

import android.content.Context;
import com.json.environment.ContextProvider;
import com.json.mediationsdk.IronSource;
import com.json.mediationsdk.d;
import com.json.mediationsdk.logger.IronLog;
import com.json.mediationsdk.p;
import com.json.mediationsdk.server.HttpFunctions;
import com.json.mediationsdk.utils.IronSourceUtils;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J*\u0010\b\u001a\u00020\u00072\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\u0012\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0016\u0010\u0013\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/ironsource/w4;", "Lcom/ironsource/za;", "Lorg/json/JSONObject;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "", "dataSource", "impressionData", "", "a", "", "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "adUnits", "", "revived", "Lcom/ironsource/l2;", d.j, "reason", "d", "Z", "isExternalArmEventsEnabled", "Ljava/lang/String;", "externalArmEventsUrl", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class w4 implements za {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean isExternalArmEventsEnabled = true;

    /* renamed from: b, reason: from kotlin metadata */
    private String externalArmEventsUrl = x4.j;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/ironsource/w4$a", "Lcom/ironsource/v5;", "", "requestSucceeded", "", "a", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements v5 {
        a() {
        }

        @Override // com.json.v5
        public void a(boolean requestSucceeded) {
            if (requestSucceeded) {
                return;
            }
            IronLog.API.error("failed to send impression data");
        }
    }

    private final JSONObject b() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(td.p0, "android");
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        if (applicationContext != null) {
            jSONObject.put("deviceType", IronSourceUtils.getDeviceType(applicationContext));
            IronSourceAdvId ironSourceAdvId = IronSourceUtils.getIronSourceAdvId(applicationContext);
            if (ironSourceAdvId != null) {
                jSONObject.put(td.b, ironSourceAdvId.c());
                jSONObject.put(td.i1, ironSourceAdvId.d());
            }
        }
        String strQ = p.p().q();
        if (strQ != null) {
            jSONObject.put("applicationKey", strQ);
        }
        return jSONObject;
    }

    @Override // com.json.za
    public void a() {
    }

    public final void a(String dataSource, JSONObject impressionData) throws JSONException {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        Intrinsics.checkNotNullParameter(impressionData, "impressionData");
        if (!this.isExternalArmEventsEnabled) {
            IronLog.INTERNAL.verbose("disabled from server");
            return;
        }
        try {
            JSONObject jSONObjectB = b();
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("externalMediationSource", dataSource);
            jSONObject.putOpt("externalMediationData", impressionData);
            jSONObject.putOpt("clientParams", jSONObjectB);
            IronLog.API.info("impressionData: " + jSONObject);
            HttpFunctions.sendPostRequest(this.externalArmEventsUrl, jSONObject.toString(), new a());
        } catch (Exception e) {
            IronLog.API.error("exception " + e.getMessage() + " sending impression data");
            e.printStackTrace();
        }
    }

    @Override // com.json.za
    public void a(List<IronSource.AD_UNIT> adUnits, boolean revived, l2 configurations) {
        if (configurations != null) {
            o0 applicationConfigurations = configurations.getApplicationConfigurations();
            ApplicationGeneralSettings applicationGeneralSettingsE = applicationConfigurations != null ? applicationConfigurations.e() : null;
            Intrinsics.checkNotNull(applicationGeneralSettingsE);
            this.isExternalArmEventsEnabled = applicationGeneralSettingsE.getIsExternalArmEventsEnabled();
            this.externalArmEventsUrl = configurations.getApplicationConfigurations().e().getExternalArmEventsUrl();
        }
    }

    @Override // com.json.za
    public void d(String reason) {
    }
}
