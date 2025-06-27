package com.json;

import android.app.Activity;
import androidx.core.app.NotificationCompat;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.json.ISNNativeAdData;
import com.json.ha;
import com.json.mediationsdk.utils.c;
import com.json.sdk.controller.e;
import com.json.sdk.controller.f;
import com.json.sdk.controller.l;
import com.json.sdk.utils.Logger;
import com.json.t2;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0007B+\u0012\u0006\u0010\u001c\u001a\u00020\u001a\u0012\u0006\u0010\u001f\u001a\u00020\u001d\u0012\b\b\u0002\u0010\"\u001a\u00020 \u0012\b\b\u0002\u0010%\u001a\u00020#¢\u0006\u0004\b/\u00100J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\fH\u0016J\b\u0010\u0014\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\u0006H\u0016R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001eR\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010!R\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010$R\u001c\u0010(\u001a\n &*\u0004\u0018\u00010\u001a0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u001bR$\u0010.\u001a\u0004\u0018\u00010)8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b\u0007\u0010,\"\u0004\b\u0007\u0010-¨\u00061"}, d2 = {"Lcom/ironsource/ga;", "Lcom/ironsource/ha;", "Landroid/app/Activity;", "activity", "Lcom/ironsource/sdk/controller/f$a;", c.Y1, "", "a", "Lcom/ironsource/s7$b;", "report", "Lcom/ironsource/s7;", "adData", "Lorg/json/JSONObject;", "d", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lcom/ironsource/sdk/controller/l$b;", "c", "Lcom/ironsource/da;", NotificationCompat.CATEGORY_MESSAGE, "loadParams", "destroy", "Lcom/ironsource/v7;", "viewHolder", "Lcom/ironsource/ge;", "viewVisibilityParams", "clickParams", "", "Ljava/lang/String;", "id", "Lcom/ironsource/sdk/controller/e;", "Lcom/ironsource/sdk/controller/e;", "controllerManager", "Lcom/ironsource/a8;", "Lcom/ironsource/a8;", "imageLoader", "Lcom/ironsource/l0;", "Lcom/ironsource/l0;", "adViewManagement", "kotlin.jvm.PlatformType", "e", "logTag", "Lcom/ironsource/ha$a;", "f", "Lcom/ironsource/ha$a;", "()Lcom/ironsource/ha$a;", "(Lcom/ironsource/ha$a;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Ljava/lang/String;Lcom/ironsource/sdk/controller/e;Lcom/ironsource/a8;Lcom/ironsource/l0;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class ga implements ha {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String id;

    /* renamed from: b, reason: from kotlin metadata */
    private final e controllerManager;

    /* renamed from: c, reason: from kotlin metadata */
    private final a8 imageLoader;

    /* renamed from: d, reason: from kotlin metadata */
    private final l0 adViewManagement;

    /* renamed from: e, reason: from kotlin metadata */
    private final String logTag;

    /* renamed from: f, reason: from kotlin metadata */
    private ha.a listener;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004¨\u0006\u0014"}, d2 = {"Lcom/ironsource/ga$a;", "", "", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Ljava/lang/String;", "LOAD", "c", "LOAD_REPORT", "d", "REGISTER", "e", "CLICK", "f", "PRIVACY_CLICK", "g", "VISIBILITY_CHANGED", CmcdHeadersFactory.STREAMING_FORMAT_HLS, "DESTROY", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f1793a = new a();

        /* renamed from: b, reason: from kotlin metadata */
        public static final String LOAD = "nativeAd.load";

        /* renamed from: c, reason: from kotlin metadata */
        public static final String LOAD_REPORT = "nativeAd.loadReport";

        /* renamed from: d, reason: from kotlin metadata */
        public static final String REGISTER = "nativeAd.register";

        /* renamed from: e, reason: from kotlin metadata */
        public static final String CLICK = "nativeAd.click";

        /* renamed from: f, reason: from kotlin metadata */
        public static final String PRIVACY_CLICK = "nativeAd.privacyClick";

        /* renamed from: g, reason: from kotlin metadata */
        public static final String VISIBILITY_CHANGED = "nativeAd.visibilityChanged";

        /* renamed from: h, reason: from kotlin metadata */
        public static final String DESTROY = "nativeAd.destroy";

        private a() {
        }
    }

    public ga(String id, e controllerManager, a8 imageLoader, l0 adViewManagement) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(controllerManager, "controllerManager");
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Intrinsics.checkNotNullParameter(adViewManagement, "adViewManagement");
        this.id = id;
        this.controllerManager = controllerManager;
        this.imageLoader = imageLoader;
        this.adViewManagement = adViewManagement;
        this.logTag = "ga";
        controllerManager.a(id, c());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ga(String str, e eVar, a8 a8Var, l0 l0Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        a8Var = (i & 4) != 0 ? new z7(null, 1, null) : a8Var;
        if ((i & 8) != 0) {
            l0Var = e7.a();
            Intrinsics.checkNotNullExpressionValue(l0Var, "getInstance()");
        }
        this(str, eVar, a8Var, l0Var);
    }

    private final void a(Activity activity, f.CallbackToNative response) {
        if (response.d() == null) {
            ha.a listener = getListener();
            if (listener != null) {
                listener.a("failed to load native ad: missing params");
                return;
            }
            return;
        }
        if (response.d().optBoolean("success", false)) {
            ISNNativeAdData.b bVarA = new ISNNativeAdData.a(this.imageLoader, this.adViewManagement).a(activity, response.d());
            a(bVarA, bVarA.getData().h());
            return;
        }
        String reason = response.d().optString("reason", "failed to load native ad: unexpected error");
        ha.a listener2 = getListener();
        if (listener2 != null) {
            Intrinsics.checkNotNullExpressionValue(reason, "reason");
            listener2.a(reason);
        }
    }

    private final void a(MessageToNative msg) {
        if (msg.f() == null) {
            Logger.i(this.logTag, "failed to handle click on native ad: missing params");
            return;
        }
        if (msg.f().optBoolean("success", false)) {
            ha.a listener = getListener();
            if (listener != null) {
                listener.b();
                return;
            }
            return;
        }
        String strOptString = msg.f().optString("reason", "unexpected error");
        Logger.i(this.logTag, "failed to handle click on native ad: " + strOptString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ga this$0, Activity activity, f.CallbackToNative it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.a(activity, it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ga this$0, MessageToNative msg) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (Intrinsics.areEqual(msg.e(), a.CLICK)) {
            this$0.a(msg);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ga this$0, ISNNativeAdData adData, f.CallbackToNative it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adData, "$adData");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.a(adData, it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ga this$0, f.CallbackToNative it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.a(it);
    }

    private final void a(ISNNativeAdData.b report, final ISNNativeAdData adData) {
        this.controllerManager.a(new f.MessageToController(this.id, "nativeAd.loadReport." + this.id, report.b()), new l.a() { // from class: com.ironsource.ga$$ExternalSyntheticLambda3
            @Override // com.ironsource.sdk.controller.l.a
            public final void a(f.CallbackToNative callbackToNative) {
                ga.a(this.f$0, adData, callbackToNative);
            }
        });
    }

    private final void a(ISNNativeAdData adData, f.CallbackToNative response) {
        if (response.d() == null) {
            ha.a listener = getListener();
            if (listener != null) {
                listener.a("failed to load native ad: missing report params");
                return;
            }
            return;
        }
        if (response.d().optBoolean("success", false)) {
            ha.a listener2 = getListener();
            if (listener2 != null) {
                listener2.a(adData);
                return;
            }
            return;
        }
        String reason = response.d().optString("reason", "failed to load native ad: unexpected error");
        ha.a listener3 = getListener();
        if (listener3 != null) {
            Intrinsics.checkNotNullExpressionValue(reason, "reason");
            listener3.a(reason);
        }
    }

    private final void a(f.CallbackToNative response) {
        if (response.d() == null) {
            Logger.i(this.logTag, "failed to handle click on native ad: missing params");
            return;
        }
        if (response.d().optBoolean("success", false)) {
            ha.a listener = getListener();
            if (listener != null) {
                listener.b();
                return;
            }
            return;
        }
        String strOptString = response.d().optString("reason", "unexpected error");
        Logger.i(this.logTag, "failed to handle click on native ad: " + strOptString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(ga this$0, f.CallbackToNative it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.b(it);
    }

    private final void b(f.CallbackToNative response) {
        if (response.d() == null) {
            Logger.i(this.logTag, "failed to handle show on native ad: missing params");
            return;
        }
        if (response.d().optBoolean("success", false)) {
            ha.a listener = getListener();
            if (listener != null) {
                listener.a();
                return;
            }
            return;
        }
        String strOptString = response.d().optString("reason", "unexpected error");
        Logger.i(this.logTag, "failed to handle show on native ad: " + strOptString);
    }

    private final l.b c() {
        return new l.b() { // from class: com.ironsource.ga$$ExternalSyntheticLambda4
            @Override // com.ironsource.sdk.controller.l.b
            public final void a(MessageToNative messageToNative) {
                ga.a(this.f$0, messageToNative);
            }
        };
    }

    private final JSONObject d() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put(f.b.COMMAND, a.CLICK).put("sdkCallback", t2.g.a0);
        Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "JSONObject()\n\t\t\t.put(Con…hods.ON_RECEIVED_MESSAGE)");
        return jSONObjectPut;
    }

    @Override // com.json.ha
    /* renamed from: a, reason: from getter */
    public ha.a getListener() {
        return this.listener;
    }

    @Override // com.json.ha
    public void a(final Activity activity, JSONObject loadParams) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(loadParams, "loadParams");
        this.controllerManager.a(activity);
        this.controllerManager.a(new f.MessageToController(this.id, a.LOAD, loadParams), new l.a() { // from class: com.ironsource.ga$$ExternalSyntheticLambda2
            @Override // com.ironsource.sdk.controller.l.a
            public final void a(f.CallbackToNative callbackToNative) {
                ga.a(this.f$0, activity, callbackToNative);
            }
        });
    }

    @Override // com.json.ha
    public void a(ViewVisibilityParams viewVisibilityParams) {
        Intrinsics.checkNotNullParameter(viewVisibilityParams, "viewVisibilityParams");
        this.controllerManager.a(new f.MessageToController(this.id, a.VISIBILITY_CHANGED, viewVisibilityParams.g()), new l.a() { // from class: com.ironsource.ga$$ExternalSyntheticLambda1
            @Override // com.ironsource.sdk.controller.l.a
            public final void a(f.CallbackToNative callbackToNative) {
                ga.b(this.f$0, callbackToNative);
            }
        });
    }

    @Override // com.json.ha
    public void a(ha.a aVar) {
        this.listener = aVar;
    }

    @Override // com.json.ha
    public void a(ISNNativeAdViewHolder viewHolder) throws JSONException {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        JSONObject params = new JSONObject().put("assetViews", viewHolder.t()).put("adViewClickCommand", d());
        String str = this.id;
        Intrinsics.checkNotNullExpressionValue(params, "params");
        this.controllerManager.a(new f.MessageToController(str, a.REGISTER, params), (l.a) null);
    }

    @Override // com.json.ha
    public void a(JSONObject clickParams) {
        Intrinsics.checkNotNullParameter(clickParams, "clickParams");
        this.controllerManager.a(new f.MessageToController(this.id, a.CLICK, clickParams), new l.a() { // from class: com.ironsource.ga$$ExternalSyntheticLambda0
            @Override // com.ironsource.sdk.controller.l.a
            public final void a(f.CallbackToNative callbackToNative) {
                ga.a(this.f$0, callbackToNative);
            }
        });
    }

    @Override // com.json.ha
    public void b() {
        this.controllerManager.a(new f.MessageToController(this.id, a.PRIVACY_CLICK, new JSONObject()), (l.a) null);
    }

    @Override // com.json.ha
    public void destroy() {
        this.controllerManager.a(new f.MessageToController(this.id, a.DESTROY, new JSONObject()), (l.a) null);
    }
}
