package com.json.sdk.controller;

import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/ironsource/sdk/controller/f;", "", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "c", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public interface f {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0003B\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u001f\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/ironsource/sdk/controller/f$a;", "", "", "a", "Lorg/json/JSONObject;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, b.MSG_ID, "params", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Lorg/json/JSONObject;", "d", "()Lorg/json/JSONObject;", "<init>", "(Ljava/lang/String;Lorg/json/JSONObject;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: com.ironsource.sdk.controller.f$a, reason: from toString */
    public static final /* data */ class CallbackToNative {

        /* renamed from: c, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String msgId;

        /* renamed from: b, reason: from kotlin metadata and from toString */
        private final JSONObject params;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lcom/ironsource/sdk/controller/f$a$a;", "", "", "jsonStr", "Lcom/ironsource/sdk/controller/f$a;", "a", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
        /* renamed from: com.ironsource.sdk.controller.f$a$a, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            public final CallbackToNative a(String jsonStr) throws JSONException {
                Intrinsics.checkNotNullParameter(jsonStr, "jsonStr");
                JSONObject jSONObject = new JSONObject(jsonStr);
                String id = jSONObject.getString(b.MSG_ID);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("params");
                Intrinsics.checkNotNullExpressionValue(id, "id");
                return new CallbackToNative(id, jSONObjectOptJSONObject);
            }
        }

        public CallbackToNative(String msgId, JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(msgId, "msgId");
            this.msgId = msgId;
            this.params = jSONObject;
        }

        public static /* synthetic */ CallbackToNative a(CallbackToNative callbackToNative, String str, JSONObject jSONObject, int i, Object obj) {
            if ((i & 1) != 0) {
                str = callbackToNative.msgId;
            }
            if ((i & 2) != 0) {
                jSONObject = callbackToNative.params;
            }
            return callbackToNative.a(str, jSONObject);
        }

        @JvmStatic
        public static final CallbackToNative a(String str) throws JSONException {
            return INSTANCE.a(str);
        }

        public final CallbackToNative a(String msgId, JSONObject params) {
            Intrinsics.checkNotNullParameter(msgId, "msgId");
            return new CallbackToNative(msgId, params);
        }

        /* renamed from: a, reason: from getter */
        public final String getMsgId() {
            return this.msgId;
        }

        /* renamed from: b, reason: from getter */
        public final JSONObject getParams() {
            return this.params;
        }

        public final String c() {
            return this.msgId;
        }

        public final JSONObject d() {
            return this.params;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CallbackToNative)) {
                return false;
            }
            CallbackToNative callbackToNative = (CallbackToNative) other;
            return Intrinsics.areEqual(this.msgId, callbackToNative.msgId) && Intrinsics.areEqual(this.params, callbackToNative.params);
        }

        public int hashCode() {
            int iHashCode = this.msgId.hashCode() * 31;
            JSONObject jSONObject = this.params;
            return iHashCode + (jSONObject == null ? 0 : jSONObject.hashCode());
        }

        public String toString() {
            return "CallbackToNative(msgId=" + this.msgId + ", params=" + this.params + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004¨\u0006\u0012"}, d2 = {"Lcom/ironsource/sdk/controller/f$b;", "", "", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Ljava/lang/String;", "MSG_ID", "c", "AD_ID", "d", "PARAMS", "e", "SUCCESS", "f", "REASON", "g", "COMMAND", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f2180a = new b();

        /* renamed from: b, reason: from kotlin metadata */
        public static final String MSG_ID = "msgId";

        /* renamed from: c, reason: from kotlin metadata */
        public static final String AD_ID = "adId";

        /* renamed from: d, reason: from kotlin metadata */
        public static final String PARAMS = "params";

        /* renamed from: e, reason: from kotlin metadata */
        public static final String SUCCESS = "success";

        /* renamed from: f, reason: from kotlin metadata */
        public static final String REASON = "reason";

        /* renamed from: g, reason: from kotlin metadata */
        public static final String COMMAND = "command";

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\t\u0010\t\u001a\u00020\u0002HÆ\u0003J\t\u0010\n\u001a\u00020\u0002HÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J'\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u000bHÆ\u0001J\t\u0010\u0010\u001a\u00020\u0002HÖ\u0001R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u001a\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\t\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/ironsource/sdk/controller/f$c;", "", "", CmcdHeadersFactory.STREAMING_FORMAT_HLS, "other", "", "equals", "", "hashCode", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lorg/json/JSONObject;", "c", b.AD_ID, b.COMMAND, "params", "toString", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "e", "Lorg/json/JSONObject;", "g", "()Lorg/json/JSONObject;", "f", "(Ljava/lang/String;)V", b.MSG_ID, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: com.ironsource.sdk.controller.f$c, reason: from toString */
    public static final /* data */ class MessageToController {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String adId;

        /* renamed from: b, reason: from kotlin metadata and from toString */
        private final String command;

        /* renamed from: c, reason: from kotlin metadata and from toString */
        private final JSONObject params;

        /* renamed from: d, reason: from kotlin metadata */
        private String msgId;

        public MessageToController(String adId, String command, JSONObject params) {
            Intrinsics.checkNotNullParameter(adId, "adId");
            Intrinsics.checkNotNullParameter(command, "command");
            Intrinsics.checkNotNullParameter(params, "params");
            this.adId = adId;
            this.command = command;
            this.params = params;
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
            this.msgId = string;
        }

        public static /* synthetic */ MessageToController a(MessageToController messageToController, String str, String str2, JSONObject jSONObject, int i, Object obj) {
            if ((i & 1) != 0) {
                str = messageToController.adId;
            }
            if ((i & 2) != 0) {
                str2 = messageToController.command;
            }
            if ((i & 4) != 0) {
                jSONObject = messageToController.params;
            }
            return messageToController.a(str, str2, jSONObject);
        }

        public final MessageToController a(String adId, String command, JSONObject params) {
            Intrinsics.checkNotNullParameter(adId, "adId");
            Intrinsics.checkNotNullParameter(command, "command");
            Intrinsics.checkNotNullParameter(params, "params");
            return new MessageToController(adId, command, params);
        }

        /* renamed from: a, reason: from getter */
        public final String getAdId() {
            return this.adId;
        }

        public final void a(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.msgId = str;
        }

        /* renamed from: b, reason: from getter */
        public final String getCommand() {
            return this.command;
        }

        /* renamed from: c, reason: from getter */
        public final JSONObject getParams() {
            return this.params;
        }

        public final String d() {
            return this.adId;
        }

        public final String e() {
            return this.command;
        }

        public boolean equals(Object other) {
            MessageToController messageToController = other instanceof MessageToController ? (MessageToController) other : null;
            if (messageToController == null) {
                return false;
            }
            if (this == messageToController) {
                return true;
            }
            return Intrinsics.areEqual(this.msgId, messageToController.msgId) && Intrinsics.areEqual(this.adId, messageToController.adId) && Intrinsics.areEqual(this.command, messageToController.command) && Intrinsics.areEqual(this.params.toString(), messageToController.params.toString());
        }

        /* renamed from: f, reason: from getter */
        public final String getMsgId() {
            return this.msgId;
        }

        public final JSONObject g() {
            return this.params;
        }

        public final String h() {
            String string = new JSONObject().put(b.MSG_ID, this.msgId).put(b.AD_ID, this.adId).put("params", this.params).toString();
            Intrinsics.checkNotNullExpressionValue(string, "JSONObject()\n\t\t\t\t.put(Co…, params)\n\t\t\t\t.toString()");
            return string;
        }

        public int hashCode() {
            return super.hashCode();
        }

        public String toString() {
            return "MessageToController(adId=" + this.adId + ", command=" + this.command + ", params=" + this.params + ')';
        }
    }
}
