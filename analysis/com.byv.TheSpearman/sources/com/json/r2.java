package com.json;

import android.text.TextUtils;
import android.util.Log;
import com.json.environment.ContextProvider;
import com.json.mediationsdk.AbstractAdapter;
import com.json.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.json.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper;
import com.json.mediationsdk.adunit.adapter.internal.AdapterConsentInterface;
import com.json.mediationsdk.d;
import com.json.mediationsdk.logger.IronLog;
import com.json.mediationsdk.model.NetworkSettings;
import com.json.mediationsdk.utils.IronSourceConstants;
import com.json.mediationsdk.utils.IronSourceUtils;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u000e\u0010\u0005\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0004J.\u0010\u0005\u001a\u00020\t2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e0\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00100\rJ\u0018\u0010\u0005\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0018\u0010\u0005\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u0005\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u000bJ\"\u0010\u0005\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u000b2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\rR(\u0010\u0019\u001a\u0004\u0018\u00010\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0005\u0010\u0018R\u0017\u0010\u001d\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b\n\u0010\u001c¨\u0006 "}, d2 = {"Lcom/ironsource/r2;", "", "Lcom/ironsource/mediationsdk/model/NetworkSettings;", d.g, "", "a", "(Lcom/ironsource/mediationsdk/model/NetworkSettings;)Ljava/lang/Boolean;", "", "message", "", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "", "consentValue", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/ironsource/mediationsdk/AbstractAdapter;", "adapters", "Lcom/ironsource/mediationsdk/adunit/adapter/internal/AdapterBaseWrapper;", "networkAdapters", "Lcom/ironsource/mediationsdk/adunit/adapter/internal/AdapterBaseInterface;", "adapter", "cmpId", "providerSettings", "<set-?>", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "consent", "Lcom/ironsource/b6;", "Lcom/ironsource/b6;", "()Lcom/ironsource/b6;", "deviceInfoService", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class r2 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Boolean consent;

    /* renamed from: b, reason: from kotlin metadata */
    private final b6 deviceInfoService = ca.INSTANCE.d().c();

    private final int a(String message) {
        return Log.i("ironSourceSDK: GENERAL", message);
    }

    private final Boolean a(NetworkSettings settings) {
        return (settings == null || settings.isCustomNetwork()) ? this.consent : settings.getApplicationSettings().has("cnstcmp") ? Boolean.valueOf(settings.getApplicationSettings().optBoolean("cnstcmp")) : this.consent;
    }

    private final void b(String message) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(message)) {
                jSONObject.put("reason", message);
            }
            o8.i().a(new l4(IronSourceConstants.TROUBLESHOOTING_CONSENT_INTERNAL_ERROR, jSONObject));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a, reason: from getter */
    public final Boolean getConsent() {
        return this.consent;
    }

    public final void a(int cmpId) {
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        try {
            mediationAdditionalData.put(IronSourceConstants.EVENTS_EXT1, cmpId + ';' + this.deviceInfoService.H(ContextProvider.getInstance().getApplicationContext()));
        } catch (Exception e) {
            IronLog.INTERNAL.error(ExceptionsKt.stackTraceToString(e));
        }
        dc.i().a(new l4(42, mediationAdditionalData));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(int r7, java.util.concurrent.ConcurrentHashMap<java.lang.String, com.json.mediationsdk.model.NetworkSettings> r8) {
        /*
            r6 = this;
            java.lang.String r0 = "providerSettings"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            com.ironsource.b6 r0 = r6.deviceInfoService
            com.ironsource.environment.ContextProvider r1 = com.json.environment.ContextProvider.getInstance()
            android.content.Context r1 = r1.getApplicationContext()
            java.lang.String r0 = r0.H(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "TCF Additional Consent: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r6.a(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "CMP ID: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r6.a(r7)
            java.lang.String r7 = "Network Consent Reporting:"
            r6.a(r7)
            java.lang.String r7 = "----------------------------"
            r6.a(r7)
            java.util.Collection r7 = r8.values()
            java.lang.String r8 = "providerSettings.values"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r7 = r7.iterator()
        L57:
            boolean r0 = r7.hasNext()
            java.lang.String r1 = "cnstcmp"
            r2 = 0
            if (r0 == 0) goto L8e
            java.lang.Object r0 = r7.next()
            r3 = r0
            com.ironsource.mediationsdk.model.NetworkSettings r3 = (com.json.mediationsdk.model.NetworkSettings) r3
            java.lang.String r4 = r3.getProviderDefaultInstance()
            if (r4 == 0) goto L87
            java.lang.String r4 = r3.getProviderDefaultInstance()
            java.lang.String r5 = "SupersonicAds"
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r5)
            if (r4 != 0) goto L87
            org.json.JSONObject r3 = r3.getApplicationSettings()
            if (r3 == 0) goto L83
            java.lang.Object r2 = r3.opt(r1)
        L83:
            if (r2 == 0) goto L87
            r1 = 1
            goto L88
        L87:
            r1 = 0
        L88:
            if (r1 == 0) goto L57
            r8.add(r0)
            goto L57
        L8e:
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r8 = r8.iterator()
        L9c:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto Lb7
            java.lang.Object r3 = r8.next()
            r4 = r3
            com.ironsource.mediationsdk.model.NetworkSettings r4 = (com.json.mediationsdk.model.NetworkSettings) r4
            java.lang.String r4 = r4.getProviderDefaultInstance()
            boolean r4 = r7.add(r4)
            if (r4 == 0) goto L9c
            r0.add(r3)
            goto L9c
        Lb7:
            java.util.Iterator r7 = r0.iterator()
        Lbb:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto Lef
            java.lang.Object r8 = r7.next()
            com.ironsource.mediationsdk.model.NetworkSettings r8 = (com.json.mediationsdk.model.NetworkSettings) r8
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = r8.getProviderDefaultInstance()
            r0.append(r3)
            java.lang.String r3 = ": "
            r0.append(r3)
            org.json.JSONObject r8 = r8.getApplicationSettings()
            if (r8 == 0) goto Le3
            java.lang.Object r8 = r8.opt(r1)
            goto Le4
        Le3:
            r8 = r2
        Le4:
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r6.a(r8)
            goto Lbb
        Lef:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.json.r2.a(int, java.util.concurrent.ConcurrentHashMap):void");
    }

    public final void a(AbstractAdapter adapter, NetworkSettings settings) throws JSONException {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        try {
            Boolean boolA = a(settings);
            if (boolA != null) {
                adapter.setNewConsent(boolA.booleanValue());
            }
        } catch (Throwable th) {
            String str = "error while setting consent of " + adapter.getProviderName() + ": " + th.getLocalizedMessage();
            b(str);
            IronLog.INTERNAL.error(str);
        }
    }

    public final void a(AdapterBaseInterface adapter, NetworkSettings settings) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        try {
            Boolean boolA = a(settings);
            if (boolA == null || !(adapter instanceof AdapterConsentInterface)) {
                return;
            }
            ((AdapterConsentInterface) adapter).setConsent(boolA.booleanValue());
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder();
            sb.append("error while setting consent of ");
            sb.append(settings != null ? settings.getProviderName() : null);
            sb.append(": ");
            sb.append(th.getLocalizedMessage());
            String string = sb.toString();
            b(string);
            IronLog.INTERNAL.error(string);
        }
    }

    public final void a(ConcurrentHashMap<String, AbstractAdapter> adapters, ConcurrentHashMap<String, AdapterBaseWrapper> networkAdapters) throws JSONException {
        Intrinsics.checkNotNullParameter(adapters, "adapters");
        Intrinsics.checkNotNullParameter(networkAdapters, "networkAdapters");
        for (AbstractAdapter adapter : adapters.values()) {
            Intrinsics.checkNotNullExpressionValue(adapter, "adapter");
            a(adapter, (NetworkSettings) null);
        }
        for (AdapterBaseWrapper adapterBaseWrapper : networkAdapters.values()) {
            AdapterBaseInterface adapter2 = adapterBaseWrapper.getAdapterBaseInterface();
            Intrinsics.checkNotNullExpressionValue(adapter2, "adapter");
            a(adapter2, adapterBaseWrapper.getSettings());
        }
    }

    public final void a(boolean consentValue) {
        this.consent = Boolean.valueOf(consentValue);
    }

    /* renamed from: b, reason: from getter */
    public final b6 getDeviceInfoService() {
        return this.deviceInfoService;
    }
}
