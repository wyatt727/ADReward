package com.json;

import android.app.Activity;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.json.ISNNativeAdViewHolder;
import com.json.f7;
import com.json.ha;
import com.json.hc;
import com.json.sdk.IronSourceNetwork;
import com.json.sdk.controller.e;
import com.json.t2;
import com.json.u7;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t*\u0002\u0006\t\u0018\u0000 42\u00020\u0001:\u0001\u0011B#\b\u0000\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0015\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010\u001e\u001a\u00020\u001c¢\u0006\u0004\b2\u00103J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0014\u001a\u00020\u0010H\u0016R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR(\u0010$\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u001f8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u0019\u0010#R(\u0010'\u001a\u0004\u0018\u00010\u00152\b\u0010 \u001a\u0004\u0018\u00010\u00158\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b%\u0010&R(\u0010)\u001a\u0004\u0018\u00010\u00152\b\u0010 \u001a\u0004\u0018\u00010\u00158\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b(\u0010&R\u0018\u0010+\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010*R$\u00100\u001a\u0004\u0018\u00010,8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b(\u0010-\u001a\u0004\b\u0011\u0010.\"\u0004\b\u0011\u0010/R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u00101¨\u00065"}, d2 = {"Lcom/ironsource/q7;", "Lcom/ironsource/u7;", "Lcom/ironsource/h7;", "c", "", CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, "com/ironsource/q7$b", "e", "()Lcom/ironsource/q7$b;", "com/ironsource/q7$c", "f", "()Lcom/ironsource/q7$c;", "Landroid/app/Activity;", "activity", "Lorg/json/JSONObject;", "loadParams", "", "a", "Lcom/ironsource/v7;", "viewHolder", "destroy", "", "Ljava/lang/String;", "id", "Lcom/ironsource/ha;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lcom/ironsource/ha;", "controller", "Lcom/ironsource/i7;", "Lcom/ironsource/i7;", "eventTracker", "Lcom/ironsource/s7;", "<set-?>", "d", "Lcom/ironsource/s7;", "()Lcom/ironsource/s7;", "adData", "g", "()Ljava/lang/String;", "demandSourceName", CmcdHeadersFactory.STREAMING_FORMAT_HLS, "isBidding", "Ljava/lang/Long;", "startTime", "Lcom/ironsource/u7$a;", "Lcom/ironsource/u7$a;", "()Lcom/ironsource/u7$a;", "(Lcom/ironsource/u7$a;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/ironsource/v7;", "<init>", "(Ljava/lang/String;Lcom/ironsource/ha;Lcom/ironsource/i7;)V", "j", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class q7 implements u7 {

    /* renamed from: j, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String id;

    /* renamed from: b, reason: from kotlin metadata */
    private final ha controller;

    /* renamed from: c, reason: from kotlin metadata */
    private final i7 eventTracker;

    /* renamed from: d, reason: from kotlin metadata */
    private ISNNativeAdData adData;

    /* renamed from: e, reason: from kotlin metadata */
    private String demandSourceName;

    /* renamed from: f, reason: from kotlin metadata */
    private String isBidding;

    /* renamed from: g, reason: from kotlin metadata */
    private Long startTime;

    /* renamed from: h, reason: from kotlin metadata */
    private u7.a listener;

    /* renamed from: i, reason: from kotlin metadata */
    private ISNNativeAdViewHolder viewHolder;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, d2 = {"Lcom/ironsource/q7$a;", "", "Lcom/ironsource/q7;", "a", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: com.ironsource.q7$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final q7 a() {
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
            e controllerManager = IronSourceNetwork.getControllerManager();
            Intrinsics.checkNotNullExpressionValue(controllerManager, "controllerManager");
            return new q7(string, new ga(string, controllerManager, null, null, 12, null), new j7());
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\t"}, d2 = {"com/ironsource/q7$b", "Lcom/ironsource/ha$a;", "Lcom/ironsource/s7;", "adData", "", "a", "", "reason", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements ha.a {
        b() {
        }

        @Override // com.ironsource.ha.a
        public void a() {
            u7.a listener = q7.this.getListener();
            if (listener != null) {
                listener.onNativeAdShown();
            }
        }

        @Override // com.ironsource.ha.a
        public void a(ISNNativeAdData adData) {
            Intrinsics.checkNotNullParameter(adData, "adData");
            q7.this.adData = adData;
            i7 i7Var = q7.this.eventTracker;
            hc.a loadAdSuccess = hc.l;
            Intrinsics.checkNotNullExpressionValue(loadAdSuccess, "loadAdSuccess");
            HashMap<String, Object> mapA = q7.this.c().a();
            Intrinsics.checkNotNullExpressionValue(mapA, "baseEventParams().data");
            i7Var.a(loadAdSuccess, mapA);
            u7.a listener = q7.this.getListener();
            if (listener != null) {
                listener.onNativeAdLoadSuccess(adData);
            }
        }

        @Override // com.ironsource.ha.a
        public void a(String reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            h7 h7VarA = q7.this.c().a(m4.z, reason);
            i7 i7Var = q7.this.eventTracker;
            hc.a loadAdFailed = hc.g;
            Intrinsics.checkNotNullExpressionValue(loadAdFailed, "loadAdFailed");
            HashMap<String, Object> mapA = h7VarA.a();
            Intrinsics.checkNotNullExpressionValue(mapA, "eventParams.data");
            i7Var.a(loadAdFailed, mapA);
            u7.a listener = q7.this.getListener();
            if (listener != null) {
                listener.onNativeAdLoadFailed(reason);
            }
        }

        @Override // com.ironsource.ha.a
        public void b() {
            u7.a listener = q7.this.getListener();
            if (listener != null) {
                listener.onNativeAdClicked();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"com/ironsource/q7$c", "Lcom/ironsource/v7$a;", "Lcom/ironsource/v7$b;", "viewName", "", "a", "Lcom/ironsource/ge;", "viewVisibilityParams", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class c implements ISNNativeAdViewHolder.a {

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f2080a;

            static {
                int[] iArr = new int[ISNNativeAdViewHolder.b.values().length];
                try {
                    iArr[ISNNativeAdViewHolder.b.PrivacyIcon.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f2080a = iArr;
            }
        }

        c() {
        }

        @Override // com.json.ISNNativeAdViewHolder.a
        public void a(ViewVisibilityParams viewVisibilityParams) {
            Intrinsics.checkNotNullParameter(viewVisibilityParams, "viewVisibilityParams");
            q7.this.controller.a(viewVisibilityParams);
        }

        @Override // com.json.ISNNativeAdViewHolder.a
        public void a(ISNNativeAdViewHolder.b viewName) throws JSONException {
            Intrinsics.checkNotNullParameter(viewName, "viewName");
            if (a.f2080a[viewName.ordinal()] == 1) {
                q7.this.controller.b();
                return;
            }
            JSONObject clickParams = new JSONObject().put("viewName", viewName.getValue());
            ha haVar = q7.this.controller;
            Intrinsics.checkNotNullExpressionValue(clickParams, "clickParams");
            haVar.a(clickParams);
        }
    }

    public q7(String id, ha controller, i7 eventTracker) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        this.id = id;
        this.controller = controller;
        this.eventTracker = eventTracker;
        controller.a(e());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ q7(String str, ha haVar, i7 i7Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            str = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
        }
        this(str, haVar, i7Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h7 c() {
        h7 h7VarA = new h7().a(m4.w, this.isBidding).a(m4.u, this.demandSourceName).a(m4.v, f7.e.NativeAd.toString()).a(m4.H, Long.valueOf(i()));
        Intrinsics.checkNotNullExpressionValue(h7VarA, "ISNEventParams()\n\t\t\t.add…CUSTOM_C, loadDuration())");
        return h7VarA;
    }

    @JvmStatic
    public static final q7 d() {
        return INSTANCE.a();
    }

    private final b e() {
        return new b();
    }

    private final c f() {
        return new c();
    }

    private final long i() {
        Long l = this.startTime;
        if (l == null) {
            return -1L;
        }
        return Calendar.getInstance().getTimeInMillis() - l.longValue();
    }

    @Override // com.json.u7
    /* renamed from: a, reason: from getter */
    public u7.a getListener() {
        return this.listener;
    }

    @Override // com.json.u7
    public void a(Activity activity, JSONObject loadParams) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(loadParams, "loadParams");
        this.startTime = Long.valueOf(Calendar.getInstance().getTimeInMillis());
        this.demandSourceName = loadParams.optString("demandSourceName");
        this.isBidding = loadParams.optString("inAppBidding");
        i7 i7Var = this.eventTracker;
        hc.a loadAd = hc.f;
        Intrinsics.checkNotNullExpressionValue(loadAd, "loadAd");
        HashMap<String, Object> mapA = c().a();
        Intrinsics.checkNotNullExpressionValue(mapA, "baseEventParams().data");
        i7Var.a(loadAd, mapA);
        JSONObject jSONObject = new JSONObject(loadParams.toString());
        jSONObject.put(t2.h.y0, String.valueOf(this.startTime));
        this.controller.a(activity, jSONObject);
    }

    @Override // com.json.u7
    public void a(u7.a aVar) {
        this.listener = aVar;
    }

    @Override // com.json.u7
    public void a(ISNNativeAdViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HashMap<String, Object> mapA = c().a();
        Intrinsics.checkNotNullExpressionValue(mapA, "baseEventParams().data");
        linkedHashMap.putAll(mapA);
        String string = viewHolder.t().toString();
        Intrinsics.checkNotNullExpressionValue(string, "viewHolder.viewsStatus().toString()");
        linkedHashMap.put(m4.x, string);
        i7 i7Var = this.eventTracker;
        hc.a registerAd = hc.n;
        Intrinsics.checkNotNullExpressionValue(registerAd, "registerAd");
        i7Var.a(registerAd, linkedHashMap);
        this.viewHolder = viewHolder;
        viewHolder.a(f());
        this.controller.a(viewHolder);
    }

    @Override // com.json.u7
    /* renamed from: b, reason: from getter */
    public ISNNativeAdData getAdData() {
        return this.adData;
    }

    @Override // com.json.u7
    public void destroy() {
        ISNNativeAdViewHolder iSNNativeAdViewHolder = this.viewHolder;
        if (iSNNativeAdViewHolder != null) {
            iSNNativeAdViewHolder.a((ISNNativeAdViewHolder.a) null);
        }
        this.controller.destroy();
    }

    /* renamed from: g, reason: from getter */
    public final String getDemandSourceName() {
        return this.demandSourceName;
    }

    /* renamed from: h, reason: from getter */
    public final String getIsBidding() {
        return this.isBidding;
    }
}
