package com.json;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0002\u0007\u0003J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0007\u001a\u00020\u0006H&¨\u0006\b"}, d2 = {"Lcom/ironsource/q;", "", "", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "", "c", "Lorg/json/JSONObject;", "a", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public interface q {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/ironsource/q$a;", "Lcom/ironsource/q;", "", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "", "c", "Lorg/json/JSONObject;", "a", "Lorg/json/JSONObject;", "applicationConfig", "<init>", "(Lorg/json/JSONObject;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements q {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final JSONObject applicationConfig;

        public a(JSONObject applicationConfig) {
            Intrinsics.checkNotNullParameter(applicationConfig, "applicationConfig");
            this.applicationConfig = applicationConfig;
        }

        @Override // com.json.q
        public JSONObject a() {
            JSONObject jSONObjectOptJSONObject = this.applicationConfig.optJSONObject("controllerConfig");
            return jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject;
        }

        @Override // com.json.q
        public int b() {
            int iOptInt = this.applicationConfig.optInt("debugMode", 0);
            if (this.applicationConfig.optBoolean(b.DYNAMIC_ADAPTER_DEBUG_MODE, false)) {
                return 3;
            }
            return iOptInt;
        }

        @Override // com.json.q
        public String c() {
            String strOptString = this.applicationConfig.optString("controllerUrl");
            return strOptString == null ? "" : strOptString;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004¨\u0006\u000e"}, d2 = {"Lcom/ironsource/q$b;", "", "", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Ljava/lang/String;", "DYNAMIC_CONTROLLER_URL", "c", "DYNAMIC_CONTROLLER_CONFIG", "d", "DYNAMIC_CONTROLLER_DEBUG_MODE", "e", "DYNAMIC_ADAPTER_DEBUG_MODE", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f2070a = new b();

        /* renamed from: b, reason: from kotlin metadata */
        public static final String DYNAMIC_CONTROLLER_URL = "controllerUrl";

        /* renamed from: c, reason: from kotlin metadata */
        public static final String DYNAMIC_CONTROLLER_CONFIG = "controllerConfig";

        /* renamed from: d, reason: from kotlin metadata */
        public static final String DYNAMIC_CONTROLLER_DEBUG_MODE = "debugMode";

        /* renamed from: e, reason: from kotlin metadata */
        public static final String DYNAMIC_ADAPTER_DEBUG_MODE = "adptDebugMode";

        private b() {
        }
    }

    JSONObject a();

    int b();

    String c();
}
