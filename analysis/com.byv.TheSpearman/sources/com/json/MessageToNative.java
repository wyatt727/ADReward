package com.json;

import com.json.sdk.controller.f;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0003B!\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003J)\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/ironsource/da;", "", "", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lorg/json/JSONObject;", "c", f.b.c, f.b.g, "params", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "e", "Lorg/json/JSONObject;", "f", "()Lorg/json/JSONObject;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: com.ironsource.da, reason: from toString */
/* loaded from: classes4.dex */
public final /* data */ class MessageToNative {

    /* renamed from: d, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String adId;

    /* renamed from: b, reason: from kotlin metadata and from toString */
    private final String command;

    /* renamed from: c, reason: from kotlin metadata and from toString */
    private final JSONObject params;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lcom/ironsource/da$a;", "", "", "jsonStr", "Lcom/ironsource/da;", "a", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: com.ironsource.da$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final MessageToNative a(String jsonStr) throws JSONException {
            Intrinsics.checkNotNullParameter(jsonStr, "jsonStr");
            JSONObject jSONObject = new JSONObject(jsonStr);
            String adId = jSONObject.getString(f.b.c);
            String command = jSONObject.getString(f.b.g);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("params");
            Intrinsics.checkNotNullExpressionValue(adId, "adId");
            Intrinsics.checkNotNullExpressionValue(command, "command");
            return new MessageToNative(adId, command, jSONObjectOptJSONObject);
        }
    }

    public MessageToNative(String adId, String command, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(command, "command");
        this.adId = adId;
        this.command = command;
        this.params = jSONObject;
    }

    public static /* synthetic */ MessageToNative a(MessageToNative messageToNative, String str, String str2, JSONObject jSONObject, int i, Object obj) {
        if ((i & 1) != 0) {
            str = messageToNative.adId;
        }
        if ((i & 2) != 0) {
            str2 = messageToNative.command;
        }
        if ((i & 4) != 0) {
            jSONObject = messageToNative.params;
        }
        return messageToNative.a(str, str2, jSONObject);
    }

    @JvmStatic
    public static final MessageToNative a(String str) throws JSONException {
        return INSTANCE.a(str);
    }

    public final MessageToNative a(String adId, String command, JSONObject params) {
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(command, "command");
        return new MessageToNative(adId, command, params);
    }

    /* renamed from: a, reason: from getter */
    public final String getAdId() {
        return this.adId;
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
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageToNative)) {
            return false;
        }
        MessageToNative messageToNative = (MessageToNative) other;
        return Intrinsics.areEqual(this.adId, messageToNative.adId) && Intrinsics.areEqual(this.command, messageToNative.command) && Intrinsics.areEqual(this.params, messageToNative.params);
    }

    public final JSONObject f() {
        return this.params;
    }

    public int hashCode() {
        int iHashCode = ((this.adId.hashCode() * 31) + this.command.hashCode()) * 31;
        JSONObject jSONObject = this.params;
        return iHashCode + (jSONObject == null ? 0 : jSONObject.hashCode());
    }

    public String toString() {
        return "MessageToNative(adId=" + this.adId + ", command=" + this.command + ", params=" + this.params + ')';
    }
}
